package p000;

/* JADX INFO: renamed from: ۥۥِٕؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2721 {

    /* JADX INFO: renamed from: ۥۗ */
    public final String f9014;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f9015;

    public C2721(String str, String str2) {
        this.f9015 = str;
        this.f9014 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2721)) {
            return false;
        }
        C2721 c2721 = (C2721) obj;
        return AbstractC3831.m6874(this.f9015, c2721.f9015) && AbstractC3831.m6874(this.f9014, c2721.f9014);
    }

    public final int hashCode() {
        String str = this.f9015;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9014;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f9015);
        sb.append(", authToken=");
        return AbstractC5078.m8678(sb, this.f9014, ')');
    }
}
