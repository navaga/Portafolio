using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SeguirJugador : MonoBehaviour
{
    // Start is called before the first frame update
    public GameObject player;
    public Vector3 globo = new Vector3(200 ,200,0);
    
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        this.transform.position = player.transform.position + globo;
    }
}
