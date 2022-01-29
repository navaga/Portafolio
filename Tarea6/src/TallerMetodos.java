
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author navag
 */
public class TallerMetodos {

    static HashMap<Integer, Taller> map = new HashMap<Integer, Taller>();
    static File fi = new File("productos.txt");

    public int insertar(int codigo, String nombre, int cantidad, String descripcion) throws IOException {
        int mensaje = 0;

        if (!map.values().contains(map.get(codigo))) // COMPROVAMOS QUE EL CODIGO NO EXISTA PARA NO SOBREESCRIBIR
        {

            Taller t = new Taller(codigo, nombre, cantidad, descripcion);
            map.put(t.GetCodigo(), t);  // SI EL CODIGO NO EXISTE LO INSERTAMOS.
            mensaje = 1;
            GuardarArchivo();

        }

        return mensaje;

    }

    public static void GuardarArchivo() throws IOException {

        if (!fi.exists()) {
            fi.createNewFile();
        }
        BufferedWriter br = new BufferedWriter(new FileWriter(fi));

        for (Map.Entry<Integer, Taller> entrada : map.entrySet()) { //recorrer el hashmap usando la clase Map y el metodo Entry (me parece la mejor forma)
            Taller valor = entrada.getValue();                      // PODEMOS USAR LOS METODOS getKey () y getValue ()PARA OBTERNER LA CLAVE Y EL VALOR.
            br.write(valor.toString());
            br.newLine();
        }
        br.close();

        
        /*-------------LO MISMO DE ARRIBA PERO USANDO ITERATOR--------------------------
        Iterator<Integer> ta = map.keySet().iterator();
        for (Iterator<Integer> it2 = map.keySet().iterator(); ta.hasNext();) //itereator en un bucle for ! tambien funciona.
        {
            int a = it2.next();
            br.write(map.get(a).toString());
            br.newLine();
        }
        br.close();
        
        -----------------------------OTRA FORMA----------------------------------------------------------------------
        
        Iterator<Integer> it = map.keySet().iterator();   //usando un iterator funciona bien!!
        int tmp;
        while (it.hasNext()) {

            tmp = it.next();
            br.write(map.get(tmp).toString());
            br.newLine();
        }

        br.close();
        ---------------------------OTRA-------------------------------------------------------------------------------------
        
         Iterator it = map.entrySet().iterator();
        Map.Entry<Integer,Taller> de;
        while (it.hasNext()){
            de = (Map.Entry<Integer,Taller>)it.next();
            System.out.println (de.toString());
        }
        }
        
         */
    }

    //CARGAMOS EL ARCHIVO TXT EN EL HASHMAP
    public void cargarArchivo() throws IOException {

        if (fi.exists()) { //SI EL FICHERO EXISTE LO LEE
            BufferedReader br = new BufferedReader(new FileReader(fi));
            String texto = "";
            while ((texto = br.readLine()) != null) { // RECORRE EL FICHERO LINEA A LINEA HASTA QUE ENCUENTRO UN NULO.
                //COMO HEMOS SEPERADO LOS DATOS POR ; (CODIGO;NOMBRE;CANTIDAD;DESCRIPCION) AHORA LOS SEPARAMOS Y GUARDAMOS EN UNA ARRAY
                //LUEGO LO METEMOS TODO EN UN OBJETO DE TIPO TALLER Y LO METEMOS DENTRO DEL HASHMAP
                String[] datos = texto.split(";");
                Taller ta = new Taller(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2]), datos[3]);
                map.put(ta.GetCodigo(), ta);

            }
            br.close();

        }

    }

    public String buscar(int codigo) {

        String mensaje = "El codigo no existe";
        if (map.isEmpty()) {
            mensaje = "lista vacia";
        } else if (map.values().contains(map.get(codigo))) { // COMPRUEBA QUE EL CODIGO EXISTA DENTRO DE NUESTRO HASHMAP
            //SI EL CODIGO EXISTE LO METEMOS EN UNA VARIABLE Y LO MADAMOS.
            mensaje = cabezera() + String.format("%-12s", map.get(codigo).GetCodigo()) + String.format("%-12s", map.get(codigo).GetNombre())
                    + String.format("%-12s", map.get(codigo).getCantidad()) + String.format("%-12s", map.get(codigo).getDescripcion());
            mensaje += "\n";
        }
        return mensaje;
    }

    public String borrar(int codigo) throws IOException {
        String mensaje = "El codigo: " + codigo + " NO existe";
        int resp = -1;

        if (map.isEmpty()) {                       // COMPRUEBA QUE NO ESTE VACIO
            mensaje = "no hay datos";

        } else if (map.values().contains(map.get(codigo))) {  // COMPRUEBA QUE EL CODIGO EXISTA DENTRO DE NUESTRO HASHMAP

            resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            mensaje = "El codigo: " + codigo + " NO se elimino";
            if (resp == 0) {
                String articulo = map.get(codigo).GetNombre();
                map.remove(codigo);                              // BORRA DEL HASHMAP 
                mensaje = "El articulo: " + articulo + " con codigo " + codigo + "\nHA SIDO ELIMINADO CORRECTAMENTE";

                GuardarArchivo();
            }
        }

        return mensaje;
    }

    public static String modificar(int codigo, String nombre, int cantidad, String descripcion) throws IOException {
        String mensaje = "El codigo: " + codigo + " No existe";

        if (map.isEmpty()) {
            mensaje = "No hay datos";

        } else if (map.values().contains(map.get(codigo))) {  // COMPRUEBA QUE EL CODIGO QUE QUEREMOS MODIFICAR EXISTA (DEVUELVE UN BOOLEANO) 
            Taller ob = new Taller(codigo, nombre, cantidad, descripcion);
            map.put(codigo, ob);                              // SI EXISTE LO SOBREESCRIBIMOS
            GuardarArchivo();
            mensaje = "El articulo: " + nombre + " con codigo " + codigo + "\nse modifico correctamente";
        }

        return mensaje;
    }

    public String cabezera() {
        String envio = String.format("%-12s", "CODIGO");
        envio += String.format("%-12s", "NOMBRE");
        envio += String.format("%-12s", "CANTIDAD");
        envio += String.format("%-12s", "DESCRIPCION");
        envio += "\n";
        return envio;
    }

    public String visualizar() throws FileNotFoundException, IOException {// RECORRE POR COMPLETO EL HASHMAP
        String envio = cabezera();

        for (Map.Entry<Integer, Taller> entrada : map.entrySet()) { //recorrer el hashmap usando la clase Map y el metodo Entry (me parece la mejor forma)
            Taller valor = entrada.getValue();
            envio += String.format("%-12s", valor.GetCodigo()) + String.format("%-12s", valor.GetNombre())
                    + String.format("%-12s", valor.getCantidad()) + String.format("%-12s", valor.getDescripcion());
            envio += "\n";

        }
        return envio;

    }

}
