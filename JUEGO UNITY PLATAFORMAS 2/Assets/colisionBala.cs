using System.Collections;
using System.Collections.Generic;
using UnityEngine;


// este script no lo uso
public class colisionBala : MonoBehaviour
{
    private const string V = "fuego";

    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }
        void OnTriggerEnter2D(Collider2D collision)
{
    
    //if (collision.gameObject.tag == V) 
    //{
       
      //  Destroy(GameObject.Find("WormEnemy_Projectile_0(Clone)"));
    //}
}
private void OnCollisionEnter2D(Collision2D collision)
    {
        if(collision.transform.tag != "boss" || collision.gameObject.tag != "fuego")
        {
          Destroy(GameObject.Find("WormEnemy_Projectile_0(Clone)"));
          Debug.Log("yeah");
        }
    }
}
