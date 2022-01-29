/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_tarea4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author navag
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private AnchorPane panel;
    
    @FXML
    private void salir(ActionEvent event) {
      System.exit(0);
       
    }
    @FXML
    private void resetear(ActionEvent event) {
        
        panel.getStylesheets().clear();  //Reseteamos cualquier estilo previo que pudiera haber cargado

    }

    @FXML
    private void estilo1(ActionEvent event) {
        panel.getStylesheets().clear();  //Reseteamos cualquier estilo previo que pudiera haber cargado
        panel.getStylesheets().add("/estilos/estilo1.css");  //Añadimos el nuevo estilo
    }
    @FXML
    private void estilo2(ActionEvent event) {
        panel.getStylesheets().clear();  //Reseteamos cualquier estilo previo que pudiera haber cargado
        panel.getStylesheets().add("/estilos/estilo2.css");  //Añadimos el nuevo estilo
    }
    @FXML
    private void estilo3(ActionEvent event) {
        panel.getStylesheets().clear();  //Reseteamos cualquier estilo previo que pudiera haber cargado
        panel.getStylesheets().add("/estilos/estilo3.css");  //Añadimos el nuevo estilo
    }
    @FXML
    private void acercaDe(ActionEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Acerca de...");
        alert.setHeaderText("version 1.0");
        alert.setContentText("Aplicacion realizada por Ignacio Valero Garcia");
        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
