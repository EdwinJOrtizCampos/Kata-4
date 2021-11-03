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
    private String path;
    
    public kata4(String path){
        this.path = path;
    }
        
    public void execute(){
        List<Mail> readMails = input(path);
        HistogramDisplay histoDisplay = process(readMails);
        output(histoDisplay);
        
    }
    
    public List<Mail> input(String path){
      List<Mail> mailList = MailListReader.read(path);
      return mailList;
    }
    
    public HistogramDisplay process(List<Mail> readMails){
        Histogram<String> histogram = MailHistogramBuilder.build(readMails);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram); 
        return histoDisplay;
    }
    
    public void output(HistogramDisplay histoDisplay){
        histoDisplay.execute();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kata4 kata = new kata4("C:\\Users\\edwin\\OneDrive\\Documentos\\NetBeansProjects\\Kata4\\email.txt");
        kata.execute();
    }
    

    
    
}
