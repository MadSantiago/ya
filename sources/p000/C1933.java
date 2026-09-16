package p000;

/* JADX INFO: renamed from: ۥْۣٞؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1933 extends AbstractC2978 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f6389;

    /* JADX INFO: renamed from: ۦۨ */
    public final C0822 f6390;

    public C1933(C0822 c0822, long j) {
        this.f6390 = c0822;
        this.f6389 = j;
    }

    @Override // p000.AbstractC2978
    /* JADX INFO: renamed from: ۥۗ */
    public final C0822 mo3795() {
        return this.f6390;
    }

    @Override // p000.AbstractC2978
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo3796() {
        return this.f6389;
    }

    @Override // p000.AbstractC2978
    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC4473 mo3797() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
