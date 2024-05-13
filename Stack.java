package question2;

public class Stack {
	   public int maxsize;
	   int t;
	   int value;
	   int[]star;
	   int val;
	   
	   public Stack( int size) {
		   this.maxsize=size;
		   this.star=new int [maxsize];
		   t=-1;
		   
		   
	   }
	   
	   public boolean  isEmpty() {
		    return (t==-1);
		   
	   }
	   public boolean isFull() {
		   return (t==maxsize -1);

	   }
	   
	   public void push(int value) {
		   if(isFull()) {
			   System.out.println("Stack overflow");
		   }
		   else {
			   ++t;
			   star[t]=value;
			   
		   }
		   
		  
			   
			   
			   
			   
		   }
	   public void peek() {
		   System.out.println(star[t]);
	   }
	   public void pop() {
		   if(isEmpty()) {
			   System.out.println("Stack underflow");
			   
		   }
		   else {
			   System.out.printf("the poped value[%d]\n",star[t]);
			   star[t]=0;
			   --t;
			   
		   }
		   
		   
	   }
	  public int index(int t) {
		  val=star[t];
		  return val;
		  
	  }
	  public void show() {
		  for (int i = 0; i < star.length; i++) {
			System.out.print(star[i]+" ");
			
		}
	  }
	   

}
