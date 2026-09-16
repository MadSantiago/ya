package p000;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥٝؖۘؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1905 extends C5309 {

    /* JADX INFO: renamed from: ۥۙ */
    public C3875 f6288;

    /* JADX INFO: renamed from: ۦؙ */
    public C2816 f6289;

    @Override // p000.AbstractC4702, p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        View viewM7803 = AbstractC4489.m7803(this);
        WeakHashMap weakHashMap = C2816.f9398;
        C2816 c2816M3047 = AbstractC1434.m3047(viewM7803);
        c2816M3047.m5381(viewM7803);
        this.f6288.getClass();
        C0879 c0879 = c2816M3047.f9399;
        if (!AbstractC3831.m6874(c0879, this.f17485)) {
            this.f17485 = c0879;
            mo8045();
        }
        this.f6289 = c2816M3047;
        super.mo780();
    }

    @Override // p000.AbstractC4702, p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        View viewM7803 = AbstractC4489.m7803(this);
        C2816 c2816 = this.f6289;
        if (c2816 != null) {
            int i = c2816.f9405 - 1;
            c2816.f9405 = i;
            if (i == 0) {
                WeakHashMap weakHashMap = AbstractC3608.f12013;
                AbstractC5039.m8554(viewM7803, null);
                C0460.m977(viewM7803, null);
                viewM7803.removeOnAttachStateChangeListener(c2816.f9413);
            }
        }
        super.mo788();
    }
}
