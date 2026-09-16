package p000;

import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: ۥًٔؑۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1311 extends AbstractC3625 implements InterfaceC1827, InterfaceC2015, InterfaceC3979 {

    /* JADX INFO: renamed from: ۥؔ */
    public C1254 f4510;

    /* JADX INFO: renamed from: ۥؙ */
    public C2732 f4511;

    /* JADX INFO: renamed from: ۥؚ */
    public InterfaceC3212 f4512;

    /* JADX INFO: renamed from: ۥً */
    public final C0605 f4513;

    /* JADX INFO: renamed from: ۥٕ */
    public AbstractC1311 f4514;

    /* JADX INFO: renamed from: ۥ٘ */
    public C1000 f4515;

    /* JADX INFO: renamed from: ۥٛ */
    public C2663 f4516;

    /* JADX INFO: renamed from: ۥٝ */
    public boolean f4517;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f4518;

    /* JADX INFO: renamed from: ۥ۟ */
    public C4893 f4519;

    /* JADX INFO: renamed from: ۥۥ */
    public InterfaceC4384 f4522;

    /* JADX INFO: renamed from: ۥۦ */
    public InterfaceC2880 f4523;

    /* JADX INFO: renamed from: ۦؒ */
    public boolean f4524;

    /* JADX INFO: renamed from: ۦؖ */
    public InterfaceC4745 f4525;

    /* JADX INFO: renamed from: ۦؗ */
    public EnumC2459 f4526;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f4527;

    /* JADX INFO: renamed from: ۦٖ */
    public InterfaceC5370 f4529;

    /* JADX INFO: renamed from: ۦٚ */
    public AbstractC1311 f4530;

    /* JADX INFO: renamed from: ۦۣ */
    public float f4532;

    /* JADX INFO: renamed from: ۦۧ */
    public boolean f4533;

    /* JADX INFO: renamed from: ۥۨ */
    public static final C1117 f4507 = new C1117();

    /* JADX INFO: renamed from: ۦ۠ */
    public static final C2663 f4509 = new C2663();

    /* JADX INFO: renamed from: ۥِ */
    public static final float[] f4505 = C0132.m293();

    /* JADX INFO: renamed from: ۥۘ */
    public static final C2704 f4506 = new C2704();

    /* JADX INFO: renamed from: ۦؔ */
    public static final C4992 f4508 = new C4992(19);

    /* JADX INFO: renamed from: ۦُ */
    public float f4528 = 0.8f;

    /* JADX INFO: renamed from: ۦۜ */
    public long f4531 = 0;

    /* JADX INFO: renamed from: ۥۤ */
    public InterfaceC2864 f4521 = AbstractC2552.f8518;

    /* JADX INFO: renamed from: ۥۡ */
    public final C4739 f4520 = new C4739(this, 1);

    public AbstractC1311(C0605 c0605) {
        this.f4513 = c0605;
        this.f4523 = c0605.f2236;
        this.f4526 = c0605.f2272;
    }

    /* JADX INFO: renamed from: ۦّٓؗؕ, reason: contains not printable characters */
    public static AbstractC1311 m9773(InterfaceC2015 interfaceC2015) {
        AbstractC1311 abstractC1311;
        C4492 c4492 = interfaceC2015 instanceof C4492 ? (C4492) interfaceC2015 : null;
        return (c4492 == null || (abstractC1311 = c4492.f14868.f6744) == null) ? (AbstractC1311) interfaceC2015 : abstractC1311;
    }

    @Override // p000.InterfaceC0151
    public final EnumC2459 getLayoutDirection() {
        return this.f4513.f2272;
    }

    /* JADX INFO: renamed from: ۥؐ */
    public final long m2776(long j) {
        long j2 = this.f4531;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        InterfaceC4384 interfaceC4384 = this.f4522;
        if (interfaceC4384 != null) {
            C0281 c0281 = (C0281) interfaceC4384;
            float[] fArrM588 = c0281.m588();
            if (fArrM588 == null) {
                return 9187343241974906880L;
            }
            if (!c0281.f1023) {
                return C0132.m292(jFloatToRawIntBits, fArrM588);
            }
        }
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: ۥؐؓؐٞ, reason: contains not printable characters */
    public final void m9774() {
        if (this.f4522 != null) {
            m9786(null, false);
            this.f4513.m1336(false);
        }
    }

    /* JADX INFO: renamed from: ۥؐؗۡؗ, reason: contains not printable characters */
    public final C2793 m9775() {
        if (mo2787().f17786) {
            InterfaceC2015 interfaceC2015M8145 = C4773.m8145(this);
            C1000 c1000 = this.f4515;
            if (c1000 == null) {
                c1000 = new C1000();
                this.f4515 = c1000;
            }
            long jM2784 = m2784(m2800());
            int i = (int) (jM2784 >> 32);
            c1000.f3578 = -Float.intBitsToFloat(i);
            int i2 = (int) (jM2784 & 4294967295L);
            c1000.f3577 = -Float.intBitsToFloat(i2);
            c1000.f3576 = Float.intBitsToFloat(i) + mo569();
            c1000.f3579 = Float.intBitsToFloat(i2) + mo568();
            while (this != interfaceC2015M8145) {
                this.m9778(c1000, false, true);
                if (!c1000.m2183()) {
                    this = this.f4514;
                }
            }
            return new C2793(c1000.f3578, c1000.f3577, c1000.f3576, c1000.f3579);
        }
        return C2793.f9340;
    }

    /* JADX INFO: renamed from: ۥؐۦً, reason: contains not printable characters */
    public final void m9776(InterfaceC3128 interfaceC3128, long j, C0679 c0679, int i, boolean z) {
        boolean z2;
        boolean z3;
        AbstractC5381 abstractC5381M2805 = m2805(interfaceC3128.mo5027());
        if (!m9781(j)) {
            if (i == 1) {
                float fM2809 = m2809(j, m2800());
                if ((Float.floatToRawIntBits(fM2809) & Integer.MAX_VALUE) < 2139095040) {
                    if (c0679.f2482 != AbstractC2164.m4181(c0679)) {
                        if (AbstractC4225.m7478(c0679.m1510(), AbstractC4593.m7976(fM2809, false, false)) <= 0) {
                            return;
                        }
                    }
                    m9777(abstractC5381M2805, interfaceC3128, j, c0679, i, false, fM2809);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC5381M2805 == null) {
            mo9797(interfaceC3128, j, c0679, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo569() && fIntBitsToFloat2 < mo568()) {
            m9793(abstractC5381M2805, interfaceC3128, j, c0679, i, z);
            return;
        }
        float fM28010 = i == 1 ? m2809(j, m2800()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM28010) & Integer.MAX_VALUE) < 2139095040) {
            if (c0679.f2482 != AbstractC2164.m4181(c0679)) {
                z2 = z;
                if (AbstractC4225.m7478(c0679.m1510(), AbstractC4593.m7976(fM28010, z2, false)) > 0) {
                }
                m9784(abstractC5381M2805, interfaceC3128, j, c0679, i, z2, fM28010, z3);
            }
            z2 = z;
            z3 = true;
            m9784(abstractC5381M2805, interfaceC3128, j, c0679, i, z2, fM28010, z3);
        }
        z2 = z;
        z3 = false;
        m9784(abstractC5381M2805, interfaceC3128, j, c0679, i, z2, fM28010, z3);
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final void m2777(InterfaceC3212 interfaceC3212, C4893 c4893) {
        AbstractC1311 abstractC1311;
        InterfaceC3212 interfaceC3213;
        C4893 c4894;
        AbstractC5381 abstractC5381M2805 = m2805(4);
        if (abstractC5381M2805 == null) {
            mo9787(interfaceC3212, c4893);
            return;
        }
        C0605 c0605 = this.f4513;
        c0605.getClass();
        C2497 sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getSharedDrawScope();
        long jM9235 = AbstractC5537.m9235(this.f982);
        sharedDrawScope.getClass();
        C0863 c0863 = null;
        while (abstractC5381M2805 != null) {
            if (abstractC5381M2805 instanceof InterfaceC0951) {
                abstractC1311 = this;
                interfaceC3213 = interfaceC3212;
                c4894 = c4893;
                sharedDrawScope.m4643(interfaceC3213, jM9235, abstractC1311, (InterfaceC0951) abstractC5381M2805, c4894);
            } else {
                abstractC1311 = this;
                interfaceC3213 = interfaceC3212;
                c4894 = c4893;
                if ((abstractC5381M2805.f17781 & 4) != 0 && (abstractC5381M2805 instanceof AbstractC3019)) {
                    int i = 0;
                    for (AbstractC5381 abstractC5381 = ((AbstractC3019) abstractC5381M2805).f10167; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
                        if ((abstractC5381.f17781 & 4) != 0) {
                            i++;
                            if (i == 1) {
                                abstractC5381M2805 = abstractC5381;
                            } else {
                                if (c0863 == null) {
                                    c0863 = new C0863(new AbstractC5381[16]);
                                }
                                if (abstractC5381M2805 != null) {
                                    c0863.m1843(abstractC5381M2805);
                                    abstractC5381M2805 = null;
                                }
                                c0863.m1843(abstractC5381);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                interfaceC3212 = interfaceC3213;
                this = abstractC1311;
                c4893 = c4894;
            }
            abstractC5381M2805 = AbstractC5537.m9233(c0863);
            interfaceC3212 = interfaceC3213;
            this = abstractC1311;
            c4893 = c4894;
        }
    }

    /* JADX INFO: renamed from: ۥؒ */
    public final AbstractC1311 m2778(AbstractC1311 abstractC1311) {
        C0605 c0605M1356 = abstractC1311.f4513;
        C0605 c0605 = this.f4513;
        if (c0605M1356 == c0605) {
            AbstractC5381 abstractC5381Mo2787 = abstractC1311.mo2787();
            AbstractC5381 abstractC5381Mo2788 = mo2787();
            if (!abstractC5381Mo2788.f17791.f17786) {
                AbstractC3480.m6278("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC5381 abstractC5381 = abstractC5381Mo2788.f17791.f17780; abstractC5381 != null; abstractC5381 = abstractC5381.f17780) {
                if ((abstractC5381.f17781 & 2) != 0 && abstractC5381 == abstractC5381Mo2787) {
                    return abstractC1311;
                }
            }
            return this;
        }
        while (c0605M1356.f2270 > c0605.f2270) {
            c0605M1356 = c0605M1356.m1356();
        }
        C0605 c0605M1357 = c0605;
        while (c0605M1357.f2270 > c0605M1356.f2270) {
            c0605M1357 = c0605M1357.m1356();
        }
        while (c0605M1356 != c0605M1357) {
            c0605M1356 = c0605M1356.m1356();
            c0605M1357 = c0605M1357.m1356();
            if (c0605M1356 == null || c0605M1357 == null) {
                C1078.m2272("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (c0605M1357 != c0605) {
            if (c0605M1356 != abstractC1311.f4513) {
                return (C2935) c0605M1356.f2256.f8206;
            }
            return abstractC1311;
        }
        return this;
    }

    @Override // p000.InterfaceC3979
    /* JADX INFO: renamed from: ۥؓ */
    public final boolean mo1315() {
        return (this.f4522 == null || this.f4518 || !this.f4513.m1348()) ? false : true;
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥؗ */
    public final long mo2779(long j) {
        if (!mo2787().f17786) {
            AbstractC3480.m6278("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(this.f4513)).m1798(mo2808(j));
    }

    /* JADX INFO: renamed from: ۥؘ */
    public final void m2780(AbstractC1311 abstractC1311, C1000 c1000, boolean z) {
        if (abstractC1311 == this) {
            return;
        }
        AbstractC1311 abstractC1312 = this.f4514;
        if (abstractC1312 != null) {
            abstractC1312.m2780(abstractC1311, c1000, z);
        }
        long j = this.f4531;
        float f = (int) (j >> 32);
        c1000.f3578 -= f;
        c1000.f3576 -= f;
        float f2 = (int) (j & 4294967295L);
        c1000.f3577 -= f2;
        c1000.f3579 -= f2;
        InterfaceC4384 interfaceC4384 = this.f4522;
        if (interfaceC4384 != null) {
            C0281 c0281 = (C0281) interfaceC4384;
            float[] fArrM588 = c0281.m588();
            if (!c0281.f1023) {
                if (fArrM588 == null) {
                    c1000.f3578 = 0.0f;
                    c1000.f3577 = 0.0f;
                    c1000.f3576 = 0.0f;
                    c1000.f3579 = 0.0f;
                } else {
                    C0132.m289(fArrM588, c1000);
                }
            }
            if (this.f4527 && z) {
                long j2 = this.f982;
                c1000.m2184(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥً */
    public final long mo2781(InterfaceC2015 interfaceC2015, long j) {
        if (interfaceC2015 instanceof C4492) {
            C4492 c4492 = (C4492) interfaceC2015;
            c4492.f14868.f6744.m9794();
            return c4492.mo2781(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        AbstractC1311 abstractC1311M9773 = m9773(interfaceC2015);
        abstractC1311M9773.m9794();
        AbstractC1311 abstractC1311M2778 = m2778(abstractC1311M9773);
        while (abstractC1311M9773 != abstractC1311M2778) {
            InterfaceC4384 interfaceC4384 = abstractC1311M9773.f4522;
            if (interfaceC4384 != null) {
                C0281 c0281 = (C0281) interfaceC4384;
                float[] fArrM587 = c0281.m587();
                if (!c0281.f1023) {
                    j = C0132.m292(j, fArrM587);
                }
            }
            j = C5063.m8623(j, abstractC1311M9773.f4531);
            abstractC1311M9773 = abstractC1311M9773.f4514;
        }
        return m2803(abstractC1311M2778, j);
    }

    /* JADX INFO: renamed from: ۥٌٍۣؕ, reason: contains not printable characters */
    public final void m9777(AbstractC5381 abstractC5381, InterfaceC3128 interfaceC3128, long j, C0679 c0679, int i, boolean z, float f) {
        if (abstractC5381 == null) {
            mo9797(interfaceC3128, j, c0679, i, z);
            return;
        }
        if (!interfaceC3128.mo5755(abstractC5381)) {
            m9777(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z, f);
            return;
        }
        int i2 = c0679.f2482;
        C2730 c2730 = c0679.f2484;
        c0679.m1511(i2 + 1, c2730.f9040);
        c0679.f2482++;
        c2730.m5079(abstractC5381);
        c0679.f2483.m5092(AbstractC4593.m7976(f, z, false));
        m9784(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z, f, true);
        c0679.f2482 = i2;
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥَ */
    public final long mo2782(long j) {
        if (!mo2787().f17786) {
            AbstractC3480.m6278("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo2781(C4773.m8145(this), ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(this.f4513)).m1785(j));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX INFO: renamed from: ۥْٜؕؔ, reason: contains not printable characters */
    public final void m9778(C1000 c1000, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        InterfaceC4384 interfaceC4384 = this.f4522;
        if (interfaceC4384 != null) {
            if (this.f4527) {
                if (z2) {
                    long jM2800 = m2800();
                    float f = c1000.f3578;
                    float f2 = c1000.f3577;
                    if (c1000.f3576 >= 0.0f) {
                        long j = this.f982;
                        if (f > ((int) (j >> 32)) || c1000.f3579 < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2800 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2800 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (c1000.f3576 - c1000.f3578)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (c1000.f3579 - c1000.f3577)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.f982;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jM2800 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jM2800 & 4294967295L);
                    c1000.m2184(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.f982;
                    c1000.m2184(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (c1000.m2183()) {
                    return;
                }
            }
            C0281 c0281 = (C0281) interfaceC4384;
            float[] fArrM587 = c0281.m587();
            if (!c0281.f1023) {
                if (fArrM587 == null) {
                    c1000.f3578 = 0.0f;
                    c1000.f3577 = 0.0f;
                    c1000.f3576 = 0.0f;
                    c1000.f3579 = 0.0f;
                } else {
                    C0132.m289(fArrM587, c1000);
                }
            }
        }
        long j4 = this.f4531;
        float f9 = (int) (j4 >> 32);
        c1000.f3578 += f9;
        c1000.f3576 += f9;
        float f10 = (int) (j4 & 4294967295L);
        c1000.f3577 += f10;
        c1000.f3579 += f10;
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥٓ */
    public final long mo2783(InterfaceC2015 interfaceC2015, long j) {
        return mo2781(interfaceC2015, j);
    }

    /* JADX INFO: renamed from: ۥٔ */
    public final long m2784(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - mo569();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - mo568();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۥٔؗۢؐ, reason: contains not printable characters */
    public final void m9779() {
        InterfaceC4384 interfaceC4384 = this.f4522;
        if (interfaceC4384 != null) {
            ((C0281) interfaceC4384).m584();
            return;
        }
        AbstractC1311 abstractC1311 = this.f4514;
        if (abstractC1311 != null) {
            abstractC1311.m9779();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [ۥًؗۤ] */
    /* JADX INFO: renamed from: ۥٖؔ۟ۚ, reason: contains not printable characters */
    public final void m9780(InterfaceC5370 interfaceC5370) {
        AbstractC1311 abstractC1311;
        InterfaceC5370 interfaceC5371 = this.f4529;
        if (interfaceC5370 != interfaceC5371) {
            this.f4529 = interfaceC5370;
            C0605 c0605 = this.f4513;
            int i = 0;
            if (interfaceC5371 == null || interfaceC5370.mo619() != interfaceC5371.mo619() || interfaceC5370.mo618() != interfaceC5371.mo618()) {
                int iMo619 = interfaceC5370.mo619();
                int iMo618 = interfaceC5370.mo618();
                InterfaceC4384 interfaceC4384 = this.f4522;
                if (interfaceC4384 != null) {
                    ((C0281) interfaceC4384).m585((((long) iMo619) << 32) | (((long) iMo618) & 4294967295L));
                } else if (c0605.m1342() && (abstractC1311 = this.f4514) != null) {
                    abstractC1311.m9779();
                }
                m572((((long) iMo618) & 4294967295L) | (((long) iMo619) << 32));
                if (this.f4525 != null) {
                    m9795(false);
                }
                boolean zM9196 = AbstractC5490.m9196(4);
                AbstractC5381 abstractC5381Mo2787 = mo2787();
                if (zM9196 || (abstractC5381Mo2787 = abstractC5381Mo2787.f17780) != null) {
                    for (AbstractC5381 abstractC5381M2810 = m2810(zM9196); abstractC5381M2810 != null && (abstractC5381M2810.f17782 & 4) != 0; abstractC5381M2810 = abstractC5381M2810.f17783) {
                        if ((abstractC5381M2810.f17781 & 4) != 0) {
                            ?? M9233 = abstractC5381M2810;
                            ?? c0863 = 0;
                            while (M9233 != 0) {
                                if (M9233 instanceof InterfaceC0951) {
                                    ((InterfaceC0951) M9233).mo1969();
                                } else if ((M9233.f17781 & 4) != 0 && (M9233 instanceof AbstractC3019)) {
                                    AbstractC5381 abstractC5381 = ((AbstractC3019) M9233).f10167;
                                    int i2 = 0;
                                    M9233 = M9233;
                                    c0863 = c0863;
                                    while (abstractC5381 != null) {
                                        if ((abstractC5381.f17781 & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c0863 = c0863;
                                                M9233 = abstractC5381;
                                            } else {
                                                if (c0863 == 0) {
                                                    c0863 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (M9233 != 0) {
                                                    c0863.m1843(M9233);
                                                    M9233 = 0;
                                                }
                                                c0863.m1843(abstractC5381);
                                            }
                                        }
                                        abstractC5381 = abstractC5381.f17783;
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M9233 = AbstractC5537.m9233(c0863);
                            }
                        }
                        if (abstractC5381M2810 == abstractC5381Mo2787) {
                            break;
                        }
                    }
                }
                InterfaceC2043 interfaceC2043 = c0605.f2259;
                if (interfaceC2043 != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1772(c0605);
                }
                c0605.m1363(this);
            }
            C1254 c1254 = this.f4510;
            if ((c1254 == null || c1254.f4316 == 0) && interfaceC5370.mo621().isEmpty()) {
                return;
            }
            C1254 c1255 = this.f4510;
            Map mapMo621 = interfaceC5370.mo621();
            if (c1255 != null && c1255.f4316 == mapMo621.size()) {
                Object[] objArr = c1255.f4318;
                int[] iArr = c1255.f4315;
                long[] jArr = c1255.f4319;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapMo621.get((AbstractC4642) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            c0605.f2261.f4252.f7768.m315();
            C1254 c1256 = this.f4510;
            if (c1256 == null) {
                C1254 c1257 = AbstractC0664.f2448;
                c1256 = new C1254();
                this.f4510 = c1256;
            }
            c1256.m2653();
            for (Map.Entry entry : interfaceC5370.mo621().entrySet()) {
                c1256.m2655(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۥٗ */
    public final AbstractC3625 mo2785() {
        return this.f4530;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017d  */
    /* JADX INFO: renamed from: ۥُٜٙؒ, reason: contains not printable characters */
    public final boolean m9781(long j) {
        boolean z;
        boolean z2;
        boolean zM5132;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        InterfaceC4384 interfaceC4384 = this.f4522;
        if (interfaceC4384 == null || !this.f4527) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        C4893 c4893 = ((C0281) interfaceC4384).f1029;
        if (c4893.f16119) {
            AbstractC3925 abstractC3925M8234 = c4893.m8234();
            if (abstractC3925M8234 instanceof C2490) {
                C2793 c2793 = ((C2490) abstractC3925M8234).f8283;
                if (c2793.f9343 > fIntBitsToFloat || fIntBitsToFloat >= c2793.f9341 || c2793.f9342 > fIntBitsToFloat2 || fIntBitsToFloat2 >= c2793.f9344) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (abstractC3925M8234 instanceof C4996) {
                C5293 c5293 = ((C4996) abstractC3925M8234).f16536;
                float f = c5293.f17430;
                float f2 = c5293.f17433;
                float f3 = c5293.f17436;
                float f4 = c5293.f17435;
                long j2 = c5293.f17432;
                long j3 = c5293.f17434;
                z = false;
                z2 = true;
                long j4 = c5293.f17437;
                long j5 = c5293.f17431;
                if (fIntBitsToFloat >= f4 && fIntBitsToFloat < f && fIntBitsToFloat2 >= f2 && fIntBitsToFloat2 < f3) {
                    int i = (int) (j5 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= f - f4) {
                        int i3 = (int) (j3 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= f - f4) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                    float fIntBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                    float fIntBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                    if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        zM5132 = AbstractC2765.m5132(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, c5293.f17431);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                        zM5132 = AbstractC2765.m5132(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, c5293.f17434);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) {
                                        zM5132 = (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : AbstractC2765.m5132(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, c5293.f17437);
                                    } else {
                                        zM5132 = AbstractC2765.m5132(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, c5293.f17432);
                                    }
                                } else {
                                    C0935 c0935M669 = AbstractC0317.m669();
                                    C0935.m1903(c0935M669, c5293);
                                    zM5132 = AbstractC2765.m5149(fIntBitsToFloat, fIntBitsToFloat2, c0935M669);
                                }
                            } else {
                                C0935 c0935M6610 = AbstractC0317.m669();
                                C0935.m1903(c0935M6610, c5293);
                                zM5132 = AbstractC2765.m5149(fIntBitsToFloat, fIntBitsToFloat2, c0935M6610);
                            }
                        } else {
                            C0935 c0935M6611 = AbstractC0317.m669();
                            C0935.m1903(c0935M6611, c5293);
                            zM5132 = AbstractC2765.m5149(fIntBitsToFloat, fIntBitsToFloat2, c0935M6611);
                        }
                    } else {
                        C0935 c0935M6612 = AbstractC0317.m669();
                        C0935.m1903(c0935M6612, c5293);
                        zM5132 = AbstractC2765.m5149(fIntBitsToFloat, fIntBitsToFloat2, c0935M6612);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(abstractC3925M8234 instanceof C0889)) {
                    C1078.m2275();
                    return false;
                }
                zM5132 = AbstractC2765.m5149(fIntBitsToFloat, fIntBitsToFloat2, ((C0889) abstractC3925M8234).f3231);
            }
            zM5132 = z;
        } else {
            z = false;
            z2 = true;
        }
        return zM5132 ? z2 : z;
    }

    /* JADX INFO: renamed from: ۥٜ */
    public abstract void mo2786();

    /* JADX INFO: renamed from: ۥٟ */
    public abstract AbstractC5381 mo2787();

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f4513.f2236.mo746();
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥۙ */
    public final void mo2788(InterfaceC2015 interfaceC2015, float[] fArr) {
        AbstractC1311 abstractC1311M9773 = m9773(interfaceC2015);
        abstractC1311M9773.m9794();
        AbstractC1311 abstractC1311M2778 = m2778(abstractC1311M9773);
        C0132.m294(fArr);
        abstractC1311M9773.m9790(abstractC1311M2778, fArr);
        m9789(abstractC1311M2778, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: ۥؙۙؒٗ, reason: contains not printable characters */
    public final void m9782() {
        AbstractC5381 abstractC5381Mo2787;
        boolean zM9196 = AbstractC5490.m9196(128);
        AbstractC5381 abstractC5381M2810 = m2810(zM9196);
        if (abstractC5381M2810 == null || (abstractC5381M2810.f17791.f17782 & 128) == 0) {
            return;
        }
        AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
        AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
        try {
            if (!zM9196) {
                abstractC5381Mo2787 = mo2787().f17780;
                if (abstractC5381Mo2787 == null) {
                }
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            }
            abstractC5381Mo2787 = mo2787();
            for (AbstractC5381 abstractC5381M2811 = m2810(zM9196); abstractC5381M2811 != null && (abstractC5381M2811.f17782 & 128) != 0; abstractC5381M2811 = abstractC5381M2811.f17783) {
                if ((abstractC5381M2811.f17781 & 128) != 0) {
                    ?? M9233 = abstractC5381M2811;
                    ?? c0863 = 0;
                    while (M9233 != 0) {
                        if (M9233 instanceof InterfaceC1293) {
                            ((InterfaceC1293) M9233).mo2727(this.f982);
                        } else if ((M9233.f17781 & 128) != 0 && (M9233 instanceof AbstractC3019)) {
                            AbstractC5381 abstractC5381 = ((AbstractC3019) M9233).f10167;
                            int i = 0;
                            M9233 = M9233;
                            c0863 = c0863;
                            while (abstractC5381 != null) {
                                if ((abstractC5381.f17781 & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        c0863 = c0863;
                                        M9233 = abstractC5381;
                                    } else {
                                        if (c0863 == 0) {
                                            c0863 = new C0863(new AbstractC5381[16]);
                                        }
                                        if (M9233 != 0) {
                                            c0863.m1843(M9233);
                                            M9233 = 0;
                                        }
                                        c0863.m1843(abstractC5381);
                                    }
                                }
                                abstractC5381 = abstractC5381.f17783;
                                M9233 = M9233;
                                c0863 = c0863;
                            }
                            if (i == 1) {
                            }
                        }
                        M9233 = AbstractC5537.m9233(c0863);
                    }
                }
                if (abstractC5381M2811 == abstractC5381Mo2787) {
                    break;
                }
            }
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
        } catch (Throwable th) {
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            throw th;
        }
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۥۛ */
    public final InterfaceC5370 mo2789() {
        InterfaceC5370 interfaceC5370 = this.f4529;
        if (interfaceC5370 != null) {
            return interfaceC5370;
        }
        C1078.m2276("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۥ۠ */
    public final C0605 mo2790() {
        return this.f4513;
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥۧ */
    public final void mo2791(float[] fArr) {
        InterfaceC2043 interfaceC2043M8951 = AbstractC5359.m8951(this.f4513);
        AbstractC1311 abstractC1311M9773 = m9773(C4773.m8145(this));
        m9790(abstractC1311M9773, fArr);
        if (interfaceC2043M8951 instanceof ViewTreeObserverOnGlobalLayoutListenerC0850) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043M8951).m1795(fArr);
            return;
        }
        long jMo2779 = abstractC1311M9773.mo2779(0L);
        if ((9223372034707292159L & jMo2779) != 9205357640488583168L) {
            C0132.m291(fArr, Float.intBitsToFloat((int) (jMo2779 >> 32)), Float.intBitsToFloat((int) (jMo2779 & 4294967295L)));
        }
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۦؐ */
    public final boolean mo2792() {
        return this.f4529 != null;
    }

    /* JADX INFO: renamed from: ۦؕ */
    public abstract AbstractC2045 mo2793();

    /* JADX INFO: renamed from: ۦُْؕؓ, reason: contains not printable characters */
    public final void m9783() {
        this.f4518 = true;
        this.f4520.mo449();
        m9774();
        if (C0873.m1863(this.f4531, 0L)) {
            return;
        }
        this.f4513.m1363(this);
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦؗ */
    public final C2793 mo2794(InterfaceC2015 interfaceC2015, boolean z) {
        if (!mo2787().f17786) {
            AbstractC3480.m6278("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC2015.mo2807()) {
            AbstractC3480.m6278("LayoutCoordinates " + interfaceC2015 + " is not attached!");
        }
        AbstractC1311 abstractC1311M9773 = m9773(interfaceC2015);
        abstractC1311M9773.m9794();
        AbstractC1311 abstractC1311M2778 = m2778(abstractC1311M9773);
        C1000 c1000 = this.f4515;
        if (c1000 == null) {
            c1000 = new C1000();
            this.f4515 = c1000;
        }
        c1000.f3578 = 0.0f;
        c1000.f3577 = 0.0f;
        c1000.f3576 = (int) (interfaceC2015.mo2799() >> 32);
        c1000.f3579 = (int) (interfaceC2015.mo2799() & 4294967295L);
        while (abstractC1311M9773 != abstractC1311M2778) {
            abstractC1311M9773.m9778(c1000, z, false);
            if (c1000.m2183()) {
                return C2793.f9340;
            }
            abstractC1311M9773 = abstractC1311M9773.f4514;
        }
        m2780(abstractC1311M2778, c1000, z);
        return new C2793(c1000.f3578, c1000.f3577, c1000.f3576, c1000.f3579);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01db A[PHI: r3
  0x01db: PHI (r3v27 ??) = (r3v38 ??), (r3v39 ??), (r3v40 ??) binds: [B:57:0x01a3, B:59:0x01a7, B:74:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v25, types: [int] */
    /* JADX WARN: Type inference failed for: r3v27, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX INFO: renamed from: ۦٜؗؕٓ, reason: contains not printable characters */
    public final void m9784(AbstractC5381 abstractC5381, InterfaceC3128 interfaceC3128, long j, C0679 c0679, int i, boolean z, float f, boolean z2) {
        ?? r15;
        int i2;
        ?? c0863;
        ?? M9233;
        if (abstractC5381 == null) {
            mo9797(interfaceC3128, j, c0679, i, z);
            return;
        }
        if (!interfaceC3128.mo5755(abstractC5381)) {
            m9784(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z, f, z2);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r2 = abstractC5381;
            ?? r3 = 0;
            while (r2 != 0) {
                if (r2 instanceof InterfaceC2766) {
                    long jMo2391 = ((InterfaceC2766) r2).mo2391();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    C0605 c0605 = this.f4513;
                    EnumC2459 enumC2459 = c0605.f2272;
                    int i5 = AbstractC3676.f12281;
                    long j2 = Long.MIN_VALUE & jMo2391;
                    EnumC2459 enumC24510 = EnumC2459.f8215;
                    if (j2 == 0 || enumC2459 == enumC24510) {
                        r15 = 1;
                        i2 = (int) jMo2391;
                    } else {
                        r15 = 1;
                        i2 = (int) (jMo2391 >> 30);
                    }
                    if (fIntBitsToFloat < (-(i2 & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= mo569() + (((j2 == 0 || c0605.f2272 == enumC24510) ? (int) (jMo2391 >> 30) : (int) jMo2391) & 32767)) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-(((int) (jMo2391 >> 15)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= (((int) (jMo2391 >> 45)) & 32767) + mo568()) {
                        break;
                    }
                    C2741 c2741 = c0679.f2483;
                    C2730 c2730 = c0679.f2484;
                    if (c0679.f2482 == AbstractC2164.m4181(c0679)) {
                        int i7 = c0679.f2482;
                        c0679.m1511(i7 + 1, c2730.f9040);
                        c0679.f2482 += r15;
                        c2730.m5079(abstractC5381);
                        c2741.m5092(AbstractC4593.m7976(0.0f, z, r15));
                        m9784(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i3, z, f, z2);
                        c0679.f2482 = i7;
                        return;
                    }
                    long jM1510 = c0679.m1510();
                    int i8 = c0679.f2482;
                    if (!AbstractC4225.m7488(jM1510)) {
                        if (AbstractC4225.m7471(jM1510) > 0.0f) {
                            int i9 = c0679.f2482;
                            c0679.m1511(i9 + 1, c2730.f9040);
                            c0679.f2482++;
                            c2730.m5079(abstractC5381);
                            c2741.m5092(AbstractC4593.m7976(0.0f, z, true));
                            m9784(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z, f, z2);
                            c0679.f2482 = i9;
                            return;
                        }
                        return;
                    }
                    int iM4181 = AbstractC2164.m4181(c0679);
                    c0679.f2482 = iM4181;
                    c0679.m1511(iM4181 + 1, c2730.f9040);
                    c0679.f2482++;
                    c2730.m5079(abstractC5381);
                    c2741.m5092(AbstractC4593.m7976(0.0f, z, true));
                    m9784(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z, f, z2);
                    c0679.f2482 = iM4181;
                    if (AbstractC4225.m7471(c0679.m1510()) < 0.0f) {
                        c0679.m1511(i8 + 1, c0679.f2482 + 1);
                    }
                    c0679.f2482 = i8;
                    return;
                }
                if ((r2.f17781 & 16) == 0 || !(r2 instanceof AbstractC3019)) {
                    c0863 = r3;
                    c0863 = r3;
                    c0863 = r3;
                    M9233 = AbstractC5537.m9233(c0863);
                } else {
                    AbstractC5381 abstractC5382 = ((AbstractC3019) r2).f10167;
                    int i10 = 0;
                    while (abstractC5382 != null) {
                        if ((abstractC5382.f17781 & 16) != 0) {
                            i10++;
                            if (i10 == 1) {
                                c0863 = r3;
                                c0863 = r3;
                                M9233 = r2;
                                c0863 = r3;
                                c0863 = c0863;
                                M9233 = abstractC5382;
                            } else {
                                if (c0863 == 0) {
                                    c0863 = new C0863(new AbstractC5381[16]);
                                }
                                if (M9233 != 0) {
                                    c0863.m1843(M9233);
                                    M9233 = 0;
                                }
                                c0863.m1843(abstractC5382);
                            }
                        } else {
                            c0863 = r3;
                            c0863 = r3;
                            M9233 = r2;
                            c0863 = r3;
                        }
                        abstractC5382 = abstractC5382.f17783;
                        M9233 = M9233;
                        c0863 = c0863;
                    }
                    c0863 = r3;
                    c0863 = r3;
                    M9233 = r2;
                    c0863 = r3;
                    c0863 = c0863;
                    if (i10 != 1) {
                        c0863 = r3;
                        c0863 = r3;
                        c0863 = r3;
                        M9233 = AbstractC5537.m9233(c0863);
                    }
                }
                i3 = i;
                r2 = M9233;
                r3 = c0863;
            }
        }
        if (z2) {
            m9777(abstractC5381, interfaceC3128, j, c0679, i, z, f);
        } else {
            m9788(abstractC5381, interfaceC3128, j, c0679, i, z, f);
        }
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۦؘ */
    public final AbstractC3625 mo2795() {
        return this.f4514;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: ۦؙؔ۟ؔ, reason: contains not printable characters */
    public final void m9785() {
        boolean zM9196 = AbstractC5490.m9196(4194304);
        AbstractC5381 abstractC5381Mo2787 = mo2787();
        if (!zM9196 && (abstractC5381Mo2787 = abstractC5381Mo2787.f17780) == null) {
            return;
        }
        for (AbstractC5381 abstractC5381M2810 = m2810(zM9196); abstractC5381M2810 != null && (abstractC5381M2810.f17782 & 4194304) != 0; abstractC5381M2810 = abstractC5381M2810.f17783) {
            if ((abstractC5381M2810.f17781 & 4194304) != 0) {
                ?? M9233 = abstractC5381M2810;
                ?? c0863 = 0;
                while (M9233 != 0) {
                    if (M9233 instanceof InterfaceC3126) {
                        ((InterfaceC3126) M9233).mo5752(this);
                    } else if ((M9233.f17781 & 4194304) != 0 && (M9233 instanceof AbstractC3019)) {
                        AbstractC5381 abstractC5381 = ((AbstractC3019) M9233).f10167;
                        int i = 0;
                        M9233 = M9233;
                        c0863 = c0863;
                        while (abstractC5381 != null) {
                            if ((abstractC5381.f17781 & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    c0863 = c0863;
                                    M9233 = abstractC5381;
                                } else {
                                    if (c0863 == 0) {
                                        c0863 = new C0863(new AbstractC5381[16]);
                                    }
                                    if (M9233 != 0) {
                                        c0863.m1843(M9233);
                                        M9233 = 0;
                                    }
                                    c0863.m1843(abstractC5381);
                                }
                            }
                            abstractC5381 = abstractC5381.f17783;
                            M9233 = M9233;
                            c0863 = c0863;
                        }
                        if (i == 1) {
                        }
                    }
                    M9233 = AbstractC5537.m9233(c0863);
                }
            }
            if (abstractC5381M2810 == abstractC5381Mo2787) {
                return;
            }
        }
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۦً */
    public final void mo2796() {
        mo571(this.f4531, this.f4532, this.f4525);
    }

    /* JADX INFO: renamed from: ۦًؗۧۚ, reason: contains not printable characters */
    public final void m9786(InterfaceC4745 interfaceC4745, boolean z) {
        InterfaceC2043 interfaceC2043;
        C0863 c0863;
        Reference referencePoll;
        C2732 c2732;
        C0863 c0864;
        Reference referencePoll2;
        Object obj;
        int i = 0;
        C0605 c0605 = this.f4513;
        boolean z2 = (!z && this.f4525 == interfaceC4745 && AbstractC3831.m6874(this.f4523, c0605.f2236) && this.f4526 == c0605.f2272) ? false : true;
        this.f4523 = c0605.f2236;
        this.f4526 = c0605.f2272;
        boolean zM1348 = c0605.m1348();
        C4739 c4739 = this.f4520;
        if (!zM1348 || interfaceC4745 == null) {
            this.f4525 = null;
            InterfaceC4384 interfaceC4384 = this.f4522;
            if (interfaceC4384 != null) {
                C0281 c0281 = (C0281) interfaceC4384;
                if (!AbstractC3801.m6784(c0281.m587())) {
                    c0605.m1363(this);
                }
                c0281.f1014 = null;
                c0281.f1012 = null;
                c0281.f1025 = true;
                c0281.m586(false);
                InterfaceC5449 interfaceC5449 = c0281.f1028;
                if (interfaceC5449 != null) {
                    interfaceC5449.mo7837(c0281.f1029);
                    ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = c0281.f1013;
                    C2346 c2346 = viewTreeObserverOnGlobalLayoutListenerC0850.f3122;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) c2346.f7785;
                        c0863 = (C0863) c2346.f7786;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            c0863.m1848(referencePoll);
                        }
                    } while (referencePoll != null);
                    c0863.m1843(new WeakReference(c0281, (ReferenceQueue) c2346.f7785));
                    viewTreeObserverOnGlobalLayoutListenerC0850.f3100.m5083(c0281);
                }
                this.f4522 = null;
                c0605.f2239 = true;
                c4739.mo449();
                if (mo2787().f17786 && c0605.m1342() && (interfaceC2043 = c0605.f2259) != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1772(c0605);
                }
            }
            this.f4533 = false;
            return;
        }
        this.f4525 = interfaceC4745;
        if (this.f4522 != null) {
            if (z2) {
                m9795(true);
                return;
            }
            return;
        }
        InterfaceC2043 interfaceC2043M8951 = AbstractC5359.m8951(c0605);
        C2732 c2733 = this.f4511;
        if (c2733 == null) {
            C2732 c2734 = new C2732(2, this, new C4739(this, i));
            this.f4511 = c2734;
            c2732 = c2734;
        } else {
            c2732 = c2733;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0851 = (ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043M8951;
        C2346 c2347 = viewTreeObserverOnGlobalLayoutListenerC0851.f3122;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) c2347.f7785;
            c0864 = (C0863) c2347.f7786;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                c0864.m1848(referencePoll2);
            }
        } while (referencePoll2 != null);
        do {
            int i2 = c0864.f3180;
            if (i2 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) c0864.m1850(i2 - 1)).get();
        } while (obj == null);
        InterfaceC4384 c0282 = (InterfaceC4384) obj;
        if (c0282 != null) {
            C0281 c0283 = (C0281) c0282;
            InterfaceC5449 interfaceC54410 = c0283.f1028;
            if (interfaceC54410 == null) {
                throw AbstractC3761.m6633("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!c0283.f1029.f16113) {
                AbstractC3480.m6279("layer should have been released before reuse");
            }
            c0283.f1029 = interfaceC54410.mo7836();
            c0283.f1025 = false;
            c0283.f1014 = c2732;
            c0283.f1012 = c4739;
            c0283.f1015 = false;
            c0283.f1019 = false;
            c0283.f1023 = true;
            C0132.m294(c0283.f1027);
            float[] fArr = c0283.f1018;
            if (fArr != null) {
                C0132.m294(fArr);
            }
            c0283.f1011 = AbstractC5477.f18071;
            c0283.f1022 = false;
            c0283.f1016 = 9223372034707292159L;
            c0283.f1026 = null;
            c0283.f1021 = 0;
        } else {
            c0282 = new C0281(viewTreeObserverOnGlobalLayoutListenerC0851.getGraphicsContext().mo7836(), viewTreeObserverOnGlobalLayoutListenerC0851.getGraphicsContext(), viewTreeObserverOnGlobalLayoutListenerC0851, c2732, c4739);
        }
        C0281 c0284 = (C0281) c0282;
        c0284.m585(this.f982);
        c0284.m589(this.f4531);
        this.f4522 = c0282;
        m9795(true);
        c0605.f2239 = true;
        c4739.mo449();
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۦٍ */
    public final long mo2797() {
        return this.f4531;
    }

    /* JADX INFO: renamed from: ۦُؑۛۖ, reason: contains not printable characters */
    public abstract void mo9787(InterfaceC3212 interfaceC3212, C4893 c4893);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // p000.AbstractC0275, p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦِ */
    public final Object mo570() {
        C0605 c0605 = this.f4513;
        if (!c0605.f2256.m4585(64)) {
            return null;
        }
        mo2787();
        Object objMo1853 = null;
        for (AbstractC5381 abstractC5381 = (C1850) c0605.f2256.f8202; abstractC5381 != null; abstractC5381 = abstractC5381.f17780) {
            if ((abstractC5381.f17781 & 64) != 0) {
                ?? M9233 = abstractC5381;
                ?? c0863 = 0;
                while (M9233 != 0) {
                    if (M9233 instanceof InterfaceC1696) {
                        objMo1853 = ((InterfaceC1696) M9233).mo1853(objMo1853);
                    } else if ((M9233.f17781 & 64) != 0 && (M9233 instanceof AbstractC3019)) {
                        AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                        int i = 0;
                        M9233 = M9233;
                        c0863 = c0863;
                        while (abstractC5382 != null) {
                            if ((abstractC5382.f17781 & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    c0863 = c0863;
                                    M9233 = abstractC5382;
                                } else {
                                    if (c0863 == 0) {
                                        c0863 = new C0863(new AbstractC5381[16]);
                                    }
                                    if (M9233 != 0) {
                                        c0863.m1843(M9233);
                                        M9233 = 0;
                                    }
                                    c0863.m1843(abstractC5382);
                                }
                            }
                            abstractC5382 = abstractC5382.f17783;
                            M9233 = M9233;
                            c0863 = c0863;
                        }
                        if (i == 1) {
                        }
                    }
                    M9233 = AbstractC5537.m9233(c0863);
                }
            }
        }
        return objMo1853;
    }

    /* JADX INFO: renamed from: ۦِٜؓ٘, reason: contains not printable characters */
    public final void m9788(AbstractC5381 abstractC5381, InterfaceC3128 interfaceC3128, long j, C0679 c0679, int i, boolean z, float f) {
        int i2;
        if (abstractC5381 == null) {
            mo9797(interfaceC3128, j, c0679, i, z);
            return;
        }
        if (!interfaceC3128.mo5755(abstractC5381)) {
            m9788(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z, f);
            return;
        }
        if (!interfaceC3128.mo5028(abstractC5381)) {
            m9784(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z, f, false);
            return;
        }
        C2741 c2741 = c0679.f2483;
        C2730 c2730 = c0679.f2484;
        if (c0679.f2482 != AbstractC2164.m4181(c0679)) {
            long jM1510 = c0679.m1510();
            int i3 = c0679.f2482;
            int iM4181 = AbstractC2164.m4181(c0679);
            c0679.f2482 = iM4181;
            c0679.m1511(iM4181 + 1, c2730.f9040);
            c0679.f2482++;
            c2730.m5079(abstractC5381);
            c2741.m5092(AbstractC4593.m7976(f, z, false));
            m9784(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z, f, false);
            c0679.f2482 = iM4181;
            long jM1511 = c0679.m1510();
            if (c0679.f2482 + 1 >= AbstractC2164.m4181(c0679) || AbstractC4225.m7478(jM1510, jM1511) <= 0) {
                c0679.m1511(c0679.f2482 + 1, c2730.f9040);
            } else {
                int i4 = i3 + 1;
                boolean zM7488 = AbstractC4225.m7488(jM1511);
                int i5 = c0679.f2482;
                c0679.m1511(i4, zM7488 ? i5 + 2 : i5 + 1);
            }
            c0679.f2482 = i3;
            return;
        }
        int i6 = c0679.f2482;
        int i7 = i6 + 1;
        c0679.m1511(i7, c2730.f9040);
        c0679.f2482++;
        c2730.m5079(abstractC5381);
        c2741.m5092(AbstractC4593.m7976(f, z, false));
        m9784(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z, f, false);
        c0679.f2482 = i6;
        if (i7 == AbstractC2164.m4181(c0679) || AbstractC4225.m7488(c0679.m1510())) {
            int i8 = c0679.f2482;
            int i9 = i8 + 1;
            c2730.m5085(i9);
            if (i9 < 0 || i9 >= (i2 = c2741.f9072)) {
                AbstractC2552.m4812("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = c2741.f9073;
            long j2 = jArr[i9];
            if (i9 != i2 - 1) {
                AbstractC0246.m511(jArr, jArr, i9, i8 + 2, i2);
            }
            c2741.f9072--;
        }
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦٖ */
    public final long mo2799() {
        return this.f982;
    }

    /* JADX INFO: renamed from: ۦٗؑٓ, reason: contains not printable characters */
    public final void m9789(AbstractC1311 abstractC1311, float[] fArr) {
        float[] fArrM588;
        if (AbstractC3831.m6874(abstractC1311, this)) {
            return;
        }
        this.f4514.m9789(abstractC1311, fArr);
        if (!C0873.m1863(this.f4531, 0L)) {
            float[] fArr2 = f4505;
            C0132.m294(fArr2);
            long j = this.f4531;
            C0132.m291(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            C0132.m290(fArr, fArr2);
        }
        InterfaceC4384 interfaceC4384 = this.f4522;
        if (interfaceC4384 == null || (fArrM588 = ((C0281) interfaceC4384).m588()) == null) {
            return;
        }
        C0132.m290(fArr, fArrM588);
    }

    /* JADX INFO: renamed from: ۦ٘ */
    public final long m2800() {
        return this.f4523.mo747(this.f4513.f2275.mo4660());
    }

    /* JADX INFO: renamed from: ۦٙ */
    public final void m2801(InterfaceC3212 interfaceC3212, C4893 c4893) {
        InterfaceC4384 interfaceC4384 = this.f4522;
        if (interfaceC4384 == null) {
            long j = this.f4531;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            interfaceC3212.mo2085(f, f2);
            m2777(interfaceC3212, c4893);
            interfaceC3212.mo2085(-f, -f2);
            return;
        }
        C0281 c0281 = (C0281) interfaceC4384;
        C2004 c2004 = c0281.f1009;
        c0281.m590();
        c0281.f1022 = c0281.f1029.f16122.mo1213() > 0.0f;
        C2808 c2808 = c2004.f6603;
        c2808.m5356(interfaceC3212);
        c2808.f9376 = c4893;
        AbstractC5537.m9213(c2004, c0281.f1029);
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦٛ */
    public final long mo2802(long j) {
        long jMo2808 = mo2808(j);
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(this.f4513);
        viewTreeObserverOnGlobalLayoutListenerC0850.m1779();
        return C0132.m292(jMo2808, viewTreeObserverOnGlobalLayoutListenerC0850.f3078);
    }

    /* JADX INFO: renamed from: ۦٜ */
    public final long m2803(AbstractC1311 abstractC1311, long j) {
        if (abstractC1311 == this) {
            return j;
        }
        AbstractC1311 abstractC1312 = this.f4514;
        return (abstractC1312 == null || AbstractC3831.m6874(abstractC1311, abstractC1312)) ? m2776(j) : m2776(abstractC1312.m2803(abstractC1311, j));
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦۗ */
    public final InterfaceC2015 mo2804() {
        boolean z = mo2787().f17786;
        C0605 c0605 = this.f4513;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (C0605 c0605M1356 = c0605; c0605M1356 != null; c0605M1356 = c0605M1356.m1356()) {
                sb.append("\n|");
                sb.append(c0605M1356);
                sb.append(" isAttached=");
                sb.append(c0605M1356.m1348());
                sb.append(" modifier=");
                sb.append(c0605M1356.f2238);
                sb.append(" tail=");
                sb.append(mo2787());
            }
            AbstractC3480.m6278(sb.toString());
        }
        m9794();
        return ((AbstractC1311) c0605.f2256.f8201).f4514;
    }

    /* JADX INFO: renamed from: ۦۘ */
    public final AbstractC5381 m2805(int i) {
        boolean zM9196 = AbstractC5490.m9196(i);
        AbstractC5381 abstractC5381Mo2787 = mo2787();
        if (!zM9196 && (abstractC5381Mo2787 = abstractC5381Mo2787.f17780) == null) {
            return null;
        }
        for (AbstractC5381 abstractC5381M2810 = m2810(zM9196); abstractC5381M2810 != null && (abstractC5381M2810.f17782 & i) != 0; abstractC5381M2810 = abstractC5381M2810.f17783) {
            if ((abstractC5381M2810.f17781 & i) != 0) {
                return abstractC5381M2810;
            }
            if (abstractC5381M2810 == abstractC5381Mo2787) {
                return null;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦۙ */
    public final long mo2806(long j) {
        if (!mo2787().f17786) {
            AbstractC3480.m6278("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC2015 interfaceC2015M8145 = C4773.m8145(this);
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(this.f4513);
        viewTreeObserverOnGlobalLayoutListenerC0850.m1779();
        return mo2781(interfaceC2015M8145, C1553.m3308(C0132.m292(j, viewTreeObserverOnGlobalLayoutListenerC0850.f3135), interfaceC2015M8145.mo2808(0L)));
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f4513.f2236.mo754();
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦۛ */
    public final boolean mo2807() {
        return mo2787().f17786;
    }

    /* JADX INFO: renamed from: ۦِۛؕۢ, reason: contains not printable characters */
    public final void m9790(AbstractC1311 abstractC1311, float[] fArr) {
        while (!AbstractC3831.m6874(this, abstractC1311)) {
            InterfaceC4384 interfaceC4384 = this.f4522;
            if (interfaceC4384 != null) {
                C0132.m290(fArr, ((C0281) interfaceC4384).m587());
            }
            long j = this.f4531;
            if (!C0873.m1863(j, 0L)) {
                float[] fArr2 = f4505;
                C0132.m294(fArr2);
                C0132.m291(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                C0132.m290(fArr, fArr2);
            }
            this = this.f4514;
        }
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦۜ */
    public final long mo2808(long j) {
        if (!mo2787().f17786) {
            AbstractC3480.m6278("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m9794();
        while (this != null) {
            C0605 c0605 = this.f4513;
            if (this == ((AbstractC1311) c0605.f2256.f8201) && !c0605.f2243) {
                long jM9137 = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getRectManager().m9137(c0605);
                if (!C0873.m1863(jM9137, 9223372034707292159L)) {
                    return C5063.m8623(j, jM9137);
                }
            }
            InterfaceC4384 interfaceC4384 = this.f4522;
            if (interfaceC4384 != null) {
                C0281 c0281 = (C0281) interfaceC4384;
                float[] fArrM587 = c0281.m587();
                if (!c0281.f1023) {
                    j = C0132.m292(j, fArrM587);
                }
            }
            j = C5063.m8623(j, this.f4531);
            this = this.f4514;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۦُ۟ؔٞ, reason: contains not printable characters */
    public final void m9791(long j, float f, InterfaceC4745 interfaceC4745) {
        m9786(interfaceC4745, false);
        boolean zM1863 = C0873.m1863(this.f4531, j);
        C0605 c0605 = this.f4513;
        if (!zM1863) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).m1800(-4.0f);
            this.f4531 = j;
            InterfaceC4384 interfaceC4384 = this.f4522;
            if (interfaceC4384 != null) {
                ((C0281) interfaceC4384).m589(j);
            } else {
                AbstractC1311 abstractC1311 = this.f4514;
                if (abstractC1311 != null) {
                    abstractC1311.m9779();
                }
            }
            c0605.m1363(this);
            AbstractC3625.m6452(this);
            InterfaceC2043 interfaceC2043 = c0605.f2259;
            if (interfaceC2043 != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1772(c0605);
            }
        }
        this.f4532 = f;
        if (this == ((AbstractC1311) c0605.f2256.f8201)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getRectManager().m9136(c0605);
        }
        if (this.f12092) {
            return;
        }
        m6453(mo2789());
    }

    /* JADX INFO: renamed from: ۦۡ */
    public final float m2809(long j, long j2) {
        if (mo569() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo568() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM2784 = m2784(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2784 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2784 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo569());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo568()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: ۦۡؔ۟ؓ, reason: contains not printable characters */
    public final boolean m9792() {
        if (this.f4522 != null && this.f4528 <= 0.0f) {
            return true;
        }
        AbstractC1311 abstractC1311 = this.f4514;
        if (abstractC1311 != null) {
            return abstractC1311.m9792();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦًۢؖۡ, reason: contains not printable characters */
    public final void m9793(AbstractC5381 abstractC5381, InterfaceC3128 interfaceC3128, long j, C0679 c0679, int i, boolean z) {
        if (abstractC5381 == null) {
            mo9797(interfaceC3128, j, c0679, i, z);
            return;
        }
        if (!interfaceC3128.mo5755(abstractC5381)) {
            m9793(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z);
            return;
        }
        int i2 = c0679.f2482;
        C2730 c2730 = c0679.f2484;
        c0679.m1511(i2 + 1, c2730.f9040);
        c0679.f2482++;
        c2730.m5079(abstractC5381);
        c0679.f2483.m5092(AbstractC4593.m7976(-1.0f, z, false));
        m9793(AbstractC3933.m7087(abstractC5381, interfaceC3128.mo5027()), interfaceC3128, j, c0679, i, z);
        c0679.f2482 = i2;
    }

    /* JADX INFO: renamed from: ۦُۣؔۚ, reason: contains not printable characters */
    public final void m9794() {
        this.f4513.f2261.m2601();
    }

    /* JADX INFO: renamed from: ۦٖۤٗ, reason: contains not printable characters */
    public final void m9795(boolean z) {
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850;
        boolean z2;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0851;
        InterfaceC2043 interfaceC2043;
        InterfaceC4448 interfaceC4448;
        InterfaceC4448 interfaceC4449;
        InterfaceC4384 interfaceC4384 = this.f4522;
        InterfaceC4745 interfaceC4745 = this.f4525;
        if (interfaceC4384 == null) {
            if (interfaceC4745 == null) {
                return;
            }
            AbstractC3480.m6278("null layer with a non-null layerBlock");
            return;
        }
        if (interfaceC4745 == null) {
            throw AbstractC3761.m6633("updateLayerParameters requires a non-null layerBlock");
        }
        C1117 c1117 = f4507;
        c1117.m2341();
        C0605 c0605 = this.f4513;
        c1117.f3915 = c0605.f2236;
        c1117.f3924 = c0605.f2272;
        c1117.f3916 = AbstractC5537.m9235(this.f982);
        ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getSnapshotObserver().f5926.m9077(this, C3948.f13190, new C5304(9, interfaceC4745, this));
        C2663 c2663 = this.f4516;
        if (c2663 == null) {
            c2663 = new C2663();
            this.f4516 = c2663;
        }
        C2663 c2664 = f4509;
        c2664.getClass();
        c2664.f8824 = c2663.f8824;
        c2664.f8823 = c2663.f8823;
        c2664.f8822 = c2663.f8822;
        c2664.f8825 = c2663.f8825;
        float f = c1117.f3929;
        c2663.f8824 = f;
        c2663.f8823 = c1117.f3919;
        c2663.f8822 = c1117.f3928;
        long j = c1117.f3923;
        c2663.f8825 = j;
        C0281 c0281 = (C0281) interfaceC4384;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0852 = c0281.f1013;
        int i = c1117.f3930 | c0281.f1021;
        c0281.f1010 = c1117.f3924;
        c0281.f1017 = c1117.f3915;
        int i2 = i & 4096;
        if (i2 != 0) {
            c0281.f1011 = j;
        }
        if ((i & 1) != 0) {
            InterfaceC3053 interfaceC3053 = c0281.f1029.f16122;
            if (interfaceC3053.mo1211() != f) {
                interfaceC3053.mo1215(f);
            }
        }
        if ((i & 2) != 0) {
            C4893 c4893 = c0281.f1029;
            float f2 = c1117.f3919;
            InterfaceC3053 interfaceC3054 = c4893.f16122;
            if (interfaceC3054.mo1209() != f2) {
                interfaceC3054.mo1210(f2);
            }
        }
        if ((i & 4) != 0) {
            C4893 c4894 = c0281.f1029;
            float f3 = c1117.f3920;
            InterfaceC3053 interfaceC3055 = c4894.f16122;
            if (interfaceC3055.mo1208() != f3) {
                interfaceC3055.mo1194(f3);
            }
        }
        if ((i & 8) != 0) {
            InterfaceC3053 interfaceC3056 = c0281.f1029.f16122;
            if (interfaceC3056.mo1199() != 0.0f) {
                interfaceC3056.mo1200();
            }
        }
        if ((i & 16) != 0) {
            InterfaceC3053 interfaceC3057 = c0281.f1029.f16122;
            if (interfaceC3057.mo1198() != 0.0f) {
                interfaceC3057.mo1224();
            }
        }
        if ((i & 32) != 0) {
            C4893 c4895 = c0281.f1029;
            float f4 = c1117.f3918;
            InterfaceC3053 interfaceC3058 = c4895.f16122;
            if (interfaceC3058.mo1213() != f4) {
                interfaceC3058.mo1197(f4);
                c4895.f16131 = true;
                c4895.m8233();
            }
            if (c1117.f3918 > 0.0f && !c0281.f1022 && (interfaceC4449 = c0281.f1012) != null) {
                interfaceC4449.mo449();
            }
        }
        if ((i & 64) != 0) {
            C4893 c4896 = c0281.f1029;
            long j2 = c1117.f3921;
            InterfaceC3053 interfaceC3059 = c4896.f16122;
            long jMo1192 = interfaceC3059.mo1192();
            int i3 = C1327.f4593;
            if (!C4462.m7744(j2, jMo1192)) {
                interfaceC3059.mo1217(j2);
            }
        }
        if ((i & 128) != 0) {
            C4893 c4897 = c0281.f1029;
            long j3 = c1117.f3926;
            InterfaceC3053 interfaceC30510 = c4897.f16122;
            long jMo1222 = interfaceC30510.mo1222();
            int i4 = C1327.f4593;
            if (!C4462.m7744(j3, jMo1222)) {
                interfaceC30510.mo1191(j3);
            }
        }
        if ((i & 1024) != 0) {
            InterfaceC3053 interfaceC30511 = c0281.f1029.f16122;
            if (interfaceC30511.mo1212() != 0.0f) {
                interfaceC30511.mo1193();
            }
        }
        if ((i & 256) != 0) {
            InterfaceC3053 interfaceC30512 = c0281.f1029.f16122;
            if (interfaceC30512.mo1226() != 0.0f) {
                interfaceC30512.mo1205();
            }
        }
        if ((i & 512) != 0) {
            InterfaceC3053 interfaceC30513 = c0281.f1029.f16122;
            if (interfaceC30513.mo1201() != 0.0f) {
                interfaceC30513.mo1207();
            }
        }
        if ((i & 2048) != 0) {
            C4893 c4898 = c0281.f1029;
            float f5 = c1117.f3928;
            InterfaceC3053 interfaceC30514 = c4898.f16122;
            if (interfaceC30514.mo1230() != f5) {
                interfaceC30514.mo1206(f5);
            }
        }
        if (i2 != 0) {
            long j4 = c0281.f1011;
            boolean z3 = j4 == AbstractC5477.f18071;
            C4893 c4899 = c0281.f1029;
            if (!z3) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0281.f1011 & 4294967295L)) * ((int) (c0281.f1016 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 >> 32)) * ((int) (c0281.f1016 >> 32)))) << 32);
                if (!C1553.m3306(c4899.f16133, jFloatToRawIntBits)) {
                    c4899.f16133 = jFloatToRawIntBits;
                    c4899.f16122.mo1219(jFloatToRawIntBits);
                }
            } else if (!C1553.m3306(c4899.f16133, 9205357640488583168L)) {
                c4899.f16133 = 9205357640488583168L;
                c4899.f16122.mo1219(9205357640488583168L);
            }
        }
        if ((i & 16384) != 0) {
            C4893 c48910 = c0281.f1029;
            boolean z4 = c1117.f3922;
            if (c48910.f16119 != z4) {
                c48910.f16119 = z4;
                c48910.f16131 = true;
                c48910.m8233();
            }
        }
        if ((131072 & i) != 0) {
            InterfaceC3053 interfaceC30515 = c0281.f1029.f16122;
        }
        if ((262144 & i) != 0) {
            InterfaceC3053 interfaceC30516 = c0281.f1029.f16122;
            if (!AbstractC3831.m6874(interfaceC30516.mo1218(), null)) {
                interfaceC30516.mo1214();
            }
        }
        if ((524288 & i) != 0) {
            C4893 c48911 = c0281.f1029;
            int i5 = c1117.f3917;
            InterfaceC3053 interfaceC30517 = c48911.f16122;
            if (interfaceC30517.mo1216() != i5) {
                interfaceC30517.mo1225(i5);
            }
        }
        if ((32768 & i) != 0) {
            InterfaceC3053 interfaceC30518 = c0281.f1029.f16122;
            if (interfaceC30518.mo1220() != 0) {
                interfaceC30518.mo1203(0);
            }
        }
        if ((i & 7963) != 0) {
            c0281.f1015 = true;
            c0281.f1019 = true;
        }
        if (AbstractC3831.m6874(c0281.f1026, c1117.f3927)) {
            viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0852;
            z2 = false;
        } else {
            AbstractC3925 abstractC3925 = c1117.f3927;
            c0281.f1026 = abstractC3925;
            if (abstractC3925 == null) {
                viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0852;
            } else {
                C4893 c48912 = c0281.f1029;
                if (abstractC3925 instanceof C2490) {
                    C2793 c2793 = ((C2490) abstractC3925).f8283;
                    float f6 = c2793.f9343;
                    float f7 = c2793.f9342;
                    viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0852;
                    c48912.m8231((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(c2793.f9341 - f6)) << 32) | (((long) Float.floatToRawIntBits(c2793.f9344 - f7)) & 4294967295L), 0.0f);
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0852;
                    if (abstractC3925 instanceof C0889) {
                        C0935 c0935 = ((C0889) abstractC3925).f3231;
                        c48912.f16130 = null;
                        c48912.f16129 = 9205357640488583168L;
                        c48912.f16121 = 0L;
                        c48912.f16126 = 0.0f;
                        c48912.f16131 = true;
                        c48912.f16132 = false;
                        c48912.f16124 = c0935;
                        c48912.m8233();
                    } else {
                        if (!(abstractC3925 instanceof C4996)) {
                            C1078.m2275();
                            return;
                        }
                        C4996 c4996 = (C4996) abstractC3925;
                        C0935 c0936 = c4996.f16535;
                        if (c0936 != null) {
                            c48912.f16130 = null;
                            c48912.f16129 = 9205357640488583168L;
                            c48912.f16121 = 0L;
                            c48912.f16126 = 0.0f;
                            c48912.f16131 = true;
                            c48912.f16132 = false;
                            c48912.f16124 = c0936;
                            c48912.m8233();
                        } else {
                            C5293 c5293 = c4996.f16536;
                            float f8 = c5293.f17433;
                            float f9 = c5293.f17435;
                            c48912.m8231((((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (((long) Float.floatToRawIntBits(c5293.f17430 - f9)) << 32) | (((long) Float.floatToRawIntBits(c5293.f17436 - f8)) & 4294967295L), Float.intBitsToFloat((int) (c5293.f17434 >> 32)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((abstractC3925 instanceof C0889) || ((abstractC3925 instanceof C4996) && !AbstractC1631.m3436(((C4996) abstractC3925).f16536))) && (interfaceC4448 = c0281.f1012) != null)) {
                    interfaceC4448.mo449();
                }
            }
            z2 = true;
        }
        c0281.f1021 = c1117.f3930;
        if (i != 0 || z2) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0850.getParent();
            if (parent != null) {
                viewTreeObserverOnGlobalLayoutListenerC0851 = viewTreeObserverOnGlobalLayoutListenerC0850;
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0851, viewTreeObserverOnGlobalLayoutListenerC0851);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC0851 = viewTreeObserverOnGlobalLayoutListenerC0850;
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC0850.m1770()) {
                viewTreeObserverOnGlobalLayoutListenerC0851.m1800(0.0f);
            }
        }
        boolean z5 = this.f4527;
        boolean z6 = c1117.f3922;
        this.f4527 = z6;
        this.f4528 = c1117.f3920;
        boolean z7 = c2664.f8824 == c2663.f8824 && c2664.f8823 == c2663.f8823 && c2664.f8822 == c2663.f8822 && c2664.f8825 == c2663.f8825;
        if (z && ((!z7 || z5 != z6) && (interfaceC2043 = c0605.f2259) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1772(c0605);
        }
        if (z7) {
            return;
        }
        c0605.m1363(this);
        if (c0605.f2274 > 0) {
            ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0853 = (ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605);
            C3369 c3369 = (C3369) viewTreeObserverOnGlobalLayoutListenerC0853.f3125.f4713;
            if (c0605.f2274 > 0) {
                ((C0863) c3369.f11255).m1843(c0605);
                c0605.f2260 = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC0853.m1787(null);
        }
    }

    /* JADX INFO: renamed from: ۦۥ */
    public final AbstractC5381 m2810(boolean z) {
        AbstractC5381 abstractC5381Mo2787;
        C2457 c2457 = this.f4513.f2256;
        if (((AbstractC1311) c2457.f8201) == this) {
            return (AbstractC5381) c2457.f8210;
        }
        AbstractC1311 abstractC1311 = this.f4514;
        if (!z) {
            if (abstractC1311 != null) {
                return abstractC1311.mo2787();
            }
            return null;
        }
        if (abstractC1311 == null || (abstractC5381Mo2787 = abstractC1311.mo2787()) == null) {
            return null;
        }
        return abstractC5381Mo2787.f17783;
    }

    /* JADX INFO: renamed from: ۦۧؓۜؐ, reason: contains not printable characters */
    public final void m9796() {
        boolean zM9196 = AbstractC5490.m9196(1048576);
        AbstractC5381 abstractC5381M2810 = m2810(zM9196);
        if (abstractC5381M2810 == null || (abstractC5381M2810.f17791.f17782 & 1048576) == 0) {
            return;
        }
        AbstractC5381 abstractC5381Mo2787 = mo2787();
        if (!zM9196 && (abstractC5381Mo2787 = abstractC5381Mo2787.f17780) == null) {
            return;
        }
        for (AbstractC5381 abstractC5381M2811 = m2810(zM9196); abstractC5381M2811 != null && (abstractC5381M2811.f17782 & 1048576) != 0; abstractC5381M2811 = abstractC5381M2811.f17783) {
            if ((abstractC5381M2811.f17781 & 1048576) != 0) {
                AbstractC5381 abstractC5381M9233 = abstractC5381M2811;
                C0863 c0863 = null;
                while (abstractC5381M9233 != null) {
                    if ((abstractC5381M9233.f17781 & 1048576) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                        int i = 0;
                        for (AbstractC5381 abstractC5381 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
                            if ((abstractC5381.f17781 & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    abstractC5381M9233 = abstractC5381;
                                } else {
                                    if (c0863 == null) {
                                        c0863 = new C0863(new AbstractC5381[16]);
                                    }
                                    if (abstractC5381M9233 != null) {
                                        c0863.m1843(abstractC5381M9233);
                                        abstractC5381M9233 = null;
                                    }
                                    c0863.m1843(abstractC5381);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC5381M9233 = AbstractC5537.m9233(c0863);
                }
            }
            if (abstractC5381M2811 == abstractC5381Mo2787) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؘّۨؕ, reason: contains not printable characters */
    public void mo9797(InterfaceC3128 interfaceC3128, long j, C0679 c0679, int i, boolean z) {
        AbstractC1311 abstractC1311 = this.f4530;
        if (abstractC1311 != null) {
            abstractC1311.m9776(interfaceC3128, abstractC1311.m2776(j), c0679, i, z);
        }
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۦٔ */
    public final InterfaceC2015 mo2798() {
        return this;
    }
}
