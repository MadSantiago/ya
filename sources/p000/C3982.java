package p000;

/* JADX INFO: renamed from: ۦٍِؖؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3982 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f13301;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f13302;

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumC2925 f13303;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f13304;

    public C3982(EnumC2925 enumC2925, long j, int i, boolean z) {
        this.f13303 = enumC2925;
        this.f13302 = j;
        this.f13301 = i;
        this.f13304 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3982)) {
            return false;
        }
        C3982 c3982 = (C3982) obj;
        return this.f13303 == c3982.f13303 && C1553.m3306(this.f13302, c3982.f13302) && this.f13301 == c3982.f13301 && this.f13304 == c3982.f13304;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13304) + ((AbstractC3761.m6632(this.f13301) + AbstractC3761.m6626(this.f13303.hashCode() * 31, 31, this.f13302)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f13303);
        sb.append(", position=");
        sb.append((Object) C1553.m3309(this.f13302));
        sb.append(", anchor=");
        int i = this.f13301;
        if (i == 1) {
            str = "Left";
        } else if (i != 2) {
            str = i != 3 ? "null" : "Right";
        } else {
            str = "Middle";
        }
        sb.append(str);
        sb.append(", visible=");
        sb.append(this.f13304);
        sb.append(')');
        return sb.toString();
    }
}
