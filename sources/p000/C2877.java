package p000;

import android.graphics.Point;

/* JADX INFO: renamed from: ۥؘۧؖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2877 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Point f9600;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f9601;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f9602;

    public C2877(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f9602 = i;
        this.f9601 = i2;
        this.f9600 = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2877)) {
            return false;
        }
        C2877 c2877 = (C2877) obj;
        return this.f9602 == c2877.f9602 && this.f9601 == c2877.f9601 && this.f9600.equals(c2877.f9600);
    }

    public final int hashCode() {
        return this.f9600.hashCode() + (((this.f9602 * 31) + this.f9601) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f9602;
        if (i == 0) {
            str = "TopLeft";
        } else if (i == 1) {
            str = "TopRight";
        } else if (i != 2) {
            str = i != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.f9601);
        sb.append(", center=");
        sb.append(this.f9600);
        sb.append('}');
        return sb.toString();
    }
}
