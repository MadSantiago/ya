package p000;

import android.widget.Magnifier;

/* JADX INFO: renamed from: ۦۨؖۥۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5898 implements InterfaceC4808 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Magnifier f19449;

    public C5898(Magnifier magnifier) {
        this.f19449 = magnifier;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final long m9724() {
        return (((long) this.f19449.getWidth()) << 32) | (((long) this.f19449.getHeight()) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9725() {
        this.f19449.dismiss();
    }

    @Override // p000.InterfaceC4808
    /* JADX INFO: renamed from: ۥۣ */
    public void mo7364(long j, long j2, float f) {
        this.f19449.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m9726() {
        this.f19449.update();
    }
}
