package p000;

import java.io.Closeable;

/* JADX INFO: renamed from: ۥٚؑٔۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1702 implements Closeable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0992 f5667;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f5668;

    /* JADX INFO: renamed from: ۦۨ */
    public final C1959 f5669;

    public C1702(C0992 c0992, C1959 c1959) {
        this.f5667 = c0992;
        this.f5669 = c1959;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5668) {
            return;
        }
        this.f5668 = true;
        C0992 c0992 = this.f5667;
        synchronized (c0992) {
            C1959 c1959 = this.f5669;
            int i = c1959.f6459 - 1;
            c1959.f6459 = i;
            if (i == 0 && c1959.f6457) {
                C5009 c5009 = C0992.f3519;
                c0992.m2118(c1959);
            }
        }
    }
}
