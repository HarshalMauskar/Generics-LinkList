package Controller;

import java.util.Scanner;

public class SinglyLL1 {
    public void main() {
        LinkedList1 <Integer> list = new LinkedList1();
        Scanner scanner = new Scanner(System.in);
        Boolean choice = true;
        while(choice==true){
            System.out.println("======Menu======\n"+
                    "1:- To Insert first Value\n"+
                    "2:- To Insert last Value\n"+
                    "3:- To Display Value\n"+
                    "4:- To Delete First Value\n"+
                    "5:- To Delete Last Value\n"+
                    "6:- To Count Value\n"+
                    "7:- To Insert Value At Position\n"+
                    "8:- To Delete Value At position\n"+
                    "9:- To Exit");
            System.out.println("Select te Option:-");
            Integer input= scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter the Data");
                    list.insertFirst(scanner.nextInt());
                    System.out.println("Your Data is Added !!!");
                    break;
                case 2:
                    System.out.println("Enter the Data");
                    list.insertLast(scanner.nextInt());
                    System.out.println("Your Data is Added !!!");
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    list.deleteFirst();
                    System.out.println("Your data is deleted");
                    break;
                case 5:
                    list.deleteLast();
                    System.out.println("Your data is deleted");
                    break;
                case 6:
                    list.count();
                    break;
                case 7:
                    System.out.println("Enter the Data and position");
                    list.insertAtPos(scanner.nextInt(), scanner.nextInt());
                    System.out.println("Your Data is Added !!!");
                    break;
                case 8:
                    System.out.println("Enter the position");
                    list.deleteAtPos(scanner.nextInt());
                    System.out.println("Your data is deleted");
                    break;
                case 9:
                    choice = false;
                    break;
                default:
                    System.out.println("!!!! Invalid Choice !!!!");
            }

//        list.insertFist(1);
//        list.insertFist(2);
//        list.insertFist(3);
//        list.insertFist(4);
//        list.insertFist(5);
//        list.insertFist(6);
//
////        System.out.println("1");
//        list.display();
////    list.DisplaySir();
//
//        list.deleteLast();
//        list.display();
//
//        list.insertLast(55);
//        list.display();
//
//        list.deleteFirst();
//        list.display();
//        list.deleteFirst();
//        list.display();
//        System.out.println("*************************************************************");
//        list.insertAtPos(1000,0);
////        list.display();
//
//        list.insertAtPos(1000,1);
//        list.display();
//
//
//        list.insertAtPos(2000,5);
//        list.display();
//
//        list.insertAtPos(2000,2);
//        list.display();
//
//        System.out.println("*************************************************************");
//        list.deleteAtPos(0);
////        list.display();
//
//        list.deleteAtPos(1);
//        list.display();
//
//
//        list.deleteAtPos(6);
//        list.display();
//
//        list.deleteAtPos(2);
//        list.display();

    }

}

 class LinkedList1 <L>{
    public NodeS head;

    LinkedList1(){
        this.head=null;
    }

    public void insertFirst(L data){
        NodeS newn = new NodeS();
        newn.data = data;
        newn.next = null;
        if (head == null){
            head = newn;
        }
        else {
            newn.next = head;
            head = newn;

        }

    }
    public void insertLast(L data){
        NodeS newn = new NodeS();
        newn.data = data;
        newn.next = null;
        if(head==null){
            head=newn;
        }else {
            NodeS temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next=newn;
        }
    }

    public int count(){
        int count=0;
        NodeS temp = head;

        while (temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void insertAtPos(L data,Integer pos){
        NodeS newn = new NodeS();
        newn.data = data;
        newn.next = null;
        int sizeOfLL = this.count();
        if (pos == 0){
            System.out.println("invalid position");
            return;
        }
        else if(pos == 1){
            this.insertFirst(data);
            return;
        }
        else if(pos == sizeOfLL){
            this.insertLast(data);
            return;
        }
        else{
            NodeS temp = head;

            for (int  i = 1; i<pos-1;i++){

                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
        }
    }
    public void deleteAtPos(Integer pos){

        int sizeOfLL = this.count();
        if (pos == 0){
            System.out.println("invalid position");
            return;
        }
        else if(pos == 1){
            this.deleteFirst();
            return;
        }
        else if(pos == sizeOfLL){
            this.deleteLast();
            return;
        }
        else{
            NodeS temp = head;

            for (int  i = 1; i<pos-1;i++){

                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void deleteFirst(){
        if(head == null){
            return;
        }
        else {
            head=head.next;
        }
    }
    public void deleteLast(){
        NodeS temp = head;

        if(head == null){
            return;
        }
        else if (head.next == null){
            head = null;
            return;
        }

        while (temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void display(){
        NodeS temp = head;
        while (temp != null){
            System.out.print("["+temp.data+"]->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void DisplaySir(){
        System.out.println(head.toString());
    }

}

class NodeS <S>{
    public S data;
    public  NodeS next;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                        '}';
    }
}
}