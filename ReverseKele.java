import java.util.*;

public class ReverseKele {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
       
System.out.println("Enter k value:");
        int k=sc.nextInt();
        if(k<=0||k>q.size()){
            System.out.println("Invalid Input!");
            return;
        }
Stack<Integer> st=new Stack<>();
for(int i=0;i<k;i++){
    st.push(q.remove());
}
while(st.size()!=0){
    q.add(st.pop());

}
for(int i=0;i<q.size()-k;i++){
    q.add(q.remove());
}
System.out.println(q);


    }

}
