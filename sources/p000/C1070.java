package p000;

/* JADX INFO: renamed from: ۥُؗۚؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1070 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f3752;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C5825 f3753;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C1446 f3754;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ InterfaceC2714 f3755;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ float f3756;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ boolean f3757;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070(C5825 c5825, float f, boolean z, C1446 c1446, InterfaceC2714 interfaceC2714, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f3753 = c5825;
        this.f3756 = f;
        this.f3757 = z;
        this.f3754 = c1446;
        this.f3755 = interfaceC2714;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        return new C1070(this.f3753, this.f3756, this.f3757, this.f3754, this.f3755, interfaceC0443);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r9.m9636(r8, r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (p000.AbstractC5785.m9601(r9, r4, r1, r8.f3755, r8) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        return r5;
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
            int r0 = r8.f3752
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r8)
            return r1
        L12:
            p000.AbstractC0186.m409(r9)
            goto L83
        L16:
            p000.AbstractC0186.m409(r9)
            ۦَۧؕٗ r9 = r8.f3753
            ۦٟؔؒۜ r0 = r9.f19170
            java.lang.Object r0 = r0.getValue()
            ۦٙؕۦؖ r0 = (p000.C4497) r0
            float r0 = r0.f14871
            float r4 = r8.f3756
            boolean r0 = p000.C4497.m7826(r0, r4)
            if (r0 != 0) goto L83
            boolean r0 = r8.f3757
            ۥٟۚؕۨ r5 = p000.EnumC2282.f7590
            if (r0 != 0) goto L41
            ۦٙؕۦؖ r0 = new ۦٙؕۦؖ
            r0.<init>(r4)
            r8.f3752 = r3
            java.lang.Object r8 = r9.m9636(r8, r0)
            if (r8 != r5) goto L83
            goto L82
        L41:
            ۦٟؔؒۜ r0 = r9.f19170
            java.lang.Object r0 = r0.getValue()
            ۦٙؕۦؖ r0 = (p000.C4497) r0
            float r0 = r0.f14871
            ۥٖٜٜؒ r3 = r8.f3754
            float r6 = r3.f4951
            boolean r6 = p000.C4497.m7826(r0, r6)
            if (r6 == 0) goto L5d
            ۦًًؙؓ r1 = new ۦًًؙؓ
            r6 = 0
            r1.<init>(r6)
            goto L78
        L5d:
            float r6 = r3.f4953
            boolean r6 = p000.C4497.m7826(r0, r6)
            if (r6 == 0) goto L6b
            ۥؒؕۧۖ r1 = new ۥؒؕۧۖ
            r1.<init>()
            goto L78
        L6b:
            float r3 = r3.f4950
            boolean r0 = p000.C4497.m7826(r0, r3)
            if (r0 == 0) goto L78
            ۦؔؒؔۡ r1 = new ۦؔؒؔۡ
            r1.<init>()
        L78:
            r8.f3752 = r2
            ۥۥٕؑؒ r0 = r8.f3755
            java.lang.Object r8 = p000.AbstractC5785.m9601(r9, r4, r1, r0, r8)
            if (r8 != r5) goto L83
        L82:
            return r5
        L83:
            ۥۜؑؒؑ r8 = p000.C2358.f7817
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1070.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C1070) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
