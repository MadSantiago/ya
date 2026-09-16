package p000;

/* JADX INFO: renamed from: ۦٟؔۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4856 extends AbstractC5912 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f15980;

    public C4856(String str) {
        this.f15980 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5912)) {
            return false;
        }
        return this.f15980.equals(((C4856) ((AbstractC5912) obj)).f15980);
    }

    public final int hashCode() {
        return this.f15980.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC3761.m6621(new StringBuilder("Log{content="), this.f15980, "}");
    }
}
