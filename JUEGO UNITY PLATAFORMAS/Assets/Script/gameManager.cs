using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class gameManager : MonoBehaviour
{

    static int muertes = 0;
    static int coins = 0;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
      
       if(coins ==5 && muertes ==4 )
        {
            SceneManager.LoadScene(3);
        }

    }
    public int muerteEnemigo
        {
            get
            {
                return muertes;
            }
            set
            {
                if (value>0)
                {
                    muertes +=value;
                }
            }
        }
        public int contadorMonedas
        {
            get
            {
                return coins;
            }
            set
            {
                if (value>0)
                {
                    coins =value;
                }
            }
        }
}
