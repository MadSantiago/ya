package p000;

/* JADX INFO: renamed from: ۦۛؕۨؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5238 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5238 f17294 = new C5238(new C2551());

    /* JADX INFO: renamed from: ۥۣ */
    public final C2551 f17295;

    public C5238(C2551 c2551) {
        this.f17295 = c2551;
        if (Float.isNaN(0.0f)) {
            C1078.m2272("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5238) && this.f17295.equals(((C5238) obj).f17295);
    }

    public final int hashCode() {
        return (this.f17295.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f17295 + ", steps=0)";
    }
}
