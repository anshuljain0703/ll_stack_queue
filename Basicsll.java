public class Basicsll{
  public  static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
      
    }
    public static void display(Node head){
       
        Node temp=head;
        if(head==null)  return;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }

       }

       public static void  displayRecursion(Node head){
        if(head==null) return;
        System.out.println(head.data);
      displayRecursion(head.next);

       }
       public static void displayReverse(Node head)
       {
        if(head==null) return;
       displayReverse(head.next);
       System.out.println(head.data);
       }
       public static int length(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
             size++;
            
        }
return size;
       }
    public static void main(String[] args) {
      
        Node a =new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println("Display by Iteration!");
        display(a);
        System.out.println("Display using Recursion!");
        displayRecursion(a);
        System.out.println("Reverse!");
        displayReverse(a);
        System.out.println("Size of LinkedList!");
        System.out.println(length(a));
    }
}