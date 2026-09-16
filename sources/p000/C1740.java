package p000;

/* JADX INFO: renamed from: ۥٚؗؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1740 extends AbstractC3029 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f5775;

    public C1740(String str) {
        this.f5775 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3029)) {
            return false;
        }
        return this.f5775.equals(((C1740) ((AbstractC3029) obj)).f5775);
    }

    public final int hashCode() {
        return this.f5775.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC3761.m6621(new StringBuilder("User{identifier="), this.f5775, "}");
    }
}
