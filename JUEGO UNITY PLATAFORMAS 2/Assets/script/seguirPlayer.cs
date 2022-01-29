using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class seguirPlayer : MonoBehaviour
{
    public Transform ObjetoASeguir = null;
    public float velocidad =2;
    Vector3 newRotation = new Vector3(0, 0, 0);
    Vector2 temp;
    SpriteRenderer sp;
     void Awake()
    {
       ObjetoASeguir = GameObject.FindGameObjectWithTag("Player").GetComponent<Transform>();
       temp = transform.position;
    }
    // Start is called before the first frame update
    void Start()
    {
        sp = GetComponent<SpriteRenderer>();
    }

    // Update is called once per frame
    void Update()
    {
            //Vector2 temp = transform.position;
            //temp.y =0;
            //transform.position = temp;
           
        transform.position = Vector2.MoveTowards(transform.position, ObjetoASeguir.transform.position ,velocidad * Time.deltaTime);
        transform.position = new Vector2(transform.position.x,temp.y);
        
        transform.eulerAngles = newRotation;
        if(transform.position.x <  ObjetoASeguir.transform.position.x )
        sp.flipX = false;
        else
        sp.flipX = true;
        
        //transform.up = ObjetoASeguir.position - transform.position;
        //transform.right = ObjetoASeguir.position - transform.position;
        
         
        
    }
}
