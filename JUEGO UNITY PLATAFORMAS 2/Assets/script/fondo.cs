using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class fondo : MonoBehaviour
{
    // Start is called before the first frame update
    public Renderer fondos;
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        fondos.material.mainTextureOffset += new Vector2(0.015f, 0) * Time.deltaTime;
    }
}
