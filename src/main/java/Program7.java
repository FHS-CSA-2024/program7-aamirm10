package src.main.java;
//import stuff here
import java.util.Scanner;
//Your code here

public class Program7{
    //Define your final variables here
    // **HINT: Maybe the conversion rates?????**

    final int klevinsInSchruteBucks = 20;
    final int stanleyNickelsInKlevin = 12;    

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        Program7 tester = new Program7();

        System.out.println("Enter Schrute-Buck Amount: ");
        double schruteBucks = myScanner.nextDouble();
        
        System.out.println("Enter Klevin Amount: ");
        int klevins = myScanner.nextInt();
        
        System.out.println("Enter Stanley-Nickels Amount: ");
        int stanleyNickels = myScanner.nextInt();
        
        double convertedValue = tester.convertMoney(schruteBucks, klevins, stanleyNickels);
        System.out.println("Schrute-Bucks = $" + convertedValue);
        

        
    }
    
    
    
    public double convertMoney(double schruteBucks, int klevins, int stanleyNickels){
        double klevinsConverted = klevins + stanleyNickels / (double) stanleyNickelsInKlevin;
        schruteBucks +=  klevinsConverted/ (double) klevinsInSchruteBucks;
        schruteBucks = Math.round(100.0 * schruteBucks)/ 100.0;
        
        return schruteBucks;
    }
    
    
}

/* paste console output
Enter Schrute-Buck Amount: 
7
Enter Klevin Amount: 
17
Enter Stanley-Nickels Amount: 
9
Schrute-Bucks = $7.89

 */
