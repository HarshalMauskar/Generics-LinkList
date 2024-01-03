package Controller;

public class SinglyLL1 {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.insertFist(1);
        list.insertFist(2);
        list.insertFist(3);
        list.insertFist(4);
        list.insertFist(5);
        list.insertFist(6);

//        System.out.println("1");
        list.display();
//    list.DisplaySir();

        list.deleteLast();
        list.display();

        list.insertLast(55);
        list.display();

        list.deleteFirst();
        list.display();
        list.deleteFirst();
        list.display();
        System.out.println("*************************************************************");
        list.insertAtPos(1000,0);
//        list.display();

        list.insertAtPos(1000,1);
        list.display();


        list.insertAtPos(2000,5);
        list.display();

        list.insertAtPos(2000,2);
        list.display();

        System.out.println("*************************************************************");
        list.deleteAtPos(0);
//        list.display();

        list.deleteAtPos(1);
        list.display();


        list.deleteAtPos(6);
        list.display();

        list.deleteAtPos(2);
        list.display();

    }
}

class LinkedList1{
    public Node head;

    LinkedList1(){
        this.head=null;
    }

    public void insertFist(int no){
        Node newn = new Node();
        newn.data = no;
        newn.next = null;
        if (head == null){
            head = newn;
        }
        else {
            newn.next = head;
            head = newn;

        }

    }
    public void insertLast(int no){
        Node newn = new Node();
        newn.data = no;
        newn.next = null;
        if(head==null){
            head=newn;
        }else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next=newn;

        }
    }

    public int count(){
        int count=0;
        Node temp = head;

        while (temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void insertAtPos(int no,int pos){
        Node newn = new Node();
        newn.data = no;
        newn.next = null;
        int sizeOfLL = this.count();
        if (pos == 0){
            System.out.println("invalid position");
            return;
        }
        else if(pos == 1){
            this.insertFist(no);
            return;
        }
        else if(pos == sizeOfLL){
            this.insertLast(no);
            return;
        }
        else{
            Node temp = head;

            for (int  i = 1; i<pos-1;i++){

                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
        }
    }
    public void deleteAtPos(int pos){

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
            Node temp = head;

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
        Node temp = head;

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
        Node temp = head;
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

class Node1{
    public int data;
    public Node1 next;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                        '}';
    }
}