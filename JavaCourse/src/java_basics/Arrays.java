package java_basics;

public class Arrays {
    public static void main(String[] args) {
        String isim1 = "hakkı";
        String isim2 = "said";

        String[] sinifListesi = new String[10]; //eleman sayısı
        sinifListesi[0] = "hakkı"; //index
        sinifListesi[1] = "said";
        //sinifListesi[10] = "hatali";

        String[] sinifListesiGuzelVeTemizi = {"hakkı","said","..."}; //array initializer
        String[] yenisi = new String[] {"hakkı","said","..."};

        System.out.println(sinifListesiGuzelVeTemizi[sinifListesiGuzelVeTemizi.length-1]);

        System.out.println(sinifListesi[0]);
        System.out.println(sinifListesiGuzelVeTemizi[1]);
        //System.out.println(sinifListesi[10]);

        Object[] myObjects = new Object[5];
        myObjects[0] = 5;
        myObjects[1] = "test";
        myObjects[2] = 222222L;
        myObjects[3] = new Exception[]{};
        myObjects[4] = new int[100];

        System.out.println(myObjects[2]);
    }
}
