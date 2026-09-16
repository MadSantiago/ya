package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥُِؓۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1094 extends AbstractC5137 {

    /* JADX INFO: renamed from: ۥۣ */
    public final List f3843;

    public C1094(List list) {
        this.f3843 = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5137)) {
            return false;
        }
        return this.f3843.equals(((C1094) ((AbstractC5137) obj)).f3843);
    }

    public final int hashCode() {
        return this.f3843.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f3843 + "}";
    }
}
