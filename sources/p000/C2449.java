package p000;

/* JADX INFO: renamed from: ۥ۟ؔۖٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2449 {

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC2015 f8156;

    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC2015 f8157 = null;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3828 f8158;

    public C2449(C3828 c3828, InterfaceC2015 interfaceC2015) {
        this.f8158 = c3828;
        this.f8156 = interfaceC2015;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m4570(long j) {
        long jM4574 = m4574(m4573(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM4574));
        C3828 c3828 = this.f8158;
        int iM4330 = c3828.f12696.m4330(fIntBitsToFloat);
        int i = (int) (jM4574 >> 32);
        return Float.intBitsToFloat(i) >= c3828.m6825(iM4330) && Float.intBitsToFloat(i) <= c3828.m6833(iM4330);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final long m4571(long j) {
        InterfaceC2015 interfaceC2015;
        InterfaceC2015 interfaceC2016 = this.f8157;
        if (interfaceC2016 != null) {
            if (!interfaceC2016.mo2807()) {
                interfaceC2016 = null;
            }
            if (interfaceC2016 != null && (interfaceC2015 = this.f8156) != null) {
                InterfaceC2015 interfaceC2017 = interfaceC2015.mo2807() ? interfaceC2015 : null;
                if (interfaceC2017 != null) {
                    return interfaceC2017.mo2783(interfaceC2016, j);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m4572(long j, boolean z) {
        if (z) {
            j = m4573(j);
        }
        return this.f8158.f12696.m4339(m4574(j));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m4573(long j) {
        C2793 c2793Mo2794;
        InterfaceC2015 interfaceC2015 = this.f8157;
        C2793 c2793 = C2793.f9340;
        if (interfaceC2015 != null) {
            if (interfaceC2015.mo2807()) {
                InterfaceC2015 interfaceC2016 = this.f8156;
                c2793Mo2794 = interfaceC2016 != null ? interfaceC2016.mo2794(interfaceC2015, true) : null;
            } else {
                c2793Mo2794 = c2793;
            }
            if (c2793Mo2794 != null) {
                c2793 = c2793Mo2794;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = c2793.f9343;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = c2793.f9341;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = c2793.f9342;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = c2793.f9344;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final long m4574(long j) {
        InterfaceC2015 interfaceC2015;
        InterfaceC2015 interfaceC2016 = this.f8157;
        if (interfaceC2016 != null) {
            if (!interfaceC2016.mo2807()) {
                interfaceC2016 = null;
            }
            if (interfaceC2016 != null && (interfaceC2015 = this.f8156) != null) {
                InterfaceC2015 interfaceC2017 = interfaceC2015.mo2807() ? interfaceC2015 : null;
                if (interfaceC2017 != null) {
                    return interfaceC2016.mo2783(interfaceC2017, j);
                }
            }
        }
        return j;
    }
}
