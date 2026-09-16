package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦٍٖؕ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4305 extends AbstractC5673 implements Iterator {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C4418 f14239;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f14240 = true;

    /* JADX INFO: renamed from: ۦۨ */
    public C2985 f14241;

    public C4305(C4418 c4418) {
        this.f14239 = c4418;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14240) {
            return this.f14239.f14568 != null;
        }
        C2985 c2985 = this.f14241;
        return (c2985 == null || c2985.f10037 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f14240) {
            this.f14240 = false;
            C2985 c2985 = this.f14239.f14568;
            this.f14241 = c2985;
            return c2985;
        }
        C2985 c2986 = this.f14241;
        C2985 c2987 = c2986 != null ? c2986.f10037 : null;
        this.f14241 = c2987;
        return c2987;
    }

    @Override // p000.AbstractC5673
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1752(C2985 c2985) {
        C2985 c2986 = this.f14241;
        if (c2985 == c2986) {
            C2985 c2987 = c2986.f10038;
            this.f14241 = c2987;
            this.f14240 = c2987 == null;
        }
    }
}
