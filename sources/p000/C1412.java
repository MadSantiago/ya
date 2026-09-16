package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥٕؖؔ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1412 extends AbstractC5265 {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f4850;

    /* JADX INFO: renamed from: ۥّ */
    public List f4852;

    /* JADX INFO: renamed from: ۥْ */
    public float f4853;

    /* JADX INFO: renamed from: ۥٓ */
    public float f4854;

    /* JADX INFO: renamed from: ۥۗ */
    public float[] f4855;

    /* JADX INFO: renamed from: ۥۜ */
    public C0935 f4856;

    /* JADX INFO: renamed from: ۦؚ */
    public float f4858;

    /* JADX INFO: renamed from: ۦٌ */
    public float f4859;

    /* JADX INFO: renamed from: ۦِ */
    public final C2932 f4860;

    /* JADX INFO: renamed from: ۦٛ */
    public InterfaceC4745 f4861;

    /* JADX INFO: renamed from: ۦۗ */
    public String f4862;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f4863;

    /* JADX INFO: renamed from: ۦۚ */
    public float f4864;

    /* JADX INFO: renamed from: ۦ۟ */
    public float f4865;

    /* JADX INFO: renamed from: ۦۨ */
    public float f4866;

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList f4849 = new ArrayList();

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f4857 = true;

    /* JADX INFO: renamed from: ۥُ */
    public long f4851 = C1327.f4591;

    public C1412() {
        int i = AbstractC0184.f672;
        this.f4852 = C2340.f7777;
        this.f4863 = true;
        this.f4860 = new C2932(19, this);
        this.f4862 = "";
        this.f4866 = 1.0f;
        this.f4865 = 1.0f;
        this.f4850 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f4862);
        ArrayList arrayList = this.f4849;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC5265 abstractC5265 = (AbstractC5265) arrayList.get(i);
            sb.append("\t");
            sb.append(abstractC5265.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m2979(int i, AbstractC5265 abstractC5265) {
        ArrayList arrayList = this.f4849;
        if (i < arrayList.size()) {
            arrayList.set(i, abstractC5265);
        } else {
            arrayList.add(abstractC5265);
        }
        m2984(abstractC5265);
        abstractC5265.mo2983(this.f4860);
        m8896();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m2980(long j) {
        if (this.f4857 && j != 16) {
            long j2 = this.f4851;
            if (j2 == 16) {
                this.f4851 = j;
                return;
            }
            int i = AbstractC0184.f672;
            if (C1327.m2830(j2) == C1327.m2830(j) && C1327.m2825(j2) == C1327.m2825(j) && C1327.m2829(j2) == C1327.m2829(j)) {
                return;
            }
            this.f4857 = false;
            this.f4851 = C1327.f4591;
        }
    }

    @Override // p000.AbstractC5265
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4745 mo2981() {
        return this.f4861;
    }

    @Override // p000.AbstractC5265
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2982(InterfaceC2442 interfaceC2442) {
        if (this.f4850) {
            float[] fArrM293 = this.f4855;
            if (fArrM293 == null) {
                fArrM293 = C0132.m293();
                this.f4855 = fArrM293;
            } else {
                C0132.m294(fArrM293);
            }
            C0132.m291(fArrM293, this.f4853 + this.f4859, this.f4854 + this.f4864);
            float f = this.f4858;
            if (fArrM293.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrM293[0];
                float f3 = fArrM293[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrM293[1];
                float f8 = fArrM293[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrM293[2];
                float f12 = fArrM293[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrM293[3];
                float f16 = fArrM293[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrM293[0] = f4;
                fArrM293[1] = f9;
                fArrM293[2] = f13;
                fArrM293[3] = f17;
                fArrM293[4] = f6;
                fArrM293[5] = f10;
                fArrM293[6] = f14;
                fArrM293[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.f4866;
            float f19 = this.f4865;
            if (fArrM293.length >= 16) {
                fArrM293[0] = fArrM293[0] * f18;
                fArrM293[1] = fArrM293[1] * f18;
                fArrM293[2] = fArrM293[2] * f18;
                fArrM293[3] = fArrM293[3] * f18;
                fArrM293[4] = fArrM293[4] * f19;
                fArrM293[5] = fArrM293[5] * f19;
                fArrM293[6] = fArrM293[6] * f19;
                fArrM293[7] = fArrM293[7] * f19;
                fArrM293[8] = fArrM293[8] * 1.0f;
                fArrM293[9] = fArrM293[9] * 1.0f;
                fArrM293[10] = fArrM293[10] * 1.0f;
                fArrM293[11] = fArrM293[11] * 1.0f;
            }
            C0132.m291(fArrM293, -this.f4859, -this.f4864);
            this.f4850 = false;
        }
        if (this.f4863) {
            if (!this.f4852.isEmpty()) {
                C0935 c0935M669 = this.f4856;
                if (c0935M669 == null) {
                    c0935M669 = AbstractC0317.m669();
                    this.f4856 = c0935M669;
                }
                AbstractC3831.m6871(this.f4852, c0935M669);
            }
            this.f4863 = false;
        }
        C2808 c2808Mo3908 = interfaceC2442.mo3908();
        long jM5355 = c2808Mo3908.m5355();
        c2808Mo3908.m5353().mo2092();
        try {
            C2808 c2808 = (C2808) ((C5086) c2808Mo3908.f9378).f16877;
            float[] fArr = this.f4855;
            if (fArr != null) {
                c2808.m5353().mo2086(fArr);
            }
            C0935 c0935 = this.f4856;
            if (!this.f4852.isEmpty() && c0935 != null) {
                c2808.m5353().mo2083(c0935);
            }
            ArrayList arrayList = this.f4849;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC5265) arrayList.get(i)).mo2982(interfaceC2442);
            }
        } finally {
            c2808Mo3908.m5353().mo2095();
            c2808Mo3908.m5351(jM5355);
        }
    }

    @Override // p000.AbstractC5265
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2983(C2932 c2932) {
        this.f4861 = c2932;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m2984(AbstractC5265 abstractC5265) {
        if (!(abstractC5265 instanceof C2182)) {
            if (abstractC5265 instanceof C1412) {
                C1412 c1412 = (C1412) abstractC5265;
                if (c1412.f4857 && this.f4857) {
                    m2980(c1412.f4851);
                    return;
                } else {
                    this.f4857 = false;
                    this.f4851 = C1327.f4591;
                    return;
                }
            }
            return;
        }
        C2182 c2182 = (C2182) abstractC5265;
        AbstractC0548 abstractC0548 = c2182.f7219;
        if (this.f4857 && abstractC0548 != null) {
            if (abstractC0548 instanceof C0547) {
                m2980(((C0547) abstractC0548).f1966);
            } else {
                this.f4857 = false;
                this.f4851 = C1327.f4591;
            }
        }
        AbstractC0548 abstractC0549 = c2182.f7228;
        if (this.f4857 && abstractC0549 != null) {
            if (abstractC0549 instanceof C0547) {
                m2980(((C0547) abstractC0549).f1966);
            } else {
                this.f4857 = false;
                this.f4851 = C1327.f4591;
            }
        }
    }
}
