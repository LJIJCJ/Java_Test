package homework;

public class Alternating {
	Init init = new Init();
	
	public Alternating() {
		AddPlus ad = new AddPlus(init);
		DecreasePlus de = new DecreasePlus(init);
		Thread add = new Thread(ad);
		Thread decrease = new Thread(de);
		add.start();
		decrease.start();
	}
	
	public static void main(String[] args) {
		new Alternating();
	}
}

class Init{
	int temp = 0;
	Object obj = new Object();
}

class AddPlus implements Runnable{
	Init init = new Init();
	
	public AddPlus(Init init) {
		this.init = init;
	}
	
	public void run() {
		while(true) {
			synchronized(init.obj) {
				if(init.temp>=5) {
					try {
						System.out.println("**************"
								+ "***********************");
						init.obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					init.temp++;
					System.out.println(init.temp);
					init.obj.notify();
				}
				
			}
		}
	}
}

class DecreasePlus implements Runnable{
	Init init = new Init();
	
	public DecreasePlus(Init init) {
		this.init = init;
	}
	
	public void run() {
		while(true) {
			synchronized(init.obj) {
				if(init.temp<=-5) {
					try {
						System.out.println("**************"
								+ "***********************");
						init.obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					init.temp--;
					System.out.println(init.temp);
					init.obj.notify();
				}
				
			}
		}
	}
}