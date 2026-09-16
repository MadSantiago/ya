package p000;

/* JADX INFO: renamed from: ۥٗؕۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1536 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C5235 f5197;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f5198;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ boolean f5199;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5211 f5200;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5201;

    public /* synthetic */ RunnableC1536(C5235 c5235, C5211 c5211, long j, boolean z, int i) {
        this.f5201 = i;
        this.f5200 = c5211;
        this.f5198 = j;
        this.f5199 = z;
        this.f5197 = c5235;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5201;
        long j = this.f5198;
        boolean z = this.f5199;
        C5211 c5211 = this.f5200;
        C5235 c5235 = this.f5197;
        switch (i) {
            case 0:
                c5235.m8870(c5211);
                c5235.m8877(c5211, j, z);
                break;
            default:
                c5235.m8870(c5211);
                c5235.m8877(c5211, j, z);
                break;
        }
    }
}
