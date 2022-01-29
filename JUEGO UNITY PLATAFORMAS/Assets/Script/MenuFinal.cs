using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class MenuFinal : MonoBehaviour
{
    // Start is called before the first frame update
   public void IniciarJuego()
    {
        SceneManager.LoadScene(1);
    }
    public void CerrarJuego()
    {
        Application.Quit();
    }
}
