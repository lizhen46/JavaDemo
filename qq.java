package io;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class qq {
	public void testGetLocalHost() throws UnknownHostException{
		InetAddress ADDRESS = InetAddress.getLocalHost();
		System.out.println(ADDRESS);
}
}