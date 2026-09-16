package p000;

/* JADX INFO: renamed from: ۦؕۜ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3317 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥۙ */
    public static final C4124 f11111 = new C4124();

    /* JADX INFO: renamed from: ۥً */
    public InterfaceC4464 f11112;

    /* JADX INFO: renamed from: ۥٕ */
    public EnumC1616 f11113;

    /* JADX INFO: renamed from: ۦٚ */
    public C5086 f11114;

    /* JADX INFO: renamed from: ۥؑ */
    public final boolean m6095(C1973 c1973, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.f11113 != EnumC1616.f5425) {
                }
            } else if (i != 1 && i != 2) {
                C1078.m2276("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (m6096(i) ? c1973.f6531 > 0 : c1973.f6530 < this.f11112.mo2588() - 1) {
                return true;
            }
        } else if (this.f11113 != EnumC1616.f5424) {
            if (m6096(i)) {
            }
        }
        return false;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(j);
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C2785(abstractC0275Mo3597, 4));
    }

    /* JADX INFO: renamed from: ۥٜ */
    public final boolean m6096(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = AbstractC5537.m9270(this).f2272.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            C1078.m2275();
            return false;
        }
        if (i != 4) {
            C1078.m2276("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = AbstractC5537.m9270(this).f2272.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        C1078.m2275();
        return false;
    }
}
