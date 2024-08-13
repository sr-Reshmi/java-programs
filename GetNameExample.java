package java_pgms;

public class GetNameExample extends Thread {

	public void run()
	
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
	GetNameExample thread1=new GetNameExample();
	GetNameExample thread2=new GetNameExample();
	System.out.println("Name of thread1: "+ thread1.getName());
	thread2.setName("New Thread");
	System.out.println("Name of thread2: "+ thread2.getName());	
	System.out.println("Id of thread2: "+thread2.getId());		
	thread1.start();	
	thread2.start();		

	}

}	


