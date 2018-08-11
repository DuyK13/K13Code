package com.iuhcoder.compiler.model;

public enum ProgrammingLanguage {
	
	CSHARP(".cs"),
	JAVA(".java"),
	C(".c"),
	C_PLUS_PLUS(".cpp"),
	PYTHON(".py"),
	UNSUPPORTED("Unsupported");
	
	private String extension;
	
	private ProgrammingLanguage(String extension) {
		this.extension = extension;
	}
	
	public String getExtension() {
		return this.extension;
	}
	
	/**
	 * Set {@link ProgrammingLanguage} from extension
	 * @param extension : programming language extension 
	 * @return {@link ProgrammingLanguage}
	 */
	public static ProgrammingLanguage setLanguageFromExtention(String extension) {
		switch (extension) {
		case ".cs":
			return ProgrammingLanguage.CSHARP;
		case ".java":
			return ProgrammingLanguage.JAVA;
		case ".cpp":
			return ProgrammingLanguage.C_PLUS_PLUS;
		case ".c":
			return ProgrammingLanguage.C;
		case ".py":
			return ProgrammingLanguage.PYTHON;
		default:
			return ProgrammingLanguage.UNSUPPORTED;
		}
	}

}
