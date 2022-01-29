/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_tarea2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author navag
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lbResultado;
    @FXML
    private TextField jtNombre;
    
    @FXML
    private void btEnviar(ActionEvent event) {
        
        lbResultado.setText("Hola "+jtNombre.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
