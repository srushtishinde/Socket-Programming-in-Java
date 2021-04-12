package Socket;
//Socket programming 
//Client Side Chat
import java.io.*;
import java.net.*;
class ClientSideChat 
{
	public static void main(String[] args) throws IOException
	{
		/*client in socket programming must know IP address of Server and Port number*/
		//create instance of Socket class
		Socket s = new Socket("localhost",5599);
		
		System.out.println("---Connected to Server---");
		
		//returns the OutputStream attached with this socket.
		DataOutputStream dns = new DataOutputStream(s.getOutputStream());
		
		//returns the InputStream attached with this socket.
		DataInputStream ins = new DataInputStream(s.getInputStream());
		
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String str1 = bb.readLine();
			dns.writeUTF(str1);
			dns.flush();
			String str2 = ins.readUTF();
			System.out.println("Server: "+str2);
		}
	}
}
