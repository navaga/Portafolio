/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author navag
 */
public class GraficoController implements Initializable {

     @FXML
    private TextField tfNombre;
    @FXML
    private TextField tApellido;
    @FXML
    private TextField tDni;
    
    
    /**
     * 
     * @return el textfield nombre
     */
    public String obtenNombre()
    {
        return tfNombre.getText();
    }
    /**
     * 
     * @return el textfield Apellido
     */
    public String obtenApellido()
    {
        return tApellido.getText();
    }
    /**
     * 
     * @return el textfield DNI
     */
      public String obtenDni()
    {
        return tDni.getText();
    }
     
      /**
       * Metodo que limpia los campos del componente grafico
       */
      public void limpiarCampos()
      {
          tfNombre.setText("");
          tApellido.setText("");
          tDni.setText("");
      }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
