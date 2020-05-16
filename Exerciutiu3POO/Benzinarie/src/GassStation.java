import org.w3c.dom.ls.LSOutput;

public class GassStation {
    private int motorina;
    private int benzina;
    private int pretM;
    private int pretB;

    public GassStation(int motorina, int pretM, int benzina, int pretB){
   this.motorina=motorina;
   this.benzina=benzina;
   this.pretB=pretB;
   this.pretM=pretM;
    }

    public int getBenzina() {
        return benzina;
    }

    public int getMotorina() {
        return motorina;
    }

    public int getPretB() {
        return pretB;
    }

    public void getPretM(int pretM) {
        this.pretM = pretM;
    }
    public int sellM(int motorinaSell){
        int pretTotal=0;
        if (this.motorina<=10){
            System.out.println("Nu avem motorina in stoc");
        }else{
            if(this.motorina<motorinaSell) {
                System.out.println("Tranzactie refuzata");
            }
         this.motorina-=motorinaSell;
            pretTotal=motorinaSell*pretM;

        }
        return pretTotal;

    }
    public int sellB(int benzinaSell){
        int pretTotal=0;
        if (this.benzina<=10){
            System.out.println("Nu avem benzina in stoc");
        }else{
            if(this.benzina<benzinaSell){
                System.out.println("Tranzactie refuzata");
            }
            this.benzina-=benzinaSell;
            pretTotal=benzinaSell*pretB;
        }
        return pretTotal;
    }
    public String incaseazaBanii(int bani, int pretTotal){
        if(bani==pretTotal){
            return "Multumim, va mai asteptam";
        }else if(bani>pretTotal){
            return "Multumim, poftim restul "+(bani-pretTotal);
        }else{
            return "Sunati un prieten";
        }
    }
}
