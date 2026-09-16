package p000;

import android.graphics.Paint;

/* JADX INFO: renamed from: ۥؘؘؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0644 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f2411;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f2412;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f2413;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f2414;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f2415;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2416;

    public /* synthetic */ C0644(C4521 c4521, InterfaceC4120 interfaceC4120, C5745 c5745, C5837 c5837, C0547 c0547) {
        this.f2416 = 2;
        this.f2412 = c4521;
        this.f2413 = interfaceC4120;
        this.f2415 = c5745;
        this.f2411 = c5837;
        this.f2414 = c0547;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i;
        int i2 = this.f2416;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f2414;
        Object obj3 = this.f2411;
        Object obj4 = this.f2415;
        Object obj5 = this.f2413;
        Object obj6 = this.f2412;
        switch (i2) {
            case 0:
                C2734 c2734 = (C2734) obj;
                C4306 c4306 = ((C3969) obj6).f13271;
                c2734.f9052 = (C5745) obj4;
                c2734.f9058 = (C2350) obj5;
                c2734.f9048 = (C3464) obj3;
                c2734.f9054 = (InterfaceC4745) obj2;
                c2734.f9049 = c4306 != null ? c4306.f14245 : null;
                c2734.f9050 = c4306 != null ? c4306.f14243 : null;
                c2734.f9060 = c4306 != null ? (InterfaceC2509) AbstractC2552.m4807(c4306, AbstractC2853.f9541) : null;
                return c2358;
            case 1:
                C3031 c3031 = (C3031) obj4;
                C5450 c5450 = (C5450) obj6;
                C1916 c1916 = (C1916) obj5;
                C4545 c4545 = (C4545) obj3;
                C5662 c5662 = (C5662) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                C5391 c5391M5620 = C3031.m5620(c3031.f10195);
                if (c5391M5620 != null) {
                    C5002 c5002 = c3031.f8530;
                    long j = c5391M5620.f17821;
                    long j2 = c5391M5620.f17822;
                    ((C5426) c5002.f16551).m9102(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((C5426) c5002.f16550).m9102(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    C5391 c5391M9081 = ((C5391) c5450.f17965).m9081(c5391M5620);
                    c5450.f17965 = c5391M9081;
                    float fM7873 = c4545.m7873(c4545.m7867(c5391M9081.f17822));
                    c1916.f6312 = fM7873;
                    c5662.f18631 = !C4773.m8133(fM7873 - fFloatValue);
                }
                return Boolean.valueOf(c5391M5620 != null);
            default:
                InterfaceC4120 interfaceC4120 = (InterfaceC4120) obj5;
                C5745 c5745 = (C5745) obj4;
                C5837 c5837 = (C5837) obj3;
                C0547 c0547 = (C0547) obj2;
                C2497 c2497 = (C2497) obj;
                c2497.m4644();
                C2004 c2004 = c2497.f8304;
                float fM1711 = ((C4521) obj6).f14936.m1711();
                if (fM1711 != 0.0f) {
                    long j3 = c5745.f18943;
                    int i3 = C3346.f11195;
                    int iMo4319 = interfaceC4120.mo4319((int) (j3 >> 32));
                    C2449 c2449M9648 = c5837.m9648();
                    C2793 c2793M6824 = c2449M9648 != null ? c2449M9648.f8158.m6824(iMo4319) : new C2793(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(c2497.mo741(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = c2793M6824.f9343 + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c2004.mo4567() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c2793M6824.f9342)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c2793M6824.f9344)) & 4294967295L);
                    InterfaceC3212 interfaceC3212 = c2004.f6604.f8014;
                    C0376 c0376M2131 = c2004.f6602;
                    if (c0376M2131 == null) {
                        c0376M2131 = AbstractC0993.m2131();
                        c0376M2131.m819(1);
                        c2004.f6602 = c0376M2131;
                    }
                    Paint paint = (Paint) c0376M2131.f1400;
                    c0547.mo1239(fM1711, c2004.mo4567(), c0376M2131);
                    if (!AbstractC3831.m6874((C1516) c0376M2131.f1402, null)) {
                        c0376M2131.m810(null);
                    }
                    if (c0376M2131.f1401 != 3) {
                        c0376M2131.m808(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        c0376M2131.m814(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (c0376M2131.m809() == 0) {
                        i = 0;
                    } else {
                        i = 0;
                        c0376M2131.m817(0);
                    }
                    if (c0376M2131.m806() != 0) {
                        c0376M2131.m813(i);
                    }
                    if (!paint.isFilterBitmap()) {
                        c0376M2131.m816(1);
                    }
                    interfaceC3212.mo2093(jFloatToRawIntBits, jFloatToRawIntBits2, c0376M2131);
                }
                return c2358;
        }
    }

    public /* synthetic */ C0644(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f2416 = i;
        this.f2415 = obj;
        this.f2412 = obj2;
        this.f2413 = obj3;
        this.f2411 = obj4;
        this.f2414 = obj5;
    }
}
