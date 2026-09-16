package p000;

/* JADX INFO: renamed from: ۥٝؔ۟ۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1885 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1808 f6258;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C5521 f6259;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f6260;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1885(C1808 c1808, C5521 c5521, int i) {
        super(1);
        this.f6260 = i;
        this.f6258 = c1808;
        this.f6259 = c5521;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        InterfaceC0215 interfaceC0215;
        InterfaceC0215 interfaceC0216;
        int i = this.f6260;
        C1808 c1808 = this.f6258;
        C5521 c5521 = this.f6259;
        switch (i) {
            case 0:
                C2451 c2451 = (C2451) obj;
                EnumC0211 enumC0211 = EnumC0211.f796;
                EnumC0211 enumC0212 = EnumC0211.f795;
                if (c2451.m4575(enumC0211, enumC0212)) {
                    C3075 c3075 = c1808.f6021.f12212;
                    return (c3075 == null || (interfaceC0216 = c3075.f10322) == null) ? AbstractC0757.f2750 : interfaceC0216;
                }
                if (!c2451.m4575(enumC0212, EnumC0211.f793)) {
                    return AbstractC0757.f2750;
                }
                C3075 c3076 = c5521.f18231.f12212;
                return (c3076 == null || (interfaceC0215 = c3076.f10322) == null) ? AbstractC0757.f2750 : interfaceC0215;
            default:
                int iOrdinal = ((EnumC0211) obj).ordinal();
                float f = 0.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        f = 1.0f;
                    } else {
                        if (iOrdinal != 2) {
                            C1078.m2275();
                            return null;
                        }
                        if (c5521.f18231.f12212 == null) {
                            f = 1.0f;
                        }
                    }
                } else if (c1808.f6021.f12212 == null) {
                    f = 1.0f;
                }
                return Float.valueOf(f);
        }
    }
}
