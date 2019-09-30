import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws Exception {
        boolean hataOlduMu = false;

        try {
            AletCantasi canta = new AletCantasi(2); //instance
            AletCantasi canta2 = new AletCantasi(3);

            canta.KapakAcma();
            /*canta.TornavidaEkle();
            canta.PenseEkle();
            canta.TornavidaEkle();
            canta.PenseEkle();*/

            canta2.KapakAcma();
            /*canta2.TornavidaEkle();
            canta2.PenseEkle();
            canta2.TornavidaEkle();
            canta2.PenseEkle();*/

            ArrayList<AletCantasi> cantalar = new ArrayList<>();
            cantalar.add(canta);
            cantalar.add(canta2);

            ArrayList<String> eklenecekler = new ArrayList<>();
            eklenecekler.add("pense");
            eklenecekler.add("tornavida");
            eklenecekler.add("kerpeten");
            eklenecekler.add("tencere");

            AletCantasi.CantalarıDoldur(cantalar, eklenecekler); //hatalı sonuçlar

            System.out.println(canta.getIcindekiler());
            System.out.println(canta.getAgirlik());

            System.out.println();

            System.out.println(canta2.getIcindekiler());
            System.out.println(canta2.getAgirlik());
        } catch (NullPointerException e) {
            //e.printStackTrace();
            //System.out.println("Çantanın kapasitesi yetersiz.");
            System.out.println(e.getMessage());
            hataOlduMu = true;
        } catch (RuntimeException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            hataOlduMu = true;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Önce çantanın kapağını açmalısınız.");
            System.out.println(e.getMessage());
            hataOlduMu = true;
        } finally {
            if (hataOlduMu) {
                System.out.println("finally");
            }
        }
    }
}
