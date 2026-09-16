package p000;

import android.text.SegmentFinder;

/* JADX INFO: renamed from: ۦًؖٓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3675 extends SegmentFinder {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C2346 f12280;

    public C3675(C2346 c2346) {
        this.f12280 = c2346;
    }

    public final int nextEndBoundary(int i) {
        return this.f12280.mo4411(i);
    }

    public final int nextStartBoundary(int i) {
        return this.f12280.mo4401(i);
    }

    public final int previousEndBoundary(int i) {
        return this.f12280.mo4408(i);
    }

    public final int previousStartBoundary(int i) {
        return this.f12280.mo4414(i);
    }
}
