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
 * @author Nabiya Fatima
 */
public class EquationsIT {
    Equations e;
    String str1="Invalid Range ";
    String str2="Equal Roots";
    String str3="Real Roots";
     String str4="Imaginary Roots";
    public EquationsIT() {
    }
   
    
    @Before
    public void setUp() {
          e = new Equations();
    }
    
    @After
    public void tearDown() {
        System.out.println("Function Tested successfully");
    }

    /**
     * Test of checkRoots method, of class Equations.
     */
    @Test
    public void testCheckRoots() {
        System.out.println("checkRoots");
        
        //Equations e = new Equations();
        int[] a={0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,1,1};
         int[] b={100,100,0,0,10,2,0,0,100,100,0,20,1,100,0,0,30,1};
         int[] c={201,1,201,0,201,-1,201,0,201,1,201,-1,202,100,202,100,201,201};
        boolean[] flag={false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false};
        
        for(int i=0;i<18;i++)
        {
            assertSame(str1,e.checkRoots(a[i], b[i], c[i],flag[i]) );
        }
      
    }

    @Test
    public void testforRealRoots() {
        System.out.println("checkRoots");
       
      assertSame(str3,e.checkRoots(1, 1, 0,true) );
      
    }
   @Test
    public void testforEqualRoots() {
        System.out.println("checkRoots");
        
      assertSame(str2,e.checkRoots(1, 0, 0,true) );
      
    }
    @Test
    public void testforValidEqualRoots() {
        System.out.println("checkRoots");
       
       assertSame(str4,e.checkRoots(1, 1, 1,true) );
      
    }
    
}
