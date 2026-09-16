package p000;

/* JADX INFO: renamed from: ۦؙٜؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4662 implements InterfaceC1930 {

    /* JADX INFO: renamed from: ۦۨ */
    public final int f15363;

    public C4662(int i) {
        this.f15363 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4662) && this.f15363 == ((C4662) obj).f15363;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15363);
    }

    public final String toString() {
        return AbstractC3761.m6638(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f15363, ')');
    }
}
