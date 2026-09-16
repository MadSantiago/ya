package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۥۜؗٛٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2408 implements InterfaceC4598 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2186 f8018;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f8019;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2347 f8020;

    public AbstractC2408(C2186 c2186) {
        this.f8018 = c2186;
        this.f8020 = new C2347(((InterfaceC4473) c2186.f7251).mo961());
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public long mo406(C1270 c1270, long j) throws IOException {
        C2186 c2186 = this.f8018;
        try {
            return ((InterfaceC4473) c2186.f7251).mo406(c1270, j);
        } catch (IOException e) {
            ((C3641) c2186.f7246).m6511();
            m4532();
            throw e;
        }
    }

    @Override // p000.InterfaceC4598, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f8020;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4532() {
        C2186 c2186 = this.f8018;
        int i = c2186.f7250;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + c2186.f7250);
        }
        C2347 c2347 = this.f8020;
        C2014 c2014 = c2347.f7788;
        c2347.f7788 = C2014.f6633;
        c2014.mo3921();
        c2014.mo3920();
        c2186.f7250 = 6;
    }
}
