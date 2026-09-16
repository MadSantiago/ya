package p000;

/* JADX INFO: renamed from: ۦؖؑٓؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3323 {

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC4448 f11132 = new C5285(16, this);

    /* JADX INFO: renamed from: ۥۗ */
    public C1386 f11133;

    /* JADX INFO: renamed from: ۥۣ */
    public C1386 f11134;

    /* JADX INFO: renamed from: ۦؑ */
    public InterfaceC4643 f11135;

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4643 m6097() {
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) this.f11132.mo449();
        if (interfaceC4643 != null) {
            return interfaceC4643;
        }
        C1078.m2276("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m6098(long j, AbstractC0772 abstractC0772) {
        C0382 c0382;
        long j2;
        if (abstractC0772 instanceof C0382) {
            c0382 = (C0382) abstractC0772;
            int i = c0382.f1424;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0382.f1424 = i - Integer.MIN_VALUE;
            } else {
                c0382 = new C0382(this, abstractC0772);
            }
        } else {
            c0382 = new C0382(this, abstractC0772);
        }
        Object objMo2945 = c0382.f1423;
        int i2 = c0382.f1424;
        if (i2 == 0) {
            AbstractC0186.m409(objMo2945);
            C1386 c1386 = this.f11134;
            C1386 c1386M2944 = c1386 != null ? c1386.m2944() : null;
            if (c1386M2944 != null) {
                c0382.f1424 = 1;
                objMo2945 = c1386M2944.mo2945(j, c0382);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objMo2945 == enumC2282) {
                    return enumC2282;
                }
            } else {
                j2 = 0;
            }
            return new C0963(j2);
        }
        if (i2 != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC0186.m409(objMo2945);
        j2 = ((C0963) objMo2945).f3407;
        return new C0963(j2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: ۥۣ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6099(long r8, long r10, p000.AbstractC0772 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof p000.C1059
            if (r0 == 0) goto L14
            r0 = r12
            ۥُؕۨؗ r0 = (p000.C1059) r0
            int r1 = r0.f3736
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f3736 = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            ۥُؕۨؗ r0 = new ۥُؕۨؗ
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.f3735
            int r1 = r12.f3736
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p000.AbstractC0186.m409(r0)
            goto L6e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r7)
            return r2
        L31:
            p000.AbstractC0186.m409(r0)
            goto L55
        L35:
            p000.AbstractC0186.m409(r0)
            ۥِٕؒۥ r0 = r7.f11134
            if (r0 == 0) goto L41
            ۥِٕؒۥ r0 = r0.m2944()
            goto L42
        L41:
            r0 = r2
        L42:
            r5 = 0
            ۥٟۚؕۨ r1 = p000.EnumC2282.f7590
            if (r0 != 0) goto L5a
            ۥِٕؒۥ r7 = r7.f11133
            if (r7 == 0) goto L72
            r12.f3736 = r4
            java.lang.Object r0 = r7.mo2947(r8, r10, r12)
            if (r0 != r1) goto L55
            goto L6d
        L55:
            ۥٍؕۛؔ r0 = (p000.C0963) r0
            long r5 = r0.f3407
            goto L72
        L5a:
            ۥِٕؒۥ r7 = r7.f11134
            if (r7 == 0) goto L62
            ۥِٕؒۥ r2 = r7.m2944()
        L62:
            r7 = r2
            if (r7 == 0) goto L72
            r12.f3736 = r3
            java.lang.Object r0 = r7.mo2947(r8, r10, r12)
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            ۥٍؕۛؔ r0 = (p000.C0963) r0
            long r5 = r0.f3407
        L72:
            ۥٍؕۛؔ r7 = new ۥٍؕۛؔ
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3323.m6099(long, long, ۥؚؒۥؔ):java.lang.Object");
    }
}
