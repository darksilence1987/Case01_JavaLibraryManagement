public class KitapRoman extends Kitap {

    private String konu;

    public KitapRoman(String ISBN, String baslik, String yazar, int yayinYili, String konu) {
        super(ISBN, baslik, yazar, yayinYili);
        this.konu = konu;
    }

    @Override
    public Durum getDurum() {
        // Durum kontrolü burada yapılacaktır.
        return null;
    }

    @Override
    public void setDurum(Durum durum) {
        // Durum güncelleme işlemi burada yapılacaktır.
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    @Override
    public String toString() {
        return "KitapRoman{" +
                "tur='" + konu + '\'' +
                "} " + super.toString();
    }
}

