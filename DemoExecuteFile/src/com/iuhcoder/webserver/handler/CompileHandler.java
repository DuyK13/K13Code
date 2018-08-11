package com.iuhcoder.webserver.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iuhcoder.compiler.CPlusPlusCompiler;
import com.iuhcoder.compiler.model.ProgrammingLanguage;
import com.iuhcoder.executor.CPlusPlusExecutor;

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
		String input = req.getParameter("input");
		PrintWriter out = null;
		try {
			out = resp.getWriter();
			String type = ".cpp";
			switch (type) {
			case ".cpp":
			{
				CPlusPlusCompiler compiler = new CPlusPlusCompiler();
				boolean result = compiler.compileFromSourceCode(sourceCode);

				if(!result) {
					out.println("Compile Error!");
				}else {
					try {
						CPlusPlusExecutor executor = new CPlusPlusExecutor();
						String[] inputs = null;
						if(input != null) {
							inputs = input.split("\n");
						}
						StringBuilder executeResult = executor.execute(CPlusPlusCompiler.EXECUTE_DIR + CPlusPlusCompiler.TMP_NAME+".exe", inputs);
						System.out.println("Executed result: " + executeResult.toString());
						out.println(executeResult.toString());
					}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
						out.println("Execute Error");
					}
				}
			}
			break;
			case ".py" : {
				//add your compiler and executor here :D
			}
			break;
			default:
				out.println("Unsported Type");
				break;
			}


		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(out!=null)
				out.close();
		}

	}



}
