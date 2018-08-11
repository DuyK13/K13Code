package com.iuhcoder.executor;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleScriptContext;

public class PythonExecutor implements IuhCoderExecutor{

	@Override
	public StringBuilder execute(String executeFile, String... inputs) throws IOException {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		StringWriter writer = new StringWriter(); //ouput will be stored here
		StringBuilder inputAsString = new StringBuilder();
		for(String input : inputs) {
			inputAsString.append(input).append("\n");
		}
		StringReader reader = new StringReader(inputAsString.toString());
	    ScriptEngineManager manager = new ScriptEngineManager();
	    ScriptContext context = new SimpleScriptContext();

	    context.setWriter(writer); //configures output redirection
	    context.setReader(reader);
	    ScriptEngine engine = manager.getEngineByName("python");
	    System.out.println("Executing " + executeFile + "...");
	    try {
	    	 engine.eval(new FileReader(executeFile), context);
	    }catch (Exception e) {
			// TODO: handle exception
	    	return result.append(e.getMessage());
		}
	   
	    
		return result.append(writer.toString());
	}
	
	/**
	 * For test only
	 * @param args
	 * @throws IOException
	 * @throws ScriptException
	 */
//	public static void main(String[] args) throws IOException, ScriptException {
//		PythonExecutor pythonExecutor = new PythonExecutor();
//		String[] s = new String[] {"7","8"};
//		System.out.println(pythonExecutor.execute("E://TmpDir/abc.py", s).toString());
//	}

}
