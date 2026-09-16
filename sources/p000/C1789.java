package p000;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۥؚٛؗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1789 extends AbstractMap {

    /* JADX INFO: renamed from: ۥَ */
    public volatile C3839 f5983;

    /* JADX INFO: renamed from: ۥْ */
    public Map f5984;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f5985;

    /* JADX INFO: renamed from: ۥٖ */
    public Map f5986;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f5987;

    /* JADX INFO: renamed from: ۦۨ */
    public Object[] f5988;

    public C1789() {
        Map map = Collections.EMPTY_MAP;
        this.f5984 = map;
        this.f5986 = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3573();
        if (this.f5987 != 0) {
            this.f5988 = null;
            this.f5987 = 0;
        }
        if (this.f5984.isEmpty()) {
            return;
        }
        this.f5984.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m3572(comparable) >= 0 || this.f5984.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f5983 == null) {
            this.f5983 = new C3839(2, this);
        }
        return this.f5983;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1789)) {
            return super.equals(obj);
        }
        C1789 c1789 = (C1789) obj;
        int size = size();
        if (size == c1789.size()) {
            int i = this.f5987;
            if (i != c1789.f5987) {
                return entrySet().equals(c1789.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (m3575(i2).equals(c1789.m3575(i2))) {
                }
            }
            if (i != size) {
                return this.f5984.equals(c1789.f5984);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM3572 = m3572(comparable);
        return iM3572 >= 0 ? ((C3231) this.f5988[iM3572]).f10852 : this.f5984.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f5987;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f5988[i2].hashCode();
        }
        return this.f5984.size() > 0 ? this.f5984.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m3573();
        Comparable comparable = (Comparable) obj;
        int iM3572 = m3572(comparable);
        if (iM3572 >= 0) {
            return m3576(iM3572);
        }
        if (this.f5984.isEmpty()) {
            return null;
        }
        return this.f5984.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5984.size() + this.f5987;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: ۥؗ, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m3573();
        int iM3572 = m3572(comparable);
        if (iM3572 >= 0) {
            return ((C3231) this.f5988[iM3572]).setValue(obj);
        }
        m3573();
        Object[] objArr = this.f5988;
        if (objArr == null) {
            objArr = new Object[16];
            this.f5988 = objArr;
        }
        int i = -(iM3572 + 1);
        if (i >= 16) {
            return m3577().put(comparable, obj);
        }
        if (this.f5987 == 16) {
            C3231 c3231 = (C3231) objArr[15];
            this.f5987 = 15;
            m3577().put(c3231.f10853, c3231.f10852);
        }
        Object[] objArr2 = this.f5988;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.f5988[i] = new C3231(this, comparable, obj);
        this.f5987++;
        return null;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final int m3572(Comparable comparable) {
        int i = this.f5987;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((C3231) this.f5988[i2]).f10853);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((C3231) this.f5988[i4]).f10853);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m3573() {
        if (this.f5985) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Set m3574() {
        return this.f5984.isEmpty() ? Collections.EMPTY_SET : this.f5984.entrySet();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C3231 m3575(int i) {
        if (i < this.f5987) {
            return (C3231) this.f5988[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Object m3576(int i) {
        m3573();
        Object[] objArr = this.f5988;
        Object obj = ((C3231) objArr[i]).f10852;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f5987 - i) - 1);
        this.f5987--;
        if (!this.f5984.isEmpty()) {
            Iterator it = m3577().entrySet().iterator();
            Object[] objArr2 = this.f5988;
            int i2 = this.f5987;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C3231(this, (Comparable) entry.getKey(), entry.getValue());
            this.f5987++;
            it.remove();
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final SortedMap m3577() {
        m3573();
        if (this.f5984.isEmpty() && !(this.f5984 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5984 = treeMap;
            this.f5986 = treeMap.descendingMap();
        }
        return (SortedMap) this.f5984;
    }
}
