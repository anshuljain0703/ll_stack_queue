import java.util.*;
public class ImplementStack {
     Queue<Integer>q=new LinkedList<>();
     //Push efficient
    public void push(int x){
        q.add(x);
    }
    public int peek(){
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int x=q.peek();
       q.add(q.remove()) ;
        return x;

    }
    public int pop(){
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
      
         return q.remove();
     

    
    }

   
   //Pop efficient
  //  public void push(int x){
  //     if(q.size()==0) q.add(x);
  //     else{
  //       for(int i=0;i<=q.size();i++){
  //           q.add(q.remove());
  //       }
  //     }
    
  //   }
  //   public int pop(){
  //         return q.remove();
  //   }
    public static void main(String[] args) {
        ImplementStack st=new ImplementStack();
        st.push(1);
        st.push(2);
        st.push(3);
      
        System.out.println(st.pop());
        //System.out.println(st.peek());
        
    }
    
}
