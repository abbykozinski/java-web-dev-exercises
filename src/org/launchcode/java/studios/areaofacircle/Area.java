package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=3.14*(r*r) ;
        System.out.println("Area of Circle is: " + area);


        System.out.println("Enter the Diameter:");
        double d= s.nextDouble();
        double g= d/2;
        double areag=3.14*(g*g)  ;
        System.out.println("Area of the Circle is: " + areag);
    }
}

