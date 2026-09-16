package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥِٕٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1134 extends AbstractC5220 {

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList f3968;

    public C1134(ArrayList arrayList) {
        this.f3968 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5220)) {
            return false;
        }
        return this.f3968.equals(((C1134) ((AbstractC5220) obj)).f3968);
    }

    public final int hashCode() {
        return this.f3968.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f3968 + "}";
    }
}
