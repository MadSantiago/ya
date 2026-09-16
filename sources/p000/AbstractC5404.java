package p000;

/* JADX INFO: renamed from: ۦ۠ؕٝۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5404 {
    static {
        AbstractC5568.m9370(40.0f, 40.0f);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m9086(final C5745 c5745, final InterfaceC4745 interfaceC4745, final InterfaceC0705 interfaceC0705, final boolean z, final C3564 c3564, final C2826 c2826, final C0163 c0163, final boolean z2, final int i, final int i2, final C2316 c2316, InterfaceC4745 interfaceC4746, final C2243 c2243, final C0547 c0547, final C0857 c0857, C5362 c5362, final int i3) {
        final InterfaceC4745 interfaceC4747;
        InterfaceC4745 interfaceC4748;
        C0221 c0221;
        int i4;
        c5362.m8979(-971111025);
        int i5 = i3 | (c5362.m8963(c5745) ? 4 : 2) | (c5362.m8977(interfaceC4745) ? 32 : 16) | (c5362.m8963(interfaceC0705) ? 256 : 128) | (c5362.m9006(z) ? 2048 : 1024) | (c5362.m9006(false) ? 16384 : 8192) | (c5362.m8963(c3564) ? 131072 : 65536) | (c5362.m8963(c2826) ? 1048576 : 524288) | (c5362.m8963(c0163) ? 8388608 : 4194304) | (c5362.m9006(z2) ? 67108864 : 33554432) | (c5362.m8988(i) ? 536870912 : 268435456);
        int i6 = 196608 | (c5362.m8988(i2) ? 4 : 2) | (c5362.m8963(c2316) ? 32 : 16) | 384 | (c5362.m8963(c2243) ? 2048 : 1024) | (c5362.m8963(c0547) ? 16384 : 8192);
        if (c5362.m9011(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 74899) == 74898) ? false : true)) {
            c5362.m8971();
            int i7 = i3 & 1;
            C4036 c4036 = C2850.f9517;
            if (i7 == 0 || c5362.m8969()) {
                Object objM8999 = c5362.m8999();
                if (objM8999 == c4036) {
                    objM8999 = new C0086(6);
                    c5362.m8987(objM8999);
                }
                interfaceC4748 = (InterfaceC4745) objM8999;
            } else {
                c5362.m8982();
                interfaceC4748 = interfaceC4746;
            }
            c5362.m8964();
            int i8 = c2826.f9442;
            C0591 c0591 = new C0591(i8);
            if (i8 == 0) {
                c0591 = null;
            }
            int i9 = c0591 != null ? c0591.f2198 : 1;
            int i10 = c2826.f9441;
            C0221 c0222 = new C0221(i10);
            if (i10 == -1) {
                c0221 = null;
            }
            if (c0221 != null) {
                c0221 = c0222;
                i4 = c0221.f824;
            } else {
                c0221 = c0222;
                i4 = 1;
            }
            C2350 c2350 = new C2350(z2, 0, true, i9, i4, C5668.f18644);
            boolean z3 = false;
            boolean z4 = !z2;
            int i11 = z2 ? 1 : i2;
            int i12 = z2 ? 1 : i;
            boolean z5 = (i5 & 14) == 4;
            if ((i5 & 112) == 32) {
                z3 = true;
            }
            boolean z6 = z5 | z3;
            Object objM89910 = c5362.m8999();
            if (z6 || objM89910 == c4036) {
                objM89910 = new C0079(3, c5745, interfaceC4745);
                c5362.m8987(objM89910);
            }
            int i13 = i6 << 9;
            InterfaceC4745 interfaceC4749 = interfaceC4748;
            AbstractC2776.m5228(c5745, (InterfaceC4745) objM89910, interfaceC0705, c3564, c2316, interfaceC4749, c2243, c0547, z4, i12, i11, c2350, c0163, z, c0857, c5362, (i5 & 910) | ((i5 >> 6) & 7168) | (i13 & 57344) | 196608 | (i13 & 3670016) | (i13 & 29360128), (i5 & 57344) | ((i5 >> 15) & 896) | (i5 & 7168) | 196608);
            interfaceC4747 = interfaceC4749;
        } else {
            c5362.m8982();
            interfaceC4747 = interfaceC4746;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(interfaceC4745, interfaceC0705, z, c3564, c2826, c0163, z2, i, i2, c2316, interfaceC4747, c2243, c0547, c0857, i3) { // from class: ۦَْؑٝ

                /* JADX INFO: renamed from: ۥؓ */
                public final /* synthetic */ C2243 f12656;

                /* JADX INFO: renamed from: ۥؖ */
                public final /* synthetic */ InterfaceC4745 f12657;

                /* JADX INFO: renamed from: ۥً */
                public final /* synthetic */ C0857 f12658;

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ C3564 f12659;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ InterfaceC0705 f12660;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ boolean f12661;

                /* JADX INFO: renamed from: ۥٖ */
                public final /* synthetic */ C2826 f12662;

                /* JADX INFO: renamed from: ۥٙ */
                public final /* synthetic */ C2316 f12663;

                /* JADX INFO: renamed from: ۥۖ */
                public final /* synthetic */ int f12664;

                /* JADX INFO: renamed from: ۥۧ */
                public final /* synthetic */ C0547 f12665;

                /* JADX INFO: renamed from: ۦٕ */
                public final /* synthetic */ int f12666;

                /* JADX INFO: renamed from: ۦٗ */
                public final /* synthetic */ C0163 f12667;

                /* JADX INFO: renamed from: ۦۛ */
                public final /* synthetic */ boolean f12668;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC4745 f12669;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(1);
                    AbstractC5404.m9086(this.f12670, this.f12669, this.f12660, this.f12661, this.f12659, this.f12662, this.f12667, this.f12668, this.f12664, this.f12666, this.f12663, this.f12657, this.f12656, this.f12665, this.f12658, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }
}
