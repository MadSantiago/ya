package p000;

/* JADX INFO: renamed from: ۥٓؒٓ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1253 extends C5470 {

    /* JADX INFO: renamed from: ۥّ */
    public final CallableC3360 f4314;

    public /* synthetic */ C1253(CallableC3360 callableC3360) {
        super(0, null, null, false);
        this.f4314 = callableC3360;
    }

    @Override // p000.C5470
    /* JADX INFO: renamed from: ۦۙ */
    public final String mo2648() {
        try {
            return (String) this.f4314.call();
        } catch (Exception e) {
            C5028.m8450(e);
            return null;
        }
    }
}
