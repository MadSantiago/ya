package p000;

/* JADX INFO: renamed from: ۦۧؔٙٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5820 implements InterfaceC4396 {

    /* JADX INFO: renamed from: ۥَ */
    public C0873 f19159;

    /* JADX INFO: renamed from: ۥْ */
    public EnumC2459 f19160;

    /* JADX INFO: renamed from: ۥٓ */
    public C4207 f19161;

    /* JADX INFO: renamed from: ۦ۟ */
    public C4207 f19162;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5086 f19163;

    public C5820(C5086 c5086) {
        this.f19163 = c5086;
    }

    @Override // p000.InterfaceC4396
    /* JADX INFO: renamed from: ۥؗ */
    public final long mo7596(C4730 c4730, long j, EnumC2459 enumC2459, long j2) {
        C0873 c0873 = this.f19159;
        if (c0873 != null) {
            C4207 c4207 = this.f19162;
            if ((c4207 == null ? false : C4207.m7431(c4207.f13969, j)) && this.f19160 == enumC2459) {
                C4207 c4208 = this.f19161;
                if (c4208 != null ? C4207.m7431(c4208.f13969, j2) : false) {
                    return c0873.f3199;
                }
            }
        }
        long jMo7596 = this.f19163.mo7596(c4730, j, enumC2459, j2);
        this.f19162 = new C4207(j);
        this.f19160 = enumC2459;
        this.f19161 = new C4207(j2);
        this.f19159 = new C0873(jMo7596);
        return jMo7596;
    }
}
