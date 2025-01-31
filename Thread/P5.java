class ChildThread extends Thread{
	ChildThread(String str){
		super(str);
	}
	public void run(){
		System.out.println(getName());
	}
}
class Demo{
	public static void main(String[] args){
		ChildThread ct = new ChildThread("Thread sai");
		ct.start();	
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("First Thread");
		System.out.println(Thread.currentThread().getName());
		
	}
}
