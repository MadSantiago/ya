package p000;

/* JADX INFO: renamed from: ۦؚؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3579 extends AbstractC0213 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f11904;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f11905;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f11906;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f11907;

    public C3579(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.f11906 = f;
        this.f11905 = f2;
        this.f11904 = i;
        this.f11907 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3579)) {
            return false;
        }
        C3579 c3579 = (C3579) obj;
        return this.f11906 == c3579.f11906 && this.f11905 == c3579.f11905 && this.f11904 == c3579.f11904 && this.f11907 == c3579.f11907;
    }

    public final int hashCode() {
        return AbstractC2049.m3999(this.f11907, AbstractC2049.m3999(this.f11904, AbstractC3761.m6635(this.f11905, Float.hashCode(this.f11906) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f11906);
        sb.append(", miter=");
        sb.append(this.f11905);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i = this.f11904;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i2 = this.f11907;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
