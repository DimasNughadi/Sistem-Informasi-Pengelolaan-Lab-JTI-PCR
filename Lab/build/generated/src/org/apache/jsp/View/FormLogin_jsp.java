package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FormLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Owl-Carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\"\n");
      out.write("              integrity=\"sha256-UhQQ4fxEeABh4JrcmAJ1+16id/1dnlOEVCFOxDef9Lw=\" crossorigin=\"anonymous\" />\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.theme.default.min.css\"\n");
      out.write("              integrity=\"sha256-kksNxjDRxd/5+jGurZUJd1sdR2v+ClrCl3svESBaJqw=\" crossorigin=\"anonymous\" />\n");
      out.write("\n");
      out.write("        <!-- Font Awesome CDN -->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/23412c6a8d.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom Style-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/Style.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"panel\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col liquid\">\n");
      out.write("                        <h4><i class=\"fas fa-building\"></i> Politeknik caltex Riau</h4>\n");
      out.write("\n");
      out.write("                        <!-- Owl-Carousel -->\n");
      out.write("\n");
      out.write("                        <div class=\"owl-carousel owl-theme\">\n");
      out.write("                            <img src=\"./assets/undraw_authentication_fsn5.svg\" alt=\"\" class=\"login_img\">\n");
      out.write("                            <img src=\"./assets/undraw_personal_data_29co.svg\" alt=\"\" class=\"login_img\">\n");
      out.write("                            <img src=\"./assets/undraw_fingerprint_swrc.svg\" alt=\"\" class=\"login_img\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- /Owl-Carousel -->\n");
      out.write("\n");
      out.write("                        <div class=\"follow\">\n");
      out.write("                            By 2 Ti D <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col login\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"btn btn-signup\">Sign Up</button>\n");
      out.write("                        <form method=\"post\" action=\"../Login?proses=login\">\n");
      out.write("                            <div class=\"titles\">\n");
      out.write("                                <h6>We keep everything</h6>\n");
      out.write("                                <h3>Ready to Login</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Email\" name=\"username\" id=\"email\" class=\"form-input\">\n");
      out.write("                                <div class=\"input-icon\">\n");
      out.write("                                    <i class=\"fas fa-user\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" placeholder=\"Password\" name=\"password\" id=\"password\" class=\"form-input\">\n");
      out.write("                                <div class=\"input-icon\">\n");
      out.write("                                    <i class=\"fas fa-user-lock\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-login\">Login</button>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\"\n");
      out.write("        integrity=\"sha256-pTxD+DSzIwmwhOqTFN+DB+nHjO4iAsbgfyFq5K5bcE0=\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                $('.owl-carousel').owlCarousel({\n");
      out.write("                    loop: true,\n");
      out.write("                    autoplay: true,\n");
      out.write("                    autoplayTimeout: 2000,\n");
      out.write("                    autoplayHoverPause: true,\n");
      out.write("                    items: 1\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
