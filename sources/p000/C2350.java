package p000;

/* JADX INFO: renamed from: ۥٜۛؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2350 {

    /* JADX INFO: renamed from: ۦۙ */
    public static final C2350 f7790 = new C2350(false, 0, true, 1, 1, C5668.f18644);

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f7791;

    /* JADX INFO: renamed from: ۥُ */
    public final int f7792;

    /* JADX INFO: renamed from: ۥّ */
    public final C5668 f7793;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f7794;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f7795;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f7796;

    public C2350(boolean z, int i, boolean z2, int i2, int i3, C5668 c5668) {
        this.f7795 = z;
        this.f7794 = i;
        this.f7791 = z2;
        this.f7796 = i2;
        this.f7792 = i3;
        this.f7793 = c5668;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2350)) {
            return false;
        }
        C2350 c2350 = (C2350) obj;
        return this.f7795 == c2350.f7795 && this.f7794 == c2350.f7794 && this.f7791 == c2350.f7791 && this.f7796 == c2350.f7796 && this.f7792 == c2350.f7792 && AbstractC3831.m6874(this.f7793, c2350.f7793);
    }

    public final int hashCode() {
        return this.f7793.f18646.hashCode() + AbstractC2049.m3999(this.f7792, AbstractC2049.m3999(this.f7796, AbstractC5078.m8672(AbstractC2049.m3999(this.f7794, Boolean.hashCode(this.f7795) * 31, 31), 31, this.f7791), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f7795 + ", capitalization=" + ((Object) AbstractC0487.m1094(this.f7794)) + ", autoCorrect=" + this.f7791 + ", keyboardType=" + ((Object) C0591.m1301(this.f7796)) + ", imeAction=" + ((Object) C0221.m478(this.f7792)) + ", platformImeOptions=null, hintLocales=" + this.f7793 + ')';
    }
}
