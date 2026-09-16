package p000;

import android.os.CancellationSignal;

/* JADX INFO: renamed from: ۥٞؕؑؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1951 implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f6444;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f6445;

    public /* synthetic */ C1951(int i, Object obj) {
        this.f6445 = i;
        this.f6444 = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.f6445;
        Object obj = this.f6444;
        switch (i) {
            case 0:
                ((C2127) obj).mo871(null);
                break;
            default:
                C3635 c3635 = (C3635) obj;
                if (c3635 != null) {
                    C5837 c5837 = c3635.f12150;
                    if (c5837 != null) {
                        c5837.m9644(C3346.f11196);
                    }
                    C5837 c5838 = c3635.f12150;
                    if (c5838 != null) {
                        c5838.m9645(C3346.f11196);
                    }
                }
                break;
        }
    }
}
