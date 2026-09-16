package p000;

/* JADX INFO: renamed from: ۦُۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5314 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f17490;

    /* JADX INFO: renamed from: ۥُ */
    public final C1760 f17491;

    /* JADX INFO: renamed from: ۥّ */
    public final String f17492;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f17493;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f17494;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f17495;

    /* JADX INFO: renamed from: ۦۙ */
    public final String f17496;

    public C5314(String str, String str2, int i, long j, C1760 c1760, String str3, String str4) {
        this.f17494 = str;
        this.f17493 = str2;
        this.f17490 = i;
        this.f17495 = j;
        this.f17491 = c1760;
        this.f17492 = str3;
        this.f17496 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5314)) {
            return false;
        }
        C5314 c5314 = (C5314) obj;
        return AbstractC3831.m6874(this.f17494, c5314.f17494) && AbstractC3831.m6874(this.f17493, c5314.f17493) && this.f17490 == c5314.f17490 && this.f17495 == c5314.f17495 && this.f17491.equals(c5314.f17491) && this.f17492.equals(c5314.f17492) && AbstractC3831.m6874(this.f17496, c5314.f17496);
    }

    public final int hashCode() {
        return this.f17496.hashCode() + AbstractC5078.m8674((this.f17491.hashCode() + AbstractC3761.m6626(AbstractC2049.m3999(this.f17490, AbstractC5078.m8674(this.f17494.hashCode() * 31, 31, this.f17493), 31), 31, this.f17495)) * 31, 31, this.f17492);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f17494);
        sb.append(", firstSessionId=");
        sb.append(this.f17493);
        sb.append(", sessionIndex=");
        sb.append(this.f17490);
        sb.append(", eventTimestampUs=");
        sb.append(this.f17495);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f17491);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f17492);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC5078.m8678(sb, this.f17496, ')');
    }
}
