package Torres;

import Interfaces.ITorre;
import Rings.TorreRingBase;

import java.util.Stack;

public class Torres {

	public class Torre implements ITorre {
	    public static final int RINGS_QUANTITY = 5;
	    private Stack<TorreRingBase> rings;

	    public Torre() {
	        this.rings = new Stack<>();
	    }

	    @Override
	    public void AddRing(TorreRingBase ring) {
	        this.rings.push(ring);
	    }

	    @Override
	    public TorreRingBase RemoveRing() {
	        return this.rings.pop();
	    }

	    @Override
	    public TorreRingBase[] GetTorreRings() {
	        return (TorreRingBase[]) this.rings.toArray();
	    }

	    @Override
	    public void PrintTorre() {
	        for (int i = this.rings.size() - 1; i >= 0; i--) {
	            String spaces = " ".repeat(RINGS_QUANTITY - this.rings.elementAt(i).GetRingId());

	            System.out.println(spaces + this.rings.elementAt(i).toString() + "||" + this.rings.elementAt(i).toString());
	        }
	    }


	}
}
