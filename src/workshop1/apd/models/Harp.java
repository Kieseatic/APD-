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

public class Harp extends StringFamily implements IPlayable, IFixable {

    public Harp(double price){
        super("Harp",price);
    }
    @Override
    public String howToFix() {
        return "replace the strings";
    }

    @Override
    public String familyName() {
        return "String";
    }
    @Override
    public String howToPlay() {
        return "with the thumb and first three fingers";
    }

    @Override
    public String makeSound() {
        return "vibrating strings.";
    }

    @Override
    public String getPitchType() {
        return "Has seven levels of pitch ";
    }
}