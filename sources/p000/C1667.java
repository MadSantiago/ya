package p000;

import java.text.BreakIterator;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۥٙؕٚٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1667 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3828 f5551;

    /* JADX INFO: renamed from: ۥُ */
    public final C1701 f5552;

    /* JADX INFO: renamed from: ۥّ */
    public long f5553;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f5554;

    /* JADX INFO: renamed from: ۥۜ */
    public final C5745 f5555;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1249 f5556;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4120 f5557;

    /* JADX INFO: renamed from: ۦٛ */
    public final C2449 f5558;

    /* JADX INFO: renamed from: ۦۙ */
    public final C1249 f5559;

    public C1667(C5745 c5745, InterfaceC4120 interfaceC4120, C2449 c2449, C1701 c1701) {
        C1249 c1249 = c5745.f18944;
        long j = c5745.f18943;
        C3828 c3828 = c2449 != null ? c2449.f8158 : null;
        this.f5556 = c1249;
        this.f5554 = j;
        this.f5551 = c3828;
        this.f5557 = interfaceC4120;
        this.f5552 = c1701;
        this.f5553 = j;
        this.f5559 = c1249;
        this.f5555 = c5745;
        this.f5558 = c2449;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Integer m3483() {
        C3828 c3828 = this.f5551;
        if (c3828 == null) {
            return null;
        }
        int iM6109 = C3346.m6109(this.f5553);
        InterfaceC4120 interfaceC4120 = this.f5557;
        return Integer.valueOf(interfaceC4120.mo4318(c3828.m6827(c3828.f12696.m4335(interfaceC4120.mo4319(iM6109)))));
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Integer m3484() {
        int iMo4318;
        C3828 c3828 = this.f5551;
        if (c3828 == null) {
            return null;
        }
        for (int iM3487 = m3487(); iM3487 > 0; iM3487--) {
            int length = this.f5559.f4307.length() - 1;
            if (iM3487 <= length) {
                length = iM3487;
            }
            long jM6832 = c3828.m6832(length);
            int i = C3346.f11195;
            int i2 = (int) (jM6832 >> 32);
            if (i2 < iM3487) {
                iMo4318 = this.f5557.mo4318(i2);
                return Integer.valueOf(iMo4318);
            }
        }
        iMo4318 = 0;
        return Integer.valueOf(iMo4318);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final boolean m3485() {
        C3828 c3828 = this.f5551;
        return (c3828 != null ? c3828.m6831(m3487()) : 0) != 2;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m3486(int i, int i2) {
        this.f5553 = AbstractC2765.m5145(i, i2);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final int m3487() {
        long j = this.f5553;
        int i = C3346.f11195;
        return this.f5557.mo4319((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Integer m3488() {
        C3828 c3828 = this.f5551;
        if (c3828 == null) {
            return null;
        }
        C2276 c2276 = c3828.f12696;
        int iM6108 = C3346.m6108(this.f5553);
        InterfaceC4120 interfaceC4120 = this.f5557;
        return Integer.valueOf(interfaceC4120.mo4318(c2276.m4329(c2276.m4335(interfaceC4120.mo4319(iM6108)), true)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX INFO: renamed from: ۥۜ */
    public final int m3489(C2449 c2449, int i) {
        C2793 c2793Mo2794;
        InterfaceC2015 interfaceC2015 = c2449.f8157;
        C3828 c3828 = c2449.f8158;
        if (interfaceC2015 == null) {
            c2793Mo2794 = C2793.f9340;
        } else {
            InterfaceC2015 interfaceC2016 = c2449.f8156;
            c2793Mo2794 = interfaceC2016 != null ? interfaceC2016.mo2794(interfaceC2015, true) : null;
            if (c2793Mo2794 == null) {
                c2793Mo2794 = C2793.f9340;
            }
        }
        long j = this.f5555.f18943;
        int i2 = C3346.f11195;
        InterfaceC4120 interfaceC4120 = this.f5557;
        C2793 c2793M6824 = c3828.m6824(interfaceC4120.mo4319((int) (j & 4294967295L)));
        float f = c2793M6824.f9343;
        return interfaceC4120.mo4318(c3828.f12696.m4339((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c2793Mo2794.m5316() & 4294967295L)) * i) + c2793M6824.f9342)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final List m3490(InterfaceC4745 interfaceC4745) {
        if (!C3346.m6107(this.f5553)) {
            return AbstractC2164.m4188(new C1472(0, ""), new C2890(C3346.m6109(this.f5553), C3346.m6109(this.f5553)));
        }
        InterfaceC1400 interfaceC1400 = (InterfaceC1400) interfaceC4745.mo211(this);
        if (interfaceC1400 != null) {
            return Collections.singletonList(interfaceC1400);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Integer m3491() {
        int length;
        C3828 c3828 = this.f5551;
        if (c3828 == null) {
            return null;
        }
        int iM3487 = m3487();
        while (true) {
            C1249 c1249 = this.f5556;
            if (iM3487 < c1249.f4307.length()) {
                int length2 = this.f5559.f4307.length() - 1;
                if (iM3487 <= length2) {
                    length2 = iM3487;
                }
                long jM6832 = c3828.m6832(length2);
                int i = C3346.f11195;
                int i2 = (int) (jM6832 & 4294967295L);
                if (i2 > iM3487) {
                    length = this.f5557.mo4318(i2);
                    break;
                }
                iM3487++;
            } else {
                length = c1249.f4307.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m3492() {
        this.f5552.f5666 = null;
        C1249 c1249 = this.f5559;
        String str = c1249.f4307;
        String str2 = c1249.f4307;
        if (str.length() > 0) {
            int iM2123 = AbstractC0993.m2123(C3346.m6109(this.f5553), str2);
            if (iM2123 == C3346.m6109(this.f5553) && iM2123 != 0) {
                iM2123 = AbstractC0993.m2123(iM2123 - 1, str2);
            }
            m3486(iM2123, iM2123);
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m3493() {
        C1701 c1701 = this.f5552;
        c1701.f5666 = null;
        C1249 c1249 = this.f5559;
        if (c1249.f4307.length() > 0) {
            if (!m3485()) {
                m3496();
                return;
            }
            c1701.f5666 = null;
            if (c1249.f4307.length() > 0) {
                String str = c1249.f4307;
                long j = this.f5553;
                int i = C3346.f11195;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                int iFollowing = characterInstance.following((int) (j & 4294967295L));
                if (iFollowing != -1) {
                    m3486(iFollowing, iFollowing);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m3494() {
        this.f5552.f5666 = null;
        C1249 c1249 = this.f5559;
        String str = c1249.f4307;
        String str2 = c1249.f4307;
        if (str.length() > 0) {
            int iM2125 = AbstractC0993.m2125(C3346.m6108(this.f5553), str2);
            if (iM2125 == C3346.m6108(this.f5553) && iM2125 != str2.length()) {
                iM2125 = AbstractC0993.m2125(iM2125 + 1, str2);
            }
            m3486(iM2125, iM2125);
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m3495() {
        C1701 c1701 = this.f5552;
        c1701.f5666 = null;
        C1249 c1249 = this.f5559;
        if (c1249.f4307.length() > 0) {
            if (m3485()) {
                m3496();
                return;
            }
            c1701.f5666 = null;
            if (c1249.f4307.length() > 0) {
                String str = c1249.f4307;
                long j = this.f5553;
                int i = C3346.f11195;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                int iFollowing = characterInstance.following((int) (j & 4294967295L));
                if (iFollowing != -1) {
                    m3486(iFollowing, iFollowing);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m3496() {
        this.f5552.f5666 = null;
        C1249 c1249 = this.f5559;
        if (c1249.f4307.length() > 0) {
            String str = c1249.f4307;
            long j = this.f5553;
            int i = C3346.f11195;
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int iPreceding = characterInstance.preceding((int) (j & 4294967295L));
            if (iPreceding != -1) {
                m3486(iPreceding, iPreceding);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m3497(C3828 c3828, int i) {
        int iM3487 = m3487();
        C1701 c1701 = this.f5552;
        if (c1701.f5666 == null) {
            c1701.f5666 = Float.valueOf(c3828.m6824(iM3487).f9343);
        }
        C2276 c2276 = c3828.f12696;
        int iM4335 = c2276.m4335(iM3487) + i;
        if (iM4335 < 0) {
            return 0;
        }
        if (iM4335 >= c2276.f7560) {
            return this.f5559.f4307.length();
        }
        float fM4332 = c2276.m4332(iM4335) - 1.0f;
        Float f = c1701.f5666;
        float fFloatValue = f.floatValue();
        if ((m3485() && fFloatValue >= c3828.m6833(iM4335)) || (!m3485() && fFloatValue <= c3828.m6825(iM4335))) {
            return c2276.m4329(iM4335, true);
        }
        return this.f5557.mo4318(c2276.m4339((((long) Float.floatToRawIntBits(fM4332)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m3498() {
        Integer numM3488;
        this.f5552.f5666 = null;
        if (this.f5559.f4307.length() <= 0 || (numM3488 = m3488()) == null) {
            return;
        }
        int iIntValue = numM3488.intValue();
        m3486(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m3499() {
        if (this.f5559.f4307.length() > 0) {
            int i = C3346.f11195;
            this.f5553 = AbstractC2765.m5145((int) (this.f5554 >> 32), (int) (this.f5553 & 4294967295L));
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m3500() {
        Integer numM3483;
        this.f5552.f5666 = null;
        if (this.f5559.f4307.length() <= 0 || (numM3483 = m3483()) == null) {
            return;
        }
        int iIntValue = numM3483.intValue();
        m3486(iIntValue, iIntValue);
    }
}
