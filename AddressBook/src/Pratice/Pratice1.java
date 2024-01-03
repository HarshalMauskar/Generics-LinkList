package Pratice;

import java.util.Scanner;

public class Pratice1 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1:Area of Square\n"+
                           "2:Area of Circle\n"+
                           "3:Area of Rectangular\n"+
                           "4:Area of Triangle");
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        Pratice1 pratice1 = new Pratice1();
        switch (a){
            case 1:pratice1.square();
            break;
            case 2:pratice1.circle();
            break;
            case 3:pratice1.rectangular();
            break;
            case 4:pratice1.triangle();
            break;
        }
    }
    public void square(){
        System.out.println("Enter the Length");
        double a= scanner.nextDouble();
        double area=a*a;
        System.out.println("Area of Square:-"+area);
    }
    public void circle(){
        System.out.println("Enter the Radius");
        double r=scanner.nextDouble();
        double area=3.14*r*r;
        System.out.println("Area of Square:-"+area);
    }
    public void rectangular(){
        System.out.println("Enter the Length");
        double l=scanner.nextDouble();
        System.out.println("Enter the Width");
        double w=scanner.nextDouble();
        double area=l*w;
        System.out.println("Area of Square:-"+area);
    }
    public void triangle(){
        System.out.println("Enter the Base");
        double b=scanner.nextDouble();
        System.out.println("Enter the Height");
        double h=scanner.nextDouble();
        double area=b*h;
        System.out.println("Area of Square:-"+area);
    }

}
