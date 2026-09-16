package p000;

/* JADX INFO: renamed from: ۦؘؙؙؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3540 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public C4763 f11746;

    /* JADX INFO: renamed from: ۥٖ */
    public int f11747;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ boolean f11748;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C4482 f11749;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ Object f11750;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f11751;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C4763 f11752;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3540(C4763 c4763, C4482 c4482, Object obj, boolean z, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f11752 = c4763;
        this.f11749 = c4482;
        this.f11750 = obj;
        this.f11748 = z;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C3540 c3540 = new C3540(this.f11752, this.f11749, this.f11750, this.f11748, interfaceC0443);
        c3540.f11751 = obj;
        return c3540;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r6.m6383(r2, r8) == r7) goto L16;
     */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo218(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f11747
            r1 = 0
            java.lang.Object r2 = r8.f11750
            ۦؚٙؔؐ r3 = r8.f11749
            ۦٝؖۦۢ r4 = r8.f11752
            r5 = 2
            r6 = 1
            ۥٟۚؕۨ r7 = p000.EnumC2282.f7590
            if (r0 == 0) goto L27
            if (r0 == r6) goto L1d
            if (r0 != r5) goto L17
            p000.AbstractC0186.m409(r9)
            goto L57
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r8)
            return r1
        L1d:
            ۦٝؖۦۢ r0 = r8.f11746
            java.lang.Object r6 = r8.f11751
            ۦؙۧٚ r6 = (p000.C3575) r6
            p000.AbstractC0186.m409(r9)
            goto L42
        L27:
            p000.AbstractC0186.m409(r9)
            java.lang.Object r9 = r8.f11751
            ۦؙۧٚ r9 = (p000.C3575) r9
            ۦؚۧؕؖ r0 = r3.m7761()
            r8.f11751 = r9
            r8.f11746 = r4
            r8.f11747 = r6
            java.lang.Object r0 = r0.mo5823(r8)
            if (r0 != r7) goto L3f
            goto L56
        L3f:
            r6 = r9
            r9 = r0
            r0 = r4
        L42:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.f15714 = r9
            r8.f11751 = r1
            r8.f11746 = r1
            r8.f11747 = r5
            java.lang.Object r9 = r6.m6383(r2, r8)
            if (r9 != r7) goto L57
        L56:
            return r7
        L57:
            boolean r8 = r8.f11748
            if (r8 == 0) goto L6f
            ۦۙؑۙؑ r8 = r3.f14796
            ۦٌٖٓؕ r9 = new ۦٌٖٓؕ
            if (r2 == 0) goto L66
            int r0 = r2.hashCode()
            goto L67
        L66:
            r0 = 0
        L67:
            int r1 = r4.f15714
            r9.<init>(r0, r1, r2)
            r8.m8698(r9)
        L6f:
            ۥۜؑؒؑ r8 = p000.C2358.f7817
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3540.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C3540) mo217((InterfaceC0443) obj2, (C3575) obj)).mo218(C2358.f7817);
    }
}
