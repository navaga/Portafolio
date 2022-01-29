import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;


public class GuardadoTaller {
    
    static ArrayList<Taller> taller = new ArrayList<>();
    static Hashtable<Integer,Taller> tabla = new Hashtable<Integer, Taller>();
    static HashMap<Integer,Taller> map = new HashMap<Integer,Taller>();
     public static void main(String args[]) throws IOException
     {
         
         
         
         for(int i=0;i<20;i++){
         GuardarArry(i,"juan"+i);
         
         }
         System.out.println(taller.get(0).GetCodigo()+taller.get(0).GetNombre());
         GuardarArchivo();
         int tmp;
         
         Enumeration<Integer> keyt = tabla.keys();
         Iterator<Integer>  keym = map.keySet().iterator();
         Iterator<Integer> keyti=tabla.keySet().iterator();
         
         while(keyt.hasMoreElements())
         {
             tmp= keyt.nextElement();
             System.out.println(tabla.get(tmp)+" table enu");
         }
         while(keym.hasNext())
         {
             tmp= keym.next();
               System.out.println(map.get(tmp)+" map");
         }
         while(keyti.hasNext())
         {
             tmp=keyti.next();
             System.out.println(tabla.get(tmp)+" table ite");
         }
         
         //map.forEach(System.out::println);
         keym.forEachRemaining(System.out::println);
         
         
     }
    
    public static void GuardarArry(int codigo,String nombre)
    {
        Taller t = new Taller(codigo,nombre);
        map.put(t.GetCodigo(), t);
        tabla.put(t.GetCodigo(),t);
        taller.add(t);
    }
    public static void GuardarArchivo() throws IOException
    {
        File fi = new File("taller.txt");
         if(!fi.exists())
         {
             fi.createNewFile();
         }
        //FileWriter fw = new FileWriter(fi);
        BufferedWriter br = new BufferedWriter(new FileWriter(fi));
        for(Iterator<Taller> ta= taller.iterator();ta.hasNext();)
        {
            
            Taller aux = new Taller();
            aux = ta.next();
            br.write(aux.GetCodigo());
            br.newLine();
            br.write(aux.GetNombre());
            br.newLine();
        }
        
        
        for(Taller ta : taller)
        {
            
            br.write(ta.GetCodigo());
            br.newLine();
            br.write(ta.GetNombre());
            br.newLine();
            
        }
        
        br.close();
        
    }
    
    
    
    
    
}
