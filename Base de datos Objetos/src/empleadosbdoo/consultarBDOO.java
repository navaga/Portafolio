/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadosbdoo;

import org.neodatis.odb.*;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

/**
 *
 * @author navag
 */
public class consultarBDOO {

    public static void main(String[] args) {

        ODB odb = ODBFactory.open("gestionLaboral2122.obj"); //Abrimos la conexion con el fichero de laBD

        //Consultamos todos los datos de la tabla Empleados
        IQuery query = new CriteriaQuery(Empleados.class);

        //Hacemos la consulta
        Objects<Empleados> lista = odb.getObjects(query);
        Empleados empl = null;
        // Recorremos todos los resultados de la consulta
        while (lista.hasNext()) {
            empl = lista.next();
            System.out.println("codEmpleado " + empl.getCodEmpleado()
                    + "\tNombre: " + empl.getNombre()
                    + "\tApellido: " + empl.getApellidos()
                    + "\tDepartament: " + empl.getDepartamento()
                    + "\tSalario: " + empl.getSalario()
            );

        }

        //Cerramos la base de datos
        odb.close();
    }

}
