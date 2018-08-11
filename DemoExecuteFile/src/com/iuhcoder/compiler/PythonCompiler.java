package com.iuhcoder.compiler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.iuhcoder.compiler.model.ProgrammingLanguage;

public class PythonCompiler implements IuhCoderCompiler {

	public static final String TMP_DIR = "E:/TmpDir/";
	public static final String TMP_NAME = "main";
	public static final String EXECUTE_DIR = "E://Execute/";
	public static final String EXECUTE_EXTENSION = ".py";
	
	@Override
	public boolean compileFromDirectory(String sourceCodeDir) throws IOException {
		// TODO Auto-generated method stub
		sourceCodeDir = sourceCodeDir.replace('\\', '/');
		//check file is exist
		boolean isExist = Files.exists(Paths.get(sourceCodeDir));
		if(!isExist)
			return false;
		//check is Python file
		String fileExtension = sourceCodeDir.substring(sourceCodeDir.lastIndexOf(".") , sourceCodeDir.length());
		return ProgrammingLanguage.setLanguageFromExtention(fileExtension).equals(ProgrammingLanguage.PYTHON);
	}

	@Override
	public boolean compileFromSourceCode(String sourceCode) throws IOException {
		// TODO Auto-generated method stub
		String fileName = EXECUTE_DIR + TMP_NAME + ProgrammingLanguage.PYTHON.getExtension();
		Path path = Paths.get(fileName);
		Files.write(path, sourceCode.getBytes());
		return true;
	}

	@Override
	public String getExecuteDir() {
		// TODO Auto-generated method stub
		return EXECUTE_DIR;
	}

	@Override
	public String getExecuteFileExtension() {
		// TODO Auto-generated method stub
		return EXECUTE_EXTENSION;
	}

	@Override
	public String getExecuteFileTmpName() {
		// TODO Auto-generated method stub
		return TMP_NAME;
	}
	
	/**
	 * Using for test
	 * @param args
	 * @throws IOException
	 */
//	public static void main(String[] args) throws IOException {
//		PythonCompiler compiler = new PythonCompiler();
//		System.out.println(compiler.compileFromDirectory("E://TmpDir/abc.py"));
//	}

}
