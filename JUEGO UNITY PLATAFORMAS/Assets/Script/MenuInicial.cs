using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class MenuInicial : MonoBehaviour
{
    //Cambiar a la escena de juego
    public void IniciarJuego()
    {
        SceneManager.LoadScene(1);
    }
    public void CerrarJuego()
    {
        Application.Quit();
    }
}
