package p000;

/* JADX INFO: renamed from: ۦؙؐؕۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2984 extends UnsupportedOperationException {

    /* JADX INFO: renamed from: ۦۨ */
    public final C2274 f10036;

    public C2984(C2274 c2274) {
        this.f10036 = c2274;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f10036));
    }
}
