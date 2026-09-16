package p000;

/* JADX INFO: renamed from: ۦًۘؖٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5041 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1782 f16726;

    static {
        C1782 c1782 = null;
        try {
            c1782 = (C1782) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c1782 == null) {
            c1782 = new C1782();
        }
        f16726 = c1782;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3131 m8557(Class cls) {
        f16726.getClass();
        return new C3131(cls);
    }
}
