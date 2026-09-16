package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥٟؐؖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0143 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f565;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f566;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f567;

    /* JADX INFO: renamed from: ۥۜ */
    public InterfaceC0155 f569;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0155 f570;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f571;

    /* JADX INFO: renamed from: ۦِ */
    public final /* synthetic */ int f572;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f574;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f568 = true;

    /* JADX INFO: renamed from: ۦٛ */
    public final HashMap f573 = new HashMap();

    public C0143(InterfaceC0155 interfaceC0155, int i) {
        this.f572 = i;
        this.f570 = interfaceC0155;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m313(AbstractC1311 abstractC1311, AbstractC4642 abstractC4642) {
        switch (this.f572) {
            case 0:
                return abstractC1311.mo567(abstractC4642);
            default:
                return abstractC1311.mo2793().mo567(abstractC4642);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m314() {
        m317();
        return this.f569 != null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m315() {
        this.f568 = true;
        InterfaceC0155 interfaceC0155 = this.f570;
        InterfaceC0155 interfaceC0155Mo332 = interfaceC0155.mo332();
        if (interfaceC0155Mo332 == null) {
            return;
        }
        if (this.f565) {
            interfaceC0155Mo332.mo329();
        } else if (this.f566 || this.f571) {
            interfaceC0155Mo332.requestLayout();
        }
        if (this.f567) {
            interfaceC0155.mo329();
        }
        if (this.f574) {
            interfaceC0155.requestLayout();
        }
        interfaceC0155Mo332.mo330().m315();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Map m316(AbstractC1311 abstractC1311) {
        switch (this.f572) {
            case 0:
                return abstractC1311.mo2789().mo621();
            default:
                return abstractC1311.mo2793().mo2789().mo621();
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m317() {
        C0143 c0143Mo330;
        C0143 c0143Mo331;
        boolean zM319 = m319();
        InterfaceC0155 interfaceC0155 = this.f570;
        if (!zM319) {
            InterfaceC0155 interfaceC0155Mo332 = interfaceC0155.mo332();
            if (interfaceC0155Mo332 == null) {
                return;
            }
            interfaceC0155 = interfaceC0155Mo332.mo330().f569;
            if (interfaceC0155 == null || !interfaceC0155.mo330().m319()) {
                InterfaceC0155 interfaceC0156 = this.f569;
                if (interfaceC0156 == null || interfaceC0156.mo330().m319()) {
                    return;
                }
                InterfaceC0155 interfaceC0155Mo333 = interfaceC0156.mo332();
                if (interfaceC0155Mo333 != null && (c0143Mo331 = interfaceC0155Mo333.mo330()) != null) {
                    c0143Mo331.m317();
                }
                InterfaceC0155 interfaceC0155Mo334 = interfaceC0156.mo332();
                interfaceC0155 = (interfaceC0155Mo334 == null || (c0143Mo330 = interfaceC0155Mo334.mo330()) == null) ? null : c0143Mo330.f569;
            }
        }
        this.f569 = interfaceC0155;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m318(AbstractC4642 abstractC4642, int i, AbstractC1311 abstractC1311) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jM8623 = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.f572) {
                    case 0:
                        InterfaceC4384 interfaceC4384 = abstractC1311.f4522;
                        if (interfaceC4384 != null) {
                            C0281 c0281 = (C0281) interfaceC4384;
                            float[] fArrM587 = c0281.m587();
                            if (!c0281.f1023) {
                                jM8623 = C0132.m292(jM8623, fArrM587);
                            }
                        }
                        jM8623 = C5063.m8623(jM8623, abstractC1311.f4531);
                        break;
                    default:
                        long j = abstractC1311.mo2793().f6749;
                        jM8623 = C1553.m3304((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jM8623);
                        break;
                }
                abstractC1311 = abstractC1311.f4514;
                if (AbstractC3831.m6874(abstractC1311, this.f570.mo333())) {
                    int iRound = Math.round(abstractC4642 instanceof C2779 ? Float.intBitsToFloat((int) (jM8623 & 4294967295L)) : Float.intBitsToFloat((int) (jM8623 >> 32)));
                    HashMap map = this.f573;
                    if (map.containsKey(abstractC4642)) {
                        int iIntValue = ((Number) AbstractC4554.m7912(abstractC4642, map)).intValue();
                        C2779 c2779 = AbstractC2811.f9384;
                        iRound = ((Number) abstractC4642.f15317.mo219(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(abstractC4642, Integer.valueOf(iRound));
                    return;
                }
            } while (!m316(abstractC1311).containsKey(abstractC4642));
            float fM313 = m313(abstractC1311, abstractC4642);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fM313);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fM313);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m319() {
        return this.f565 || this.f566 || this.f567 || this.f574;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m320() {
        HashMap map = this.f573;
        map.clear();
        C2932 c2932 = new C2932(0, this);
        InterfaceC0155 interfaceC0155 = this.f570;
        interfaceC0155.mo331(c2932);
        map.putAll(m316(interfaceC0155.mo333()));
        this.f568 = false;
    }
}
