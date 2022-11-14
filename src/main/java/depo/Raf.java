package depo;

import depo.abstracts.Urun;

import java.util.LinkedList;
import java.util.List;

public class Raf
{
    String id;
    List<Urun> urunler;

    public Raf()
    {
        urunler = new LinkedList<>();
    }

    void urunuRafaKoy(Urun urun)
    {
        urun.setRaf(this);
        urunler.add(urun);
    }

    List<Urun> raftakiUrunler()
    {
        return urunler;
    }
}
