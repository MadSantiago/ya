package p000;

/* JADX INFO: renamed from: ۥًؒۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0823 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0823 f2918 = new C0823(0, false);

    /* JADX INFO: renamed from: ۥۗ */
    public final int f2919;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f2920;

    public C0823() {
        this.f2920 = false;
        this.f2919 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0823)) {
            return false;
        }
        C0823 c0823 = (C0823) obj;
        return this.f2920 == c0823.f2920 && this.f2919 == c0823.f2919;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2919) + (Boolean.hashCode(this.f2920) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f2920 + ", emojiSupportMatch=" + ((Object) C1857.m3708(this.f2919)) + ')';
    }

    public C0823(int i, boolean z) {
        this.f2920 = z;
        this.f2919 = i;
    }
}
