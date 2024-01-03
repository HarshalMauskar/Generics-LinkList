package Controller;

public class DubllyCircular {
    public static void main(String[] args) {
        DubllyLinkList1 <Integer>list = new DubllyLinkList1();
        list.insertFirst(100);
        list.insertFirst(200);
        list.insertFirst(300);
        list.display();
        System.out.println("********************************"+" InsertFirst End");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.insertLast(400);
        list.insertLast(500);
        list.insertLast(600);
        list.display();
        System.out.println("********************************"+" InsertLast End");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.deleteFirst();
        list.display();
        System.out.println("********************************"+" DeleteFirst End");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.deleteLast();
        list.display();
        System.out.println("********************************"+" DeleteLast End");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.insertAtPos(11135,96);
        list.insertAtPos(13254,0);
        list.insertAtPos(8976,9);
        list.display();
        list.insertAtPos(111,1);
        list.display();
        list.insertAtPos(222,6);
        list.display();
        list.insertAtPos(333,4);
        list.display();
        System.out.println("********************************"+" InsertAtPosition End");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.deleteAtPos(0);
        list.deleteAtPos(9);
        list.display();
        list.deleteAtPos(1);
        list.display();
        list.deleteAtPos(6);
        list.display();
        list.deleteAtPos(3);
        list.display();
        System.out.println("********************************"+" DeleteAtPosition End");
    }
}

class DubllyLinkList1 <D>{
   public NodeDC head;
   public NodeDC tail;

   DubllyLinkList1(){
       this.head=null;
       this.tail=null;
   }
   public void insertFirst(D data){
       NodeDC nodeD =new NodeDC();
       nodeD.Data=data;
       nodeD.next=null;
       nodeD.perv=null;
       if (this.head == null && this.tail == null) {
           nodeD.next=nodeD;
           nodeD.perv=nodeD;
           this.head=nodeD;
           this.tail=nodeD;
       }else if(head == tail){
           nodeD.next = head;
           nodeD.perv = head;
           head.next = nodeD;
           head.perv = nodeD;
           head=nodeD;
       }else {
           nodeD.next=head;
           nodeD.perv=tail;
           head.perv=nodeD;
           tail.next=nodeD;
           head=nodeD;
       }
   }

   public void insertLast(D data){
       NodeDC nodeDC = new NodeDC();
       nodeDC.Data=data;
       nodeDC.next=null;
       nodeDC.perv=null;
       if (head == null && tail == null) {
           this.insertFirst(data);
       }else {
           NodeDC temp = head;
           while (temp.next != tail.next){
               temp=temp.next;
           }
           temp.next=nodeDC;
           temp.perv=temp;
           tail=nodeDC;
       }
   }

   public void display(){
       NodeDC  temp = head;
       do {
           System.out.print("["+temp.Data+"]-->");
           temp=temp.next;
       }while (temp != tail.next);
       System.out.println("End");
   }

   public void deleteFirst(){
       if (head == null && tail == null) {
           return;
       } else  {
           head=head.next;
           head.perv=tail;
           tail.next=head;
       }
   }

   public Integer count(){
       NodeDC temp=head;
       Integer count=0;
       do {
           count ++;
           temp=temp.next;
       }while (temp != tail.next);
       return count;
   }

   public void deleteLast(){
       if (head == null && tail == null) {
            return;
       } else if (head == tail) {
           this.deleteFirst();
           return;
       }else {
           NodeDC temp = head;
           while(temp.next != tail){
               temp=temp.next;
           }
           temp.next=head;
           head.perv=temp;
           tail=temp;
       }
   }

   public void insertAtPos(D data,Integer pos){
       Integer count=this.count();
       NodeDC nodeDC = new NodeDC();
       nodeDC.next=null;
       nodeDC.perv=null;
       nodeDC.Data=data;
       if (pos <= 0 || pos > count+1){
           System.out.println("!!!! Invalid Input !!!!");
       } else if (pos == 1) {
          this.insertFirst(data);
          return;
       } else if (pos == count+1) {
           this.insertLast(data);
           return;
       }else {
           NodeDC temp = head;
           for (int i = 1; i < pos-1; i++) {
               temp=temp.next;
           }
           nodeDC.next=temp.next;
           nodeDC.perv=temp.perv.next;
           temp.next=nodeDC;
           temp.perv.next=nodeDC;
       }
   }

   public void deleteAtPos(Integer pos){
       Integer count = this.count();
       if (pos <= 0 || pos > count ) {
           System.out.println("!!!! Invalid Input !!!!");
       } else if (pos == 1) {
           this.deleteFirst();
           return;
       } else if (pos == count) {
           this.deleteLast();
           return;
       }else {
           NodeDC temp = head;
           for (int i = 1; i < pos-1; i++) {
               temp=temp.next;
           }
           temp.next=temp.next.next;
           temp.next.perv=temp;
       }
   }
}
class NodeDC <N>{
    public N Data;
    public NodeDC next;
    public NodeDC perv;

}
