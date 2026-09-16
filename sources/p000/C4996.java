package p000;

/* JADX INFO: renamed from: ۦۗ۟ۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4996 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥۖ */
    public final C0935 f16535;

    /* JADX INFO: renamed from: ۦۛ */
    public final C5293 f16536;

    public C4996(C5293 c5293) {
        C0935 c0935M669;
        this.f16536 = c5293;
        if (AbstractC1631.m3436(c5293)) {
            c0935M669 = null;
        } else {
            c0935M669 = AbstractC0317.m669();
            C0935.m1903(c0935M669, c5293);
        }
        this.f16535 = c0935M669;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4996) {
            return this.f16536.equals(((C4996) obj).f16536);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16536.hashCode();
    }

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۥَ */
    public final C2793 mo1881() {
        C5293 c5293 = this.f16536;
        return new C2793(c5293.f17435, c5293.f17433, c5293.f17430, c5293.f17436);
    }
}
