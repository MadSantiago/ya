package p000;

/* JADX INFO: renamed from: ۥؓۗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0359 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f1300;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f1301;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f1302;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2391 f1303;

    public C0359(int i, long j, int i2, C2391 c2391) {
        this.f1302 = i;
        this.f1301 = j;
        this.f1300 = i2;
        this.f1303 = c2391;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0359)) {
            return false;
        }
        C0359 c0359 = (C0359) obj;
        return this.f1302 == c0359.f1302 && this.f1301 == c0359.f1301 && this.f1300 == c0359.f1300 && AbstractC3831.m6874(this.f1303, c0359.f1303);
    }

    public final int hashCode() {
        int iM6632 = (AbstractC3761.m6632(this.f1300) + AbstractC3761.m6626(Integer.hashCode(this.f1302) * 31, 31, this.f1301)) * 31;
        C2391 c2391 = this.f1303;
        return iM6632 + (c2391 == null ? 0 : c2391.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.f1302);
        sb.append(", timestamp=");
        sb.append(this.f1301);
        sb.append(", type=");
        int i = this.f1300;
        if (i != 1) {
            str = i != 2 ? "null" : "VIEW_DISAPPEAR";
        } else {
            str = "VIEW_APPEAR";
        }
        sb.append(str);
        sb.append(", structureCompat=");
        sb.append(this.f1303);
        sb.append(')');
        return sb.toString();
    }
}
