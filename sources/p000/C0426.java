package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۥْؔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0426 extends AbstractC3496 {

    /* JADX INFO: renamed from: ۥٓ */
    public final C4819 f1540;

    public C0426(C0956 c0956, String str) {
        super(c0956, str);
        this.f1540 = c0956.m1988(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1540.close();
        this.f11598 = true;
    }

    @Override // p000.InterfaceC0252
    public final byte[] getBlob(int i) {
        m6286();
        C4773.m8154(21, "no row");
        throw null;
    }

    @Override // p000.InterfaceC0252
    public final int getColumnCount() {
        m6286();
        return 0;
    }

    @Override // p000.InterfaceC0252
    public final String getColumnName(int i) {
        m6286();
        C4773.m8154(21, "no row");
        throw null;
    }

    @Override // p000.InterfaceC0252
    public final long getLong(int i) {
        m6286();
        C4773.m8154(21, "no row");
        throw null;
    }

    @Override // p000.InterfaceC0252
    public final boolean isNull(int i) {
        m6286();
        C4773.m8154(21, "no row");
        throw null;
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo530(int i, String str) {
        m6286();
        this.f1540.mo1233(i, str);
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo531(int i) {
        m6286();
        this.f1540.mo1231(i);
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۥُ */
    public final void mo532(long j, int i) {
        m6286();
        this.f1540.mo1232(j, i);
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۦؗ */
    public final boolean mo533() {
        m6286();
        this.f1540.f15880.execute();
        return false;
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo534(int i) {
        m6286();
        C4773.m8154(21, "no row");
        throw null;
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo535(int i, byte[] bArr) {
        m6286();
        this.f1540.mo1234(i, bArr);
    }

    @Override // p000.InterfaceC0252
    public final void reset() {
    }
}
