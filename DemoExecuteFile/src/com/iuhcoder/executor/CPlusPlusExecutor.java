package com.iuhcoder.executor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CPlusPlusExecutor {
	
	public static final String EXECUTE_COMMAND = "";
	
	public StringBuilder execute(String executeFile) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		Runtime runtime = Runtime.getRuntime();
		executeFile = executeFile.replace('\\', '/');
		Process process = runtime.exec(EXECUTE_COMMAND + executeFile);
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String out = "";
		while((out = reader.readLine())!=null) {
			System.out.println(out);
		}
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
		writer.write(1+"\n");
		writer.flush();
		writer.close();
		reader.close();
		return stringBuilder;
	}
	
	public static void main(String[] args) throws IOException {
		CPlusPlusExecutor executor = new CPlusPlusExecutor();
		executor.execute("E://Execute/demo.exe");
	}
}
