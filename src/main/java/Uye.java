import java.util.ArrayList;
import java.util.List;

public class Uye implements IUye {

    private String ad;
    private String soyad;
    private String iletisimBilgileri;
    private List<Kitap> oduncAlinanKitaplar;

    public Uye(String ad, String soyad, String iletisimBilgileri) {
        this.ad = ad;
        this.soyad = soyad;
        this.iletisimBilgileri = iletisimBilgileri;
        this.oduncAlinanKitaplar = new ArrayList<>();
    }

    @Override
    public void kitapOduncAl(Kitap kitap) {
        // Kitap ödünç alma işlemi burada yapılacaktır.
        oduncAlinanKitaplar.add(kitap);
    }

    @Override
    public void kitapIadeEt(Kitap kitap) {
        // Kitap iade etme işlemi burada yapılacaktır.
        if(oduncAlinanKitaplar.contains(kitap)){
            oduncAlinanKitaplar.remove(kitap);
        }
    }

    @Override
    public void kitaplariGoruntule() {
        // Kütüphanedeki kitaplar burada görüntülenecektir.
        for (Kitap kitap : oduncAlinanKitaplar) {
            System.out.println(kitap);
        }
    }

    @Override
    public void kutuphaneDurumunuGoruntule() {
        // Kütüphanenin durumu burada görüntülenecektir.
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getIletisimBilgileri() {
        return iletisimBilgileri;
    }

    public void setIletisimBilgileri(String iletisimBilgileri) {
        this.iletisimBilgileri = iletisimBilgileri;
    }

    @Override
    public String toString() {
        return "Uye{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", iletisimBilgileri='" + iletisimBilgileri + '\'' +
                '}';
    }

    public List<Kitap> getOduncAlinanKitaplar() {
        return oduncAlinanKitaplar;
    }

    public void setOduncAlinanKitaplar(List<Kitap> oduncAlinanKitaplar) {
        this.oduncAlinanKitaplar = oduncAlinanKitaplar;
    }
}
