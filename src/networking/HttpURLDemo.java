package networking;


import java.net.*;
import java.util.*;

public class HttpURLDemo {
	public static void main(String  args[])  throws Exception
	{
		URL hp=new URL("http://www.google.com");
		
		HttpURLConnection hpcon=(HttpURLConnection) hp.openConnection();
		
		System.out.println("Requested method is "+hpcon.getRequestMethod());
		System.out.println("Response is  "+hpcon.getResponseCode());
		
		System.out.println("Respense message is "+hpcon.getResponseMessage());
		Map<String, List<String>> hdrmap=hpcon.getHeaderFields();
		Set<String> hdrfield=hdrmap.keySet();
		for(String k:hdrfield)
			System.out.println("Key: "+k+"  Value: "+hdrmap.get(k));
		
	}
}
