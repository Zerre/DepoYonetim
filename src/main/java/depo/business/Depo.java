package depo.business;

import depo.abstracts.Urun;

import java.util.LinkedList;
import java.util.List;

public class Depo
{
    static List<Urun> urunler= new LinkedList<>();

    public void urunTanimla(Urun urun)
    {
        urunler.add(urun);
    }

    public List<Urun> getUrunler()
    {
        return urunler;
    }

    public boolean urunGirisi(String id, int miktar)
    {
        return urunMiktariniGuncelle(id, miktar);
    }

    public boolean urunCikisi(String id, int miktar)
    {
        return urunMiktariniGuncelle(id, -miktar);
    }

    private static boolean urunMiktariniGuncelle(String id, int miktar)
    {
        for(Urun u : urunler)
        {
            if(u.getId().equalsIgnoreCase(id))
            {
                u.setMiktar(u.getMiktar() + miktar);
                return true;
            }
        }
        return false;
    }
}