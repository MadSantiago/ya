package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦُؚؑٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3881 extends AbstractMap implements Map, InterfaceC1993 {

    /* JADX INFO: renamed from: ۥَ */
    public int f12966;

    /* JADX INFO: renamed from: ۥْ */
    public Object f12967;

    /* JADX INFO: renamed from: ۥٓ */
    public int f12968;

    /* JADX INFO: renamed from: ۥٖ */
    public C2103 f12969;

    /* JADX INFO: renamed from: ۦ۟ */
    public C1205 f12970;

    /* JADX INFO: renamed from: ۦۨ */
    public C3223 f12971 = new C3223(18);

    public C3881(C2103 c2103) {
        this.f12970 = c2103.f2193;
        this.f12966 = c2103.f2192;
        this.f12969 = c2103;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f12970 = C1205.f4146;
        m6947(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC2266) {
            return m6948((AbstractC2266) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof InterfaceC3633) {
            return super.containsValue((InterfaceC3633) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C3422(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC2266) {
            return (InterfaceC3633) m6946((AbstractC2266) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC2266) ? obj2 : (InterfaceC3633) super.getOrDefault((AbstractC2266) obj, (InterfaceC3633) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new C3422(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f12967 = null;
        this.f12970 = this.f12970.m2542(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f12967;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        C0588 c0588M6949 = null;
        C0588 c0588 = map instanceof C0588 ? (C0588) map : null;
        if (c0588 == null) {
            C3881 c3881 = map instanceof C3881 ? (C3881) map : null;
            if (c3881 != null) {
                c0588M6949 = c3881.m6949();
            }
        } else {
            c0588M6949 = c0588;
        }
        if (c0588M6949 == null) {
            super.putAll(map);
            return;
        }
        C1277 c1277 = new C1277();
        c1277.f4355 = 0;
        int i = this.f12966;
        this.f12970 = this.f12970.m2543(c0588M6949.f2193, 0, c1277, this);
        int i2 = (c0588M6949.f2192 + i) - c1277.f4355;
        if (i != i2) {
            m6947(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f12966;
        C1205 c1205M2552 = this.f12970.m2552(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (c1205M2552 == null) {
            c1205M2552 = C1205.f4146;
        }
        this.f12970 = c1205M2552;
        return i != this.f12966;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12966;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new C0121(this);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m6946(Object obj) {
        return this.f12970.m2548(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m6947(int i) {
        this.f12966 = i;
        this.f12968++;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m6948(Object obj) {
        return this.f12970.m2541(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2103 m6949() {
        C1205 c1205 = this.f12970;
        C2103 c2103 = this.f12969;
        if (c1205 != c2103.f2193) {
            this.f12971 = new C3223(18);
            c2103 = new C2103(this.f12970, this.f12966);
        }
        this.f12969 = c2103;
        return c2103;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Object m6950(Object obj) {
        this.f12967 = null;
        C1205 c1205M2549 = this.f12970.m2549(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (c1205M2549 == null) {
            c1205M2549 = C1205.f4146;
        }
        this.f12970 = c1205M2549;
        return this.f12967;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC2266) {
            return (InterfaceC3633) m6950((AbstractC2266) obj);
        }
        return null;
    }
}
