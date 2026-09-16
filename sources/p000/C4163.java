package p000;

import android.widget.Magnifier;

/* JADX INFO: renamed from: ۦٔؒؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4163 extends C5898 {
    @Override // p000.C5898, p000.InterfaceC4808
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo7364(long j, long j2, float f) {
        if (!Float.isNaN(f)) {
            this.f19449.setZoom(f);
        }
        long j3 = 9223372034707292159L & j2;
        Magnifier magnifier = this.f19449;
        if (j3 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
