
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MetodosGestion {

    static ArrayList<Gestion> gestion = new ArrayList<>(); //un arraylist de la clase gestion

    File fich = new File("productos.txt");
    static int tamañoInicial = 0;

    public String visualizar() throws FileNotFoundException, IOException {// muestra el resultado completo del arraylist
        String envio = cabezera();
        /*for (int i = 0; i < gestion.size(); i++) {

            envio += String.format("%-12s", gestion.get(i).getCodigo()) + String.format("%-12s", gestion.get(i).getNombre())
                    + String.format("%-12s", gestion.get(i).getCantidad()) + String.format("%-12s", gestion.get(i).getDescripcion());
            envio += "\n";

        }*/
          for (Gestion g: gestion) { // es como el bucle de arriba foreach o bucle mejorada, primero pones la clase y despues nombre del objeto que quieres recorrer.

            envio += String.format("%-12s", g.getCodigo()) + String.format("%-12s", g.getNombre())
                    + String.format("%-12s", g.getCantidad()) + String.format("%-12s", g.getDescripcion());
            envio += "\n";

        }
     for (int i = 0; i < gestion.size(); i++) { //tambien lo muestra por consola
            System.out.print(gestion.get(i).getCodigo() + " ");
            System.out.print(gestion.get(i).getNombre() + " ");
            System.out.print(gestion.get(i).getCantidad() + " ");
            System.out.println(gestion.get(i).getDescripcion() + " ");
        }
       
        // Iterator super potente con bucle for
        for(Iterator<Gestion> iter= gestion.iterator();iter.hasNext();)
        {
            
           Gestion ges = new Gestion();
           ges = iter.next();
           System.out.print(ges.getCodigo() + " "); 
           
           System.out.print(ges.getNombre() + " "); 
           System.out.print(ges.getCantidad() + " "); 
           System.out.println(ges.getDescripcion() + " "); 
        }
        
       
        return envio;
    }

    public void inserta(String nombre, String Descripcion, String cantidad, String codigo) throws IOException { // añade un nuevo objeto al arraylist y llama al metodo guardar

        Gestion gs = new Gestion();
        gs.setNombre(nombre);
        gs.setCantidad(Integer.parseInt(cantidad));
        gs.setCodigo(Integer.parseInt(codigo));
        gs.setDescripcion(Descripcion);
        gestion.add(gs);

    }

    public String guardar2() throws IOException { // carga el fichero y añade una nueva linea usando el ultimo objeto del arraylist
        FileWriter fl = new FileWriter(fich, true);
        BufferedWriter bw = new BufferedWriter(fl);

        int i = gestion.size() - tamañoInicial;
        String guardar = "No se pudo guardar nada";

        if (i != 0) {
            guardar = cabezera();
            for (int z = 0; z < i; z++) {
                bw.write(gestion.get(tamañoInicial).getCodigo() + ";" + gestion.get(tamañoInicial).getNombre() + ";" + gestion.get(tamañoInicial).getCantidad() + ";" + gestion.get(tamañoInicial).getDescripcion());
                bw.newLine();
                tamañoInicial++;
            }
            bw.flush();
            bw.close();
        }
        return guardar;
    }

    public void cargarEnMemoria() throws IOException { //lo llama el metodo main, carga el fichero en memoria en una arraylist

        if (fich.exists()) {
            FileReader fr = new FileReader(fich);
            BufferedReader br = new BufferedReader(fr);
            String texto = "";
            while ((texto = br.readLine()) != null) {
                String[] partes = texto.split(";"); //parte la linea del fichero cada vez que encuentra un ;
                Gestion gs = new Gestion();
                gs.setCodigo(Integer.parseInt(partes[0]));
                gs.setNombre(partes[1]);
                gs.setCantidad(Integer.parseInt(partes[2]));
                gs.setDescripcion(partes[3]);
                gestion.add(gs);
            }

            tamañoInicial = gestion.size();
            br.close();
            
        }

    }

    public String buscar2(String codigo) throws IOException {//busca si el codigo enviado con el usuario existe y lo envia.
        
        String envio ="";
        boolean nocoincide=false;
        for (int i = 0; i < gestion.size(); i++) {
            
            if (gestion.get(i).getCodigo() == Integer.parseInt(codigo)) {
                nocoincide = true;
                
                envio += String.format("%-12s", gestion.get(i).getCodigo()) + String.format("%-12s", gestion.get(i).getNombre())
                        + String.format("%-12s", gestion.get(i).getCantidad()) + String.format("%-12s", gestion.get(i).getDescripcion())+"\n";
            }

        }
        if(!nocoincide){envio ="No existe el codigo:" + codigo;}
        return envio;
    }

   /* public String buscarpre(String codigo1) throws IOException {//busca si el codigo enviado con el usuario existe y lo envia.

        String envio = "No existe el codigo:" + codigo1;
        for (int i = 0; i < gestion.size(); i++) {

           String prueba = Integer.toString(gestion.get(i).getCodigo());
           
           
            if (prueba.contains(codigo1)) {
                envio = cabezera();
                envio += String.format("%-12s", gestion.get(i).getCodigo()) + String.format("%-12s", gestion.get(i).getNombre())
                        + String.format("%-12s", gestion.get(i).getCantidad()) + String.format("%-12s", gestion.get(i).getDescripcion());
            }

        }
      
        return envio;
    }*/

    public String borrar(String codigo) throws IOException {//busca si el codigo enviado con el usuario existe y lo borra.

        String envio = "No existe el codigo:" + codigo;
        boolean entro = false;
        for (int i = 0; i < gestion.size(); i++) {

            if (gestion.get(i).getCodigo() == Integer.parseInt(codigo)) {
                envio = cabezera();
                envio += String.format("%-12s", gestion.get(i).getCodigo()) + String.format("%-12s", gestion.get(i).getNombre())
                        + String.format("%-12s", gestion.get(i).getCantidad()) + String.format("%-12s", gestion.get(i).getDescripcion() + "\n" + "FUE BORRADO PARA SIEMPRE");
                gestion.remove(i);
                entro = true;
            }

        }
        if (entro) {
            FileWriter fl = new FileWriter(fich);
            BufferedWriter bw = new BufferedWriter(fl);
            for (int i = 0; i < gestion.size(); i++) {

                bw.write(gestion.get(i).getCodigo() + ";" + gestion.get(i).getNombre() + ";" + gestion.get(i).getCantidad() + ";" + gestion.get(i).getDescripcion() + ";");
                bw.newLine();

                tamañoInicial = gestion.size();
            }
            bw.flush();
            bw.close();
        }

        return envio;
    }

    public String cabezera() {
        String envio = String.format("%-12s", "CODIGO");
        envio += String.format("%-12s", "NOMBRE");
        envio += String.format("%-12s", "CANTIDAD");
        envio += String.format("%-12s", "DESCRIPCION");
        envio += "\n";
        return envio;
    }

    /////////////******************** CODIGO DESECHADO **********\\\\\\\\\\\\\\\\\\
    ////////**********************************************************\\\\\\\\\\\\\\
    ///***********************************************************************\\\\\\\\
    /* public void guardar(String nombre, String descripcion, String cantidad, String codigo) throws IOException { //////***guarda directamente sin pasar por el arraylist***\\\\\\\

        FileWriter fl = new FileWriter(fich, true);
        BufferedWriter bw = new BufferedWriter(fl);

      
        bw.write(codigo + ";" + nombre + ";" + cantidad + ";" + descripcion + ";");
        bw.newLine();
        bw.flush();
        bw.close();
    }

    public String buscar(String codigo) throws IOException {  ///////////***busca directamente en el archivo txt***\\\\\\\\\\\\
        FileReader fr = new FileReader(fich);
        BufferedReader br = new BufferedReader(fr);
        String busco = "";
        String texto = "";
        String envio = "No existe el codigo:" + codigo;

        while ((texto = br.readLine()) != null) {

            System.out.println(texto);
            char caracter;
            // prueba=texto.charAt(0);

            for (int i = 0; texto.charAt(i) != ';'; i++) { //podia usar split lo pense tarde.
                caracter = texto.charAt(i);                // el codigo producto siempre estara el primero de la fila                    
                busco += caracter;
                System.out.println(busco);

            }
            if (busco.equals(codigo)) //probar compareTo (deberia funcionar)compareTo(codigo)==0
            {
                envio = texto;

            }

            busco = "";
        }
        br.close();
        return envio;
}*/

 /* public static void Guardar() throws IOException   ////primeras pruebas\\\\\
    {
        File fich = new File("productos.txt");
        FileWriter fl = new FileWriter(fich, true);
        FileReader fr = new FileReader(fich);
        BufferedWriter bw = new BufferedWriter(fl);
        BufferedReader br = new BufferedReader(fr);
        if (br.readLine() == null) {
            bw.write("Codigo\tNombre\tCantidad\tDescripcion\n");
            bw.newLine();
        }
         for (int i = 0; i < gestion.size(); i++) {
            texto = gestion.get(i).getCodigo() + "\t"
                    + gestion.get(i).getNombre() + "\t" + gestion.get(i).getCantidad() + "\t"
                    + gestion.get(i).getDescripcion() + "\n";

        }
         
                    bw.write(aux.getNombre()+"\t"+"\t"+aux.getEdad());
                    bw.newLine();
                    bw.flush();
        
    }*/
 /* public String visualizar() throws FileNotFoundException, IOException {  ///////*****LEE FICHERO Y ENVIA INFO******\\\\\\\\

        FileReader fr = new FileReader(fich);
        BufferedReader br = new BufferedReader(fr);
        String texto = "";
        String envio = "";

        while ((texto = br.readLine()) != null) {

            envio += texto + "\n";

        }

        br.close();
        return envio;
    }*/
}
