package com.lcj;

public class ProsumerPlus{
	Init init = new Init();
	BufferStack bufSta = new BufferStack(init);
	
	public ProsumerPlus() {
		Producer pro = new Producer(init,bufSta);
		Write wri = new Write(init,bufSta);
		Read rea = new Read(init,bufSta);
		Thread producer = new Thread(pro);
		Thread write = new Thread(wri);
		Thread read = new Thread(rea);
		producer.start();
		write.start();
		read.start();
	}
	
	public static void main(String[] args) {
		new ProsumerPlus();
	}	
}

class Init{
	int Top = 0;
	int i = 0;
	int j= 0;
	volatile int choice = 1;
	Object obj = new Object();
}

class BufferStack{
	int Top=0;
	int i=0;
	int j=0;
	Init init = new Init();
	int[] bufSta = new int[100];
	
	public BufferStack(Init init) {
		this.Top = init.Top;
		this.i = init.i;
		this.j = init.j;
	}
	
	public boolean pop() {
		if(Top<100) {
			Top++;
			System.out.println("增加第"+Top+"块缓冲区.");
			return true;
		}else {
			System.out.println("缓冲区已满！");
			return false;
		}
	}
	
	public boolean push() {
		if(Top>0) {
			Top--;
			return true;
		}else {
			System.out.println("缓冲区已空！");
			return false;
		}
	}
	
	public boolean Write() {
		if(i<Top) {
			bufSta[i]=Top;
			System.out.println("写入第"+Top+"个元素："+Top);
			i++;
			return true;
		}
		return false;
	}
	
	public boolean Read() {
		if(j<Top&&bufSta[j]!=0) {
			System.out.println("输出第"+(++j)+"个元素："+bufSta[j-1]);
			System.out.println("********************"
					+"******************************");
			return true;
		}
		return false;
	}
}

class Producer implements Runnable{
	Init init = new Init();
	BufferStack bufSta = new BufferStack(init);
	
	public Producer(Init init,BufferStack bufSta) {
		this.init = init;
		this.bufSta = bufSta;
	}
	
	public void run() {
		while(true) {
			if(init.choice==1) {
				synchronized(init.obj) {
					if(!bufSta.pop()) {
						try {
							init.choice = 3;
							System.out.println("********************"
									+"******************************");
							init.obj.notifyAll();
							init.obj.wait();
						}catch(Exception e) {
							e.printStackTrace();
						}
					}
					init.choice = 2;
					try {
						init.obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					init.obj.notifyAll();
				}
			}
		}
	}
}

class Write implements Runnable{
	Init init = new Init();
	BufferStack bufSta = new BufferStack(init);
	
	public Write(Init init,BufferStack bufSta) {
		this.init = init;
		this.bufSta = bufSta;
	}
	
	public void run() {
		while(true) {
			if(init.choice == 2) {
				synchronized(init.obj) {
					if(bufSta.Write()) {
						init.choice = 1;
						System.out.println("********************"
								+"******************************");
						init.obj.notifyAll();
					}
					try {
						init.obj.wait();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

class Read implements Runnable{
	Init init = new Init();
	BufferStack bufSta = new BufferStack(init);
	
	public Read(Init init,BufferStack bufSta) {
		this.init = init;
		this.bufSta = bufSta;
	}
	
	public void run() {
			while(true) {
				synchronized(init.obj) {
					if(!bufSta.Read()) {
						try {
							init.obj.wait();
						}catch(Exception e) {
							e.printStackTrace();
						}
					}
					init.obj.notifyAll();
				}
			}
		}		
}