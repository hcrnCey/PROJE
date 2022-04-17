package MehmetHocaDers;

public class C03 extends C02 {


    String hız="Corolla max 200 km hız yapar";
    String yakıt="Coralla benzinli veya elektiriklidir";
    String model="Coralla";

    public void motor(){
        System.out.println("Corallo araçlar cevirici motor kullanır");
    }
    public void yakıtTüketimi(){
        System.out.println("Coralla 5.6 lt yakıt tüketir");
    }
    public void vitesSayısı(){
        System.out.println("Corolla 5 viteslidir");

    }

    public static void main(String[] args) {
        C03 arb=new C03();
        System.out.println(arb.haraket);
        System.out.println(arb.hız);
        System.out.println(arb.yakıt);
        System.out.println(arb.marka);
        System.out.println(arb.şirketMerkezi);

        C02 arb2=new C03();
        System.out.println(arb2.haraket);
        System.out.println(arb2.hız);
        System.out.println(arb2.yakıt);
        System.out.println(arb2.şirketMerkezi);
        //System.out.println(arb2.model); CTE

        C01 arb3=new C03();
        System.out.println(arb3.haraket);
        System.out.println(arb3.yakıt);
        System.out.println(arb3.marka);
        System.out.println(arb3.marka);


    }
}


