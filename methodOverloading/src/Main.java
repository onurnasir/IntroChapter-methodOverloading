public class Main {

    public static void main(String[] args) {
        Dortislem dortislem = new Dortislem();
        int sonuc = dortislem.topla(2, 3);
        System.out.println("Toplam sonuç değeri:" + dortislem.topla(2, 3));
        //System.out.println("Toplam sonuç değeri:"+sonuc);
        System.out.println("Toplam sonuç değeri:"+dortislem.topla(1, 2, 3));
    }
}
