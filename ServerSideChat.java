package Socket;
//Socket programming
//Server Side Chat
import java.io.*;
import java.net.*;
class ServerSideChat 
{
	public static void main(String[] args) throws IOException
	{	
		ServerSocket ss = new ServerSocket(5599);
		//establish connection and wait for the client
		Socket s = ss.accept();
		
		System.out.println("---The Client is connected!---");
		//returns the InputStream attached with this socket.
		DataInputStream ins = new DataInputStream(s.getInputStream());
		//returns the OutputStream attached with this socket.
		DataOutputStream dns = new DataOutputStream(s.getOutputStream());
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		String str1="",str2="";
		while(true)
		{
			str1 = ins.readUTF();
			System.out.println("Client: "+str1);
			str2 = bb.readLine();
			dns.writeUTF(str2);
			dns.flush();
		}
	}
}
