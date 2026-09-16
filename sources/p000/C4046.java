package p000;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦّؖۘٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4046 {

    /* JADX INFO: renamed from: ۥُ */
    public static volatile C4836 f13487;

    /* JADX INFO: renamed from: ۥؗ */
    public final C1934 f13488;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC5375 f13489;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5375 f13490;

    /* JADX INFO: renamed from: ۦؑ */
    public final C0474 f13491;

    public C4046(InterfaceC5375 interfaceC5375, InterfaceC5375 interfaceC5376, C1934 c1934, C0474 c0474, C1489 c1489) {
        this.f13490 = interfaceC5375;
        this.f13489 = interfaceC5376;
        this.f13488 = c1934;
        this.f13491 = c0474;
        ((Executor) c1489.f5059).execute(new RunnableC0029(24, c1489));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m7244(Context context) {
        if (f13487 == null) {
            synchronized (C4046.class) {
                try {
                    if (f13487 == null) {
                        C0272 c0272 = new C0272();
                        context.getClass();
                        c0272.f972 = context;
                        f13487 = c0272.m565();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C4046 m7245() {
        C4836 c4836 = f13487;
        if (c4836 != null) {
            return (C4046) c4836.f15927.get();
        }
        C1078.m2276("Not initialized!");
        return null;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C5749 m7246(C3518 c3518) {
        byte[] bytes;
        Set setUnmodifiableSet = c3518 instanceof C3518 ? Collections.unmodifiableSet(C3518.f11651) : Collections.singleton(new C1329("proto"));
        C2808 c2808M2865 = C1360.m2865();
        c3518.getClass();
        c2808M2865.f9376 = "cct";
        String str = c3518.f11653;
        String str2 = c3518.f11652;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        c2808M2865.f9378 = bytes;
        return new C5749(setUnmodifiableSet, c2808M2865.m5345(), this);
    }
}
