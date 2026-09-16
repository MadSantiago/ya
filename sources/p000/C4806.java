package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦٞؖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4806 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f15847;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f15848;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f15849;

    public C4806(int i, int i2, String str) {
        this.f15849 = str;
        this.f15848 = i;
        this.f15847 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4806)) {
            return false;
        }
        C4806 c4806 = (C4806) obj;
        return this.f15849.equals(c4806.f15849) && this.f15848 == c4806.f15848 && this.f15847 == c4806.f15847;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f15848);
        Integer numValueOf2 = Integer.valueOf(this.f15847);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f15849, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.f15849.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.f15848);
        sb.append(" displayHeight=");
        return AbstractC3761.m6630(this.f15847, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb);
    }
}
