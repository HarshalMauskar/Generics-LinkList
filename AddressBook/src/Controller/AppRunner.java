package Controller;

import Interface.App;
import Service.Editor;

import java.util.Scanner;

public class AppRunner {

    public static void main(String[] args) {

        boolean choice=true;
        App app =new Editor();
        Scanner scanner=new Scanner(System.in);
        while (choice==true) {
            System.out.println("======menu======\n" +
                    "1:Insert the data\n" +
                    "2:Show the data\n"+
                    "3:Edit the data\n"+
                    "4:Delete the data\n"+
                    "5:Exit the app");
            System.out.println("Select your option:");
            int value = scanner.nextInt();

            switch (value){
                case 1:
                    app.insertDetails();
                    break;
                case 2:
                    app.showDetails();
                    break;
                case 3:
                    app.editDetails();
                    break;
                case 4:
                    app.deleteDetails();
                    break;
                case 5:
                    choice=false;
            }
        }

    }
}
