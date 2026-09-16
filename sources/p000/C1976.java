package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: ۥؘؚٞؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1976 extends AbstractRunnableC2435 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f6535;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C3286 f6536;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f6537;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1976(C3286 c3286, Boolean bool) {
        super(c3286, true);
        this.f6535 = 1;
        this.f6537 = bool;
        Objects.requireNonNull(c3286);
        this.f6536 = c3286;
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2528() {
        switch (this.f6535) {
            case 0:
                InterfaceC5122 interfaceC5122 = this.f6536.f11010;
                AbstractC0487.m1047(interfaceC5122);
                interfaceC5122.setConditionalUserProperty((Bundle) this.f6537, this.f8107);
                break;
            case 1:
                InterfaceC5122 interfaceC5123 = this.f6536.f11010;
                AbstractC0487.m1047(interfaceC5123);
                interfaceC5123.setMeasurementEnabled(((Boolean) this.f6537).booleanValue(), this.f8107);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC5122 interfaceC5124 = this.f6536.f11010;
                AbstractC0487.m1047(interfaceC5124);
                interfaceC5124.retrieveAndUploadBatches(new BinderC3272(this, (RunnableC5413) this.f6537));
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC5122 interfaceC5125 = this.f6536.f11010;
                AbstractC0487.m1047(interfaceC5125);
                interfaceC5125.logHealthData(5, "Error with data collection. Data lost.", new BinderC1409((Exception) this.f6537), new BinderC1409(null), new BinderC1409(null));
                break;
            default:
                InterfaceC5122 interfaceC5126 = this.f6536.f11010;
                AbstractC0487.m1047(interfaceC5126);
                interfaceC5126.registerOnMeasurementEventListener((BinderC0810) this.f6537);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1976(C3286 c3286, Object obj, int i) {
        super(c3286, true);
        this.f6535 = i;
        this.f6537 = obj;
        this.f6536 = c3286;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1976(C3286 c3286, Exception exc) {
        super(c3286, false);
        this.f6535 = 3;
        this.f6537 = exc;
        this.f6536 = c3286;
    }
}
