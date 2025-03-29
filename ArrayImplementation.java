//package Queue;

public class ArrayImplementation {
    public static class queueA{
        int f=-1;
        int r=-1;
        int size=0;
        int [] arr=new int[100];
         void add(int x){
            if(r==arr.length-1){
                System.out.println("Queue is Full!");
                return;
            }
            if(f==-1){
            f=r=0;
            arr[0]=r;

            } 
            else{
                arr[++r]=x;
               
            }
            size++;


         }
         int remove(){
            if(size==0){
                System.out.println("Empty!");
                return -1;
            }
            
            f++;
            size--;
            return arr[f-1];
         }
         int peek(){
            return arr[f];
         }
         void display(){
            if(size==0){
                System.out.println("Empty!");
            }
            for(int i=f;i<=r;i++){
                System.out.println(arr[f]);
            }
         }

    }
    public static void main(String[] args) {
        queueA q=new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
       q.display();
       q.peek();
       q.remove();

        
    }
    
}
