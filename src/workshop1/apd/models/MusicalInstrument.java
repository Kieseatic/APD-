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

public abstract class MusicalInstrument implements IFixable, IPlayable, Comparable<MusicalInstrument> {
    protected String name;
    protected double price;

    public MusicalInstrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
    return name;
    }


    public double getPrice() {
        return price;
    }

    public abstract String familyName();

    // Override the compareTo method
    @Override
    public int compareTo(MusicalInstrument other) {
        return Double.compare(this.price, other.price);
    }
    //Type of sound
    public abstract String makeSound();

    //Type of pitch
    public abstract String getPitchType();

    // Override toString for displaying instrument name
    @Override
    public String toString() {
        return name;
    }
}
