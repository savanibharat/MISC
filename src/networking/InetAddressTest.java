package networking;

import java.net.*;

class InetAddressTest  {
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress address=InetAddress.getLocalHost();
		System.out.println(address);
		address=InetAddress.getByName("google.com");
		System.out.println(address);
		
		InetAddress id[]=InetAddress.getAllByName("google.com");
		for(int i=0;i<id.length;i++)
			System.out.println(id[i]);
		
	}

}
