package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: ۦٕٞؒۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4786 extends AbstractRunnableC2435 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f15787;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ String f15788;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C3286 f15789;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ String f15790;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Bundle f15791;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4786(C3286 c3286, String str, String str2, Bundle bundle, int i) {
        super(c3286, true);
        this.f15787 = i;
        switch (i) {
            case 1:
                this.f15788 = str;
                this.f15790 = str2;
                this.f15791 = bundle;
                Objects.requireNonNull(c3286);
                this.f15789 = c3286;
                super(c3286, true);
                break;
            default:
                this.f15788 = str;
                this.f15790 = str2;
                this.f15791 = bundle;
                this.f15789 = c3286;
                break;
        }
    }

    @Override // p000.AbstractRunnableC2435
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2528() {
        switch (this.f15787) {
            case 0:
                InterfaceC5122 interfaceC5122 = this.f15789.f11010;
                AbstractC0487.m1047(interfaceC5122);
                interfaceC5122.clearConditionalUserProperty(this.f15788, this.f15790, this.f15791);
                break;
            default:
                long j = this.f8107;
                long j2 = this.f8106;
                InterfaceC5122 interfaceC5123 = this.f15789.f11010;
                AbstractC0487.m1047(interfaceC5123);
                interfaceC5123.logEventWithElapsedTime(this.f15788, this.f15790, this.f15791, true, true, j, j2);
                break;
        }
    }
}
