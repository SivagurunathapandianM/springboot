/*package com.java.examples;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Exchanger;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class RestApi {
	
	 public static void main( String[] args ){
	     System.out.println( "Starting Restpapi" );
	     try {
			HttpServer server = HttpServer.create(new InetSocketAddress(8080),0);
			
			server.createContext("api/greetings",(exchange -> {
				
				if("GET".equals(exchange.getRequestMethod())) {
	                String responseText = "Hello World! from our framework-less REST API\n";
	                exchange.sendResponseHeaders(200, responseText.getBytes().length);
	                OutputStream output = exchange.getResponseBody();
	                output.write(responseText.getBytes());
	                output.flush();
	            } 
				else {
	                exchange.sendResponseHeaders(405, -1);// 405 Method Not Allowed
	            }
	            exchange.close();	
			}));
			
			server.setExecutor(null); // creates a default executor
		    server.start();
		        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	 }

}
*/