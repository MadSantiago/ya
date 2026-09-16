package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۦؕؕٓۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC3283 implements Callable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ String f11001;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f11002;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C3525 f11003;

    public /* synthetic */ CallableC3283(C3525 c3525, long j, String str) {
        this.f11003 = c3525;
        this.f11002 = j;
        this.f11001 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        final C3525 c3525 = this.f11003;
        ExecutorC2291 executorC2291 = (ExecutorC2291) c3525.f11687.f9376;
        final long j = this.f11002;
        final String str = this.f11001;
        return executorC2291.m4346(new Runnable() { // from class: ۦٛؒؗٓ
            @Override // java.lang.Runnable
            public final void run() {
                C4743 c4743 = c3525.f11685;
                C3248 c3248 = c4743.f15668;
                if (c3248 == null || !c3248.f10911.get()) {
                    ((InterfaceC1804) c4743.f15665.f16550).mo3589(j, str);
                }
            }
        });
    }
}
