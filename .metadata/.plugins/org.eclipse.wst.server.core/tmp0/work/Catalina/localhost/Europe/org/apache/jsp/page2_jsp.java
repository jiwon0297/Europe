/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2020-06-08 14:13:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t<title>page2</title>\r\n");
      out.write("\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/iconfont.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/slick/slick.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/slick/slick-theme.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/stylesheet.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/jquery.fancybox.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/bootstrap.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/magnific-popup.css\">\r\n");
      out.write("\t<!--        <link rel=\"stylesheet\" href=\"assets/css/bootstrap-theme.min.css\">-->\r\n");
      out.write("\t\r\n");
      out.write("\t<!--For Plugins external css-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/ssets/css/plugins.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<!--Theme custom css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!--Theme Responsive css-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/assets/css/responsive.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"assets/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Required meta tags -->\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\t<link rel=\"icon\" href=\"marine/img/favicon.png\">\r\n");
      out.write("\t<!-- animate CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"marine/css/animate.css\">\r\n");
      out.write("\t<!-- owl carousel CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"marine/css/owl.carousel.min.css\">\r\n");
      out.write("\t<!-- themify CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"marine/css/themify-icons.css\">\r\n");
      out.write("\t<!-- flaticon CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"marine/css/flaticon.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"marine/css/nice-select.css\">\r\n");
      out.write("\t<!-- font awesome CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"marine/css/magnific-popup.css\">\r\n");
      out.write("\t<!-- swiper CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"marine/css/slick.css\">\r\n");
      out.write("\t<!-- style CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"marine/css/style.css\">\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "recommend.jsp", out, false);
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section id=\"portfolio\" class=\"portfolio sections\">\r\n");
      out.write("\t<div class=\"container_fluid\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"head_title text-center\">\r\n");
      out.write("\t\t\t\t\t\t<h2>CHECK LIST</h2>\r\n");
      out.write("\t\t\t\t\t<div class=\"subtitle\">\r\n");
      out.write("\t\t\t\t\t\t여행 전 미리 확인하세요!\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"separator\"></div>\r\n");
      out.write("                  \r\n");
      out.write("\t\t\t\t\t<div class=\"section-top-border\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"section-top-border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<blockquote class=\"generic-blockquote\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4>필수 준비물 & 중요 서류</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"unordered-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>여권, 여권사본, 여권사진(2매)</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>비행기 티켓</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>비자</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>숙박, 교통 바우처</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>현금(환전)</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>카드(신용/체크)</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>국제 면허증</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>국제 학생증</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>필기도구</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</blockquote>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 mt-sm-30\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<blockquote class=\"generic-blockquote\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4>의류</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"unordered-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>상의</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>하의</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>속옷</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>양말</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>외투</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>모자</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>운동화</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>슬리퍼</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>잠옷</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</blockquote>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 mt-sm-30\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<blockquote class=\"generic-blockquote\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4>전자기기 & 주변기기</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"unordered-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>휴대폰</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>휴대폰 충전기</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>보조배터리</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>이어폰</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>유심</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>멀티탭</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>멀티어댑터</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>드라이기</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>고데기</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</blockquote>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"section-top-border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<blockquote class=\"generic-blockquote\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4>세면도구 & 위생용품</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"unordered-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>칫솔, 치약</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>샴푸, 린스</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>바디워시</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>비누</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>타올</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>클렌징폼/오일</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>세제, 섬유유연제</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>면봉</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>여성용품</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>손톱깎이</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>면도기</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</blockquote>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 mt-sm-30\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<blockquote class=\"generic-blockquote\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4>비상약</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"unordered-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>소화제</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>지사제</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>종합감기약</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>진통제</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>연고</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>일회용 밴드</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>멀미약</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>개인약</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>파스</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>비오킬</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</blockquote>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 mt-sm-30\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<blockquote class=\"generic-blockquote\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4>화장품</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"unordered-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>스킨, 로션</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>선크림</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>메이크업용품</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>헤어에센스</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>향수</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>빗</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>거울</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>마스크팩</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</blockquote>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div><!-- End off Head_title -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("\t\t<script src=\"resources/assets/js/vendor/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/js/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"resources/assets/js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/js/jquery.mixitup.min.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/js/jquery.masonry.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!--slick slide js -->\r\n");
      out.write("        <script src=\"resources/assets/css/slick/slick.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/css/slick/slick.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"resources/assets/js/plugins.js\"></script>\r\n");
      out.write("        <script src=\"resources/assets/js/main.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    <!-- jquery plugins here-->\r\n");
      out.write("\t<script src=\"marine/js/jquery-1.12.1.min.js\"></script>\r\n");
      out.write("\t<!-- popper js -->\r\n");
      out.write("\t<script src=\"marine/js/popper.min.js\"></script>\r\n");
      out.write("\t<!-- bootstrap js -->\r\n");
      out.write("\t<script src=\"marine/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- magnific js -->\r\n");
      out.write("\t<script src=\"marine/js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("\t<!-- swiper js -->\r\n");
      out.write("\t<script src=\"marine/js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<!-- masonry js -->\r\n");
      out.write("\t<script src=\"marine/js/masonry.pkgd.js\"></script>\r\n");
      out.write("\t<!-- masonry js -->\r\n");
      out.write("\t<script src=\"marine/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("\t<script src=\"marine/js/gijgo.min.js\"></script>\r\n");
      out.write("\t<!-- contact js -->\r\n");
      out.write("\t<script src=\"marine/js/jquery.ajaxchimp.min.js\"></script>\r\n");
      out.write("\t<script src=\"marine/js/jquery.form.js\"></script>\r\n");
      out.write("\t<script src=\"marine/js/jquery.validate.min.js\"></script>\r\n");
      out.write("\t<script src=\"marine/js/mail-script.js\"></script>\r\n");
      out.write("\t<script src=\"marine/js/contact.js\"></script>\r\n");
      out.write("\t<!-- custom js -->\r\n");
      out.write("\t<script src=\"marine/js/custom.js\"></script>\r\n");
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
