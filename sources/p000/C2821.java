package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥۦؗؐؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2821 extends AbstractC5716 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f9424;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2821(Unsafe unsafe, int i) {
        super(unsafe);
        this.f9424 = i;
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo5382(Object obj, long j, boolean z) {
        switch (this.f9424) {
            case 0:
                if (!AbstractC0667.f2456) {
                    AbstractC0667.m1474(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC0667.m1477(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC0667.f2456) {
                    AbstractC0667.m1474(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC0667.m1477(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۦٌ */
    public final float mo5383(long j, Object obj) {
        int i = this.f9424;
        Unsafe unsafe = this.f18811;
        switch (i) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۦِ */
    public final void mo5384(Object obj, long j, byte b) {
        switch (this.f9424) {
            case 0:
                if (!AbstractC0667.f2456) {
                    AbstractC0667.m1474(obj, j, b);
                } else {
                    AbstractC0667.m1477(obj, j, b);
                }
                break;
            default:
                if (!AbstractC0667.f2456) {
                    AbstractC0667.m1474(obj, j, b);
                } else {
                    AbstractC0667.m1477(obj, j, b);
                }
                break;
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo5385(long j, Object obj) {
        switch (this.f9424) {
            case 0:
                return AbstractC0667.f2456 ? AbstractC0667.m1482(j, obj) : AbstractC0667.m1487(j, obj);
            default:
                return AbstractC0667.f2456 ? AbstractC0667.m1482(j, obj) : AbstractC0667.m1487(j, obj);
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo5386(Object obj, long j, float f) {
        int i = this.f9424;
        Unsafe unsafe = this.f18811;
        switch (i) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo5387(Object obj, long j, double d) {
        switch (this.f9424) {
            case 0:
                this.f18811.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.f18811.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p000.AbstractC5716
    /* JADX INFO: renamed from: ۦۨ */
    public final double mo5388(long j, Object obj) {
        int i = this.f9424;
        Unsafe unsafe = this.f18811;
        switch (i) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }
}
