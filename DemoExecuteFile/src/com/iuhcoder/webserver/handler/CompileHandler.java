package com.iuhcoder.webserver.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompileHandler extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=UTF-8");
		String sourceCode =  req.getParameter("source");
		CPlusPlusCompiler compiler = new CPlusPlusCompiler();
		boolean result = compiler.compileFromDirectory(sourceCode);
		
		
		String compileResult = result == true ? "Compile OK" : "Compile Error"; 		
		
		PrintWriter out = resp.getWriter();
		out.println(compileResult);
		if(out!=null)
			out.close();
	}
	
	

}
