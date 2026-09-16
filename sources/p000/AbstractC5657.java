package p000;

import android.util.Log;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦٌؚۤؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5657 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final long f18623;

    /* JADX INFO: renamed from: ۥُ */
    public static final long f18624;

    /* JADX INFO: renamed from: ۥۗ */
    public static final long f18625;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Unsafe f18626;

    /* JADX INFO: renamed from: ۦؑ */
    public static final long f18627;

    static {
        long jObjectFieldOffset;
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            f18626 = unsafe;
            C5379 c5379 = new C5379(System.getProperty("java.boot.class.path", "").split(":", 2)[0], null, 0);
            Class clsLoadClass = c5379.loadClass(Executable.class.getName());
            Class clsLoadClass2 = c5379.loadClass(MethodHandle.class.getName());
            Class clsLoadClass3 = c5379.loadClass(Class.class.getName());
            unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("artMethod"));
            unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("declaringClass"));
            f18625 = unsafe.objectFieldOffset(clsLoadClass2.getDeclaredField("artFieldOrMethod"));
            try {
                jObjectFieldOffset = unsafe.objectFieldOffset(clsLoadClass3.getDeclaredField("fields"));
            } catch (NoSuchFieldException unused) {
                unsafe = f18626;
                jObjectFieldOffset = unsafe.objectFieldOffset(clsLoadClass3.getDeclaredField("iFields"));
                unsafe.objectFieldOffset(clsLoadClass3.getDeclaredField("sFields"));
            }
            long jObjectFieldOffset2 = unsafe.objectFieldOffset(clsLoadClass3.getDeclaredField("methods"));
            f18623 = jObjectFieldOffset2;
            Method declaredMethod = C4157.class.getDeclaredMethod("a", null);
            Method declaredMethod2 = C4157.class.getDeclaredMethod("b", null);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = f18625;
            long j2 = unsafe.getLong(methodHandleUnreflect, j);
            long j3 = unsafe.getLong(methodHandleUnreflect2, j);
            long j4 = unsafe.getLong(C4157.class, jObjectFieldOffset2);
            long j5 = j3 - j2;
            f18627 = j5;
            f18624 = (j2 - j4) - j5;
            Field declaredField = C4157.class.getDeclaredField("i");
            Field declaredField2 = C4157.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            unsafe.getLong(methodHandleUnreflectGetter, j);
            unsafe.getLong(methodHandleUnreflectGetter2, j);
            unsafe.getLong(C4157.class, jObjectFieldOffset);
        } catch (ReflectiveOperationException e) {
            Log.e("HiddenApiBypass", "Initialize error", e);
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static List m9488(Class cls) {
        if (cls.isPrimitive() || cls.isArray()) {
            return Collections.EMPTY_LIST;
        }
        try {
            Method declaredMethod = C4157.class.getDeclaredMethod("a", null);
            declaredMethod.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            long j = f18623;
            Unsafe unsafe = f18626;
            long j2 = unsafe.getLong(cls, j);
            if (j2 == 0) {
                return Collections.EMPTY_LIST;
            }
            int i = unsafe.getInt(j2);
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                f18626.putLong(methodHandleUnreflect, f18625, f18624 + (((long) i2) * f18627) + j2);
                arrayList.add((Executable) MethodHandles.reflectAs(Executable.class, methodHandleUnreflect));
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            return Collections.EMPTY_LIST;
        }
    }
}
