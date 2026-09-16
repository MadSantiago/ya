package p000;

/* JADX INFO: renamed from: ۦّٔؕؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4180 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f13913;

    public C4180(String str) {
        this.f13913 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4180) && AbstractC3831.m6874(this.f13913, ((C4180) obj).f13913);
    }

    public final int hashCode() {
        return this.f13913.hashCode();
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("SessionDetails(sessionId="), this.f13913, ')');
    }
}
