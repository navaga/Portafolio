using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class PlayerController : MonoBehaviour
{
    private const bool V = true;

    // Start is called before the first frame update
    bool canJump;
    bool dobleJump;
    private Animator animator;
    SpriteRenderer sp;
    public int vidas=3;
    public GameObject[] Corazones;
    //private GameObject circulo2D;
    private CircleCollider2D circulo2D;
    private bool atackOn=false;
    
    public Animation anim;
    //CircleCollider2D attackCollider;
    
    void Start()
    {
        //obtener el colider 2D hijo del player
        //circulo2D = transform.GetChild(0).gameObject;
        circulo2D = transform.GetChild(0).GetComponent<CircleCollider2D>();
        animator = GetComponent<Animator>();
        sp = GetComponent<SpriteRenderer>();
        anim = GetComponent<Animation>();
         //* Recuperamos el collider de ataque y lo desactivamos
        //attackCollider = transform.GetChild(0).GetComponent<CircleCollider2D>();
        //attackCollider.enabled = false;  
        
      
        
    }

    // Update is called once per frame
    void Update()
    {
        AnimatorStateInfo stateInfo = animator.GetCurrentAnimatorStateInfo(0);
        bool ataking = stateInfo.IsName("espadazo");
        
        if (Input.GetKey("left"))
        {
            gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(-800f * Time.deltaTime, 0));
            sp.flipX = true;
            //circulo2D.
            circulo2D.offset = new Vector2(-4, 3);
        }
        if (Input.GetKey("right"))
        {
            gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(800f * Time.deltaTime, 0));
            sp.flipX = false;
            circulo2D.offset = new Vector2(4, 3);
        }
        salto();

        //si te sales de la pantalla vuelves al inicio
        if (gameObject.transform.position.y < -40)
        {
            gameObject.transform.position = new Vector3(0, 0, 0);
        }
        controlVidas();
        espadazoCrema();
        //espada();
        //hacer daño cuando la animacion espadazo esta true
        //atackOn = animator.GetBool("espadazo");
        
        /*if(!ataking){
            float tiempoVideo = stateInfo.normalizedTime;
            print("espadazo"+tiempoVideo);
        atackOn = false;
        }*/

}
private void controlVidas()
{
     if(vidas==3)
       {
           
           visorVidas(true,false,false);
          
       }
       else if(vidas ==2 )
       {
           
           visorVidas(false,true,false);
           
       }
       else if(vidas ==1 )
       {
           
           visorVidas(false,false,true);
           
       }
       else if(vidas==0)
            {
                
                visorVidas(false,false,false);
                SceneManager.LoadScene(2);
            }
    
}
//Metodo que hace visibles las vidas de los personajes
private void visorVidas(bool vida1,bool vida2,bool vida3)
{
            Corazones[2].SetActive(vida1);
           Corazones[1].SetActive(vida2);
           Corazones[0].SetActive(vida3);   
} 
    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.transform.tag == "suelo" || collision.transform.tag == "boss")
        {
            canJump = true;
            //dobleJump = true;
            animator.SetBool("salta", false);
            

        }
        else
        {

            canJump = false;
            animator.SetBool("salta", false);
            
        }


        if (collision.transform.tag == "pared")
        {
            //canJump = true;
            dobleJump = true;
            animator.SetBool("salta", false);
            

        }
        else
        { 

            dobleJump = false;
            animator.SetBool("salta", false);
           
        }
        if (collision.gameObject.name == "boss" && atackOn) 
        {
       
        Destroy(GameObject.Find("boss"));
        }
        

    
        



    }
    private void OnCollisionStay2D(Collision2D collision)
    {

         if (collision.gameObject.name == "boss" && atackOn) 
        {
       
        Destroy(GameObject.Find("boss"));
        }


        

    }
    private void OnTriggerStay2D(Collider2D collision)
    {
       
        

    }
     void OnTriggerEnter2D(Collider2D collision) {

         
         //7if (collision.transform.tag == "fuego") WormEnemy_Projectile_0(Clone)
         if (collision.gameObject.name == "WormEnemy_Projectile_0(Clone)")
        {
            
            vidas--;

        }
         if (collision.gameObject.name == "vidaposi")
         {
             Corazones[3].SetActive(false);
             vidas++;
         }
          if (collision.gameObject.name == "boss" && atackOn) 
        {
       
        Destroy(GameObject.Find("boss"));
        }

         
        
    }
    void salto()
    {
        if (Input.GetKeyDown(KeyCode.UpArrow))
        {

            if (dobleJump && canJump == false)
            {
                animator.SetBool("salta", true);
                gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(0, 200f));
                dobleJump = false;
            }

            if (canJump)
            {
                animator.SetBool("salta", true);
                gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(0, 280f));
                canJump = false;

            }
        }
    }
    void espada()
    {
        if (Input.GetKeyDown(KeyCode.D))
        {

                //attackCollider.offset = new Vector2(2, 2);
                //animator.SetBool("espadazo", true);
                //atackOn = true;
                animator.SetTrigger("espadazo2");
                
              
        }
        /*else if (Input.GetKeyUp(KeyCode.D))
        {
            
            animator.SetBool("espadazo", false);
        }*/

    }
    void espadazoCrema () {

        //attackCollider.enabled = true;
            //else attackCollider.enabled = false;

       

        // Buscamos el estado actual mirando la información del animador
        AnimatorStateInfo stateInfo = animator.GetCurrentAnimatorStateInfo(0);
        bool attacking = stateInfo.IsName("espadazo");

        // Detectamos el ataque, tiene prioridad por lo que va abajo del todo
        if (Input.GetKeyDown(KeyCode.D) && !attacking ){  
            animator.SetTrigger("espadazo2");
        }

        // Activamos el collider a la mitad de la animación de ataque
        if(attacking) { // El normalized siempre resulta ser un ciclo entre 0 y 1 
            float playbackTime = stateInfo.normalizedTime;
            print("espadazo"+playbackTime);
            if (playbackTime > 0.1 && playbackTime < 0.2) 
            {
            //atackOn = true;
            circulo2D.enabled =true;
            }
            
        }else {
            atackOn = false;
            circulo2D.enabled = false;
            }

    }
}
