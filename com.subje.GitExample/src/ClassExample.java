public class ClassExample {
    public static void main(String[] args) {
        //System.out.println("Merhaba dünya");

        Canli herhangiBirCanli = new Canli(); //instance almak
        herhangiBirCanli.Dogum("Hacker Said");
        herhangiBirCanli.NefesAl();
        boolean sonuc = herhangiBirCanli.Olum(true); //allah gecinden versin

        if (sonuc)
            System.out.println("nesne madde alemini terk etti.");
        else
            System.out.println("araf diye birşey duydun mu?");
    }
}
