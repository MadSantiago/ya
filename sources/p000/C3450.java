package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦٌٍؘؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3450 extends AbstractC2408 {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f11459;

    /* JADX INFO: renamed from: ۥٓ */
    public long f11460;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C2186 f11461;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3450(C2186 c2186, C0774 c0774) {
        super(c2186);
        this.f11461 = c2186;
        this.f11460 = -1L;
        this.f11459 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM7230;
        if (this.f8019) {
            return;
        }
        if (this.f11459) {
            try {
                zM7230 = AbstractC4031.m7230(this, 100);
            } catch (IOException unused) {
                zM7230 = false;
            }
            if (!zM7230) {
                ((C3641) this.f11461.f7246).m6511();
                m4532();
            }
        }
        this.f8019 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r9.f11459 == false) goto L27;
     */
    @Override // p000.AbstractC2408, p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo406(p000.C1270 r10, long r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3450.mo406(ۥٓؓۘؓ, long):long");
    }
}
