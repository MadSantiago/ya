package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥُٖؕۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1469 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final /* synthetic */ int f5001 = 0;

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ long f5002;

    /* JADX INFO: renamed from: ۥۣ */
    public static final /* synthetic */ long f5003;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = AbstractC3456.f11473;
        f5003 = unsafe.objectFieldOffset(AbstractC1469.class.getDeclaredField("_next$volatile"));
        f5002 = unsafe.objectFieldOffset(AbstractC1469.class.getDeclaredField("_prev$volatile"));
    }

    public AbstractC1469(AbstractC4971 abstractC4971) {
        this._prev$volatile = abstractC4971;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract boolean mo3084();

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC1469 m3085() {
        Object objectVolatile = AbstractC3456.f11473.getObjectVolatile(this, f5003);
        if (objectVolatile == AbstractC3831.f12710) {
            return null;
        }
        return (AbstractC1469) objectVolatile;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3086() {
        AbstractC3456.f11473.putObjectVolatile(this, f5002, (Object) null);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m3087() {
        AbstractC1469 abstractC1469;
        Unsafe unsafe;
        if (m3085() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = AbstractC3456.f11473;
            long j = f5002;
            AbstractC1469 abstractC14610 = (AbstractC1469) unsafe2.getObjectVolatile(this, j);
            while (abstractC14610 != null && abstractC14610.mo3084()) {
                abstractC14610 = (AbstractC1469) AbstractC3456.f11473.getObjectVolatile(abstractC14610, j);
            }
            AbstractC1469 abstractC1469M3085 = m3085();
            do {
                abstractC1469 = abstractC1469M3085;
                if (!abstractC1469.mo3084()) {
                    break;
                } else {
                    abstractC1469M3085 = abstractC1469.m3085();
                }
            } while (abstractC1469M3085 != null);
            while (true) {
                Object objectVolatile = AbstractC3456.f11473.getObjectVolatile(abstractC1469, j);
                AbstractC1469 abstractC14611 = ((AbstractC1469) objectVolatile) == null ? null : abstractC14610;
                while (true) {
                    unsafe = AbstractC3456.f11473;
                    if (unsafe.compareAndSwapObject(abstractC1469, f5002, objectVolatile, abstractC14611)) {
                        break;
                    } else if (unsafe.getObjectVolatile(abstractC1469, j) != objectVolatile) {
                    }
                }
            }
            if (abstractC14610 != null) {
                unsafe.putObjectVolatile(abstractC14610, f5003, abstractC1469);
            }
            if (!abstractC1469.mo3084() || abstractC1469.m3085() == null) {
                if (abstractC14610 == null || !abstractC14610.mo3084()) {
                    return;
                }
            }
        }
    }
}
