package p000;

/* JADX INFO: renamed from: ۦٕؖ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4253 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ThreadLocal f14094 = new ThreadLocal();

    /* JADX INFO: renamed from: ۥۣ */
    public static AbstractC5596 m7538() {
        ThreadLocal threadLocal = f14094;
        AbstractC5596 abstractC5596 = (AbstractC5596) threadLocal.get();
        if (abstractC5596 != null) {
            return abstractC5596;
        }
        C2587 c2587 = new C2587(Thread.currentThread());
        threadLocal.set(c2587);
        return c2587;
    }
}
