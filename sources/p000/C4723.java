package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: ۦٜٝؑۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4723 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f15591;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f15592;

    public /* synthetic */ C4723(int i, Object obj) {
        this.f15592 = i;
        this.f15591 = obj;
    }

    public final void onBackInvoked() {
        int i = this.f15592;
        Object obj = this.f15591;
        switch (i) {
            case 0:
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj;
                if (interfaceC4448 != null) {
                    interfaceC4448.mo449();
                }
                break;
            case 1:
                ((LayoutInflaterFactory2C1852) obj).m3662();
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C0683) obj).m2864();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
