package p000;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۦِۣٟؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC5577 implements Callable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C4743 f18405;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ long f18406;

    public CallableC5577(C4743 c4743, long j) {
        this.f18405 = c4743;
        this.f18406 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f18406);
        this.f18405.f15666.mo1882(bundle);
        return null;
    }
}
