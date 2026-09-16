package p000;

/* JADX INFO: renamed from: ۥؚؔٗؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0780 extends AbstractC4428 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C0917 f2821;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f2822;

    public C0780(String str, C0917 c0917) {
        this.f2822 = str;
        this.f2821 = c0917;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0780)) {
            return false;
        }
        C0780 c0780 = (C0780) obj;
        return AbstractC3831.m6874(this.f2822, c0780.f2822) && AbstractC3831.m6874(this.f2821, c0780.f2821);
    }

    public final int hashCode() {
        int iHashCode = this.f2822.hashCode() * 31;
        C0917 c0917 = this.f2821;
        return (iHashCode + (c0917 != null ? c0917.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("LinkAnnotation.Url(url="), this.f2822, ')');
    }

    @Override // p000.AbstractC4428
    /* JADX INFO: renamed from: ۥۣ */
    public final C0917 mo1682() {
        return this.f2821;
    }
}
