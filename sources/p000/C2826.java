package p000;

/* JADX INFO: renamed from: ۥۦًّؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2826 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f9441;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f9442;

    public C2826(int i) {
        int i2 = (i & 4) != 0 ? 0 : 3;
        int i3 = (i & 8) != 0 ? -1 : 7;
        this.f9442 = i2;
        this.f9441 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2826)) {
            return false;
        }
        C2826 c2826 = (C2826) obj;
        return this.f9442 == c2826.f9442 && this.f9441 == c2826.f9441;
    }

    public final int hashCode() {
        return AbstractC2049.m3999(this.f9441, AbstractC2049.m3999(this.f9442, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) C0591.m1301(this.f9442)) + ", imeAction=" + ((Object) C0221.m478(this.f9441)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
