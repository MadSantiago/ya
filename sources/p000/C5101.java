package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦۙؓۥۣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5101 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C5536 f16935;

    /* JADX INFO: renamed from: ۥّ */
    public static final /* synthetic */ long f16936;

    /* JADX INFO: renamed from: ۦۙ */
    public static final /* synthetic */ long f16937;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: ۥؗ */
    public final int f16938;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f16939;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f16940;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ AtomicReferenceArray f16941;

    static {
        Unsafe unsafe = AbstractC3456.f11473;
        f16936 = unsafe.objectFieldOffset(C5101.class.getDeclaredField("_next$volatile"));
        f16937 = unsafe.objectFieldOffset(C5101.class.getDeclaredField("_state$volatile"));
        f16935 = new C5536(2, "REMOVE_FROZEN");
    }

    public C5101(int i, boolean z) {
        this.f16940 = i;
        this.f16939 = z;
        int i2 = i - 1;
        this.f16938 = i2;
        this.f16941 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C1078.m2276("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C1078.m2276("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C5101 m8730() {
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Unsafe unsafe2;
        do {
            unsafe = AbstractC3456.f11473;
            j = f16937;
            longVolatile = unsafe.getLongVolatile(this, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j2 = longVolatile;
                break;
            }
            j2 = 1152921504606846976L | longVolatile;
        } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        while (true) {
            Unsafe unsafe3 = AbstractC3456.f11473;
            long j3 = f16936;
            C5101 c5101 = (C5101) unsafe3.getObjectVolatile(this, j3);
            if (c5101 != null) {
                return c5101;
            }
            C5101 c5102 = new C5101(this.f16940 * 2, this.f16939);
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i3 = this.f16938;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c5717 = this.f16941.get(i4);
                if (c5717 == null) {
                    c5717 = new C5717(i);
                }
                c5102.f16941.set(c5102.f16938 & i, c5717);
                i++;
            }
            AbstractC3456.f11473.putLongVolatile(c5102, f16937, j2 & (-1152921504606846977L));
            do {
                unsafe2 = AbstractC3456.f11473;
                if (unsafe2.compareAndSwapObject(this, f16936, (Object) null, c5102)) {
                    break;
                }
            } while (unsafe2.getObjectVolatile(this, j3) == null);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m8731() {
        while (true) {
            long longVolatile = AbstractC3456.f11473.getLongVolatile(this, f16937);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            C5101 c5101 = this;
            if (AbstractC3456.f11473.compareAndSwapLong(c5101, f16937, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = c5101;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m8732(Object obj) {
        C5101 c5101 = this;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f16937;
            long longVolatile = unsafe.getLongVolatile(c5101, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = c5101.f16938;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = c5101.f16939;
            AtomicReferenceArray atomicReferenceArray = c5101.f16941;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(c5101, f16937, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C5101 c5101M8730 = this;
                    while ((AbstractC3456.f11473.getLongVolatile(c5101M8730, j) & 1152921504606846976L) != 0) {
                        c5101M8730 = c5101M8730.m8730();
                        AtomicReferenceArray atomicReferenceArray2 = c5101M8730.f16941;
                        int i4 = c5101M8730.f16938 & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C5717) && ((C5717) obj2).f18812 == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c5101M8730 = null;
                        }
                        if (c5101M8730 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                c5101 = this;
            } else {
                int i5 = c5101.f16940;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Object m8733() {
        C5101 c5101M8730 = this;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f16937;
            long longVolatile = unsafe.getLongVolatile(c5101M8730, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return f16935;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = c5101M8730.f16938;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = c5101M8730.f16941;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = c5101M8730.f16939;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof C5717)) {
                    long j2 = (i + 1) & 1073741823;
                    if (unsafe.compareAndSwapLong(c5101M8730, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    c5101M8730 = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = AbstractC3456.f11473;
                            long j3 = f16937;
                            long longVolatile2 = unsafe2.getLongVolatile(c5101M8730, j3);
                            int i5 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                c5101M8730 = c5101M8730.m8730();
                            } else {
                                if (unsafe2.compareAndSwapLong(c5101M8730, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                    c5101M8730.f16941.set(c5101M8730.f16938 & i5, null);
                                    c5101M8730 = null;
                                } else {
                                    continue;
                                }
                            }
                            if (c5101M8730 == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
