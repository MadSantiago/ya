package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥٓؒؑؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1250 extends AbstractC5716 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f4309;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1250(Unsafe unsafe, int i) {
        super(unsafe);
        this.f4309 = i;
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۥؗ */
    public final float mo2639(long j, Object obj) {
        switch (this.f4309) {
            case 0:
                return Float.intBitsToFloat(this.f18811.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(this.f18811.getInt(obj, j));
            default:
                return this.f18811.getFloat(obj, j);
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2640(Object obj, long j, byte b) {
        switch (this.f4309) {
            case 0:
                if (!AbstractC1194.f4122) {
                    AbstractC1194.m2518(obj, j, b);
                } else {
                    AbstractC1194.m2522(obj, j, b);
                }
                break;
            case 1:
                if (!AbstractC1194.f4122) {
                    AbstractC1194.m2518(obj, j, b);
                } else {
                    AbstractC1194.m2522(obj, j, b);
                }
                break;
            default:
                this.f18811.putByte(obj, j, b);
                break;
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۥّ */
    public final void mo2641(Object obj, long j, double d) {
        switch (this.f4309) {
            case 0:
                this.f18811.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                this.f18811.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.f18811.putDouble(obj, j, d);
                break;
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۥۗ */
    public final double mo2642(long j, Object obj) {
        switch (this.f4309) {
            case 0:
                return Double.longBitsToDouble(this.f18811.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(this.f18811.getLong(obj, j));
            default:
                return this.f18811.getDouble(obj, j);
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۥۜ */
    public boolean mo2643() {
        switch (this.f4309) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                if (!super.mo2643()) {
                    return false;
                }
                try {
                    Class<?> cls = this.f18811.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    AbstractC1194.m2521(th);
                    return false;
                }
            default:
                return super.mo2643();
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo2644(long j, Object obj) {
        switch (this.f4309) {
            case 0:
                if (AbstractC1194.f4122) {
                    return AbstractC1194.m2512(j, obj);
                }
                return ((byte) ((AbstractC1194.m2513((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            case 1:
                if (AbstractC1194.f4122) {
                    return AbstractC1194.m2512(j, obj);
                }
                return ((byte) ((AbstractC1194.m2513((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            default:
                return this.f18811.getBoolean(obj, j);
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2645(Object obj, long j, boolean z) {
        switch (this.f4309) {
            case 0:
                if (!AbstractC1194.f4122) {
                    AbstractC1194.m2518(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC1194.m2522(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            case 1:
                if (!AbstractC1194.f4122) {
                    AbstractC1194.m2518(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC1194.m2522(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                this.f18811.putBoolean(obj, j, z);
                break;
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۦٛ */
    public final boolean mo2646() {
        switch (this.f4309) {
            case 0:
            case 1:
                return false;
            default:
                Unsafe unsafe = this.f18811;
                if (unsafe == null) {
                    return false;
                }
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (AbstractC1194.m2511() == null) {
                        return false;
                    }
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        AbstractC1194.m2521(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    AbstractC1194.m2521(th2);
                    return false;
                }
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo2647(Object obj, long j, float f) {
        switch (this.f4309) {
            case 0:
                this.f18811.putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                this.f18811.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.f18811.putFloat(obj, j, f);
                break;
        }
    }
}
