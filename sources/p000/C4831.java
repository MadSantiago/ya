package p000;

/* JADX INFO: renamed from: ۦٟؑۘؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4831 extends AbstractC5752 {

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ long f15919 = AbstractC3456.f11473.objectFieldOffset(C4831.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: ۥَ */
    public final C0037 f15920;

    public C4831(C0037 c0037) {
        this.f15920 = c0037;
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo922() {
        return true;
    }

    @Override // p000.AbstractC5752
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo923(Throwable th) {
        if (AbstractC3456.f11473.compareAndSwapInt(this, f15919, 0, 1)) {
            this.f15920.mo211(th);
        }
    }
}
