
import clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;
import java.io.IOException;

public class IgnacioValeroGarcia {

    static ArrayList<Persona> persona = new ArrayList();
    static ArrayList<Camarero> camarero = new ArrayList();

    public static void main(String[] args) throws IOException {
        File fich= new File ("E:\\pruebas\\persona.txt");
        FileWriter fl = new FileWriter(fich,true);
        FileReader fr = new FileReader(fich);
        BufferedWriter bw = new BufferedWriter(fl);
        BufferedReader br = new BufferedReader(fr);
        if(br.readLine() == null)
        {
        bw.write("Persona \t"+"Edad ");
        bw.newLine();
        }
       
        int opcion;
        do {
            String[] botones = {"Nueva Persona", "Nuevo Camarero", "Mostar Datos de Personas", "Mostar Datos de Camareros", "Mostar NUMERO de camareros añadidos", "salir"};
            opcion = JOptionPane.showOptionDialog(null, "Elige una opcion", "ejercicio 4", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
            switch (opcion) {
                case 0:
                    Persona aux = new Persona();
                    aux.setNombre(JOptionPane.showInputDialog("Nombre Persona", null));
                    aux.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad de Persona", null)));

                    persona.add(aux);
                    bw.write(aux.getNombre()+"\t"+"\t"+aux.getEdad());
                    bw.newLine();
                    bw.flush();
                    break;

                case 1:
                    Camarero aux2 = new Camarero();
                    aux2.setNombre(JOptionPane.showInputDialog("Nombre Camarero", null));
                    aux2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del Camarero", null)));
                    aux2.setSueldo(Double.parseDouble(JOptionPane.showInputDialog("Introduce Sueldo Del Camarero", null)));
                    camarero.add(aux2);
                    break;

                case 2:
                   //for(int i=0;i<persona.size();i++)
                   //{
                     //System.out.println("Nombre: "+persona.get(i).getNombre()+" Edad: "+persona.get(i).getEdad() );
                     //JOptionPane.showMessageDialog(null,"Nombre: "+persona.get(i).getNombre()+" Edad: "+persona.get(i).getEdad());
                      //System.out.println(br.readLine());
                     
                   //}
                   for(String linea = br.readLine();linea !=null;)
                   {
                   System.out.println(linea);
                   linea = br.readLine();
                   }
                    break;
                case 3:
                     for(int i=0;i<camarero.size();i++)
                   {
                     System.out.println("Nombre: "+camarero.get(i).getNombre()+" Edad: "+camarero.get(i).getEdad()+" Sueldo: "+ camarero.get(i).getSueldo());
                     JOptionPane.showMessageDialog(null,"Nombre: "+camarero.get(i).getNombre()+" Edad: "+camarero.get(i).getEdad()+" Sueldo: "+ camarero.get(i).getSueldo());
                     
                   }
                    break;
                case 4:
                    Camarero.Contador();
                    break;

            }

        } while (opcion != 5);
        bw.close();
        
        /*Persona p = new Persona("Ignacio Valero Garcia",33);
        Camarero c = new Camarero("Antonio Sanchez",25,1500.33);
        System.out.println("Nombre Persona: "+p.getNombre()+" Edad: "+p.getEdad());
        System.out.println("Nombre Camarero: "+c.getNombre()+" Edad: "+c.getEdad()+" Sueldo: "+c.getSueldo());
        System.out.println(c.PersonaHumanas());
        System.out.println(p.PersonaHumanas());
        Camarero.Contador();
        JOptionPane.showMessageDialog(null,"Nombre Persona: "+p.getNombre()+" Edad: "+p.getEdad());
        JOptionPane.showMessageDialog(null,"Nombre Camarero: "+c.getNombre()+" Edad: "+c.getEdad()+" Sueldo: "+c.getSueldo());*/
        
        
    }

}
