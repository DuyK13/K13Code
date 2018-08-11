package com.iuhcoder.compiler;

import java.io.IOException;

public interface IuhCoderCompiler {

	/**
	 * 
	 * @param sourceCodeDir
	 * @return
	 * @throws IOException 
	 */
	public boolean compileFromDirectory(String sourceCodeDir) throws IOException;
	
	/**
	 * 
	 * @param sourceCode
	 * @return
	 * @throws IOException 
	 */
	public boolean compileFromSourceCode(String sourceCode) throws IOException;
	
	/**
	 * Get Execute directory
	 * @return
	 */
	public String getExecuteDir();
	
	/**
	 * Get execute file extension
	 * @return
	 */
	public String getExecuteFileExtension();
	
	/**
	 * Get execute file name
	 * @return
	 */
	public String getExecuteFileTmpName();
}
