/**
 *
 *  @author Piwowarski Łukasz S18226
 *
 */

package zad3;

public class ReversibleDouble implements Reversible {

    private double number;
    private double copyNumber;

    public ReversibleDouble(final double number) {
        this.number = number;
        this.copyNumber = number;
    }

    @Override
    public void reverse() {
        //zamieniamy liczbe na string
        String numberToString = String.valueOf(this.number);
        //odwracamy kolejnosc
        StringBuilder builder = new StringBuilder(numberToString.length());

        for (int i = numberToString.length() - 1; i >= 0; i--) {
            builder.append(numberToString.charAt(i));
        }

        this.number = Double.parseDouble(builder.toString());
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    public double getCopyNumber() {
        return copyNumber;
    }
}