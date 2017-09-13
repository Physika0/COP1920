//********************************************************************************
// PantherID:  5909334
// CLASS: COP 2210 – 2017
// ASSIGNMENT # 1
// DATE: 9/13/17
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package lottonumbergenerator;

import java.util.Random;
import javax.swing.JOptionPane;

public class LottoNumberGenerator {

    
    public static void main(String[] args) {
        Random r = new Random();
                
        String greeting = "Here are your winning numbers!";
        
        int fantasyFirstNum  = 1 + r.nextInt(36);
        int fantasySecondNum = 1 + r.nextInt(36);
        int fantasyThirdNum  = 1 + r.nextInt(36);
        int fantasyFourthNum = 1 + r.nextInt(36);
        int fantasyFifthNum  = 1 + r.nextInt(36);
        String fantasy5 = "Fantasy 5: "
                + Integer.toString(fantasyFirstNum)  + " " 
                + Integer.toString(fantasySecondNum) + " " 
                + Integer.toString(fantasyThirdNum)  + " "
                + Integer.toString(fantasyFourthNum) + " "
                + Integer.toString(fantasyFifthNum);
        
        int lottoFirstNum  = 1 + r.nextInt(53);
        int lottoSecondNum = 1 + r.nextInt(53);
        int lottoThirdNum  = 1 + r.nextInt(53);
        int lottoFourthNum = 1 + r.nextInt(53);
        int lottoFifthNum  = 1 + r.nextInt(53);
        int lottoSixthNum  = 1 + r.nextInt(53);
        String lotto = "Lotto: "
                + Integer.toString(lottoFirstNum)  + " "
                + Integer.toString(lottoSecondNum) + " "
                + Integer.toString(lottoThirdNum)  + " "
                + Integer.toString(lottoFourthNum) + " "
                + Integer.toString(lottoFifthNum)  + " "
                + Integer.toString(lottoSixthNum);
                
        String winningNumbers = greeting + "\n" + fantasy5 + "\n" + lotto;
        
        JOptionPane.showMessageDialog(null, "Hello, this program will randomly generate some lotto numbers for you.");
        JOptionPane.showMessageDialog(null, winningNumbers);
        
    }
    
}
