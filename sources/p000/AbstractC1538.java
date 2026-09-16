package p000;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ۥٗؖؐٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1538 {

    /* JADX INFO: renamed from: ۥُ */
    public static long f5204;

    /* JADX INFO: renamed from: ۥّ */
    public static final C0384 f5205;

    /* JADX INFO: renamed from: ۥۜ */
    public static List f5207;

    /* JADX INFO: renamed from: ۦؑ */
    public static C5570 f5209;

    /* JADX INFO: renamed from: ۦِ */
    public static final C2388 f5210;

    /* JADX INFO: renamed from: ۦٛ */
    public static List f5211;

    /* JADX INFO: renamed from: ۦۗ */
    public static final C5592 f5212;

    /* JADX INFO: renamed from: ۦۙ */
    public static final C3510 f5213;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4215 f5208 = new C4215(21);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5460 f5206 = new C5460(2);

    /* JADX INFO: renamed from: ۥؗ */
    public static final Object f5203 = new Object();

    /* JADX WARN: Type inference failed for: r2v3, types: [int[], java.lang.Cloneable] */
    static {
        C5570 c5570 = C5570.f18392;
        f5209 = c5570;
        f5204 = 2L;
        C0384 c0384 = new C0384(2);
        c0384.f1432 = new long[16];
        c0384.f1428 = new int[16];
        ?? r2 = new int[16];
        char c = 0;
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            r2[i] = i2;
            i = i2;
        }
        c0384.f1431 = r2;
        f5205 = c0384;
        C3510 c3510 = new C3510(c, 10);
        c3510.f11621 = new int[16];
        c3510.f11624 = new C4975[16];
        f5213 = c3510;
        C2340 c2340 = C2340.f7777;
        f5207 = c2340;
        f5211 = c2340;
        long j = f5204;
        f5204 = 1 + j;
        C2388 c2388 = new C2388(j, c5570, null, new C2582(8));
        f5209 = f5209.m9401(c2388.f10718);
        f5210 = c2388;
        f5212 = new C5592(0);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m3269() {
        m3277(f5208);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final AbstractC4937 m3270(AbstractC4937 abstractC4937, InterfaceC0622 interfaceC0622) {
        AbstractC4937 abstractC4937M3274;
        AbstractC3191 abstractC3191M3278 = m3278();
        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M3278.mo4945();
        if (interfaceC4745Mo4945 != null) {
            interfaceC4745Mo4945.mo211(interfaceC0622);
        }
        AbstractC4937 abstractC4937M3275 = m3274(abstractC4937, abstractC3191M3278.mo5118(), abstractC3191M3278.mo5117());
        if (abstractC4937M3275 != null) {
            return abstractC4937M3275;
        }
        synchronized (f5203) {
            AbstractC3191 abstractC3191M3279 = m3278();
            abstractC4937M3274 = m3274(interfaceC0622.mo356(), abstractC3191M3279.mo5118(), abstractC3191M3279.mo5117());
            if (abstractC4937M3274 == null) {
                m3273();
                throw null;
            }
        }
        return abstractC4937M3274;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final AbstractC3191 m3271(AbstractC3191 abstractC3191, InterfaceC4745 interfaceC4745, boolean z) {
        boolean z2 = abstractC3191 instanceof C5038;
        if (z2 || abstractC3191 == null) {
            return new C4336(z2 ? (C5038) abstractC3191 : null, interfaceC4745, null, false, z);
        }
        return new C2764(abstractC3191, interfaceC4745, false, z);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final AbstractC4937 m3272(AbstractC4937 abstractC4937) {
        AbstractC4937 abstractC4937M3274;
        AbstractC3191 abstractC3191M3278 = m3278();
        AbstractC4937 abstractC4937M3275 = m3274(abstractC4937, abstractC3191M3278.mo5118(), abstractC3191M3278.mo5117());
        if (abstractC4937M3275 != null) {
            return abstractC4937M3275;
        }
        synchronized (f5203) {
            AbstractC3191 abstractC3191M3279 = m3278();
            abstractC4937M3274 = m3274(abstractC4937, abstractC3191M3279.mo5118(), abstractC3191M3279.mo5117());
        }
        if (abstractC4937M3274 != null) {
            return abstractC4937M3274;
        }
        m3273();
        throw null;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final void m3273() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final AbstractC4937 m3274(AbstractC4937 abstractC4937, long j, C5570 c5570) {
        AbstractC4937 abstractC4938 = null;
        while (abstractC4937 != null) {
            long j2 = abstractC4937.f16356;
            if (j2 != 0 && AbstractC3831.m6844(j2, j) <= 0 && !c5570.m9397(j2) && (abstractC4938 == null || AbstractC3831.m6844(abstractC4938.f16356, abstractC4937.f16356) < 0)) {
                abstractC4938 = abstractC4937;
            }
            abstractC4937 = abstractC4937.f16355;
        }
        if (abstractC4938 != null) {
            return abstractC4938;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final void m3275(int i) {
        C0384 c0384 = f5205;
        int i2 = ((int[]) c0384.f1431)[i];
        c0384.m843(i2, c0384.f1429 - 1);
        c0384.f1429--;
        long[] jArr = (long[]) c0384.f1432;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (AbstractC3831.m6844(jArr[i4], j) <= 0) {
                break;
            }
            c0384.m843(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) c0384.f1432;
        int i5 = c0384.f1429 >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < c0384.f1429 && AbstractC3831.m6844(jArr2[i6], jArr2[i7]) < 0) {
                if (AbstractC3831.m6844(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                c0384.m843(i6, i2);
                i2 = i6;
            } else {
                if (AbstractC3831.m6844(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                c0384.m843(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) c0384.f1431)[i] = c0384.f1430;
        c0384.f1430 = i;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final AbstractC4937 m3276(AbstractC4937 abstractC4937, InterfaceC0622 interfaceC0622, AbstractC3191 abstractC3191) {
        AbstractC4937 abstractC4937M3274;
        if (abstractC3191.mo4946()) {
            abstractC3191.mo4948(interfaceC0622);
        }
        long jMo5118 = abstractC3191.mo5118();
        AbstractC4937 abstractC4937M3275 = m3274(abstractC4937, jMo5118, abstractC3191.mo5117());
        if (abstractC4937M3275 == null) {
            m3273();
            throw null;
        }
        if (abstractC4937M3275.f16356 == abstractC3191.mo5118()) {
            return abstractC4937M3275;
        }
        synchronized (f5203) {
            abstractC4937M3274 = m3274(interfaceC0622.mo356(), jMo5118, abstractC3191.mo5117());
            if (abstractC4937M3274 == null) {
                m3273();
                throw null;
            }
            if (abstractC4937M3274.f16356 != jMo5118) {
                AbstractC4937 abstractC4937M3286 = m3286(abstractC4937M3274, interfaceC0622);
                abstractC4937M3286.mo2262(abstractC4937M3274);
                abstractC4937M3286.f16356 = abstractC3191.mo5118();
                abstractC4937M3274 = abstractC4937M3286;
            }
        }
        if (abstractC4937M3275.f16356 != 1) {
            abstractC3191.mo4948(interfaceC0622);
        }
        return abstractC4937M3274;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۗ */
    public static final Object m3277(InterfaceC4745 interfaceC4745) {
        C3639 c3639;
        Object objM3284;
        C2388 c2388 = f5210;
        synchronized (f5203) {
            try {
                c3639 = c2388.f16713;
                if (c3639 != null) {
                    f5212.addAndGet(1);
                }
                objM3284 = m3284(c2388, interfaceC4745);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3639 != null) {
            try {
                List list = f5207;
                C0675 c0675 = new C0675(c3639);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC5731) list.get(i)).mo219(c0675, c2388);
                }
                f5212.addAndGet(-1);
            } catch (Throwable th2) {
                f5212.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (f5203) {
            m3280();
            if (c3639 != null) {
                Object[] objArr = c3639.f12174;
                long[] jArr = c3639.f12175;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    m3290((InterfaceC0622) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return objM3284;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final AbstractC3191 m3278() {
        AbstractC3191 abstractC3191 = (AbstractC3191) f5206.get();
        return abstractC3191 == null ? f5210 : abstractC3191;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5570 m3279(C5570 c5570, long j, long j2) {
        while (AbstractC3831.m6844(j, j2) < 0) {
            c5570 = c5570.m9401(j);
            j++;
        }
        return c5570;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m3280() {
        C3510 c3510 = f5213;
        int i = c3510.f11622;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            C4975 c4975 = ((C4975[]) c3510.f11624)[i2];
            Object obj = c4975 != null ? c4975.get() : null;
            if (obj != null && m3291((InterfaceC0622) obj)) {
                if (i3 != i2) {
                    ((C4975[]) c3510.f11624)[i3] = c4975;
                    int[] iArr = (int[]) c3510.f11621;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((C4975[]) c3510.f11624)[i4] = null;
            ((int[]) c3510.f11621)[i4] = 0;
        }
        if (i3 != i) {
            c3510.f11622 = i3;
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final void m3281(AbstractC3191 abstractC3191, InterfaceC0622 interfaceC0622) {
        abstractC3191.mo5879(abstractC3191.mo5881() + 1);
        InterfaceC4745 interfaceC4745Mo4947 = abstractC3191.mo4947();
        if (interfaceC4745Mo4947 != null) {
            interfaceC4745Mo4947.mo211(interfaceC0622);
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final HashMap m3282(long j, C5038 c5038, C5570 c5570) {
        long[] jArr;
        C5570 c5571;
        long[] jArr2;
        int i;
        int i2;
        AbstractC4937 abstractC4937M3274;
        C3639 c3639Mo7632 = c5038.mo7632();
        if (c3639Mo7632 != null) {
            long jMo5118 = c5038.mo5118();
            C5570 c5570M9398 = c5038.mo5117().m9401(jMo5118).m9398(c5038.f16716);
            Object[] objArr = c3639Mo7632.f12174;
            long[] jArr3 = c3639Mo7632.f12175;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                InterfaceC0622 interfaceC0622 = (InterfaceC0622) objArr[(i3 << 3) + i6];
                                AbstractC4937 abstractC4937Mo356 = interfaceC0622.mo356();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                AbstractC4937 abstractC4937M3275 = m3274(abstractC4937Mo356, j, c5570);
                                if (abstractC4937M3275 != null && (abstractC4937M3274 = m3274(abstractC4937Mo356, jMo5118, c5570M9398)) != null && !abstractC4937M3275.equals(abstractC4937M3274)) {
                                    AbstractC4937 abstractC4937M3276 = m3274(abstractC4937Mo356, jMo5118, c5038.mo5117());
                                    if (abstractC4937M3276 == null) {
                                        m3273();
                                        throw null;
                                    }
                                    AbstractC4937 abstractC4937Mo358 = interfaceC0622.mo358(abstractC4937M3274, abstractC4937M3275, abstractC4937M3276);
                                    if (abstractC4937Mo358 == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(abstractC4937M3275, abstractC4937Mo358);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            c5570M9398 = c5570M9398;
                        }
                        jArr = jArr3;
                        c5571 = c5570M9398;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        c5571 = c5570M9398;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    c5570M9398 = c5571;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final InterfaceC4745 m3283(InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        if (interfaceC4745 == null || interfaceC4746 == null || interfaceC4745 == interfaceC4746) {
            return interfaceC4745 == null ? interfaceC4746 : interfaceC4745;
        }
        return new C3389(interfaceC4745, interfaceC4746, 1);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final Object m3284(C2388 c2388, InterfaceC4745 interfaceC4745) {
        long j = c2388.f10718;
        Object objMo211 = interfaceC4745.mo211(f5209.m9400(j));
        long j2 = f5204;
        f5204 = 1 + j2;
        C5570 c5570M9400 = f5209.m9400(j);
        f5209 = c5570M9400;
        c2388.f10718 = j2;
        c2388.f10719 = c5570M9400;
        c2388.f16719 = 0;
        c2388.f16713 = null;
        c2388.m5885();
        f5209 = f5209.m9401(j2);
        return objMo211;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final InterfaceC4745 m3285(InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746, boolean z) {
        if (!z) {
            interfaceC4746 = null;
        }
        if (interfaceC4745 == null || interfaceC4746 == null || interfaceC4745 == interfaceC4746) {
            return interfaceC4745 == null ? interfaceC4746 : interfaceC4745;
        }
        return new C3389(interfaceC4745, interfaceC4746, 0);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final AbstractC4937 m3286(AbstractC4937 abstractC4937, InterfaceC0622 interfaceC0622) {
        long j = f5204;
        C0384 c0384 = f5205;
        if (c0384.f1429 > 0) {
            j = ((long[]) c0384.f1432)[0];
        }
        long j2 = j - 1;
        AbstractC4937 abstractC4938 = null;
        AbstractC4937 abstractC4939 = null;
        for (AbstractC4937 abstractC4937Mo356 = interfaceC0622.mo356(); abstractC4937Mo356 != null; abstractC4937Mo356 = abstractC4937Mo356.f16355) {
            long j3 = abstractC4937Mo356.f16356;
            if (j3 != 0) {
                if (j3 != 0 && AbstractC3831.m6844(j3, j2) <= 0 && !C5570.f18392.m9397(j3)) {
                    if (abstractC4939 != null) {
                        if (AbstractC3831.m6844(abstractC4937Mo356.f16356, abstractC4939.f16356) >= 0) {
                            abstractC4938 = abstractC4939;
                            break;
                        }
                        break;
                    }
                    abstractC4939 = abstractC4937Mo356;
                }
            }
            abstractC4938 = abstractC4937Mo356;
            break;
        }
        if (abstractC4938 != null) {
            abstractC4938.f16356 = Long.MAX_VALUE;
            return abstractC4938;
        }
        AbstractC4937 abstractC4937Mo2261 = abstractC4937.mo2261(Long.MAX_VALUE);
        abstractC4937Mo2261.f16355 = interfaceC0622.mo356();
        interfaceC0622.mo354(abstractC4937Mo2261);
        return abstractC4937Mo2261;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final AbstractC4937 m3287(AbstractC4937 abstractC4937, AbstractC3191 abstractC3191) {
        AbstractC4937 abstractC4937M3274;
        AbstractC4937 abstractC4937M3275 = m3274(abstractC4937, abstractC3191.mo5118(), abstractC3191.mo5117());
        if (abstractC4937M3275 != null) {
            return abstractC4937M3275;
        }
        synchronized (f5203) {
            abstractC4937M3274 = m3274(abstractC4937, abstractC3191.mo5118(), abstractC3191.mo5117());
        }
        if (abstractC4937M3274 != null) {
            return abstractC4937M3274;
        }
        m3273();
        throw null;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final AbstractC4937 m3288(AbstractC4937 abstractC4937, AbstractC2975 abstractC2975, AbstractC3191 abstractC3191, AbstractC4937 abstractC4938) {
        AbstractC4937 abstractC4937M3286;
        if (abstractC3191.mo4946()) {
            abstractC3191.mo4948(abstractC2975);
        }
        long jMo5118 = abstractC3191.mo5118();
        if (abstractC4938.f16356 == jMo5118) {
            return abstractC4938;
        }
        synchronized (f5203) {
            abstractC4937M3286 = m3286(abstractC4937, abstractC2975);
        }
        abstractC4937M3286.f16356 = jMo5118;
        if (abstractC4938.f16356 != 1) {
            abstractC3191.mo4948(abstractC2975);
        }
        return abstractC4937M3286;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final void m3289(AbstractC3191 abstractC3191) {
        long j;
        if (f5209.m9397(abstractC3191.mo5118())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(abstractC3191.mo5118());
        sb.append(", disposed=");
        sb.append(abstractC3191.f10717);
        sb.append(", applied=");
        C5038 c5038 = abstractC3191 instanceof C5038 ? (C5038) abstractC3191 : null;
        sb.append(c5038 != null ? Boolean.valueOf(c5038.f16715) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f5203) {
            C0384 c0384 = f5205;
            j = c0384.f1429 > 0 ? ((long[]) c0384.f1432)[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final void m3290(InterfaceC0622 interfaceC0622) {
        if (m3291(interfaceC0622)) {
            C3510 c3510 = f5213;
            int i = c3510.f11622;
            int iIdentityHashCode = System.identityHashCode(interfaceC0622);
            int i2 = -1;
            if (i > 0) {
                int i3 = c3510.f11622 - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) c3510.f11621)[i5];
                    if (i6 < iIdentityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > iIdentityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        C4975 c4975 = ((C4975[]) c3510.f11624)[i5];
                        if (interfaceC0622 == (c4975 != null ? c4975.get() : null)) {
                            i2 = i5;
                            break;
                        }
                        int i7 = i5 - 1;
                        while (true) {
                            if (-1 >= i7 || ((int[]) c3510.f11621)[i7] != iIdentityHashCode) {
                                i5++;
                                int i8 = c3510.f11622;
                                while (true) {
                                    if (i5 >= i8) {
                                        i2 = -(c3510.f11622 + 1);
                                        break;
                                    }
                                    if (((int[]) c3510.f11621)[i5] != iIdentityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    C4975 c4976 = ((C4975[]) c3510.f11624)[i5];
                                    if ((c4976 != null ? c4976.get() : null) == interfaceC0622) {
                                        i2 = i5;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                C4975 c4977 = ((C4975[]) c3510.f11624)[i7];
                                if ((c4977 != null ? c4977.get() : null) == interfaceC0622) {
                                    i2 = i7;
                                    break;
                                }
                                i7--;
                            }
                        }
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            C4975[] c4975Arr = (C4975[]) c3510.f11624;
            int length = c4975Arr.length;
            if (i == length) {
                int i10 = length * 2;
                C4975[] c4975Arr2 = new C4975[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(c4975Arr, i9, c4975Arr2, i11, i - i9);
                System.arraycopy((C4975[]) c3510.f11624, 0, c4975Arr2, 0, i9);
                AbstractC0246.m523(i11, i9, i, (int[]) c3510.f11621, iArr);
                AbstractC0246.m516(0, i9, 6, (int[]) c3510.f11621, iArr);
                c3510.f11624 = c4975Arr2;
                c3510.f11621 = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(c4975Arr, i9, c4975Arr, i12, i - i9);
                int[] iArr2 = (int[]) c3510.f11621;
                AbstractC0246.m523(i12, i9, i, iArr2, iArr2);
            }
            ((C4975[]) c3510.f11624)[i9] = new C4975(interfaceC0622);
            ((int[]) c3510.f11621)[i9] = iIdentityHashCode;
            c3510.f11622++;
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final boolean m3291(InterfaceC0622 interfaceC0622) {
        AbstractC4937 abstractC4937;
        long j = f5204;
        C0384 c0384 = f5205;
        if (c0384.f1429 > 0) {
            j = ((long[]) c0384.f1432)[0];
        }
        AbstractC4937 abstractC4938 = null;
        AbstractC4937 abstractC4937Mo356 = null;
        int i = 0;
        for (AbstractC4937 abstractC4937Mo357 = interfaceC0622.mo356(); abstractC4937Mo357 != null; abstractC4937Mo357 = abstractC4937Mo357.f16355) {
            long j2 = abstractC4937Mo357.f16356;
            if (j2 != 0) {
                if (AbstractC3831.m6844(j2, j) >= 0) {
                    i++;
                } else if (abstractC4938 == null) {
                    i++;
                    abstractC4938 = abstractC4937Mo357;
                } else {
                    if (AbstractC3831.m6844(abstractC4937Mo357.f16356, abstractC4938.f16356) < 0) {
                        abstractC4937 = abstractC4938;
                        abstractC4938 = abstractC4937Mo357;
                    } else {
                        abstractC4937 = abstractC4937Mo357;
                    }
                    if (abstractC4937Mo356 == null) {
                        abstractC4937Mo356 = interfaceC0622.mo356();
                        AbstractC4937 abstractC4939 = abstractC4937Mo356;
                        while (true) {
                            if (abstractC4937Mo356 == null) {
                                abstractC4937Mo356 = abstractC4939;
                                break;
                            }
                            if (AbstractC3831.m6844(abstractC4937Mo356.f16356, j) >= 0) {
                                break;
                            }
                            if (AbstractC3831.m6844(abstractC4939.f16356, abstractC4937Mo356.f16356) < 0) {
                                abstractC4939 = abstractC4937Mo356;
                            }
                            abstractC4937Mo356 = abstractC4937Mo356.f16355;
                        }
                    }
                    abstractC4938.f16356 = 0L;
                    abstractC4938.mo2262(abstractC4937Mo356);
                    abstractC4938 = abstractC4937;
                }
            }
        }
        return i > 1;
    }
}
