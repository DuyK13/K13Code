package com.iuhcoder.webserver;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

import com.iuhcoder.webserver.handler.CompileHandler;
import com.iuhcoder.webserver.handler.IndexHandler;

public class MainApp {
	
	public static void main(String[] args) throws Exception {
		new MainApp();
	}
	public MainApp() throws Exception {
		// TODO Auto-generated constructor stub
		Server server = new Server();
		ServerConnector connector = new ServerConnector(server);
		connector.setPort(9090);
		connector.setHost("localhost");
		server.setConnectors(new Connector[] {connector});
		ServletHandler handler = new ServletHandler();
		handler.addServletWithMapping(IndexHandler.class, "/");
		handler.addServletWithMapping(CompileHandler.class, "/compile");
		server.setHandler(handler);
	
		server.start();
		server.join();
	}
	
	
	
}
