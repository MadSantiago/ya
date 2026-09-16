package p000;

/* JADX INFO: renamed from: ۦٓؗۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4143 extends C3889 {

    /* JADX INFO: renamed from: ۥَ */
    public Object f13801;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3894 f13802;

    public C4143(C3894 c3894, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f13802 = c3894;
        this.f13801 = obj2;
    }

    @Override // p000.C3889, java.util.Map.Entry
    public final Object getValue() {
        return this.f13801;
    }

    @Override // p000.C3889, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f13801;
        this.f13801 = obj;
        C0603 c0603 = (C0603) this.f13802.f13014;
        C3881 c3881 = c0603.f2229;
        Object obj3 = this.f13002;
        if (!c3881.containsKey(obj3)) {
            return obj2;
        }
        boolean z = c0603.f6930;
        if (!z) {
            c3881.put(obj3, obj);
        } else {
            if (!z) {
                C0178.m381();
                return null;
            }
            AbstractC5848 abstractC5848 = c0603.f6932[c0603.f6931];
            Object obj4 = abstractC5848.f19275[abstractC5848.f19273];
            c3881.put(obj3, obj);
            c0603.m1310(obj4 != null ? obj4.hashCode() : 0, c3881.f12970, obj4, 0);
        }
        c0603.f2231 = c3881.f12968;
        return obj2;
    }
}
