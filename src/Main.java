/**********************************************
 Workshop #1
 Course: Application Development - Semester 5
 Last Name: Dugar
 First Name: Harsh
 ID: 112689229
 Section: ZAA
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 09-22-2204
 **********************************************/

import workshop1.apd.view.InstrumentView;
import workshop1.apd.controller.InstrumentController;


public class Main {
    public static void main(String[] args) {
        InstrumentView view = new InstrumentView();
        InstrumentController controller = new InstrumentController(view);

        controller.inputPrices(); //input instrument prices

        controller.displayMostExpensive(); //Displaying information about most expensive instrument

        controller.displayInstruments(); //Display the list of Instruments in descending order as per their price

        controller.soundByFamily(); //Sounds made by instruments as per their Family (Percussion, String, WoodWind)

        view.closeScanner();

    }

}
