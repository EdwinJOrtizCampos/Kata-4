package kata4;

import java.util.List;
import kata4.model.Mail;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;



/**
 *
 * @author Edwin Ortiz Campos
 */
public class kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "C:\\Users\\edwin\\OneDrive\\Documentos\\NetBeansProjects\\Kata4\\email.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram); 
        histoDisplay.execute();
    }
    
    
}
