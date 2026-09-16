package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۥؘٔؓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1330 implements Serializable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f4597;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f4598;

    public C1330(Object obj, String str) {
        this.f4598 = str;
        this.f4597 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1330)) {
            return false;
        }
        C1330 c1330 = (C1330) obj;
        return AbstractC3831.m6874(this.f4598, c1330.f4598) && AbstractC3831.m6874(this.f4597, c1330.f4597);
    }

    public final int hashCode() {
        int iHashCode = this.f4598.hashCode() * 31;
        Object obj = this.f4597;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ChannelData(key=" + this.f4598 + ", value=" + this.f4597 + ")";
    }
}
