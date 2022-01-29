/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_tarea5;

import Modelo.Alumnos;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.fxutils.viewer.JasperViewerFX;

/**
 *
 * @author navag
 */
public class FXMLDocumentController implements Initializable {

   

    private ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        alumnos.add(new Alumnos("14630673M", "Granada", "DI", 10));
        alumnos.add(new Alumnos("71111222M", "Malaga", "DI", 9));
        alumnos.add(new Alumnos("72111222M", "Granada", "DI", 8));
        alumnos.add(new Alumnos("73111222M", "Almeria", "DI", 7));
        alumnos.add(new Alumnos("74111222M", "Cordoba", "DI", 6));
        alumnos.add(new Alumnos("75111222M", "Sevilla", "DI", 6.5));
        alumnos.add(new Alumnos("76111222M", "Cadiz", "DI", 5.5));
        alumnos.add(new Alumnos("77111222M", "Madrid", "DI", 7.7));
        alumnos.add(new Alumnos("78111222M", "Huelva", "DI", 4));
        alumnos.add(new Alumnos("79111222M", "Jaen", "DI", 4));

        alumnos.add(new Alumnos("80111222M", "Burgos", "PMDM", 4));
        alumnos.add(new Alumnos("81111222M", "Barcelona", "PMDM", 5));
        alumnos.add(new Alumnos("82111222M", "Ciudad Real", "PMDM", 6.8));
        alumnos.add(new Alumnos("83111222M", "Cuenca", "PMDM", 9));
        alumnos.add(new Alumnos("84111222M", "Gerona", "PMDM", 7.5));
        alumnos.add(new Alumnos("85111222M", "Jaen", "PMDM", 4));

        alumnos.add(new Alumnos("90111222M", "Burgos", "AD", 8));
        alumnos.add(new Alumnos("91111222M", "Sevilla", "AD", 7));
        alumnos.add(new Alumnos("92111222M", "Granada", "AD", 6));
        alumnos.add(new Alumnos("93111222M", "Almeria", "AD", 5));
        alumnos.add(new Alumnos("94111222M", "Burgos", "AD", 5.1));

        alumnos.add(new Alumnos("90211222M", "Granada", "PSP", 8));
        alumnos.add(new Alumnos("90311222M", "Burgos", "PSP", 8));
        alumnos.add(new Alumnos("90411222M", "Sevilla", "PSP", 8));

        //Ordenamos el arraylist
        Collections.sort(alumnos);

        System.out.println(alumnos.size()+" Alumnos creados");
        // TODO
    }

    @FXML
    private void mostrarGrafico(ActionEvent event) {
        try {
            //Definimos la coleccion de datos sobre la que se creará el informe
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(alumnos);

            /* Obtiene el botón(origen) desde el cuál se hizo clic para llamar al método
           generarGráfico y crea un nodo con él*/
            Node source = (Node) event.getSource();
            /* A continuación, obtiene la escena a la que pertenece ese botón, y con la escena
           obtiene la ventana a la que pertenece la misma */
            Stage stage = (Stage) source.getScene().getWindow();

            /* Al final de la ejecución de las dos líneas anteriores, lo que tenemos en la
           variable stage es una referencia de la ventana desde la cuál se hizo clic,
           para que nuestro informe se muestre como una ventana modal asociada a la 
           ventana que lo invocó */
            //Declaramos nuestro visor de informes
            JasperViewerFX viewerfx;

            /* Creamos el visor de informes, pasándole la ventana desde la cual se solicita
           el informe gráfico, un título para ese informe, la ruta de acceso al informe 
           gráfico que debe cargar el visor, un objeto HashMap que el visor necesita
           pero que en este ejercicio no aporta ninguna funcionalidad, y por último nuestro
           origen de datos representado por el beanColDataSource sobre el cual se creará el
           informe,  */
            viewerfx = new JasperViewerFX(stage, "Gráfico de barras", "/informes/modulos.jasper",
                    new HashMap(), beanColDataSource);

            //Mostramos el informe en el visor
            viewerfx.show();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    @FXML
    private void mostrarGraficoCirculo(ActionEvent event) {
        try {
            //Definimos la coleccion de datos sobre la que se creará el informe
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(alumnos);

            /* Obtiene el botón(origen) desde el cuál se hizo clic para llamar al método
           generarGráfico y crea un nodo con él*/
            Node source = (Node) event.getSource();
            /* A continuación, obtiene la escena a la que pertenece ese botón, y con la escena
           obtiene la ventana a la que pertenece la misma */
            Stage stage = (Stage) source.getScene().getWindow();

            /* Al final de la ejecución de las dos líneas anteriores, lo que tenemos en la
           variable stage es una referencia de la ventana desde la cuál se hizo clic,
           para que nuestro informe se muestre como una ventana modal asociada a la 
           ventana que lo invocó */
            //Declaramos nuestro visor de informes
            JasperViewerFX viewerfx;

            /* Creamos el visor de informes, pasándole la ventana desde la cual se solicita
           el informe gráfico, un título para ese informe, la ruta de acceso al informe 
           gráfico que debe cargar el visor, un objeto HashMap que el visor necesita
           pero que en este ejercicio no aporta ninguna funcionalidad, y por último nuestro
           origen de datos representado por el beanColDataSource sobre el cual se creará el
           informe,  */
            viewerfx = new JasperViewerFX(stage, "Gráfico de barras", "/informes/modulosCircu.jasper",
                    new HashMap(), beanColDataSource);

            //Mostramos el informe en el visor
            viewerfx.show();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    @FXML
    private void mostrarAlumnos(ActionEvent event) {
        try {
            //Definimos la coleccion de datos sobre la que se creará el informe
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(alumnos);

            /* Obtiene el botón(origen) desde el cuál se hizo clic para llamar al método
           generarGráfico y crea un nodo con él*/
            Node source = (Node) event.getSource();
            /* A continuación, obtiene la escena a la que pertenece ese botón, y con la escena
           obtiene la ventana a la que pertenece la misma */
            Stage stage = (Stage) source.getScene().getWindow();

            /* Al final de la ejecución de las dos líneas anteriores, lo que tenemos en la
           variable stage es una referencia de la ventana desde la cuál se hizo clic,
           para que nuestro informe se muestre como una ventana modal asociada a la 
           ventana que lo invocó */
            //Declaramos nuestro visor de informes
            JasperViewerFX viewerfx;

            /* Creamos el visor de informes, pasándole la ventana desde la cual se solicita
           el informe gráfico, un título para ese informe, la ruta de acceso al informe 
           gráfico que debe cargar el visor, un objeto HashMap que el visor necesita
           pero que en este ejercicio no aporta ninguna funcionalidad, y por último nuestro
           origen de datos representado por el beanColDataSource sobre el cual se creará el
           informe,  */
            viewerfx = new JasperViewerFX(stage, "Gráfico de barras", "/informes/matriculados.jasper",
                    new HashMap(), beanColDataSource);

            //Mostramos el informe en el visor
            viewerfx.show();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    @FXML
    private void salir(ActionEvent event)
    {
        System.exit(0);
    }

}
