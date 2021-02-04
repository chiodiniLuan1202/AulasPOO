package Interfaces;

import Rings.TorreRingBase;

public interface ITorre {
    void AddRing(TorreRingBase ring);
    TorreRingBase RemoveRing();
    TorreRingBase[] GetTorreRings();
    void PrintTorre();
}
