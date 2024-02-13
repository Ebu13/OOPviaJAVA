package Entities;

public abstract class Personel {
    private String ad;
    private String soyad;
    private String pozisyon;

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public Personel(String ad, String soyad, String pozisyon) {
        this.ad = ad;
        this.soyad = soyad;
        this.pozisyon=pozisyon;
    }
}