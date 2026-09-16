package p000;

/* JADX INFO: renamed from: ۦۥٝؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5725 extends AbstractC4924 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f18855;

    public C5725(int i) {
        this.f18855 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4924) {
            if (this.f18855 == ((C5725) ((AbstractC4924) obj)).f18855) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18855 ^ 1000003;
    }

    public final String toString() {
        return AbstractC3761.m6630(this.f18855, "}", new StringBuilder("ProfilingTrigger{trigger="));
    }
}
