package p000;

import java.io.File;

/* JADX INFO: renamed from: ۥۜؖۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2400 extends AbstractC1237 {

    /* JADX INFO: renamed from: ۥَ */
    public C5051 f7987;

    /* JADX INFO: renamed from: ۥْ */
    public InterfaceC4473 f7988;

    /* JADX INFO: renamed from: ۥٓ */
    public InterfaceC4448 f7989;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f7990;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC3925 f7991;

    public C2400(InterfaceC4473 interfaceC4473, InterfaceC4448 interfaceC4448, AbstractC3925 abstractC3925) {
        this.f7991 = abstractC3925;
        this.f7988 = interfaceC4473;
        this.f7989 = interfaceC4448;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f7990 = true;
            InterfaceC4473 interfaceC4473 = this.f7988;
            if (interfaceC4473 != null) {
                AbstractC0080.m7960(interfaceC4473);
            }
            C5051 c5051 = this.f7987;
            if (c5051 != null) {
                AbstractC1567.f5283.mo1567(c5051);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.AbstractC1237
    /* JADX INFO: renamed from: ۥَ */
    public final synchronized InterfaceC4473 mo2610() {
        if (this.f7990) {
            throw new IllegalStateException("closed");
        }
        InterfaceC4473 interfaceC4473 = this.f7988;
        if (interfaceC4473 != null) {
            return interfaceC4473;
        }
        C4162 c4162 = new C4162(AbstractC1567.f5283.mo1570(this.f7987));
        this.f7988 = c4162;
        return c4162;
    }

    @Override // p000.AbstractC1237
    /* JADX INFO: renamed from: ۥۗ */
    public final synchronized C5051 mo2611() {
        if (this.f7990) {
            throw new IllegalStateException("closed");
        }
        return this.f7987;
    }

    @Override // p000.AbstractC1237
    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized C5051 mo2612() {
        if (this.f7990) {
            throw new IllegalStateException("closed");
        }
        C5051 c5051 = this.f7987;
        if (c5051 != null) {
            return c5051;
        }
        File file = (File) this.f7989.mo449();
        if (!file.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        String str = C5051.f16766;
        C5051 c5051M8379 = C4992.m8379(File.createTempFile("tmp", null, file));
        C5025 c5025 = new C5025(AbstractC1567.f5283.mo1568(c5051M8379));
        try {
            InterfaceC4473 interfaceC4473 = this.f7988;
            while (interfaceC4473.mo406(c5025.f16635, 8192L) != -1) {
                c5025.m8443();
            }
            try {
                c5025.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                c5025.close();
            } catch (Throwable th3) {
                AbstractC5537.m9223(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
        this.f7988 = null;
        this.f7987 = c5051M8379;
        this.f7989 = null;
        return c5051M8379;
    }

    @Override // p000.AbstractC1237
    /* JADX INFO: renamed from: ۦ۟ */
    public final AbstractC3925 mo2613() {
        return this.f7991;
    }
}
