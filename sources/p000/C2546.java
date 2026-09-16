package p000;

import android.graphics.Rect;

/* JADX INFO: renamed from: ۥْۡؒۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2546 {

    /* JADX INFO: renamed from: ۥۗ */
    public final float f8496;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2999 f8497;

    public C2546(Rect rect, float f) {
        this(new C2999(rect), f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2546.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C2546 c2546 = (C2546) obj;
        return AbstractC3831.m6874(this.f8497, c2546.f8497) && this.f8496 == c2546.f8496;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8496) + (this.f8497.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.f8497);
        sb.append(", density=");
        return AbstractC3761.m6639(sb, this.f8496, ')');
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Rect m4790() {
        C2999 c2999 = this.f8497;
        c2999.getClass();
        return new Rect(c2999.f10079, c2999.f10078, c2999.f10077, c2999.f10080);
    }

    public C2546(C2999 c2999, float f) {
        this.f8497 = c2999;
        this.f8496 = f;
    }
}
