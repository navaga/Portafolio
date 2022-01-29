using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SeguirPlayer : MonoBehaviour
{
    public Transform ObjetoASeguir = null;
    public float velocidad =2;
    Vector3 newRotation = new Vector3(0, 0, 0);
    Vector2 temp;
    SpriteRenderer sp;
    Animator animator;
     void Awake()
    {
        //cogemos el transfor del jugador
       ObjetoASeguir = GameObject.FindGameObjectWithTag("Player").GetComponent<Transform>();
       //para que no salte vemos la posicion inicial, usaremos la y mas adelante
       //temp = transform.position;
    }
    // Start is called before the first frame update
    void Start()
    {   animator = GetComponent<Animator>();
        sp = GetComponent<SpriteRenderer>();
    }

    // Update is called once per frame
    void Update()
    {
        //Restamos la posicion para ver como estamos de cerca
        float posicionParaMover = transform.position.x -  ObjetoASeguir.transform.position.x;
            //Debug.Log(posicionParaMover);
        if(posicionParaMover <1 && posicionParaMover >-1  ) 
        {
            //si se cumple la condicion de que estamos cerca se mueve para el player
        transform.position = Vector2.MoveTowards(transform.position, ObjetoASeguir.transform.position ,velocidad * Time.deltaTime);
        //transform.position = new Vector2(transform.position.x,transform.position.y);
        animator.SetBool("correr", true);
         if(posicionParaMover <0.5 && posicionParaMover >-0.5  ) 
            {   //ataca si esta aun mas cerca
                animator.SetBool("atacar", true);
             }else{animator.SetBool("atacar", false);}
        }
        else
        {
         animator.SetBool("correr", false);
         }
        
        //transform.eulerAngles = newRotation;
        if(transform.position.x <  ObjetoASeguir.transform.position.x )
        sp.flipX = false;
        else
        sp.flipX = true;
        
        //transform.up = ObjetoASeguir.position - transform.position;
        //transform.right = ObjetoASeguir.position - transform.position;
        
         
        
    }
}
