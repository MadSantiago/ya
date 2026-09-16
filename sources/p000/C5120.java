package p000;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: renamed from: ۦٌۙؖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5120 implements InterfaceC5188 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5120 f16971 = new C5120();

    @Override // p000.InterfaceC5188
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4808 mo3262(View view, boolean z, long j, float f, float f2, boolean z2, InterfaceC2880 interfaceC2880, float f3) {
        if (z) {
            return new C4163(new Magnifier(view));
        }
        long jMo747 = interfaceC2880.mo747(j);
        float fMo741 = interfaceC2880.mo741(f);
        float fMo742 = interfaceC2880.mo741(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo747 != 9205357640488583168L) {
            builder.setSize(AbstractC2776.m5235(Float.intBitsToFloat((int) (jMo747 >> 32))), AbstractC2776.m5235(Float.intBitsToFloat((int) (jMo747 & 4294967295L))));
        }
        if (!Float.isNaN(fMo741)) {
            builder.setCornerRadius(fMo741);
        }
        if (!Float.isNaN(fMo742)) {
            builder.setElevation(fMo742);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new C4163(builder.build());
    }

    @Override // p000.InterfaceC5188
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo3263() {
        return true;
    }
}
