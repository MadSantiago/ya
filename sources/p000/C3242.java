package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦًِؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3242 {

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f10884;

    /* JADX INFO: renamed from: ۥۣ */
    public final Class f10885;

    public C3242(Class cls, ArrayList arrayList) {
        this.f10885 = cls;
        this.f10884 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3242)) {
            return false;
        }
        C3242 c3242 = (C3242) obj;
        return this.f10885.equals(c3242.f10885) && this.f10884.equals(c3242.f10884);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f10884.hashCode() + (this.f10885.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CreateInstanceConstructorCacheKey(targetClass=" + this.f10885 + ", parameterTypes=" + this.f10884 + ", isPublic=true)";
    }
}
