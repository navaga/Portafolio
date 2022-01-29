using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Porros : MonoBehaviour
{
    public GameObject asteroide; //objeto a instanciar
    public Vector3 posicion; //posición (límites) en la que instanciar
    public int numeroDeAsteroides; //número de objetos en cada ola
    public float esperaInicial;
    public float esperaEntreAsteroides;
    public float esperaEntreOlas;
    int randomCS;

    void Start () {

        StartCoroutine(crearAsteroides());
		
	}

    IEnumerator crearAsteroides(){

        //Espera inicial
        yield return new WaitForSeconds(esperaInicial);

        while (true){

            for (int i = 0; i < numeroDeAsteroides; i++)
            {
                 
                //Posición aleatoria entre los límites (positivo y negativo) que establezcamos
                Vector3 posicionAsteroide = new Vector3(Random.Range(-posicion.x, posicion.x), posicion.y, posicion.z);
                //Rotación
                Quaternion rotacionAsteroide = Quaternion.identity;
                //Instancio el asteroide
                Instantiate(asteroide, posicionAsteroide, rotacionAsteroide);
                //Espera entre asteroides
                yield return new WaitForSeconds(esperaEntreAsteroides);
            }

            //Espera entre olas
            yield return new WaitForSeconds(esperaEntreOlas);

        }
           
    }
   
}
