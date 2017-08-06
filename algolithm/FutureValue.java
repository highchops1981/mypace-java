/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futurevalue;

/**
 *
 * @author ishikurakeisuke
 */
public class FutureValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalcFutureValue fv = new CalcFutureValue();
        fv.year = 2;
        fv.rate = 5;
        fv.yen = 1000000;
        
        System.out.println(fv.calc());

    }
    
}

/**
 *
 * @param year Operating year
 * @param rate Annual interest rate
 * @param yen Amount to look for future value
 * @return future value
 */

class CalcFutureValue {
    
    double year;
    double rate;
    double yen;
            
    double calc() {
        
        double futureValue;
        
        futureValue = yen * Math.pow((1 + rate/100),year);
        
        return futureValue;
        
    }
    
}

