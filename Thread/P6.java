class NewRunnable implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Hello-2");
		}	
	}
}
class Demo {
	public static void main(String[] args){
		NewRunnable runnable = new NewRunnable();
		Thread newThread = new Thread(runnable);
		newThread.start();
		for(int i=1;i<=5;i++){
			System.out.println("Hello-1");
		}
	}
}
