package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۦْؑۢۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4060 implements Serializable {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f13527;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f13528;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f13529;

    public C4060(Object obj, Object obj2, Object obj3) {
        this.f13529 = obj;
        this.f13528 = obj2;
        this.f13527 = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4060)) {
            return false;
        }
        C4060 c4060 = (C4060) obj;
        return AbstractC3831.m6874(this.f13529, c4060.f13529) && AbstractC3831.m6874(this.f13528, c4060.f13528) && AbstractC3831.m6874(this.f13527, c4060.f13527);
    }

    public final int hashCode() {
        Object obj = this.f13529;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13528;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f13527;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f13529 + ", " + this.f13528 + ", " + this.f13527 + ')';
    }
}
