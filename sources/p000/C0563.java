package p000;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥؘؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0563 extends AbstractC0006 {

    /* JADX INFO: renamed from: ۥؕ */
    public C2127 f2010;

    /* JADX INFO: renamed from: ۥٍ */
    public boolean f2011;

    /* JADX INFO: renamed from: ۥِ */
    public C3536 f2012;

    /* JADX INFO: renamed from: ۥٚ */
    public long f2013;

    /* JADX INFO: renamed from: ۥٞ */
    public C3410 f2014;

    /* JADX INFO: renamed from: ۥۘ */
    public C2127 f2015;

    /* JADX INFO: renamed from: ۥۢ */
    public boolean f2016;

    /* JADX INFO: renamed from: ۥۨ */
    public final C2918 f2017;

    /* JADX INFO: renamed from: ۦ */
    public boolean f2018;

    /* JADX INFO: renamed from: ۦؓ */
    public boolean f2019;

    /* JADX INFO: renamed from: ۦؔ */
    public C2127 f2020;

    /* JADX INFO: renamed from: ۦٝ */
    public long f2021;

    /* JADX INFO: renamed from: ۦٞ */
    public boolean f2022;

    /* JADX INFO: renamed from: ۦٟ */
    public C2127 f2023;

    /* JADX INFO: renamed from: ۦ۠ */
    public final C2918 f2024;

    /* JADX INFO: renamed from: ۦۤ */
    public boolean f2025;

    public C0563(InterfaceC4448 interfaceC4448, C2243 c2243) {
        super(c2243, null, false, true, null, null, interfaceC4448);
        int i = AbstractC3481.f11559;
        this.f2017 = new C2918(6);
        this.f2024 = new C2918(6);
        this.f2021 = -1L;
        this.f2013 = -1L;
    }

    @Override // p000.AbstractC0006
    /* JADX INFO: renamed from: ۥٔؗۢؐ */
    public final boolean mo9751(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.InterfaceC5119
    /* JADX INFO: renamed from: ۥۙ */
    public final void mo1265(C3510 c3510, EnumC3834 enumC3834) {
        ArrayList arrayList = (ArrayList) c3510.f11621;
        m9749();
        if (this.f1335 && this.f1340 == null) {
            C4774 c4774 = new C4774(this);
            m5603(c4774);
            this.f1340 = c4774;
        }
        int i = 0;
        if (enumC3834 != EnumC3834.f12724) {
            if (enumC3834 != EnumC3834.f12722 || this.f2014 == null || this.f2011) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                C3410 c3410 = (C3410) arrayList.get(i);
                if (c3410.f11353 && c3410 != this.f2014) {
                    m9756(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.f2014 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC0487.m1060((C3410) arrayList.get(i2))) {
                    C3410 c3411 = (C3410) arrayList.get(0);
                    c3411.f11353 = true;
                    this.f2014 = c3411;
                    if (this.f1335) {
                        C2127 c2127 = this.f2010;
                        if (c2127 != null && c2127.mo866()) {
                            ((InterfaceC2509) AbstractC2552.m4807(this, AbstractC2853.f9541)).getClass();
                            if (c3411.f11349 - this.f2013 < 40) {
                                this.f2025 = true;
                                return;
                            }
                            this.f2019 = true;
                            C2127 c2128 = this.f2010;
                            if (c2128 != null) {
                                c2128.mo871(null);
                            }
                            this.f2010 = null;
                        }
                        this.f2011 = false;
                        m9753(c3411);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f2011) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C3410 c3412 = (C3410) arrayList.get(i3);
                if (!c3412.f11350 || c3412.f11352) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((C3410) arrayList.get(i)).f11353 = true;
                        i++;
                    }
                    return;
                }
            }
            C3410 c3413 = (C3410) arrayList.get(0);
            c3413.f11353 = true;
            m9758(c3413.f11349, this.f2014);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            C3410 c3414 = (C3410) arrayList.get(i4);
            if (c3414.f11353 || !c3414.f11350 || c3414.f11352) {
                float fMo3257 = ((InterfaceC2509) AbstractC2552.m4807(this, AbstractC2853.f9541)).mo3257();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    C3410 c3415 = (C3410) arrayList.get(i5);
                    boolean z = Math.abs(C1553.m3303(C1553.m3308(c3415.f11346, this.f2014.f11346))) > fMo3257;
                    if (c3415.f11353 || z) {
                        m9756(true);
                        return;
                    }
                }
                return;
            }
        }
        C3410 c3416 = (C3410) arrayList.get(0);
        c3416.f11353 = true;
        m9758(c3416.f11349, this.f2014);
    }

    /* JADX INFO: renamed from: ۥؙۙؒٗ, reason: contains not printable characters */
    public final void m9756(boolean z) {
        if (z) {
            this.f2014 = null;
            C2127 c2127 = this.f2023;
            if (c2127 != null) {
                c2127.mo871(null);
            }
            this.f2023 = null;
            C2127 c2128 = this.f2010;
            if (c2128 != null) {
                c2128.mo871(null);
            }
            this.f2010 = null;
            this.f2019 = false;
            this.f2011 = false;
            this.f2013 = -1L;
            this.f2025 = false;
        } else {
            this.f2012 = null;
            C2127 c2129 = this.f2015;
            if (c2129 != null) {
                c2129.mo871(null);
            }
            this.f2015 = null;
            C2127 c21210 = this.f2020;
            if (c21210 != null) {
                c21210.mo871(null);
            }
            this.f2020 = null;
            this.f2016 = false;
            this.f2018 = false;
            this.f2021 = -1L;
            this.f2022 = false;
        }
        m791(z);
    }

    @Override // p000.InterfaceC5119
    /* JADX INFO: renamed from: ۥۧ */
    public final void mo1266() {
        m9756(true);
    }

    @Override // p000.AbstractC0006, p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؓ */
    public final void mo783() {
        super.mo783();
        m9756(false);
    }

    @Override // p000.AbstractC0006
    /* JADX INFO: renamed from: ۦؕ */
    public final C2439 mo784() {
        return null;
    }

    /* JADX INFO: renamed from: ۦُْؕؓ, reason: contains not printable characters */
    public final void m9757(long j, C3536 c3536) {
        if (this.f1335 && !this.f2022) {
            m792(c3536.f11726, false);
            this.f2021 = j;
            if (!this.f2018 && !this.f2016) {
                this.f1337.mo449();
            }
        }
        this.f2012 = null;
        this.f2022 = false;
        this.f2016 = false;
        C2127 c2127 = this.f2015;
        if (c2127 != null) {
            c2127.mo871(null);
        }
        this.f2015 = null;
        this.f2018 = false;
    }

    @Override // p000.AbstractC0006, p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؗ */
    public final void mo785(C5639 c5639, EnumC3834 enumC3834, long j) {
        super.mo785(c5639, enumC3834, j);
        if (enumC3834 != EnumC3834.f12724) {
            if (enumC3834 != EnumC3834.f12722 || this.f2012 == null || this.f2018) {
                return;
            }
            List list = c5639.f18583;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C3536 c3536 = (C3536) list.get(i);
                if (c3536.m6326() && c3536 != this.f2012) {
                    m9756(false);
                    return;
                }
            }
            return;
        }
        if (this.f2012 == null) {
            if (AbstractC3257.m6006(c5639, true)) {
                C3536 c3537 = (C3536) c5639.f18583.get(0);
                c3537.m6327();
                this.f2012 = c3537;
                if (this.f1335) {
                    C2127 c2127 = this.f2020;
                    if (c2127 != null && c2127.mo866()) {
                        ((InterfaceC2509) AbstractC2552.m4807(this, AbstractC2853.f9541)).getClass();
                        if (c3537.f11730 - this.f2021 < 40) {
                            this.f2022 = true;
                            return;
                        }
                        this.f2016 = true;
                        C2127 c2128 = this.f2020;
                        if (c2128 != null) {
                            c2128.mo871(null);
                        }
                        this.f2020 = null;
                    }
                    this.f2018 = false;
                    m9750(c3537);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = c5639.f18579;
        List list2 = c5639.f18583;
        if (this.f2018) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!AbstractC3801.m6754((C3536) list2.get(i3))) {
                    int size3 = list2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((C3536) list2.get(i4)).m6327();
                    }
                    return;
                }
            }
            C3536 c3538 = (C3536) list2.get(0);
            c3538.m6327();
            m9757(c3538.f11730, this.f2012);
            return;
        }
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            if (!AbstractC3801.m6796((C3536) list2.get(i5))) {
                long jM782 = m782(j);
                int size5 = list2.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    C3536 c3539 = (C3536) list2.get(i6);
                    if (c3539.m6326() || AbstractC3801.m6787(c3539, j, jM782)) {
                        m9756(false);
                        return;
                    }
                }
                return;
            }
        }
        C3536 c35310 = (C3536) list2.get(0);
        c35310.m6327();
        m9757(c35310.f11730, this.f2012);
    }

    /* JADX INFO: renamed from: ۦؙؔ۟ؔ, reason: contains not printable characters */
    public final void m9758(long j, C3410 c3410) {
        if (this.f1335 && !this.f2025) {
            m792(c3410.f11346, true);
            this.f2013 = j;
            if (!this.f2011 && !this.f2019) {
                this.f1337.mo449();
            }
        }
        this.f2014 = null;
        this.f2025 = false;
        this.f2019 = false;
        C2127 c2127 = this.f2023;
        if (c2127 != null) {
            c2127.mo871(null);
        }
        this.f2023 = null;
        this.f2011 = false;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦً */
    public final void mo1267() {
        m9759();
    }

    @Override // p000.AbstractC0006
    /* JADX INFO: renamed from: ۦۡؔ۟ؓ */
    public final void mo9752(KeyEvent keyEvent) {
        long jM3030 = AbstractC1434.m3030(keyEvent);
        C2918 c2918 = this.f2017;
        boolean z = false;
        if (c2918.m5503(jM3030) != null) {
            InterfaceC3196 interfaceC3196 = (InterfaceC3196) c2918.m5503(jM3030);
            if (interfaceC3196 != null) {
                if (interfaceC3196.mo866()) {
                    interfaceC3196.mo871(null);
                } else {
                    z = true;
                }
            }
            c2918.m5500(jM3030);
        }
        if (z) {
            return;
        }
        this.f1337.mo449();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦۧؓۜؐ, reason: contains not printable characters */
    public final void m9759() {
        char c;
        long j;
        long j2;
        C2918 c2918 = this.f2017;
        Object[] objArr = c2918.f9783;
        long[] jArr = c2918.f9787;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((InterfaceC3196) objArr[(i << 3) + i3]).mo871(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        c2918.m5502();
        C2918 c2919 = this.f2024;
        Object[] objArr2 = c2919.f9783;
        long[] jArr2 = c2919.f9787;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((AbstractC1694) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        c2919.m5502();
    }

    @Override // p000.AbstractC0006
    /* JADX INFO: renamed from: ۦؘّۨؕ */
    public final void mo9755() {
        m9759();
    }

    @Override // p000.AbstractC0006
    /* JADX INFO: renamed from: ۥؐ */
    public final void mo781(InterfaceC1066 interfaceC1066) {
    }
}
