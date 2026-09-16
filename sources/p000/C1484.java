package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: ۥٖؗٚؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1484 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3738 f5042;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5043;

    public /* synthetic */ C1484(C3738 c3738, int i) {
        this.f5043 = i;
        this.f5042 = c3738;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f5043;
        int i2 = 2;
        C2358 c2358 = C2358.f7817;
        C3738 c3738 = this.f5042;
        switch (i) {
            case 0:
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj;
                View view = c3738.f12449;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC4448.mo449();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC1056(2, interfaceC4448));
                    }
                }
                return c2358;
            case 1:
                ActionMode actionMode = c3738.f12448;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ActionMode actionMode2 = c3738.f12448;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return c2358;
            default:
                c3738.f12445.m9080();
                return new C4954(i2, c3738);
        }
    }
}
