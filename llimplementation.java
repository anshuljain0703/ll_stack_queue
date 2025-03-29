
public class llimplementation{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
   public static class queue{
    Node head=null;
    Node tail=null;
    int size=0;

    void add(int x){
        Node temp=new Node( x);
        if(size==0){
            tail=head=temp;
            
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;

    }
    int peek(){
        if(size==0){
            System.out.println("Empty!");
            return -1;
        }else{
            return head.data;
        }
       
    }
    int remove(){
        if(size==0){
            System.out.println("Empty!");
            return -1;
        }
        else{
            int x=head.data;
            head=head.next;
            size--;
            return x;
        }

    }

void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
    }

}
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
       System.out.println(q.remove());
    System.out.println(q.peek());


        
    }
}