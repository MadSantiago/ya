package p000;

/* JADX INFO: renamed from: ۦۣؒۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3145 implements InterfaceC5823 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C1387 f10616 = new C1387();

    /* JADX INFO: renamed from: ۥۗ */
    public final C0352 f10615 = new C0352(0);

    /* JADX INFO: renamed from: ۥؗ */
    public final C0710 f10614 = new C0710(1, new C2499(2, null, 2));

    @Override // p000.InterfaceC5823
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo5823(C3540 c3540) {
        return new Integer(this.f10615.f1284.incrementAndGet());
    }

    @Override // p000.InterfaceC5823
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4707 mo5824() {
        return this.f10614;
    }

    @Override // p000.InterfaceC5823
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo5825(AbstractC0772 abstractC0772) {
        return new Integer(this.f10615.f1284.get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ۦۣؒۢ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ۦؒؑۡۦ] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [ۦؒؑۡۦ] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // p000.InterfaceC5823
    /* JADX INFO: renamed from: ۥۣ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5826(p000.InterfaceC4745 r7, p000.AbstractC0772 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.C0153
            if (r0 == 0) goto L13
            r0 = r8
            ۥٜؐٔ r0 = (p000.C0153) r0
            int r1 = r0.f591
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f591 = r1
            goto L18
        L13:
            ۥٜؐٔ r0 = new ۥٜؐٔ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f589
            int r1 = r0.f591
            r2 = 2
            r3 = 1
            r4 = 0
            ۥٟۚؕۨ r5 = p000.EnumC2282.f7590
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.f588
            ۦؒؑۡۦ r6 = (p000.InterfaceC3087) r6
            p000.AbstractC0186.m409(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r6)
            return r4
        L37:
            ۥٕؒٞۡ r6 = r0.f587
            java.lang.Object r7 = r0.f588
            ۦٌُٝؔ r7 = (p000.InterfaceC4745) r7
            p000.AbstractC0186.m409(r8)
            goto L53
        L41:
            p000.AbstractC0186.m409(r8)
            r0.f588 = r7
            ۥٕؒٞۡ r6 = r6.f10616
            r0.f587 = r6
            r0.f591 = r3
            java.lang.Object r8 = r6.mo2949(r0)
            if (r8 != r5) goto L53
            goto L5f
        L53:
            r0.f588 = r6     // Catch: java.lang.Throwable -> L2f
            r0.f587 = r4     // Catch: java.lang.Throwable -> L2f
            r0.f591 = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.mo211(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L60
        L5f:
            return r5
        L60:
            r6.mo2950(r4)
            return r8
        L64:
            r6.mo2950(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3145.mo5826(ۦٌُٝؔ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.InterfaceC5823
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo5827(InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) throws Throwable {
        C3952 c3952;
        C1387 c1387;
        boolean z;
        Throwable th;
        if (abstractC0772 instanceof C3952) {
            c3952 = (C3952) abstractC0772;
            int i = c3952.f13225;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3952.f13225 = i - Integer.MIN_VALUE;
            } else {
                c3952 = new C3952(this, abstractC0772);
            }
        } else {
            c3952 = new C3952(this, abstractC0772);
        }
        Object obj = c3952.f13223;
        int i2 = c3952.f13225;
        if (i2 != 0) {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c3952.f13221;
            c1387 = c3952.f13222;
            try {
                AbstractC0186.m409(obj);
                if (z) {
                    c1387.mo2950(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    c1387.mo2950(null);
                }
                throw th;
            }
        }
        AbstractC0186.m409(obj);
        C1387 c1388 = this.f10616;
        boolean zM2951 = c1388.m2951();
        try {
            Object objValueOf = Boolean.valueOf(zM2951);
            c3952.f13222 = c1388;
            c3952.f13221 = zM2951;
            c3952.f13225 = 1;
            Object objMo219 = interfaceC5731.mo219(objValueOf, c3952);
            Object obj2 = EnumC2282.f7590;
            if (objMo219 == obj2) {
                return obj2;
            }
            c1387 = c1388;
            z = zM2951;
            obj = objMo219;
            if (z) {
                c1387.mo2950(null);
            }
            return obj;
        } catch (Throwable th3) {
            c1387 = c1388;
            z = zM2951;
            th = th3;
            if (z) {
                c1387.mo2950(null);
            }
            throw th;
        }
    }
}
