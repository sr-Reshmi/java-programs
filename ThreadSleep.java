package java_pgms;

public class ThreadSleep extends Thread{

	public void run() {
	for(int i=1; i<=20;i++) {
		if(i==11) {
			try {
				Thread.sleep(4000);
			}catch(InterruptedException ie) {
		}
		}
		System.out.println(i);
	
	}
}
	public static void main(String[] args) {
	       ThreadSleep th=new ThreadSleep();
	       th.start();
	
		
	}

}
