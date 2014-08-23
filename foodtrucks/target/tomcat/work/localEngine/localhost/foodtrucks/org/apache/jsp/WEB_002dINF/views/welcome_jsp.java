package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/views/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../../assets/ico/favicon.png\">       <!-- Abiel: fix this -->\r\n");
      out.write("\r\n");
      out.write("    <title>Food Trucks | SF</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href='");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("' rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"../../assets/js/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"../../assets/js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href='");
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write("' rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("      html { height: 100% }\r\n");
      out.write("      body { height: 100%; margin: 0; padding: 0 }\r\n");
      out.write("      #map-canvas { height: 100% }\r\n");
      out.write("      #foodTruckPanel {position:absolute; margin-right: 100px; top: 5%; left: 70%; width: 450px; padding-left:20px; padding-right:20px; z-index:100; background-color:gray;height: 800px !important; overflow: scroll;}\r\n");
      out.write("    </style>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("      src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBX-yaWdHUBf09oEty4xSC3X22NsN7HleA\">\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      var truckMarkers = [new google.maps.LatLng(37.7951490737255,-122.422248184604),\r\n");
      out.write("                          new google.maps.LatLng(37.7911490737255,-122.426268184604),\r\n");
      out.write("                          new google.maps.LatLng(37.7921990737255,-122.429278184604)];\r\n");
      out.write("      \r\n");
      out.write("      function loadTruckMarkers(currentMap){\r\n");
      out.write("    \t  for(i=0; i<truckMarkers.length; i++){\r\n");
      out.write("    \t\t  var marker = new google.maps.Marker({\r\n");
      out.write("    \t            position: truckMarkers[i],\r\n");
      out.write("    \t            map: currentMap,\r\n");
      out.write("    \t            title: 'Hello World!'\r\n");
      out.write("    \t        });\r\n");
      out.write("    \t  }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function initialize() {\r\n");
      out.write("    \t  \r\n");
      out.write("        var mapOptions = {\r\n");
      out.write("          center: new google.maps.LatLng(37.7901490737255,-122.422258184604),\r\n");
      out.write("          zoom: 15\r\n");
      out.write("        };\r\n");
      out.write("        var map = new google.maps.Map(document.getElementById(\"map-canvas\"), mapOptions);\r\n");
      out.write("        loadTruckMarkers(map);\r\n");
      out.write("        \r\n");
      out.write("      }\r\n");
      out.write("      google.maps.event.addDomListener(window, 'load', initialize);\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div id=\"map-canvas\"></div>\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("  <div id=\"foodTruckPanel\">\r\n");
      out.write("\t<h2> &gt;&gt; Food Trucks </h2>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Search and button -->\r\n");
      out.write("\t<div class=\"input-group\">\r\n");
      out.write("      <input type=\"text\" class=\"form-control\">\r\n");
      out.write("      <span class=\"input-group-btn\">\r\n");
      out.write("        <button class=\"btn btn-default\" type=\"button\">Search</button>\r\n");
      out.write("      </span>\r\n");
      out.write("    </div><!-- /input-group -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t<div id=\"trial\"> \r\n");
      out.write("  \t</div>\r\n");
      out.write("    <table id=\"myTable\" class=\"table table-condensed\">\r\n");
      out.write("  \t\t<thead>\r\n");
      out.write("\t    \t<tr>\r\n");
      out.write("\t      \t\t<th>#</th>\r\n");
      out.write("\t      \t\t<th>Food Type | Name</th>\r\n");
      out.write("\t    \t</tr>\r\n");
      out.write("  \t\t</thead>\r\n");
      out.write("\t  \t<tbody>\r\n");
      out.write("\t      \t<tr>\r\n");
      out.write("\t        \t<td>Starting</td>\r\n");
      out.write("\t        \t<td> </td>\r\n");
      out.write("\t      \t</tr>\r\n");
      out.write("\t  \t</tbody>\r\n");
      out.write("  \t</table>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(null);
    // /WEB-INF/views/welcome.jsp(15,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue("/resources/css/bootstrap3/css/bootstrap.css");
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent(null);
    // /WEB-INF/views/welcome.jsp(24,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setValue("/resources/css/carousel.css");
    int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
      if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
    }
    return false;
  }
}
