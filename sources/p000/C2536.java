package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۥۡؑؗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2536 implements InterfaceC3720, Serializable {

    /* JADX INFO: renamed from: ۥَ */
    public final boolean f8418 = false;

    /* JADX INFO: renamed from: ۥْ */
    public final String f8419;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f8420;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f8421;

    /* JADX INFO: renamed from: ۦٗ */
    public final int f8422;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Class f8423;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f8424;

    public C2536(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.f8424 = obj;
        this.f8423 = cls;
        this.f8419 = str;
        this.f8420 = str2;
        this.f8421 = i;
        this.f8422 = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2536)) {
            return false;
        }
        C2536 c2536 = (C2536) obj;
        return this.f8418 == c2536.f8418 && this.f8421 == c2536.f8421 && this.f8422 == c2536.f8422 && AbstractC3831.m6874(this.f8424, c2536.f8424) && this.f8423.equals(c2536.f8423) && this.f8419.equals(c2536.f8419) && this.f8420.equals(c2536.f8420);
    }

    public final int hashCode() {
        Object obj = this.f8424;
        return ((((AbstractC5078.m8674(AbstractC5078.m8674((this.f8423.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.f8419), 31, this.f8420) + (this.f8418 ? 1231 : 1237)) * 31) + this.f8421) * 31) + this.f8422;
    }

    public final String toString() {
        AbstractC5041.f16726.getClass();
        return C1782.m3569(this);
    }

    @Override // p000.InterfaceC3720
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1856() {
        return this.f8421;
    }
}
