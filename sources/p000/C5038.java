package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ۦٍۘؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5038 extends AbstractC3191 {

    /* JADX INFO: renamed from: ۦۚ */
    public static final int[] f16710 = new int[0];

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4745 f16711;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC4745 f16712;

    /* JADX INFO: renamed from: ۥۜ */
    public C3639 f16713;

    /* JADX INFO: renamed from: ۦؚ */
    public int f16714;

    /* JADX INFO: renamed from: ۦٌ */
    public boolean f16715;

    /* JADX INFO: renamed from: ۦِ */
    public C5570 f16716;

    /* JADX INFO: renamed from: ۦٛ */
    public ArrayList f16717;

    /* JADX INFO: renamed from: ۦۗ */
    public int[] f16718;

    /* JADX INFO: renamed from: ۦۙ */
    public int f16719;

    public C5038(long j, C5570 c5570, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        super(j, c5570);
        this.f16711 = interfaceC4745;
        this.f16712 = interfaceC4746;
        this.f16716 = C5570.f18392;
        this.f16718 = f16710;
        this.f16714 = 1;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m8551(long j) {
        synchronized (AbstractC1538.f5203) {
            this.f16716 = this.f16716.m9401(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥؖ */
    public final AbstractC5568 m8552(long j, C3639 c3639, HashMap map, C5570 c5570) {
        ArrayList arrayList;
        ArrayList arrayListM2049;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        InterfaceC0622 interfaceC0622;
        AbstractC4937 abstractC4937;
        C5570 c5571;
        Object[] objArr;
        long[] jArr;
        C5570 c5572;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        AbstractC4937 abstractC4937Mo358;
        C5570 c5570M9398 = mo5117().m9401(mo5118()).m9398(this.f16716);
        Object[] objArr3 = c3639.f12174;
        long[] jArr3 = c3639.f12175;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListM2049 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC0622 interfaceC0623 = (InterfaceC0622) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            AbstractC4937 abstractC4937Mo356 = interfaceC0623.mo356();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            AbstractC4937 abstractC4937M3274 = AbstractC1538.m3274(abstractC4937Mo356, j, c5570);
                            if (abstractC4937M3274 == null) {
                                arrayList4 = arrayListM2049;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListM2049;
                                j2 = j3;
                                AbstractC4937 abstractC4937M3275 = AbstractC1538.m3274(abstractC4937Mo356, mo5118(), c5570M9398);
                                if (abstractC4937M3275 != null && abstractC4937M3275.f16356 != 1 && !abstractC4937M3274.equals(abstractC4937M3275)) {
                                    c5572 = c5570M9398;
                                    AbstractC4937 abstractC4937M3276 = AbstractC1538.m3274(abstractC4937Mo356, mo5118(), mo5117());
                                    if (abstractC4937M3276 == null) {
                                        AbstractC1538.m3273();
                                        throw null;
                                    }
                                    if (map == null || (abstractC4937Mo358 = (AbstractC4937) map.get(abstractC4937M3274)) == null) {
                                        abstractC4937Mo358 = interfaceC0623.mo358(abstractC4937M3275, abstractC4937M3274, abstractC4937M3276);
                                    }
                                    if (abstractC4937Mo358 == null) {
                                        return new C4894(this);
                                    }
                                    if (!abstractC4937Mo358.equals(abstractC4937M3276)) {
                                        if (abstractC4937Mo358.equals(abstractC4937M3274)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new C3869(interfaceC0623, abstractC4937M3274.mo2261(mo5118())));
                                            arrayListM2049 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListM2049.add(interfaceC0623);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!abstractC4937Mo358.equals(abstractC4937M3275) ? new C3869(interfaceC0623, abstractC4937Mo358) : new C3869(interfaceC0623, abstractC4937M3275.mo2261(mo5118())));
                                        }
                                    }
                                    arrayListM2049 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListM2049 = arrayList4;
                            }
                            c5572 = c5570M9398;
                            arrayList2 = arrayList5;
                            arrayListM2049 = arrayList4;
                        } else {
                            c5572 = c5570M9398;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c5570M9398 = c5572;
                    }
                    c5571 = c5570M9398;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c5571 = c5570M9398;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    c5570M9398 = c5571;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                m8553();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    C3869 c3869 = (C3869) arrayList2.get(i2);
                    interfaceC0622 = (InterfaceC0622) c3869.f12915;
                    abstractC4937 = (AbstractC4937) c3869.f12914;
                    abstractC4937.f16356 = j;
                    synchronized (AbstractC1538.f5203) {
                        abstractC4937.f16355 = interfaceC0622.mo356();
                        interfaceC0622.mo354(abstractC4937);
                    }
                }
            }
            if (arrayListM2049 != null) {
                size = arrayListM2049.size();
                for (i = 0; i < size; i++) {
                    c3639.m6497((InterfaceC0622) arrayListM2049.get(i));
                }
                arrayList3 = this.f16717;
                if (arrayList3 != null) {
                    arrayListM2049 = AbstractC0973.m2049(arrayList3, arrayListM2049);
                }
                this.f16717 = arrayListM2049;
            }
            return C4872.f16034;
        }
        arrayList = null;
        arrayListM2049 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m8553();
            size2 = arrayList2.size();
            while (i2 < size2) {
                C3869 c38610 = (C3869) arrayList2.get(i2);
                interfaceC0622 = (InterfaceC0622) c38610.f12915;
                abstractC4937 = (AbstractC4937) c38610.f12914;
                abstractC4937.f16356 = j;
                synchronized (AbstractC1538.f5203) {
                    abstractC4937.f16355 = interfaceC0622.mo356();
                    interfaceC0622.mo354(abstractC4937);
                }
            }
        }
        if (arrayListM2049 != null) {
            size = arrayListM2049.size();
            while (i < size) {
                c3639.m6497((InterfaceC0622) arrayListM2049.get(i));
            }
            arrayList3 = this.f16717;
            if (arrayList3 != null) {
                arrayListM2049 = AbstractC0973.m2049(arrayList3, arrayListM2049);
            }
            this.f16717 = arrayListM2049;
        }
        return C4872.f16034;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥؗ */
    public void mo2657() {
        if (this.f10717) {
            return;
        }
        this.f10717 = true;
        synchronized (AbstractC1538.f5203) {
            m5885();
        }
        mo4467();
    }

    /* JADX INFO: renamed from: ۥً */
    public C5038 mo4466(InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        C1262 c1262;
        if (this.f10717) {
            AbstractC0371.m795("Cannot use a disposed snapshot");
        }
        if (this.f16715 && this.f10720 < 0) {
            AbstractC0371.m794("Unsupported operation on a disposed or applied snapshot");
        }
        m8551(mo5118());
        Object obj = AbstractC1538.f5203;
        synchronized (obj) {
            long j = AbstractC1538.f5204;
            AbstractC1538.f5204 = j + 1;
            AbstractC1538.f5209 = AbstractC1538.f5209.m9401(j);
            C5570 c5570Mo5117 = mo5117();
            mo5878(c5570Mo5117.m9401(j));
            c1262 = new C1262(j, AbstractC1538.m3279(c5570Mo5117, mo5118() + 1, j), AbstractC1538.m3285(interfaceC4745, mo4945(), true), AbstractC1538.m3283(interfaceC4746, mo4947()), this);
        }
        if (this.f16715 || this.f10717) {
            return c1262;
        }
        long jMo5118 = mo5118();
        synchronized (obj) {
            long j2 = AbstractC1538.f5204;
            AbstractC1538.f5204 = j2 + 1;
            mo5877(j2);
            AbstractC1538.f5209 = AbstractC1538.f5209.m9401(mo5118());
        }
        mo5878(AbstractC1538.m3279(mo5117(), jMo5118 + 1, mo5118()));
        return c1262;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥّ */
    public boolean mo4946() {
        return false;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥٖ */
    public void mo5879(int i) {
        this.f16719 = i;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥٙ, reason: merged with bridge method [inline-methods] */
    public InterfaceC4745 mo4945() {
        return this.f16711;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۖ */
    public AbstractC5568 mo2658() {
        HashMap mapM3282;
        List list;
        C3639 c3639;
        long j;
        long j2;
        C3639 c3639Mo7632 = mo7632();
        if (c3639Mo7632 != null) {
            long j3 = AbstractC1538.f5210.f10718;
            mapM3282 = AbstractC1538.m3282(j3, this, AbstractC1538.f5209.m9400(j3));
        } else {
            mapM3282 = null;
        }
        C2340 c2340 = C2340.f7777;
        synchronized (AbstractC1538.f5203) {
            try {
                AbstractC1538.m3289(this);
                if (c3639Mo7632 == null || c3639Mo7632.f12176 == 0) {
                    mo5880();
                    C2388 c2388 = AbstractC1538.f5210;
                    C3639 c36310 = c2388.f16713;
                    AbstractC1538.m3284(c2388, AbstractC1538.f5208);
                    if (c36310 == null || !c36310.m6494()) {
                        list = c2340;
                        c3639 = null;
                    } else {
                        list = AbstractC1538.f5207;
                        c3639 = c36310;
                    }
                } else {
                    C2388 c2389 = AbstractC1538.f5210;
                    AbstractC5568 abstractC5568M8552 = m8552(AbstractC1538.f5204, c3639Mo7632, mapM3282, AbstractC1538.f5209.m9400(c2389.f10718));
                    if (!abstractC5568M8552.equals(C4872.f16034)) {
                        return abstractC5568M8552;
                    }
                    mo5880();
                    c3639 = c2389.f16713;
                    AbstractC1538.m3284(c2389, AbstractC1538.f5208);
                    mo7631(null);
                    c2389.f16713 = null;
                    list = AbstractC1538.f5207;
                }
                this.f16715 = true;
                if (c3639 != null) {
                    C0675 c0675 = new C0675(c3639);
                    if (!c3639.m6502()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((InterfaceC5731) list.get(i)).mo219(c0675, this);
                        }
                    }
                }
                if (c3639Mo7632 != null && c3639Mo7632.m6494()) {
                    C0675 c0676 = new C0675(c3639Mo7632);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC5731) list.get(i2)).mo219(c0676, this);
                    }
                }
                synchronized (AbstractC1538.f5203) {
                    try {
                        mo5884();
                        AbstractC1538.m3280();
                        if (c3639 != null) {
                            Object[] objArr = c3639.f12174;
                            long[] jArr = c3639.f12175;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                AbstractC1538.m3290((InterfaceC0622) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (c3639Mo7632 != null) {
                            Object[] objArr2 = c3639Mo7632.f12174;
                            long[] jArr2 = c3639Mo7632.f12175;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                AbstractC1538.m3290((InterfaceC0622) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f16717;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                AbstractC1538.m3290((InterfaceC0622) arrayList.get(i9));
                            }
                        }
                        this.f16717 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return C4872.f16034;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo5880() {
        AbstractC1538.f5209 = AbstractC1538.f5209.m9400(mo5118()).m9399(this.f16716);
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۥۜ */
    public int mo5881() {
        return this.f16719;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public void mo7631(C3639 c3639) {
        this.f16713 = c3639;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦؚ */
    public void mo4467() {
        if (this.f16714 <= 0) {
            AbstractC0371.m795("no pending nested snapshots");
        }
        int i = this.f16714 - 1;
        this.f16714 = i;
        if (i != 0 || this.f16715) {
            return;
        }
        C3639 c3639Mo7632 = mo7632();
        if (c3639Mo7632 != null) {
            if (this.f16715) {
                AbstractC0371.m794("Unsupported operation on a snapshot that has been applied");
            }
            mo7631(null);
            long jMo5118 = mo5118();
            Object[] objArr = c3639Mo7632.f12174;
            long[] jArr = c3639Mo7632.f12175;
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
                                for (AbstractC4937 abstractC4937Mo356 = ((InterfaceC0622) objArr[(i2 << 3) + i4]).mo356(); abstractC4937Mo356 != null; abstractC4937Mo356 = abstractC4937Mo356.f16355) {
                                    long j2 = abstractC4937Mo356.f16356;
                                    if (j2 == jMo5118 || AbstractC0973.m2044(this.f16716, Long.valueOf(j2))) {
                                        C4215 c4215 = AbstractC1538.f5208;
                                        abstractC4937Mo356.f16356 = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        m5882();
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٌ */
    public void mo4468() {
        if (this.f16715 || this.f10717) {
            return;
        }
        m8553();
    }

    /* JADX INFO: renamed from: ۦٕ */
    public C3639 mo7632() {
        return this.f16713;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٗ */
    public AbstractC3191 mo4469(InterfaceC4745 interfaceC4745) {
        C4679 c4679;
        if (this.f10717) {
            AbstractC0371.m795("Cannot use a disposed snapshot");
        }
        if (this.f16715 && this.f10720 < 0) {
            AbstractC0371.m794("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo5118 = mo5118();
        m8551(mo5118());
        Object obj = AbstractC1538.f5203;
        synchronized (obj) {
            long j = AbstractC1538.f5204;
            AbstractC1538.f5204 = j + 1;
            AbstractC1538.f5209 = AbstractC1538.f5209.m9401(j);
            c4679 = new C4679(j, AbstractC1538.m3279(mo5117(), jMo5118 + 1, j), AbstractC1538.m3285(interfaceC4745, mo4945(), true), this);
        }
        if (this.f16715 || this.f10717) {
            return c4679;
        }
        long jMo5119 = mo5118();
        synchronized (obj) {
            long j2 = AbstractC1538.f5204;
            AbstractC1538.f5204 = j2 + 1;
            mo5877(j2);
            AbstractC1538.f5209 = AbstractC1538.f5209.m9401(mo5118());
        }
        mo5878(AbstractC1538.m3279(mo5117(), jMo5119 + 1, mo5118()));
        return c4679;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦٛ */
    public InterfaceC4745 mo4947() {
        return this.f16712;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦۗ */
    public void mo4470() {
        this.f16714++;
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦۚ */
    public void mo4948(InterfaceC0622 interfaceC0622) {
        C3639 c3639Mo7632 = mo7632();
        if (c3639Mo7632 == null) {
            C3639 c3639 = AbstractC5705.f18789;
            c3639Mo7632 = new C3639();
            mo7631(c3639Mo7632);
        }
        c3639Mo7632.m6495(interfaceC0622);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m8553() {
        m8551(mo5118());
        if (this.f16715 || this.f10717) {
            return;
        }
        long jMo5118 = mo5118();
        synchronized (AbstractC1538.f5203) {
            long j = AbstractC1538.f5204;
            AbstractC1538.f5204 = j + 1;
            mo5877(j);
            AbstractC1538.f5209 = AbstractC1538.f5209.m9401(mo5118());
        }
        mo5878(AbstractC1538.m3279(mo5117(), jMo5118 + 1, mo5118()));
    }

    @Override // p000.AbstractC3191
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo5884() {
        int length = this.f16718.length;
        for (int i = 0; i < length; i++) {
            AbstractC1538.m3275(this.f16718[i]);
        }
        m5885();
    }
}
