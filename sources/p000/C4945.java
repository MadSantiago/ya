package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦۗؑۥٕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4945 implements InterfaceC3391 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C3121 f16365;

    public C4945(C3121 c3121) {
        this.f16365 = c3121;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((InterfaceC2488) this.f16365.f10451).close();
    }

    @Override // p000.InterfaceC3391
    /* JADX INFO: renamed from: ۦٗ */
    public final Object mo6150(boolean z, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        InterfaceC2488 interfaceC2488 = (InterfaceC2488) this.f16365.f10451;
        interfaceC2488.getClass();
        return interfaceC5731.mo219(new C5733(new C0448(interfaceC2488.mo3508())), abstractC0772);
    }
}
