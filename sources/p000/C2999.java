package p000;

import android.graphics.Rect;

/* JADX INFO: renamed from: ۦۣؐؗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2999 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f10077;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f10078;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f10079;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f10080;

    static {
        new C2999(0, 0, 0, 0);
    }

    public C2999(int i, int i2, int i3, int i4) {
        this.f10079 = i;
        this.f10078 = i2;
        this.f10077 = i3;
        this.f10080 = i4;
        if (i > i3) {
            C1078.m2273(AbstractC5078.m8679("Left must be less than or equal to right, left: ", i, i3, ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        C1078.m2273(AbstractC5078.m8679("top must be less than or equal to bottom, top: ", i2, i4, ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2999.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C2999 c2999 = (C2999) obj;
        return this.f10079 == c2999.f10079 && this.f10078 == c2999.f10078 && this.f10077 == c2999.f10077 && this.f10080 == c2999.f10080;
    }

    public final int hashCode() {
        return (((((this.f10079 * 31) + this.f10078) * 31) + this.f10077) * 31) + this.f10080;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C2999.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f10079);
        sb.append(',');
        sb.append(this.f10078);
        sb.append(',');
        sb.append(this.f10077);
        sb.append(',');
        return AbstractC3761.m6630(this.f10080, "] }", sb);
    }

    public C2999(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
