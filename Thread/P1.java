class ChildThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}	
	
}
class Demo{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());
		ChildThread ct = new ChildThread();
		ct.start();
		 
	}
}
