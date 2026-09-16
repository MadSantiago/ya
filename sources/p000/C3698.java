package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ۦٌٟؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3698 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0796 f12335 = new C0796(0);

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C2790 f12336;

    public C3698(C2790 c2790) {
        this.f12336 = c2790;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static Class m6559(ClassLoader classLoader, String str) {
        try {
            return m6560(classLoader, str);
        } catch (ClassCastException e) {
            throw new C1228(2, AbstractC3761.m6629("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C1228(2, AbstractC3761.m6629("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static Class m6560(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0796 c0796 = f12335;
        C0796 c0797 = (C0796) c0796.get(classLoader);
        if (c0797 == null) {
            c0797 = new C0796(0);
            c0796.put(classLoader, c0797);
        }
        Class cls = (Class) c0797.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0797.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractComponentCallbacksC0308 m6561(String str) {
        try {
            return (AbstractComponentCallbacksC0308) m6559(this.f12336.f9309.f2924.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C1228(2, AbstractC3761.m6629("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C1228(2, AbstractC3761.m6629("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C1228(2, AbstractC3761.m6629("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C1228(2, AbstractC3761.m6629("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
