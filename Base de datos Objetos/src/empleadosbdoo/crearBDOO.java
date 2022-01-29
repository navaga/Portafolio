/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadosbdoo;

import java.io.File;
import java.util.ArrayList;
import org.neodatis.odb.*;

/**
 *
 * @author navag
 */
public class crearBDOO {

    public static void main(String[] args) {
        ODB odb = ODBFactory.open("gestionLaboral2122.obj"); //abrimos o creamos el fichero
        
        //Creamos los objetos con los datos para la base de datos
        Empleados dept1 = new Empleados(1, "Ignacio", "Valero", "Desarrollador", 1750);
        Empleados dept2 = new Empleados(2, "Manuel", "Martinez", "Contable", 1200);
        Empleados dept3 = new Empleados(3, "Silvia", "Marzo", "Desarrollador", 1600);
        Empleados dept4 = new Empleados(4, "Miguel", "cerezo", "Analista", 1500);
        Empleados dept5 = new Empleados(5, "Sara", "Toro", "Gerente", 1800);
        
        //añadimos los objetos a una arraylist de tipo empleados
        ArrayList<Empleados> lista = new ArrayList<Empleados>();
        lista.add(dept1);
        lista.add(dept2);
        lista.add(dept3);
        lista.add(dept4);
        lista.add(dept5);
        
        //añadimos los objetos a la base de datos recorriendo el arraylist
        for (Empleados dept : lista) {
            odb.store(dept);
        }

        odb.close();
        
        //podiamos haber hecho para el ejemplo simplemente odb.store(dept1),odb.store(dept2),odb.store(dept3)....;
    }

}
