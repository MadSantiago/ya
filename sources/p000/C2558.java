package p000;

/* JADX INFO: renamed from: ۥًۡؔٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2558 implements InterfaceC3832 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2186 f8534;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f8535;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2347 f8536;

    public C2558(C2186 c2186) {
        this.f8534 = c2186;
        this.f8536 = new C2347(((InterfaceC2674) c2186.f7247).mo961());
    }

    @Override // p000.InterfaceC3832, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f8535) {
            return;
        }
        this.f8535 = true;
        ((InterfaceC2674) this.f8534.f7247).mo2660("0\r\n\r\n");
        C2347 c2347 = this.f8536;
        C2014 c2014 = c2347.f7788;
        c2347.f7788 = C2014.f6633;
        c2014.mo3921();
        c2014.mo3920();
        this.f8534.f7250 = 3;
    }

    @Override // p000.InterfaceC3832, java.io.Flushable
    public final synchronized void flush() {
        if (this.f8535) {
            return;
        }
        ((InterfaceC2674) this.f8534.f7247).flush();
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f8536;
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo962(C1270 c1270, long j) {
        InterfaceC2674 interfaceC2674 = (InterfaceC2674) this.f8534.f7247;
        if (this.f8535) {
            C1078.m2276("closed");
        } else {
            if (j == 0) {
                return;
            }
            interfaceC2674.mo2692(j);
            interfaceC2674.mo2660("\r\n");
            interfaceC2674.mo962(c1270, j);
            interfaceC2674.mo2660("\r\n");
        }
    }
}
