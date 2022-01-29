using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.Audio;
using UnityEngine.SceneManagement;
public class PlayerController : MonoBehaviour
{
    
    SpriteRenderer sp;
    Animator animator;
    public float velocidad = 800;
    public float saltar = 320;
    //atributo para comprobar si se puede saltar
    bool canJump = true;
    bool animacionSaltoAbajo = false;
    //corazones y vidas
    public GameObject[] Corazones;
    
    CircleCollider2D circulo2D;
   
    public AudioSource saltoSonido;
    public AudioSource espadaSonido;
    public AudioSource monedaSonido;
    
    public Text ContadorMonedas;
    int vidas=3;
    int monedas=0;
     gameManager gM;

    void Start()
    {
        animator = GetComponent<Animator>();
        sp = GetComponent<SpriteRenderer>();
        circulo2D = transform.GetChild(0).GetComponent<CircleCollider2D>();
        gM = new gameManager();
        
    }

    // Update is called once per frame
    void Update()
    {   
         
        
        //si presiono la tecla a
         if (Input.GetKey("left"))
        {
            //el gameobjet(personaje) se le añade una fuerta negativa (hacia la izquierda) en el eje X y se multiplicada por el tiempo que tardo en pasar de un frame a otro
            //para que en todos los ordenadores funcine igual
            gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(-velocidad * Time.deltaTime, 0));
            //se gira o no el personaje para que mire a izquierda o derecha
            sp.flipX = true;
            //modificamos a true el boleano que creamos en el animator
            animator.SetBool("mover", true);
            circulo2D.offset = new Vector2(-0.15f, 0);
            
        }
        
        else if (Input.GetKey("right"))
        {
            gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(velocidad * Time.deltaTime, 0));
            sp.flipX = false;
            animator.SetBool("mover", true);
            circulo2D.offset = new Vector2(0, 0);
            
        }
         else
        {
            animator.SetBool("mover", false);
        }
        salto();
        espadazo();
        controlVidas();

        //condicion para salir
        
        
        
       
    }   
    //meto salto: Si presiono W  y el canjump es true se le ejerce una fuerta de 320(atributo saltar 320 por defecto).
    // ponemos el salto en false para que no se puede saltar infinito
    void salto()
    {   
        
        
        if (Input.GetKeyDown("up"))
        {

           if (canJump)
            {   
                saltoSonido.Play();
                animator.SetBool("salta", true);
                gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(0, saltar));
                canJump = false;

            }
        }
       
    }
    void espadazo () {

        // Obtiene los datos del estado actual en Animator
        AnimatorStateInfo stateInfo = animator.GetCurrentAnimatorStateInfo(0);
        //pone a true o false si la animacion se esta realizando
        bool attacking = stateInfo.IsName("espadazo");
        // Detectamos el ataque
        if (Input.GetKeyDown(KeyCode.D) && !attacking ){ 
            espadaSonido.Play(); 
            animator.SetTrigger("espadazos");
        }
        // Activamos el collider de ataque entre 0.2 y 0.6 segundos de la animacion
        if(attacking) { // El normalized siempre resulta ser un ciclo entre 0 y 1 
            float playbackTime = stateInfo.normalizedTime;
            //print("espadazo"+playbackTime);
            if (playbackTime > 0.2 && playbackTime < 0.6) 
            {
            //activamos colider2d
            circulo2D.enabled =true;
            }
            
        }else {
            //desactivar para no matar enemigo sin dar espadazo
            circulo2D.enabled =false;
            }


        

    }
    private void controlVidas()
{

    //swtich case otro dia
    //vamos poniendo en visible o invisible los corazones que cuentan las vidas
     if(vidas==3)
       {
           
           visorVidas(true,true,true);
          
       }
       else if(vidas ==2 )
       {
           
           visorVidas(false,true,true);
           
       }
       else if(vidas ==1 )
       {
           
           visorVidas(false,false,true);
           
       }
       else if(vidas==0)
            {
                //cargar escena de perder
                visorVidas(false,false,false);
                SceneManager.LoadScene(2);
            }
    
}

//para activar y desactivar vidas
    private void visorVidas(bool vida1,bool vida2,bool vida3)
{
            Corazones[2].SetActive(vida1);
           Corazones[1].SetActive(vida2);
           Corazones[0].SetActive(vida3);   
} 
 
    // si entramos en colision con un collider que tenga el tag suelo ponemos el salto en true para poder saltar de nuevo
     private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.transform.tag == "suelo" )
        {
            canJump = true;
            animator.SetBool("salta", false);
            //animator.SetBool("saltarabajo", true);

        }
        //si nos da(colisiona) un enemigo nos resta vida
         if (collision.transform.tag == "enemigos" )
        {
            vidas--;
            

        }
        
        
    }
        void OnTriggerEnter2D(Collider2D collision) {

         
        // si colisionamos con un objeto con tag vidasuma , ese objeto de pone disable y si tenemos menos de 3 vidas nos suma una
         if (collision.gameObject.name == "vidaSuma")
         {
             Corazones[3].SetActive(false);
             if(vidas <3)
             {vidas++;}
             
         }
            // si colisionamos con un objeto con tag moneda nos suma una moneda y destruye el objeto
          if (collision.gameObject.tag == "moneda")
        {
        monedas++;
        gM.contadorMonedas = monedas;
        ContadorMonedas.text = monedas.ToString();
        
        monedaSonido.Play();
        Destroy(collision.gameObject);

       
        }
    
       
         
        
    }
}
