//package Stack;
import java.util.Stack;
public class DisplayStack {
    public static void reverseRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.println(top);
        reverseRec(st);
        st.push(top);
    }
    public static void DisplayRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
       
        DisplayRec(st);
        st.push(top);
        System.out.println(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseRec(st);
        

    //     Stack <Integer> rt=new Stack<>();
    //     while(st.size()>0){
    //         rt.push(st.pop());
    //     }
    //     while(rt.size()>0){
    //         int x=rt.pop();
    //         System.out.println(x);
    //         st.push(x);
    //     }
    //     System.out.println(st);

    //Array
    // int n=st.size();
    // int [] arr=new int[n];
    // for(int i=n-1;i>=0;i--){
    //     arr[i]=st.pop();
    // }
    // for(int i=0;i<n;i++){
    //     System.out.println(arr[i]+" ");
    //     st.push(arr[i]);
    // }
    // }
    
}
}

