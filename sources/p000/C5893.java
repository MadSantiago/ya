package p000;

/* JADX INFO: renamed from: ۦٌۨؖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5893 implements InterfaceC3028 {

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f19440;

    /* JADX INFO: renamed from: ۦۨ */
    public final C4545 f19441;

    public C5893(C4545 c4545, boolean z) {
        this.f19441 = c4545;
        this.f19440 = z;
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۥ٘ */
    public final long mo2943(int i, long j, long j2) {
        if (!this.f19440) {
            return 0L;
        }
        C4545 c4545 = this.f19441;
        if (c4545.f15015.mo1397()) {
            return 0L;
        }
        return c4545.m7870(c4545.m7872(c4545.f15015.mo1400(c4545.m7872(c4545.m7874(j2)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۦۜ */
    public final Object mo2947(long j, long j2, InterfaceC0443 interfaceC0443) throws Throwable {
        C5181 c5181;
        long jM2000;
        if (interfaceC0443 instanceof C5181) {
            c5181 = (C5181) interfaceC0443;
            int i = c5181.f17139;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5181.f17139 = i - Integer.MIN_VALUE;
            } else {
                c5181 = new C5181(this, (AbstractC0772) interfaceC0443);
            }
        } else {
            c5181 = new C5181(this, (AbstractC0772) interfaceC0443);
        }
        Object objM7871 = c5181.f17136;
        int i2 = c5181.f17139;
        if (i2 == 0) {
            AbstractC0186.m409(objM7871);
            jM2000 = 0;
            if (this.f19440) {
                C4545 c4545 = this.f19441;
                if (!c4545.f15020) {
                    c5181.f17137 = j2;
                    c5181.f17139 = 1;
                    objM7871 = c4545.m7871(j2, c5181);
                    EnumC2282 enumC2282 = EnumC2282.f7590;
                    if (objM7871 == enumC2282) {
                        return enumC2282;
                    }
                }
                jM2000 = C0963.m2000(j2, jM2000);
            }
            return new C0963(jM2000);
        }
        if (i2 != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = c5181.f17137;
        AbstractC0186.m409(objM7871);
        jM2000 = ((C0963) objM7871).f3407;
        jM2000 = C0963.m2000(j2, jM2000);
        return new C0963(jM2000);
    }
}
