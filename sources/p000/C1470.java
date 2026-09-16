package p000;

/* JADX INFO: renamed from: ۥٖؕۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1470 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Integer f5004;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f5005;

    public C1470(int i, AbstractC4009 abstractC4009, Integer num) {
        this.f5005 = i;
        this.f5004 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1470)) {
            return false;
        }
        C1470 c1470 = (C1470) obj;
        return this.f5005 == c1470.f5005 && AbstractC3831.m6874(null, null) && AbstractC3831.m6874(this.f5004, c1470.f5004);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f5005) * 31) + 0) * 31;
        Integer num = this.f5004;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f5005 + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f5004 + ')';
    }
}
