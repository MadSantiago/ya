package p000;

/* JADX INFO: renamed from: ۦٍؑۢ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3760 extends AbstractC1010 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C0663 f12521;

    public C3760(C0663 c0663) {
        this.f12521 = c0663;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1010)) {
            return false;
        }
        return this.f12521.equals(((C3760) ((AbstractC1010) obj)).f12521);
    }

    public final int hashCode() {
        return this.f12521.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f12521 + "}";
    }
}
