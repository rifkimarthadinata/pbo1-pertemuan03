package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangdiDompet = 25000;

        if(uangdiDompet<totalBelanja) {
            System.out.println("Duit pian kurang, kurangi belanjaan pian");
        }else if(uangdiDompet>totalBelanja){
            double angsul = uangdiDompet-totalBelanja;
            System.out.println("Uang pian cukup haja, angsul : "+angsul);
        }else{
            System.out.println("Uang pas haja.. unch-unch><..");
        }
    }
}
