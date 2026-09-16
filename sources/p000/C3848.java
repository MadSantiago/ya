package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦَؕؓؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3848 extends AbstractC0442 {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f12865;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2932 f12866;

    public C3848(InterfaceC3832 interfaceC3832, C2932 c2932) {
        super(interfaceC3832);
        this.f12866 = c2932;
    }

    @Override // p000.AbstractC0442, p000.InterfaceC3832, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f12865 = true;
            this.f12866.mo211(e);
        }
    }

    @Override // p000.AbstractC0442, p000.InterfaceC3832, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f12865 = true;
            this.f12866.mo211(e);
        }
    }

    @Override // p000.AbstractC0442, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo962(C1270 c1270, long j) {
        if (this.f12865) {
            c1270.skip(j);
            return;
        }
        try {
            super.mo962(c1270, j);
        } catch (IOException e) {
            this.f12865 = true;
            this.f12866.mo211(e);
        }
    }
}
