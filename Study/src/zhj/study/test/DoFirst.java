
package zhj.study.test;
import java.io.*;

public class DoFirst  
{
	
		
	public void Do() throws IOException
	{
		FileOutputStream outStr = new FileOutputStream("c:\\test2.txt"); 
		StringBuffer strBuf = new StringBuffer(); 
		strBuf.append( "中文字符测试！");
		outStr.write(strBuf.toString().getBytes("utf-8"));

		System.out.println(strBuf.toString().getBytes("utf-8"));
		
		FileInputStream inStr = new FileInputStream("c:\\test2.txt");
		byte test[] = new byte[1024];
		
		//数据清空
		strBuf.delete(0, strBuf.length()-1);
		
		while(inStr.read(test)!= -1)
		{
			strBuf.append(test);
			test = new byte[1024];
		}
		
		System.out.println(strBuf.toString().getBytes("utf-8"));
		
		System.in.read();
		
	}
	
	
	
}

