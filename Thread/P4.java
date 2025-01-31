class ChildThread extends Thread{
	public void run(){
		System.out.println(getName());
		setName("Second Thread");
		System.out.println(getName());
	}
}
class Demo{
	public static void main(String[] args){
		ChildThread ct = new ChildThread();
		ct.start();
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("First Thread");
		System.out.println(Thread.currentThread().getName());
		
	}
}
