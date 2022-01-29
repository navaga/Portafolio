
package herencia;


public class Main {
    
    public static void main(String[] args)
    {   
        Main m =new Main();
        m.mostrarSerie();
            
        int a=0;
        int b=1;
        
           //0,1,1,2,3,5,8,
       
        System.out.print(a+","+b);
        for(int i =1;i<=4;i++)
        {
        a+=b;
        System.out.print(","+a);
        b+=a;
        System.out.print(","+b);
           
        
        }
        System.out.print("\n");
        int aa=0;
        int bb=1;
        int aux=0;
        for(int i=0;i<10;i++)
        {
         System.out.print(aa+",");
         aux = aa+bb;//5
         aa = bb;//2
         bb = aux;//3
        }
       
        
        ClaseHijaSuma suma =new ClaseHijaSuma();
        ClaseHijaResta resta =  new ClaseHijaResta();
        
        
        
        suma.IntroduceDatos();
        suma.suma();
        System.out.print("El resultado de la suma es: ");
        suma.Resultado();
        
        resta.IntroduceDatos();
        resta.resta();
        System.out.println("El resultado de la resta es: ");
        resta.Resultado();
        
        
    }
    
    int fibonacci(int n)
{
    if (n>1){
       return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
       
    }
    else if (n==1) {  // caso base
        return 1;
    }
    else if (n==0){  // caso base
        return 0;
    }
    else{ //error
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1; 
    }
}
    
    public void mostrarSerie(){
    
    for (int i = 0; i < 30; i++) {
        System.out.print(fibonacci(i)+" ");
    }
    System.out.println();
    
}
    
    
    
   
    
}
