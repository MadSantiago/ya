package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦْؐؕۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2989 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ long f10050;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ long f10051;

    /* JADX INFO: renamed from: ۦۨ */
    public static final /* synthetic */ long f10052;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = AbstractC3456.f11473;
        f10052 = unsafe.objectFieldOffset(AbstractC2989.class.getDeclaredField("_next$volatile"));
        f10051 = unsafe.objectFieldOffset(AbstractC2989.class.getDeclaredField("_prev$volatile"));
        f10050 = unsafe.objectFieldOffset(AbstractC2989.class.getDeclaredField("_removedRef$volatile"));
    }

    public String toString() {
        return new C2589(1, 2, AbstractC4489.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC4489.m7777(this);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m5576(AbstractC2989 abstractC2989, int i) {
        AbstractC2989 abstractC29810;
        AbstractC2989 abstractC29811;
        while (true) {
            AbstractC2989 abstractC2989M5579 = this.m5579();
            if (abstractC2989M5579 instanceof C4761) {
                return (((C4761) abstractC2989M5579).f15710 & i) == 0 && abstractC2989M5579.m5576(abstractC2989, i);
            }
            Unsafe unsafe = AbstractC3456.f11473;
            unsafe.putObjectVolatile(abstractC2989, f10051, abstractC2989M5579);
            long j = f10052;
            unsafe.putObjectVolatile(abstractC2989, j, this);
            while (true) {
                Unsafe unsafe2 = AbstractC3456.f11473;
                abstractC29810 = this;
                abstractC29811 = abstractC2989;
                if (unsafe2.compareAndSwapObject(abstractC2989M5579, f10052, abstractC29810, abstractC29811)) {
                    abstractC29811.m5582(abstractC29810);
                    return true;
                }
                if (unsafe2.getObjectVolatile(abstractC2989M5579, j) != abstractC29810) {
                    break;
                }
                this = abstractC29810;
                abstractC2989 = abstractC29811;
            }
            this = abstractC29810;
            abstractC2989 = abstractC29811;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC2989 m5577() {
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f10051;
            AbstractC2989 abstractC2989 = (AbstractC2989) unsafe.getObjectVolatile(this, j);
            AbstractC2989 abstractC29810 = null;
            AbstractC2989 abstractC29811 = abstractC2989;
            while (true) {
                if (abstractC29811 == null) {
                    C0178.m382();
                    return null;
                }
                Unsafe unsafe2 = AbstractC3456.f11473;
                long j2 = f10052;
                Object objectVolatile = unsafe2.getObjectVolatile(abstractC29811, j2);
                if (objectVolatile == this) {
                    if (abstractC2989 != abstractC29811) {
                        while (true) {
                            Unsafe unsafe3 = AbstractC3456.f11473;
                            AbstractC2989 abstractC29812 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(abstractC29812, f10051, abstractC2989, abstractC29811);
                            AbstractC2989 abstractC29813 = abstractC2989;
                            this = abstractC29812;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != abstractC29813) {
                                    break;
                                }
                                this = this;
                                abstractC2989 = abstractC29813;
                            }
                        }
                    }
                    return abstractC29811;
                }
                abstractC2989 = abstractC2989;
                this = this;
                if (this.mo5581()) {
                    return null;
                }
                if (!(objectVolatile instanceof C4415)) {
                    abstractC29810 = abstractC29811;
                    abstractC29811 = (AbstractC2989) objectVolatile;
                } else if (abstractC29810 != null) {
                    AbstractC2989 abstractC29814 = ((C4415) objectVolatile).f14556;
                    while (true) {
                        AbstractC2989 abstractC29815 = abstractC29811;
                        Unsafe unsafe4 = AbstractC3456.f11473;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(abstractC29810, f10052, abstractC29815, abstractC29814);
                        abstractC29811 = abstractC29815;
                        if (zCompareAndSwapObject2) {
                            abstractC29811 = abstractC29810;
                            abstractC29810 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(abstractC29810, j2) != abstractC29811) {
                            break;
                        }
                    }
                } else {
                    if (abstractC29811 == null) {
                        C0178.m382();
                        return null;
                    }
                    abstractC29811 = (AbstractC2989) unsafe2.getObjectVolatile(abstractC29811, j);
                }
            }
            this = this;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final Object m5578() {
        return AbstractC3456.f11473.getObjectVolatile(this, f10052);
    }

    /* JADX INFO: renamed from: ۦِ */
    public final AbstractC2989 m5579() {
        AbstractC2989 abstractC2989M5577 = m5577();
        if (abstractC2989M5577 != null) {
            return abstractC2989M5577;
        }
        Unsafe unsafe = AbstractC3456.f11473;
        long j = f10051;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            AbstractC2989 abstractC2989 = (AbstractC2989) objectVolatile;
            if (!abstractC2989.mo5581()) {
                return abstractC2989;
            }
            objectVolatile = AbstractC3456.f11473.getObjectVolatile(abstractC2989, j);
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC2989 m5580() {
        Object objM5578 = m5578();
        C4415 c4415 = objM5578 instanceof C4415 ? (C4415) objM5578 : null;
        return c4415 != null ? c4415.f14556 : (AbstractC2989) objM5578;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public boolean mo5581() {
        return m5578() instanceof C4415;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m5582(AbstractC2989 abstractC2989) {
        AbstractC2989 abstractC29810;
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f10051;
            AbstractC2989 abstractC29811 = (AbstractC2989) unsafe.getObjectVolatile(abstractC2989, j);
            if (this.m5578() != abstractC2989) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = AbstractC3456.f11473;
                abstractC29810 = this;
                AbstractC2989 abstractC29812 = abstractC2989;
                if (unsafe2.compareAndSwapObject(abstractC29812, f10051, abstractC29811, abstractC29810)) {
                    if (abstractC29810.mo5581()) {
                        abstractC29812.m5577();
                        return;
                    }
                    return;
                } else {
                    abstractC2989 = abstractC29812;
                    if (unsafe2.getObjectVolatile(abstractC29812, j) != abstractC29811) {
                        break;
                    } else {
                        this = abstractC29810;
                    }
                }
            }
            this = abstractC29810;
        }
    }
}
