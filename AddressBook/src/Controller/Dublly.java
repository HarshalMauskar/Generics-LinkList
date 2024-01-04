package Controller;

import java.util.Scanner;

class NodeD <N>{
    public N data;
    public NodeD next;
    public NodeD perv;
}

class DubblyLinkList <D>{
    private NodeD head;
    DubblyLinkList(){
        this.head = null;
    }
    public void insertFirst(D data){
        NodeD newNode =new NodeD();
        newNode.next=null;
        newNode.perv=null;
        newNode.data=data;

        if (this.head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head.perv = newNode;
            head =newNode;
        }
    }
    public void display(){
        NodeD temp = head;
        while (temp != null){
            System.out.print(" "+ temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void insertLast(D data){
        NodeD node2 = new NodeD();
        node2.data=data;
        node2.next=null;
        node2.perv=null;
        if (head == null){
            this.insertFirst(data);
        }else {
            NodeD temp=head;
            while (temp.next != null){
                temp=temp.next;
            }
            temp.next = node2;
            node2.perv = temp;
        }
    }

    public void deleteFirst(){
        if(head == null){
            return;
        }else {
            head = head.next;
        }
    }

    public void deleteLast(){
        if (head == null){
            return;
        } else if (head.next == null) {
            this.deleteFirst();
            return;
        }else {
            NodeD temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.perv.next =null;
        }
    }

    public void insertAtPos(D data,Integer pos){
        NodeD node2 = new NodeD();
        Integer count=this.count();
        node2.data=data;
        node2.next=null;
        node2.perv=null;
        if (pos <= 0 || pos > count){
            System.out.println("!!!! Invalid Input !!!!");
        }
        else if (pos == 1){
            this.insertFirst(data);
        } else if (pos == count+1) {
            this.insertLast(data);
        }else {
            NodeD temp = head;
            for (int i = 1; i < pos-1; i++) {
                temp=temp.next;
            }
            node2.next=temp;
            node2.perv=temp.perv;
            node2.perv.next = node2;
            node2.next.perv = node2;
        }
    }

    public void deleteAtPos(Integer pos){
        Integer count=this.count();
        if (pos <= 0 || pos > count ){
            System.out.println("!!!! Invalid Input !!!!");
        }else if (pos == 1){
            this.deleteFirst();
            return;
        } else if (pos == count) {
            this.deleteLast();
            return;
        }else {
            NodeD temp = head;
            for (int i = 1; i < pos; i++) {
               temp=temp.next;
            }
            temp.next.perv = temp.perv;
            temp.perv.next = temp.next;
        }
    }

    public Integer count(){
        NodeD temp = head;
        Integer count=0;
        while (temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}

public class Dublly {
    public static void main() {
    DubblyLinkList <Integer>list = new DubblyLinkList();
        Scanner scanner = new Scanner(System.in);
        Boolean choice = true;
        while(choice==true) {
            System.out.println("======Menu======\n" +
                    "1:- To Insert first Value\n" +
                    "2:- To Insert last Value\n" +
                    "3:- To Display Value\n" +
                    "4:- To Delete First Value\n" +
                    "5:- To Delete Last Value\n" +
                    "6:- To Count Value\n" +
                    "7:- To Insert Value At Position\n" +
                    "8:- To Delete Value At position\n" +
                    "9:- To Exit");
            System.out.println("Select te Option:-");
            Integer input = scanner.nextInt();
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
//        list.insertFirst(100);
//        list.insertFirst(200);
//        list.insertFirst(300);
//        list.display();
//        System.out.println("***********************");
//        list.insertLast(300);
//        list.insertLast(400);
//        list.insertLast(500);
//        list.display();
//
//        System.out.println("***********************");
//        System.out.println("[count of linkedlist :: "+list.count()+"]");
//        list.deleteFirst();
//        list.display();
//        System.out.println("***********************");
//        System.out.println("[count of linkedlist :: "+list.count()+"]");
//        list.deleteLast();
//        list.display();
//
//        System.out.println("***********************");
//        System.out.println("[count of linkedlist :: "+list.count()+"]");
//        list.insertAtPos(1000,-1);
//        list.insertAtPos(1000,0);
//        list.insertAtPos(1000,6);
//        list.insertAtPos(1000,5);
//        list.display();
//        list.insertAtPos(3000,1);
//        list.display();
//        list.insertAtPos(65566,3);
//        list.display();
//        System.out.println("***********************");
//        System.out.println("[count of linkedlist :: "+list.count()+"]");
//        list.deleteAtPos(-1);
//        list.deleteAtPos(0);
//        list.deleteAtPos(8);
//        list.deleteAtPos(7);
//        list.display();
//        list.deleteAtPos(1);
//        list.display();
//        list.deleteAtPos(3);
//        list.display();

        }
    }
}
