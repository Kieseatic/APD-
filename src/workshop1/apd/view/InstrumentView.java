/**********************************************
 Workshop #
 Course: Application Development - Semester 5
 Last Name: Dugar
 First Name: Harsh
 ID: 112689229
 Section: ZAA
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 09-22-2204
 **********************************************/

package workshop1.apd.view;

import workshop1.apd.models.MusicalInstrument;
import java.util.Scanner;

public class InstrumentView{

    Scanner sc = new Scanner(System.in);


    public double getInstrumentPrice(String instrumentName){
        System.out.print("Enter price for " + instrumentName + ": ");
        return sc.nextDouble();

    }

    public void displayMostExpensiveInstrumemnt(MusicalInstrument instrument){
        System.out.print("\n");
        System.out.println("--:Requirement 2:--");
        System.out.println("The most expensive instrument is: " + instrument.getName());
        System.out.println(instrument.getName() + "'s cost is: $" + instrument.getPrice());
        System.out.println(instrument.getName() + " is played: " + instrument.howToPlay());
        System.out.println(instrument.getName() + " fixing: " + instrument.howToFix());
        System.out.println(instrument.getName() + " pitch type: " + instrument.getPitchType());
    }

    public void displayInstruments(MusicalInstrument[] instruments){
        System.out.print("\n");
        System.out.println("--:Requirement 3:--");
        System.out.println("Instruments in price descending order: ");
        System.out.print("[");

        for(int i =instruments.length-1; i >= 0; i--){    // iterating through the array from the last element as it is sorted from low to high
            System.out.print(instruments[i].getName());
            if (i >0){
                System.out.print(", ");
            }

        }
        System.out.println("]");
    }

    public String getFamilyName(){
        System.out.print("\n");
        System.out.println("--:Requirement 4:--");
        System.out.print("Enter an instrument family : ");
        return sc.next();
    }

    public void displayFamilySounds(MusicalInstrument instrument){
        System.out.println(instrument.getName() + " makes sound " + instrument.makeSound());
    }

    public void closeScanner(){
        sc.close();
    }
}