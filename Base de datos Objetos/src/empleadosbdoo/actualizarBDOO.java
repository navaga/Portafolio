/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadosbdoo;
import java.io.File;
import java.util.ArrayList;
import org.neodatis.odb.*;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.And;
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;
/**
 *
 * @author navag
 */
public class actualizarBDOO {
    
       public static void main(String[] args) {
           
            
         ODB odb = ODBFactory.open("gestionLaboral2122.obj"); //Abrimos la conexion con el fichero de laBD
        
        //hacemos la consulta
        IQuery query = new CriteriaQuery(Empleados.class,Where.lt("salario", 1600));
        
       
      
        //añadimos la conslta a un objeto
        Objects<Empleados> objects = odb.getObjects(query);

	if (objects.size() == 0) {
	    System.out.println("No hay empleados con salario menor a 1600");
	} else {
            //Recorremos todo los objetos que nos ha devuelto la consulta.
	    while (objects.hasNext()) {
		Empleados empleado = objects.next();
		empleado.setSalario(empleado.getSalario()+200);
		System.out.println("El empleado " + empleado.getNombre() + " se ha actualizado");
		odb.store(empleado);
	    }
	    odb.commit();
	}
	

        //Cierre
        odb.close();
        
    }
    
}
