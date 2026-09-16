package p000;

/* JADX INFO: renamed from: ۦؘؙؖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3497 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Runnable f11601;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11602;

    public /* synthetic */ RunnableC3497(Runnable runnable, int i) {
        this.f11602 = i;
        this.f11601 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11602;
        Runnable runnable = this.f11601;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                } catch (Exception e) {
                    C3133.m5800("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            default:
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.f11602) {
            case 1:
                return this.f11601.toString();
            default:
                return super.toString();
        }
    }
}
