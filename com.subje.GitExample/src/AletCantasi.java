import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class AletCantasi { //implementation
    public AletCantasi(int kapasite)
    {
        this.Kapasite = kapasite;
    }

    private int Kapasite = 0; //default kapasite belirlenebilir.
    private boolean KapakDurumu = false; //property
    private int Agirlik = 0;
    private ArrayList<String> Icindekiler = new ArrayList<>(); //generic array list

    public void setKapakDurumu(boolean value) { //setter
        this.KapakDurumu = value;
    }
    public boolean getKapakDurumu() //getter
    {
        return this.KapakDurumu;
    }

    public void setAgirlik(int value) { //setter
        this.Agirlik = value;
    }
    public int getAgirlik() //getter
    {
        return this.Agirlik;
    }

    public void setIcindekiler(ArrayList<String> value) throws Exception {
        if (this.getKapakDurumu()) {
            this.Icindekiler.addAll(value);
        } else {
            throw new Exception("Alet cantasi kapalı");
        }
    }
    public String getIcindekiler()
    {
        /*String result = "";
        for (int i = 0; i < this.Icindekiler.size(); i++) {
            result += this.Icindekiler.get(i);
        }

        return result;*/

        return StringUtils.join(this.Icindekiler,"-");
    }

    public void setKapasite(int value) { //setter
        this.Kapasite = value;
    }
    public int getKapasite() //getter
    {
        return this.Kapasite;
    }

    public static void CantalarıDoldur(ArrayList<AletCantasi> cantalar, ArrayList<String> eklenecekler) throws Exception {
        for (int i = 0; i < cantalar.size(); i++) {
            for (int j = 0; j < eklenecekler.size(); j++) {
                AletCantasi canta = cantalar.get(i);
                if (canta.getKapasite() > canta.getAgirlik())
                {
                    /*ArrayList<String> alet = new ArrayList<>();
                    alet.add(eklenecekler.get(j));
                    canta.setIcindekiler(alet);  //string overload*/

                    String eklenecekNesne = eklenecekler.get(j);
                    switch (eklenecekNesne)
                    {
                        case "pense":
                            canta.PenseEkle();
                            break;
                        case "tornavida":
                            canta.TornavidaEkle();
                            break;
                        case "kerpeten":
                            canta.KerpetenEkle();
                            break;
                        default:
                            throw new RuntimeException("tanımsız nesne : " + eklenecekNesne);
                    }
                }
                else{
                    //i++; //hatalı
                    continue;
                }
            }
        }
    }

    public void KapakAcma() {
        this.setKapakDurumu(true);
    }

    public void NesneEkle() throws Exception {
        if (this.getKapasite() > this.getAgirlik()) {
            this.setAgirlik(++this.Agirlik);
        } else {
            throw new NullPointerException("Alet cantasi dolu"); //TODO:bu exceptionlar düzeltilecek
        }
    }

    public void TornavidaEkle() throws Exception {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("tornavida");
        this.setIcindekiler(liste);
        this.NesneEkle();
    } //generic yapısına geçmek gerekli

    public void PenseEkle() throws Exception {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("pense");
        this.setIcindekiler(liste);
        this.NesneEkle();
    }

    public void KerpetenEkle() throws Exception {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("kerpeten");
        this.setIcindekiler(liste);
        this.NesneEkle();
    }
}
