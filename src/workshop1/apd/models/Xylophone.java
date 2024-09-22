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

public class Xylophone extends PercussionFamily implements IPlayable, IFixable {

    public Xylophone(double price) {
        super("Xylophone", price);
    }

    @Override
    public String familyName() {
        return "Percussion";
    }
    @Override
    public String makeSound() {
        return "through resonators.";
    }

    @Override
    public String getPitchType() {
        return "Has seven levels of pitch";
    }


    @Override
    public String howToFix() {
        return "replace the strings";
    }

    @Override
    public String howToPlay() {
        return "with the thumb and first three fingers";
    }
}
