package p000;

import dalvik.system.PathClassLoader;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Executable;

/* JADX INFO: renamed from: ۦّ۠ؒۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5379 extends PathClassLoader {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f17775;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5379(String str, ClassLoader classLoader, int i) {
        super(str, classLoader);
        this.f17775 = i;
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str) {
        switch (this.f17775) {
            case 0:
                if (Object.class.getName().equals(str)) {
                    return Object.class;
                }
                try {
                    return findClass(str);
                } catch (ClassNotFoundException unused) {
                    if (Executable.class.getName().equals(str)) {
                        return C1607.class;
                    }
                    if (MethodHandle.class.getName().equals(str)) {
                        return C1295.class;
                    }
                    return Class.class.getName().equals(str) ? C1632.class : super.loadClass(str);
                }
            default:
                return super.loadClass(str);
        }
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        switch (this.f17775) {
            case 1:
                if (!str.startsWith("java.") && !str.startsWith("android.")) {
                    try {
                        return findClass(str);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return super.loadClass(str, z);
            default:
                return super.loadClass(str, z);
        }
    }
}
