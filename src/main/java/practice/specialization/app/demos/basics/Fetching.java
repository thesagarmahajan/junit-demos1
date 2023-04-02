package practice.specialization.app.demos.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

public class Fetching {
	public String HttpFetch() {
		
		System.out.println("Fetching...!");
		try {
			URL url = new URL("https://api.rapidmock.com/mocks/89mEw"); 
	        
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");
	        conn.setRequestProperty("x-rapidmock-delay", "5000");
	        
	        if (conn.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
	        }
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
	        
	        String output = br.lines().collect(Collectors.joining());
	        	        
	        System.out.println(output);
	        
	        conn.disconnect();
	        
	        return output;
			
		} catch (Exception e) {
			// TODO: handle exception
			return "Exception";
		}

	}
}
