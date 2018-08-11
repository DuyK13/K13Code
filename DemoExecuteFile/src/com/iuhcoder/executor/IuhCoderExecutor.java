package com.iuhcoder.executor;

import java.io.IOException;

import javax.script.ScriptException;

public interface IuhCoderExecutor {
	
	/**
	 * Execute application file with inputs
	 * @param executeFile : File directory
	 * @param inputs : String array
	 * @return  : {@link StringBuilder}
	 * @throws IOException
	 * @throws ScriptException 
	 */
	public StringBuilder execute(String executeFile, String...inputs) throws IOException, ScriptException;

}
