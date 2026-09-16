package p000;

/* JADX INFO: renamed from: ۥؚّؑۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1144 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ C3757 f3988;

    /* JADX INFO: renamed from: ۥؖ */
    public final /* synthetic */ EnumC2522[] f3989;

    /* JADX INFO: renamed from: ۥَ */
    public EnumC2522[] f3990;

    /* JADX INFO: renamed from: ۥٖ */
    public C3757 f3991;

    /* JADX INFO: renamed from: ۥٙ */
    public int f3992;

    /* JADX INFO: renamed from: ۥۖ */
    public int f3993;

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ InterfaceC0238 f3994;

    /* JADX INFO: renamed from: ۦٕ */
    public int f3995;

    /* JADX INFO: renamed from: ۦٗ */
    public InterfaceC0238 f3996;

    /* JADX INFO: renamed from: ۦۛ */
    public int f3997;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144(EnumC2522[] enumC2522Arr, C3757 c3757, InterfaceC0238 interfaceC0238, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f3989 = enumC2522Arr;
        this.f3988 = c3757;
        this.f3994 = interfaceC0238;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        return new C1144(this.f3989, this.f3988, this.f3994, interfaceC0443);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final java.lang.Object mo218(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f3992
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.f3995
            int r4 = r11.f3993
            int r5 = r11.f3997
            ۥؒؒؐۦ r6 = r11.f3996
            ۦٍؑۜٝ r7 = r11.f3991
            ۥٌِ۠ؗ[] r8 = r11.f3990
            p000.AbstractC0186.m409(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r11)
            return r1
        L21:
            p000.AbstractC0186.m409(r12)
            ۥٌِ۠ؗ[] r12 = r11.f3989
            int r0 = r12.length
            r4 = 0
            ۦٍؑۜٝ r5 = r11.f3988
            ۥؒؒؐۦ r6 = r11.f3994
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            ۥٟۚؕۨ r10 = p000.EnumC2282.f7590
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.f3990 = r8
            r11.f3991 = r7
            r11.f3996 = r6
            r11.f3997 = r9
            r11.f3993 = r4
            r11.f3995 = r0
            r11.f3992 = r2
            java.lang.Object r12 = r7.m6608(r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            p000.C1078.m2275()
            return r1
        L5d:
            r11.f3990 = r8
            r11.f3991 = r7
            r11.f3996 = r6
            r11.f3997 = r9
            r11.f3993 = r4
            r11.f3995 = r0
            r11.f3992 = r3
            java.lang.Object r12 = r7.m6612(r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            ۥۜؑؒؑ r11 = p000.C2358.f7817
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1144.mo218(java.lang.Object):java.lang.Object");
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C1144) mo217((InterfaceC0443) obj2, (C0202) obj)).mo218(C2358.f7817);
    }
}
