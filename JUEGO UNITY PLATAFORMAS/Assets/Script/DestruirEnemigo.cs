using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class DestruirEnemigo : MonoBehaviour
{
    // Start is called before the first frame update
    gameManager gM;
    Animator animator;
    Collider2D colider2DD;
    Vector2 temp;
    bool muerte = false;
    public int kill =1;
    void Start()
    {
        animator = GetComponent<Animator>();
        colider2DD = transform.GetComponent<Collider2D>();
        //gM = GameObject.Find("gameManager").GetComponent<gameManager>();
        //GetComponent<player_gun_manager_script>();
       gM = new gameManager();
    }

    // Update is called once per frame
    void Update()

    {  
        //Como pongo el colider a false cuando mueres esto espara que no caiga.        
         if(muerte)
        transform.position = new Vector2(temp.x,temp.y);
    }
     
     void OnTriggerEnter2D (Collider2D col) {

        // Si es un ataque
        if (col.tag == "Attack") {
            //envio al gameManager que ha sido destruido el enemigo
            gM.muerteEnemigo = kill;
            temp = transform.position;
            muerte = true;
           animator.SetBool("muerte",true);
            // para no hacernos daño despues de morir
            colider2DD.enabled = false; 
            // para que mo se caiga para bajo
            
            
            Destroy(gameObject,0.4f);
            
            Debug.Log("Estoy en trigger");

        }
        
        
    }
    
}
