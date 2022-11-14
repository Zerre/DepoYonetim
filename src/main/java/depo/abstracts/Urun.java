package depo.abstracts;

import depo.Raf;

public abstract class Urun
{
    private String id;
    private static int idPrimary;
    private String adi;
    //gelisSekli(Birim) --> Kasa, Çuval, Metre, Kilo, İnç vs..
    private String gelisSekli;
    private int miktar;
    private String uretici;
    private Raf raf;

    public Urun(String adi, String gelisSekli, String uretici)
    {
        this.id = adi.substring(0, 2) + gelisSekli.substring(0, 2) + uretici.substring(0, 2) + ++idPrimary;
        this.adi = adi;
        this.gelisSekli = gelisSekli;
        this.uretici = uretici;
    }

    // gelisSekli(Birim) --> Kasa, Çuval, Metre, Kilo, İnç vs..
    public String getGelisSekli()
    {
        return gelisSekli;
    }

    public void setGelisSekli(String gelisSekli)
    {
        this.gelisSekli = gelisSekli;
    }

    public int getMiktar()
    {
        return miktar;
    }

    public void setMiktar(int miktar)
    {
        this.miktar = miktar;
    }

    public String getUretici()
    {
        return uretici;
    }

    public void setUretici(String uretici)
    {
        this.uretici = uretici;
    }

    public Raf getRaf()
    {
        return raf;
    }

    public void setRaf(Raf raf)
    {
        this.raf = raf;
    }

    public String getId()
    {
        return this.id;
    }

    public String getAdi()
    {
        return this.adi;
    }

    public void setAdi(String adi)
    {
        this.adi = adi;
    }
}