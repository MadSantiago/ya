package p000;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: ۦِؐؖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2992 extends CompletableFuture {

    /* JADX INFO: renamed from: ۦۨ */
    public final C0724 f10061;

    public C2992(C0724 c0724) {
        this.f10061 = c0724;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.f10061.cancel();
        }
        return super.cancel(z);
    }
}
