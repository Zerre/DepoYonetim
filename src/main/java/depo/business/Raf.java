package depo.business;

import depo.abstracts.Urun;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Raf
{
    private String id;
    private static int idPrimary;
    private List<Urun> urunler;

    public String getId()
    {
        return id;
    }

    private String rafIdOlustur()
    {
        return (char) (new Random().nextInt(65, 91)) + "" + ++idPrimary;
    }
    public Raf()
    {
        id = rafIdOlustur();
        urunler = new LinkedList<>();
    }
    public void urunuRafaKoy(Urun urun)
    {
        urun.setRaf(this);
        urunler.add(urun);
    }
    public List<Urun> raftakiUrunler()
    {
        return urunler;
    }
}