using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

// Script para crear un objeto destruible
public class Destroyable : MonoBehaviour {

    // Variable para guardar el nombre del estado de destruccion
    public string destroyState;
    // Variable con los segundos a esperar antes de desactivar la colisión
    public float timeForDisable;

    // Animador para controlar la animación
    Animator anim;

    void Start () {
        anim = GetComponent<Animator>();
    }

    // Detectamos la colisión con una corrutina
   

    void Update () {
        
        // "Destruir" el objeto al finalizar la animación de destrucción
        // El estado debe tener el atributo 'loop' a false para no repetirse
        //AnimatorStateInfo stateInfo = anim.GetCurrentAnimatorStateInfo(0);

        //if (stateInfo.IsName(destroyState) && stateInfo.normalizedTime >= 1) {
            //Destroy(gameObject);
            // En el futuro podríamos almacenar la instancia y su transform
            // para crearlos de nuevo después de un tiempo
        //}
        

    }
    private void OnCollisionStay2D(Collision2D collision)
    {

         if (collision.gameObject.tag == "Attack") 
        {
       
        Destroy(gameObject);
        Debug.Log("Estoy en stay");
        }


        

    }
    private void OnCollisionEnter2D(Collision2D collision) {
         if (collision.gameObject.tag == "Attack") 
        {
       
        Destroy(GameObject.Find("boss"));
        Debug.Log("Estoy en colision");
        }
        
    }
     void OnTriggerEnter2D (Collider2D col) {

        // Si es un ataque
        if (col.tag == "Attack") {

           
            Destroy(gameObject);
            // Pasados los segundos de espera desactivamos los colliders 2D
            //foreach(Collider2D c in GetComponents<Collider2D>()){
                //c.enabled = false;
            //}
            Debug.Log("Estoy en trigger");

        }
        
        
    }

}