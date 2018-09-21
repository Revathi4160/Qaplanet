package io;
import java.io.*;
public class FileinputstreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("E:\\mahesh.txt");
		int i=0;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
		}
	}

}
