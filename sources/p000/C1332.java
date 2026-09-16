package p000;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۥٔؓۘؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1332 extends AbstractMap {

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ int f4607 = 0;

    /* JADX INFO: renamed from: ۥَ */
    public Map f4608;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f4609;

    /* JADX INFO: renamed from: ۥٓ */
    public volatile C3839 f4610;

    /* JADX INFO: renamed from: ۦ۟ */
    public Map f4611;

    /* JADX INFO: renamed from: ۦۨ */
    public List f4612;

    /* JADX INFO: renamed from: ۥّ */
    public static C1332 m2840() {
        C1332 c1332 = new C1332();
        c1332.f4612 = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        c1332.f4611 = map;
        c1332.f4608 = map;
        return c1332;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m2843();
        if (!this.f4612.isEmpty()) {
            this.f4612.clear();
        }
        if (this.f4611.isEmpty()) {
            return;
        }
        this.f4611.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m2845(comparable) >= 0 || this.f4611.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4610 == null) {
            this.f4610 = new C3839(1, this);
        }
        return this.f4610;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1332)) {
            return super.equals(obj);
        }
        C1332 c1332 = (C1332) obj;
        int size = size();
        if (size == c1332.size()) {
            int size2 = this.f4612.size();
            if (size2 != c1332.f4612.size()) {
                return ((AbstractSet) entrySet()).equals(c1332.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m2841(i).equals(c1332.m2841(i))) {
                }
            }
            if (size2 != size) {
                return this.f4611.equals(c1332.f4611);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM2845 = m2845(comparable);
        return iM2845 >= 0 ? ((C5447) this.f4612.get(iM2845)).f17963 : this.f4611.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f4612.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((C5447) this.f4612.get(i)).hashCode();
        }
        return this.f4611.size() > 0 ? this.f4611.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m2843();
        Comparable comparable = (Comparable) obj;
        int iM2845 = m2845(comparable);
        if (iM2845 >= 0) {
            return m2844(iM2845);
        }
        if (this.f4611.isEmpty()) {
            return null;
        }
        return this.f4611.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4611.size() + this.f4612.size();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Map.Entry m2841(int i) {
        return (Map.Entry) this.f4612.get(i);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final SortedMap m2842() {
        m2843();
        if (this.f4611.isEmpty() && !(this.f4611 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4611 = treeMap;
            this.f4608 = treeMap.descendingMap();
        }
        return (SortedMap) this.f4611;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m2843() {
        if (this.f4609) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final Object m2844(int i) {
        m2843();
        Object obj = ((C5447) this.f4612.remove(i)).f17963;
        if (!this.f4611.isEmpty()) {
            Iterator it = m2842().entrySet().iterator();
            List list = this.f4612;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C5447(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۣ */
    public final int m2845(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f4612.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((C5447) this.f4612.get(i3)).f17964);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((C5447) this.f4612.get(i4)).f17964);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((C5447) this.f4612.get(i3)).f17964);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Set m2846() {
        return this.f4611.isEmpty() ? Collections.EMPTY_SET : this.f4611.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: ۦۙ, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m2843();
        int iM2845 = m2845(comparable);
        if (iM2845 >= 0) {
            return ((C5447) this.f4612.get(iM2845)).setValue(obj);
        }
        m2843();
        if (this.f4612.isEmpty() && !(this.f4612 instanceof ArrayList)) {
            this.f4612 = new ArrayList(16);
        }
        int i = -(iM2845 + 1);
        if (i >= 16) {
            return m2842().put(comparable, obj);
        }
        if (this.f4612.size() == 16) {
            C5447 c5447 = (C5447) this.f4612.remove(15);
            m2842().put(c5447.f17964, c5447.f17963);
        }
        this.f4612.add(i, new C5447(this, comparable, obj));
        return null;
    }
}
