package FrameWork_BuildingBlocks;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSendDemo {

	public static void main(String[] args) throws EmailException {
		simpleTextEmail();

	}

	private static void simpleTextEmail() throws EmailException {
		
		System.out.println("start");
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("bluestonelearning0808@gmail.com", "9030212608"));
		email.setSSLOnConnect(true);
		email.setFrom("bluestonelearning0808@gmail.com");
		email.setSubject("Test Report");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("zakir.13.2011@gmail.com");
		email.send();
		
		System.out.println("End");
		
	}

}
