package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦؘؚۣ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5622 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5266 f18538;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18539;

    public RunnableC5622(C5266 c5266, int i) {
        this.f18539 = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c5266);
                this.f18538 = c5266;
                break;
            default:
                Objects.requireNonNull(c5266);
                this.f18538 = c5266;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f18539;
        C5266 c5266 = this.f18538;
        switch (i) {
            case 0:
                c5266.f17353 = c5266.f17359;
                break;
            default:
                c5266.f17359 = null;
                break;
        }
    }
}
