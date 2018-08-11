package com.iuhcoder.executor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CPlusPlusExecutor implements IuhCoderExecutor{
	
	public static final String EXECUTE_COMMAND = "";
	
	public StringBuilder execute(String executeFile, String...inputs) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		Runtime runtime = Runtime.getRuntime();
		executeFile = executeFile.replace('\\', '/');
		System.out.println("Executing file: " + executeFile);
		Process process = runtime.exec(EXECUTE_COMMAND + executeFile);
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		OutputStream writer = process.getOutputStream();
		if(inputs!= null) {
			//write input to application
			for(String input : inputs) {
				writer.write((input+"\n").getBytes());
			}
		}
		writer.flush();
		writer.close();
		String out = reader.readLine();
		//get return data
		do {
			stringBuilder.append(out);
		}while((out = reader.readLine())!=null);
		reader.close();
		return stringBuilder;
	}
	
	public static void main(String[] args) throws IOException {
		CPlusPlusExecutor executor = new CPlusPlusExecutor();
		executor.execute("E://Execute/demo.exe");
	}
}
