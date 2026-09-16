package p000;

/* JADX INFO: renamed from: ۥ۠ؑؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2481 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5499 f8272;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5499 f8273;

    static {
        int i = 3;
        InterfaceC0443 interfaceC0443 = null;
        f8273 = new C5499(i, interfaceC0443, 0);
        f8272 = new C5499(i, interfaceC0443, 1);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final long m4639(long j) {
        return AbstractC3933.m7091(Float.isNaN(C0963.m1998(j)) ? 0.0f : C0963.m1998(j), Float.isNaN(C0963.m1995(j)) ? 0.0f : C0963.m1995(j));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static InterfaceC0705 m4640(InterfaceC0705 interfaceC0705, InterfaceC4115 interfaceC4115, boolean z, boolean z2, InterfaceC2609 interfaceC2609, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        return interfaceC0705.mo1571(new C1319(interfaceC4115, z3, z2, f8273, interfaceC2609));
    }
}
