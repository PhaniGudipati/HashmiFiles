package org.com.oops;

public class MultiThEx extends Thread{
	
	@Override
	public void run() {
//		try {
//			sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//		}
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("Hashmi");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getPriority());
		for(int j=0;j<=10;j++) {
			System.out.println("childThread");
		}
		
	}

	public static void main(String[] args) throws InterruptedException  {//0-10,5
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("Phani");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	
		MultiThEx ex=new MultiThEx();
		//Thread t=new Thread(ex);
		ex.start();
		//ex.sleep(5000);
		ex.join();
		
	for(int k=0;k<10;k++) {
		System.out.println("Parent Thread");//Thread scheduler
	}

	}

}
