import java.util.ArrayList;
import java.util.List;

public class Kutuphane {

    private List<Kitap> kitaplar;
    private List<IUye> uyeler;

    public Kutuphane() {
        kitaplar = new ArrayList<>();
        uyeler = new ArrayList<>();
    }

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void uyeEkle(Uye uye) {
        uyeler.add(uye);
    }

    public void kitapOduncAl(Uye uye, Kitap kitap) {
        // Kitap ödünç alma işlemi burada yapılacaktır.
        kitap.setDurum(Durum.OduncVerildi);
        uye.kitapOduncAl(kitap);
    }

    public void kitapIadeEt(Uye uye, Kitap kitap) {
        // Kitap iade etme işlemi burada yapılacaktır.
        kitap.setDurum(Durum.OduncAlabilir);
        uye.kitapIadeEt(kitap);
    }

    public void kitaplariGoruntule() {
        // Kütüphanedeki kitaplar burada görüntülenecektir.
        for (Kitap kitap : kitaplar) {
            System.out.println(kitap);
        }
    }

    public void kutuphaneDurumunuGoruntule() {
        // Kütüphanenin durumu burada görüntülenecektir.
        System.out.println("Kütüphanedeki kitap sayısı: " + kitaplar.size());
        System.out.println("Ödünç verilen kitap sayısı: " + getOduncVerilenKitapSayisi());
        System.out.println("Üye sayısı: " + uyeler.size());
    }

    private int getOduncVerilenKitapSayisi() {
        int count = 0;
        for (Kitap kitap : kitaplar) {
            if (kitap.getDurum() == Durum.OduncVerildi) {
                count++;
            }
        }
        return count;
    }

}

