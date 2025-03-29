import java.util.*;
public class ImplementQueue {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public void add(int x){
        st1.push(x);


    }
    // public int peek(){
    //     while(st1.size()>1){
    //        st2.push(st1.peek());
            
       
    //     }
    //     return st1.peek();
               
        
        
    // }
    // public int remove(){
    //     while(st1.size()>1){
    //         st2.push(st1.pop());

    //     }
    //     return st1.pop();

    // }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.peek());

    }
    
}
