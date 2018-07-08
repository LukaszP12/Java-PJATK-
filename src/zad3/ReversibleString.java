/**
 *
 *  @author Piwowarski Łukasz S18226
 *
 */

package zad3;

public class ReversibleString implements Reversible {

    private String text;
    private String orginalText;

    public ReversibleString(String text) {
        this.text = text;
        this.orginalText = text;
    }

    @Override
    public void reverse() {
        StringBuilder builder = new StringBuilder(text.length());
        //odwracamy kolejnosc napisu
        for (int i = this.text.length() - 1; i >= 0; i--) {
            builder.append(text.charAt(i));
        }

        this.text = builder.toString();
    }

    @Override
    public String toString() {
        return text;
    }

    public String getOrginalText() {
        return orginalText;
    }
}
