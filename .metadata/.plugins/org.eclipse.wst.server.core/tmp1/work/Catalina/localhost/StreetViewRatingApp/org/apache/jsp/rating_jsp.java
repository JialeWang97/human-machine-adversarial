/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2018-12-25 17:06:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rating_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
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

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>StreetViewRatingApp_HPSCIL@wangjiale</title>\r\n");
      out.write("\t<link href=\"css/rating.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <script src=\"lib/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("    <link href=\"lib/jquery-easyui-1.5.1/themes/material/easyui.css\" rel=\"stylesheet\" >\r\n");
      out.write("    <link href=\"lib/jquery-easyui-1.5.1/themes/icon.css\" rel=\"stylesheet\" >\r\n");
      out.write("    <link href=\"lib/jquery-easyui-1.5.1/themes/color.css\" rel=\"stylesheet\" >\r\n");
      out.write("    <script src=\"lib/jquery-easyui-1.5.1/jquery.easyui.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<img id=\"logo\" src=\"images/LOGO.png\">\r\n");
      out.write("        <h1>StreetViewRatingApp</h1>\r\n");
      out.write("        <p id=\"usr\">@username:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("        <p id=\"msg\">You have beening rated ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${number}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" images!</p>\r\n");
      out.write("     </div>\r\n");
      out.write("\t<img id=\"img\" src=\"/StreetViews/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imgUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("    <p id=\"location\">@Geo-Location:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${location}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("    <form action=\"");
      out.print(basePath);
      out.write("rating\" method=\"post\">\r\n");
      out.write("        <span style=\"top:25%\" class=\"category\">Wealthy:</span><div id=\"wealthyScore\" class=\"score\"><input name=\"wealthyScore\" class=\"easyui-slider\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pwealthyValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("            data-options=\"showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]\"></div>\r\n");
      out.write("        <span style=\"top:33%\" class=\"category\">Safely:</span><div id=\"safelyScore\" class=\"score\"><input name=\"safelyScore\" class=\"easyui-slider\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${psafelyValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("            data-options=\"showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]\"></div>\r\n");
      out.write("        <span style=\"top:41%\" class=\"category\">Lively:</span><div id=\"livelyScore\" class=\"score\"><input name=\"livelyScore\" class=\"easyui-slider\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plivelyValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("            data-options=\"showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]\"></div>\r\n");
      out.write("        <span style=\"top:49%\" class=\"category\">Beautiful:</span><div id=\"beautifulScore\" class=\"score\"><input name=\"beautifulScore\" class=\"easyui-slider\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pbeautifulValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("            data-options=\"showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]\"></div>\r\n");
      out.write("        <span style=\"top:57%\" class=\"category\">Boring:</span><div id=\"boringScore\" class=\"score\"><input name=\"boringScore\" class=\"easyui-slider\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pboringValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("            data-options=\"showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]\"></div>\r\n");
      out.write("        <span style=\"top:65%\" class=\"category\">Depression:</span><div id=\"depressionScore\" class=\"score\"><input name=\"depressionScore\" class=\"easyui-slider\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pdepressionValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("            data-options=\"showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]\"></div>\r\n");
      out.write("        <span style=\"top:72%\" class=\"category\">Operation:</span><div class=\"score\" style=\"top:72%\">\r\n");
      out.write("            <input type=\"submit\" value=\"Sure\" style=\"width: 100%;border-radius: 4px;\"/>\r\n");
      out.write("\t    </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <footer>Copyright @ 2018 [<span class=\"txt\">WangJiale</span>] Developer<br>High-Performance Spatial Computational Intelligence Lab, <span class=\"txt\">HPSCIL</span></footer>\r\n");
      out.write("\t<!-- \r\n");
      out.write("\tStreetViewRatingApp_HPSCIL@:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br/>\r\n");
      out.write("\t<img src=\"/StreetViews/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imgUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br/>\r\n");
      out.write("\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imgUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br/>\r\n");
      out.write("\treference value:wealthy:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pwealthyValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" safely:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${psafelyValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" lively:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${plivelyValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" beautiful:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pbeautifulValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" boring:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pboringValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" depression:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pdepressionValue}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br/>\r\n");
      out.write("\t<form action=\"");
      out.print(basePath);
      out.write("rating\" method=\"post\">\r\n");
      out.write("\t\tWealthy:\r\n");
      out.write("\t\t<input type=\"text\" name=\"wealthyScore\" /><br/> \r\n");
      out.write("\t\tSafely:\r\n");
      out.write("\t\t<input type=\"text\" name=\"safelyScore\" /><br/> \r\n");
      out.write("\t\tLively:\r\n");
      out.write("\t\t<input type=\"text\" name=\"livelyScore\" /><br/> \r\n");
      out.write("\t\tBeautiful:\r\n");
      out.write("\t\t<input type=\"text\" name=\"beautifulScore\" /><br/> \r\n");
      out.write("\t\tBoring:\r\n");
      out.write("\t\t<input type=\"text\" name=\"boringScore\" /><br/> \r\n");
      out.write("\t\tDepression:\r\n");
      out.write("\t\t<input type=\"text\" name=\"depressionScore\" /><br/>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"确认\" /><br/>\r\n");
      out.write("\t</form> \r\n");
      out.write("\t-->\r\n");
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
