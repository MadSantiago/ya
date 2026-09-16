package p000;

/* JADX INFO: renamed from: ۥُْؔؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1210 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2951 f4182;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ long f4183;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f4184;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1210(C2951 c2951, long j, int i) {
        super(1);
        this.f4184 = i;
        this.f4182 = c2951;
        this.f4183 = j;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        InterfaceC4745 interfaceC4745;
        InterfaceC4745 interfaceC4746;
        int iOrdinal;
        int i = this.f4184;
        long jM1862 = 0;
        long j = this.f4183;
        C2951 c2951 = this.f4182;
        switch (i) {
            case 0:
                int iOrdinal2 = ((EnumC0211) obj).ordinal();
                if (iOrdinal2 == 0) {
                    C5388 c5388 = c2951.f9903.f6021.f12209;
                    if (c5388 != null && (interfaceC4745 = c5388.f17808) != null) {
                        j = ((C4207) interfaceC4745.mo211(new C4207(j))).f13969;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        C1078.m2275();
                        return null;
                    }
                    C5388 c5389 = c2951.f9901.f18231.f12209;
                    if (c5389 != null && (interfaceC4746 = c5389.f17808) != null) {
                        j = ((C4207) interfaceC4746.mo211(new C4207(j))).f13969;
                    }
                }
                return new C4207(j);
            case 1:
                EnumC0211 enumC0211 = (EnumC0211) obj;
                if (c2951.f9905 != null && c2951.m5518() != null && !AbstractC3831.m6874(c2951.f9905, c2951.m5518()) && (iOrdinal = enumC0211.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C1078.m2275();
                        return null;
                    }
                    C5388 c53810 = c2951.f9901.f18231.f12209;
                    if (c53810 != null) {
                        InterfaceC4745 interfaceC4747 = c53810.f17808;
                        long j2 = this.f4183;
                        long j3 = ((C4207) interfaceC4747.mo211(new C4207(j2))).f13969;
                        InterfaceC5807 interfaceC5807M5518 = c2951.m5518();
                        EnumC2459 enumC2459 = EnumC2459.f8215;
                        jM1862 = C0873.m1862(interfaceC5807M5518.mo608(j2, j3, enumC2459), c2951.f9905.mo608(j2, j3, enumC2459));
                    }
                }
                return new C0873(jM1862);
            default:
                EnumC0211 enumC0212 = (EnumC0211) obj;
                C2565 c2565 = c2951.f9903.f6021.f12211;
                long j4 = c2565 != null ? ((C0873) c2565.f8563.mo211(new C4207(j))).f3199 : 0L;
                C2565 c2566 = c2951.f9901.f18231.f12211;
                long j5 = c2566 != null ? ((C0873) c2566.f8563.mo211(new C4207(j))).f3199 : 0L;
                int iOrdinal3 = enumC0212.ordinal();
                if (iOrdinal3 == 0) {
                    jM1862 = j4;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        C1078.m2275();
                        return null;
                    }
                    jM1862 = j5;
                }
                return new C0873(jM1862);
        }
    }
}
