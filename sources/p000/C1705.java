package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥٜٚؑٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1705 {

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC0215 f5670;

    /* JADX INFO: renamed from: ۥُ */
    public InterfaceC0215 f5671;

    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC0215 f5672;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4745 f5673;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f5674;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4536 f5675;

    public C1705(boolean z, InterfaceC4448 interfaceC4448, InterfaceC4448 interfaceC4449, EnumC0845 enumC0845, InterfaceC4745 interfaceC4745) {
        this.f5674 = z;
        this.f5673 = interfaceC4745;
        if (z && enumC0845 == EnumC0845.f3013) {
            C1078.m2272("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        this.f5670 = AbstractC2762.f9144;
        this.f5675 = new C4536(enumC0845, new C2288(3, interfaceC4448), interfaceC4449, new C0463(6, this), interfaceC4745);
        this.f5671 = AbstractC4489.m7808();
        this.f5672 = AbstractC4489.m7808();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Object m3520(C1705 c1705, EnumC0845 enumC0845, InterfaceC0215 interfaceC0215, AbstractC2426 abstractC2426) {
        Object objM7859 = c1705.f5675.m7859(enumC0845, EnumC4386.f14455, new C2409(c1705, c1705.f5675.f14996.m1711(), interfaceC0215, null), abstractC2426);
        return objM7859 == EnumC2282.f7590 ? objM7859 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m3521(AbstractC2426 abstractC2426) {
        Object objM3520;
        InterfaceC4745 interfaceC4745 = this.f5673;
        EnumC0845 enumC0845 = EnumC0845.f3016;
        return (((Boolean) interfaceC4745.mo211(enumC0845)).booleanValue() && (objM3520 = m3520(this, enumC0845, this.f5672, abstractC2426)) == EnumC2282.f7590) ? objM3520 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Object m3522(AbstractC2426 abstractC2426) {
        Object objM3520;
        if (this.f5674) {
            C1078.m2276("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        InterfaceC4745 interfaceC4745 = this.f5673;
        EnumC0845 enumC0845 = EnumC0845.f3013;
        return (((Boolean) interfaceC4745.mo211(enumC0845)).booleanValue() && (objM3520 = m3520(this, enumC0845, this.f5672, abstractC2426)) == EnumC2282.f7590) ? objM3520 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final Object m3523(AbstractC2426 abstractC2426) {
        Object objM3520;
        Map map = this.f5675.m7862().f11319;
        EnumC0845 enumC0845 = EnumC0845.f3013;
        if (!map.containsKey(enumC0845)) {
            enumC0845 = EnumC0845.f3015;
        }
        return (((Boolean) this.f5673.mo211(enumC0845)).booleanValue() && (objM3520 = m3520(this, enumC0845, this.f5671, abstractC2426)) == EnumC2282.f7590) ? objM3520 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m3524(AbstractC2426 abstractC2426) {
        Object objM3520;
        InterfaceC4745 interfaceC4745 = this.f5673;
        EnumC0845 enumC0845 = EnumC0845.f3015;
        return (((Boolean) interfaceC4745.mo211(enumC0845)).booleanValue() && (objM3520 = m3520(this, enumC0845, this.f5671, abstractC2426)) == EnumC2282.f7590) ? objM3520 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m3525() {
        return this.f5675.f14999.getValue() != EnumC0845.f3016;
    }
}
