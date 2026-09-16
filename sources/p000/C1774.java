package p000;

/* JADX INFO: renamed from: ۥٍؙٛؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1774 extends AbstractC4593 {

    /* JADX INFO: renamed from: ۦِ */
    public static volatile C1774 f5923;

    /* JADX INFO: renamed from: ۦۗ */
    public static final ExecutorC4322 f5924 = new ExecutorC4322(0);

    /* JADX INFO: renamed from: ۦٛ */
    public final C4328 f5925 = new C4328();

    /* JADX INFO: renamed from: ۦؖ */
    public static C1774 m3564() {
        if (f5923 != null) {
            return f5923;
        }
        synchronized (C1774.class) {
            try {
                if (f5923 == null) {
                    f5923 = new C1774();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5923;
    }
}
