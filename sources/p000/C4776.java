package p000;

import android.app.Activity;

/* JADX INFO: renamed from: ۦٝۨؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4776 extends AbstractRunnableC2435 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f15749;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Activity f15750;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C3183 f15751;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4776(C3183 c3183, Activity activity, int i) {
        super((C3286) c3183.f10690, true);
        this.f15749 = i;
        switch (i) {
            case 1:
                this.f15750 = activity;
                this.f15751 = c3183;
                super((C3286) c3183.f10690, true);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                this.f15750 = activity;
                this.f15751 = c3183;
                super((C3286) c3183.f10690, true);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                this.f15750 = activity;
                this.f15751 = c3183;
                super((C3286) c3183.f10690, true);
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                this.f15750 = activity;
                this.f15751 = c3183;
                super((C3286) c3183.f10690, true);
                break;
            default:
                this.f15750 = activity;
                this.f15751 = c3183;
                break;
        }
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2528() {
        switch (this.f15749) {
            case 0:
                InterfaceC5122 interfaceC5122 = ((C3286) this.f15751.f10690).f11010;
                AbstractC0487.m1047(interfaceC5122);
                interfaceC5122.onActivityStartedByScionActivityInfo(C3156.m5837(this.f15750), this.f8106);
                break;
            case 1:
                InterfaceC5122 interfaceC5123 = ((C3286) this.f15751.f10690).f11010;
                AbstractC0487.m1047(interfaceC5123);
                interfaceC5123.onActivityResumedByScionActivityInfo(C3156.m5837(this.f15750), this.f8106);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC5122 interfaceC5124 = ((C3286) this.f15751.f10690).f11010;
                AbstractC0487.m1047(interfaceC5124);
                interfaceC5124.onActivityPausedByScionActivityInfo(C3156.m5837(this.f15750), this.f8106);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC5122 interfaceC5125 = ((C3286) this.f15751.f10690).f11010;
                AbstractC0487.m1047(interfaceC5125);
                interfaceC5125.onActivityStoppedByScionActivityInfo(C3156.m5837(this.f15750), this.f8106);
                break;
            default:
                InterfaceC5122 interfaceC5126 = ((C3286) this.f15751.f10690).f11010;
                AbstractC0487.m1047(interfaceC5126);
                interfaceC5126.onActivityDestroyedByScionActivityInfo(C3156.m5837(this.f15750), this.f8106);
                break;
        }
    }
}
