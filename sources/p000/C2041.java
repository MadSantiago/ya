package p000;

/* JADX INFO: renamed from: ۥۖؑۛؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2041 implements InterfaceC3901, InterfaceC2659 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C2600 f6736;

    public /* synthetic */ C2041(C2600 c2600) {
        this.f6736 = c2600;
    }

    @Override // p000.InterfaceC2659
    /* JADX INFO: renamed from: ۥُ */
    public void mo3987(C3580 c3580) throws C0768 {
        Exception excM6387 = c3580.m6387();
        if (excM6387 != null) {
            this.f6736.mo335(new C4535(excM6387));
            return;
        }
        boolean z = c3580.f11913;
        C2600 c2600 = this.f6736;
        if (z) {
            c2600.mo3713(null);
        } else {
            c2600.mo335(c3580.m6388());
        }
    }

    @Override // p000.InterfaceC3901
    /* JADX INFO: renamed from: ۥۗ */
    public void mo3081(Throwable th) {
        this.f6736.mo335(new C4535(th));
    }

    @Override // p000.InterfaceC3901
    /* JADX INFO: renamed from: ۥۣ */
    public void mo3082(InterfaceC5065 interfaceC5065, C4633 c4633) {
        boolean zM4177 = c4633.f15293.m4177();
        C2600 c2600 = this.f6736;
        if (zM4177) {
            c2600.mo335(c4633.f15292);
        } else {
            c2600.mo335(new C4535(new C1228(c4633)));
        }
    }
}
