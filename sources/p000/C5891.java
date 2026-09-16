package p000;

/* JADX INFO: renamed from: ۦِۨؖؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5891 extends AbstractC4435 {
    public final String toString() {
        C3108 c3108 = this.f14621;
        if (c3108 == null || c3108.f10423 <= 0) {
            return "<" + m7734() + ">";
        }
        return "<" + m7734() + " " + this.f14621.toString() + ">";
    }

    @Override // p000.AbstractC4435, p000.AbstractC4294
    /* JADX INFO: renamed from: ۦؑ */
    public final /* bridge */ /* synthetic */ AbstractC4294 mo975() {
        mo975();
        return this;
    }

    @Override // p000.AbstractC4435
    /* JADX INFO: renamed from: ۦٌ */
    public final AbstractC4435 mo975() {
        super.mo975();
        this.f14621 = new C3108();
        return this;
    }
}
