package p000;

/* JADX INFO: renamed from: ۥؚۜؑٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2360 extends AbstractC0044 implements Runnable {

    /* JADX INFO: renamed from: ۦۛ */
    public final Runnable f7819;

    public RunnableC2360(Runnable runnable) {
        runnable.getClass();
        this.f7819 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7819.run();
        } catch (Throwable th) {
            m3763(th);
            Object obj = AbstractC4181.f13914;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            C5028.m8450(th);
        }
    }

    @Override // p000.AbstractC0032
    /* JADX INFO: renamed from: ۦِ */
    public final String mo2773() {
        String strValueOf = String.valueOf(this.f7819);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
