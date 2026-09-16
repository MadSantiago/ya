package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦۥؕۦۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5716 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Unsafe f18811;

    /* JADX INFO: renamed from: ۥؗ */
    public abstract float mo2639(long j, Object obj);

    /* JADX INFO: renamed from: ۥُ */
    public abstract void mo2640(Object obj, long j, byte b);

    /* JADX INFO: renamed from: ۥّ */
    public abstract void mo2641(Object obj, long j, double d);

    /* JADX INFO: renamed from: ۥۗ */
    public abstract double mo2642(long j, Object obj);

    /* JADX INFO: renamed from: ۥۜ */
    public boolean mo2643() {
        Unsafe unsafe = this.f18811;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            AbstractC1194.m2521(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract boolean mo2644(long j, Object obj);

    /* JADX INFO: renamed from: ۦؑ */
    public abstract void mo2645(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: ۦؚ */
    public abstract void mo5382(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: ۦٌ */
    public abstract float mo5383(long j, Object obj);

    /* JADX INFO: renamed from: ۦِ */
    public abstract void mo5384(Object obj, long j, byte b);

    /* JADX INFO: renamed from: ۦٛ */
    public abstract boolean mo2646();

    /* JADX INFO: renamed from: ۦۗ */
    public abstract boolean mo5385(long j, Object obj);

    /* JADX INFO: renamed from: ۦۙ */
    public abstract void mo2647(Object obj, long j, float f);

    /* JADX INFO: renamed from: ۦۚ */
    public abstract void mo5386(Object obj, long j, float f);

    /* JADX INFO: renamed from: ۦ۟ */
    public abstract void mo5387(Object obj, long j, double d);

    /* JADX INFO: renamed from: ۦۨ */
    public abstract double mo5388(long j, Object obj);
}
