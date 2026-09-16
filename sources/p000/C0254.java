package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؒؔؖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0254 {

    /* JADX INFO: renamed from: ۦٛ */
    public static final ThreadLocal f941 = new ThreadLocal();

    /* JADX INFO: renamed from: ۥؗ */
    public final C4228 f942;

    /* JADX INFO: renamed from: ۥُ */
    public final C5002 f943;

    /* JADX INFO: renamed from: ۥۜ */
    public C5002 f946;

    /* JADX INFO: renamed from: ۦؑ */
    public final RunnableC0029 f948;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0796 f947 = new C0796(0);

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f945 = new ArrayList();

    /* JADX INFO: renamed from: ۥّ */
    public boolean f944 = false;

    /* JADX INFO: renamed from: ۦۙ */
    public float f949 = 1.0f;

    public C0254(C5002 c5002) {
        int i = 5;
        this.f942 = new C4228(i, this);
        this.f948 = new RunnableC0029(i, this);
        this.f943 = c5002;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0254 m536() {
        ThreadLocal threadLocal = f941;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0254(new C5002(5)));
        }
        return (C0254) threadLocal.get();
    }
}
