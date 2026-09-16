package p000;

/* JADX INFO: renamed from: ۥۥؕۛؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2750 {

    /* JADX INFO: renamed from: ۥؗ */
    public C1405 f9097;

    /* JADX INFO: renamed from: ۥّ */
    public int f9099;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f9101;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2808 f9100 = new C2808(24);

    /* JADX INFO: renamed from: ۦؑ */
    public int f9102 = -1;

    /* JADX INFO: renamed from: ۥُ */
    public int f9098 = -1;

    public C2750(InterfaceC4745 interfaceC4745) {
        this.f9101 = interfaceC4745;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5841 m5109(int i, long j, boolean z, InterfaceC4745 interfaceC4745) {
        C1405 c1405 = this.f9097;
        if (c1405 == null) {
            return C0431.f1548;
        }
        InterfaceC0762 interfaceC0762 = (InterfaceC0762) c1405.f4838;
        boolean z2 = interfaceC0762 instanceof ViewOnAttachStateChangeListenerC5815;
        C2830 c2830 = new C2830(c1405, i, this.f9100, interfaceC4745);
        c2830.f9456 = new C3693(j);
        if (!z2) {
            interfaceC0762.mo1151(c2830);
        } else if (z) {
            ViewOnAttachStateChangeListenerC5815 viewOnAttachStateChangeListenerC5815 = (ViewOnAttachStateChangeListenerC5815) interfaceC0762;
            viewOnAttachStateChangeListenerC5815.f19145.add(new C1054(1, c2830));
            if (!viewOnAttachStateChangeListenerC5815.f19141) {
                viewOnAttachStateChangeListenerC5815.f19141 = true;
                viewOnAttachStateChangeListenerC5815.f19146.post(viewOnAttachStateChangeListenerC5815);
            }
        } else {
            ViewOnAttachStateChangeListenerC5815 viewOnAttachStateChangeListenerC5816 = (ViewOnAttachStateChangeListenerC5815) interfaceC0762;
            viewOnAttachStateChangeListenerC5816.f19145.add(new C1054(0, c2830));
            if (!viewOnAttachStateChangeListenerC5816.f19141) {
                viewOnAttachStateChangeListenerC5816.f19141 = true;
                viewOnAttachStateChangeListenerC5816.f19146.post(viewOnAttachStateChangeListenerC5816);
            }
        }
        AbstractC2765.m5128(i, "compose:lazy:schedule_prefetch:index");
        return c2830;
    }
}
