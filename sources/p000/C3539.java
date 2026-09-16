package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦؙِؔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3539 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Method f11744;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f11745;

    public C3539(Method method, int i) {
        this.f11745 = i;
        this.f11744 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3539)) {
            return false;
        }
        C3539 c3539 = (C3539) obj;
        return this.f11745 == c3539.f11745 && this.f11744.getName().equals(c3539.f11744.getName());
    }

    public final int hashCode() {
        return this.f11744.getName().hashCode() + (this.f11745 * 31);
    }
}
