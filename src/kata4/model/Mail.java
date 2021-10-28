package kata4.model;
/**
 *
 * @author Edwin Ortiz Campos
 */
public class Mail {
    private String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        String result = "";
        String[] splitted = this.mail.split("@");
        for(int i = 1; i < splitted.length;i++){
            result += splitted[i];
        }
        return result;
    }
}
