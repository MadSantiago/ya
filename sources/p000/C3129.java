package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦۣؒؖؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3129 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0605 f10471;

    /* JADX INFO: renamed from: ۥُ */
    public C3129 f10472;

    /* JADX INFO: renamed from: ۥّ */
    public final int f10473;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f10474;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC5381 f10475;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2542 f10476;

    public C3129(AbstractC5381 abstractC5381, boolean z, C0605 c0605, C2542 c2542) {
        this.f10475 = abstractC5381;
        this.f10474 = z;
        this.f10471 = c0605;
        this.f10476 = c2542;
        this.f10473 = c0605.f2273;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static /* synthetic */ List m5756(int i, C3129 c3129) {
        return c3129.m5768((i & 1) != 0 ? !c3129.f10474 : false, (i & 2) == 0);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m5757(C0605 c0605, ArrayList arrayList) {
        C0863 c0863M1354 = c0605.m1354();
        Object[] objArr = c0863M1354.f3182;
        int i = c0863M1354.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0606 = (C0605) objArr[i2];
            if (c0606.m1348() && !c0606.f2242) {
                if (c0606.f2256.m4585(8)) {
                    arrayList.add(AbstractC1434.m3032(c0606, this.f10474));
                } else {
                    m5757(c0606, arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m5758(ArrayList arrayList, ArrayList arrayList2) {
        m5761(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C3129 c3129 = (C3129) arrayList.get(size2);
            if (c3129.m5773()) {
                arrayList2.add(c3129);
            } else if (!c3129.f10476.f8488) {
                c3129.m5758(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC5671 m5759() {
        ?? M9233;
        boolean z;
        ?? r0;
        boolean z2 = this.f10476.f8487;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        C0605 c0605 = this.f10471;
        if (!z2) {
            AbstractC5381 abstractC5381 = (AbstractC5381) c0605.f2256.f8210;
            if ((abstractC5381.f17782 & 8) != 0) {
                loop3: while (abstractC5381 != null) {
                    if ((abstractC5381.f17781 & 8) != 0) {
                        M9233 = abstractC5381;
                        ?? c0863 = 0;
                        while (true) {
                            if (M9233 != 0) {
                                if (M9233 instanceof InterfaceC5671) {
                                    if (((InterfaceC5671) M9233).mo4044()) {
                                        r4 = M9233;
                                    }
                                } else if ((M9233.f17781 & 8) != 0 && (M9233 instanceof AbstractC3019)) {
                                    AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                                    int i = 0;
                                    while (abstractC5382 != null) {
                                        if ((abstractC5382.f17781 & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                M9233 = M9233;
                                                c0863 = c0863;
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
                                            M9233 = M9233;
                                            c0863 = c0863;
                                        }
                                        abstractC5382 = abstractC5382.f17783;
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                    if (i == 1) {
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    } else {
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                }
                                M9233 = AbstractC5537.m9233(c0863);
                            }
                        }
                    }
                    if ((abstractC5381.f17782 & 8) == 0) {
                        break;
                    }
                    abstractC5381 = abstractC5381.f17783;
                }
            }
        } else {
            AbstractC5381 abstractC5383 = (AbstractC5381) c0605.f2256.f8210;
            if ((abstractC5383.f17782 & 8) != 0) {
                M9233 = 0;
                while (abstractC5383 != null) {
                    if ((abstractC5383.f17781 & 8) != 0) {
                        AbstractC5381 abstractC5381M9233 = abstractC5383;
                        C0863 c0864 = null;
                        while (abstractC5381M9233 != null) {
                            if (abstractC5381M9233 instanceof InterfaceC5671) {
                                InterfaceC5671 interfaceC5671 = (InterfaceC5671) abstractC5381M9233;
                                if (interfaceC5671.mo4044()) {
                                    if (interfaceC5671.mo787()) {
                                        r0 = M9233;
                                        r0 = M9233;
                                        return interfaceC5671;
                                    }
                                    if (M9233 == 0) {
                                        r0 = interfaceC5671;
                                    }
                                }
                                r0 = M9233;
                                z = false;
                                M9233 = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                M9233 = M9233;
                                if ((abstractC5381M9233.f17781 & 8) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                    int i2 = 0;
                                    for (AbstractC5381 abstractC5384 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5384 != null; abstractC5384 = abstractC5384.f17783) {
                                        if ((abstractC5384.f17781 & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                abstractC5381M9233 = abstractC5384;
                                            } else {
                                                if (c0864 == null) {
                                                    c0864 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (abstractC5381M9233 != null) {
                                                    c0864.m1843(abstractC5381M9233);
                                                    abstractC5381M9233 = null;
                                                }
                                                c0864.m1843(abstractC5384);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                M9233 = M9233;
                            }
                            abstractC5381M9233 = AbstractC5537.m9233(c0864);
                        }
                    }
                    if ((abstractC5383.f17782 & 8) == 0) {
                        break;
                    }
                    abstractC5383 = abstractC5383.f17783;
                    M9233 = M9233;
                }
                r4 = M9233;
            }
        }
        return (InterfaceC5671) r4;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m5760(ArrayList arrayList, C2542 c2542) {
        if (this.f10476.f8488) {
            return;
        }
        m5761(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C3129 c3129 = (C3129) arrayList.get(size2);
            if (!c3129.m5773()) {
                c2542.m4772(c3129.f10476);
                c3129.m5760(arrayList, c2542);
            }
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final List m5761(ArrayList arrayList, boolean z) {
        if (m5771()) {
            return C2340.f7777;
        }
        m5757(this.f10471, arrayList);
        if (z) {
            C2542 c2542 = this.f10476;
            C3262 c3262 = c2542.f8490;
            Object objM6027 = c3262.m6027(AbstractC2771.f9196);
            if (objM6027 == null) {
                objM6027 = null;
            }
            C2155 c2155 = (C2155) objM6027;
            if (c2155 != null && c2542.f8487 && !arrayList.isEmpty()) {
                arrayList.add(m5762(c2155, new C2932(25, c2155)));
            }
            C3059 c3059 = AbstractC2771.f9213;
            if (c3262.m6015(c3059) && !arrayList.isEmpty() && c2542.f8487) {
                Object objM6028 = c3262.m6027(c3059);
                if (objM6028 == null) {
                    objM6028 = null;
                }
                List list = (List) objM6028;
                String str = list != null ? (String) AbstractC0973.m2058(list) : null;
                if (str != null) {
                    arrayList.add(0, m5762(null, new C2932(26, str)));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C3129 m5762(C2155 c2155, InterfaceC4745 interfaceC4745) {
        C2542 c2542 = new C2542();
        c2542.f8487 = false;
        c2542.f8488 = false;
        interfaceC4745.mo211(c2542);
        C3129 c3129 = new C3129(new C2693(interfaceC4745), false, new C0605(this.f10473 + (c2155 != null ? 1000000000 : 2000000000), true), c2542);
        c3129.f10472 = this;
        return c3129;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final C2793 m5763() {
        AbstractC1311 abstractC1311M5765 = m5765();
        if (abstractC1311M5765 != null) {
            if (!abstractC1311M5765.mo2787().f17786) {
                abstractC1311M5765 = null;
            }
            if (abstractC1311M5765 != null) {
                return C4773.m8142(abstractC1311M5765, true);
            }
        }
        return C2793.f9340;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
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
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: ۥۣ */
    public final C2793 m5764(AbstractC1311 abstractC1311) {
        ?? M9233;
        C3129 c3129M5766 = m5766();
        if (c3129M5766 == null) {
            return C2793.f9340;
        }
        AbstractC5381 abstractC5381 = (AbstractC5381) c3129M5766.f10471.f2256.f8210;
        if ((abstractC5381.f17782 & 8) == 0) {
            M9233 = 0;
            break;
        }
        loop0: while (true) {
            if (abstractC5381 != null) {
                if ((abstractC5381.f17781 & 8) != 0) {
                    M9233 = abstractC5381;
                    ?? c0863 = 0;
                    while (M9233 != 0) {
                        if (M9233 instanceof InterfaceC5671) {
                            if (((InterfaceC5671) M9233).mo4044()) {
                                break loop0;
                            }
                        } else if ((M9233.f17781 & 8) != 0 && (M9233 instanceof AbstractC3019)) {
                            AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                            int i = 0;
                            while (abstractC5382 != null) {
                                if ((abstractC5382.f17781 & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M9233 = M9233;
                                        c0863 = c0863;
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
                                    M9233 = M9233;
                                    c0863 = c0863;
                                }
                                abstractC5382 = abstractC5382.f17783;
                                M9233 = M9233;
                                c0863 = c0863;
                            }
                            if (i == 1) {
                                M9233 = M9233;
                                c0863 = c0863;
                            } else {
                                M9233 = M9233;
                                c0863 = c0863;
                            }
                        }
                        M9233 = AbstractC5537.m9233(c0863);
                    }
                }
                if ((abstractC5381.f17782 & 8) != 0) {
                    abstractC5381 = abstractC5381.f17783;
                }
            }
            M9233 = 0;
            break;
        }
        InterfaceC5671 interfaceC5671 = (InterfaceC5671) M9233;
        AbstractC1311 abstractC1311M9245 = interfaceC5671 != null ? AbstractC5537.m9245(interfaceC5671, 8) : null;
        return abstractC1311M9245 == null ? c3129M5766.m5764(abstractC1311) : abstractC1311M9245.mo2794(abstractC1311, true);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC1311 m5765() {
        AbstractC1311 abstractC1311M9245;
        if (!m5771()) {
            InterfaceC5671 interfaceC5671M5759 = m5759();
            return (interfaceC5671M5759 == null || (abstractC1311M9245 = AbstractC5537.m9245(interfaceC5671M5759, 8)) == null) ? (C2935) this.f10471.f2256.f8206 : abstractC1311M9245;
        }
        C3129 c3129M5766 = m5766();
        if (c3129M5766 != null) {
            return c3129M5766.m5765();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final C3129 m5766() {
        C0605 c0605M1356;
        C3129 c3129 = this.f10472;
        if (c3129 != null) {
            return c3129;
        }
        C0605 c0605 = this.f10471;
        boolean z = this.f10474;
        if (!z) {
            c0605M1356 = null;
            break;
        }
        c0605M1356 = c0605.m1356();
        while (true) {
            if (c0605M1356 == null) {
                c0605M1356 = null;
                break;
            }
            C2542 c2542M1331 = c0605M1356.m1331();
            if (c2542M1331 != null && c2542M1331.f8487) {
                break;
            }
            c0605M1356 = c0605M1356.m1356();
        }
        if (c0605M1356 == null) {
            for (C0605 c0605M1357 = c0605.m1356(); c0605M1357 != null; c0605M1357 = c0605M1357.m1356()) {
                if (c0605M1357.f2256.m4585(8)) {
                    c0605M1356 = c0605M1357;
                }
            }
            c0605M1356 = null;
        }
        if (c0605M1356 == null) {
            return null;
        }
        return AbstractC1434.m3032(c0605M1356, z);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final C2793 m5767() {
        Object objM5759 = m5759();
        if (objM5759 == null) {
            return ((C2935) this.f10471.f2256.f8206).m9775();
        }
        AbstractC5381 abstractC5381 = ((AbstractC5381) objM5759).f17791;
        Object objM6027 = this.f10476.f8490.m6027(AbstractC0208.f772);
        if (objM6027 == null) {
            objM6027 = null;
        }
        boolean z = objM6027 != null;
        if (!abstractC5381.f17791.f17786) {
            return C2793.f9340;
        }
        if (z) {
            return AbstractC5537.m9245(abstractC5381, 8).m9775();
        }
        AbstractC1311 abstractC1311M9245 = AbstractC5537.m9245(abstractC5381, 8);
        return C4773.m8145(abstractC1311M9245).mo2794(abstractC1311M9245, true);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final List m5768(boolean z, boolean z2) {
        if (!z && this.f10476.f8488) {
            return C2340.f7777;
        }
        ArrayList arrayList = new ArrayList();
        if (!m5773()) {
            return m5761(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        m5758(arrayList, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final C2542 m5769() {
        boolean zM5773 = m5773();
        C2542 c2542 = this.f10476;
        if (!zM5773) {
            return c2542;
        }
        C2542 c2542M4773 = c2542.m4773();
        m5760(new ArrayList(), c2542M4773);
        return c2542M4773;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final C2793 m5770() {
        AbstractC1311 abstractC1311M5765 = m5765();
        if (abstractC1311M5765 != null) {
            if (!abstractC1311M5765.mo2787().f17786) {
                abstractC1311M5765 = null;
            }
            if (abstractC1311M5765 != null) {
                return C4773.m8145(abstractC1311M5765).mo2794(abstractC1311M5765, true);
            }
        }
        return C2793.f9340;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final boolean m5771() {
        return this.f10472 != null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean m5772() {
        if (m5771() || !m5756(4, this).isEmpty()) {
            return false;
        }
        C0605 c0605M1356 = this.f10471.m1356();
        while (c0605M1356 != null) {
            C2542 c2542M1331 = c0605M1356.m1331();
            if (c2542M1331 != null && c2542M1331.f8487) {
                if (c0605M1356 == null) {
                    return true;
                }
                return false;
            }
            c0605M1356 = c0605M1356.m1356();
        }
        c0605M1356 = null;
        if (c0605M1356 == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean m5773() {
        return this.f10474 && this.f10476.f8487;
    }
}
