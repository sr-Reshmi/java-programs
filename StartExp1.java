package java_pgms;

 class StartExp1 extends Thread {

	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
	StartExp1 thread1=new StartExp1();
	thread1.start();
	
	}

}
