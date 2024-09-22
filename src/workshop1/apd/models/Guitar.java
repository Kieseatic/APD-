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

public class Guitar extends StringFamily implements IFixable, IPlayable {

    public Guitar(double price){
        super("Guitar",price);
    }

    @Override
    public String familyName() {
        return "Percussion";
    }

    @Override
    public String makeSound() {
        return "vibrating strings.";
    }

    @Override
    public String getPitchType() {
        return "Low to high pitch";
    }

    @Override
    public String howToFix() {
        return "Replace the strings";
    }

    @Override
    public String howToPlay() {
        return "by strumming the strings";
    }
}
