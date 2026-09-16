package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦٌَؑٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3696 extends AbstractRunnableC2435 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f12328 = 0;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ String f12329;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ Object f12330;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ String f12331;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C3286 f12332;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3696(C3286 c3286, C3156 c3156, String str, String str2) {
        super(c3286, true);
        this.f12330 = c3156;
        this.f12329 = str;
        this.f12331 = str2;
        Objects.requireNonNull(c3286);
        this.f12332 = c3286;
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۗ */
    public void mo2714() {
        switch (this.f12328) {
            case 0:
                ((BinderC0902) this.f12330).mo1888(null);
                break;
        }
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2528() {
        switch (this.f12328) {
            case 0:
                InterfaceC5122 interfaceC5122 = this.f12332.f11010;
                AbstractC0487.m1047(interfaceC5122);
                interfaceC5122.getConditionalUserProperties(this.f12329, this.f12331, (BinderC0902) this.f12330);
                break;
            default:
                InterfaceC5122 interfaceC5123 = this.f12332.f11010;
                AbstractC0487.m1047(interfaceC5123);
                interfaceC5123.setCurrentScreenByScionActivityInfo((C3156) this.f12330, this.f12329, this.f12331, this.f8107);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3696(C3286 c3286, String str, String str2, BinderC0902 binderC0902) {
        super(c3286, true);
        this.f12329 = str;
        this.f12331 = str2;
        this.f12330 = binderC0902;
        this.f12332 = c3286;
    }
}
