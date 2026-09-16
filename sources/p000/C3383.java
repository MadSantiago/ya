package p000;

/* JADX INFO: renamed from: ۦِؖٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3383 extends AbstractC4503 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f11277;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f11278;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f11279;

    public C3383(String str, String str2, String str3) {
        this.f11279 = str;
        this.f11278 = str2;
        this.f11277 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4503) {
            C3383 c3383 = (C3383) ((AbstractC4503) obj);
            if (this.f11279.equals(c3383.f11279) && this.f11278.equals(c3383.f11278) && this.f11277.equals(c3383.f11277)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11277.hashCode() ^ ((((this.f11279.hashCode() ^ 1000003) * 1000003) ^ this.f11278.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f11279);
        sb.append(", libraryName=");
        sb.append(this.f11278);
        sb.append(", buildId=");
        return AbstractC3761.m6621(sb, this.f11277, "}");
    }
}
