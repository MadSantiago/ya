package p000;

/* JADX INFO: renamed from: ۦؚٛؔۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4624 extends AbstractC1842 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f15253;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f15254;

    public /* synthetic */ C4624(int i, Object obj) {
        this.f15254 = i;
        this.f15253 = obj;
    }

    @Override // p000.AbstractC1842
    /* JADX INFO: renamed from: ۥؗ */
    public final EnumC2459 mo3627() {
        int i = this.f15254;
        Object obj = this.f15253;
        switch (i) {
            case 0:
                return ((AbstractC3625) obj).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0850) obj).getLayoutDirection();
        }
    }

    @Override // p000.AbstractC1842
    /* JADX INFO: renamed from: ۥُ */
    public final int mo3628() {
        int i = this.f15254;
        Object obj = this.f15253;
        switch (i) {
            case 0:
                return ((AbstractC3625) obj).mo569();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0850) obj).getRoot().f2261.f4252.f985;
        }
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        int i = this.f15254;
        Object obj = this.f15253;
        switch (i) {
            case 0:
                return ((AbstractC3625) obj).mo746();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0850) obj).getDensity().mo746();
        }
    }

    @Override // p000.AbstractC1842
    /* JADX INFO: renamed from: ۥۣ */
    public float mo3630(C0341 c0341) {
        float fIntBitsToFloat;
        int iM518;
        switch (this.f15254) {
            case 0:
                InterfaceC5731 interfaceC5731 = c0341.f1265;
                if (interfaceC5731 != null) {
                    return ((Number) interfaceC5731.mo219(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC3625 abstractC3625 = (AbstractC3625) this.f15253;
                if (abstractC3625.f12092) {
                    return Float.NaN;
                }
                AbstractC3625 abstractC3626 = abstractC3625;
                while (true) {
                    C2186 c2186 = abstractC3626.f12089;
                    float f = (c2186 == null || (iM518 = AbstractC0246.m518((C0341[]) c2186.f7249, c0341)) < 0) ? Float.NaN : ((float[]) c2186.f7246)[iM518];
                    if (!Float.isNaN(f)) {
                        abstractC3626.m6454(abstractC3625.mo2790(), c0341);
                        InterfaceC2015 interfaceC2015Mo2798 = abstractC3626.mo2798();
                        InterfaceC2015 interfaceC2015Mo2799 = abstractC3625.mo2798();
                        switch (c0341.f1264) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2015Mo2799.mo2783(interfaceC2015Mo2798, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (interfaceC2015Mo2798.mo2799() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2015Mo2799.mo2783(interfaceC2015Mo2798, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((int) (interfaceC2015Mo2798.mo2799() & 4294967295L)) / 2.0f)))) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    AbstractC3625 abstractC3625Mo2795 = abstractC3626.mo2795();
                    if (abstractC3625Mo2795 == null) {
                        abstractC3626.m6454(abstractC3625.mo2790(), c0341);
                        return Float.NaN;
                    }
                    abstractC3626 = abstractC3625Mo2795;
                }
                break;
            default:
                return super.mo3630(c0341);
        }
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        int i = this.f15254;
        Object obj = this.f15253;
        switch (i) {
            case 0:
                return ((AbstractC3625) obj).mo754();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC0850) obj).getDensity().mo754();
        }
    }
}
