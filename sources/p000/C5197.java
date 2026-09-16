package p000;

/* JADX INFO: renamed from: ۦۚؗؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5197 implements InterfaceC3832 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2186 f17188;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f17189;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2347 f17190;

    public C5197(C2186 c2186) {
        this.f17188 = c2186;
        this.f17190 = new C2347(((InterfaceC2674) c2186.f7247).mo961());
    }

    @Override // p000.InterfaceC3832, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17189) {
            return;
        }
        this.f17189 = true;
        C2347 c2347 = this.f17190;
        C2014 c2014 = c2347.f7788;
        c2347.f7788 = C2014.f6633;
        c2014.mo3921();
        c2014.mo3920();
        this.f17188.f7250 = 3;
    }

    @Override // p000.InterfaceC3832, java.io.Flushable
    public final void flush() {
        if (this.f17189) {
            return;
        }
        ((InterfaceC2674) this.f17188.f7247).flush();
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f17190;
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo962(C1270 c1270, long j) {
        if (this.f17189) {
            C1078.m2276("closed");
        } else {
            AbstractC4031.m7219(c1270.f4340, 0L, j);
            ((InterfaceC2674) this.f17188.f7247).mo962(c1270, j);
        }
    }
}
