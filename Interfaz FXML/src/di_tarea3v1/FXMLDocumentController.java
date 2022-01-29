/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_tarea3v1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import componente.GraficoController;
import javax.swing.JOptionPane;

/**
 *
 * @author navag
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private GraficoController compController;

    @FXML
    private TextField tfContra;
    /**
     * boton para salir de la aplicacion
     * @param event evento del boton
     */
    @FXML
    private void btSalir(ActionEvent event) {

        System.exit(0);

    }
    /**
     * boton para generar contraseña
     * @param event evento del boton
     */
    @FXML
    private void btGenerar(ActionEvent event) {

        String clave = "";
        try{
        clave = compController.obtenNombre().substring(0, 1);
        clave = clave + compController.obtenApellido().substring(0, 3);
        clave = clave + compController.obtenDni().substring(compController.obtenDni().length() - 4, compController.obtenDni().length());
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(
   null,
   "no dejar campos vacios");
        }
       
        
        tfContra.setText(clave.toUpperCase());

    }
    /**
     * boton para limpiar los textfield
     * @param event evento del boton
     */
    @FXML
    private void btNuevo(ActionEvent event) {

        compController.limpiarCampos();
        tfContra.setText("");

    }
    /**
     * 
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
