package p000;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: ۦٍؚؖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3616 {

    /* JADX INFO: renamed from: ۥۗ */
    public static Boolean f12050;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4216 f12051 = new C4216(1, new C0062(15));

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean m6445(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean boolValueOf = f12050;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                f12050 = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m6446(final C1249 c1249, final C3564 c3564, final InterfaceC4434 interfaceC4434, final List list, C5362 c5362) {
        Executor executor = (Executor) c5362.m8997(f12051);
        if (executor == null || !m6445(c1249.f4307.length())) {
            c5362.m8957(-517090505);
            c5362.m9009(false);
            return;
        }
        c5362.m8957(-518737659);
        final EnumC2459 enumC2459 = (EnumC2459) c5362.m8997(AbstractC2853.f9555);
        final InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
        try {
            executor.execute(new Runnable() { // from class: ۦۧؗۛۤ
                @Override // java.lang.Runnable
                public final void run() {
                    C5038 c5038Mo4466;
                    C3564 c3565 = c3564;
                    EnumC2459 enumC24510 = enumC2459;
                    C1249 c12410 = c1249;
                    InterfaceC2880 interfaceC2881 = interfaceC2880;
                    InterfaceC4434 interfaceC4435 = interfaceC4434;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
                        C5038 c5038 = abstractC3191M3278 instanceof C5038 ? (C5038) abstractC3191M3278 : null;
                        if (c5038 == null || (c5038Mo4466 = c5038.mo4466(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            AbstractC3191 abstractC3191M5883 = c5038Mo4466.m5883();
                            try {
                                C3564 c3564M9238 = AbstractC5537.m9238(c3565, enumC24510);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = C2340.f7777;
                                }
                                C1414 c1414 = new C1414(c12410, c3564M9238, list2, interfaceC2881, interfaceC4435);
                                c1414.mo2987();
                                c1414.mo2999();
                                AbstractC3191.m5876(abstractC3191M5883);
                                c5038Mo4466.mo2658().mo8225();
                                c5038Mo4466.mo2657();
                                Trace.endSection();
                            } catch (Throwable th) {
                                AbstractC3191.m5876(abstractC3191M5883);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                c5038Mo4466.mo2657();
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        c5362.m9009(false);
    }
}
