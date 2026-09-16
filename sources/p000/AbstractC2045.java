package p000;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۥِۖؒٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2045 extends AbstractC3625 implements InterfaceC1827 {

    /* JADX INFO: renamed from: ۥً */
    public final AbstractC1311 f6744;

    /* JADX INFO: renamed from: ۥٕ */
    public LinkedHashMap f6745;

    /* JADX INFO: renamed from: ۦؖ */
    public final C1254 f6747;

    /* JADX INFO: renamed from: ۦؙ */
    public InterfaceC5370 f6748;

    /* JADX INFO: renamed from: ۦٚ */
    public long f6749 = 0;

    /* JADX INFO: renamed from: ۥۙ */
    public final C4492 f6746 = new C4492(this);

    public AbstractC2045(AbstractC1311 abstractC1311) {
        this.f6744 = abstractC1311;
        C1254 c1254 = AbstractC0664.f2448;
        this.f6747 = new C1254();
    }

    @Override // p000.InterfaceC0151
    public final EnumC2459 getLayoutDirection() {
        return this.f6744.f4513.f2272;
    }

    /* JADX INFO: renamed from: ۥؘ */
    public void mo3988() {
        mo2789().mo620();
    }

    /* JADX INFO: renamed from: ۥٔ */
    public final long m3989(AbstractC2045 abstractC2045, boolean z) {
        long jM1861 = 0;
        while (!AbstractC3831.m6874(this, abstractC2045)) {
            if (!this.f12093 || !z) {
                jM1861 = C0873.m1861(jM1861, this.f6749);
            }
            this = this.f6744.f4514.mo2793();
        }
        return jM1861;
    }

    @Override // p000.AbstractC3625, p000.InterfaceC0151
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo323() {
        return true;
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۥٗ */
    public final AbstractC3625 mo2785() {
        AbstractC1311 abstractC1311 = this.f6744.f4530;
        if (abstractC1311 != null) {
            return abstractC1311.mo2793();
        }
        return null;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f6744.mo746();
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۥۛ */
    public final InterfaceC5370 mo2789() {
        InterfaceC5370 interfaceC5370 = this.f6748;
        if (interfaceC5370 != null) {
            return interfaceC5370;
        }
        throw AbstractC3761.m6633("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۥ۠ */
    public final C0605 mo2790() {
        return this.f6744.f4513;
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۦؐ */
    public final boolean mo2792() {
        return this.f6748 != null;
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۦؘ */
    public final AbstractC3625 mo2795() {
        AbstractC1311 abstractC1311 = this.f6744.f4514;
        if (abstractC1311 != null) {
            return abstractC1311.mo2793();
        }
        return null;
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۦً */
    public final void mo2796() {
        mo571(this.f6749, 0.0f, null);
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۦٍ */
    public final long mo2797() {
        return this.f6749;
    }

    @Override // p000.AbstractC0275, p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦِ */
    public final Object mo570() {
        return this.f6744.mo570();
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۦٔ */
    public final InterfaceC2015 mo2798() {
        return this.f6746;
    }

    /* JADX INFO: renamed from: ۦٜ */
    public final void m3990(long j) {
        if (!C0873.m1863(this.f6749, j)) {
            this.f6749 = j;
            AbstractC1311 abstractC1311 = this.f6744;
            C2921 c2921 = abstractC1311.f4513.f2261.f4240;
            if (c2921 != null) {
                c2921.m5508();
            }
            AbstractC3625.m6452(abstractC1311);
        }
        if (this.f12092) {
            return;
        }
        m6453(mo2789());
    }

    @Override // p000.AbstractC0275
    /* JADX INFO: renamed from: ۦٝ */
    public final void mo571(long j, float f, InterfaceC4745 interfaceC4745) {
        m3990(j);
        if (this.f12095) {
            return;
        }
        mo3988();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f6744.mo754();
    }

    /* JADX INFO: renamed from: ۦۡ */
    public final void m3991(InterfaceC5370 interfaceC5370) {
        LinkedHashMap linkedHashMap;
        if (interfaceC5370 != null) {
            m572((((long) interfaceC5370.mo618()) & 4294967295L) | (((long) interfaceC5370.mo619()) << 32));
        } else {
            m572(0L);
        }
        if (!AbstractC3831.m6874(this.f6748, interfaceC5370) && interfaceC5370 != null && ((((linkedHashMap = this.f6745) != null && !linkedHashMap.isEmpty()) || !interfaceC5370.mo621().isEmpty()) && !AbstractC3831.m6874(interfaceC5370.mo621(), this.f6745))) {
            this.f6744.f4513.f2261.f4240.f9808.m315();
            LinkedHashMap linkedHashMap2 = this.f6745;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f6745 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC5370.mo621());
        }
        this.f6748 = interfaceC5370;
    }
}
