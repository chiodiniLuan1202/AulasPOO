import Interfaces.ITorre;
import Rings.*;
import Torres.FinalTorre;
import Torres.Torres.Torre;
import Torres.Torres.Tower;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class HanoiTorre {
    private Torre torreUm;
    private Torre torreDois;
    private FinalTorre torreTres;
    private Map<Byte, ITorre> torres;

    public HanoiTorre() {
        this.torreUm = new Torre() {
            {
                AddRing(new TorreRingCinco());
                AddRing(new TorreRingQuatro());
                AddRing(new TorreRingTres());
                AddRing(new TorreRingDuas());
                AddRing(new TorreRingUma());
            }
        };
        this.torreDois = new Torre();
        this.torreTres = new FinalTorre();
        this.torres = new HashMap<Byte, ITorre>() {
            {
                put((byte) 1, torreUm);
                put((byte) 2, torreDois);
                put((byte) 3, (ITorre) torreTres);
            }
        };
    }

    public void RemoveFromAddAt(int source, int target) {
        this.torres.get((byte)target).AddRing(this.torres.get((byte)source).RemoveRing());
    }

    public boolean IsDone() {
        return ((FinalTorre) this.torres.get(3)).IsDone();
    }

    public void PrintTorres() {
        this.torres.forEach((torreId, torre) -> {
            System.out.printf(" ----------------- Torre %s ---------------- \n", torreId);
            torre.PrintTorre();
        });
    }
}
