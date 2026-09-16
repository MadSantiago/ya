package p000;

import java.nio.charset.Charset;
import java.util.Set;

/* JADX INFO: renamed from: ۥُۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1078 implements InterfaceC1663, InterfaceC3558, InterfaceC2456, InterfaceC5346 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C1078 f3767 = new C1078(0);

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3768;

    public /* synthetic */ C1078(int i) {
        this.f3768 = i;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static /* synthetic */ void m2270(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: ۥُ */
    public static /* synthetic */ void m2271(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static /* synthetic */ void m2272(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static /* synthetic */ void m2273(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static /* synthetic */ void m2274() {
        throw new C1228(5);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static /* synthetic */ void m2275() {
        throw new C1228(6);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static /* synthetic */ void m2276(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static /* synthetic */ void m2277(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static /* synthetic */ void m2278(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static /* synthetic */ void m2279(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static /* synthetic */ void m2280(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    @Override // p000.InterfaceC2456
    public Object apply(Object obj) {
        C4592.f15153.getClass();
        return C3404.f11324.m8700((AbstractC3677) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // p000.InterfaceC3558
    /* JADX INFO: renamed from: ۦؑ */
    public double mo399(double d) {
        switch (this.f3768) {
            case 10:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 11:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 12:
                float[] fArr = C3444.f11438;
                return C3444.m6224(C3444.f11427, d);
            case 13:
                float[] fArr2 = C3444.f11438;
                return C3444.m6225(C3444.f11427, d);
            case 14:
                float[] fArr3 = C3444.f11438;
                return C3444.m6226(C3444.f11439, d);
            default:
                float[] fArr4 = C3444.f11438;
                return C3444.m6223(C3444.f11439, d);
        }
    }

    @Override // p000.InterfaceC5346
    /* JADX INFO: renamed from: ۦٌ */
    public Object mo400(C2813 c2813) {
        Set setMo5365 = c2813.mo5365(C1166.m2484(C4550.class));
        C4228 c4228 = C4228.f14023;
        if (c4228 == null) {
            synchronized (C4228.class) {
                try {
                    c4228 = C4228.f14023;
                    if (c4228 == null) {
                        c4228 = new C4228(0);
                        C4228.f14023 = c4228;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new C2239(setMo5365, c4228);
    }

    @Override // p000.InterfaceC1663
    public void cancel() {
    }
}
