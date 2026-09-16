package p000;

/* JADX INFO: renamed from: ۦّٝؓۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4742 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f15650;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3411 f15651;

    public C4742(C3411 c3411, int i) {
        this.f15651 = c3411;
        this.f15650 = i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        int i = this.f15650;
        if (i != 1) {
            str = i != 2 ? "null" : "Finished";
        } else {
            str = "BoundReached";
        }
        sb.append(str);
        sb.append(", endState=");
        sb.append(this.f15651);
        sb.append(')');
        return sb.toString();
    }
}
