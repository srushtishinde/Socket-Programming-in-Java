package Socket;
//Client side for chat (save the file as Receivedata.java)
import java.io.*;
import java.net.*;
class Receivedata{
public static void main(String[] args)throws Exception
{
	DatagramSocket ds=new DatagramSocket(8080);
	byte[] b=new byte[1024];
	DatagramPacket dp=new DatagramPacket(b,1024);
	ds.receive(dp);
	String s=new String(dp.getData(),0,dp.getLength());
	System.out.println("---Connected---");
	System.out.println("Client: "+s);
	ds.close();
	}
}
