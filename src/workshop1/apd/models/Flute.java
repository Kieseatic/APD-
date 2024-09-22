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

package workshop1.apd.models;

import workshop1.apd.interfaces.IFixable;
import workshop1.apd.interfaces.IPlayable;

public class Flute extends WoodWindFamily implements IPlayable, IFixable {

    public Flute(double price) {
        super("Flute", price);
    }

    @Override
    public String familyName() {
        return "WoodWind";
    }

    @Override
    public String makeSound() {
        return "guiding a stream of air.";
    }

    @Override
    public String getPitchType() {
        return "Fundamental pitch is middle C";
    }


    @Override
    public String howToFix() {
        return "N/A: it cannot be fixed";
    }

    @Override
    public String howToPlay() {
        return "by blowing into the flute";
    }
}
