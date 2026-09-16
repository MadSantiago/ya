package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥًِؕۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0846 implements InterfaceC3096 {

    /* JADX INFO: renamed from: ۦٕ */
    public static final C2346 f3017 = AbstractC2552.m4819(new C4876(6), new C4618(11));

    /* JADX INFO: renamed from: ۥؗ */
    public C1282 f3018;

    /* JADX INFO: renamed from: ۥَ */
    public final InterfaceC4367 f3019;

    /* JADX INFO: renamed from: ۥُ */
    public final C4752 f3020;

    /* JADX INFO: renamed from: ۥّ */
    public final C4852 f3021;

    /* JADX INFO: renamed from: ۥْ */
    public final C3121 f3022;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3833 f3023;

    /* JADX INFO: renamed from: ۥٖ */
    public final C4852 f3024;

    /* JADX INFO: renamed from: ۥۖ */
    public final C3369 f3025;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f3026;

    /* JADX INFO: renamed from: ۥۜ */
    public float f3027;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1192 f3028;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f3029;

    /* JADX INFO: renamed from: ۦؚ */
    public final C1599 f3030;

    /* JADX INFO: renamed from: ۦٌ */
    public final C3378 f3031;

    /* JADX INFO: renamed from: ۦِ */
    public final boolean f3032;

    /* JADX INFO: renamed from: ۦٗ */
    public final C4852 f3033;

    /* JADX INFO: renamed from: ۦٛ */
    public final C1392 f3034;

    /* JADX INFO: renamed from: ۦۗ */
    public C0605 f3035;

    /* JADX INFO: renamed from: ۦۙ */
    public final C2243 f3036;

    /* JADX INFO: renamed from: ۦۚ */
    public final C0474 f3037;

    /* JADX INFO: renamed from: ۦۛ */
    public final InterfaceC4367 f3038;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2750 f3039;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5086 f3040;

    public C0846(int i, int i2) {
        C1192 c1192 = new C1192();
        c1192.f4114 = -1;
        c1192.f4115 = -1;
        this.f3028 = c1192;
        C4752 c4752 = new C4752();
        c4752.f15686 = new C0169(i);
        c4752.f15684 = new C0169(i2);
        c4752.f15685 = new C3779(i);
        this.f3020 = c4752;
        this.f3021 = new C4852(AbstractC1833.f6096, C0373.f1364);
        this.f3036 = new C2243();
        this.f3034 = new C1392(new C0091(15, this));
        this.f3032 = true;
        this.f3030 = new C1599(this, 0);
        this.f3031 = new C3378();
        C0474 c0474 = new C0474();
        long[] jArr = AbstractC5064.f16815;
        c0474.f1727 = new C3262();
        C3639 c3639 = AbstractC5705.f18789;
        c0474.f1722 = new C3639();
        c0474.f1728 = new ArrayList();
        c0474.f1723 = new ArrayList();
        c0474.f1724 = new ArrayList();
        c0474.f1730 = new ArrayList();
        c0474.f1726 = new ArrayList();
        c0474.f1729 = new C5222(c0474);
        this.f3037 = c0474;
        this.f3040 = new C5086(28);
        this.f3039 = new C2750(new C2742(this, i));
        this.f3022 = new C3121(3, this);
        this.f3023 = new C3833();
        this.f3019 = AbstractC4225.m7435();
        Boolean bool = Boolean.FALSE;
        this.f3024 = AbstractC2774.m5183(bool);
        this.f3033 = AbstractC2774.m5183(bool);
        this.f3038 = AbstractC4225.m7435();
        C3369 c3369 = new C3369(6, false);
        C1280 c1280 = AbstractC3831.f12709;
        Float fValueOf = Float.valueOf(0.0f);
        c3369.f11254 = new C3411(c1280, fValueOf, (AbstractC1814) c1280.f4359.mo211(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f3025 = c3369;
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo1391() {
        return ((Boolean) this.f3024.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.f3034.mo1392(r7, r8, r0) == r5) goto L23;
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
    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥُ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1392(p000.EnumC4386 r7, p000.InterfaceC5731 r8, p000.AbstractC0772 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p000.C0791
            if (r0 == 0) goto L13
            r0 = r9
            ۥؙؚؖؔ r0 = (p000.C0791) r0
            int r1 = r0.f2850
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2850 = r1
            goto L18
        L13:
            ۥؙؚؖؔ r0 = new ۥؙؚؖؔ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f2848
            int r1 = r0.f2850
            r2 = 0
            r3 = 2
            r4 = 1
            ۥٟۚؕۨ r5 = p000.EnumC2282.f7590
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p000.AbstractC0186.m409(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r6)
            return r2
        L31:
            ۥ۟ؑۧٝ r7 = r0.f2846
            r8 = r7
            ۦۦؙؑؑ r8 = (p000.InterfaceC5731) r8
            ۦٗؗٝؓ r7 = r0.f2847
            p000.AbstractC0186.m409(r9)
            goto L5b
        L3c:
            p000.AbstractC0186.m409(r9)
            ۦٟؔؒۜ r9 = r6.f3021
            java.lang.Object r9 = r9.getValue()
            ۥُٓؕۦ r1 = p000.AbstractC1833.f6096
            if (r9 != r1) goto L5b
            r0.f2847 = r7
            r9 = r8
            ۥ۟ؑۧٝ r9 = (p000.AbstractC2426) r9
            r0.f2846 = r9
            r0.f2850 = r4
            ۦٜؖؗۡ r9 = r6.f3031
            java.lang.Object r9 = r9.m6145(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.f2847 = r2
            r0.f2846 = r2
            r0.f2850 = r3
            ۥٕؓؐۗ r6 = r6.f3034
            java.lang.Object r6 = r6.mo1392(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            ۥۜؑؒؑ r6 = p000.C2358.f7817
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0846.mo1392(ۦٗؗٝؓ, ۦۦؙؑؑ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m1758(C1282 c1282, boolean z, boolean z2) {
        C1280 c1280 = AbstractC3831.f12709;
        List list = c1282.f4373;
        int i = c1282.f4375;
        int i2 = c1282.f4365;
        C5851 c5851 = c1282.f4367;
        this.f3039.f9098 = list.size();
        C3369 c3369 = this.f3025;
        C4752 c4752 = this.f3020;
        InterfaceC0443 interfaceC0443 = null;
        if (!z && this.f3026) {
            this.f3018 = c1282;
            AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
            InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
            AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
            try {
                if (((Number) ((C3411) c3369.f11254).f11359.getValue()).floatValue() != 0.0f && c5851 != null && c5851.f19289 == ((C0169) c4752.f15686).m360() && i2 == ((C0169) c4752.f15684).m360()) {
                    C2127 c2127 = (C2127) c3369.f11255;
                    if (c2127 != null) {
                        c2127.mo871(null);
                    }
                    c3369.f11254 = new C3411(c1280, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            }
        }
        if (z) {
            this.f3026 = true;
        }
        this.f3033.setValue(Boolean.valueOf(((c5851 != null ? c5851.f19289 : 0) == 0 && i2 == 0) ? false : true));
        this.f3024.setValue(Boolean.valueOf(c1282.f4361));
        this.f3027 -= c1282.f4368;
        this.f3021.setValue(c1282);
        if (z2) {
            c4752.getClass();
            if (i2 < 0.0f) {
                AbstractC4690.m8035("scrollOffset should be non-negative");
            }
            ((C0169) c4752.f15684).m359(i2);
            c3369 = c3369;
        } else {
            C5851 c5852 = (C5851) AbstractC0973.m2058(list);
            C5851 c5853 = (C5851) AbstractC0973.m2043(list);
            AbstractC2765.m5128(c5852 != null ? c5852.f19289 : -1L, "firstVisibleItem:index");
            AbstractC2765.m5128(c5853 != null ? c5853.f19289 : -1L, "lastVisibleItem:index");
            c4752.getClass();
            c4752.f15688 = c5851 != null ? c5851.f19296 : null;
            if (c4752.f15687 || i > 0) {
                c4752.f15687 = true;
                if (i2 < 0.0f) {
                    AbstractC4690.m8035("scrollOffset should be non-negative");
                }
                c4752.m8077(c5851 != null ? c5851.f19289 : 0, i2);
            }
            if (this.f3032) {
                C1192 c1192 = this.f3028;
                int i3 = c1192.f4114;
                boolean z3 = c1192.f4111;
                if (i3 != -1 && !list.isEmpty() && i3 != C1192.m2510(c1282, z3)) {
                    c1192.f4114 = -1;
                    InterfaceC5841 interfaceC5841 = c1192.f4113;
                    if (interfaceC5841 != null) {
                        interfaceC5841.cancel();
                    }
                    c1192.f4113 = null;
                }
                int i4 = c1192.f4115;
                if (i4 != -1 && c1192.f4112 != 0.0f && i4 != i && !list.isEmpty()) {
                    int iM2510 = C1192.m2510(c1282, c1192.f4112 < 0.0f);
                    if (iM2510 >= 0 && iM2510 < i) {
                        c1192.f4114 = iM2510;
                        c1192.f4113 = C3121.m5736(this.f3022, iM2510);
                    }
                }
                c1192.f4115 = i;
            }
        }
        if (z) {
            float f = c1282.f4363;
            InterfaceC2880 interfaceC2880 = c1282.f4372;
            InterfaceC4643 interfaceC4643 = c1282.f4366;
            c3369.getClass();
            if (f <= interfaceC2880.mo741(1.0f)) {
                return;
            }
            AbstractC3191 abstractC3191M7474 = AbstractC4225.m7473();
            InterfaceC4745 interfaceC4745Mo4946 = abstractC3191M7474 != null ? abstractC3191M7474.mo4945() : null;
            AbstractC3191 abstractC3191M7453 = AbstractC4225.m7452(abstractC3191M7474);
            C3369 c33610 = c3369;
            try {
                float fFloatValue = ((Number) ((C3411) c33610.f11254).f11359.getValue()).floatValue();
                C2127 c2128 = (C2127) c33610.f11255;
                if (c2128 != null) {
                    c2128.mo871(null);
                }
                C3411 c3411 = (C3411) c33610.f11254;
                if (c3411.f11358) {
                    c33610.f11254 = AbstractC4554.m7892(c3411, fFloatValue - f, 0.0f, 30);
                } else {
                    c33610.f11254 = new C3411(c1280, Float.valueOf(-f), null, 60);
                }
                c33610.f11255 = AbstractC2765.m5135(interfaceC4643, null, 0, new C2718(c33610, interfaceC0443, 5), 3);
            } finally {
                AbstractC4225.m7466(abstractC3191M7474, abstractC3191M7453, interfaceC4745Mo4946);
            }
        }
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1397() {
        return this.f3034.mo1397();
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final C1282 m1759() {
        return (C1282) this.f3021.getValue();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo1399() {
        return ((Boolean) this.f3033.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1400(float f) {
        return this.f3034.mo1400(f);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m1760(float f, C1282 c1282) {
        InterfaceC5841 interfaceC5841;
        InterfaceC5841 interfaceC5842;
        if (this.f3032) {
            boolean zIsEmpty = c1282.f4373.isEmpty();
            C1192 c1192 = this.f3028;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iM2510 = C1192.m2510(c1282, z);
                if (iM2510 >= 0 && iM2510 < c1282.f4375) {
                    if (iM2510 != c1192.f4114) {
                        if (c1192.f4111 != z) {
                            c1192.f4114 = -1;
                            InterfaceC5841 interfaceC5843 = c1192.f4113;
                            if (interfaceC5843 != null) {
                                interfaceC5843.cancel();
                            }
                            c1192.f4113 = null;
                        }
                        c1192.f4111 = z;
                        c1192.f4114 = iM2510;
                        c1192.f4113 = C3121.m5736(this.f3022, iM2510);
                    }
                    List list = c1282.f4373;
                    if (z) {
                        C5851 c5851 = (C5851) AbstractC0973.m2040(list);
                        if (((c5851.f19293 + c5851.f19295) + c1282.f4364) - c1282.f4370 < (-f) && (interfaceC5842 = c1192.f4113) != null) {
                            interfaceC5842.mo928();
                        }
                    } else if (c1282.f4369 - ((C5851) AbstractC0973.m2045(list)).f19293 < f && (interfaceC5841 = c1192.f4113) != null) {
                        interfaceC5841.mo928();
                    }
                }
            }
            c1192.f4112 = f;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m1761() {
        return ((C0169) this.f3020.f15686).m360();
    }
}
