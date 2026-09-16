package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۦَؗٔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3866 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3866 f12897;

    /* JADX INFO: renamed from: ۥۣ */
    public C0272 f12898;

    static {
        C3866 c3866 = new C3866();
        c3866.f12898 = null;
        f12897 = c3866;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0272 m6899(Context context) {
        C0272 c0272;
        C3866 c3866 = f12897;
        synchronized (c3866) {
            try {
                c0272 = c3866.f12898;
                if (c0272 == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0272 = new C0272(context, 1);
                    c3866.f12898 = c0272;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0272;
    }
}
