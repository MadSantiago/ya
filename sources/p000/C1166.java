package p000;

/* JADX INFO: renamed from: ۥّؕؖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1166 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Class f4048;

    /* JADX INFO: renamed from: ۥۣ */
    public final Class f4049;

    public C1166(Class cls, Class cls2) {
        this.f4049 = cls;
        this.f4048 = cls2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C1166 m2484(Class cls) {
        return new C1166(InterfaceC5394.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1166.class != obj.getClass()) {
            return false;
        }
        C1166 c1166 = (C1166) obj;
        if (this.f4048.equals(c1166.f4048)) {
            return this.f4049.equals(c1166.f4049);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4049.hashCode() + (this.f4048.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f4048;
        Class cls2 = this.f4049;
        if (cls2 == InterfaceC5394.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
