/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2020-06-08 14:02:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t<title>Index</title>\r\n");
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
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar-collapse\">\r\n");
      out.write("\r\n");
      out.write("<div class='preloader'><div class='loaded'>&nbsp;</div></div>\r\n");
      out.write("\t<div class=\"culmn\">\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t<header id=\"main_menu\" class=\"header navbar-fixed-top\">            \r\n");
      out.write("                <div class=\"main_menu_bg\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"nave_menu\">\r\n");
      out.write("                                <nav class=\"navbar navbar-default\">\r\n");
      out.write("                                    <div class=\"container-fluid\">\r\n");
      out.write("                                        \r\n");
      out.write("                                        <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                                            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                                <li><a href=\"#home\">HOME</a></li>\r\n");
      out.write("                                                <li><a href=\"#history\">ABOUT US</a></li>\r\n");
      out.write("                                                <li><a href=\"#service\">SERVICE</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\t\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </header> \r\n");
      out.write("        <!--End of header -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- home -->\r\n");
      out.write("\t\t<section id=\"home\" class=\"home\">\r\n");
      out.write("                <div class=\"overlay\">\r\n");
      out.write("                    <div class=\"home_skew_border\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-12 \">\r\n");
      out.write("                                    <div class=\"main_home_slider text-center\">\r\n");
      out.write("                                        <div class=\"single_home_slider\">\r\n");
      out.write("                                            <div class=\"main_home wow fadeInUp\" data-wow-duration=\"500ms\">\r\n");
      out.write("                                                <h3>ADVANCED JAVA PROJECT</h3>\r\n");
      out.write("                                                <h1>RECORD OF TRAVEL</h1>\r\n");
      out.write("                                                <div class=\"separator\"></div>\r\n");
      out.write("                                                <p>1조 박지원 배정원 이승미</p>\r\n");
      out.write("                                                <div class=\"home_btn\">\r\n");
      out.write("                                                    <a href=\"main.jsp\" class=\"btn btn-default\">START</a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"scrooldown\">\r\n");
      out.write("                            <a href=\"#history\"><i class=\"fa fa-arrow-down\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section><!--End of home section -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- aboutus -->\r\n");
      out.write("\t\t<section id=\"history\" class=\"history sections\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"main_history\">\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <div class=\"single_history_img\">\r\n");
      out.write("                                    <img src=\"resources/assets/images/stab1.png\" alt=\"\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <div class=\"single_history_content\">\r\n");
      out.write("                                    <div class=\"head_title\">\r\n");
      out.write("                                        <h2>OUR HISTORY</h2>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <p>올해 초, 우리는 함께 유럽 여행을 다녀왔다.\r\n");
      out.write("                                    유럽 여행을 준비하면서 유럽 관광지에 대한 정보를 수집하는 중, 꽤 많은 정보들이 중복되었고 그로 인해 새로운 명소를 찾으려면 더 복잡하고 시간을 들여 자료를 수집해야 했다. \r\n");
      out.write("한 곳이 아닌 여러 페이지를 돌아다니면서 정보를 수집하다 보니 유럽이라는 긴 여행에 대해 준비하는 시간이 생각보다 오래 걸렸다. \r\n");
      out.write("흔히 올라와 있는 블로그들에 유럽의 색다른 관광지에 대한 정보는 많지 않았고, 실제로 유럽 여행 중에서도 특정 명소에만 사람이 너무 많거나 과장된 광고 정보로 인해 실망한 장소도 여럿 있었다.\r\n");
      out.write("요즘 사람들은 웹페이지 정보를 크게 중요시하고, 그 정보를 토대로 여행계획을 세운다. \r\n");
      out.write("이에 우리는 직접 여행을 준비하는 사람들에게 한 곳에서 많은 정보를 얻을 수 있는 여행정보 페이지를 생각하여 구현하게 되었다.\r\n");
      out.write("</p>\r\n");
      out.write("  \t                            </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!--End of row -->\r\n");
      out.write("                </div><!--End of container -->\r\n");
      out.write("            </section><!--End of history -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- service Section -->\r\n");
      out.write("            <section id=\"service\" class=\"service\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"main_service\">\r\n");
      out.write("                            <div class=\"col-md-6 col-sm-12 no-padding\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"single_service single_service_text text-right\">\r\n");
      out.write("                                    <div class=\"head_title\">\r\n");
      out.write("                                        <h2>OUR SERVICES</h2>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-md-12 col-sm-10 col-xs-10 margin-bottom-60\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-sm-10 col-sm-offset-1 col-xs-9 col-xs-offset-1\">\r\n");
      out.write("                                                    <article class=\"single_service_right_text\">\r\n");
      out.write("                                                        <h4>INFORMATION</h4>\r\n");
      out.write("                                                        <p>사용자들이 자신만의 리뷰를 올리는 공간. 각종 나라의 여행 후기나 일정, 여러팁들을 공유할 수 있습니다.</p>\r\n");
      out.write("                                                        <p>여기있는 정보만으로도 유럽여행 준비 한 번에 해결!</p>\r\n");
      out.write("                                                    </article>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-sm-1 col-xs-1\">\r\n");
      out.write("                                                    <figure class=\"single_service_icon\">\r\n");
      out.write("                                                        <i class=\"fa fa-heart\"></i>\r\n");
      out.write("                                                    </figure><!-- End of figure -->\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div><!-- End of col-sm-12 -->\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-md-12 col-sm-10 col-xs-10 margin-bottom-60\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-sm-10 col-sm-offset-1 col-xs-9 col-xs-offset-1\">\r\n");
      out.write("                                                    <article class=\"single_service_right_text\">\r\n");
      out.write("                                                        <h4>MARKET</h4>\r\n");
      out.write("                                                        <p>다양한 나라에서만 쓸 수 있는 남은 돈과 교통카드, 유심 등을 다른 사용자에게 나눔,교환,판매할 수 있습니다.</p>\r\n");
      out.write("                                                       \t<p>여행 하면서 사온 기념품들을 판매,나눔 등 여행을 준비하는 사람이 아니더라도 이용할 수 있어요!</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                    </article>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-sm-1 col-xs-1\">\r\n");
      out.write("                                                    <figure class=\"single_service_icon\">\r\n");
      out.write("                                                        <i class=\"fa fa-heart\"></i>\r\n");
      out.write("                                                    </figure><!-- End of figure -->\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div><!-- End of col-sm-12 -->\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-md-12 col-sm-10 col-xs-10 margin-bottom-60\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-sm-10 col-sm-offset-1 col-xs-9 col-xs-offset-1 margin-bottom-20\">\r\n");
      out.write("                                                    <article class=\"single_service_right_text\">\r\n");
      out.write("                                                        <h4>TOGETHER</h4>\r\n");
      out.write("                                                        <p>유럽에서는 함께 하면 가격이 훨씬 저렴해지는 경우가 생기기 때문에 동행을 구할 일이 많습니다</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>동행구하기 게시판을  통해 편하게 동행을 구해보세요!</p>\r\n");
      out.write("                                                    </article>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-sm-1 col-xs-1\">\r\n");
      out.write("                                                    <figure class=\"single_service_icon\">\r\n");
      out.write("                                                        <i class=\"fa fa-heart\"></i>\r\n");
      out.write("                                                    </figure><!-- End of figure -->\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div><!-- End of col-sm-12 -->\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"col-md-12 col-sm-10 col-xs-10 margin-bottom-60\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-sm-10 col-sm-offset-1 col-xs-9 col-xs-offset-1 margin-bottom-20\">\r\n");
      out.write("                                                    <article class=\"single_service_right_text\">\r\n");
      out.write("                                                        <h4>RECOMMEND</h4>\r\n");
      out.write("                                                        <p>직접 유럽여행을 다녀온 저희가 알려드리는 생생한 후기와 알짜배기 정보들이 모여있습니다</p>\r\n");
      out.write("                                                        <p>이 페이지에서만 알려드리는 유럽여행 꿀팁 대방출! 지금 확인해보세요</p>\r\n");
      out.write("                                                    </article>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-sm-1 col-xs-1\">\r\n");
      out.write("                                                    <figure class=\"single_service_icon\">\r\n");
      out.write("                                                        <i class=\"fa fa-heart\"></i>\r\n");
      out.write("                                                    </figure><!-- End of figure -->\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div><!-- End of col-sm-12 -->\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div><!-- End of col-sm-6 -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-6 col-sm-12 no-padding\">\r\n");
      out.write("                                <figure class=\"single_service single_service_img\">\r\n");
      out.write("                                    <div class=\"overlay-img\"></div>\r\n");
      out.write("                                    <img src=\"resources/assets/images/servicerightimg.jpg\" alt=\"\" />\r\n");
      out.write("                                </figure><!-- End of figure -->\r\n");
      out.write("                            </div><!-- End of col-sm-6 -->\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!-- End of row -->\r\n");
      out.write("                </div><!-- End of Container-fluid -->\r\n");
      out.write("            </section><!-- End of service Section -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>>\r\n");
      out.write("\t\r\n");
      out.write(" <!-- START SCROLL TO TOP  -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"scrollup\">\r\n");
      out.write("\t\t<a href=\"#\"><i class=\"fa fa-chevron-up\"></i></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"resources/assets/js/vendor/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"resources/assets/js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/jquery.mixitup.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/jquery.masonry.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!--slick slide js -->\r\n");
      out.write("\t<script src=\"resources/assets/css/slick/slick.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/css/slick/slick.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"resources/assets/js/plugins.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/main.js\"></script>\r\n");
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