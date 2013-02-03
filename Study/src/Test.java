
import java.awt.FileDialog;
import java.io.IOException;

import zhj.study.test.DoFirst;

public class Test  {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//DoFirst first = new DoFirst(); 
		//first.Do();
		
		
		//initialize 5 runnable interface 
		HelloExe hello1 = new HelloExe();
		hello1.setIndex("1");
		HelloExe hello2 = new HelloExe();
		hello2.setIndex("2");
		HelloExe hello3 = new HelloExe();
		hello3.setIndex("3");
		HelloExe hello4 = new HelloExe();
		hello4.setIndex("4");
		HelloExe hello5 = new HelloExe();
		hello5.setIndex("5");		
		
		//start 5 threads  
		new Thread(hello1).start();
		new Thread(hello2).start();
		new Thread(hello3).start();
		new Thread(hello4).start();
		new Thread(hello5).start();
		
		
		
		
		
	}
	
}