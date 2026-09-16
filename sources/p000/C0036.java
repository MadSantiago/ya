package p000;

/* JADX INFO: renamed from: ۥۘ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0036 extends AbstractC5537 {
    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۥۤ */
    public final void mo4163(C0083 c0083, C0083 c0084) {
        c0083.f15753 = c0084;
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۥۦ */
    public final C0083 mo4164(AbstractC0032 abstractC0032) {
        C0083 c0083;
        C0083 c0084 = C0083.f15752;
        synchronized (abstractC0032) {
            try {
                c0083 = abstractC0032.f6337;
                if (c0083 != c0084) {
                    abstractC0032.f6337 = c0084;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0083;
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦؒ */
    public final void mo4165(C0083 c0083, Thread thread) {
        c0083.f15754 = thread;
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦؖ */
    public final C0050 mo4166(AbstractC0032 abstractC0032) {
        C0050 c0050;
        C0050 c0051 = C0050.f9656;
        synchronized (abstractC0032) {
            try {
                c0050 = abstractC0032.f6338;
                if (c0050 != c0051) {
                    abstractC0032.f6338 = c0051;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0050;
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo4167(AbstractC0032 abstractC0032, Object obj, Object obj2) {
        synchronized (abstractC0032) {
            try {
                if (abstractC0032.f6339 != obj) {
                    return false;
                }
                abstractC0032.f6339 = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦٌ */
    public final boolean mo4168(AbstractC0032 abstractC0032, C0083 c0083, C0083 c0084) {
        synchronized (abstractC0032) {
            try {
                if (abstractC0032.f6337 != c0083) {
                    return false;
                }
                abstractC0032.f6337 = c0084;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC5537
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo4169(AbstractC0032 abstractC0032, C0050 c0050, C0050 c0051) {
        synchronized (abstractC0032) {
            try {
                if (abstractC0032.f6338 != c0050) {
                    return false;
                }
                abstractC0032.f6338 = c0051;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
