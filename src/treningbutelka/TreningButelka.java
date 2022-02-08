
package treningbutelka;
/**
 * 
 * @author pawelstradomski
 */

public class TreningButelka {
    
    
    
    public static void main(String[] args) {
        
        Butelka[] zywiec = new Butelka[3];
        zywiec[0] = new Butelka(3);
        zywiec[1] = new Butelka(5);
        zywiec[2] = new Butelka(8);
        
        System.out.println(zywiec[0].getIleLitrow());
        System.out.println(zywiec[1].getIleLitrow());
        System.out.println(zywiec[2].getIleLitrow());
        
        zywiec[0].wlej(7);
        zywiec[0].wylej(5);
        zywiec[0].przelej(1, zywiec[2]);
        
        System.out.println("Butelka 0 aktualnie ma: "+ zywiec[0].getIleLitrow());
        System.out.println("Butelka 1 aktualnie ma: "+ zywiec[1].getIleLitrow());
        System.out.println("Butelka 2 aktualnie ma: "+ zywiec[2].getIleLitrow());
        
        
        
        
                
    }
    
}
class Butelka
{
    Butelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;
    }
    double getIleLitrow()
    {
        return ileLitrow;
    }
    void wlej(double ile)
    {
        this.ileLitrow += ile;
    }
    boolean wylej(double ile)
    {
        if(ile>ileLitrow)
            System.out.println("za duzo chcesz wylac");
        else if(ile<ileLitrow)
            this.ileLitrow -= ile;
        return true;
        
        }
    void przelej(double ile, Butelka gdziePrzelac)
    {
        this.wylej(ile);
        gdziePrzelac.wlej(ile);
    }
    double ileLitrow;
}
