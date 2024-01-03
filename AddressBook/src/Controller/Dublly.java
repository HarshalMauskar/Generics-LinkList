package Controller;

class Node2{
    public Integer data;
    public Node2 next;
    public Node2 perv;
}

class DubblyLinkList{
    private Node2 head;
    DubblyLinkList(){
        this.head = null;
    }
    public void insertFirst(Integer data){
        Node2 newNode =new Node2();
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
        Node2 temp = head;
        while (temp != null){
            System.out.print(" "+ temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void insertLast(Integer data){
        Node2 node2 = new Node2();
        node2.data=data;
        node2.next=null;
        node2.perv=null;
        if (head == null){
            this.insertFirst(data);
        }else {
            Node2 temp=head;
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
            Node2 temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.perv.next =null;
        }
    }

    public void insertAtPos(Integer data,Integer pos){
        Node2 node2 = new Node2();
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
            Node2 temp = head;
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
            Node2 temp = head;
            for (int i = 1; i < pos; i++) {
               temp=temp.next;
            }
            temp.next.perv = temp.perv;
            temp.perv.next = temp.next;
        }
    }

    public Integer count(){
        Node2 temp = head;
        Integer count=0;
        while (temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}

public class Dublly {
    public static void main(String[] args) {
    DubblyLinkList list = new DubblyLinkList();
        list.insertFirst(100);
        list.insertFirst(200);
        list.insertFirst(300);
        list.display();
        System.out.println("***********************");
        list.insertLast(300);
        list.insertLast(400);
        list.insertLast(500);
        list.display();

        System.out.println("***********************");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.deleteFirst();
        list.display();
        System.out.println("***********************");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.deleteLast();
        list.display();

        System.out.println("***********************");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.insertAtPos(1000,-1);
        list.insertAtPos(1000,0);
        list.insertAtPos(1000,6);
        list.insertAtPos(1000,5);
        list.display();
        list.insertAtPos(3000,1);
        list.display();
        list.insertAtPos(65566,3);
        list.display();
        System.out.println("***********************");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.deleteAtPos(-1);
        list.deleteAtPos(0);
        list.deleteAtPos(8);
        list.deleteAtPos(7);
        list.display();
        list.deleteAtPos(1);
        list.display();
        list.deleteAtPos(3);
        list.display();


    }
}
