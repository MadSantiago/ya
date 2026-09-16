package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۥٗؖۦٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1542 implements Serializable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f5218;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f5219;

    public C1542(Object obj, String str) {
        this.f5219 = str;
        this.f5218 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1542)) {
            return false;
        }
        C1542 c1542 = (C1542) obj;
        return this.f5219.equals(c1542.f5219) && this.f5218.equals(c1542.f5218);
    }

    public final int hashCode() {
        return this.f5218.hashCode() + (this.f5219.hashCode() * 31);
    }

    public final String toString() {
        return "PrefsData(key=" + this.f5219 + ", value=" + this.f5218 + ")";
    }
}
