package p000;

/* JADX INFO: renamed from: ۦؒؑۘٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3086 {

    /* JADX INFO: renamed from: ۥّ */
    public static final double f10347 = Math.random();

    /* JADX INFO: renamed from: ۦۙ */
    public static final /* synthetic */ int f10348 = 0;

    /* JADX INFO: renamed from: ۥؗ */
    public final C1802 f10349;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 f10350;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2361 f10351;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0377 f10352;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2352 f10353;

    public C3086(C0377 c0377, InterfaceC2361 interfaceC2361, C1802 c1802, C2352 c2352, InterfaceC3534 interfaceC3534) {
        this.f10352 = c0377;
        this.f10351 = interfaceC2361;
        this.f10349 = c1802;
        this.f10353 = c2352;
        this.f10350 = interfaceC3534;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r6.m3585(r0) == r5) goto L31;
     */
    /* JADX INFO: renamed from: ۥۣ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5675(p000.AbstractC0772 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p000.C2689
            if (r0 == 0) goto L13
            r0 = r7
            ۥۤؖۡ۟ r0 = (p000.C2689) r0
            int r1 = r0.f8932
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8932 = r1
            goto L18
        L13:
            ۥۤؖۡ۟ r0 = new ۥۤؖۡ۟
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f8931
            int r1 = r0.f8932
            r2 = 2
            r3 = 1
            java.lang.String r4 = "FirebaseSessions"
            ۥٜٟؑؗ r6 = r6.f10349
            ۥٟۚؕۨ r5 = p000.EnumC2282.f7590
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            p000.AbstractC0186.m409(r7)
            goto L7e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r6)
            r6 = 0
            return r6
        L35:
            p000.AbstractC0186.m409(r7)
            goto L47
        L39:
            p000.AbstractC0186.m409(r7)
            ۥؒؐۖ r7 = p000.C0230.f872
            r0.f8932 = r3
            java.lang.Object r7 = r7.m493(r0)
            if (r7 != r5) goto L47
            goto L7d
        L47:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L5d
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5d
            goto Lb3
        L5d:
            java.util.Iterator r7 = r7.iterator()
        L61:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r7.next()
            ۥؙِۤ r1 = (p000.C2702) r1
            ۥٔۘۗ r1 = r1.f8961
            boolean r1 = r1.m2929()
            if (r1 == 0) goto L61
            r0.f8932 = r2
            java.lang.Object r7 = r6.m3585(r0)
            if (r7 != r5) goto L7e
        L7d:
            return r5
        L7e:
            ۥٜۢؔٓ r7 = r6.f6003
            java.lang.Boolean r7 = r7.mo4316()
            if (r7 == 0) goto L8b
        L86:
            boolean r3 = r7.booleanValue()
            goto L94
        L8b:
            ۥٜۢؔٓ r7 = r6.f6002
            java.lang.Boolean r7 = r7.mo4316()
            if (r7 == 0) goto L94
            goto L86
        L94:
            if (r3 != 0) goto L9e
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L9e:
            double r0 = p000.C3086.f10347
            double r6 = r6.m3586()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto Lab
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        Lab:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lb3:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3086.m5675(ۥؚؒۥؔ):java.lang.Object");
    }
}
