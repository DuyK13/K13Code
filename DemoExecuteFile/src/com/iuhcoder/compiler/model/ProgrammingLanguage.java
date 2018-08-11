package com.iuhcoder.compiler.model;

public enum ProgrammingLanguage {
	
	CSHARP(".cs"),
	JAVA(".java"),
	C(".c"),
	C_PLUS_PLUS(".cpp"),
	PYTHON(".py"),
	UNSUPPORTED("Unsupported");
	
	private String extension;
	
	ProgrammingLanguage(String extension) {
		this.extension = extension;
	}
	
	public String getExtension() {
		return this.extension;
	}

}
