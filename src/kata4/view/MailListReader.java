/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.view;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import kata4.model.Mail;

/**
 *
 * @author edwin
 */
public class MailListReader {
    public static ArrayList<Mail> read(String filename){
        ArrayList<Mail> mailList = new ArrayList<Mail>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String line;
            while ((line = br.readLine()) != null) {
                if(line.contains("@")){
                    mailList.add(new Mail(line));
                }
            }
        }catch(Exception e){
            System.out.println("Ha ocurrido un error procesando archivo de"
                    + "dominios...\n");
        }
        return mailList;
    }
}
