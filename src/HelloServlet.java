//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class HelloServlet extends HttpServlet{
//    @Override
//        public void init(){
//            System.out.println("Servlet Initialized");
//        }
//
//        @Override
//    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//            res.getWriter().println("Hello, World!");
//        }
//
//    @Override
//    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
//        String name = req.getParameter("name");
//        res.setContentType("text/html");
//
//        PrintWriter out = res.getWriter();
//        out.println("<h1>Hello " +name + "</h1>");
//        out.println("<p>Form submitted successfully!</p>");
//    }
//
//    @Override
//    public void destroy(){
//        System.out.println("Servlet destroyed");
//    }
//
//}
