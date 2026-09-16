package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۦؙ٘ؓؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4418 implements Iterable {

    /* JADX INFO: renamed from: ۥْ */
    public final WeakHashMap f14565 = new WeakHashMap();

    /* JADX INFO: renamed from: ۥٓ */
    public int f14566 = 0;

    /* JADX INFO: renamed from: ۦ۟ */
    public C2985 f14567;

    /* JADX INFO: renamed from: ۦۨ */
    public C2985 f14568;

    public final boolean equals(Object obj) {
        C0840 c0840;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4418)) {
            return false;
        }
        C4418 c4418 = (C4418) obj;
        if (this.f14566 != c4418.f14566) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c4418.iterator();
        while (true) {
            c0840 = (C0840) it;
            if (!c0840.hasNext()) {
                break;
            }
            C0840 c0841 = (C0840) it2;
            if (!c0841.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0840.next();
            Object next = c0841.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (c0840.hasNext() || ((C0840) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C0840 c0840 = (C0840) it;
            if (!c0840.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c0840.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0840 c0840 = new C0840(this.f14568, this.f14567, 0);
        this.f14565.put(c0840, Boolean.FALSE);
        return c0840;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0840 c0840 = (C0840) it;
            if (!c0840.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0840.next()).toString());
            if (c0840.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C2985 mo7717(Object obj) {
        C2985 c2985 = this.f14568;
        while (c2985 != null && !c2985.f10040.equals(obj)) {
            c2985 = c2985.f10037;
        }
        return c2985;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public Object mo7718(Object obj) {
        C2985 c2985Mo7717 = mo7717(obj);
        if (c2985Mo7717 == null) {
            return null;
        }
        this.f14566--;
        WeakHashMap weakHashMap = this.f14565;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC5673) it.next()).mo1752(c2985Mo7717);
            }
        }
        C2985 c2985 = c2985Mo7717.f10038;
        C2985 c2986 = c2985Mo7717.f10037;
        if (c2985 != null) {
            c2985.f10037 = c2986;
        } else {
            this.f14568 = c2986;
        }
        C2985 c2987 = c2985Mo7717.f10037;
        if (c2987 != null) {
            c2987.f10038 = c2985;
        } else {
            this.f14567 = c2985;
        }
        c2985Mo7717.f10037 = null;
        c2985Mo7717.f10038 = null;
        return c2985Mo7717.f10039;
    }
}
