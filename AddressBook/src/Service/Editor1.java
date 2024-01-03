package Service;

import Interface.App1;
import Model.Details1;

import java.util.ArrayList;
import java.util.Scanner;

public class Editor1 implements App1 {
    ArrayList<Details1> arrayList=new ArrayList();

  Scanner scanner=new Scanner(System.in);

@Override
public void carAdd(){
    System.out.println("How much Car Details you want to Add");
    int v=scanner.nextInt();
    for (int i = 0; i <v; i++) {
        Details1 details1=new Details1();
    System.out.println("Enter the Car Name");
    details1.setCarName(this.scanner.next());
    System.out.println("Enter the Car Brand");
    details1.setCarBrand(this.scanner.next());
    System.out.println("Enter the Car Model");
    details1.setCarModel(this.scanner.next());
    System.out.println("Enter the Car FuelType");
    details1.setCarFuelType(this.scanner.next());
    System.out.println("Enter the Car Price");
    details1.setCarPrice(this.scanner.next());
    System.out.println("Enter the Car Colour");
    details1.setCarColour(this.scanner.next());
    System.out.println("Enter the CarNumber");
    details1.setCarNumber(this.scanner.next());
    System.out.println("Enter the ContactNumber");
    details1.setMobileNumber(this.scanner.next());
    arrayList.add(details1);
    }
}
@Override
public void showCarDetails(){
    for (int i = 0; i <arrayList.size(); i++) {
        System.out.println(arrayList.get(i).toString());
    }

}

@Override
public void editCarDetails(){
    System.out.println("Enter the value you want to Edit");
    int a=scanner.nextInt()-1;
    System.out.println("Enter the Car Name");
    arrayList.get(a).setCarName(this.scanner.next());
    System.out.println("Enter the Car Brand");
    arrayList.get(a).setCarBrand(this.scanner.next());
    System.out.println("Enter the Car Model");
    arrayList.get(a).setCarModel(this.scanner.next());
    System.out.println("Enter the Car FuelType");
    arrayList.get(a).setCarFuelType(this.scanner.next());
    System.out.println("Enter the Car Car Price");
    arrayList.get(a).setCarPrice(this.scanner.next());
    System.out.println("Enter the Car Car Colour");
    arrayList.get(a).setCarColour(this.scanner.next());
    System.out.println("Enter the Car CarNumber");
    arrayList.get(a).setCarNumber(this.scanner.next());
    System.out.println("Enter the Car Car ContactNumber");
    arrayList.get(a).setMobileNumber(this.scanner.next());
}

@Override
public void deleteCarDetails(){
    System.out.println("Enter the value you want to Edit");
    int a=scanner.nextInt()-1;
    arrayList.remove(a);
}
}
