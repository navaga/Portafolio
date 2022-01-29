
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DepartamentoMetodos {

    //inserta una nueva fila en la tabla departamentos.
    public int InsertarDatos(Departamento a) {
        int n = 0;
        if (ComprobarSiExiste(a.getCodigo())) {
            try {
                //cargar Driver
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/14630673M", "root", "");
                String sql = "insert into departamentos values (?,?,?,?)";  //sentencia sql
                PreparedStatement sentencia = conexion.prepareStatement(sql); //introduce la sentencia sql
                sentencia.setInt(1, a.getCodigo()); //inserta los datos, cada numero del 1 al 4 son los interrogantes.
                sentencia.setString(2, a.getNombre());
                sentencia.setInt(3, a.getId_localizacion());
                sentencia.setInt(4, a.getId_manager());

                n = sentencia.executeUpdate();

                sentencia.close();
                conexion.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return n;
    }

    // te muestra todas las filas de la tabla departamentos.
    public String Mostar() {
        String n = "";
        try {
            //cargar Driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/14630673M", "root", "");
            String sql = "select * from departamentos";
            Statement sentencia = conexion.createStatement();
            ResultSet result = sentencia.executeQuery(sql);
            while (result.next()) {
                n += result.getString(1) + "\t" + result.getString(2) + "\t" + result.getString(3) + "\t" + result.getString(4) + "\n";
            }
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    //metodo para borrar una fila
    public int BorrarDatos(int i) {
        int n = 0;
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro? vas a borrar el Departamento: " + i, "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (resp == 0) {
            try {
                //cargar Driver
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/14630673M", "root", "");
                Statement sentencia = conexion.createStatement();
                String sql = "delete from departamentos where codigo=" + i + ";";
                n = sentencia.executeUpdate(sql);

                sentencia.close();
                conexion.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return n;
    }

    //Metodo para modificar los datos de una fila
    public int ModificarDatos(Departamento a) {
        int n = 0;
        try {
            //cargar Driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/14630673M", "root", "");
            Statement sentencia = conexion.createStatement();
            String sql = "update departamentos set nombre='" + a.getNombre() + "', id_localizacion='" + a.getId_localizacion() + "', id_manager='" + a.getId_manager() + 
                    "' where codigo=" + a.getCodigo() + ";";
            n = sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public String[] MostrarDatosEnJtext(int a) {

        //Este metodo guarda en un array El nombre, id_localizacion y id_Manager nos enviaran por parametro el codigo de departamento que se quiere buscar.
        //Para luego insertarlos en los jtextfield
        String datos[] = new String[3];
        try {
            //cargar Driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/14630673M", "root", "");
            String sql = "select * from departamentos where codigo=" + a + ";";
            Statement sentencia = conexion.createStatement();
            ResultSet result = sentencia.executeQuery(sql);
            while(result.next())
            {
            datos[0] = result.getString(2);
            datos[1] = result.getString(3);
            datos[2] = result.getString(4);
            }

            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }

    
    // Este metodo es para comprobar si el codigo de departamento que se quiere insertar ya existe(si existe y lo insertamos de nuevo parchazo al canto.)
    public static boolean ComprobarSiExiste(int a) {
        boolean n = true;
        try {
            //cargar Driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/14630673M", "root", "");
            String sql = "select * from departamentos";
            Statement sentencia = conexion.createStatement();
            ResultSet result = sentencia.executeQuery(sql);
            while (result.next()) {
                if (result.getString(1).equals(String.valueOf(a))) {
                    n = false;
                    break;
                }
            }
            sentencia.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

}
