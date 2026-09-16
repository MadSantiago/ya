package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥۦؗٙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2830 implements InterfaceC5841 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4745 f9448;

    /* JADX INFO: renamed from: ۥُ */
    public InterfaceC0712 f9449;

    /* JADX INFO: renamed from: ۥّ */
    public C1427 f9450;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f9451;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C1405 f9452;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2808 f9453;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f9454;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f9455;

    /* JADX INFO: renamed from: ۦؑ */
    public C3693 f9456;

    /* JADX INFO: renamed from: ۦؚ */
    public C1686 f9457;

    /* JADX INFO: renamed from: ۦٌ */
    public boolean f9458;

    /* JADX INFO: renamed from: ۦِ */
    public Object f9459;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f9460;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f9461;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f9462;

    /* JADX INFO: renamed from: ۦۚ */
    public long f9463;

    /* JADX INFO: renamed from: ۦ۟ */
    public long f9464 = AbstractC1266.m2659();

    /* JADX INFO: renamed from: ۦۨ */
    public long f9465;

    public C2830(C1405 c1405, int i, C2808 c2808, InterfaceC4745 interfaceC4745) {
        this.f9452 = c1405;
        this.f9455 = i;
        this.f9453 = c2808;
        this.f9448 = interfaceC4745;
    }

    @Override // p000.InterfaceC5841
    public final void cancel() {
        if (this.f9454) {
            return;
        }
        this.f9454 = true;
        m5397();
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f9455 + ", constraints = " + this.f9456 + ", isComposed = " + m5395() + ", isMeasured = " + this.f9462 + ", isCanceled = " + this.f9454 + " }";
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m5394(C0203 c0203) {
        boolean zM5399;
        if (!this.f9452.f4837) {
            return false;
        }
        if (this.f9458) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM5399 = m5399(c0203);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zM5399 = m5399(c0203);
        }
        AbstractC2765.m5128(-1L, "compose:lazy:prefetch:execute:item");
        return zM5399;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m5395() {
        C1427 c1427;
        return this.f9460 || ((c1427 = this.f9450) != null && c1427.m3028());
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m5396(Object obj, Object obj2, C3409 c3409) {
        C1427 c1427;
        C1427 c1428 = this.f9450;
        int i = 0;
        if (c1428 == null) {
            C1405 c1405 = this.f9452;
            InterfaceC5731 interfaceC5731M1873 = ((C0880) c1405.f4836).m1873(this.f9455, obj, obj2);
            C0851 c0851M7619 = ((C4319) c1405.f4835).m7619();
            if (c0851M7619.f3155.m1348()) {
                c0851M7619.m1810(obj, interfaceC5731M1873, true);
                c1427 = new C1427(c0851M7619, obj, 1);
            } else {
                c1427 = new C1427(c0851M7619, obj, i);
            }
            c1428 = c1427;
            this.f9450 = c1428;
            this.f9459 = obj;
        }
        this.f9451 = false;
        while (!c1428.m3028() && !this.f9451) {
            C5017 c5017 = new C5017(4, this, c3409);
            switch (c1428.f4902) {
                case 0:
                    break;
                default:
                    C1325 c1325M3029 = c1428.m3029();
                    C2166 c2166 = c1325M3029 != null ? c1325M3029.f4576 : null;
                    if (c2166 == null || c2166.m4220()) {
                        break;
                    } else {
                        AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
                        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
                        AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
                        try {
                            c2166.m4221(c5017);
                            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                            break;
                        } catch (Throwable th) {
                            try {
                                c1325M3029.getClass();
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                                throw th2;
                            }
                        }
                    }
                    break;
            }
        }
        m5398();
        boolean z = this.f9451;
        long j = this.f9465;
        if (z) {
            c3409.f11343 = C3409.m6173(j, c3409.f11343);
        } else {
            c3409.f11344 = C3409.m6173(j, c3409.f11344);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5397() {
        C1427 c1427 = this.f9450;
        if (c1427 != null) {
            switch (c1427.f4902) {
                case 0:
                    break;
                default:
                    C1325 c1325M3029 = c1427.m3029();
                    if ((c1325M3029 != null ? c1325M3029.f4576 : null) != null) {
                        c1427.f4901.m1803(c1427.f4900);
                    }
                    break;
            }
        }
        this.f9450 = null;
        InterfaceC0712 interfaceC0712 = this.f9449;
        if (interfaceC0712 != null) {
            interfaceC0712.mo1579();
        }
        this.f9449 = null;
        this.f9457 = null;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m5398() {
        long jM8641;
        long jM2659 = AbstractC1266.m2659();
        long j = this.f9464;
        long j2 = Long.MAX_VALUE;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            jM8641 = (1 | (jM2659 - 1)) == Long.MAX_VALUE ? C5063.m8641(jM2659) : C5063.m8624(jM2659, j);
        } else if (jM2659 == j) {
            C4036 c4036 = C5805.f19128;
            jM8641 = 0;
        } else {
            jM8641 = C5805.m9618(C5063.m8641(j));
        }
        long j3 = jM8641 >> 1;
        C4036 c4037 = C5805.f19128;
        if ((((int) jM8641) & 1) == 0) {
            j2 = j3;
        } else if (j3 <= 9223372036854L) {
            j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
        }
        this.f9465 = j2;
        long j4 = this.f9463 - j2;
        this.f9463 = j4;
        this.f9464 = jM2659;
        AbstractC2765.m5128(j4, "compose:lazy:prefetch:available_time_nanos");
    }

    @Override // p000.InterfaceC5841
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo928() {
        this.f9458 = true;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01ec  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m5399(C0203 c0203) {
        ?? r12;
        InterfaceC0712 interfaceC0712M1802;
        int i = this.f9455;
        long j = i;
        AbstractC2765.m5128(j, "compose:lazy:prefetch:execute:item");
        InterfaceC4112 interfaceC4112 = (InterfaceC4112) ((C0880) this.f9452.f4836).f3215.mo449();
        if (!this.f9454) {
            int iMo5821 = interfaceC4112.mo5821();
            if (i >= 0 && i < iMo5821) {
                Object objMo5820 = interfaceC4112.mo5820(i);
                Object obj = this.f9459;
                if (obj != null && !objMo5820.equals(obj)) {
                    m5397();
                    return false;
                }
                Object objMo7314 = interfaceC4112.mo7314(i);
                C2808 c2808 = this.f9453;
                C3409 c3409 = (C3409) c2808.f9377;
                if (c2808.f9376 != objMo7314 || c3409 == null) {
                    C3262 c3262 = (C3262) c2808.f9378;
                    Object objM6027 = c3262.m6027(objMo7314);
                    Object obj2 = objM6027;
                    if (objM6027 == null) {
                        C3409 c34010 = new C3409();
                        c34010.f11342 = -1;
                        c3262.m6023(objMo7314, c34010);
                        obj2 = c34010;
                    }
                    c3409 = (C3409) obj2;
                    c2808.f9376 = objMo7314;
                    c2808.f9377 = c3409;
                }
                m5395();
                long jM468 = c0203.m468();
                this.f9463 = jM468;
                this.f9464 = AbstractC1266.m2659();
                this.f9465 = 0L;
                AbstractC2765.m5128(jM468, "compose:lazy:prefetch:available_time_nanos");
                if (!m5395()) {
                    if (m5400(this.f9463, c3409.f11344 + c3409.f11343)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            m5396(objMo5820, objMo7314, c3409);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!m5395()) {
                        return true;
                    }
                }
                if (this.f9450 != null) {
                    if (!m5400(this.f9463, c3409.f11341)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        C1427 c1427 = this.f9450;
                        if (c1427 == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (c1427.f4902) {
                            case 0:
                                interfaceC0712M1802 = c1427.f4901.m1802(c1427.f4900);
                                break;
                            default:
                                C0851 c0851 = c1427.f4901;
                                C1325 c1325M3029 = c1427.m3029();
                                if (c1325M3029 != null) {
                                    c0851.m1804(c1325M3029, false);
                                }
                                interfaceC0712M1802 = c0851.m1802(c1427.f4900);
                                break;
                        }
                        this.f9449 = interfaceC0712M1802;
                        this.f9450 = null;
                        this.f9460 = true;
                        Trace.endSection();
                        m5398();
                        c3409.f11341 = C3409.m6173(this.f9465, c3409.f11341);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.f9461) {
                    if (this.f9463 <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        InterfaceC0712 interfaceC0712 = this.f9449;
                        if (interfaceC0712 != null) {
                            C5450 c5450 = new C5450();
                            interfaceC0712.mo1580(new C0091(26, c5450));
                            List list = (List) c5450.f17965;
                            C1686 c1686 = list != null ? new C1686(this, list) : null;
                            this.f9457 = c1686;
                            this.f9461 = true;
                            Trace.endSection();
                        } else {
                            AbstractC4690.m8037("Should precompose before resolving nested prefetch states");
                            C1078.m2274();
                        }
                        this.f9457 = c1686;
                        this.f9461 = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                C1686 c1687 = this.f9457;
                if (c1687 != null) {
                    int i2 = c3409.f11342;
                    boolean z = this.f9458;
                    List[] listArr = c1687.f5614;
                    int i3 = c1687.f5611;
                    List list2 = c1687.f5615;
                    if (i3 < list2.size()) {
                        if (c1687.f5613.f9454) {
                            AbstractC4690.m8035("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((C2750) list2.get(i4)).f9102 = i2;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (c1687.f5611 < list2.size()) {
                                try {
                                    if (listArr[c1687.f5611] == null) {
                                        if (c0203.m468() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = c1687.f5611;
                                        C2750 c2750 = (C2750) list2.get(i5);
                                        InterfaceC4745 interfaceC4745 = c2750.f9101;
                                        C0975 c0975 = new C0975(c2750, c2750.f9102);
                                        interfaceC4745.mo211(c0975);
                                        ArrayList arrayList = c0975.f3437;
                                        c2750.f9099 = arrayList.size();
                                        listArr[i5] = arrayList;
                                    }
                                    List list3 = listArr[c1687.f5611];
                                    while (c1687.f5616 < list3.size()) {
                                        C2830 c2830 = (C2830) list3.get(c1687.f5616);
                                        if (z) {
                                            C2830 c2831 = c2830 != null ? c2830 : null;
                                            if (c2831 != null) {
                                                r12 = 1;
                                                c2831.f9458 = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        c1687.f5612 = r12;
                                        if (c2830.m5394(c0203)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        c1687.f5616 += r12;
                                    }
                                    c1687.f5616 = 0;
                                    c1687.f5611++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                C1686 c1688 = this.f9457;
                if (c1688 != null && c1688.f5612) {
                    m5398();
                    AbstractC2765.m5128(j, "compose:lazy:prefetch:execute:item");
                    C1686 c1689 = this.f9457;
                    if (c1689 != null) {
                        c1689.f5612 = false;
                    }
                }
                C3693 c3693 = this.f9456;
                if (!this.f9462 && c3693 != null) {
                    if (!m5400(this.f9463, c3409.f11345)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j2 = c3693.f12325;
                        if (this.f9454) {
                            AbstractC4690.m8038("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.f9462) {
                            AbstractC4690.m8038("Request was already measured!");
                        }
                        this.f9462 = true;
                        InterfaceC0712 interfaceC0713 = this.f9449;
                        if (interfaceC0713 != null) {
                            int iMo1578 = interfaceC0713.mo1578();
                            for (int i6 = 0; i6 < iMo1578; i6++) {
                                interfaceC0713.mo1577(j2, i6);
                            }
                        } else {
                            AbstractC4690.m8037("performComposition() must be called before performMeasure()");
                            C1078.m2274();
                        }
                        Trace.endSection();
                        m5398();
                        c3409.f11345 = C3409.m6173(this.f9465, c3409.f11345);
                        InterfaceC4745 interfaceC4746 = this.f9448;
                        if (interfaceC4746 != null) {
                            interfaceC4746.mo211(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                C1686 c16810 = this.f9457;
                if (this.f9462 && this.f9461 && c16810 != null) {
                    List list4 = c16810.f5615;
                    int size2 = list4.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((C2750) list4.get(i7)).f9098);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = c3409.f11342;
                    c3409.f11342 = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list4.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((C2750) list4.get(i9)).f9099);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        c3409.f11345 = 0L;
                    }
                }
                return false;
            }
        }
        m5397();
        return false;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m5400(long j, long j2) {
        if (this.f9458) {
            j2 = 0;
        }
        return j > j2;
    }
}
