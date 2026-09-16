package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦٝ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0082 extends AbstractC5537 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final Unsafe f15574;

    /* JADX INFO: renamed from: ۦؚ */
    public static final long f15575;

    /* JADX INFO: renamed from: ۦٌ */
    public static final long f15576;

    /* JADX INFO: renamed from: ۦِ */
    public static final long f15577;

    /* JADX INFO: renamed from: ۦٛ */
    public static final long f15578;

    /* JADX INFO: renamed from: ۦۗ */
    public static final long f15579;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0051(0));
        }
        try {
            f15577 = unsafe.objectFieldOffset(AbstractC0032.class.getDeclaredField("ۥْ"));
            f15578 = unsafe.objectFieldOffset(AbstractC0032.class.getDeclaredField("ۦ۟"));
            f15579 = unsafe.objectFieldOffset(AbstractC0032.class.getDeclaredField("ۦۨ"));
            f15575 = unsafe.objectFieldOffset(C0083.class.getDeclaredField("ۥۣ"));
            f15576 = unsafe.objectFieldOffset(C0083.class.getDeclaredField("ۥۗ"));
            f15574 = unsafe;
        } catch (Exception e2) {
            Object obj = AbstractC4181.f13914;
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            }
            C5028.m8450(e2);
        }
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۥۤ */
    public final void mo4163(C0083 c0083, C0083 c0084) {
        f15574.putObject(c0083, f15576, c0084);
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۥۦ */
    public final C0083 mo4164(AbstractC0032 abstractC0032) {
        C0083 c0083;
        C0083 c0084 = C0083.f15752;
        do {
            c0083 = abstractC0032.f6337;
            if (c0084 == c0083) {
                break;
            }
        } while (!mo4168(abstractC0032, c0083, c0084));
        return c0083;
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦؒ */
    public final void mo4165(C0083 c0083, Thread thread) {
        f15574.putObject(c0083, f15575, thread);
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦؖ */
    public final C0050 mo4166(AbstractC0032 abstractC0032) {
        C0050 c0050;
        C0050 c0051 = C0050.f9656;
        do {
            c0050 = abstractC0032.f6338;
            if (c0051 == c0050) {
                break;
            }
        } while (!mo4169(abstractC0032, c0050, c0051));
        return c0050;
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo4167(AbstractC0032 abstractC0032, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = f15574;
            long j = f15579;
            AbstractC0032 abstractC0033 = abstractC0032;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(abstractC0033, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(abstractC0033, j) != obj3) {
                return false;
            }
            abstractC0032 = abstractC0033;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦٌ */
    public final boolean mo4168(AbstractC0032 abstractC0032, C0083 c0083, C0083 c0084) {
        while (true) {
            Unsafe unsafe = f15574;
            long j = f15577;
            AbstractC0032 abstractC0033 = abstractC0032;
            C0083 c0085 = c0083;
            C0083 c0086 = c0084;
            if (unsafe.compareAndSwapObject(abstractC0033, j, c0085, c0086)) {
                return true;
            }
            if (unsafe.getObject(abstractC0033, j) != c0085) {
                return false;
            }
            abstractC0032 = abstractC0033;
            c0083 = c0085;
            c0084 = c0086;
        }
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo4169(AbstractC0032 abstractC0032, C0050 c0050, C0050 c0051) {
        while (true) {
            Unsafe unsafe = f15574;
            long j = f15578;
            AbstractC0032 abstractC0033 = abstractC0032;
            C0050 c0052 = c0050;
            C0050 c0053 = c0051;
            if (unsafe.compareAndSwapObject(abstractC0033, j, c0052, c0053)) {
                return true;
            }
            if (unsafe.getObject(abstractC0033, j) != c0052) {
                return false;
            }
            abstractC0032 = abstractC0033;
            c0050 = c0052;
            c0051 = c0053;
        }
    }
}
