package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۥؚؑ٘ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0766 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C4898 f2780;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f2781;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f2782;

    public RunnableC0766(C4898 c4898, long j, long j2) {
        Objects.requireNonNull(c4898);
        this.f2780 = c4898;
        this.f2782 = j;
        this.f2781 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3644 c3644 = ((C5371) ((C4423) this.f2780.f16142).f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC3365(22, this));
    }
}
