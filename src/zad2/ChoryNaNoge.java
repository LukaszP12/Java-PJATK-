/**
 *
 *  @author Piwowarski Łukasz S18226
 *
 */

package zad2;


public class ChoryNaNoge extends Pacjent {

    public ChoryNaNoge (String imiePacjenta){
        super(imiePacjenta,"gips","noga");
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

