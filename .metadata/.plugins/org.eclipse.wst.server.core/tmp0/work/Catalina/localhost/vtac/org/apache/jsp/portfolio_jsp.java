/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-01-27 16:47:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class portfolio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1485456599038L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1485533208640L));
    _jspx_dependants.put("/include/freeEstimate.jsp", Long.valueOf(1485533580721L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>V.T.A.C</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/common.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    \n");
      out.write("    <link href=\"css/fonts/awesomeFont.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link href='css/portfolio.css' rel='stylesheet' type='text/css'>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("    \n");
      out.write("    .img-responsive.services{\n");
      out.write("    \twidth: 100%;\n");
      out.write("    \theight: 270px;\n");
      out.write("    \tmargin: 0 auto;\n");
      out.write("    \tmax-width: 400px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- Theme CSS -->\n");
      out.write("    <link href=\"css/agency.min.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <link href=\"css/timeline.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    \n");
      out.write("\t<style>\n");
      out.write("\t\timg.img-circle.img-responsive{\n");
      out.write("\t\theight: 156px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\" class=\"index\">\n");
      out.write("\n");
      out.write("<div class=\"freeEstimatOffer\" onclick=\"location.href='contact.jsp'\">\r\n");
      out.write("\t<h2>Free Estimate</h2>\r\n");
      out.write("\t<h4>Get your quote at no cost</h4>\r\n");
      out.write("\t<a href=\"contact.jsp\" style=\"color:white\">Click Here</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    \n");
      out.write("    ");
      out.write("<nav id=\"mainNav\" class=\"navbar navbar-default navbar-custom navbar-fixed-top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div class=\"navbar-header page-scroll\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span> Menu <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a href=\"index.jsp\">\r\n");
      out.write("                \t<img src=\"img/Logo_VTAC1.png\" id=\"vtacLogo\"/>\r\n");
      out.write("                </a>\r\n");
      out.write("<!--                 <a class=\"navbar-brand page-scroll\" href=\"#page-top\">Start Bootstrap</a> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"navbar-header page-scroll fulltime\">\r\n");
      out.write("\t            <h3>24 Hours Plumbing Service</h3>\r\n");
      out.write("\t            <h4>");
      out.print(com.vtac.parameters.Parameters.telephone );
      out.write("</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("            \t\r\n");
      out.write("            \r\n");
      out.write("            \t\r\n");
      out.write("\r\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li class=\"hidden\">\r\n");
      out.write("                        <a href=\"#page-top\"></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("<!--                     <li> -->\r\n");
      out.write("<!--                         <a class=\"page-scroll\" href=\"index.jsp#ourCompany\">Our Company</a> -->\r\n");
      out.write("<!--                     </li> -->\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"about.jsp\">Projects</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"portfolio.jsp\">Portfolio</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"contact.jsp\">Contact</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"gallery.jsp\">Gallery</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!--  <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"#team\">Team</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    -->\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.navbar-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container-fluid -->\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Header -->\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- About Section -->\n");
      out.write(" \n");
      out.write("    <section id=\"portfolio\" class=\"bg-light-gray\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <h2 class=\"section-heading\">Portfolio</h2>\n");
      out.write("                    <h3 class=\"section-subheading text-muted\">Some of our services</h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-6 portfolio-item\">\n");
      out.write("                        <img src=\"img/services/plumbing.jpg\" class=\"img-responsive services\" alt=\"\">\n");
      out.write("\n");
      out.write("                    <div class=\"portfolio-caption\">\n");
      out.write("                        <h4>General Plumbing</h4>\n");
      out.write("                        <p class=\"text-muted\">V.T.A.C</p>\n");
      out.write("\t\t\t\t\t<div class=\"portfolio-info\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>Sewer lines (new)</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Underground piping</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Rough in work</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Fixtures replacement and new installations</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Gas lines Gas fire places &amp; Grill</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Gas furnaces</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Water lines</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Water heaters</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Backflow preventer.</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Sump pump.</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-6 portfolio-item\">\n");
      out.write("                        <img src=\"img/services/sewer.jpg\" class=\"img-responsive services\" alt=\"\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"portfolio-caption\">\n");
      out.write("                        <h4>Storm, Water, Sewer, Utilities</h4>\n");
      out.write("                        <p class=\"text-muted\">V.T.A.C</p>\n");
      out.write("                        <div class=\"portfolio-info\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>Underground sewer, water line and to the main line</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Supply water fire service lines</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Sprinkler systems gardening</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Storm lines</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Snake & wet jet</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Trench drains</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Storm ceptors</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"col-md-4 col-sm-6 portfolio-item\">\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                        <img src=\"img/services/airConditioner.jpg\" class=\"img-responsive services\" alt=\"\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"portfolio-caption\">\n");
      out.write("                        <h4>Heating and Air Conditioning duct Work</h4>\n");
      out.write("                        <p class=\"text-muted\">V.T.A.C</p>\n");
      out.write("                        <div class=\"portfolio-info\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>New installation</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Troubleshooting</li>\n");
      out.write("\t\t\t\t\t\t\t<li>General Repair.</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Replacements-Gas furnaces &amp; Heat pumps</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Duct work</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-6 portfolio-item\">\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                        <img src=\"img/services/iron-gate.jpg\" class=\"img-responsive services\" alt=\"\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"portfolio-caption smallText\">\n");
      out.write("                        <h4>Decorative Iron Work</h4>\n");
      out.write("                        <p class=\"text-muted\">V.T.A.C</p>\n");
      out.write("\t\t\t\t\t<div class=\"portfolio-info\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>Welding shop</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Garden railings</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Hand rails</li>\n");
      out.write("\t\t\t\t\t\t\t<li>H/C iron work</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Iron fence work</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-6 portfolio-item\">\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                        <img src=\"img/services/concrete-wall.jpg\" class=\"img-responsive services\" alt=\"\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"portfolio-caption smallText\">\n");
      out.write("                        <h4>Concrete</h4>\n");
      out.write("                        <p class=\"text-muted\">V.T.A.C</p>\n");
      out.write("\t\t\t\t\t<div class=\"portfolio-info\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>All phases of concrete work</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Side walks</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Driveways</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Retaining walls</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Foundations</li>\n");
      out.write("\t\t\t\t\t\t\t<li>Pavers</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        ");
      out.write("<footer>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <span class=\"copyright\">Copyright &copy; VTAC inc. 2017</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <ul class=\"list-inline social-buttons\">\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"https://www.facebook.com/VTAC-Plumbing-HVAC-Utility-Contractor-122173147797883\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("<!--                 <div class=\"col-md-4\"> -->\r\n");
      out.write("<!--                     <ul class=\"list-inline quicklinks\"> -->\r\n");
      out.write("<!--                         <li><a href=\"#\">Privacy Policy</a> -->\r\n");
      out.write("<!--                         </li> -->\r\n");
      out.write("<!--                         <li><a href=\"#\">Terms of Use</a> -->\r\n");
      out.write("<!--                         </li> -->\r\n");
      out.write("<!--                     </ul> -->\r\n");
      out.write("<!--                 </div> -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </footer>");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Portfolio Modals -->\n");
      out.write("    <!-- Use the modals below to showcase details about your portfolio projects! -->\n");
      out.write("\n");
      out.write("    <!-- Portfolio Plumbing -->\n");
      out.write("    <div class=\"portfolio-modal modal fade\" id=\"portfolioModal1\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog modal-sm\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"close-modal\" data-dismiss=\"modal\">\n");
      out.write("                    <div class=\"lr\">\n");
      out.write("                        <div class=\"rl\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <!-- Project Details Go Here -->\n");
      out.write("                                <h2>General plumbing</h2>\n");
      out.write("                                <p class=\"item-intro text-muted\">V.T.A.C.</p>\n");
      out.write("                                <img class=\"img-responsive img-centered\" src=\"img/services/Rainy_Season.png\" alt=\"\">\t\n");
      out.write("                                \n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Sewer lines (new)</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Underground piping</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Rough in work</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Fixtures replacement and new installations</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Gas lines Gas fire places &amp; Grill</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Gas furnaces</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Water lines</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Water heaters</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Backflow preventer.</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Sump pump.</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\"><i class=\"fa fa-times\"></i> Close Project</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Portfolio Modal 2 -->\n");
      out.write("    <div class=\"portfolio-modal modal fade\" id=\"portfolioModal2\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"close-modal\" data-dismiss=\"modal\">\n");
      out.write("                    <div class=\"lr\">\n");
      out.write("                        <div class=\"rl\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <h2>Project Heading</h2>\n");
      out.write("                                <p class=\"item-intro text-muted\">Lorem ipsum dolor sit amet consectetur.</p>\n");
      out.write("                                <img class=\"img-responsive img-centered\" src=\"img/portfolio/startup-framework-preview.png\" alt=\"\">\n");
      out.write("                                <p><a href=\"http://designmodo.com/startup/?u=787\">Startup Framework</a> is a website builder for professionals. Startup Framework contains components and complex blocks (PSD+HTML Bootstrap themes and templates) which can easily be integrated into almost any design. All of these components are made in the same style, and can easily be integrated into projects, allowing you to create hundreds of solutions for your future projects.</p>\n");
      out.write("                                <p>You can preview Startup Framework <a href=\"http://designmodo.com/startup/?u=787\">here</a>.</p>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\"><i class=\"fa fa-times\"></i> Close Project</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Portfolio Modal 3 -->\n");
      out.write("    <div class=\"portfolio-modal modal fade\" id=\"portfolioModal3\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"close-modal\" data-dismiss=\"modal\">\n");
      out.write("                    <div class=\"lr\">\n");
      out.write("                        <div class=\"rl\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <!-- Project Details Go Here -->\n");
      out.write("                                <h2>Project Name</h2>\n");
      out.write("                                <p class=\"item-intro text-muted\">Lorem ipsum dolor sit amet consectetur.</p>\n");
      out.write("                                <img class=\"img-responsive img-centered\" src=\"img/portfolio/treehouse-preview.png\" alt=\"\">\n");
      out.write("                                <p>Treehouse is a free PSD web template built by <a href=\"https://www.behance.net/MathavanJaya\">Mathavan Jaya</a>. This is bright and spacious design perfect for people or startup companies looking to showcase their apps or other projects.</p>\n");
      out.write("                                <p>You can download the PSD template in this portfolio sample item at <a href=\"http://freebiesxpress.com/gallery/treehouse-free-psd-web-template/\">FreebiesXpress.com</a>.</p>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\"><i class=\"fa fa-times\"></i> Close Project</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Portfolio Modal 4 -->\n");
      out.write("    <div class=\"portfolio-modal modal fade\" id=\"portfolioModal4\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"close-modal\" data-dismiss=\"modal\">\n");
      out.write("                    <div class=\"lr\">\n");
      out.write("                        <div class=\"rl\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <!-- Project Details Go Here -->\n");
      out.write("                                <h2>Project Name</h2>\n");
      out.write("                                <p class=\"item-intro text-muted\">Lorem ipsum dolor sit amet consectetur.</p>\n");
      out.write("                                <img class=\"img-responsive img-centered\" src=\"img/portfolio/golden-preview.png\" alt=\"\">\n");
      out.write("                                <p>Start Bootstrap's Agency theme is based on Golden, a free PSD website template built by <a href=\"https://www.behance.net/MathavanJaya\">Mathavan Jaya</a>. Golden is a modern and clean one page web template that was made exclusively for Best PSD Freebies. This template has a great portfolio, timeline, and meet your team sections that can be easily modified to fit your needs.</p>\n");
      out.write("                                <p>You can download the PSD template in this portfolio sample item at <a href=\"http://freebiesxpress.com/gallery/golden-free-one-page-web-template/\">FreebiesXpress.com</a>.</p>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\"><i class=\"fa fa-times\"></i> Close Project</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Portfolio Modal 5 -->\n");
      out.write("    <div class=\"portfolio-modal modal fade\" id=\"portfolioModal5\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"close-modal\" data-dismiss=\"modal\">\n");
      out.write("                    <div class=\"lr\">\n");
      out.write("                        <div class=\"rl\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <!-- Project Details Go Here -->\n");
      out.write("                                <h2>Project Name</h2>\n");
      out.write("                                <p class=\"item-intro text-muted\">Lorem ipsum dolor sit amet consectetur.</p>\n");
      out.write("                                <img class=\"img-responsive img-centered\" src=\"img/portfolio/escape-preview.png\" alt=\"\">\n");
      out.write("                                <p>Escape is a free PSD web template built by <a href=\"https://www.behance.net/MathavanJaya\">Mathavan Jaya</a>. Escape is a one page web template that was designed with agencies in mind. This template is ideal for those looking for a simple one page solution to describe your business and offer your services.</p>\n");
      out.write("                                <p>You can download the PSD template in this portfolio sample item at <a href=\"http://freebiesxpress.com/gallery/escape-one-page-psd-web-template/\">FreebiesXpress.com</a>.</p>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\"><i class=\"fa fa-times\"></i> Close Project</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Portfolio Modal 6 -->\n");
      out.write("    <div class=\"portfolio-modal modal fade\" id=\"portfolioModal6\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"close-modal\" data-dismiss=\"modal\">\n");
      out.write("                    <div class=\"lr\">\n");
      out.write("                        <div class=\"rl\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <!-- Project Details Go Here -->\n");
      out.write("                                <h2>Project Name</h2>\n");
      out.write("                                <p class=\"item-intro text-muted\">Lorem ipsum dolor sit amet consectetur.</p>\n");
      out.write("                                <img class=\"img-responsive img-centered\" src=\"img/portfolio/dreams-preview.png\" alt=\"\">\n");
      out.write("                                <p>Dreams is a free PSD web template built by <a href=\"https://www.behance.net/MathavanJaya\">Mathavan Jaya</a>. Dreams is a modern one page web template designed for almost any purpose. Itâs a beautiful template thatâs designed with the Bootstrap framework in mind.</p>\n");
      out.write("                                <p>You can download the PSD template in this portfolio sample item at <a href=\"http://freebiesxpress.com/gallery/dreams-free-one-page-web-template/\">FreebiesXpress.com</a>.</p>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\"><i class=\"fa fa-times\"></i> Close Project</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/common.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script src=\"js/about.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugin JavaScript -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Contact Form JavaScript -->\n");
      out.write("    <script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("    <script src=\"js/contact_me.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Theme JavaScript -->\n");
      out.write("    <script src=\"js/agency.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
