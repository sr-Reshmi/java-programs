package java_pgms;

	class Thread1 implements Runnable{
		public void run() {
			  for(int i=1; i<=5; i++) {
				  System.out.println("thread running");
				  
			  }
		}
		 public static void main(String[] args) {
			 Thread1 th=new Thread1();
			 Thread t=new Thread(th);
			 t.start();
		 
		 }	 
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
