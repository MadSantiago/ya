package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۥٓؕٙۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1285 extends AbstractRunnableC2435 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f4389;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ BinderC0902 f4390;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C3286 f4391;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1285(C3286 c3286, BinderC0902 binderC0902, int i) {
        super(c3286, true);
        this.f4389 = i;
        switch (i) {
            case 1:
                this.f4390 = binderC0902;
                Objects.requireNonNull(c3286);
                this.f4391 = c3286;
                super(c3286, true);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                this.f4390 = binderC0902;
                Objects.requireNonNull(c3286);
                this.f4391 = c3286;
                super(c3286, true);
                break;
            default:
                this.f4390 = binderC0902;
                Objects.requireNonNull(c3286);
                this.f4391 = c3286;
                break;
        }
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2714() {
        int i = this.f4389;
        BinderC0902 binderC0902 = this.f4390;
        switch (i) {
            case 0:
                binderC0902.mo1888(null);
                break;
            case 1:
                binderC0902.mo1888(null);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                binderC0902.mo1888(null);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                binderC0902.mo1888(null);
                break;
            default:
                binderC0902.mo1888(null);
                break;
        }
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2528() {
        switch (this.f4389) {
            case 0:
                InterfaceC5122 interfaceC5122 = this.f4391.f11010;
                AbstractC0487.m1047(interfaceC5122);
                interfaceC5122.getGmpAppId(this.f4390);
                break;
            case 1:
                InterfaceC5122 interfaceC5123 = this.f4391.f11010;
                AbstractC0487.m1047(interfaceC5123);
                interfaceC5123.getCachedAppInstanceId(this.f4390);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC5122 interfaceC5124 = this.f4391.f11010;
                AbstractC0487.m1047(interfaceC5124);
                interfaceC5124.generateEventId(this.f4390);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC5122 interfaceC5125 = this.f4391.f11010;
                AbstractC0487.m1047(interfaceC5125);
                interfaceC5125.getCurrentScreenName(this.f4390);
                break;
            default:
                InterfaceC5122 interfaceC5126 = this.f4391.f11010;
                AbstractC0487.m1047(interfaceC5126);
                interfaceC5126.getCurrentScreenClass(this.f4390);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1285(C3286 c3286, BinderC0902 binderC0902, int i, boolean z) {
        super(c3286, true);
        this.f4389 = i;
        this.f4390 = binderC0902;
        this.f4391 = c3286;
    }
}
