package Torres;

import Interfaces.ITorre;
import Rings.TorreRingBase;
import Torres.Torres.Torre;
import Torres.Torres.Tower;

import java.util.Arrays;

public class FinalTorre extends Torre {
    private byte[] templateToWin;

    public void FinalTorre() {
        this.templateToWin = new byte[]{1, 2, 3, 4, 5};
    }

    public boolean IsDone() {
        return Arrays.stream(this.GetTorreRings()).map(ring -> ring.GetRingId()).toArray().equals(this.templateToWin);
    }
}