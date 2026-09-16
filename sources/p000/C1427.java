package p000;

/* JADX INFO: renamed from: ۥؚٕؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1427 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ Object f4900;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C0851 f4901;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f4902;

    public /* synthetic */ C1427(C0851 c0851, Object obj, int i) {
        this.f4902 = i;
        this.f4901 = c0851;
        this.f4900 = obj;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m3028() {
        C2166 c2166;
        switch (this.f4902) {
            case 0:
                return true;
            default:
                C1325 c1325M3029 = m3029();
                if (c1325M3029 == null || (c2166 = c1325M3029.f4576) == null) {
                    return true;
                }
                return c2166.m4220();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C1325 m3029() {
        C0851 c0851 = this.f4901;
        C0605 c0605 = (C0605) c0851.f3150.m6027(this.f4900);
        if (c0605 != null) {
            return (C1325) c0851.f3146.m6027(c0605);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m3027() {
    }
}
