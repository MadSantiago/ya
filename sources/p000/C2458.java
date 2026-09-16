package p000;

/* JADX INFO: renamed from: ۥۣ۟ؕۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2458 extends AbstractC4428 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C0917 f8211;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f8212;

    public C2458(String str, C0917 c0917) {
        this.f8212 = str;
        this.f8211 = c0917;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2458)) {
            return false;
        }
        C2458 c2458 = (C2458) obj;
        return AbstractC3831.m6874(this.f8212, c2458.f8212) && AbstractC3831.m6874(this.f8211, c2458.f8211);
    }

    public final int hashCode() {
        int iHashCode = this.f8212.hashCode() * 31;
        C0917 c0917 = this.f8211;
        return (iHashCode + (c0917 != null ? c0917.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f8212, ')');
    }

    @Override // p000.AbstractC4428
    /* JADX INFO: renamed from: ۥۣ */
    public final C0917 mo1682() {
        return this.f8211;
    }
}
