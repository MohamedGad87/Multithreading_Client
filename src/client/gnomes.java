package client;
import java.io.*;
import java.net.Socket;


public class gnomes {
	private static ObjectOutputStream output;
	public static void main(String argv[]) throws Exception {
	
	 Socket clientSocket = new Socket("localhost", 5001);
	 output=new ObjectOutputStream(clientSocket.getOutputStream());
	 output.writeObject("9");// reference the gnomes thread
	 
	 for(int i=1; i<12; i++){
		 
	 System.out.println(" connected gnomes");
	 System.out.println(" sending information to server");
	 System.out.println(" recieving from server");
	
	 output.writeObject("0");
	
	 System.out.println("number "+i);
	 
	} 
	 clientSocket.close();
	 }
	
	
}