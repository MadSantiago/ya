package p000;

/* JADX INFO: renamed from: ۥّْؕۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1219 implements InterfaceC3862 {

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC5601 f4209;

    public C1219(InterfaceC5601 interfaceC5601) {
        this.f4209 = interfaceC5601;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1219) {
            return this.f4209.equals(((C1219) obj).f4209);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4209.hashCode() * 31;
    }
}
