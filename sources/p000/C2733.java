package p000;

/* JADX INFO: renamed from: ۥۥؓٝ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2733 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f9045;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f9046;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f9047;

    public C2733(float f, float f2, float f3) {
        this.f9047 = f;
        this.f9046 = f2;
        this.f9045 = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2733)) {
            return false;
        }
        C2733 c2733 = (C2733) obj;
        return C4497.m7826(this.f9047, c2733.f9047) && C4497.m7826(this.f9046, c2733.f9046) && C4497.m7826(this.f9045, c2733.f9045);
    }

    public final int hashCode() {
        return Float.hashCode(this.f9045) + AbstractC3761.m6635(this.f9046, Float.hashCode(this.f9047) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.f9047;
        sb.append((Object) C4497.m7825(f));
        sb.append(", right=");
        float f2 = this.f9046;
        sb.append((Object) C4497.m7825(f + f2));
        sb.append(", width=");
        sb.append((Object) C4497.m7825(f2));
        sb.append(", contentWidth=");
        sb.append((Object) C4497.m7825(this.f9045));
        sb.append(')');
        return sb.toString();
    }
}
