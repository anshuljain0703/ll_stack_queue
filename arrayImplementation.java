public class arrayImplementation {
public static class Stack{
    int arr[]=new int[10];
    int idx=0;

    void push(int x){
        if(isFull()){
            System.out.println("Stack is Full!");
            return;
        }
        arr[idx++]=x;

    }
    int peek(){
        if(idx==0){
            System.out.println("Array is Empty!");
            return -1;
        }
      return arr[idx-1];

    }
    int pop(){
        if(idx==0){
            System.out.println("Array is Empty!");
            return -1;
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;

    }
    void display(){
      for(int i=0;i<=idx-1;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();

    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx==0){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(idx==arr.length){
            return true;
        }return false;
    }
    int capacity(){
        return arr.length;
    }

}
public static void main(String[] args) {
    Stack st=new Stack();
    st.push(4);
    st.push(5);
    st.push(1);
    
    st.display();
    st.pop();
    st.display();
  System.out.println( st.size()); 
  System.out.println(st.isEmpty());
  System.out.println(st.isFull());
}
}
