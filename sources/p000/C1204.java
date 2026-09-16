package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۥْؓٓۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1204 extends AbstractRunnableC2435 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f4143;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ String f4144;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C3286 f4145;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204(C3286 c3286, String str, int i) {
        super(c3286, true);
        this.f4143 = i;
        switch (i) {
            case 1:
                this.f4144 = str;
                Objects.requireNonNull(c3286);
                this.f4145 = c3286;
                super(c3286, true);
                break;
            default:
                this.f4144 = str;
                Objects.requireNonNull(c3286);
                this.f4145 = c3286;
                break;
        }
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2528() {
        switch (this.f4143) {
            case 0:
                InterfaceC5122 interfaceC5122 = this.f4145.f11010;
                AbstractC0487.m1047(interfaceC5122);
                interfaceC5122.beginAdUnitExposure(this.f4144, this.f8106);
                break;
            default:
                InterfaceC5122 interfaceC5123 = this.f4145.f11010;
                AbstractC0487.m1047(interfaceC5123);
                interfaceC5123.endAdUnitExposure(this.f4144, this.f8106);
                break;
        }
    }
}
