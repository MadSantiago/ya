package p000;

/* JADX INFO: renamed from: ۦٍۙؕؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5112 extends AbstractC0065 {

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C4995 f16957;

    public C5112(C4995 c4995) {
        this.f16957 = c4995;
    }

    @Override // p000.AbstractC0065
    /* JADX INFO: renamed from: ۥۜ */
    public final String mo6601() {
        C4206 c4206 = (C4206) this.f16957.f16534.get();
        if (c4206 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c4206.f13967 + "]";
    }
}
