package com.vtac.servlet;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vtac.parameters.Parameters;

/**
 * Servlet implementation class EmailServlet
 */
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EmailServlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		sendEmail(name,phone,email,message);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
	
	
	private void sendEmail(String name,String phone,String email, String textMessage){
		  
	      String to = Parameters.Email.to;
	      
	      final String from = Parameters.Email.from;
	      final String passFrom = Parameters.Email.fromPassword;
	      
	      Properties properties = System.getProperties();
	      properties.setProperty("mail.smtp.host", "smtp.gmail.com");
	      
	      properties.put("mail.smtp.port", "587");
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.smtp.starttls.enable", "true");
	      
	      Session session = Session.getInstance(properties,
	    		  new javax.mail.Authenticator() { 
	    			protected PasswordAuthentication getPasswordAuthentication() {
	    				return new PasswordAuthentication(from, passFrom);
	    			}
	    	});


	      try {
	         MimeMessage message = new MimeMessage(session);

	         message.setFrom(new InternetAddress(from));

	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress("danielgm9312@hotmail.com"));

	         message.setSubject("You have received a message from your website");

	         message.setText(
	        		 "name: "+name+"\n"+
	        		 "telephone: "+phone+"\n"+
	        		 "email: "+email+"\n"+
	        		 "message: \n"+
	        		 textMessage);
	         System.out.println("textMessage: "+textMessage);
	         System.out.println("email: "+email);
	         System.out.println("telephone: "+phone);
	         System.out.println("name: "+name);
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	}
	

}
