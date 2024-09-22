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

package workshop1.apd.controller;

import workshop1.apd.models.*;
import workshop1.apd.view.InstrumentView;

import java.util.Arrays;

public class InstrumentController {

    //view class object
    private InstrumentView view;

    //model class object
    private MusicalInstrument[] instruments;

    public InstrumentController(InstrumentView view) {
        this.view = view;
        instruments = new MusicalInstrument[5];
    }

    public void inputPrices() {
        System.out.println("--:Requirement 1:--");
        instruments[0] = new Drum(view.getInstrumentPrice("Drum"));
        instruments[1] = new Flute(view.getInstrumentPrice("Flute"));
        instruments[2] = new Guitar(view.getInstrumentPrice("Guitar"));
        instruments[3] = new Harp(view.getInstrumentPrice("Harp"));
        instruments[4] = new Xylophone(view.getInstrumentPrice("Xylophone"));
    }

    public void displayMostExpensive(){
        MusicalInstrument mostExpensive = instruments[0];

        for (MusicalInstrument instrument: instruments) {
            if(instrument.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = instrument;
            }
        }
        view.displayMostExpensiveInstrumemnt(mostExpensive);  //Calling out view function to display the information about most expensive instrument .
    }

    public void displayInstruments(){
        Arrays.sort(instruments);           //sorting out the instruments from low price to high
        view.displayInstruments(instruments);
    }

    public void soundByFamily() {
        String family = view.getFamilyName().trim();
        boolean familyFound = false; // Track if any matching family is found

        for (MusicalInstrument instrument : instruments) {
            if ((family.equalsIgnoreCase("Percussion") && instrument instanceof PercussionFamily) ||
                    (family.equalsIgnoreCase("String") && instrument instanceof StringFamily) ||
                    (family.equalsIgnoreCase("WoodWind") && instrument instanceof WoodWindFamily)) {
                view.displayFamilySounds(instrument);
                familyFound = true; // A match was found
            }
        }

        // If no matching family was found, display a single message
        if (!familyFound) {
            System.out.println("Invalid family");
        }
    }

}



