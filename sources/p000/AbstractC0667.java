package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥؘْؓۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0667 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final AbstractC5716 f2454;

    /* JADX INFO: renamed from: ۥُ */
    public static final long f2455;

    /* JADX INFO: renamed from: ۥّ */
    public static final boolean f2456;

    /* JADX INFO: renamed from: ۥۗ */
    public static final Class f2457;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Unsafe f2458;

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean f2459;

    static {
        boolean z;
        AbstractC5716 abstractC5716;
        Unsafe unsafeM1485 = m1485();
        f2458 = unsafeM1485;
        int i = AbstractC5529.f18251;
        f2457 = Memory.class;
        Class cls = Long.TYPE;
        boolean zM1481 = m1481(cls);
        Class cls2 = Integer.TYPE;
        boolean zM1482 = m1481(cls2);
        boolean z2 = true;
        C2821 c2821 = null;
        int i2 = 0;
        if (unsafeM1485 != null) {
            if (zM1481) {
                c2821 = new C2821(unsafeM1485, z2 ? 1 : 0);
            } else if (zM1482) {
                c2821 = new C2821(unsafeM1485, i2);
            }
        }
        f2454 = c2821;
        if (c2821 != null) {
            try {
                Class<?> cls3 = c2821.f18811.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                m1479();
            } catch (Throwable th) {
                Logger.getLogger(AbstractC0667.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        AbstractC5716 abstractC5717 = f2454;
        if (abstractC5717 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = abstractC5717.f18811.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(AbstractC0667.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        f2459 = z;
        f2455 = m1489(byte[].class);
        m1489(boolean[].class);
        m1488(boolean[].class);
        m1489(int[].class);
        m1488(int[].class);
        m1489(long[].class);
        m1488(long[].class);
        m1489(float[].class);
        m1488(float[].class);
        m1489(double[].class);
        m1488(double[].class);
        m1489(Object[].class);
        m1488(Object[].class);
        Field fieldM1479 = m1479();
        if (fieldM1479 != null && (abstractC5716 = f2454) != null) {
            abstractC5716.f18811.objectFieldOffset(fieldM1479);
        }
        f2456 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m1474(Object obj, long j, byte b) {
        Unsafe unsafe = f2454.f18811;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m1475(int i, long j, Object obj) {
        f2454.f18811.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static long m1476(long j, Object obj) {
        return f2454.f18811.getLong(obj, j);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m1477(Object obj, long j, byte b) {
        Unsafe unsafe = f2454.f18811;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static Object m1478(long j, Object obj) {
        return f2454.f18811.getObject(obj, j);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Field m1479() {
        Field declaredField;
        Field declaredField2;
        int i = AbstractC5529.f18251;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static int m1480(long j, Object obj) {
        return f2454.f18811.getInt(obj, j);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static boolean m1481(Class cls) {
        int i = AbstractC5529.f18251;
        try {
            Class cls2 = f2457;
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

    /* JADX INFO: renamed from: ۦٌ */
    public static /* synthetic */ boolean m1482(long j, Object obj) {
        return ((byte) ((f2454.f18811.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m1483(byte[] bArr, long j, byte b) {
        f2454.mo5384(bArr, f2455 + j, b);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m1484(long j, Object obj, Object obj2) {
        f2454.f18811.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static Unsafe m1485() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0051(2));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(AbstractC0667.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m1486(Object obj, long j, long j2) {
        f2454.f18811.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static /* synthetic */ boolean m1487(long j, Object obj) {
        return ((byte) ((f2454.f18811.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static void m1488(Class cls) {
        if (f2459) {
            f2454.f18811.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static int m1489(Class cls) {
        if (f2459) {
            return f2454.f18811.arrayBaseOffset(cls);
        }
        return -1;
    }
}
