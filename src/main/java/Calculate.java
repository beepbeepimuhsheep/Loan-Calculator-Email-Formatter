
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melam
 */
public class Calculate {
    String name;
    double amount;
    String type;
    int term;
    double interestpercentage;
    float finalamount;
    
    public Calculate(String name, double amount, String type, int term){
        this.name = name;
        this.amount = amount;
        this.type = type;
        this.term = term;
        switch (type) {
            case "Moderate":
                interestpercentage = 0.10;
                finalamount = (float)(amount * Math.pow(1 + (interestpercentage / 1),term));
                break;
            case "Aggressive":
                interestpercentage = 0.15;
                finalamount = (float)(amount * Math.pow(1 + (interestpercentage / 1),term));
                break;
            default:
               interestpercentage = 0.10;
               finalamount = (float)(amount * Math.pow(1 + (interestpercentage / 1),term));
                break;
        }
         

    }
    
    public void getReport(){
        JOptionPane jpane = new JOptionPane();
        JOptionPane.showMessageDialog(jpane,"INVESTMENT REPORT" +
                " \n "+
                " \nCustomer name: " + name +
                " \nOriginal Amount: " + amount +
                " \nInvestment type: " + type +
                " \nYears invested: " + term +
                " \nFinal Amount: " + finalamount);
        
    }
    
    
    
}
