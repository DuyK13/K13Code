package com.iuhcoder.compiler.utils;

import com.iuhcoder.compiler.model.ProgrammingLanguage;

public class ProgramingLanguageUtils {
	
	public static ProgrammingLanguage getLanguageByExtension(String extension) {
		switch (extension) {
		case ".cs":
			return ProgrammingLanguage.CSHARP;
		case ".java":
			return ProgrammingLanguage.JAVA;
		case ".c":
			return ProgrammingLanguage.C;
		case ".cpp":
			return ProgrammingLanguage.C_PLUS_PLUS;
		case ".py":
			return ProgrammingLanguage.PYTHON;
		default:
			return ProgrammingLanguage.UNSUPPORTED;
		}
	}
}
