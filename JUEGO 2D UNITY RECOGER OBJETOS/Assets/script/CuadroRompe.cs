using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CuadroRompe : MonoBehaviour
{
    PlayerController PC;
    //Animator animator;
    // Start is called before the first frame update
    void Start()
    {
        PC = new PlayerController();
       //animator = GetComponent<Animator>();
    }

    // Update is called once per frame
    void Update()
    {
        
    }
     private void OnCollisionEnter2D(Collision2D collision)
    {
        if(collision.transform.tag=="Player")
        {
            PC.ControPuntos =1;
            Destroy(gameObject);
            
        }
         if(collision.transform.tag=="suelo")
        {
            
            PC.ControVidas =1;
            
            
            Destroy(gameObject);
        }
    }
   
}
