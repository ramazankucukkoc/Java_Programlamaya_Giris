package threadingDemo;

public class KronometreThread implements Runnable {

	private Thread thread;
	private String threadName;

	public KronometreThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Oluşturuluyor" + threadName);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Çalıştırılıyor :" + threadName);
		try {
			for (int i = 0; i <= 10; i++) {
			System.out.println(threadName + " : " + i);
			Thread.sleep(1000);
		}
		} catch (InterruptedException exception) {
			// TODO: handle exception
			System.out.println("Kesildi : "+threadName);
		}
		System.out.println("Thread bitti : "+threadName);
		
	}
	public void start () {
		System.out.println("Thread nesnesi oluşuyor");
		if (thread ==null) {
			thread=new Thread(this,threadName);
			thread.start();
		}
	}

}
