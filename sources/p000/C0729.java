package p000;

/* JADX INFO: renamed from: ۥٌؙؕٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0729 {

    /* JADX INFO: renamed from: ۥۗ */
    public String f2661;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f2662;

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f2660 = false;

    /* JADX INFO: renamed from: ۦؑ */
    public C0216 f2663 = null;

    public C0729(String str, String str2) {
        this.f2662 = str;
        this.f2661 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0729)) {
            return false;
        }
        C0729 c0729 = (C0729) obj;
        return AbstractC3831.m6874(this.f2662, c0729.f2662) && AbstractC3831.m6874(this.f2661, c0729.f2661) && this.f2660 == c0729.f2660 && AbstractC3831.m6874(this.f2663, c0729.f2663);
    }

    public final int hashCode() {
        int iM8672 = AbstractC5078.m8672(AbstractC5078.m8674(this.f2662.hashCode() * 31, 31, this.f2661), 31, this.f2660);
        C0216 c0216 = this.f2663;
        return iM8672 + (c0216 == null ? 0 : c0216.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f2663 + ", isShowingSubstitution=" + this.f2660 + ')';
    }
}
