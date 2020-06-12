/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equations;

import java.util.Scanner;

/**
 *
 * @author Nabiya
 */
public class Equations {

    public String checkRoots(int a,int b ,int c, boolean Range)
    {
        String str = null;
        int Disc=b*b-4*a*c;
        if(a!=0&&Disc==0&&Range==true)
        {
            str="Equal Roots";
        }
        else  if(a!=0&&Disc>0&&Range==true)
        {
            str="Real Roots";
        }
         else  if(a!=0&&Disc<0&&Range==true)
        {
            str="Imaginary Roots";
        } 
        else
         {
             str="Invalid Range ";
         }
        return str;
    }
    public static void main(String[] args) {
        
        Equations e=new Equations();
        int a,b,c;
        boolean flag=false;
        
        Equations q=new Equations();
         Scanner in = new Scanner(System.in);
            System.out.println("Enter the values of a ");
                a=in.nextInt();
                System.out.println("Enter the values of b ");
                b=in.nextInt();
                System.out.println("Enter the values of c ");
                c=in.nextInt();
                if(a>=0&&a<=200&&b>=0&&b<=200&&c>=0&&c<=200)
                {
                    flag=true;
                }
                
        System.out.println(e.checkRoots(a,b,c,flag));
    }
    
}
