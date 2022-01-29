using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class bala : MonoBehaviour
{
    private const string v = "boss";
    // Start is called before the first frame update
    public Rigidbody2D MyRb;
    public float speed;

    SpriteRenderer sp;
    public Transform ObjetoASeguir = null;
    Vector3 nuevaPosicion; 

       void Awake()
    {
       ObjetoASeguir = GameObject.FindGameObjectWithTag("Player").GetComponent<Transform>();
       nuevaPosicion = new Vector2(ObjetoASeguir.position.x, ObjetoASeguir.position.y);
    }
    
        
    
    void Start()
    {
        MyRb = GetComponent<Rigidbody2D>();
        sp = GetComponent<SpriteRenderer>();
         if(transform.position.x <  nuevaPosicion.x )
          {
              MyRb.velocity = new Vector2(-speed * Time.deltaTime, 0);
              sp.flipX = false;
          }
        
        else
        {
            MyRb.velocity = new Vector2(+speed * Time.deltaTime, 0);
            sp.flipX = true;
        }
    }

    // Update is called once per frame
    void Update()
    {
         
        
        //MyRb.velocity = new Vector2(+speed * Time.deltaTime, 0);
        Destroy(gameObject, 15f);
        
    }
    
        void OnTriggerEnter2D(Collider2D collision)
{
    
    if (collision.transform.tag != v && collision.gameObject.tag != "fuego") 
    {
       
        Destroy(gameObject);
       
    }
    
    
}
       public void direccion()
{
       
    
    
}
   
     
}
