package com.littlehu.test05;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class SendMail {
	public static void main(String[] args) {
		String to="huangy_tao@126.com";
		
		String from="2268416595@qq.com";
		
		String host="localhost";
		
		
		
		try {
			
			
			MailSSLSocketFactory sf=new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
			Properties properties=System.getProperties();
			properties.put("mail.transport.protocol", "smtp"); 
			properties.put("mail.smtp.auth", "true");
			properties.setProperty("mail.smtp.host", "smtp.qq.com");
			
			properties.put("mail.user", "2268416595@qq.com");
			properties.put("mail.password", "oakccyitffooecid");
			properties.put("mail.smtp.ssl.enable", "true");
			properties.put("mail.smtp.ssl.socketFactory", sf);

			
			
			
			 Authenticator authenticator = new Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		                // 用户名、密码
		                String userName = properties.getProperty("mail.user");
		                String password = properties.getProperty("mail.password");
		                return new PasswordAuthentication(userName, password);

		            }
		        };
		    Session mailSession = Session.getInstance(properties, authenticator);
			MimeMessage message=new MimeMessage(mailSession);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("这是头部字段");
			message.setText("我是一个中国人，我的名字叫李小龙");
			Transport.send(message);
			System.out.println("Sent message successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
