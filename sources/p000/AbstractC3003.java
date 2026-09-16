package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؐؗۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3003 extends C4047 {
    /* JADX INFO: renamed from: ۥۜ */
    public abstract void mo221();

    /* JADX INFO: renamed from: ۦۙ */
    public final void m5599(C4047 c4047) {
        Object c4535;
        this.f13492 = c4047.f13492;
        try {
            mo221();
            c4535 = C2358.f7817;
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Throwable thM405 = AbstractC0183.m405(c4535);
        if (thM405 != null) {
            ArrayList arrayList = C2503.f8322;
            C2503.m4657(4, "An exception occurred in " + this, thM405);
        }
    }
}
