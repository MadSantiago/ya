package p000;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: ۦٍٙؖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4501 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5002 f14876;

    /* JADX INFO: renamed from: ۥُ */
    public final C5001 f14877;

    /* JADX INFO: renamed from: ۥّ */
    public final Looper f14878;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f14879;

    /* JADX INFO: renamed from: ۥۜ */
    public final C1298 f14880;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f14881;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC2601 f14882;

    /* JADX INFO: renamed from: ۦٛ */
    public final C4085 f14883;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f14884;

    public AbstractC4501(Context context, C5002 c5002, InterfaceC2601 interfaceC2601, C1540 c1540) {
        AbstractC0487.m1048(context, "Null context is not permitted.");
        AbstractC0487.m1048(c5002, "Api must not be null.");
        AbstractC0487.m1048(c1540, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC0487.m1048(applicationContext, "The provided context did not have an application context.");
        this.f14881 = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f14879 = attributionTag;
        this.f14876 = c5002;
        this.f14882 = interfaceC2601;
        this.f14878 = c1540.f5215;
        this.f14877 = new C5001(c5002, interfaceC2601, attributionTag);
        C4085 c4085M7272 = C4085.m7272(applicationContext);
        this.f14883 = c4085M7272;
        this.f14884 = c4085M7272.f13630.getAndIncrement();
        this.f14880 = c1540.f5216;
        HandlerC0645 handlerC0645 = c4085M7272.f13634;
        handlerC0645.sendMessage(handlerC0645.obtainMessage(7, this));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C3580 m7829(int i, C5470 c5470) {
        C2332 c2332 = new C2332();
        C4085 c4085 = this.f14883;
        c4085.getClass();
        C4129 c4129 = new C4129(new C2223(i, c5470, c2332, this.f14880), c4085.f13636.get(), this);
        HandlerC0645 handlerC0645 = c4085.f13634;
        handlerC0645.sendMessage(handlerC0645.obtainMessage(4, c4129));
        return c2332.f7721;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2808 m7830() {
        C2808 c2808 = new C2808(7, false);
        Set set = Collections.EMPTY_SET;
        C1821 c1821 = (C1821) c2808.f9378;
        if (c1821 == null) {
            c1821 = new C1821(0);
            c2808.f9378 = c1821;
        }
        c1821.addAll(set);
        Context context = this.f14881;
        c2808.f9377 = context.getClass().getName();
        c2808.f9376 = context.getPackageName();
        return c2808;
    }
}
