package p000;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۦؘٕؑؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3465 {

    /* JADX INFO: renamed from: ۥؗ */
    public static C3465 f11496;

    /* JADX INFO: renamed from: ۥۗ */
    public static final PorterDuff.Mode f11497 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۥۣ */
    public C0141 f11498;

    /* JADX INFO: renamed from: ۥؗ */
    public static synchronized void m6240() {
        if (f11496 == null) {
            C3465 c3465 = new C3465();
            f11496 = c3465;
            c3465.f11498 = C0141.m304();
            C0141 c0141 = f11496.f11498;
            C2813 c2813 = new C2813(0);
            synchronized (c0141) {
                c0141.f558 = c2813;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static synchronized C3465 m6241() {
        try {
            if (f11496 == null) {
                m6240();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11496;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final synchronized Drawable m6242(Context context, int i) {
        return this.f11498.m311(context, i);
    }
}
