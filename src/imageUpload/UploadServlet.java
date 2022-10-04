package imageUpload;

//package com.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet 
{

	
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      try (PrintWriter out = response.getWriter()) {
          //fetch form data
          
          Part part = request.getPart("file");
          String fileName =getInitParameter(part);
          
          
          String path = getServletContext().getRealPath("/files/"+fileName);
          
          InputStream is = part.getInputStream();
          boolean test = uploadFile(is,path);
          if(test){
              out.println("uploaded : "+fileName);
          }else{
              out.println("something wrong");
          }
          
         
      }
  }
  private String getInitParameter(Part part) {
		// TODO Auto-generated method stub
  	 for (String cd : part.getHeader("content-disposition").split(";")) {
           if (cd.trim().startsWith("filename")) {
               String fileName = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
               return fileName.substring(fileName.lastIndexOf('/') + 1).substring(fileName.lastIndexOf('\\') + 1); // MSIE fix.
           }
           }
		return null;
	}
	
  public boolean uploadFile(InputStream is, String path){
      boolean test = false;
      try{
          byte[] byt = new byte[is.available()];
          is.read();
          
          FileOutputStream fops = new FileOutputStream(path);
          fops.write(byt);
          fops.flush();
          fops.close();
          
          test = true;
          
      }catch(Exception e){
          e.printStackTrace();
      }
      
      return test;
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
      processRequest(request, response);
  }

  // </editor-fold>

}
