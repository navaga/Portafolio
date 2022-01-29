using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class disparoboss : MonoBehaviour
{

    // Start is called before the first frame update
    public Transform disparo;
    public GameObject bala;
    public float tiempo;
    //public float value = Random.Range(0f,20f);
    SpriteRenderer sp;
    public Transform ObjetoASeguir = null;
    
       void Awake()
    {
       ObjetoASeguir = GameObject.FindGameObjectWithTag("Player").GetComponent<Transform>();
       
    }
    void Start()
    {
        sp = GetComponent<SpriteRenderer>();
    }
    

    // Update is called once per frame
    void Update()
    {   
        
        // int i = UnityEngine.Random.Range(5,10);
        /*tiempo += Time.deltaTime;
        if (tiempo>=i)   --- antes estaba simplemente a dos
        {
            Instantiate(bala, disparo.position, Quaternion.identity);
            tiempo = 0;
        }*/
        //girar los enemigos para donde yo este
         if(transform.position.x <  ObjetoASeguir.transform.position.x )
        sp.flipX = false;
        else
        sp.flipX = true;

        //int i = UnityEngine.Random.Range(5,10);
        tiempo += Time.deltaTime;
        if (tiempo>=5)
        {
            Instantiate(bala, disparo.position, Quaternion.identity);
            tiempo = 0;
        }
    }
   

            
}
