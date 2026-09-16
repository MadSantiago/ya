package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦٟٙؑٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4465 extends AbstractC2978 {

    /* JADX INFO: renamed from: ۥْ */
    public IOException f14722;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4162 f14723;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC2978 f14724;

    public C4465(AbstractC2978 abstractC2978) {
        this.f14724 = abstractC2978;
        this.f14723 = new C4162(new C3988(this, abstractC2978.mo3797()));
    }

    @Override // p000.AbstractC2978, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14724.close();
    }

    @Override // p000.AbstractC2978
    /* JADX INFO: renamed from: ۥۗ */
    public final C0822 mo3795() {
        return this.f14724.mo3795();
    }

    @Override // p000.AbstractC2978
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo3796() {
        return this.f14724.mo3796();
    }

    @Override // p000.AbstractC2978
    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC4473 mo3797() {
        return this.f14723;
    }
}
