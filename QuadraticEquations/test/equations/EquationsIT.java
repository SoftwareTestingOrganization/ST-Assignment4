/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nabiya

 */
public class EquationsIT {
    
    public EquationsIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of checkRoots method, of class Equations.
     */
    @Test
    public void testCheckRoots() {
        System.out.println("checkRoots");
        int a = 0;
        int b = 0;
        int c = 0;
        Equations e = new Equations();
        
        
        
        assertSame("Invalid Range ",e.checkRoots(0, 100, 201,false) );
        assertSame("Invalid Range ",e.checkRoots(0, 100, 1,true) );
        assertSame("Invalid Range ",e.checkRoots(0, 0, 201,false) );
        assertSame("Invalid Range ",e.checkRoots(0, 0, 0,true) );
        assertSame("Invalid Range ",e.checkRoots(1, 10, 201,false) );
      assertSame("Real Roots",e.checkRoots(1, 1, 0,true) );
       assertSame("Invalid Range ",e.checkRoots(1, 2, -1,false) );
       assertSame("Equal Roots",e.checkRoots(1, 0, 0,true) );
       
       
      assertSame("Invalid Range ",e.checkRoots(0, 0, 201,false) );
      assertSame("Invalid Range ",e.checkRoots(0, 0, 0,true) );
       assertSame("Invalid Range ",e.checkRoots(0, 100, 201,false) );
       assertSame("Invalid Range ",e.checkRoots(0, 100, 1,true) );
      assertSame("Invalid Range ",e.checkRoots(1, 0, 201,false) );
     assertSame("Imaginary Roots",e.checkRoots(1, 0, 100,true) );
       assertSame("Invalid Range ",e.checkRoots(1, 20, -1,false) );
       assertSame("Real Roots",e.checkRoots(1, 1, 0,true) );
       
       
       assertSame("Invalid Range ",e.checkRoots(0, 1, 202,false) );
      assertSame("Invalid Range ",e.checkRoots(0, 100, 100,true) );
       assertSame("Invalid Range ",e.checkRoots(0, 0, 202,false) );
       assertSame("Invalid Range ",e.checkRoots(0, 0, 100,true) );
      assertSame("Invalid Range ",e.checkRoots(1, 30, 201,false) );
     assertSame("Real Roots",e.checkRoots(1, 30, 100,true) );
       assertSame("Invalid Range ",e.checkRoots(1, 1, 201,false) );
       assertSame("Imaginary Roots",e.checkRoots(1, 1, 1,true) );
        
        
        
    }

    /**
     * Test of main method, of class Equations.
     */
   
    
}
