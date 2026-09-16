package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۦَؗۗؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3869 implements Serializable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f12914;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f12915;

    public C3869(Object obj, Object obj2) {
        this.f12915 = obj;
        this.f12914 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3869)) {
            return false;
        }
        C3869 c3869 = (C3869) obj;
        return AbstractC3831.m6874(this.f12915, c3869.f12915) && AbstractC3831.m6874(this.f12914, c3869.f12914);
    }

    public final int hashCode() {
        Object obj = this.f12915;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f12914;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f12915 + ", " + this.f12914 + ')';
    }
}
