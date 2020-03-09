package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class connect_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>layui</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/wangxiao/css/layui.css\"  media=\"all\">\r\n");
      out.write("    <link href=\"/wangxiao/bootstrap-3.3.7-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 30px;\">\r\n");
      out.write("    <legend>联系我们</legend>\r\n");
      out.write("</fieldset>\r\n");
      out.write("\r\n");
      out.write("<div class=\"layui-carousel col-md-offset-2\" id=\"test1\" lay-filter=\"test1\">\r\n");
      out.write("    <div carousel-item=\"\">\r\n");
      out.write("        <div><img src=\"/wangxiao/images/connect/connect4.png\"/></div>\r\n");
      out.write("        <div><img src=\"/wangxiao/images/connect/connect5.png\"/></div>\r\n");
      out.write("        <div><img src=\"/wangxiao/images/connect/connect6.png\"/></div>\r\n");
      out.write("        <!--<div>条目4</div>-->\r\n");
      out.write("        <!--<div>条目5</div>-->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-offset-6\">\r\n");
      out.write("    <h4>联系电话：187xxxx5752</h4>\r\n");
      out.write("    <h4>QQ：5941xxx36</h4>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--<div class=\"layui-carousel\" id=\"test2\" style=\"margin-top: 15px;\">-->\r\n");
      out.write("    <!--<div carousel-item=\"\">-->\r\n");
      out.write("        <!--<div>条目1</div>-->\r\n");
      out.write("        <!--<div>条目2</div>-->\r\n");
      out.write("    <!--</div>-->\r\n");
      out.write("<!--</div>-->\r\n");
      out.write("<!--<div>-->\r\n");
      out.write("<!--<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 30px;\">-->\r\n");
      out.write("    <!--<legend>设定各种参数</legend>-->\r\n");
      out.write("<!--</fieldset>-->\r\n");
      out.write("<!--<div class=\"layui-form\">-->\r\n");
      out.write("    <!--<div class=\"layui-form-item\">-->\r\n");
      out.write("        <!--<div class=\"layui-inline\">-->\r\n");
      out.write("            <!--<label class=\"layui-form-label\">宽高</label>-->\r\n");
      out.write("            <!--<div class=\"layui-input-inline\" style=\"width: 98px;\">-->\r\n");
      out.write("                <!--<input type=\"tel\" name=\"width\" value=\"380\" autocomplete=\"off\" placeholder=\"width\" class=\"layui-input demoSet\">-->\r\n");
      out.write("            <!--</div>-->\r\n");
      out.write("            <!--<div class=\"layui-input-inline\" style=\"width: 98px;\">-->\r\n");
      out.write("                <!--<input type=\"tel\" name=\"height\" value=\"310\" autocomplete=\"off\" placeholder=\"height\" class=\"layui-input demoSet\">-->\r\n");
      out.write("            <!--</div>-->\r\n");
      out.write("        <!--</div>-->\r\n");
      out.write("    <!--</div>-->\r\n");
      out.write("\r\n");
      out.write("    <!--<div class=\"layui-form-item\">-->\r\n");
      out.write("        <!--<label class=\"layui-form-label\">动画类型</label>-->\r\n");
      out.write("        <!--<div class=\"layui-input-block\">-->\r\n");
      out.write("            <!--<div class=\"layui-btn-group demoTest\" style=\"margin-top: 5px;\">-->\r\n");
      out.write("                <!--<button class=\"layui-btn layui-btn-sm\" style=\"background-color: #5FB878;\" data-type=\"set\" data-key=\"anim\" data-value=\"default\">左右切换</button>-->\r\n");
      out.write("                <!--<button class=\"layui-btn layui-btn-sm\" data-type=\"set\" data-key=\"anim\" data-value=\"updown\">上下切换</button>-->\r\n");
      out.write("                <!--<button class=\"layui-btn layui-btn-sm\" data-type=\"set\" data-key=\"anim\" data-value=\"fade\">渐隐渐显</button>-->\r\n");
      out.write("            <!--</div>-->\r\n");
      out.write("        <!--</div>-->\r\n");
      out.write("    <!--</div>-->\r\n");
      out.write("\r\n");
      out.write("    <!--<div class=\"layui-form-item\">-->\r\n");
      out.write("        <!--<label class=\"layui-form-label\">箭头状态</label>-->\r\n");
      out.write("        <!--<div class=\"layui-input-block\">-->\r\n");
      out.write("            <!--<div class=\"layui-btn-group demoTest\" style=\"margin-top: 5px;\">-->\r\n");
      out.write("                <!--<button class=\"layui-btn layui-btn-sm\" style=\"background-color: #5FB878;\" data-type=\"set\" data-key=\"arrow\" data-value=\"hover\">悬停显示</button>-->\r\n");
      out.write("                <!--<button class=\"layui-btn layui-btn-sm\" data-type=\"set\" data-key=\"arrow\" data-value=\"always\">始终显示</button>-->\r\n");
      out.write("                <!--<button class=\"layui-btn layui-btn-sm\" data-type=\"set\" data-key=\"arrow\" data-value=\"none\">不显示</button>-->\r\n");
      out.write("            <!--</div>-->\r\n");
      out.write("        <!--</div>-->\r\n");
      out.write("    <!--</div>-->\r\n");
      out.write("\r\n");
      out.write("    <!--<div class=\"layui-form-item\">-->\r\n");
      out.write("        <!--<label class=\"layui-form-label\">指示器位置</label>-->\r\n");
      out.write("        <!--<div class=\"layui-input-block\">-->\r\n");
      out.write("            <!--<div class=\"layui-btn-group demoTest\" style=\"margin-top: 5px;\">-->\r\n");
      out.write("                <!--<button class=\"layui-btn layui-btn-sm\" style=\"background-color: #5FB878;\" data-key=\"indicator\" data-type=\"set\" data-value=\"inside\">容器内部</button>-->\r\n");
      out.write("                <!--<button class=\"layui-btn layui-btn-sm\" data-type=\"set\" data-key=\"indicator\" data-value=\"outside\">容器外部</button>-->\r\n");
      out.write("                <!--<button class=\"layui-btn layui-btn-sm\" data-type=\"set\" data-key=\"indicator\" data-value=\"none\">不显示</button>-->\r\n");
      out.write("            <!--</div>-->\r\n");
      out.write("        <!--</div>-->\r\n");
      out.write("    <!--</div>-->\r\n");
      out.write("\r\n");
      out.write("    <!--<div class=\"layui-form-item\">-->\r\n");
      out.write("        <!--<div class=\"layui-inline\">-->\r\n");
      out.write("            <!--<label class=\"layui-form-label\">自动切换</label>-->\r\n");
      out.write("            <!--<div class=\"layui-input-block\">-->\r\n");
      out.write("                <!--<input type=\"checkbox\" name=\"switch\" lay-skin=\"switch\" checked=\"\" lay-text=\"ON|OFF\" lay-filter=\"autoplay\">-->\r\n");
      out.write("            <!--</div>-->\r\n");
      out.write("        <!--</div>-->\r\n");
      out.write("        <!--<div class=\"layui-inline\">-->\r\n");
      out.write("            <!--<label class=\"layui-form-label\" style=\"width: auto;\">时间间隔</label>-->\r\n");
      out.write("            <!--<div class=\"layui-input-inline\" style=\"width: 120px;\">-->\r\n");
      out.write("                <!--<input type=\"tel\" name=\"interval\" value=\"3000\" autocomplete=\"off\" placeholder=\"毫秒\" class=\"layui-input demoSet\">-->\r\n");
      out.write("            <!--</div>-->\r\n");
      out.write("        <!--</div>-->\r\n");
      out.write("    <!--</div>-->\r\n");
      out.write("<!--</div>-->\r\n");
      out.write("<!--</div>-->\r\n");
      out.write("<!--<div class=\"layui-carousel\" id=\"test3\" lay-filter=\"test4\">-->\r\n");
      out.write("    <!--<div carousel-item=\"\">-->\r\n");
      out.write("        <!--<div><img src=\"images/connect/connect1.png\"/></div>-->\r\n");
      out.write("        <!--<div><img src=\"images/connect/connect2.png\"/></div>-->\r\n");
      out.write("        <!--<div><img src=\"images/connect/connect3.png\"/></div>-->\r\n");
      out.write("        <!--<div>条目4</div>-->\r\n");
      out.write("        <!--<div>条目5</div>-->\r\n");
      out.write("    <!--</div>-->\r\n");
      out.write("<!--&lt;!&ndash;</div>&ndash;&gt;-->\r\n");
      out.write("\r\n");
      out.write("<!--&lt;!&ndash;<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 50px;\">&ndash;&gt;-->\r\n");
      out.write("    <!--&lt;!&ndash;<legend>填充轮播元素 - 以图片为例</legend>&ndash;&gt;-->\r\n");
      out.write("<!--&lt;!&ndash;</fieldset>&ndash;&gt;-->\r\n");
      out.write("\r\n");
      out.write("<!--&lt;!&ndash;<div class=\"layui-carousel\" id=\"test10\">&ndash;&gt;-->\r\n");
      out.write("    <!--&lt;!&ndash;<div carousel-item=\"\">&ndash;&gt;-->\r\n");
      out.write("        <!--&lt;!&ndash;<div><img src=\"//res.layui.com/images/layui/demo/1.png\"></div>&ndash;&gt;-->\r\n");
      out.write("        <!--&lt;!&ndash;<div><img src=\"//res.layui.com/images/layui/demo/2.png\"></div>&ndash;&gt;-->\r\n");
      out.write("        <!--&lt;!&ndash;<div><img src=\"//res.layui.com/images/layui/demo/3.png\"></div>&ndash;&gt;-->\r\n");
      out.write("        <!--&lt;!&ndash;<div><img src=\"//res.layui.com/images/layui/demo/4.png\"></div>&ndash;&gt;-->\r\n");
      out.write("        <!--&lt;!&ndash;<div><img src=\"//res.layui.com/images/layui/demo/5.png\"></div>&ndash;&gt;-->\r\n");
      out.write("        <!--&lt;!&ndash;<div><img src=\"//res.layui.com/images/layui/demo/6.png\"></div>&ndash;&gt;-->\r\n");
      out.write("        <!--&lt;!&ndash;<div><img src=\"//res.layui.com/images/layui/demo/7.png\"></div>&ndash;&gt;-->\r\n");
      out.write("    <!--&lt;!&ndash;</div>&ndash;&gt;-->\r\n");
      out.write("<!--</div>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"/wangxiao/js/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['carousel', 'form'], function(){\r\n");
      out.write("        var carousel = layui.carousel\r\n");
      out.write("            ,form = layui.form;\r\n");
      out.write("\r\n");
      out.write("        //常规轮播\r\n");
      out.write("        carousel.render({\r\n");
      out.write("            elem: '#test1'\r\n");
      out.write("            ,arrow: 'always'\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //改变下时间间隔、动画类型、高度\r\n");
      out.write("        carousel.render({\r\n");
      out.write("            elem: '#test2'\r\n");
      out.write("            ,interval: 1800\r\n");
      out.write("            ,anim: 'fade'\r\n");
      out.write("            ,height: '120px'\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //设定各种参数\r\n");
      out.write("        var ins3 = carousel.render({\r\n");
      out.write("            elem: '#test3'\r\n");
      out.write("        });\r\n");
      out.write("        //图片轮播\r\n");
      out.write("        carousel.render({\r\n");
      out.write("            elem: '#test10'\r\n");
      out.write("            ,width: '778px'\r\n");
      out.write("            ,height: '440px'\r\n");
      out.write("            ,interval: 5000\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //事件\r\n");
      out.write("        carousel.on('change(test4)', function(res){\r\n");
      out.write("            console.log(res)\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        var $ = layui.$, active = {\r\n");
      out.write("            set: function(othis){\r\n");
      out.write("                var THIS = 'layui-bg-normal'\r\n");
      out.write("                    ,key = othis.data('key')\r\n");
      out.write("                    ,options = {};\r\n");
      out.write("\r\n");
      out.write("                othis.css('background-color', '#5FB878').siblings().removeAttr('style');\r\n");
      out.write("                options[key] = othis.data('value');\r\n");
      out.write("                ins3.reload(options);\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        //监听开关\r\n");
      out.write("        form.on('switch(autoplay)', function(){\r\n");
      out.write("            ins3.reload({\r\n");
      out.write("                autoplay: this.checked\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('.demoSet').on('keyup', function(){\r\n");
      out.write("            var value = this.value\r\n");
      out.write("                ,options = {};\r\n");
      out.write("            if(!/^\\d+$/.test(value)) return;\r\n");
      out.write("\r\n");
      out.write("            options[this.name] = value;\r\n");
      out.write("            ins3.reload(options);\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //其它示例\r\n");
      out.write("        $('.demoTest .layui-btn').on('click', function(){\r\n");
      out.write("            var othis = $(this), type = othis.data('type');\r\n");
      out.write("            active[type] ? active[type].call(this, othis) : '';\r\n");
      out.write("        });\r\n");
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
