package p000;

/* JADX INFO: renamed from: ۥۦُؑؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2772 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C1911 f9237;

    public C2772(C1911 c1911) {
        this.f9237 = c1911;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2772) && AbstractC3831.m6874(this.f9237, ((C2772) obj).f9237);
    }

    public final int hashCode() {
        return this.f9237.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f9237 + ')';
    }
}
