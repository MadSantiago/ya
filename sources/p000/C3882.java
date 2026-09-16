package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦُُؑۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3882 {

    /* JADX INFO: renamed from: ۦِ */
    public static final Object f12972 = new Object();

    /* JADX INFO: renamed from: ۦۗ */
    public static final Object f12973 = new Object();

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC3077 f12974;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3077 f12975;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC3077 f12976;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC3077 f12977;

    /* JADX INFO: renamed from: ۥۜ */
    public volatile C4357 f12978;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f12979;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC3077 f12980;

    /* JADX INFO: renamed from: ۦٛ */
    public final Uri f12981;

    /* JADX INFO: renamed from: ۦۙ */
    public final Uri f12982;

    public C3882(Context context, InterfaceC3077 interfaceC3077, InterfaceC3077 interfaceC3078, InterfaceC3077 interfaceC3079) {
        this.f12979 = context;
        this.f12974 = interfaceC3077;
        this.f12977 = interfaceC3079;
        this.f12980 = interfaceC3078;
        Pattern pattern = AbstractC1410.f4847;
        C2813 c2813 = new C2813(context);
        c2813.m5378("phenotype_storage_info");
        c2813.m5368("storage-info.pb");
        this.f12982 = c2813.m5369();
        C2813 c2814 = new C2813(context);
        c2814.m5378("phenotype_storage_info");
        c2814.m5368("device-encrypted-storage-info.pb");
        Set set = AbstractC1410.f4848;
        AbstractC2552.m4830(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        c2814.f9389 = "directboot-files";
        this.f12981 = c2814.m5369();
        this.f12975 = AbstractC3933.m7074(new C2391(17, this));
        this.f12976 = AbstractC3933.m7074(new C3743(7, interfaceC3077));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C4357 m6951() {
        C4357 c4357M7649;
        C4357 c4357 = this.f12978;
        if (c4357 != null) {
            return c4357;
        }
        synchronized (f12972) {
            c4357M7649 = this.f12978;
            if (c4357M7649 == null) {
                c4357M7649 = C4357.m7649();
                if (AbstractC0949.m1942(this.f12979)) {
                    InterfaceC4089 interfaceC4089 = (InterfaceC4089) c4357M7649.mo554(7);
                    C2955 c2955 = C2955.f9912;
                    int i = AbstractC5529.f18251;
                    C2955 c2956 = C2955.f9911;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream inputStreamM8131 = C4773.m8131(((C4810) this.f12980.get()).m8182(this.f12982));
                        try {
                            AbstractC5212 abstractC5212M7675 = ((C4377) interfaceC4089).m7675(inputStreamM8131, c2956);
                            if (inputStreamM8131 != null) {
                                inputStreamM8131.close();
                            }
                            C4357 c4358 = (C4357) abstractC5212M7675;
                            StrictMode.setThreadPolicy(threadPolicy);
                            c4357M7649 = c4358;
                            this.f12978 = c4357M7649;
                        } catch (Throwable th) {
                            if (inputStreamM8131 != null) {
                                try {
                                    inputStreamM8131.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th3;
                    }
                }
            }
        }
        return c4357M7649;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C4471 m6952() {
        C4357 c4357M6951 = m6951();
        return new C4471(c4357M6951.m7655(), AbstractC4822.m8198(c4357M6951.m7656()), c4357M6951.m7653(), c4357M6951.m7661(), (c4357M6951.m7651() && c4357M6951.m7650().m9529() == ((long) Build.VERSION.SDK_INT)) ? c4357M6951.m7650().m9530() : "", AbstractC4822.m8198(c4357M6951.m7657()), AbstractC4822.m8198(c4357M6951.m7660()), c4357M6951.m7654(), c4357M6951.m7652(), c4357M6951.m7658(), c4357M6951.m7662());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6953() {
        if (!AbstractC0949.m1942(this.f12979) || m6951().m7663() + 86400000 >= System.currentTimeMillis()) {
            C4286 c4286 = C4286.f14174;
            return;
        }
        ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499 = (ScheduledExecutorServiceC3499) this.f12974.get();
        scheduledExecutorServiceC3499.getClass();
        InterfaceFutureC4378 interfaceFutureC4378M4791 = AbstractC2552.m4791((InterfaceFutureC4378) this.f12976.get());
        int i = AbstractC4857.f15981;
        AbstractRunnableC0022.m2771(interfaceFutureC4378M4791 instanceof AbstractC4857 ? (AbstractC4857) interfaceFutureC4378M4791 : new C5872(interfaceFutureC4378M4791), new C1019(2, this), scheduledExecutorServiceC3499);
    }
}
