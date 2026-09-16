package p000;

/* JADX INFO: renamed from: ۥۛؕۧ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2332 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3580 f7721 = new C3580();

    public C2332(C1039 c1039) {
        ((C3580) c1039.f3672).m6389(AbstractC4007.f13360, new C2391(c1039, new C2391(18, this)));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4374(Object obj) {
        this.f7721.m6397(obj);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4375(Exception exc) {
        C3580 c3580 = this.f7721;
        c3580.getClass();
        AbstractC0487.m1048(exc, "Exception must not be null");
        synchronized (c3580.f11912) {
            try {
                if (c3580.f11908) {
                    return;
                }
                c3580.f11908 = true;
                c3580.f11910 = exc;
                c3580.f11911.m9162(c3580);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C2332() {
    }
}
