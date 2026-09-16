package p000;

/* JADX INFO: renamed from: ۥۗؓٝٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2105 implements InterfaceC4770 {

    /* JADX INFO: renamed from: ۥۣ */
    public final float f6924;

    public C2105(float f) {
        this.f6924 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2105) && Float.compare(this.f6924, ((C2105) obj).f6924) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6924);
    }

    public final String toString() {
        return AbstractC3761.m6639(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f6924, ')');
    }

    @Override // p000.InterfaceC4770
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo1918(float f) {
        return f * this.f6924;
    }

    @Override // p000.InterfaceC4770
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo1919(float f) {
        return f / this.f6924;
    }
}
