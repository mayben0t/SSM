package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Base_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<title>layout 装饰公司信息管理系统（用户版） - Layui</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/wangxiao/css/layui.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"layui-layout-body\">\r\n");
      out.write("\t<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("\t\t<div class=\"layui-header\">\r\n");
      out.write("\t\t\t<div class=\"layui-logo\">装饰公司信息管理系统</div>\r\n");
      out.write("\t\t\t<!-- 头部区域（可配合layui已有的水平导航） -->\r\n");
      out.write("\t\t\t<ul class=\"layui-nav layui-layout-left\">\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\"><a href=\"\">控制台</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\"><a href=\"\">商品管理</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\"><a href=\"\">用户</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\"><a href=\"javascript:;\">其它系统</a>\r\n");
      out.write("\t\t\t\t\t<dl class=\"layui-nav-child\">\r\n");
      out.write("\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">邮件管理</a>\r\n");
      out.write("\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">消息管理</a>\r\n");
      out.write("\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">授权管理</a>\r\n");
      out.write("\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t</dl></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"layui-nav layui-layout-right\">\r\n");
      out.write("\t\t\t\t<li class=\"layui-nav-item\"><a href=\"javascript:;\"> <img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"http://t.cn/RCzsdCq\" class=\"layui-nav-img\"> 贤心\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<dl class=\"layui-nav-child\">\r\n");
      out.write("\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">基本资料</a>\r\n");
      out.write("\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">安全设置</a>\r\n");
      out.write("\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t</dl></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"layui-side layui-bg-black\">\r\n");
      out.write("\t\t\t<div class=\"layui-side-scroll\">\r\n");
      out.write("\t\t\t\t<!-- 左侧导航区域（可配合layui已有的垂直导航） -->\r\n");
      out.write("\t\t\t\t<ul class=\"layui-nav layui-nav-tree\" lay-filter=\"test\">\r\n");
      out.write("\t\t\t\t\t<!--<li class=\"layui-nav-item layui-nav-itemed\">-->\r\n");
      out.write("\t\t\t\t\t<!--<a class=\"\" href=\"javascript:;\">查看装饰业务/服务</a>-->\r\n");
      out.write("\t\t\t\t\t<!--<dl class=\"layui-nav-child\">-->\r\n");
      out.write("\t\t\t\t\t<!--<dd><a href=\"javascript:;\">列表一</a></dd>-->\r\n");
      out.write("\t\t\t\t\t<!--<dd><a href=\"javascript:;\">列表二</a></dd>-->\r\n");
      out.write("\t\t\t\t\t<!--<dd><a href=\"javascript:;\">列表三</a></dd>-->\r\n");
      out.write("\t\t\t\t\t<!--<dd><a href=\"\">超链接</a></dd>-->\r\n");
      out.write("\t\t\t\t\t<!--</dl>-->\r\n");
      out.write("\t\t\t\t\t<!--</li>-->\r\n");
      out.write("\t\t\t\t\t<li class=\"layui-nav-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/work/userselectAll\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"frame\">查看业务</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/stuff/userselectAll\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"frame\">查看材料</a></li>\r\n");
      out.write("\t\t\t\t\t<!--<li class=\"layui-nav-item\">-->\r\n");
      out.write("\t\t\t\t\t<!--<a href=\"javascript:;\">当前进行的业务</a>-->\r\n");
      out.write("\t\t\t\t\t<!--<dl class=\"layui-nav-child\">-->\r\n");
      out.write("\t\t\t\t\t<!--<dd><a href=\"javascript:;\">业务一</a></dd>-->\r\n");
      out.write("\t\t\t\t\t<!--<dd><a href=\"javascript:;\">业务二</a></dd>-->\r\n");
      out.write("\t\t\t\t\t<!--<dd><a href=\"\">业务三</a></dd>-->\r\n");
      out.write("\t\t\t\t\t<!--</dl>-->\r\n");
      out.write("\t\t\t\t\t<!--</li>-->\r\n");
      out.write("\t\t\t\t\t<li class=\"layui-nav-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/trans/selectbyuserid\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"frame\">业务汇款</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"layui-nav-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jump/connect\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"frame\">联系我们</a></li>\r\n");
      out.write("\t\t\t\t\t<!--<li class=\"layui-nav-item\"><a href=\"\">发布商品</a></li>-->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"layui-body\">\r\n");
      out.write("\t\t\t<!-- 内容主体区域 -->\r\n");
      out.write("\t\t\t<iframe name=\"frame\" frameborder=\"0\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 100%; height: 100%;\"></iframe>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--<div class=\"layui-footer\">-->\r\n");
      out.write("\t\t<!--&lt;!&ndash; 底部固定区域 &ndash;&gt;-->\r\n");
      out.write("\t\t<!--© layui.com - 底部固定区域-->\r\n");
      out.write("\t\t<!--</div>-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"/wangxiao/js/layui.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("    //JavaScript代码区域\r\n");
      out.write("    layui.use('element', function(){\r\n");
      out.write("        var element = layui.element;\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
