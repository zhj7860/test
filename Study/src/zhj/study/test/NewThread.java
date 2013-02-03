package zhj.study.test;
import java.util.*;
import java.lang.*;

public class NewThread extends Thread {
	boolean suspendFlag ; 
	public NewThread(String threadName,ThreadGroup tgOb) {
		// TODO Auto-generated constructor stub
		super(tgOb,threadName);
		System.out.println("New Thread :"+this);
		suspendFlag = false;
		start();
		
		
	}
	
	public void run() {
		try{
			for(int i=500;i>0;i--){
				System.out.println(getName()+ ": " + i); 
				Thread.sleep(1000);
				synchronized (this) {
					while(suspendFlag){
						wait();
					}
				}
			}
		}
		catch(Exception e){
			System.out.println("Exception in "+" exiting."); 
		}
		System.out.println(getName()+" exiting.");
		
	}
	
	synchronized void myresume(){
		suspendFlag  = false;
		notify();
	}
}

  