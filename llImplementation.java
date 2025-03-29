import java.util.Stack;

public class llImplementation {
    // public static class Node {
    //     int val;
    //     Node next;
        
    //     Node(int val) {
    //         this.val = val;
    //     }
    // }
    
    // public static class CustomStack {
    //     Node head = null;
    //     int size = 0;

//         void push(int x) {
//             Node temp = new Node(x);
//             temp.next = head;
//             head = temp;
//             size++;
//         }

//         void display() {
//             Node temp = head;
//             while (temp != null) {
//                 System.out.print(temp.val + " ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }

//         int size() {
//             return size;
//         }

//         int pop() {
//             if (head == null) {
//                 System.out.println("Stack is Empty");
//                 return -1;
//             }
//             int x = head.val;
//             head = head.next;
//             size--;
//             return x;
//         }

//         int peek() {
//             if (head == null) {
//                 System.out.println("Stack is Empty");
//                 return -1;
//             }
//             return head.val;
//         }

//         boolean isEmpty() {
//             return head == null;
//         }

//         // Stack in this implementation is dynamically sized, so `isFull` is not applicable.
//         // However, I will include a placeholder for demonstration purposes.
//         boolean isFull() {
//             return false; // Linked list-based stack is never "full".
//         }
//     }

//     public static void main(String[] args) {
//         llImplementation llImpl = new llImplementation();
//         CustomStack st = new CustomStack();

//         st.push(2);
//         st.push(3);
//         st.push(4);
        
//         System.out.println("Stack size: " + st.size());
//         System.out.print("Stack elements: ");
//         st.display();
        
//         st.pop();
//         System.out.print("Stack after pop: ");
//         st.display();
        
//         System.out.println("Top element (peek): " + st.peek());
//         System.out.println("Is stack empty? " + st.isEmpty());
//         System.out.println("Is stack full? " + st.isFull());
//     }
// 
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public static class Stack{
    Node head=null;
    int size=0;
    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;

    }
    int peek(){
        if(head==null){
            System.out.println("Empty!");
            return -1;
        }
        return head.data;
    }
    int pop(){
        if(head==null){
            System.out.println("Empty!");
            return -1;
        }
        int x=head.data;
        head=head.next;
        return x;
    }
    void displayrec(Node h){
        if(h==null) return;
        displayrec(h.next);
        System.out.println(h.data+" ");
    }
    void display(){
    displayrec(head);

    }
    void displayRev(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

}
public static void main(String [] args){
      Stack st=new Stack();
    st.push(4);
    st.push(5);
    st.push(1);
    
    st.display();
    st.pop();
    st.display();
  System.out.println( st.size()); 


}
}

