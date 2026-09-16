package p000;

/* JADX INFO: renamed from: ۦْٟٝؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4757 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public C4536 f15697;

    /* JADX INFO: renamed from: ۥٕ */
    public EnumC1616 f15698;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f15699;

    /* JADX INFO: renamed from: ۦٚ */
    public InterfaceC5731 f15700;

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(j);
        if (!interfaceC2427.mo323() || !this.f15699) {
            C3869 c3869 = (C3869) this.f15700.mo219(new C4207((((long) abstractC0275Mo3597.f984) & 4294967295L) | (((long) abstractC0275Mo3597.f985) << 32)), new C3693(j));
            C4536 c4536 = this.f15697;
            C3402 c3402 = (C3402) c3869.f12915;
            Object obj = c3869.f12914;
            if (!AbstractC3831.m6874(c4536.m7862(), c3402)) {
                c4536.f14994.setValue(c3402);
                C1387 c1387 = c4536.f14988.f8435;
                boolean zM2951 = c1387.m2951();
                if (zM2951) {
                    try {
                        C2099 c2099 = c4536.f14995;
                        float fM6157 = c4536.m7862().m6157(obj);
                        if (!Float.isNaN(fM6157)) {
                            C2099.m4045(c2099, fM6157);
                            c4536.m7860(null);
                        }
                        c4536.m7863(obj);
                        c1387.mo2950(null);
                    } catch (Throwable th) {
                        c1387.mo2950(null);
                        throw th;
                    }
                }
                if (!zM2951) {
                    c4536.m7860(obj);
                }
            }
        }
        this.f15699 = interfaceC2427.mo323() || this.f15699;
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, new C3464(interfaceC2427, this, abstractC0275Mo3597, 7));
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        this.f15699 = false;
    }
}
