
/**
 *
 *  @author Piwowarski Łukasz S18226
 *
 */

package zad2;

//klasa bazowa
public class Pacjent {

  private String nazwisko;
  private String zastosowano;
  private String choryNa;

  public Pacjent(String nazwisko, String zastosowano, String choryNa) {
      this.nazwisko = nazwisko;
      this.zastosowano = zastosowano;
      this.choryNa = choryNa;
  }

  public String choroba() {
      return choryNa;
  }

  public String leczenie() {
      return zastosowano;
  }

  public String getNazwisko() {
      return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
      this.nazwisko = nazwisko;
  }

  public String getZastosowano() {
      return zastosowano;
  }

  public void setZastosowano(String zastosowano) {
      this.zastosowano = zastosowano;
  }

  public String getChoryNa() {
      return choryNa;
  }

  public void setChoryNa(String choryNa) {
      this.choryNa = choryNa;
  }
}

