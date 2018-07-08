/**
 *
 *  @author Piwowarski Łukasz S18226
 *
 */

package zad2;

public class ChoryNaGlowe extends Pacjent {

    public ChoryNaGlowe(String imiePacjenta) {
        //za pomoca sĹ‚Ăłwka kluczowego super() wyowuĹ‚ejmy konstruktor z klasy bazowej
        super(imiePacjenta, "aspiryna", "glowa");
    }

    @Override
    public String choroba(){
        return this.getChoryNa();
    }
    
    @Override
    public String leczenie() {
    	return this.getZastosowano();
    }
    
}























