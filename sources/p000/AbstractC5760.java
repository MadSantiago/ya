package p000;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۦۦؔٚۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5760 {

    /* JADX INFO: renamed from: ۥۣ */
    public final LinkedHashMap f18983 = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC5760) {
            return this.f18983.equals(((AbstractC5760) obj).f18983);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18983.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f18983 + ')';
    }
}
