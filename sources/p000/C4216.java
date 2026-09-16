package p000;

/* JADX INFO: renamed from: ۦٕۣؒٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4216 extends AbstractC2266 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f13993;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4216(int i, InterfaceC4448 interfaceC4448) {
        super(interfaceC4448);
        this.f13993 = i;
    }

    @Override // p000.AbstractC2266
    /* JADX INFO: renamed from: ۥۣ */
    public final C3467 mo4313(Object obj) {
        switch (this.f13993) {
            case 0:
                return new C3467(this, obj, obj == null, C1298.f4439, true);
            default:
                return new C3467(this, obj, obj == null, null, false);
        }
    }
}
