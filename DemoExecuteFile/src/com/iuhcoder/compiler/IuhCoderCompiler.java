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
	 */
	public boolean compileFromSourceCode(String sourceCode);
}
