package p000;

/* JADX INFO: renamed from: ۥِٕؒۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1386 extends AbstractC5381 implements InterfaceC0289, InterfaceC3028 {

    /* JADX INFO: renamed from: ۥً */
    public InterfaceC3028 f4737;

    /* JADX INFO: renamed from: ۥٕ */
    public C1386 f4738;

    /* JADX INFO: renamed from: ۥۙ */
    public final String f4739;

    /* JADX INFO: renamed from: ۦٚ */
    public C3323 f4740;

    public C1386(InterfaceC3028 interfaceC3028, C3323 c3323) {
        this.f4737 = interfaceC3028;
        this.f4740 = c3323 == null ? new C3323() : c3323;
        this.f4739 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        C3323 c3323 = this.f4740;
        c3323.f11134 = this;
        c3323.f11133 = null;
        this.f4738 = null;
        c3323.f11132 = new C5285(17, this);
        c3323.f11135 = m9076();
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final InterfaceC4643 m2942() {
        C1386 c1386M2944 = m2944();
        InterfaceC4643 interfaceC4643M2942 = c1386M2944 != null ? c1386M2944.m2942() : null;
        if (interfaceC4643M2942 != null && AbstractC4009.m7150(interfaceC4643M2942)) {
            return interfaceC4643M2942;
        }
        InterfaceC4643 interfaceC4643 = this.f4740.f11135;
        if (interfaceC4643 != null) {
            return interfaceC4643;
        }
        C1078.m2276("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    @Override // p000.InterfaceC0289
    /* JADX INFO: renamed from: ۥٓ */
    public final Object mo612() {
        return this.f4739;
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۥ٘ */
    public final long mo2943(int i, long j, long j2) {
        long jMo2943 = this.f4737.mo2943(i, j, j2);
        C1386 c1386M2944 = this.f17786 ? m2944() : null;
        return C1553.m3304(jMo2943, c1386M2944 != null ? c1386M2944.mo2943(i, C1553.m3304(j, jMo2943), C1553.m3308(j2, jMo2943)) : 0L);
    }

    /* JADX INFO: renamed from: ۥٜ */
    public final C1386 m2944() {
        C2457 c2457;
        InterfaceC0289 interfaceC0289 = null;
        if (!this.f17786) {
            return null;
        }
        if (!this.f17791.f17786) {
            AbstractC3480.m6278("visitAncestors called on an unattached node");
        }
        AbstractC5381 abstractC5381 = this.f17791.f17780;
        C0605 c0605M9270 = AbstractC5537.m9270(this);
        loop0: while (c0605M9270 != null) {
            if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 262144) != 0) {
                while (abstractC5381 != null) {
                    if ((abstractC5381.f17781 & 262144) != 0) {
                        AbstractC5381 abstractC5381M9233 = abstractC5381;
                        C0863 c0863 = null;
                        while (abstractC5381M9233 != null) {
                            if (abstractC5381M9233 instanceof InterfaceC0289) {
                                InterfaceC0289 interfaceC02810 = (InterfaceC0289) abstractC5381M9233;
                                if (AbstractC3831.m6874(this.f4739, interfaceC02810.mo612()) && C1386.class == interfaceC02810.getClass()) {
                                    interfaceC0289 = interfaceC02810;
                                    break loop0;
                                }
                            }
                            if ((abstractC5381M9233.f17781 & 262144) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                int i = 0;
                                for (AbstractC5381 abstractC5382 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
                                    if ((abstractC5382.f17781 & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC5381M9233 = abstractC5382;
                                        } else {
                                            if (c0863 == null) {
                                                c0863 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (abstractC5381M9233 != null) {
                                                c0863.m1843(abstractC5381M9233);
                                                abstractC5381M9233 = null;
                                            }
                                            c0863.m1843(abstractC5382);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC5381M9233 = AbstractC5537.m9233(c0863);
                        }
                    }
                    abstractC5381 = abstractC5381.f17780;
                }
            }
            c0605M9270 = c0605M9270.m1356();
            abstractC5381 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
        }
        return (C1386) interfaceC0289;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۥۨ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2945(long r7, p000.InterfaceC0443 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p000.C2699
            if (r0 == 0) goto L13
            r0 = r9
            ۥؘۤؖۧ r0 = (p000.C2699) r0
            int r1 = r0.f8950
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8950 = r1
            goto L1a
        L13:
            ۥؘۤؖۧ r0 = new ۥؘۤؖۧ
            ۥؚؒۥؔ r9 = (p000.AbstractC0772) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.f8947
            int r1 = r0.f8950
            r2 = 0
            r3 = 2
            r4 = 1
            ۥٟۚؕۨ r5 = p000.EnumC2282.f7590
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.f8948
            p000.AbstractC0186.m409(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r6)
            return r2
        L35:
            long r7 = r0.f8948
            p000.AbstractC0186.m409(r9)
            goto L53
        L3b:
            p000.AbstractC0186.m409(r9)
            boolean r9 = r6.f17786
            if (r9 == 0) goto L46
            ۥِٕؒۥ r2 = r6.m2944()
        L46:
            if (r2 == 0) goto L58
            r0.f8948 = r7
            r0.f8950 = r4
            java.lang.Object r9 = r2.mo2945(r7, r0)
            if (r9 != r5) goto L53
            goto L6a
        L53:
            ۥٍؕۛؔ r9 = (p000.C0963) r9
            long r1 = r9.f3407
            goto L5a
        L58:
            r1 = 0
        L5a:
            ۦَؑؓٚ r6 = r6.f4737
            long r7 = p000.C0963.m2000(r7, r1)
            r0.f8948 = r1
            r0.f8950 = r3
            java.lang.Object r9 = r6.mo2945(r7, r0)
            if (r9 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r1
        L6c:
            ۥٍؕۛؔ r9 = (p000.C0963) r9
            long r8 = r9.f3407
            long r6 = p000.C0963.m1996(r6, r8)
            ۥٍؕۛؔ r8 = new ۥٍؕۛؔ
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1386.mo2945(long, ۥَؕؒٝ):java.lang.Object");
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۦٌ */
    public final long mo2946(long j, int i) {
        C1386 c1386M2944 = this.f17786 ? m2944() : null;
        long jMo2946 = c1386M2944 != null ? c1386M2944.mo2946(j, i) : 0L;
        return C1553.m3304(jMo2946, this.f4737.mo2946(C1553.m3308(j, jMo2946), i));
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        C5450 c5450 = new C5450();
        AbstractC5378.m9057(this, new C0302(c5450, 2));
        C1386 c1386 = (C1386) ((InterfaceC0289) c5450.f17965);
        this.f4738 = c1386;
        C3323 c3323 = this.f4740;
        c3323.f11133 = c1386;
        if (c3323.f11134 == this) {
            c3323.f11134 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۦۜ */
    public final Object mo2947(long j, long j2, InterfaceC0443 interfaceC0443) {
        C1788 c1788;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (interfaceC0443 instanceof C1788) {
            c1788 = (C1788) interfaceC0443;
            int i = c1788.f5982;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1788.f5982 = i - Integer.MIN_VALUE;
            } else {
                c1788 = new C1788(this, (AbstractC0772) interfaceC0443);
            }
        } else {
            c1788 = new C1788(this, (AbstractC0772) interfaceC0443);
        }
        C1788 c1789 = c1788;
        Object objMo2947 = c1789.f5980;
        int i2 = c1789.f5982;
        C1386 c1386M2944 = null;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(objMo2947);
            InterfaceC3028 interfaceC3028 = this.f4737;
            c1789.f5979 = j;
            c1789.f5978 = j2;
            c1789.f5982 = 1;
            objMo2947 = interfaceC3028.mo2947(j, j2, c1789);
            if (objMo2947 != enumC2282) {
                j3 = j;
                j4 = j2;
            }
            return enumC2282;
        }
        if (i2 == 1) {
            j4 = c1789.f5978;
            j3 = c1789.f5979;
            AbstractC0186.m409(objMo2947);
        } else {
            if (i2 != 2) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = c1789.f5979;
            AbstractC0186.m409(objMo2947);
        }
        j6 = ((C0963) objMo2947).f3407;
        j5 = j7;
        return new C0963(C0963.m1996(j5, j6));
        j5 = ((C0963) objMo2947).f3407;
        boolean z = this.f17786;
        if (!z) {
            c1386M2944 = this.f4738;
        } else if (z) {
            c1386M2944 = m2944();
        }
        if (c1386M2944 != null) {
            long jM1996 = C0963.m1996(j3, j5);
            long jM2000 = C0963.m2000(j4, j5);
            c1789.f5979 = j5;
            c1789.f5982 = 2;
            objMo2947 = c1386M2944.mo2947(jM1996, jM2000, c1789);
            if (objMo2947 != enumC2282) {
                j7 = j5;
                j6 = ((C0963) objMo2947).f3407;
                j5 = j7;
            }
            return enumC2282;
        }
        j6 = 0;
        return new C0963(C0963.m1996(j5, j6));
    }
}
