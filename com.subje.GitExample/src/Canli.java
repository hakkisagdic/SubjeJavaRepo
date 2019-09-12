public class Canli {
    public void Dogum(String isim) {
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

    public void NefesAl() {
        System.out.println("Nefes alıyorum");
    }
}