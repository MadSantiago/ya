package p000;

/* JADX INFO: renamed from: ۦۦؚؗٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5785 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0380 f19057;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0380 f19058;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0380 f19059;

    static {
        C0756 c0756 = new C0756(0.4f, 0.0f, 0.6f, 1.0f);
        f19059 = new C0380(120, AbstractC1074.f3761);
        f19058 = new C0380(150, c0756);
        f19057 = new C0380(120, c0756);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v1 ۥؔؒٝ) = (r1v0 ۥؔؒٝ), (r1v0 ۥؔؒٝ), (r1v0 ۥؔؒٝ), (r1v2 ۥؔؒٝ), (r1v2 ۥؔؒٝ), (r1v2 ۥؔؒٝ), (r1v2 ۥؔؒٝ) binds: [B:18:0x0020, B:21:0x0025, B:27:0x0031, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۥۣ */
    public static final Object m9601(C5825 c5825, float f, InterfaceC2714 interfaceC2714, InterfaceC2714 interfaceC2715, AbstractC0772 abstractC0772) {
        C0380 c0380;
        C0380 c0381 = null;
        if (interfaceC2715 != null) {
            boolean z = interfaceC2715 instanceof C3656;
            c0380 = f19059;
            if (z || (interfaceC2715 instanceof C3082) || (interfaceC2715 instanceof C0266) || (interfaceC2715 instanceof C3213)) {
                c0381 = c0380;
            }
        } else if (interfaceC2714 != null) {
            boolean z2 = interfaceC2714 instanceof C3656;
            c0380 = f19058;
            if (z2 || (interfaceC2714 instanceof C3082)) {
                c0381 = c0380;
            } else if (interfaceC2714 instanceof C0266) {
                c0381 = f19057;
            } else if (interfaceC2714 instanceof C3213) {
                c0381 = c0380;
            }
        }
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (c0381 != null) {
            Object objM9634 = C5825.m9634(c5825, new C4497(f), c0381, abstractC0772, 12);
            if (objM9634 == enumC2282) {
                return objM9634;
            }
        } else {
            Object objM9636 = c5825.m9636(abstractC0772, new C4497(f));
            if (objM9636 == enumC2282) {
                return objM9636;
            }
        }
        return C2358.f7817;
    }
}
