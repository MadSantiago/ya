package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥَٓؔٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1275 extends AbstractC5843 {

    /* JADX INFO: renamed from: ۥۗ */
    public final String f4347;

    /* JADX INFO: renamed from: ۥۣ */
    public final List f4348;

    public C1275(List list, String str) {
        this.f4348 = list;
        this.f4347 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5843)) {
            return false;
        }
        C1275 c1275 = (C1275) ((AbstractC5843) obj);
        if (!this.f4348.equals(c1275.f4348)) {
            return false;
        }
        String str = c1275.f4347;
        String str2 = this.f4347;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int iHashCode = (this.f4348.hashCode() ^ 1000003) * 1000003;
        String str = this.f4347;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f4348);
        sb.append(", orgId=");
        return AbstractC3761.m6621(sb, this.f4347, "}");
    }
}
