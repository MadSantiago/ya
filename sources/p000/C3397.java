package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: ۦٌٟؗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3397 extends ContentObserver {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C5559 f11304;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3397(C5559 c5559, Handler handler) {
        super(handler);
        this.f11304 = c5559;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.f11304.mo5597(C2358.f7817);
    }
}
