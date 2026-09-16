package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥْؑۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1194 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final AbstractC5716 f4116;

    /* JADX INFO: renamed from: ۥُ */
    public static final boolean f4117;

    /* JADX INFO: renamed from: ۥّ */
    public static final long f4118;

    /* JADX INFO: renamed from: ۥۗ */
    public static final Class f4119;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Unsafe f4120;

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean f4121;

    /* JADX INFO: renamed from: ۦۙ */
    public static final boolean f4122;

    static {
        Unsafe unsafe;
        boolean z = true;
        C1250 c1250 = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0051(1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f4120 = unsafe;
        f4119 = AbstractC2328.f7704;
        boolean zM2517 = m2517(Long.TYPE);
        boolean zM2518 = m2517(Integer.TYPE);
        int i = 0;
        if (unsafe != null) {
            if (!AbstractC2328.m4372()) {
                c1250 = new C1250(unsafe, 2);
            } else if (zM2517) {
                c1250 = new C1250(unsafe, z ? 1 : 0);
            } else if (zM2518) {
                c1250 = new C1250(unsafe, i);
            }
        }
        f4116 = c1250;
        f4121 = c1250 == null ? false : c1250.mo2646();
        f4117 = c1250 == null ? false : c1250.mo2643();
        f4118 = m2516(byte[].class);
        m2516(boolean[].class);
        m2514(boolean[].class);
        m2516(int[].class);
        m2514(int[].class);
        m2516(long[].class);
        m2514(long[].class);
        m2516(float[].class);
        m2514(float[].class);
        m2516(double[].class);
        m2514(double[].class);
        m2516(Object[].class);
        m2514(Object[].class);
        Field fieldM2511 = m2511();
        if (fieldM2511 != null && c1250 != null) {
            c1250.f18811.objectFieldOffset(fieldM2511);
        }
        f4122 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static Field m2511() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC2328.m4372()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static boolean m2512(long j, Object obj) {
        return ((byte) ((m2513((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static int m2513(long j, Object obj) {
        return f4116.f18811.getInt(obj, j);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m2514(Class cls) {
        if (f4117) {
            f4116.f18811.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static Object m2515(long j, Object obj) {
        return f4116.f18811.getObject(obj, j);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static int m2516(Class cls) {
        if (f4117) {
            return f4116.f18811.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static boolean m2517(Class cls) {
        if (!AbstractC2328.m4372()) {
            return false;
        }
        try {
            Class cls2 = f4119;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m2518(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m2519(((255 & b) << i) | (m2513(j2, obj) & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static void m2519(int i, long j, Object obj) {
        f4116.f18811.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m2520(byte[] bArr, long j, byte b) {
        f4116.mo2640(bArr, f4118 + j, b);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m2521(Throwable th) {
        Logger.getLogger(AbstractC1194.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static void m2522(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM2513 = m2513(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m2519(((255 & b) << i) | (iM2513 & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static long m2523(long j, Object obj) {
        return f4116.f18811.getLong(obj, j);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static void m2524(Object obj, long j, long j2) {
        f4116.f18811.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m2525(long j, Object obj, Object obj2) {
        f4116.f18811.putObject(obj, j, obj2);
    }
}
