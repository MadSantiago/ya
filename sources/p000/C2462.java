package p000;

/* JADX INFO: renamed from: ۥُُ۟ؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2462 {

    /* JADX INFO: renamed from: ۥّ */
    public static final Object f8219 = new Object();

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f8220;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC1539 f8222;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f8223;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f8224 = new Object();

    /* JADX INFO: renamed from: ۥُ */
    public volatile Object f8221 = null;

    public /* synthetic */ C2462(String str, Object obj, InterfaceC1539 interfaceC1539) {
        this.f8223 = str;
        this.f8220 = obj;
        this.f8222 = interfaceC1539;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m4592(Object obj) {
        synchronized (this.f8224) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC2774.f9247 == null) {
            return this.f8220;
        }
        synchronized (f8219) {
            try {
                if (C4452.m7739()) {
                    return this.f8221 == null ? this.f8220 : this.f8221;
                }
                try {
                    for (C2462 c2462 : AbstractC4936.f16299) {
                        if (C4452.m7739()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objMo3292 = null;
                        try {
                            InterfaceC1539 interfaceC1539 = c2462.f8222;
                            if (interfaceC1539 != null) {
                                objMo3292 = interfaceC1539.mo3292();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f8219) {
                            c2462.f8221 = objMo3292;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC1539 interfaceC15310 = this.f8222;
                if (interfaceC15310 != null) {
                    try {
                        return interfaceC15310.mo3292();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f8220;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
