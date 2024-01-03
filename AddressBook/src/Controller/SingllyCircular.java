package Controller;

public class SingllyCircular {
    public static void main(String[] args) {
        SingllyCircularLinkList list = new SingllyCircularLinkList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.display();
        System.out.println("****************************");
        list.insertLast(85);
        list.insertLast(80);
        list.insertLast(30);
        list.display();
        System.out.println("****************************");
        list.deleteFirst();
        list.display();
        System.out.println("****************************");
        list.deleteLast();
        list.display();
        System.out.println("*******************************");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.insertAtPos(10321,9);
        list.insertAtPos(15520,0);
        list.display();
        list.insertAtPos(21,1);
        list.display();
        list.insertAtPos(22,3);
        list.display();
        list.insertAtPos(33,7);
        list.display();
        System.out.println("*******************************");
        System.out.println("[count of linkedlist :: "+list.count()+"]");
        list.deleteAtPos(9);
        list.display();
        list.deleteAtPos(5);
        list.display();
        list.deleteAtPos(1);
        list.display();


    }
}

class SingllyCircularLinkList{
    public NodeC head;
    public NodeC tail;


    public void insertFirst(Integer data) {
        NodeC new1 = new NodeC();
        new1.data = data;
        new1.next = null;
        if (head == null && tail == null) {
            head = new1;
            tail=new1;
            new1.next=new1;
        }else {
            new1.next=head;
            head=new1;
            tail.next=head;
        }
    }

    public void insertLast(Integer data){
        NodeC new1 = new NodeC();
        new1.data=data;
        new1.next=null;
        if (head == null && tail == null){
            head=new1;
            new1.next=new1;
            tail=head;
        }else {
            NodeC temp = head;
            while(temp.next != tail.next){
                temp=temp.next;
            }
            temp.next=new1;
            tail=new1;
        }
    }

    public void deleteFirst(){
        if (head == null){
            return;
        }else {
            head=head.next;
            tail.next=head;
        }
    }

    public void deleteLast(){
        NodeC temp = head;

            if(head == null){
            return;
        }
            else if (head.next == head){
            this.deleteFirst();
        }else {
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = head;
                tail=temp;
            }
    }
    public void insertAtPos(Integer data,Integer pos){
        NodeC new1 = new NodeC();
        new1.data=data;
        new1.next=null;
        Integer count=count();
        if(pos <= 0 || pos > count+1){
            System.out.println("!!!! Invalid Input !!!!");
        } else if (pos==1) {
            this.insertFirst(data);
        } else if (pos == count+1) {
            this.insertLast(data);
        }else {
            NodeC temp = head;
            for (int i = 1; i < pos-1; i++) {
                temp=temp.next;
            }
            new1.next=temp.next;
            temp.next=new1;
        }
    }
    public void deleteAtPos(Integer pos){
        Integer count=count();
        if(pos <= 0 || pos > count){
            System.out.println("!!!! Invalid Input !!!!");
        }else if(pos == 1){
            this.deleteFirst();
        } else if (pos == count) {
            this.deleteLast();
        }else {
            NodeC temp=head;
            for (int i = 1; i < pos; i++) {
                temp=temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    public Integer count(){
        Integer count=0;
        NodeC temp = head;
        do{
            temp=temp.next;
            count++;
        }while (temp != tail.next);
        return count;
    }
    public void display(){
        NodeC temp = head;
        if (head == null && tail == null){return;}

        do{
            System.out.print("["+temp.data+"]-->");
            temp = temp.next;
        }while (temp !=tail.next );
        System.out.println("End");
    }

}
class NodeC <N>{
    public Integer data;
    public NodeC next;

    @Override
    public String toString() {
        return "NodeC{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}