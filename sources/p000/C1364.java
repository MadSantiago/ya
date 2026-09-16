package p000;

/* JADX INFO: renamed from: ۥٖٔؗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1364 extends AbstractC2765 {

    /* JADX INFO: renamed from: ۥۤ */
    public final C1318 f4683;

    public C1364(C1318 c1318) {
        this.f4683 = c1318;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1364.class == obj.getClass() && AbstractC3831.m6874(this.f4683, ((C1364) obj).f4683);
    }

    public final int hashCode() {
        return this.f4683.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f4683 + ", direction=-1)";
    }
}
