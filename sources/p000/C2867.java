package p000;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۥٟۧؔٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2867 implements Iterator {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ AbstractMap f9578;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f9579;

    /* JADX INFO: renamed from: ۥٓ */
    public Iterator f9580;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f9581 = -1;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9582;

    public /* synthetic */ C2867(AbstractMap abstractMap, int i) {
        this.f9582 = i;
        this.f9578 = abstractMap;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f9582;
        AbstractMap abstractMap = this.f9578;
        switch (i) {
            case 0:
                C1332 c1332 = (C1332) abstractMap;
                if (this.f9581 + 1 >= c1332.f4612.size()) {
                    return !c1332.f4611.isEmpty() && m5432().hasNext();
                }
                return true;
            default:
                C1789 c1789 = (C1789) abstractMap;
                if (this.f9581 + 1 >= c1789.f5987) {
                    return !c1789.f5984.isEmpty() && m5431().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9582;
        AbstractMap abstractMap = this.f9578;
        switch (i) {
            case 0:
                this.f9579 = true;
                int i2 = this.f9581 + 1;
                this.f9581 = i2;
                C1332 c1332 = (C1332) abstractMap;
                return i2 < c1332.f4612.size() ? (Map.Entry) c1332.f4612.get(this.f9581) : (Map.Entry) m5432().next();
            default:
                this.f9579 = true;
                int i3 = this.f9581 + 1;
                this.f9581 = i3;
                C1789 c1789 = (C1789) abstractMap;
                return i3 < c1789.f5987 ? (C3231) c1789.f5988[i3] : (Map.Entry) m5431().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f9582;
        AbstractMap abstractMap = this.f9578;
        switch (i) {
            case 0:
                C1332 c1332 = (C1332) abstractMap;
                if (!this.f9579) {
                    C1078.m2276("remove() was called before next()");
                } else {
                    this.f9579 = false;
                    int i2 = C1332.f4607;
                    c1332.m2843();
                    if (this.f9581 >= c1332.f4612.size()) {
                        m5432().remove();
                    } else {
                        int i3 = this.f9581;
                        this.f9581 = i3 - 1;
                        c1332.m2844(i3);
                    }
                }
                break;
            default:
                if (!this.f9579) {
                    C1078.m2276("remove() was called before next()");
                } else {
                    this.f9579 = false;
                    C1789 c1789 = (C1789) abstractMap;
                    c1789.m3573();
                    int i4 = this.f9581;
                    if (i4 >= c1789.f5987) {
                        m5431().remove();
                    } else {
                        this.f9581 = i4 - 1;
                        c1789.m3576(i4);
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public Iterator m5431() {
        Iterator it = this.f9580;
        if (it != null) {
            return it;
        }
        Iterator it2 = ((C1789) this.f9578).f5984.entrySet().iterator();
        this.f9580 = it2;
        return it2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public Iterator m5432() {
        Iterator it = this.f9580;
        if (it != null) {
            return it;
        }
        Iterator it2 = ((C1332) this.f9578).f4611.entrySet().iterator();
        this.f9580 = it2;
        return it2;
    }
}
