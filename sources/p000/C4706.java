package p000;

/* JADX INFO: renamed from: ۦٜؗ٘ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4706 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C2268 f15521;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0336 f15522;

    public C4706(C0336 c0336, C2268 c2268) {
        this.f15522 = c0336;
        this.f15521 = c2268;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4706) {
            C4706 c4706 = (C4706) obj;
            C0336 c0336 = c4706.f15522;
            C0336 c0337 = this.f15522;
            if (c0337 != null ? c0337 == c0336 : c0336 == null) {
                return this.f15521 == c4706.f15521;
            }
        }
        return false;
    }

    public final int hashCode() {
        C0336 c0336 = this.f15522;
        return this.f15521.hashCode() ^ (((c0336 == null ? 0 : c0336.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f15522);
        String string = this.f15521.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        sb.append("SnapshotBlobAndResult{snapshotBlob=");
        sb.append(strValueOf);
        sb.append(", snapshotResult=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
