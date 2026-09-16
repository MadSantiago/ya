package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦْٖؓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4289 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5235 f14179;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ boolean f14180;

    public RunnableC4289(C5235 c5235, boolean z) {
        this.f14180 = z;
        Objects.requireNonNull(c5235);
        this.f14179 = c5235;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    @Override // java.lang.Runnable
    public final void run() {
        C5235 c5235 = this.f14179;
        C5371 c5371 = (C5371) c5235.f18660;
        boolean zM9024 = c5371.m9024();
        boolean z = false;
        boolean z2 = c5371.f17710 != null && c5371.f17710.booleanValue();
        boolean z3 = this.f14180;
        c5371.f17710 = Boolean.valueOf(z3);
        if (z2 == z3) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12023.m9430(Boolean.valueOf(z3), "Default data collection state already set to");
        }
        if (c5371.m9024() != zM9024) {
            boolean zM9025 = c5371.m9024();
            if (c5371.f17710 != null && c5371.f17710.booleanValue()) {
                z = true;
            }
            if (zM9025 != z) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12021.m9434(Boolean.valueOf(z3), Boolean.valueOf(zM9024), "Default data collection is different than actual status");
            }
        } else {
            C3610 c3612 = c5371.f17717;
            C5371.m9020(c3612);
            c3612.f12021.m9434(Boolean.valueOf(z3), Boolean.valueOf(zM9024), "Default data collection is different than actual status");
        }
        c5235.m8873();
    }
}
