package p000;

/* JADX INFO: renamed from: ۦِٟؗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4875 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C3644 f16036;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f16037;

    public C4875(C3644 c3644, String str) {
        this.f16036 = c3644;
        this.f16037 = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        C3610 c3610 = ((C5371) this.f16036.f18660).f17717;
        C5371.m9020(c3610);
        c3610.f12020.m9430(th, this.f16037);
    }
}
