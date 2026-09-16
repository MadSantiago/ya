package p000;

/* JADX INFO: renamed from: ۥًۗؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2097 extends AbstractC5752 {

    /* JADX INFO: renamed from: ۥَ */
    public final AbstractC0386 f6907;

    /* JADX INFO: renamed from: ۥٖ */
    public final C2610 f6908;

    /* JADX INFO: renamed from: ۦٗ */
    public final C1866 f6909;

    /* JADX INFO: renamed from: ۦۛ */
    public final Object f6910;

    public C2097(AbstractC0386 abstractC0386, C2610 c2610, C1866 c1866, Object obj) {
        this.f6907 = abstractC0386;
        this.f6908 = c2610;
        this.f6909 = c1866;
        this.f6910 = obj;
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo922() {
        return false;
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo923(Throwable th) {
        C1866 c1866 = this.f6909;
        C1866 c1866M849 = AbstractC0386.m849(c1866);
        AbstractC0386 abstractC0386 = this.f6907;
        C2610 c2610 = this.f6908;
        Object obj = this.f6910;
        if (c1866M849 == null || !abstractC0386.m887(c2610, c1866M849, obj)) {
            c2610.f8704.m5576(new C4761(2), 2);
            C1866 c1866M8410 = AbstractC0386.m849(c1866);
            if (c1866M8410 == null || !abstractC0386.m887(c2610, c1866M8410, obj)) {
                abstractC0386.mo882(abstractC0386.m868(c2610, obj));
            }
        }
    }
}
