package com.iuhcoder.webserver.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author thanh
 *
 */
public class CPlusPlusCompiler implements IuhCoderCompiler{
	
	public static final String COMPILE_PATTERN = "g++ -o %out% %input%";
	public static final String TMP_DIR = "E:/TmpDir/";
	public static final String EXECUTE_DIR = "E://Execute/";

	@Override
	public boolean compileFromDirectory(String sourceCodeDir) throws IOException {
		// TODO Auto-generated method stub
		sourceCodeDir = sourceCodeDir.replace('\\','/');
		String fileName = sourceCodeDir.substring(sourceCodeDir.lastIndexOf('/')+1, sourceCodeDir.lastIndexOf('.'));
		String compileCommand = COMPILE_PATTERN;
		compileCommand = compileCommand.replace("%out%", EXECUTE_DIR + fileName);
		compileCommand = compileCommand.replaceAll("%input%", sourceCodeDir);
		Runtime runtime =Runtime.getRuntime();
		Process process = runtime.exec(compileCommand);
		BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
		String errorMess = stdError.readLine();
		if(errorMess!= null) {
			System.out.println("\nCompile ERROR!"
					+ "\n==================================\n");
			do {
				System.out.println(errorMess);
			}while((errorMess =  stdError.readLine()) != null);
			return false;
		}
		System.out.println("Compiled " + fileName + " to " + EXECUTE_DIR);
		return true;
	}

	@Override
	public boolean compileFromSourceCode(String sourceCode) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		String fileName = "C://Users/thanh/Desktop/demo.cpp";
		CPlusPlusCompiler compiler = new CPlusPlusCompiler();
		
			
	}
	
	
}
