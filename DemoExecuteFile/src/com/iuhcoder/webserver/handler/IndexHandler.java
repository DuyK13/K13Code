package com.iuhcoder.webserver.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexHandler extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String HEADER = "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "  <head>\r\n" + 
            "  <title>Bootstrap Example</title>\r\n" + 
            "  <meta charset=\"utf-8\">\r\n" + 
            "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
            "  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n" + 
            "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n" + 
            "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n" + 
            "  </head>\n"
            + "<body>";
         
    public static String FOTTER = "</body>\n"
            + "</html>";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println(HEADER);
		//gen UI here
		out.println("<div class=\"container\">\r\n" + 
				"  <h2 class = \"bg-success\">IuhCoder Compiler </h2>\r\n" + 
				"  <p>(Phiên bản hiện tại đã hỗ trợ C++ và Python)</p>\r\n" + 
				"  <form>\r\n" + 
				"    <div class=\"form-group\">\r\n" + 
				"      <label for=\"comment\">Source code</label>\r\n" + 
				"      <textarea  spellcheck=\"false\" class=\"form-control\" rows=\"10\" id=\"sourceCode\"></textarea>\r\n" + 
				"    </div>\r\n" + 
				"  </form>\r\n" + 
				"  <form>\r\n" + 
				"    <div class=\"form-group\">\r\n" + 
				"      <label for=\"comment\">Input</label>\r\n" + 
				"      <textarea  spellcheck=\"false\" class=\"form-control\" rows=\"3\" id=\"input\"></textarea>\r\n" + 
				"    </div>\r\n" + 
				"  </form>\r\n" + 
				"  \r\n" + 
				"<select class=\"btn\" style=\"border: solid 1px blue\" id = \"language\">\r\n" + 
				"  <option value=\".cpp\">CPP</option>\r\n" + 
				"  <option value=\".c\">C</option>\r\n" + 
				"  <option value=\".java\">Java</option>\r\n" + 
				"  <option value=\".cs\">CSharp</option>\r\n" + 
				"  <option value=\".py\">Python</option>\r\n" + 
				"</select>\r\n" + 
				"  <input type = \"button\" onclick = \"compile()\" id = \"btnCompile\" class = \"btn btn-success\" value = \"Compile And Run\" />\r\n" + 
				"  <hr>\r\n" + 
				"  <form>\r\n" + 
				"    <div class=\"form-group\">\r\n" + 
				"      <label for=\"comment\">Console</label>\r\n" + 
				"      <textarea class=\"form-control\" rows=\"5\" id=\"console\"></textarea>\r\n" + 
				"    </div>\r\n" + 
				"  </form>\r\n" + 
				"</div>\r\n" + 
				"<!-- ======================= -->\r\n" + 
				"<script>\r\n" + 
				"\r\n" + 
				"function compile() {\r\n" + 
				"  var sourceCode = $('#sourceCode').val();\r\n" + 
				"  var inputValue = $('#input').val();\r\n" + 
				"  var languageType = $('#language').val();\r\n" + 
				"  $('#btnCompile').val('Compiling');\r\n" + 
				"  \r\n" + 
				"  $.post(\"http://localhost:9090/compile\",\r\n" + 
				"    {\r\n" + 
				"        source: sourceCode,\r\n" + 
				"        input: inputValue,\r\n" + 
				"        type : languageType\r\n" + 
				"    },\r\n" + 
				"    function(data, status){\r\n" + 
				"        $('#console').val(data.toString());\r\n" + 
				"        $('#btnCompile').val('Compile And Run');\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"</script>");
		
		out.println(FOTTER);
		if(out!= null)
			out.close();
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	

}
