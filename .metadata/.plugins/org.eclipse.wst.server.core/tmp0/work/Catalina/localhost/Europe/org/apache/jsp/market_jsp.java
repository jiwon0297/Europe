/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2020-05-29 05:11:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class market_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("<title>market</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"jumbotron\" align=\"center\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<h1 class=\"display-3\">MARKET</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<table>\r\n");
      out.write("<tr><td width=\"100\" valign=\"top\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "category.jsp", out, false);
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("<td width=\"300\" valign=\"top\">\r\n");
  
	String userID = (String)session.getAttribute("userID");
	String userPW = (String)session.getAttribute("userPW");
   
  if (userID == null && userPW == null){
      out.write(" \r\n");
      out.write("    <br><br>\r\n");
      out.write("\t<a class=\"nav-link\" style=\"text-align:center; float:left;\">로그인을 해야만 글쓰기가 가능합니다.</a>\r\n");
      out.write("\t<a class=\"nav-link\" href=\"login.jsp?login=no\" role=\"button\" style=\"text-align:center;\">로그인 하러가기</a> \r\n");
      out.write("  ");
 
  }else{
      out.write(" \r\n");
      out.write("  \t<p><a href=\"MarketAddviewAction.do\" class=\"btn btn-primary\" role=\"button\">글쓰기</a></p>\r\n");
      out.write("  ");
 
  }
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" <form class=\"form-inline my-2 my-lg-0\" action=\"MarketSelectTitle.do\" method=\"POST\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"text\" name=\"title\" placeholder=\"Input String\">\r\n");
      out.write("      <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Title Search</button>\r\n");
      out.write(" </form>\r\n");
      out.write("<br><br>\r\n");
      out.write("<form action=\"content.jsp\" method=\"post\" style =\"margin:0 auto; width:1000px;\">\r\n");
      out.write("<div class=\"card mb-3\">\r\n");
      out.write("  <h3 class=\"card-header\">List(페이지가 아닌 마켓 전체 리스트)</h3>\r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <a href=\"content.jsp\" class=\"card-link\">제목1</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <a href=\"content.jsp\" class=\"card-link\">제목2</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"card-footer text-muted\">\r\n");
      out.write("    우선 리스트 끝\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" </form>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");

String mode = request.getParameter("mode");
if(mode == null || mode.isEmpty()) mode = "All";
else if (mode == "internal") mode = "internal";			// 국내
else if (mode == "UK") mode = "UK";						// 영국
else if (mode == "France") mode = "France";				// 프랑스
else if (mode == "Switzerland") mode = "Switzerland";	// 스위스
else if (mode == "Germany") mode = "Germany";			// 독일
else if (mode == "Czech") mode = "Czech";				// 체코
else if (mode == "Hungary") mode = "Hungary";			// 헝가리
else if (mode == "Austria") mode = "Austria";			// 오스트리아
else if (mode == "Italy") mode = "Italy";				// 이탈리아

      out.write("\r\n");
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
