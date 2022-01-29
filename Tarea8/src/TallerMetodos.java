
import java.io.IOException;
import com.db4o.*;
import javax.swing.JOptionPane;

/**
 *
 * @author navag
 */
public class TallerMetodos {

    private final String path = "Tarea8.yap";
    private ObjectContainer bd;

    // metodo para insertar un objeto de la clase Articulos en la base de datos
    public void insertar(Articulos a, javax.swing.JTextArea jTextArea1) throws IOException {

        
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
        Articulos articuloConsulta = new Articulos(a.GetCodigo(), null, 0, null);
        ObjectSet<Articulos> resultadoConsulta = bd.queryByExample(articuloConsulta);
        if (resultadoConsulta.isEmpty()) { 
        bd.store(a); 
        bd.close();
        jTextArea1.append("Insertado con existo");
        } else
        {
          jTextArea1.append("El codigo ya existe");
          bd.close();
        }
        
    }

    //metodo buscar
    public void buscar(int codigo, javax.swing.JTextArea jTextArea1) {
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);

        Articulos articuloConsulta = new Articulos(codigo, null, 0, null);

        ObjectSet<Articulos> resultadoConsulta = bd.queryByExample(articuloConsulta);

        if (resultadoConsulta.isEmpty()) { //comprueba que no este vacio el objeto
            jTextArea1.append("El codigo: " + codigo + " NO existe");
        } else {
            Articulos ar = resultadoConsulta.next();
            jTextArea1.append(cabezera());
            jTextArea1.append(String.format("%-12s", ar.GetCodigo())
                    + String.format("%-12s", ar.GetNombre())
                    + String.format("%-12s", ar.getCantidad()) + String.format("%-12s", ar.getDescripcion()) + "\n");
        }

        bd.close();
    }

    public String borrar(int codigo) throws IOException {
        String mensaje;
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);

        // creamos un objeto Articulos con los datos de la busqueda (si es 0 o null no los considera)
        Articulos articuloConsulta = new Articulos(codigo, null, 0, null);

        //hace la busqueda en la base de datos, si encuentra coincidencia lo guarda en resultadoConsulta
        ObjectSet<Articulos> resultadoConsulta = bd.queryByExample(articuloConsulta);

        if (resultadoConsulta.isEmpty()) {
            mensaje = "El codigo: " + codigo + " NO existe";
        } else {

            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro? vas a borrar el articulo: " + codigo, "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            mensaje = "El codigo: " + codigo + " NO se elimino";
            if (resp == 0) {
                Articulos art = resultadoConsulta.next();

                bd.delete(art); //borra de la base de datos
                mensaje = "Borrado realizado con EXITO";
            } else {
                mensaje = "Finalmente no se borro";
            }
        }

        bd.close();

        return mensaje;
    }

    public String modificar(int codigo, String nombre, int cantidad, String descripcion) throws IOException {
        String mensaje;

        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);

        Articulos articuloConsulta = new Articulos(codigo, null, 0, null);

        ObjectSet<Articulos> resultadoConsulta = bd.queryByExample(articuloConsulta);

        if (resultadoConsulta.isEmpty()) {
            mensaje = "El codigo: " + codigo + " No existe";
        } else {
            Articulos art = resultadoConsulta.next();
            art.SetNombre(nombre);
            art.setCantidad(cantidad);
            art.setDescripcion(descripcion);
            bd.store(art);
            mensaje = "Modificación realizada";
        }

        bd.close();
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

    public void visualizar(javax.swing.JTextArea jTextArea1) {
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
        Articulos a = new Articulos();
        ObjectSet<Articulos> resultado = bd.queryByExample(a);
        jTextArea1.setText("");//limpiar el textarea
        jTextArea1.append(cabezera());
        while (resultado.hasNext()) {
            Articulos ar = (Articulos) resultado.next();
            jTextArea1.append(String.format("%-12s", ar.GetCodigo())
                    + String.format("%-12s", ar.GetNombre())
                    + String.format("%-12s", ar.getCantidad()) + String.format("%-12s", ar.getDescripcion()) + "\n");

        }
        bd.close();
    }

}
