package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectFB {

	public static void main(String[] args) {
		try {
			URL u=new URL("https://www.facebook.com");
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			System.out.println("Response code of "+u+"="+con.getResponseCode());
		} catch (IOException e) {
			
		}

	}

}
