package p000;

import android.view.View;

/* JADX INFO: renamed from: ۥؖؑٓۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0510 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC5188 f1830;

    /* JADX INFO: renamed from: ۥۗ */
    public final C5281 f1831;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2288 f1832;

    public C0510(C2288 c2288, C5281 c5281, InterfaceC5188 interfaceC5188) {
        this.f1832 = c2288;
        this.f1831 = c5281;
        this.f1830 = interfaceC5188;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.f1830.hashCode() + ((this.f1831.hashCode() + AbstractC5078.m8672(AbstractC3761.m6635(Float.NaN, AbstractC3761.m6635(Float.NaN, AbstractC3761.m6626(AbstractC5078.m8672(AbstractC3761.m6635(Float.NaN, this.f1832.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C0832 c0832 = (C0832) abstractC5381;
        float f = c0832.f2938;
        long j = c0832.f2947;
        float f2 = c0832.f2945;
        boolean z = c0832.f2941;
        float f3 = c0832.f2943;
        boolean z2 = c0832.f2946;
        InterfaceC5188 interfaceC5188 = c0832.f2948;
        View view = c0832.f2949;
        InterfaceC2880 interfaceC2880 = c0832.f2936;
        c0832.f2937 = this.f1832;
        c0832.f2938 = Float.NaN;
        c0832.f2941 = true;
        c0832.f2947 = 9205357640488583168L;
        c0832.f2945 = Float.NaN;
        c0832.f2943 = Float.NaN;
        c0832.f2946 = true;
        c0832.f2950 = this.f1831;
        InterfaceC5188 interfaceC5189 = this.f1830;
        c0832.f2948 = interfaceC5189;
        View viewM7803 = AbstractC4489.m7803(c0832);
        InterfaceC2880 interfaceC2881 = AbstractC5537.m9270(c0832).f2236;
        if (c0832.f2951 != null) {
            C3059 c3059 = AbstractC4533.f14985;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !interfaceC5189.mo3263()) || 9205357640488583168L != j || !C4497.m7826(Float.NaN, f2) || !C4497.m7826(Float.NaN, f3) || true != z || true != z2 || !interfaceC5189.equals(interfaceC5188) || !viewM7803.equals(view) || !AbstractC3831.m6874(interfaceC2881, interfaceC2880)) {
                c0832.m1727();
            }
        }
        c0832.m1725();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C0832(this.f1832, this.f1831, this.f1830);
    }
}
