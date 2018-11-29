package homework;

public class ThreadTest {
	Init_de init = new Init_de();
	public ThreadTest() {
		Add ad1 = new Add(init);
		Decrease de1 = new Decrease(init);
		Add ad2 = new Add(init);
		Decrease de2 = new Decrease(init);
		Thread add1 = new Thread(ad1);
		Thread decrease1 = new Thread(de1);
		Thread add2 = new Thread(ad2);
		Thread decrease2 = new Thread(de2);
		add1.start();
		decrease1.start();
		add2.start();
		decrease2.start();
	}
	
	public static void main(String[] args) {
		new ThreadTest();
	}
}

class Init_de{
	int temp = 0;
}

class Add implements Runnable{
	Init_de init = new Init_de();
	
	public Add(Init_de init) {
		this.init = init;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			init.temp+=1;
			System.out.println(init.temp);
		}
	}
}

class Decrease implements Runnable{
	Init_de init = new Init_de();
	
	public Decrease(Init_de init) {
		this.init = init;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			init.temp-=1;
			System.out.println(init.temp);
		}
	}
}