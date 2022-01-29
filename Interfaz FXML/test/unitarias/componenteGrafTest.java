/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author navag
 */
public class componenteGrafTest {
    
    public componenteGrafTest() {
    }
    
   

    /**
     * Test of supCircunferencia method, of class componenteGraf.
     */
    @Test
    public void testSupCircunferencia() {
        System.out.println("supCircunferencia");
        double r = 5;
        componenteGraf instance = new componenteGraf();
        double expResult = 78.54;
        double result = instance.supCircunferencia(r);
        assertEquals(result, expResult,expResult);
       
        
    }
    
}
