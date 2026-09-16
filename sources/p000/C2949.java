package p000;

/* JADX INFO: renamed from: ۥؘۨؔۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2949 implements InterfaceC0443 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9892;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C2949 f9891 = new C2949(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final C2949 f9890 = new C2949(1);

    public /* synthetic */ C2949(int i) {
        this.f9892 = i;
    }

    public String toString() {
        switch (this.f9892) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 mo334() {
        switch (this.f9892) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return C4794.f15814;
        }
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥّ */
    public final void mo335(Object obj) {
        switch (this.f9892) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m5517(Object obj) {
    }
}
