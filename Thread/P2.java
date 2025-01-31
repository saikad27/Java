class ChildThread extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(getName());
		}
	}
}
class Demo{
	public static void main(String[] args){
		ChildThread ct1 = new ChildThread();
		ChildThread ct2 = new ChildThread();
		ChildThread ct3 = new ChildThread();
		
		ct1.start();
		ct2.start();
		ct3.start();

		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
