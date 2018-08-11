package com.iuhcoder.webserver.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iuhcoder.compiler.CPlusPlusCompiler;
import com.iuhcoder.compiler.IuhCoderCompiler;
import com.iuhcoder.compiler.PythonCompiler;
import com.iuhcoder.compiler.model.ProgrammingLanguage;
import com.iuhcoder.executor.CPlusPlusExecutor;
import com.iuhcoder.executor.IuhCoderExecutor;
import com.iuhcoder.executor.PythonExecutor;

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
		String type = req.getParameter("type");
		PrintWriter out = null;
		try {
			out = resp.getWriter();
			//set Programing Language from extension type
			ProgrammingLanguage languageType = ProgrammingLanguage.setLanguageFromExtention(type);
			IuhCoderCompiler compiler = null;
			IuhCoderExecutor executor = null;
			String[] inputs = null;
			if(input != null) {
				inputs = input.split("\n");
			}
			/**
			 * NOTE
			 * Your compiler and executor will be appended here. 
			 * Ex: You have a CSharpCompiler and a CSharpExecutor, add this block code into case SHARP
			 * {
			 *  	compiler = new CSharpCompiler();
					executor = new CSharpExecutor();
			 * }
			 */
			switch (languageType) {
			case C_PLUS_PLUS:
			{
				//add your compiler and executor for C++ here
				compiler = new CPlusPlusCompiler();
				executor = new CPlusPlusExecutor();
			}
			break;
			case C : {
				//add your compiler and executor for C here
			}
			break;
			case JAVA : {
				//add your compiler and executor for Java here
			}
			break;
			case CSHARP : {
				//add your compiler and executor for C# here
			}
			break;
			case PYTHON : {
				//add your compiler and executor for Python here
				compiler = new PythonCompiler();
				executor = new PythonExecutor();
				System.out.println("Python");
			}
			break;
			default:
				out.println("Unsported Type");
				out.close();
				return;
			}
			
			/**
			 * NOTE
			 * Business logic is process here.DO NOT modify if not sure what are you doing
			 */
			boolean compileResult = compiler.compileFromSourceCode(sourceCode);
			if(!compileResult) {
				out.println("Compile Error!");
			}else {
				try { 
					String  realExecuteFile = compiler.getExecuteDir() + compiler.getExecuteFileTmpName()+ compiler.getExecuteFileExtension();
					StringBuilder executeResult = executor.execute(realExecuteFile, inputs);
					System.out.println("Executed result: " + executeResult.toString());
					out.println(executeResult.toString());
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					out.println("Execute Error");
				}
			}

		}catch (Exception e) {
			// TODO: handle exception
			out.println("Sorry, our server have not suport this language yet! Comeback later");
			System.out.println("Server Error: " + e.getMessage());
		}finally {
			if(out!=null)
				out.close();
		}

	}



}
