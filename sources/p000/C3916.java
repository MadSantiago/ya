package p000;

/* JADX INFO: renamed from: ۦُٜؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3916 extends AbstractC0027 {

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC5360 f13056;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f13057;

    public C3916(int i) {
        this.f13057 = i;
        switch (i) {
            case 1:
                this.f13056 = new C3273();
                break;
            default:
                this.f13056 = new C3401();
                break;
        }
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC5360 mo2292() {
        int i = this.f13057;
        AbstractC5360 abstractC5360 = this.f13056;
        switch (i) {
            case 0:
                return (C3401) abstractC5360;
            default:
                return (C3273) abstractC5360;
        }
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥّ */
    public boolean mo3383() {
        switch (this.f13057) {
            case 0:
                return true;
            default:
                return super.mo3383();
        }
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۗ */
    public boolean mo3384(AbstractC5360 abstractC5360) {
        switch (this.f13057) {
            case 0:
                return true;
            default:
                return super.mo3384(abstractC5360);
        }
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۜ */
    public final C3714 mo2293(C1753 c1753) {
        switch (this.f13057) {
            case 0:
                return C3714.m6571(c1753.f5831);
            default:
                return null;
        }
    }

    @Override // p000.AbstractC0027
    /* JADX INFO: renamed from: ۥۣ */
    public void mo2294(CharSequence charSequence) {
        int i = this.f13057;
    }

    /* JADX INFO: renamed from: ۦٛ */
    private final void m7017(CharSequence charSequence) {
    }
}
