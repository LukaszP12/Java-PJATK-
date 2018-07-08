/**
 *
 *  @author Piwowarski Łukasz S18226
 *
 */

package zad2;

public class ChoryNaDyspepsje extends Pacjent{

    public ChoryNaDyspepsje(String imiePacjenta){
        super(imiePacjenta,"wegiel", "dyspersja");
    }
    //przysĹ‚anianie metody z klasy bazowej
    @Override
    public String choroba(){
        return this.getChoryNa();
    }
    
    public String leczenie() {
    	return this.getZastosowano(); 
    }
}


