package email;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class EnviarCorreoAdjunto {

    public EnviarCorreoAdjunto() {
    }

    public void EnviarCorreo(String correo,String titulo) {
        try {
            String host = "smtp.gmail.com";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);

            BodyPart texto = new MimeBodyPart();
            texto.setText("Correo enviado con archivo adjunto");

            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource("src/XML/Correo.pdf")));
            adjunto.setFileName("Correo.pdf");

            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            multiParte.addBodyPart(adjunto);

            MimeMessage message = new MimeMessage(mailSession);
            message.setFrom(new InternetAddress("proyectoPOO2018@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
            message.setSubject(titulo);
            message.setContent(multiParte);

            Transport t = mailSession.getTransport("smtp");
            t.connect("proyectoPOO2018@gmail.com", "POO123POO");
            t.sendMessage(message, message.getAllRecipients());
            t.close();
            System.out.println("Exito al enviar el correo!");

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
