package p000;

/* JADX INFO: renamed from: ۥًؑۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0816 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public long f2904;

    /* JADX INFO: renamed from: ۥٖ */
    public int f2905;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ long f2906;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C4545 f2907;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0816(C4545 c4545, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f2907 = c4545;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C0816 c0816 = new C0816(this.f2907, interfaceC0443);
        c0816.f2906 = ((C0963) obj).f3407;
        return c0816;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = this.f2905;
        C4545 c4545 = this.f2907;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i == 0) {
            AbstractC0186.m409(obj);
            j = this.f2906;
            C3323 c3323 = c4545.f15012;
            this.f2906 = j;
            this.f2905 = 1;
            obj = c3323.m6098(j, this);
            if (obj != enumC2282) {
            }
            return enumC2282;
        }
        if (i == 1) {
            j = this.f2906;
            AbstractC0186.m409(obj);
        } else {
            if (i == 2) {
                j2 = this.f2904;
                j = this.f2906;
                AbstractC0186.m409(obj);
                j3 = ((C0963) obj).f3407;
                C3323 c3324 = c4545.f15012;
                long jM2000 = C0963.m2000(j2, j3);
                this.f2906 = j;
                this.f2904 = j3;
                this.f2905 = 3;
                obj = c3324.m6099(jM2000, j3, this);
                if (obj != enumC2282) {
                    j4 = j;
                    j5 = j3;
                }
                return enumC2282;
            }
            if (i != 3) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.f2904;
            j4 = this.f2906;
            AbstractC0186.m409(obj);
        }
        return new C0963(C0963.m2000(j4, C0963.m2000(j5, ((C0963) obj).f3407)));
        long jM2001 = C0963.m2000(j, ((C0963) obj).f3407);
        this.f2906 = j;
        this.f2904 = jM2001;
        this.f2905 = 2;
        obj = c4545.m7871(jM2001, this);
        if (obj != enumC2282) {
            j2 = jM2001;
            j3 = ((C0963) obj).f3407;
            C3323 c3325 = c4545.f15012;
            long jM2002 = C0963.m2000(j2, j3);
            this.f2906 = j;
            this.f2904 = j3;
            this.f2905 = 3;
            obj = c3325.m6099(jM2002, j3, this);
            if (obj != enumC2282) {
                j4 = j;
                j5 = j3;
                return new C0963(C0963.m2000(j4, C0963.m2000(j5, ((C0963) obj).f3407)));
            }
        }
        return enumC2282;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        long j = ((C0963) obj).f3407;
        C0816 c0816 = new C0816(this.f2907, (InterfaceC0443) obj2);
        c0816.f2906 = j;
        return c0816.mo218(C2358.f7817);
    }
}
