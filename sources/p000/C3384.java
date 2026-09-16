package p000;

import java.io.File;

/* JADX INFO: renamed from: ۦِؖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3384 {

    /* JADX INFO: renamed from: ۥؗ */
    public final File f11280;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f11281;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2822 f11282;

    public C3384(C2822 c2822, String str, File file) {
        this.f11282 = c2822;
        if (str == null) {
            C0178.m387("Null sessionId");
            throw null;
        }
        this.f11281 = str;
        this.f11280 = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3384)) {
            return false;
        }
        C3384 c3384 = (C3384) obj;
        return this.f11282.equals(c3384.f11282) && this.f11281.equals(c3384.f11281) && this.f11280.equals(c3384.f11280);
    }

    public final int hashCode() {
        return this.f11280.hashCode() ^ ((((this.f11282.hashCode() ^ 1000003) * 1000003) ^ this.f11281.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f11282 + ", sessionId=" + this.f11281 + ", reportFile=" + this.f11280 + "}";
    }
}
