public class Canli {
    public Canli(String canliAdi, String uyruk)
    {
        Dogum(canliAdi);
        Isim = canliAdi;
        Uyruk = uyruk;
        NefesAl();
    }

    private String Isim = "isimsiz";
    String Uyruk = "yok";

    private void Dogum(String isim) {
        System.out.println(isim + " isimli canlı yaratıldı");
    }

    public boolean Olum(boolean sehadetGetirebildiMi) {
        if (sehadetGetirebildiMi) {
            System.out.println("köprü geçildi");
            return true;
        }
        else{
            System.out.println("zebani atandı");
            return false;
        }
    }

    //sürekli nefes alma fonksiyonu nasıl yapılabilir?
    public void NefesAl() {
        System.out.println(Isim + " : Nefes alıyorum");
    }

    public static void TopluIntihar(Canli[] canlilar)
    {
        for (int i = 0; i < canlilar.length; i++) {
            canlilar[i].Olum(false); //ödev : doğal afetler eklenecek
        }
    }
}