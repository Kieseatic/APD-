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

public class Drum extends PercussionFamily implements IPlayable, IFixable {

    public Drum(double price) {
        super("Drum", price);
    }

    @Override
    public String makeSound() {
        return "vibrating stretched membrane.";
    }

    @Override
    public String familyName() {
        return "Percussion";
    }
    @Override
    public String getPitchType() {
        return "Sonic pitch";
    }


    @Override
    public String howToFix() {
        return "replace the membrane";
    }

    @Override
    public String howToPlay() {
        return "by hitting the membrane";
    }
}