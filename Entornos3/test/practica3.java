/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entornos3.Entornos3;
import org.junit.Assert;
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
public class practica3 {

    static Entornos3 entornos1;
    

    public practica3() {
    }

    @BeforeClass
    public static void setUpClass() {

        entornos1 = new Entornos3();

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //valor esperado, actual y diferencia permitida
    @Test
    public void pruebaValida() {
        
        Assert.assertEquals(1, entornos1.calificaciones(1, 1, true), 0);
        Assert.assertEquals(1, entornos1.calificaciones(1, 1, false), 0);
        

    }

    @Test
    public void pruebaNovalido() {

        Assert.assertEquals(-1, entornos1.calificaciones(-1, 1, true), 0);
        Assert.assertEquals(1, entornos1.calificaciones(1, 8, true), 0);
        Assert.assertEquals(8.5, entornos1.calificaciones(7, -1, true), 0);
        Assert.assertEquals(8.5, entornos1.calificaciones(7, 4, true), 0);

        //assertEquals(error, entornos1.calificaciones(7, 3, "texto"), 0);
        //no se puede probar por fallo del compilador
    }

}
