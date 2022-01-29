using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameManager : MonoBehaviour
{
     public GameObject[] asteroide; //objeto a instanciar
    public Vector3 posicion; //posición (límites) en la que instanciar
    public int numeroDeAsteroides; //número de objetos en cada ola
    public float esperaInicial;
    public float esperaEntreAsteroides;
    public float esperaEntreOlas;
    int randomCS;
    float tiempo =0;
    public float cambioTiempoEntre = 10;

    void Start () {

        StartCoroutine(crearAsteroides());
		
	}
    public void Update() {
        tiempo += Time.deltaTime;
        Debug.Log(esperaEntreAsteroides);
    }

    IEnumerator crearAsteroides(){

        //Espera inicial
        yield return new WaitForSeconds(esperaInicial);

        while (true){

            for (int i = 0; i < numeroDeAsteroides; i++)
            {
                 randomCS= Random.Range (0, 3);
                //Posición aleatoria entre los límites (positivo y negativo) que establezcamos
                Vector3 posicionAsteroide = new Vector3(Random.Range(-posicion.x, posicion.x), posicion.y, posicion.z);
                //Rotación
                Quaternion rotacionAsteroide = Quaternion.identity;
                //Instancio el asteroide
                Instantiate(asteroide[randomCS], posicionAsteroide, rotacionAsteroide);
                //Espera entre asteroides
                yield return new WaitForSeconds(esperaEntreAsteroides);
                if(tiempo > cambioTiempoEntre && esperaEntreAsteroides >0.8F)
                {
                    esperaEntreAsteroides -=0.1f;
                }
                
            }

            //Espera entre olas
            yield return new WaitForSeconds(esperaEntreOlas);

        }
           
    }
}
