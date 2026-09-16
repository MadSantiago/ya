package p000;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: ۦؘٜ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4459 extends DataSetObserver {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C0990 f14702;

    public C4459(C0990 c0990) {
        this.f14702 = c0990;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C0990 c0990 = this.f14702;
        if (c0990.f3515.isShowing()) {
            c0990.mo1020();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f14702.dismiss();
    }
}
