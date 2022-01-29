using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;
using TMPro;

public class PlayerController : MonoBehaviour
{
    // Start is called before the first frame update
    public float velocidad = 5000;
    public float saltar = 900;

     bool canJump = true;
     public GameObject[] Corazones;
     public GameObject[] Fondos;
     public static int vidas = 3;
     Animator animator;
     float tiempo =0;
     public static int  puntos = 0;
    SpriteRenderer sp;
     bool muerte = false;
     float tiempoCambio =0;
     bool intercambioteclas = false;
     
     bool puedoMover= true;
    
     public AudioSource saltoSonido;
     
     public Text ContadorMonedas;
         void Start()
    {
        vidas=3;
        puntos=0;
         animator = GetComponent<Animator>();
         sp = GetComponent<SpriteRenderer>();
    }

    // Update is called once per frame
    void Update()
    {
       ContadorMonedas.text = puntos.ToString();
        
        
        //animator.SetBool("cara",false);
        tiempo += Time.deltaTime;
        tiempoCambio += Time.deltaTime;
        if(puedoMover)
        {
         if (Input.GetKey("left") && !intercambioteclas)
        {
            //el gameobjet(personaje) se le añade una fuerta negativa (hacia la izquierda) en el eje X y se multiplicada por el tiempo que tardo en pasar de un frame a otro
            //para que en todos los ordenadores funcine igual
            gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(-velocidad * Time.deltaTime, 0));
            //se gira o no el personaje para que mire a izquierda o derecha
            
          sp.flipX = true;
            
        }
        
        else if (Input.GetKey("right") && !intercambioteclas)
        {
            gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(velocidad * Time.deltaTime, 0));
            sp.flipX = false;
            
        }




     if (Input.GetKey("right") && intercambioteclas)
        {
            //el gameobjet(personaje) se le añade una fuerta negativa (hacia la izquierda) en el eje X y se multiplicada por el tiempo que tardo en pasar de un frame a otro
            //para que en todos los ordenadores funcine igual
            gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(-velocidad * Time.deltaTime, 0));
            //se gira o no el personaje para que mire a izquierda o derecha
            
          sp.flipX = true;
            
        }
        
        else if (Input.GetKey("left") && intercambioteclas)
        {
            gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(velocidad * Time.deltaTime, 0));
            sp.flipX = false;
            
        }
        }

        
        salto();
        controlVidas();
            if(tiempo > 3)
                {   
                    intercambioteclas = false;
                    velocidad =5000;
                }

                //if(tiempo 3 && !intercambioteclas)
                //intercambioteclas = true;

       
    }
    void salto()
    {   
        
        
        if (Input.GetKeyDown("up"))
        {

           if (canJump)
            {   
                animator.SetBool("saltar",true);
                saltoSonido.Play();
                gameObject.GetComponent<Rigidbody2D>().AddForce(new Vector2(0, saltar));
                canJump = false;
                

            }
        }
       
    }

     private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.transform.tag == "suelo" )
        {
            canJump = true;
            
           animator.SetBool("saltar",false);

        }
        //si nos da(colisiona) un enemigo nos resta vida
       
         if (collision.transform.tag == "porro"  )
        {
            tiempo =0;
            velocidad = 9000f;
            animator.SetTrigger("caras");
           if(vidas <3)
             {vidas++;}
            Destroy(collision.gameObject);
            

        }
        if (collision.transform.tag == "amc"  )
        {
            tiempo =0;
            intercambioteclas = true;
            vidas--;
            Destroy(collision.gameObject);
            

        }

        
        
        
    }
   
        private void controlVidas()
{

    //swtich case otro dia
    //vamos poniendo en visible o invisible los corazones que cuentan las vidas
     if(vidas==3)
       {
           
           visorVidas(true,true,true);

            Fondos[3].SetActive(false);
           Fondos[2].SetActive(false);
           Fondos[1].SetActive(false);
           Fondos[0].SetActive(true);
           
          
       }
       else if(vidas ==2 )
       {
           
           visorVidas(false,true,true);

            Fondos[3].SetActive(false);
            Fondos[2].SetActive(false);
           Fondos[1].SetActive(true);
           Fondos[0].SetActive(false);
           
       }
       else if(vidas ==1 )
       {
           
           visorVidas(false,false,true);


            Fondos[3].SetActive(false);
            Fondos[2].SetActive(true);
           Fondos[1].SetActive(false);
           Fondos[0].SetActive(false);
           
       }
       else if(vidas==0)
            {

                 Fondos[3].SetActive(true);
            Fondos[2].SetActive(false);
           Fondos[1].SetActive(false);
           Fondos[0].SetActive(false);
                
                //cargar escena de perder
                visorVidas(false,false,false);
               StartCoroutine(Transiciona());
            }
    
}
IEnumerator Transiciona()
{
    //animator.SetBool("muerte",true);
    canJump = false;
    vidas=-1;
    puedoMover = false;
          velocidad =0;
          saltar=0;     
        animator.SetTrigger("muertes");         
    yield return new WaitForSeconds(4);
    //animator.SetBool("muerte",false);
                
                 
                //puntos =0;
                SceneManager.LoadScene(2);
}

//para activar y desactivar vidas
    private void visorVidas(bool vida1,bool vida2,bool vida3)
{
            Corazones[2].SetActive(vida1);
           Corazones[1].SetActive(vida2);
           Corazones[0].SetActive(vida3);

           

             
}
  public  void animacion()
        {
            animator.SetBool("cara",true);
        }
public int ControVidas
        {
            get
            {
                return vidas;
            }
            set
            {
                if (value>0)
                {
                    vidas -=value;
                    
                }
            }
        }
        public int ControPuntos
        {
            get
            {
                return puntos;
            }
            set
            {
                if (value>0)
                {
                    puntos +=value;
                    
                }
            }
        }  

      
}
