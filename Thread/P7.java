import java.util.*;
import java.util.concurrent.*;
class CommonStack{
	static int stackCount = 0;
	static Stack commonStack = new Stack();
}
class Producer extends CommonStack implements Runnable{
	Integer x = 1;
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(i+". Producer produced : "+commonStack.push(x++)+", stack size : "+ ++stackCount);
		}
	}
	
}
class Consumer extends CommonStack implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
				System.out.println(i+". Consumer consumed : "+commonStack.pop()+", stack size : "+ --stackCount);
		}
	}
}


class Demo{
	public static void main(String[] args){
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
		try{
			Thread.currentThread().sleep(500);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Stack count : "+CommonStack.stackCount);		
	}
}
