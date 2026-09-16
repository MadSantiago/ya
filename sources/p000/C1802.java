package p000;

/* JADX INFO: renamed from: ۥٜٟؑؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1802 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2615 f6002;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2615 f6003;

    public C1802(InterfaceC2615 interfaceC2615, InterfaceC2615 interfaceC2616) {
        this.f6003 = interfaceC2615;
        this.f6002 = interfaceC2616;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.f6002.mo4314(r0) == r4) goto L21;
     */
    /* JADX INFO: renamed from: ۥۗ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3585(p000.AbstractC0772 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000.C2160
            if (r0 == 0) goto L13
            r0 = r6
            ۥؚۘؔٛ r0 = (p000.C2160) r0
            int r1 = r0.f7127
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7127 = r1
            goto L18
        L13:
            ۥؚۘؔٛ r0 = new ۥؚۘؔٛ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7126
            int r1 = r0.f7127
            r2 = 2
            r3 = 1
            ۥٟۚؕۨ r4 = p000.EnumC2282.f7590
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            p000.AbstractC0186.m409(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r5)
            r5 = 0
            return r5
        L31:
            p000.AbstractC0186.m409(r6)
            goto L43
        L35:
            p000.AbstractC0186.m409(r6)
            r0.f7127 = r3
            ۥٜۢؔٓ r6 = r5.f6003
            java.lang.Object r6 = r6.mo4314(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.f7127 = r2
            ۥٜۢؔٓ r5 = r5.f6002
            java.lang.Object r5 = r5.mo4314(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            ۥۜؑؒؑ r5 = p000.C2358.f7817
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1802.m3585(ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final double m3586() {
        Double dMo4315 = this.f6003.mo4315();
        if (dMo4315 != null) {
            double dDoubleValue = dMo4315.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dMo4316 = this.f6002.mo4315();
        if (dMo4316 != null) {
            double dDoubleValue2 = dMo4316.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }
}
