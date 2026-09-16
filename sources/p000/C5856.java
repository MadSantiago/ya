package p000;

/* JADX INFO: renamed from: ۦۨؑٗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5856 extends AbstractC4804 {

    /* JADX INFO: renamed from: ۥَ */
    public volatile boolean f19340;

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean f19341;

    public C5856(String str, C3225 c3225, boolean z) {
        super(str, c3225);
        this.f19341 = z;
    }

    @Override // p000.AbstractC4804
    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ Object mo6417(Object obj) {
        return (Boolean) obj;
    }

    @Override // p000.AbstractC4804
    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ void mo6418(Object obj) {
        this.f19340 = ((Boolean) obj).booleanValue();
    }

    @Override // p000.AbstractC4804
    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object mo6419(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // p000.AbstractC4804
    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ Object mo6420() {
        return Boolean.valueOf(this.f19341);
    }

    @Override // p000.AbstractC4804
    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ Object mo6421() {
        return Boolean.valueOf(this.f19340);
    }
}
