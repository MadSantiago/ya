package p000;

/* JADX INFO: renamed from: ۦَۖؗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4930 {

    /* JADX INFO: renamed from: ۥؗ */
    public int f16243 = -1;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f16244;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5086 f16245;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ C3543 f16246;

    public C4930(C3543 c3543, C5086 c5086) {
        this.f16246 = c3543;
        this.f16245 = c5086;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8321(boolean z) {
        if (z == this.f16244) {
            return;
        }
        this.f16244 = z;
        int i = z ? 1 : -1;
        C3543 c3543 = this.f16246;
        int i2 = c3543.f11762;
        c3543.f11762 = i + i2;
        if (!c3543.f11768) {
            c3543.f11768 = true;
            while (true) {
                try {
                    int i3 = c3543.f11762;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } catch (Throwable th) {
                    c3543.f11768 = false;
                    throw th;
                }
            }
            c3543.f11768 = false;
        }
        if (this.f16244) {
            c3543.m6344(this);
        }
    }
}
