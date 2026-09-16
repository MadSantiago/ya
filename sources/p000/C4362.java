package p000;

/* JADX INFO: renamed from: ۦٗؔؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4362 extends AbstractC2265 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f14366;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4362(InterfaceC0103 interfaceC0103, int i) {
        super(interfaceC0103);
        this.f14366 = i;
    }

    @Override // p000.InterfaceC0103
    /* JADX INFO: renamed from: ۥۗ */
    public final String mo186() {
        switch (this.f14366) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
