package Service;

import Interface.App;
import Model.Details;

import java.util.Scanner;

public class Editor implements App {
   private Scanner scanner = new Scanner(System.in);
    int v;
    Details user[];

    Details details;

    @Override
    public void insertDetails(){
        System.out.println("How much Bikes details you want to add");
        v = scanner.nextInt();
        user=new Details[v];
        for (int i = 0; i < user.length; i++) {
            details= new Details();
        System.out.println("Enter the Brand name");
        details.setBrandName(this.scanner.next());
        System.out.println("Enter the Bike Name");
        details.setBikeName(this.scanner.next());
        System.out.println("Enter the Model Name");
        details.setModelName(this.scanner.next());
        System.out.println("Enter the fuel type");
        details.setFuelType(this.scanner.next());
        System.out.println("Enter the Colour type");
        details.setColour(this.scanner.next());
        System.out.println("Enter the Mobile Number");
        details.setMobileNumber(this.scanner.next());
        user[i]=details;
        }
        System.out.println("Bikes details added");
    }

    @Override
    public void showDetails(){
        for (int i = 0; i < user.length ; i++) {
            System.out.println(user[i].toString());
        }
    }

    @Override
    public void editDetails(){
        System.out.println("which Bikes details you want to edit");
        int a= scanner.nextInt();
        int c=a-1;
        for (int i =c; i <a; i++) {
            details=user[c];
            System.out.println("Enter the Brand name");
            details.setBrandName(this.scanner.next());
            System.out.println("Enter the Bike Name");
            details.setBikeName(this.scanner.next());
            System.out.println("Enter the Model Name");
            details.setModelName(this.scanner.next());
            System.out.println("Enter the fuel type");
            details.setFuelType(this.scanner.next());
            System.out.println("Enter the Colour type");
            details.setColour(this.scanner.next());
            System.out.println("Enter the Mobile Number");
            details.setMobileNumber(this.scanner.next());
        }
        System.out.println("Bikes details edited");
    }

    @Override
    public void deleteDetails(){
        System.out.println("which Bikes details you want to Delete");
        int a= scanner.nextInt();
        int c=a-1;
        for (int i =c; i <a; i++) {
            details=user[c];
            details.setBrandName(null);
            details.setBikeName(null);
            details.setModelName(null);
            details.setFuelType(null);
            details.setColour(null);
            details.setMobileNumber(null);
        }
        System.out.println("Bikes details Deleted");
    }
}
