package p000;

/* JADX INFO: renamed from: ۥًِؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0815 extends AbstractRunnableC1169 {

    /* JADX INFO: renamed from: ۥْ */
    public final C2600 f2902;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ AbstractC5596 f2903;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815(AbstractC5596 abstractC5596, long j, C2600 c2600) {
        super(j);
        this.f2903 = abstractC5596;
        this.f2902 = c2600;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2902.m4901(this.f2903);
    }

    @Override // p000.AbstractRunnableC1169
    public final String toString() {
        return super.toString() + this.f2902;
    }
}
