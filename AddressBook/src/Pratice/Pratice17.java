package Pratice;

import java.util.Scanner;

public class Pratice17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Car Price");
        double price= scanner.nextDouble();
        if (price<=500000) {
            double tax=0.05*price;
            System.out.println("Tax paid for Car Price:-"+tax);
        } else if (price>500000 && price<1000000) {
            double tax=0.1*price;
            System.out.println("Tax paid for Car Price:-"+tax);
        }else if (price>1000000) {
            double tax=0.2*price;
            System.out.println("Tax paid for Car Price:-"+tax);
        }
    }
}

