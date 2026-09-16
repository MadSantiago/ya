package p000;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۥؐۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0161 implements InterfaceC0985, InterfaceC3515 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC2090 f612;

    /* JADX INFO: renamed from: ۥُ */
    public final Executor f613;

    /* JADX INFO: renamed from: ۥۗ */
    public final Context f614;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0916 f615;

    /* JADX INFO: renamed from: ۦؑ */
    public final Set f616;

    public C0161(Context context, String str, Set set, InterfaceC2090 interfaceC2090, Executor executor) {
        this.f615 = new C0916(new C2200(1, context, str));
        this.f616 = set;
        this.f613 = executor;
        this.f612 = interfaceC2090;
        this.f614 = context;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m343() {
        if (this.f616.size() <= 0) {
            AbstractC5378.m9075(null);
        } else if (!AbstractC2552.m4827(this.f614)) {
            AbstractC5378.m9075(null);
        } else {
            AbstractC5378.m9039(this.f613, new CallableC5145(this, 1));
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C3580 m344() {
        if (!AbstractC2552.m4827(this.f614)) {
            return AbstractC5378.m9075("");
        }
        return AbstractC5378.m9039(this.f613, new CallableC5145(this, 0));
    }
}
