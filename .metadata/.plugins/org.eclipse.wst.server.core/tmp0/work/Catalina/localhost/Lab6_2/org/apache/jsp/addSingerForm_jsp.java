/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2020-05-25 15:02:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addSingerForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>Add Singer</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 request.setCharacterEncoding("utf-8"); 
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("<br><br>\r\n");
      out.write("<div style=\"background-image: url('./resource/main.png'); width:100%;height:230px;\">\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<h1><strong>SINGER등록하기</strong></h1>\r\n");
      out.write("</div><br><br>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<form name=\"addSinger\" action=\"AddSingerElementAction.do\" method=\"post\">\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2\">번호</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"number\" class=\"form-control\" value=\"숫자로 입력해주세요.\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2\">분류</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"kind\" class=\"form-control\" value=\"SINGER라고 입력해주세요\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2\">성함</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"name\" class=\"form-control\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2\">나이</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"age\" class=\"form-control\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2\">성별</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t<select name=\"gender\">\r\n");
      out.write("\t\t\t\t<option value=\"\">성별선택</option>\r\n");
      out.write("\t\t\t\t<option value=\"남\">남</option>\r\n");
      out.write("\t\t\t\t<option value=\"여\">여</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2\">사는 지역</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"area\" class=\"form-control\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2\">경력사항</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t<textarea rows=\"5\" cols=\"50\" name=\"career\">300자 이내로 적어주세요</textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2\">자기소개</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t<textarea rows=\"5\" cols=\"80\" name=\"introduction\">500자 이내로 적어주세요</textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t \t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("\t\t\t<input type=\"submit\" class=\"btn btn-primary\" value=\"Add\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
