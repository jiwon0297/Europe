/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2020-06-08 12:34:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class KoreaMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <title>Martine</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"marine/img/favicon.png\">\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/css/bootstrap.min.css\">\r\n");
      out.write("    <!-- animate CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/css/animate.css\">\r\n");
      out.write("    <!-- owl carousel CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/css/owl.carousel.min.css\">\r\n");
      out.write("    <!-- themify CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/css/themify-icons.css\">\r\n");
      out.write("    <!-- flaticon CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/css/flaticon.css\">\r\n");
      out.write("    <!-- fontawesome CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/fontawesome/css/all.min.css\">\r\n");
      out.write("    <!-- magnific CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/css/magnific-popup.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/css/gijgo.min.css\">\r\n");
      out.write("    <!-- niceselect CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/css/nice-select.css\">\r\n");
      out.write("    <!-- slick CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/css/slick.css\">\r\n");
      out.write("    <!-- style CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"marine/css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!--top place start-->\r\n");
      out.write("    <section class=\"event_part section_padding\" style=\"background-image: url('marine/img/Korea.jpg'); background-size:cover; height:560px;\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"event_slider owl-carousel\">\r\n");
      out.write("                        <div class=\"single_event_slider\">\r\n");
      out.write("                            <div class=\"row justify-content-end\">\r\n");
      out.write("                                <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                                    <div class=\"event_slider_content\" style=\"opacity:0.8; background-color:#fff1d3\">\r\n");
      out.write("                                        <h5 style=\"font-size:14pt\">Korea</h5>\r\n");
      out.write("                                        <h2 style=\"color:black; font-size:25pt\">Korea</h2>\r\n");
      out.write("                                        <p style=\"color:gray; font-size:14pt\">Korea Detail\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn_1\">Plan Details</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single_event_slider\">\r\n");
      out.write("                            <div class=\"row justify-content-end\">\r\n");
      out.write("                                <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                                    <div class=\"event_slider_content\" style=\"opacity:0.8; background-color:#fff1d3\">\r\n");
      out.write("                                        <h5 style=\"font-size:14pt\">Korea</h5>\r\n");
      out.write("                                        <h2 style=\"color:black; font-size:25pt\">Korea</h2>\r\n");
      out.write("                                        <p style=\"color:gray; font-size:14pt\">Korea Detail\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn_1\">Plan Details</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single_event_slider\">\r\n");
      out.write("                            <div class=\"row justify-content-end\">\r\n");
      out.write("                                <div class=\"col-lg-6 col-md-6\">\r\n");
      out.write("                                    <div class=\"event_slider_content\" style=\"opacity:0.8; background-color:#fff1d3\">\r\n");
      out.write("                                        <h5 style=\"font-size:14pt\">Korea</h5>\r\n");
      out.write("                                        <h2 style=\"color:black; font-size:25pt\">Korea</h2>\r\n");
      out.write("                                        <p style=\"color:gray; font-size:14pt\">Korea Detail\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn_1\">Plan Details</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!--top place end-->\r\n");
      out.write("    <div style=\"background-color:#e6a76b;\">\r\n");
      out.write("    \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--::industries start::-->\r\n");
      out.write("    <section class=\"hotel_list section_padding\" style=\"background-color:#daa521;\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("                <div class=\"col-xl-6\">\r\n");
      out.write("                    <div class=\"section_tittle text-center\">\r\n");
      out.write("                        <h2 style=\"font-size:50pt; margin-top:-80px; color:#810102\">Korea</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("                    <div class=\"single_ihotel_list\">\r\n");
      out.write("                        <a href=\"KoreaInformationListViewAction.do\"><img src=\"marine/img/information.jpg\" alt=\"\"></a>\r\n");
      out.write("                        <div class=\"hotel_text_iner\">\r\n");
      out.write("                            <h3 style=\"font-size:23pt;\"><a href=\"KoreaInfoListViewAction.do\" style=\"color:darkred\"> Travel Information</a></h3>\r\n");
      out.write("                            <p style=\"font-size:13pt; color:white;\">You can share your experience and you can get the information, too</p><br>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"KoreaInformationListViewAction.do\"style=\"color:darkred\"><h5 style=\"text-align:right; font-size:13pt;\">>> Detail</h5></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("                    <div class=\"single_ihotel_list\">\r\n");
      out.write("                        <a href=\"KoreaMarketListViewAction.do\"><img src=\"marine/img/market.jpg\" alt=\"\"></a>\r\n");
      out.write("                        <div class=\"hotel_text_iner\">\r\n");
      out.write("                            <h3 style=\"font-size:23pt;\"><a href=\"KoreaMarketListViewAction.do\" style=\"color:darkred\"> Market</a></h3>\r\n");
      out.write("                            <p style=\"font-size:13pt; color:white;\">You can exchange your USIM, money etc. you can buy or sell, too.</p><br>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"KoreaMarketListViewAction.do\"style=\"color:darkred\"><h5 style=\"text-align:right; font-size:13pt;\">>> Detail</h5></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("                    <div class=\"single_ihotel_list\">\r\n");
      out.write("                        <a href=\"KoreaTogetherListViewAction.do\"><img src=\"marine/img/together.jpg\" alt=\"\"></a>\r\n");
      out.write("                        <div class=\"hotel_text_iner\">\r\n");
      out.write("                            <h3 style=\"font-size:23pt;\"><a href=\"KoreaTogetherListViewAction.do\" style=\"color:darkred\"> Together</a></h3>\r\n");
      out.write("                            <p style=\"font-size:13pt; color:white;\">You can find the traveler. And you can trip and eat with them.</p><br>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"KoreaTogetherListViewAction.do\" style=\"color:darkred\"><h5 style=\"text-align:right; font-size:13pt;\">>> Detail</h5></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div style=\"position: relative; left:95px; background-color:#daa521;\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "country.jsp", out, false);
      out.write("</div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!--::industries end::-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- jquery plugins here-->\r\n");
      out.write("    <script src=\"marine/js/jquery-1.12.1.min.js\"></script>\r\n");
      out.write("    <!-- popper js -->\r\n");
      out.write("    <script src=\"marine/js/popper.min.js\"></script>\r\n");
      out.write("    <!-- bootstrap js -->\r\n");
      out.write("    <script src=\"marine/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- magnific js -->\r\n");
      out.write("    <script src=\"marine/js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("    <!-- swiper js -->\r\n");
      out.write("    <script src=\"marine/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <!-- masonry js -->\r\n");
      out.write("    <script src=\"marine/js/masonry.pkgd.js\"></script>\r\n");
      out.write("    <!-- masonry js -->\r\n");
      out.write("    <script src=\"marine/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"marine/js/gijgo.min.js\"></script>\r\n");
      out.write("    <!-- contact js -->\r\n");
      out.write("    <script src=\"marine/js/jquery.ajaxchimp.min.js\"></script>\r\n");
      out.write("    <script src=\"marine/js/jquery.form.js\"></script>\r\n");
      out.write("    <script src=\"marine/js/jquery.validate.min.js\"></script>\r\n");
      out.write("    <script src=\"marine/js/mail-script.js\"></script>\r\n");
      out.write("    <script src=\"marine/js/contact.js\"></script>\r\n");
      out.write("    <!-- custom js -->\r\n");
      out.write("    <script src=\"marine/js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
