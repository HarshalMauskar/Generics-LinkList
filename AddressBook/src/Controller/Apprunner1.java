package Controller;

import Interface.App1;
import Service.Editor1;

import java.util.Scanner;

public class Apprunner1 {

    public static void main(String[] args) {
        boolean choice=true;
        Scanner scanner=new Scanner(System.in);
        App1 app1 =new Editor1();
        while (choice == true){
            System.out.println("======Menu======\n"+
                                "1:Add Car Details\n"+
                                "2:Show Car Details\n"+
                                "3:Edit Car Details\n"+
                                "4:Delete Car Details\n"+
                                "5:Exit");
            System.out.println("Select the option");
            int value= scanner.nextInt();
            switch (value){
                case 1:app1.carAdd();
                        break;
                case 2:app1.showCarDetails();
                        break;
                case 3:app1.editCarDetails();
                        break;
                case 4:app1.deleteCarDetails();
                        break;
                case 5:choice=false;
                        break;
                default:
                    System.out.println("Invalid choice!!!!!");
            }

        }
    }
}
