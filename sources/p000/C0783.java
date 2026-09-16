package p000;

/* JADX INFO: renamed from: ۥٌُؚؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0783 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f2826;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f2827;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f2828;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f2829;

    public C0783(int i, int i2, String str, boolean z) {
        this.f2828 = i;
        this.f2827 = i2;
        this.f2826 = str;
        this.f2829 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0783)) {
            return false;
        }
        C0783 c0783 = (C0783) obj;
        return this.f2828 == c0783.f2828 && this.f2827 == c0783.f2827 && AbstractC3831.m6874(this.f2826, c0783.f2826) && this.f2829 == c0783.f2829;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2829) + AbstractC5078.m8674(AbstractC2049.m3999(this.f2827, Integer.hashCode(this.f2828) * 31, 31), 31, this.f2826);
    }

    public final String toString() {
        return "ExceptionDialogStates(titleId=" + this.f2828 + ", messageId=" + this.f2827 + ", exception=" + this.f2826 + ", showDialog=" + this.f2829 + ")";
    }
}
