import java.util.Stack;
public class basisOfStack{
    public static void main(String [] args){
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(8);
        st.push(9);
        st.push(10);
        System.out.println(st);
        st.pop();
        System.out.println(st);
      
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }

}