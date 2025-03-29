//package Queue;
import java.util.*;
public class basicsSTL{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();     
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
    //     System.out.println(q);
    //     q.remove();
    //  System.out.println(q);
    //  q.poll();
    //  System.out.println(q);
    //  System.out.println(q.peek());
    //  System.out.println(q.size());
    Queue<Integer> q1=new LinkedList<>();
    while(q.size()!=0){
        q1.add(q.remove());
    }
    System.out.println(q1);
    
    }

    
}
