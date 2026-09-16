package p000;

import java.io.Closeable;

/* JADX INFO: renamed from: ۦٞؕٓۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4798 extends AbstractC1237 {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f15824;

    /* JADX INFO: renamed from: ۥْ */
    public final String f15825;

    /* JADX INFO: renamed from: ۥٓ */
    public final Closeable f15826;

    /* JADX INFO: renamed from: ۥٖ */
    public C4162 f15827;

    /* JADX INFO: renamed from: ۦ۟ */
    public final AbstractC1567 f15828;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5051 f15829;

    public C4798(C5051 c5051, AbstractC1567 abstractC1567, String str, Closeable closeable) {
        this.f15829 = c5051;
        this.f15828 = abstractC1567;
        this.f15825 = str;
        this.f15826 = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f15824 = true;
            C4162 c4162 = this.f15827;
            if (c4162 != null) {
                AbstractC0080.m7960(c4162);
            }
            Closeable closeable = this.f15826;
            if (closeable != null) {
                AbstractC0080.m7960(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.AbstractC1237
    /* JADX INFO: renamed from: ۥَ */
    public final synchronized InterfaceC4473 mo2610() {
        if (this.f15824) {
            throw new IllegalStateException("closed");
        }
        C4162 c4162 = this.f15827;
        if (c4162 != null) {
            return c4162;
        }
        C4162 c4163 = new C4162(this.f15828.mo1570(this.f15829));
        this.f15827 = c4163;
        return c4163;
    }

    @Override // p000.AbstractC1237
    /* JADX INFO: renamed from: ۥۗ */
    public final C5051 mo2611() {
        return mo2612();
    }

    @Override // p000.AbstractC1237
    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized C5051 mo2612() {
        if (this.f15824) {
            throw new IllegalStateException("closed");
        }
        return this.f15829;
    }

    @Override // p000.AbstractC1237
    /* JADX INFO: renamed from: ۦ۟ */
    public final AbstractC3925 mo2613() {
        return null;
    }
}
