/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesnombreapellidos;

 

public class NewClass {
   
    public static void main(String[] args) {
        /* creamos un objeto  de la clase String ... 
        ya la clase la importamos asi que podemos crear objetos a partir de esa clase
        */
        // este seria el objeto String creado y lo llamamos mensaje 
       
        String mensaje= "HOLA MUNDO";
        String mensaje2= "Soy la Reina Leticia y vivo en Madrid, Reina de España";
        String mensaje3= "Mi mama me ama mucho y mi mama me mima";
        String mensaje4="SI";
        String mensaje5;
        String mensaje6=" PUEDO CON PROGRAMACION";
                
        // USO DE LOS PRINCIPALES METODOS DE STRING
        
        /*1. lenght() sirve para obtener la longitud de la cadena mensaje y para verla en pantalla la imprimimos
        como es un numero lo que devuelve el tipo de datos para crear el metodo es es int
        */
              
        int lon;
        lon= mensaje.length();
        System.out.println("1. El mensaje tiene "+lon +" caracteres" +"- uso del lenght");
       
        lon= mensaje2.length();
        System.out.println("    1.1.  El mensaje tiene "+lon +" caracteres" +"- uso del lenght");
        
        /* 2. indexOf(char c), este devuevle la posicion del primer caracter encontrado igual y sino existe ese 
        caracter devuelve -1, ver caso de mensaje de error 2.1.
        */ 
         int conocerposicioncar;
         conocerposicioncar=mensaje.indexOf("M");
         System.out.println("2. La posicion del caracter buscado es "+conocerposicioncar +" - primer uso del indexOf");
          
         // 2.1. caso que no exista el caracter y como arroja el error en la pantalla
         
         conocerposicioncar=mensaje.indexOf("7");
         System.out.println("    2.1 La posicion del caracter buscado es "+conocerposicioncar +" - primer uso del indexOf"+ " (mensaje de error)");
        
        /*3. IndexOf(char c, int index) , esta variante me costo entederla pero ya le agarre el hilo jejej, por ejemplo
        en el mensaje2 hay muchisimos caracteres que se repiten y yo que no tengo nada que hacer, quiero
         saber si existe un caracter en particular despues desde una posicion determinada, con varios ejemplos se ve
         mas claro, ahi va unos cuantos ok
         */
         /* en este ejemplo toma la letra a pues se repite muchas veces y quiero saber si en la posicion 50, contando
         desde el primer caracter como 0 hasta llegar al 50, si despues de esa posicion hay una caracter a (letra a) 
        y si lo hay me arrojara la posicion en que se encuentra la primera letra a encontrada, fijese que la posicion 50
        en ese mensaje es la p de Espana, si lo cuentan lo veran y que luego de ahi hay dos a, pues tomo la primera
        a que encontro y devolvio el valor 51
        */
         
        int varianteconocerposicioncar;
         varianteconocerposicioncar=mensaje2.indexOf("a",50);
         System.out.println("3. La posicion del caracter buscado es "+varianteconocerposicioncar +" - segundo uso del indexOf");
         
         /* en este caso lo quise hacer con la y, la cual existe pero quiero saber si a partir de la posicion 30 encontrare
         alguna letra y, notese que antes de la posicion 30 si existe dos veces, pero despues no, por lo que debe arrojar -1
         que es el mensaje de error*/
         
         
         varianteconocerposicioncar=mensaje2.indexOf("y",30);
         System.out.println("    3.1 La posicion del caracter buscado es "+varianteconocerposicioncar +" - segundo uso del indexOf"+" (mensaje de error)");
      
        /* En estas variantes funciona igual solo que buscar de la cadena de caracteres (String) el primer caracter
        y buscara su posicion, ejemplo de cadena de caracter Reina , en el mensaje se encuentra dos veces
         por lo que buscara el primer caracter de esa cadena que seria R y las variantes funciona igual que lo anterior*/
                  
                 
         varianteconocerposicioncar=mensaje2.indexOf("Reina");
         System.out.println("    3.2 La posicion del caracter buscado es "+varianteconocerposicioncar +" - segundo uso del indexOf"+" (variante)");
         
         varianteconocerposicioncar=mensaje2.indexOf("Reina", 30);
         System.out.println("    3.3 La posicion del caracter buscado es "+varianteconocerposicioncar +" - segundo uso del indexOf"+" (variante)");
      
        /*4.charAt(int index) conocer cual es el caracter segun la  posicion donde este
        */
        
        char conocercaracter; 
        conocercaracter= mensaje.charAt(3);
        System.out.println(" 4. el caracter 3 del mensaje es "+conocercaracter +" - uso del charAt"); /* recordar que los caracteres
        empiezan a contarse en la posicion 0, es decirl HOLA H=0 O=1, L=2, A=3 por esa la respuesta aca es A
        */
        
        /*5.substring(int index) devuelve segun la posicion que deseas ver hasta el final, en este caso puse 5
        y lee MUNDO completo hasta el final, pero si hubiese puesto 8, leeria DO o pongo 2 envia a pantalla 
        LA MUNDO*/
        
        String submensaje;
                submensaje= mensaje.substring(5);
        System.out.println(" 5. la porcion de la cadena de mensaje es "+submensaje + " uso 1 del substring" );
       
        /*5.1, substring(int index, int index-1) devuelve segun la posicion que deseas ver hasta el final menos el ultimo caracter
        , en este caso puse 5 aqui es importante ver
               que el primer parametro indica la posicion del caracter desde donde va a leer y el segundo parametro
               es contando desde la posicion 0, las posiciones que devolvera ejemplos
               H O L A   M U N D O
               0  1 2 3 4 5  6 7  8  9
               partiendo de 5, leera desde la M y si digo en el segundo caracter 9 devolvera MUND   , porque no lee 
               la O  si quieres verlo como que lee desde la posicion 5 hasta antes de llegar a la 9, es decir llega hasta
               8 en el ejemplo en ingles dice -1 es como si le restaras a la posicion final -1, como dije hasta 9-1 lee 
               hasta la posicion 8*/
       
        
        String submensaje2;
         submensaje2= mensaje.substring(5,9);
         System.out.println("    5.1.la porcion de la cadena de mensaje es "+submensaje2 +" uso 2 del substring" );          
       
        /* 6. Replace (char oldchar, char newchar) empiezo a entender mas facil, lo que dice entre parentesis
        aqui quiere reemplazar el caracter viejo por el caracter nuevo pero en todo el mensaje*/
        
        String reemplazar; 
                reemplazar= mensaje3.replace("m", "p");
               System.out.println("6 el nuevo mensaje3 reemplazando el caracter "+reemplazar + " (uso replace)");          
       
        /* 6.1.Replace (charsequence , charsequence1) variante empiezo a entender mas facil, lo que dice entre parentesis
        aqui quiere reemplazar el caracter viejo por el caracter nuevo pero en todo el mensaje*/
        
               reemplazar= mensaje3.replace("ma", "pa");
               System.out.println("     6.1 el nuevo mensaje3 reemplazando los caracteres seguido "+reemplazar + " (uso replace variante)");          
        
         /* 7.ReplaceFirst (string old, string new)  reemplaza la primera frase que coincida por la otra*/
         
               reemplazar= mensaje3.replaceFirst("mama", "papa");
               System.out.println("7. el nuevo mensaje3 reemplazando una frase "+reemplazar + " (uso replaceFirst)");          
        
         
         /* 8. Replaceall (string old, string new)  no esta en la lista de la unidad pero es para ir entendiendo como va el 
               tema y reemplaza todas las frases iguales  que coincida por la otra*/      
            
         reemplazar= mensaje3.replaceAll("mama", "papa");
               System.out.println("8. el nuevo mensaje3 reemplazando todas la frases "+reemplazar + " (uso replaceall)");          
        
         
         /* 9. concat (string ) basicamente ayuda a unir caracteres o cadena de caracteres */      
  
         mensaje5 = mensaje4.concat("  PUEDO!!!");
         
         System.out.println("9.el nuevo mensaje concatenado es "+mensaje5);
        
         // 10. otra forma de unir es esta y me gusto pues es muy simple
         
         mensaje4 += mensaje6;
         
        System.out.println("10.Otra forma de unir o concatenar " +mensaje4);
         
    }
    
}
