package client;
import java.io.*;
import java.net.Socket;


public class skyblue {
	private static ObjectOutputStream output;
	public static void main(String argv[]) throws Exception {
	
	 Socket clientSocket = new Socket("localhost", 5001);
	 output=new ObjectOutputStream(clientSocket.getOutputStream());
	 output.writeObject("8");
	 System.out.println(" connected sky");
	 System.out.println(" sending information to server");
	 System.out.println(" recieving from server");
	 output.writeObject("0");
	 output.writeObject("1");
		clientSocket.close();
	 } 
	
	
}