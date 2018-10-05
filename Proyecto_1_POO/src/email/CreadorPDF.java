
package proyecto1;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author Manuel Arias Medina
 */
public class CreadorPDF {
    
    public static void main(String args[]){
        
        String ruta = "C:\\Users\\manue\\Documents\\EjemploCreacionAutomatica";
        String contenido = "Chofer: " + "\nNumero de telefono: " + "\n" + "\nLugar de partida: " + "\nFecha y hora: " + "\nViajeros: ";
    
        try{
            FileOutputStream archivo = new FileOutputStream(ruta + ".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            doc.add(new Paragraph(contenido));
            doc.close();
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
