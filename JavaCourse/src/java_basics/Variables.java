package java_basics;

public class Variables {
    public static void main(String[] args) {
        String duzYazi = new String();
        int yas = 77;
        int kalanSure; //declaration
        kalanSure = 66; //assignment

        //System.out.println("Yaşınız:" + yas);
        //System.out.println("Kalan Süre:" + kalanSure);

        int degisken1, degisken2, degisken3;
        int[] degisken = {1,2,3};

        int toplam = 4 + 6; //+ - * / % int için operatörler
        //signum sign

        //System.out.println(toplam);

        toplam = 15;

        //System.out.println(toplam);
        //System.out.println(toplam + 5);
        //System.out.println(toplam);

        //System.out.println("this is a sen" + "tence these are more words");

        int sayi = Integer.MAX_VALUE;
        double maxInt = Math.pow(2,31);
        System.out.println(sayi);
        System.out.println(maxInt);

        final long bigNumber = Long.MAX_VALUE;
        System.out.println(bigNumber);

        long testSayisi = 1111111111111111111L;
        //Stack ve heap

        short smallNumber = 32767;
        byte yas2 = 127;
        double virgullu = 356.6777777777777777777777777777777;
        System.out.println(Double.MAX_VALUE);
        boolean onerme = false;
        char karakter = 'a'; //string = karakter katarı
    }
}
