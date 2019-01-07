
package curs3;



public class StocProdus {

    public String numeProdus;
    public int cantitate;
    //public Date dataAchizitiei;
   

    StocProdus(String numeProdus, int cantitate) {
        
        this.numeProdus = numeProdus;
        this.cantitate = cantitate;
        //this.dataAchizitiei = dataAchizitiei;
        
        
    }

    StocProdus() {
        
    }

    
    
     public StocProdus stocNou(String numeProdus, int cantitate ){
       return new StocProdus(numeProdus, cantitate);
   }

   
    
    
}
