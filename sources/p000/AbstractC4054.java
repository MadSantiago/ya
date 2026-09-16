package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦُّ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4054 implements InterfaceC4598 {

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC4598 f13513;

    public AbstractC4054(InterfaceC4598 interfaceC4598) {
        this.f13513 = interfaceC4598;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13513.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f13513 + ')';
    }

    @Override // p000.InterfaceC4598, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f13513.mo961();
    }
}
