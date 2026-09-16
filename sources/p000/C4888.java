package p000;

/* JADX INFO: renamed from: ۦۖؑۗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4888 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ InterfaceC5731 f16076;

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ C3375 f16077;

    /* JADX INFO: renamed from: ۥَ */
    public InterfaceC3087 f16078;

    /* JADX INFO: renamed from: ۥٖ */
    public Object f16079;

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ EnumC4386 f16080;

    /* JADX INFO: renamed from: ۥۖ */
    public int f16081;

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ Object f16082;

    /* JADX INFO: renamed from: ۦٕ */
    public /* synthetic */ Object f16083;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f16084;

    /* JADX INFO: renamed from: ۦۛ */
    public C3375 f16085;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4888(EnumC4386 enumC4386, C3375 c3375, InterfaceC5731 interfaceC5731, Object obj, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f16080 = enumC4386;
        this.f16077 = c3375;
        this.f16076 = interfaceC5731;
        this.f16082 = obj;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C4888 c4888 = new C4888(this.f16080, this.f16077, this.f16076, this.f16082, interfaceC0443);
        c4888.f16083 = obj;
        return c4888;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f16081
            r1 = 2
            r2 = 1
            r3 = 0
            ۥٟۚؕۨ r4 = p000.EnumC2282.f7590
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.f16079
            ۦّؖؗۘ r0 = (p000.C3375) r0
            ۦؒؑۡۦ r1 = r8.f16078
            java.lang.Object r8 = r8.f16083
            ۥٟٕۜؓ r8 = (p000.C2377) r8
            p000.AbstractC0186.m409(r9)     // Catch: java.lang.Throwable -> L1c
            goto L8d
        L1c:
            r9 = move-exception
            goto La8
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r8)
            return r3
        L25:
            ۦّؖؗۘ r0 = r8.f16085
            java.lang.Object r2 = r8.f16084
            java.lang.Object r5 = r8.f16079
            ۦۦؙؑؑ r5 = (p000.InterfaceC5731) r5
            ۦؒؑۡۦ r6 = r8.f16078
            java.lang.Object r7 = r8.f16083
            ۥٟٕۜؓ r7 = (p000.C2377) r7
            p000.AbstractC0186.m409(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L75
        L3c:
            p000.AbstractC0186.m409(r9)
            java.lang.Object r9 = r8.f16083
            ۦٖٛؗٔ r9 = (p000.InterfaceC4643) r9
            ۥٟٕۜؓ r0 = new ۥٟٕۜؓ
            ۦؙٟؓ r9 = r9.mo1586()
            ۥٕؓٝٔ r5 = p000.C1397.f4791
            ۦٓؖ۠ٔ r9 = r9.mo865(r5)
            ۦًؘؓ r9 = (p000.InterfaceC3196) r9
            ۦٗؗٝؓ r5 = r8.f16080
            r0.<init>(r5, r9)
            ۦّؖؗۘ r9 = r8.f16077
            r9.m6144(r0)
            ۥٕؒٞۡ r5 = r9.f11259
            r8.f16083 = r0
            r8.f16078 = r5
            ۦۦؙؑؑ r6 = r8.f16076
            r8.f16079 = r6
            java.lang.Object r7 = r8.f16082
            r8.f16084 = r7
            r8.f16085 = r9
            r8.f16081 = r2
            java.lang.Object r2 = r5.mo2949(r8)
            if (r2 != r4) goto L74
            goto L87
        L74:
            r2 = r7
        L75:
            r8.f16083 = r0     // Catch: java.lang.Throwable -> La2
            r8.f16078 = r5     // Catch: java.lang.Throwable -> La2
            r8.f16079 = r9     // Catch: java.lang.Throwable -> La2
            r8.f16084 = r3     // Catch: java.lang.Throwable -> La2
            r8.f16085 = r3     // Catch: java.lang.Throwable -> La2
            r8.f16081 = r1     // Catch: java.lang.Throwable -> La2
            java.lang.Object r8 = r6.mo219(r2, r8)     // Catch: java.lang.Throwable -> La2
            if (r8 != r4) goto L88
        L87:
            return r4
        L88:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L8d:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f11260     // Catch: java.lang.Throwable -> La0
        L8f:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L96
            goto L9c
        L96:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La0
            if (r2 == r8) goto L8f
        L9c:
            r1.mo2950(r3)
            return r9
        La0:
            r8 = move-exception
            goto Lb8
        La2:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        La8:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f11260     // Catch: java.lang.Throwable -> La0
        Laa:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La0
            if (r2 != 0) goto Lb7
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La0
            if (r2 != r8) goto Lb7
            goto Laa
        Lb7:
            throw r9     // Catch: java.lang.Throwable -> La0
        Lb8:
            r1.mo2950(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4888.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C4888) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
