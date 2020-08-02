public class Dortislem {
    public int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }

    public int topla(int sayi1,int sayi2,int sayi3){ //Method overloading yukarıdaki blokta bulunan ihtiyaç halinde ek bir değişken eklendiğinde kızmasından dolayı farklı olarak yeni oluşturduğumuz 3.bir değişkenle bile aynı isimde yani topla ile sistemde yeni bir fonsiyon oluşturabilir ve işlem yaptırabiliriz.
        return sayi1+sayi2+sayi3;
    }

}
