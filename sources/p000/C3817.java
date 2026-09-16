package p000;

/* JADX INFO: renamed from: ۦَۣؑؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3817 extends AbstractC4804 {

    /* JADX INFO: renamed from: ۥَ */
    public volatile long f12645;

    /* JADX INFO: renamed from: ۥٖ */
    public final long f12646;

    public C3817(String str, C3225 c3225, long j) {
        super(str, c3225);
        this.f12646 = j;
    }

    @Override // p000.AbstractC4804
    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ Object mo6417(Object obj) {
        return (Long) obj;
    }

    @Override // p000.AbstractC4804
    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ void mo6418(Object obj) {
        this.f12645 = ((Long) obj).longValue();
    }

    @Override // p000.AbstractC4804
    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object mo6419(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // p000.AbstractC4804
    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ Object mo6420() {
        return Long.valueOf(this.f12646);
    }

    @Override // p000.AbstractC4804
    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ Object mo6421() {
        return Long.valueOf(this.f12645);
    }
}
