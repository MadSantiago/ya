package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥِٜؓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1097 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Map f3866;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f3867;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f3868;

    public C1097(String str, long j, Map map) {
        this.f3868 = str;
        this.f3867 = j;
        this.f3866 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1097)) {
            return false;
        }
        C1097 c1097 = (C1097) obj;
        return this.f3868.equals(c1097.f3868) && this.f3867 == c1097.f3867 && AbstractC3831.m6874(this.f3866, c1097.f3866);
    }

    public final int hashCode() {
        return this.f3866.hashCode() + AbstractC3761.m6626(this.f3868.hashCode() * 31, 31, this.f3867);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f3868 + ", timestamp=" + this.f3867 + ", additionalCustomKeys=" + this.f3866 + ')';
    }
}
