package p000;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: ۥٌۧؒؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2851 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0585 f9518;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f9519;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f9520;

    /* JADX INFO: renamed from: ۥۗ */
    public long f9521 = 9205357640488583168L;

    /* JADX INFO: renamed from: ۥۜ */
    public long f9522;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2880 f9523;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4852 f9524;

    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC3019 f9525;

    /* JADX INFO: renamed from: ۦۙ */
    public long f9526;

    public C2851(Context context, InterfaceC2880 interfaceC2880, long j, C1393 c1393) {
        this.f9523 = interfaceC2880;
        C0585 c0585 = new C0585(context, AbstractC4225.m7470(j));
        this.f9518 = c0585;
        this.f9524 = new C4852(C2358.f7817, C0373.f1364);
        this.f9519 = true;
        this.f9526 = 0L;
        this.f9522 = -1L;
        C5410 c5410 = new C5410(0, this);
        C5639 c5639 = AbstractC2995.f10071;
        C2439 c2439 = new C2439(null, null, c5410);
        this.f9525 = Build.VERSION.SDK_INT >= 31 ? new C3861(c2439, this, c0585) : new C3861(c2439, this, c0585, c1393);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final long m5408() {
        long jM6848 = this.f9521;
        if ((9223372034707292159L & jM6848) == 9205357640488583168L) {
            jM6848 = AbstractC3831.m6848(this.f9526);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM6848 >> 32)) / Float.intBitsToFloat((int) (this.f9526 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM6848 & 4294967295L)) / Float.intBitsToFloat((int) (this.f9526 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final float m5409(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5408() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f9526 & 4294967295L));
        EdgeEffect edgeEffectM1295 = this.f9518.m1295();
        float fM1708 = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM1708 = AbstractC0797.m1708(edgeEffectM1295, fM1708, f);
        } else {
            edgeEffectM1295.onPull(fM1708, f);
        }
        return (i2 >= 31 ? AbstractC0797.m1707(edgeEffectM1295) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f9526)) * (-fM1708) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final float m5410(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5408() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f9526 >> 32));
        EdgeEffect edgeEffectM1293 = this.f9518.m1293();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC0797.m1708(edgeEffectM1293, fIntBitsToFloat2, f);
        } else {
            edgeEffectM1293.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? AbstractC0797.m1707(edgeEffectM1293) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f9526 >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX INFO: renamed from: ۥۗ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5411(long r19, p000.C0816 r21, p000.AbstractC0772 r22) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2851.m5411(long, ۥًؑۡۚ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final float m5412(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5408() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f9526 & 4294967295L));
        EdgeEffect edgeEffectM1294 = this.f9518.m1294();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = AbstractC0797.m1708(edgeEffectM1294, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectM1294.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC0797.m1707(edgeEffectM1294) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f9526 & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5413() {
        boolean z;
        C0585 c0585 = this.f9518;
        EdgeEffect edgeEffect = c0585.f2184;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = c0585.f2179;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = c0585.f2180;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = c0585.f2188;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            m5414();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m5414() {
        if (this.f9519) {
            this.f9524.setValue(C2358.f7817);
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m5415(long j) {
        boolean zM6053 = C3291.m6053(this.f9526, 0L);
        boolean zM6054 = C3291.m6053(j, this.f9526);
        this.f9526 = j;
        if (!zM6054) {
            int iM5235 = AbstractC2776.m5235(Float.intBitsToFloat((int) (j >> 32)));
            long jM5235 = (((long) AbstractC2776.m5235(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM5235) << 32);
            C0585 c0585 = this.f9518;
            c0585.f2178 = jM5235;
            EdgeEffect edgeEffect = c0585.f2184;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM5235 >> 32), (int) (jM5235 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c0585.f2179;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM5235 >> 32), (int) (jM5235 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c0585.f2180;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM5235 & 4294967295L), (int) (jM5235 >> 32));
            }
            EdgeEffect edgeEffect4 = c0585.f2188;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM5235 & 4294967295L), (int) (jM5235 >> 32));
            }
            EdgeEffect edgeEffect5 = c0585.f2182;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM5235 >> 32), (int) (jM5235 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c0585.f2186;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM5235 >> 32), (int) (jM5235 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c0585.f2185;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM5235 & 4294967295L), (int) (jM5235 >> 32));
            }
            EdgeEffect edgeEffect8 = c0585.f2187;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM5235), (int) (jM5235 >> 32));
            }
        }
        if (zM6053 || zM6054) {
            return;
        }
        m5413();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final float m5416(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m5408() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f9526 >> 32));
        EdgeEffect edgeEffectM1297 = this.f9518.m1297();
        float fM1708 = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fM1708 = AbstractC0797.m1708(edgeEffectM1297, fM1708, fIntBitsToFloat);
        } else {
            edgeEffectM1297.onPull(fM1708, fIntBitsToFloat);
        }
        return (i2 >= 31 ? AbstractC0797.m1707(edgeEffectM1297) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f9526 >> 32)) * (-fM1708) : Float.intBitsToFloat(i);
    }
}
