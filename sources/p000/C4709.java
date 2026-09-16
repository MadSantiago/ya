package p000;

/* JADX INFO: renamed from: ۦٜؗٝٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4709 extends AbstractC1003 {

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ int f15523;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ C5695 f15524;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4709(C5695 c5695, InterfaceC1150 interfaceC1150, int i) {
        super(interfaceC1150);
        this.f15523 = i;
        this.f15524 = c5695;
    }

    @Override // p000.AbstractC1003
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1720() {
        int i = this.f15523;
        C5695 c5695 = this.f15524;
        switch (i) {
            case 0:
                c5695.mo6517();
                if (c5695.m9515()) {
                    C3610 c3610 = ((C5371) c5695.f18660).f17717;
                    C5371.m9020(c3610);
                    c3610.f12023.m9432("Inactivity, disconnecting from the service");
                    c5695.m9510();
                    break;
                }
                break;
            default:
                C3610 c3611 = ((C5371) c5695.f18660).f17717;
                C5371.m9020(c3611);
                c3611.f12022.m9432("Tasks have been queued for a long time");
                break;
        }
    }
}
