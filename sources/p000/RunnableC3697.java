package p000;

/* JADX INFO: renamed from: ۦٌؚٜؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3697 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractActivityC1500 f12333;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12334;

    public /* synthetic */ RunnableC3697(AbstractActivityC1500 abstractActivityC1500, int i) {
        this.f12334 = i;
        this.f12333 = abstractActivityC1500;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12334;
        AbstractActivityC1500 abstractActivityC1500 = this.f12333;
        switch (i) {
            case 0:
                AbstractActivityC1500.m3177(abstractActivityC1500);
                break;
            default:
                abstractActivityC1500.invalidateOptionsMenu();
                break;
        }
    }
}
