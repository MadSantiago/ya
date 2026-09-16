package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦؙِؗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3988 extends AbstractC4054 {

    /* JADX INFO: renamed from: ۥْ */
    public Object f13314;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f13315 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3988(C4465 c4465, InterfaceC4473 interfaceC4473) {
        super(interfaceC4473);
        this.f13314 = c4465;
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) throws Exception {
        int i = this.f13315;
        InterfaceC4598 interfaceC4598 = this.f13513;
        switch (i) {
            case 0:
                try {
                    return interfaceC4598.mo406(c1270, j);
                } catch (Exception e) {
                    this.f13314 = e;
                    throw e;
                }
            default:
                try {
                    return interfaceC4598.mo406(c1270, j);
                } catch (IOException e2) {
                    ((C4465) this.f13314).f14722 = e2;
                    throw e2;
                }
        }
    }

    public /* synthetic */ C3988(InterfaceC4598 interfaceC4598) {
        super(interfaceC4598);
    }
}
