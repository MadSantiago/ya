package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۥؙؓ٘۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0715 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0127 f2619;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3170 f2620;

    public C0715(C0127 c0127, C3170 c3170) {
        this.f2619 = c0127;
        this.f2620 = c3170;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        C0127 c0127 = this.f2619;
        C3170 c3170 = this.f2620;
        try {
            if (!c3170.m5850(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            while (c3170.m5850(false, this)) {
            }
            c0127.m277(1, 9, null);
            AbstractC4031.m7212(c3170);
            return C2358.f7817;
        } catch (IOException e) {
            c0127.m277(2, 2, e);
        } catch (Throwable th) {
            c0127.m277(3, 3, null);
            AbstractC4031.m7212(c3170);
            throw th;
        }
    }
}
