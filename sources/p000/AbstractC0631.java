package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥؘؙؗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0631 implements InterfaceC3096 {

    /* JADX INFO: renamed from: ۥؓ */
    public final InterfaceC4367 f2332;

    /* JADX INFO: renamed from: ۥؖ */
    public final InterfaceC4367 f2333;

    /* JADX INFO: renamed from: ۥؗ */
    public final C4852 f2334;

    /* JADX INFO: renamed from: ۥً */
    public final C4852 f2335;

    /* JADX INFO: renamed from: ۥَ */
    public final C2750 f2336;

    /* JADX INFO: renamed from: ۥُ */
    public int f2337;

    /* JADX INFO: renamed from: ۥّ */
    public int f2338;

    /* JADX INFO: renamed from: ۥْ */
    public final C0169 f2339;

    /* JADX INFO: renamed from: ۥٓ */
    public final C0169 f2340;

    /* JADX INFO: renamed from: ۥٕ */
    public final C4852 f2341;

    /* JADX INFO: renamed from: ۥٖ */
    public final C2228 f2342;

    /* JADX INFO: renamed from: ۥٙ */
    public final C3833 f2343;

    /* JADX INFO: renamed from: ۥۖ */
    public final C4852 f2344;

    /* JADX INFO: renamed from: ۥۗ */
    public C2257 f2345;

    /* JADX INFO: renamed from: ۥۜ */
    public long f2346;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean f2347;

    /* JADX INFO: renamed from: ۥۧ */
    public final C4852 f2348;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2566 f2349;

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean f2350;

    /* JADX INFO: renamed from: ۦٌ */
    public final C4852 f2351;

    /* JADX INFO: renamed from: ۦِ */
    public float f2352;

    /* JADX INFO: renamed from: ۦٕ */
    public final C1599 f2353;

    /* JADX INFO: renamed from: ۦٗ */
    public final C5086 f2354;

    /* JADX INFO: renamed from: ۦٚ */
    public final C4852 f2355;

    /* JADX INFO: renamed from: ۦٛ */
    public float f2356;

    /* JADX INFO: renamed from: ۦۗ */
    public final C1392 f2357;

    /* JADX INFO: renamed from: ۦۙ */
    public long f2358;

    /* JADX INFO: renamed from: ۦۚ */
    public InterfaceC2880 f2359;

    /* JADX INFO: renamed from: ۦۛ */
    public final C3378 f2360;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2243 f2361;

    /* JADX INFO: renamed from: ۦۨ */
    public int f2362;

    public AbstractC0631(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            AbstractC4690.m8038("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.f2334 = AbstractC2774.m5183(new C1553(0L));
        this.f2349 = new C2566(i, f, this);
        this.f2337 = i;
        this.f2358 = Long.MAX_VALUE;
        final int i2 = 0;
        this.f2357 = new C1392(new InterfaceC4745(this) { // from class: ۦٍؕؔٝ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ AbstractC0631 f12576;

            {
                this.f12576 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                C2257 c2257;
                int i3 = i2;
                C2358 c2358 = C2358.f7817;
                C2257 c2258 = null;
                AbstractC0631 abstractC0631 = this.f12576;
                switch (i3) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jM8128 = C4773.m8128(abstractC0631);
                        float f2 = abstractC0631.f2356 + fFloatValue;
                        long jM5222 = AbstractC2776.m5222(f2);
                        abstractC0631.f2356 = f2 - jM5222;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jM8128 + jM5222;
                            long jM7941 = AbstractC4554.m7941(j, abstractC0631.f2346, abstractC0631.f2358);
                            ?? r0 = j != jM7941;
                            long j2 = jM7941 - jM8128;
                            float f3 = j2;
                            abstractC0631.f2352 = f3;
                            if (Math.abs(j2) != 0) {
                                abstractC0631.f2355.setValue(Boolean.valueOf(f3 > 0.0f));
                                abstractC0631.f2341.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            C2257 c2257M4299 = ((C2257) abstractC0631.f2351.getValue()).m4299(i5);
                            if (c2257M4299 == null || (c2257 = abstractC0631.f2345) == null) {
                                c2258 = c2257M4299;
                            } else {
                                C2257 c2257M42910 = c2257.m4299(i5);
                                if (c2257M42910 != null) {
                                    abstractC0631.f2345 = c2257M42910;
                                    c2258 = c2257M4299;
                                }
                            }
                            if (c2258 != null) {
                                abstractC0631.m1398(c2258, abstractC0631.f2347, true);
                                abstractC0631.f2333.setValue(c2358);
                            } else {
                                C2566 c2566 = abstractC0631.f2349;
                                AbstractC0631 abstractC0632 = (AbstractC0631) c2566.f8568;
                                C0811 c0811 = (C0811) c2566.f8566;
                                c0811.m1710(c0811.m1711() + (abstractC0632.m1407() != 0 ? i4 / abstractC0632.m1407() : 0.0f));
                                C0605 c0605 = (C0605) abstractC0631.f2344.getValue();
                                if (c0605 != null) {
                                    c0605.m1359();
                                }
                            }
                            if (r0 != false) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        C0975 c0975 = (C0975) obj;
                        AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
                        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
                        AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
                        try {
                            c0975.m2081(abstractC0631.f2337);
                            return c2358;
                        } finally {
                            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                        }
                }
            }
        });
        final int i3 = 1;
        this.f2350 = true;
        this.f2351 = new C4852(AbstractC0630.f2330, C0373.f1364);
        this.f2359 = AbstractC0630.f2331;
        this.f2361 = new C2243();
        this.f2339 = new C0169(-1);
        this.f2340 = new C0169(i);
        C5460 c5460 = AbstractC3004.f10103;
        new C5592(0);
        new C5683(AbstractC1538.m3278().mo5118());
        new C5592(0);
        new C5683(AbstractC1538.m3278().mo5118());
        C2750 c2750 = new C2750(new InterfaceC4745(this) { // from class: ۦٍؕؔٝ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ AbstractC0631 f12576;

            {
                this.f12576 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                C2257 c2257;
                int i4 = i3;
                C2358 c2358 = C2358.f7817;
                C2257 c2258 = null;
                AbstractC0631 abstractC0631 = this.f12576;
                switch (i4) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jM8128 = C4773.m8128(abstractC0631);
                        float f2 = abstractC0631.f2356 + fFloatValue;
                        long jM5222 = AbstractC2776.m5222(f2);
                        abstractC0631.f2356 = f2 - jM5222;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jM8128 + jM5222;
                            long jM7941 = AbstractC4554.m7941(j, abstractC0631.f2346, abstractC0631.f2358);
                            ?? r0 = j != jM7941;
                            long j2 = jM7941 - jM8128;
                            float f3 = j2;
                            abstractC0631.f2352 = f3;
                            if (Math.abs(j2) != 0) {
                                abstractC0631.f2355.setValue(Boolean.valueOf(f3 > 0.0f));
                                abstractC0631.f2341.setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i5 = (int) j2;
                            int i6 = -i5;
                            C2257 c2257M4299 = ((C2257) abstractC0631.f2351.getValue()).m4299(i6);
                            if (c2257M4299 == null || (c2257 = abstractC0631.f2345) == null) {
                                c2258 = c2257M4299;
                            } else {
                                C2257 c2257M42910 = c2257.m4299(i6);
                                if (c2257M42910 != null) {
                                    abstractC0631.f2345 = c2257M42910;
                                    c2258 = c2257M4299;
                                }
                            }
                            if (c2258 != null) {
                                abstractC0631.m1398(c2258, abstractC0631.f2347, true);
                                abstractC0631.f2333.setValue(c2358);
                            } else {
                                C2566 c2566 = abstractC0631.f2349;
                                AbstractC0631 abstractC0632 = (AbstractC0631) c2566.f8568;
                                C0811 c0811 = (C0811) c2566.f8566;
                                c0811.m1710(c0811.m1711() + (abstractC0632.m1407() != 0 ? i5 / abstractC0632.m1407() : 0.0f));
                                C0605 c0605 = (C0605) abstractC0631.f2344.getValue();
                                if (c0605 != null) {
                                    c0605.m1359();
                                }
                            }
                            if (r0 != false) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        C0975 c0975 = (C0975) obj;
                        AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
                        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
                        AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
                        try {
                            c0975.m2081(abstractC0631.f2337);
                            return c2358;
                        } finally {
                            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                        }
                }
            }
        });
        this.f2336 = c2750;
        this.f2342 = new C2228(new C3121(11, this), c2750, new C0101(24, this));
        this.f2354 = new C5086(28);
        this.f2360 = new C3378();
        this.f2344 = AbstractC2774.m5183(null);
        this.f2353 = new C1599(this, i3);
        AbstractC0671.m1494(0, 0, 0, 0, 15);
        this.f2343 = new C3833();
        this.f2333 = AbstractC4225.m7435();
        this.f2332 = AbstractC4225.m7435();
        Boolean bool = Boolean.FALSE;
        this.f2348 = AbstractC2774.m5183(bool);
        this.f2335 = AbstractC2774.m5183(bool);
        this.f2355 = AbstractC2774.m5183(bool);
        this.f2341 = AbstractC2774.m5183(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9.mo1392(r7, r8, r0) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۥَ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m1389(p000.AbstractC0631 r6, p000.EnumC4386 r7, p000.InterfaceC5731 r8, p000.AbstractC0772 r9) {
        /*
            boolean r0 = r9 instanceof p000.C5638
            if (r0 == 0) goto L13
            r0 = r9
            ۦۤؑٝؓ r0 = (p000.C5638) r0
            int r1 = r0.f18576
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18576 = r1
            goto L18
        L13:
            ۦۤؑٝؓ r0 = new ۦۤؑٝؓ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f18577
            int r1 = r0.f18576
            r2 = 0
            r3 = 2
            r4 = 1
            ۥٟۚؕۨ r5 = p000.EnumC2282.f7590
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            ۥؘؙؗؖ r6 = r0.f18574
            p000.AbstractC0186.m409(r9)
            goto L77
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r6)
            return r2
        L33:
            ۥ۟ؑۧٝ r6 = r0.f18575
            r8 = r6
            ۦۦؙؑؑ r8 = (p000.InterfaceC5731) r8
            ۦٗؗٝؓ r7 = r0.f18573
            ۥؘؙؗؖ r6 = r0.f18574
            p000.AbstractC0186.m409(r9)
            goto L55
        L40:
            p000.AbstractC0186.m409(r9)
            r0.f18574 = r6
            r0.f18573 = r7
            r9 = r8
            ۥ۟ؑۧٝ r9 = (p000.AbstractC2426) r9
            r0.f18575 = r9
            r0.f18576 = r4
            java.lang.Object r9 = r6.m1404(r0)
            if (r9 != r5) goto L55
            goto L76
        L55:
            ۥٕؓؐۗ r9 = r6.f2357
            boolean r9 = r9.mo1397()
            if (r9 != 0) goto L66
            int r9 = r6.m1405()
            ۥؑؑۙۦ r1 = r6.f2340
            r1.m359(r9)
        L66:
            ۥٕؓؐۗ r9 = r6.f2357
            r0.f18574 = r6
            r0.f18573 = r2
            r0.f18575 = r2
            r0.f18576 = r3
            java.lang.Object r7 = r9.mo1392(r7, r8, r0)
            if (r7 != r5) goto L77
        L76:
            return r5
        L77:
            r7 = -1
            ۥؑؑۙۦ r6 = r6.f2339
            r6.m359(r7)
            ۥۜؑؒؑ r6 = p000.C2358.f7817
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0631.m1389(ۥؘؙؗؖ, ۦٗؗٝؓ, ۦۦؙؑؑ, ۥؚؒۥؔ):java.lang.Object");
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo1391() {
        return ((Boolean) this.f2348.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo1392(EnumC4386 enumC4386, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        return m1389(this, enumC4386, interfaceC5731, abstractC0772);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: ۥّ */
    public final Object m1393(int i, C0969 c0969, AbstractC0772 abstractC0772) {
        C4224 c4224;
        int i2;
        C0969 c09610;
        if (abstractC0772 instanceof C4224) {
            c4224 = (C4224) abstractC0772;
            int i3 = c4224.f14008;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4224.f14008 = i3 - Integer.MIN_VALUE;
            } else {
                c4224 = new C4224(this, abstractC0772);
            }
        } else {
            c4224 = new C4224(this, abstractC0772);
        }
        C4224 c4225 = c4224;
        Object obj = c4225.f14006;
        int i4 = c4225.f14008;
        C2358 c2358 = C2358.f7817;
        Object obj2 = EnumC2282.f7590;
        if (i4 == 0) {
            AbstractC0186.m409(obj);
            if ((i != m1405() || m1401() != 0.0f) && mo1406() != 0) {
                c4225.f14004 = c0969;
                c4225.f14005 = i;
                c4225.f14008 = 1;
                if (m1404(c4225) != obj2) {
                    i2 = i;
                    c09610 = c0969;
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                AbstractC0186.m409(obj);
                return c2358;
            }
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = c4225.f14005;
        C0969 c09611 = c4225.f14004;
        AbstractC0186.m409(obj);
        c09610 = c09611;
        InterfaceC5731 c1695 = new C1695(this, m1403(i2), m1407() * 0.0f, c09610, null);
        c4225.f14004 = null;
        c4225.f14008 = 2;
        return mo1392(EnumC4386.f14455, c1695, c4225) == obj2 ? obj2 : c2358;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final long m1394() {
        return ((C1553) this.f2334.getValue()).f5241;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m1395() {
        return ((int) Float.intBitsToFloat((int) (m1394() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m1394() & 4294967295L))) == 0;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m1396(int i, float f, boolean z) {
        C2566 c2566 = this.f2349;
        C0169 c0169 = (C0169) c2566.f8565;
        C0811 c0811 = (C0811) c2566.f8566;
        if (c0169.m360() != i || c0811.m1711() != f) {
            this.f2342.m4282();
        }
        ((C0169) c2566.f8565).m359(i);
        ((C3779) c2566.f8567).m6681(i);
        c0811.m1710(f);
        c2566.f8564 = null;
        if (!z) {
            this.f2332.setValue(C2358.f7817);
            return;
        }
        C0605 c0605 = (C0605) this.f2344.getValue();
        if (c0605 != null) {
            c0605.m1359();
        }
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1397() {
        return this.f2357.mo1397();
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0224  */
    /* JADX WARN: Code duplicated, block: B:189:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:190:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:195:0x0301  */
    /* JADX WARN: Code duplicated, block: B:198:0x030e  */
    /* JADX WARN: Code duplicated, block: B:201:0x031a  */
    /* JADX WARN: Code duplicated, block: B:213:0x0353 A[Catch: all -> 0x038f, TryCatch #0 {all -> 0x038f, blocks: (B:205:0x0331, B:208:0x033a, B:211:0x0347, B:213:0x0353, B:221:0x0389, B:219:0x0383, B:216:0x036b), top: B:237:0x0331 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x036a  */
    /* JADX WARN: Code duplicated, block: B:216:0x036b A[Catch: all -> 0x038f, TryCatch #0 {all -> 0x038f, blocks: (B:205:0x0331, B:208:0x033a, B:211:0x0347, B:213:0x0353, B:221:0x0389, B:219:0x0383, B:216:0x036b), top: B:237:0x0331 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0382  */
    /* JADX WARN: Code duplicated, block: B:219:0x0383 A[Catch: all -> 0x038f, TryCatch #0 {all -> 0x038f, blocks: (B:205:0x0331, B:208:0x033a, B:211:0x0347, B:213:0x0353, B:221:0x0389, B:219:0x0383, B:216:0x036b), top: B:237:0x0331 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:229:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:232:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:237:0x0331 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v39 */
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
    /* JADX INFO: renamed from: ۥۜ */
    public final void m1398(C2257 c2257, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        float f;
        int i;
        Object obj;
        boolean z7;
        ?? r2;
        ?? r10;
        ?? r7;
        float f2;
        long jM4300;
        long jM7934;
        long j;
        int i2;
        List list = c2257.f7492;
        int i3 = c2257.f7494;
        C3000 c3000 = c2257.f7498;
        C3000 c3001 = c2257.f7496;
        float f3 = c2257.f7499;
        this.f2336.f9098 = list.size();
        this.f2362 = c2257.f7490 + c2257.f7483;
        if (!z && this.f2347) {
            this.f2345 = c2257;
            return;
        }
        boolean z8 = true;
        if (z) {
            this.f2347 = true;
        }
        C2228 c2228 = this.f2342;
        boolean z9 = this.f2350;
        C2566 c2566 = this.f2349;
        if (!z2) {
            c2566.getClass();
            c2566.f8564 = c3001 != null ? c3001.f10087 : null;
            if (c2566.f8569 || !list.isEmpty()) {
                c2566.f8569 = true;
                int i4 = c3001 != null ? c3001.f10086 : 0;
                ((C0169) c2566.f8565).m359(i4);
                ((C3779) c2566.f8567).m6681(i4);
                ((C0811) c2566.f8566).m1710(f3);
            }
            if (z9) {
                z3 = z9;
                C2808 c2808 = c2228.f7385;
                C4912 c4912 = c2228.f7372;
                c2808.f9376 = c2257;
                c2808.f9377 = c2228.f7384;
                C3121 c3121 = c2228.f7376;
                int i5 = c2228.f7383;
                int i6 = -1;
                float f4 = 0.0f;
                if (i5 != -1 && i5 != c2808.m5358()) {
                    c2228.f7378 = true;
                    if (c2808.m5339()) {
                        int i7 = c2228.f7375;
                        if (i7 < 0) {
                            i7 = 0;
                        }
                        c2228.f7375 = i7;
                        C2257 c2258 = (C2257) c2808.f9376;
                        if (c2258 == null) {
                            c2258 = null;
                        }
                        int iM5358 = c2258.f7492.isEmpty() ? -1 : c2808.m5358() - 1;
                        if (iM5358 != -1) {
                            int i8 = c2228.f7381;
                            if (i8 <= iM5358) {
                                iM5358 = i8;
                            }
                            c2228.f7381 = iM5358;
                        }
                        if (c2228.f7373 <= 0.0f) {
                            c2228.m4281(c2808.m5340(), c2228.f7379 - 1);
                        } else {
                            c2228.m4281(0, c2808.m5359());
                        }
                    }
                }
                c2228.f7379 = c2808.m5358();
                if (c2808.m5339()) {
                    C2257 c2259 = (C2257) c2808.f9376;
                    if (c2259 == null) {
                        c2259 = null;
                    }
                    int size = c2259.f7487.size();
                    C2257 c22510 = (C2257) c2808.f9376;
                    if (c22510 == null) {
                        c22510 = null;
                    }
                    int size2 = c22510.f7492.size() + size;
                    C2257 c22511 = (C2257) c2808.f9376;
                    if (c22511 == null) {
                        c22511 = null;
                    }
                    int size3 = c22511.f7488.size() + size2;
                    int i9 = 0;
                    while (i9 < size3) {
                        C2257 c22512 = (C2257) c2808.f9376;
                        if (c22512 == null) {
                            c22512 = null;
                        }
                        int size4 = c22512.f7487.size();
                        C2257 c22513 = (C2257) c2808.f9376;
                        if (c22513 == null) {
                            c22513 = null;
                        }
                        int size5 = c22513.f7492.size();
                        if (i9 < size4) {
                            C2257 c22514 = (C2257) c2808.f9376;
                            if (c22514 == null) {
                                c22514 = null;
                            }
                            i = ((C3000) c22514.f7487.get(i9)).f10086;
                            f = f4;
                        } else {
                            f = f4;
                            if (i9 >= size4 && i9 < size4 + size5) {
                                C2257 c22515 = (C2257) c2808.f9376;
                                if (c22515 == null) {
                                    c22515 = null;
                                }
                                i = ((C3000) c22515.f7492.get(i9 - size4)).f10086;
                            } else if (i9 >= size4 + size5) {
                                C2257 c22516 = (C2257) c2808.f9376;
                                if (c22516 == null) {
                                    c22516 = null;
                                }
                                i = ((C3000) c22516.f7488.get((i9 - size4) - size5)).f10086;
                            } else {
                                i = i6;
                            }
                        }
                        C2257 c22517 = (C2257) c2808.f9376;
                        if (c22517 == null) {
                            c22517 = null;
                        }
                        int size6 = c22517.f7487.size();
                        C2257 c22518 = (C2257) c2808.f9376;
                        if (c22518 == null) {
                            c22518 = null;
                        }
                        int size7 = c22518.f7492.size();
                        if (i9 < size6) {
                            C2257 c22519 = (C2257) c2808.f9376;
                            if (c22519 == null) {
                                c22519 = null;
                            }
                            obj = ((C3000) c22519.f7487.get(i9)).f10087;
                        } else if (i9 >= size6 && i9 < size6 + size7) {
                            C2257 c22520 = (C2257) c2808.f9376;
                            if (c22520 == null) {
                                c22520 = null;
                            }
                            obj = ((C3000) c22520.f7492.get(i9 - size6)).f10087;
                        } else if (i9 >= size6 + size7) {
                            C2257 c22521 = (C2257) c2808.f9376;
                            if (c22521 == null) {
                                c22521 = null;
                            }
                            obj = ((C3000) c22521.f7488.get((i9 - size6) - size7)).f10087;
                        } else {
                            obj = C3612.f12031;
                        }
                        C2257 c22522 = (C2257) c2808.f9376;
                        if (c22522 == null) {
                            c22522 = null;
                        }
                        int i10 = c22522.f7490;
                        if (i != i6) {
                            if (c4912.m9572(i)) {
                                int i11 = ((C3612) c4912.m9571(i)).f12032;
                                Object obj2 = ((C3612) c4912.m9571(i)).f12033;
                                if (i11 == i10 && AbstractC3831.m6874(obj2, obj)) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                    c2228.f7378 = true;
                                }
                            } else {
                                z7 = true;
                            }
                            C3612 c3612 = (C3612) c4912.m9571(i);
                            if (c3612 != null) {
                                c3612.f12032 = i10;
                                c3612.f12033 = obj;
                            } else {
                                c3612 = new C3612();
                                c3612.f12033 = obj;
                                c3612.f12032 = i10;
                            }
                            c4912.m8319(i, c3612);
                            c2228.f7375 = Math.min(c2228.f7375, i);
                            c2228.f7381 = Math.max(c2228.f7381, i);
                            List list2 = (List) c2228.f7374.m8320(i);
                            if (list2 != null) {
                                int size8 = list2.size();
                                for (int i12 = 0; i12 < size8; i12++) {
                                    ((InterfaceC5841) list2.get(i12)).cancel();
                                }
                            }
                        } else {
                            z7 = true;
                        }
                        i9++;
                        f4 = f;
                        z8 = z7;
                        i6 = -1;
                    }
                    z4 = z8;
                    float f5 = f4;
                    if (c2228.f7378) {
                        boolean z10 = c2228.f7373 <= f5 ? z4 : false;
                        if (c2808.m5339()) {
                            C2257 c22523 = (C2257) c2808.f9376;
                            if (c22523 == null) {
                                c22523 = null;
                            }
                            AbstractC0993.m2143(c22523);
                            C2257 c22524 = (C2257) c2808.f9376;
                            if (c22524 == null) {
                                c22524 = null;
                            }
                            z6 = false;
                            c2228.m4280(c2808, c2808.m5359(), c2808.m5340(), c22524.f7489 != null ? ((AbstractC0631) c3121.f10451).f2362 : 0, c2808.m5336(), c2808.m5342(), 0.0f, z10);
                        } else {
                            z6 = false;
                        }
                        c2228.f7378 = z6;
                        z5 = z6;
                    } else {
                        z3 = z3;
                        z4 = z4;
                        z5 = false;
                    }
                } else {
                    z3 = z3;
                    z4 = true;
                    z5 = false;
                    c2228.m4282();
                }
                c2228.f7383 = c2808.m5358();
                r2 = z5;
            }
            this.f2351.setValue(c2257);
            this.f2348.setValue(Boolean.valueOf(c2257.f7495));
            if (c3000 != null) {
                i2 = c3000.f10086;
            } else {
                r10 = r2;
            }
            if (r10 == 0 || i3 != 0) {
                r10 = i2;
                r7 = z4;
            } else {
                r7 = r2;
            }
            this.f2335.setValue(Boolean.valueOf((boolean) r7));
            if (c3000 != null) {
                this.f2337 = c3000.f10086;
            }
            this.f2338 = i3;
            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
            if (z3) {
                try {
                    if (c2257.f7491 < mo1406() && Math.abs(this.f2352) > 0.5f) {
                        f2 = this.f2352;
                        if (m1402().f7485 == EnumC1616.f5425) {
                            if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m1394() & 4294967295L)))) {
                                if (m1395()) {
                                }
                            }
                        } else if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m1394() >> 32)))) {
                            if (m1395()) {
                            }
                        }
                        c2228.m4285(this.f2352, c2257);
                    }
                } catch (Throwable th) {
                    AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
                    throw th;
                }
            }
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            this.f2358 = AbstractC0630.m1388(c2257, mo1406());
            mo1406();
            if (c2257.f7485 == EnumC1616.f5424) {
                jM4300 = c2257.m4300() >> 32;
            } else {
                jM4300 = c2257.m4300() & 4294967295L;
            }
            int i13 = (int) jM4300;
            c2257.f7501.getClass();
            jM7934 = AbstractC4554.m7934(r2, r2, i13);
            j = this.f2358;
            if (jM7934 > j) {
                jM7934 = j;
            }
            this.f2346 = jM7934;
        }
        ((C0811) c2566.f8566).m1710(f3);
        z4 = true;
        z3 = z9;
        r2 = 0;
        this.f2351.setValue(c2257);
        this.f2348.setValue(Boolean.valueOf(c2257.f7495));
        if (c3000 != null) {
            i2 = c3000.f10086;
        } else {
            r10 = r2;
        }
        if (r10 == 0) {
            r10 = i2;
            r7 = z4;
        } else {
            r10 = i2;
            r7 = z4;
        }
        this.f2335.setValue(Boolean.valueOf((boolean) r7));
        if (c3000 != null) {
            this.f2337 = c3000.f10086;
        }
        this.f2338 = i3;
        AbstractC3191 abstractC3191M7474 = AbstractC4225.m7473();
        InterfaceC4745 interfaceC4745Mo4946 = abstractC3191M7474 != null ? abstractC3191M7474.mo4945() : null;
        AbstractC3191 abstractC3191M7453 = AbstractC4225.m7452(abstractC3191M7474);
        if (z3) {
            if (c2257.f7491 < mo1406()) {
                f2 = this.f2352;
                if (m1402().f7485 == EnumC1616.f5425) {
                    if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m1394() & 4294967295L)))) {
                        if (m1395()) {
                        }
                    }
                } else if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m1394() >> 32)))) {
                    if (m1395()) {
                    }
                }
                c2228.m4285(this.f2352, c2257);
            }
        }
        AbstractC4225.m7466(abstractC3191M7474, abstractC3191M7453, interfaceC4745Mo4946);
        this.f2358 = AbstractC0630.m1388(c2257, mo1406());
        mo1406();
        if (c2257.f7485 == EnumC1616.f5424) {
            jM4300 = c2257.m4300() >> 32;
        } else {
            jM4300 = c2257.m4300() & 4294967295L;
        }
        int i14 = (int) jM4300;
        c2257.f7501.getClass();
        jM7934 = AbstractC4554.m7934(r2, r2, i14);
        j = this.f2358;
        if (jM7934 > j) {
            jM7934 = j;
        }
        this.f2346 = jM7934;
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo1399() {
        return ((Boolean) this.f2335.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1400(float f) {
        return this.f2357.mo1400(f);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final float m1401() {
        return ((C0811) this.f2349.f8566).m1711();
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final C2257 m1402() {
        return (C2257) this.f2351.getValue();
    }

    /* JADX INFO: renamed from: ۦِ */
    public final int m1403(int i) {
        if (mo1406() > 0) {
            return AbstractC4554.m7934(i, 0, mo1406() - 1);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final Object m1404(AbstractC0772 abstractC0772) {
        Object objM6145;
        return (this.f2351.getValue() == AbstractC0630.f2330 && (objM6145 = this.f2360.m6145(abstractC0772)) == EnumC2282.f7590) ? objM6145 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final int m1405() {
        return ((C0169) this.f2349.f8565).m360();
    }

    /* JADX INFO: renamed from: ۦۚ */
    public abstract int mo1406();

    /* JADX INFO: renamed from: ۦ۟ */
    public final int m1407() {
        return ((C2257) this.f2351.getValue()).f7483 + m1408();
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final int m1408() {
        return ((C2257) this.f2351.getValue()).f7490;
    }
}
