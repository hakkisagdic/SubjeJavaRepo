public class ClassExample {
    public static void main(String[] args) {
        //System.out.println("Merhaba dünya");

        Canli said = new Canli("said","tc"); //instance almak
        //boolean sonuc = said.Olum(true); //allah gecinden versin

        Canli hakki = new Canli("hakki","tc");

        /*System.out.println(hakki.Uyruk);
        hakki.Uyruk="ABD";
        System.out.println(hakki.Uyruk);*/

        //boolean sonuc2 = hakki.Olum(false);

        Canli sanem = new Canli("sanem", "tc");

        //System.out.println(sonuc == sonuc2);

        /*if (sonuc)
            System.out.println("nesne madde alemini terk etti.");
        else
            System.out.println("araf diye birşey duydun mu?");*/

        Canli.TopluIntihar(new Canli[] {said,hakki,sanem}); //anonymous object with array initializer
    }
}
