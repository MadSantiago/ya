package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦًؚّؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3622 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f12067;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f12068;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f12070;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2015 f12072;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f12073;

    /* JADX INFO: renamed from: ۥّ */
    public final C2730 f12069 = new C2730();

    /* JADX INFO: renamed from: ۦۙ */
    public final C2768 f12074 = new C2768();

    /* JADX INFO: renamed from: ۥۜ */
    public final C2918 f12071 = new C2918(10);

    public C3622(InterfaceC2015 interfaceC2015) {
        this.f12072 = interfaceC2015;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6447() {
        if (this.f12070) {
            this.f12067 = true;
            return;
        }
        C2768 c2768 = this.f12074;
        C0863 c0863 = c2768.f9186;
        Object[] objArr = c0863.f3182;
        int i = c0863.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            ((C5326) objArr[i2]).m8929();
        }
        if (this.f12073) {
            this.f12073 = true;
        } else {
            c2768.f9186.m1851();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m6448(C5470 c5470, boolean z) {
        C2768 c2768 = this.f12074;
        C0863 c0863 = c2768.f9186;
        if (!c2768.mo5171((C0638) c5470.f18034, this.f12072, c5470, z)) {
            return false;
        }
        boolean z2 = true;
        this.f12070 = true;
        Object[] objArr = c0863.f3182;
        int i = c0863.f3180;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((C5326) objArr[i2]).m8930(c5470, z) || z3;
        }
        Object[] objArr2 = c0863.f3182;
        int i3 = c0863.f3180;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((C5326) objArr2[i4]).m8932(c5470) || z4;
        }
        c2768.mo5170(c5470);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.f12070 = false;
        if (this.f12068) {
            this.f12068 = false;
            C2730 c2730 = this.f12069;
            int i5 = c2730.f9040;
            for (int i6 = 0; i6 < i5; i6++) {
                m6450((AbstractC5381) c2730.m5076(i6));
            }
            c2730.m5080();
        }
        if (this.f12067) {
            this.f12067 = false;
            m6447();
        }
        if (this.f12073) {
            this.f12073 = false;
            c2768.f9186.m1851();
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m6449(long j, List list, boolean z) {
        C2918 c2918;
        long[] jArr;
        C5326 c5326;
        Object objM5503;
        Object obj;
        int size = list.size();
        C2768 c2768 = this.f12074;
        C2768 c2769 = c2768;
        boolean z2 = true;
        int i = 0;
        while (true) {
            c2918 = this.f12071;
            if (i >= size) {
                break;
            }
            AbstractC5381 abstractC5381 = (AbstractC5381) list.get(i);
            if (abstractC5381.f17786) {
                abstractC5381.f17778 = new C5304(6, this, abstractC5381);
                if (z2) {
                    C0863 c0863 = c2769.f9186;
                    Object[] objArr = c0863.f3182;
                    int i2 = c0863.f3180;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((C5326) obj).f17576.equals(abstractC5381)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    c5326 = (C5326) obj;
                    if (c5326 != null) {
                        c5326.f17582 = true;
                        c5326.f17580.m685(j);
                        if (z) {
                            Object objM5504 = c2918.m5503(j);
                            if (objM5504 == null) {
                                objM5504 = new C2730();
                                c2918.m5504(j, objM5504);
                            }
                            ((C2730) objM5504).m5079(c5326);
                        }
                    } else {
                        z2 = false;
                        c5326 = new C5326(abstractC5381);
                        c5326.f17580.m685(j);
                        if (z) {
                            objM5503 = c2918.m5503(j);
                            if (objM5503 == null) {
                                objM5503 = new C2730();
                                c2918.m5504(j, objM5503);
                            }
                            ((C2730) objM5503).m5079(c5326);
                        }
                        c2769.f9186.m1843(c5326);
                    }
                } else {
                    c5326 = new C5326(abstractC5381);
                    c5326.f17580.m685(j);
                    if (z) {
                        objM5503 = c2918.m5503(j);
                        if (objM5503 == null) {
                            objM5503 = new C2730();
                            c2918.m5504(j, objM5503);
                        }
                        ((C2730) objM5503).m5079(c5326);
                    }
                    c2769.f9186.m1843(c5326);
                }
                c2769 = c5326;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = c2918.f9786;
            Object[] objArr2 = c2918.f9783;
            long[] jArr3 = c2918.f9787;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                C2730 c2730 = (C2730) objArr2[i8];
                                C0863 c0864 = c2768.f9186;
                                Object[] objArr3 = c0864.f3182;
                                int i9 = c0864.f3180;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((C5326) objArr3[i10]).m8931(j3, c2730);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        c2918.m5502();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۦؑ */
    public final void m6450(AbstractC5381 abstractC5381) {
        if (this.f12070) {
            this.f12068 = true;
            this.f12069.m5079(abstractC5381);
            return;
        }
        C2768 c2768 = this.f12074;
        C2730 c2730 = c2768.f9185;
        c2730.m5080();
        c2730.m5079(c2768);
        while (c2730.m5084()) {
            C2768 c2769 = (C2768) c2730.m5085(c2730.f9040 - 1);
            int i = 0;
            while (true) {
                C0863 c0863 = c2769.f9186;
                if (i < c0863.f3180) {
                    C5326 c5326 = (C5326) c0863.f3182[i];
                    if (c5326.f17576.equals(abstractC5381)) {
                        c2769.f9186.m1848(c5326);
                        c5326.m8929();
                    } else {
                        c2730.m5079(c5326);
                        i++;
                    }
                }
            }
        }
    }
}
