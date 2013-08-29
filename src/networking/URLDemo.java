package networking;
import java.net.*;

public class URLDemo {
	public static void main(String args[]) throws Exception
	{
		URL hp=new URL("http://www.google.com/downloads");
		
		System.out.println("Protocol "+hp.getProtocol());
		System.out.println("Port "+hp.getPort());
		System.out.println("Host "+hp.getHost());
		System.out.println("File "+hp.getFile());
		System.out.println("Exit "+hp.toExternalForm());
	}
}
