package p000;

/* JADX INFO: renamed from: ۦُؖۥؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3920 extends AbstractC5381 implements InterfaceC0289, InterfaceC3126 {

    /* JADX INFO: renamed from: ۥً */
    public C3920 f13066;

    /* JADX INFO: renamed from: ۥٕ */
    public long f13067;

    /* JADX INFO: renamed from: ۦٚ */
    public C3920 f13068;

    /* JADX INFO: renamed from: ۥؐ */
    public final void m7018(C5086 c5086) {
        InterfaceC0289 interfaceC0289;
        C3920 c3920;
        C3920 c3921 = this.f13066;
        int i = 1;
        if (c3921 == null || !AbstractC4593.m7985(c3921, AbstractC3801.m6749(c5086))) {
            if (this.f17791.f17786) {
                C5450 c5450 = new C5450();
                AbstractC5378.m9064(this, new C5583(c5450, this, c5086, i));
                interfaceC0289 = (InterfaceC0289) c5450.f17965;
            } else {
                interfaceC0289 = null;
            }
            c3920 = (C3920) interfaceC0289;
        } else {
            c3920 = c3921;
        }
        if (c3920 != null && c3921 == null) {
            c3920.m7021();
            c3920.m7018(c5086);
            C3920 c3922 = this.f13068;
            if (c3922 != null) {
                c3922.m7020();
            }
        } else if (c3920 == null && c3921 != null) {
            C3920 c3923 = this.f13068;
            if (c3923 != null) {
                c3923.m7021();
                c3923.m7018(c5086);
            }
            c3921.m7020();
        } else if (!AbstractC3831.m6874(c3920, c3921)) {
            if (c3920 != null) {
                c3920.m7021();
                c3920.m7018(c5086);
            }
            if (c3921 != null) {
                c3921.m7020();
            }
        } else if (c3920 != null) {
            c3920.m7018(c5086);
        } else {
            C3920 c3924 = this.f13068;
            if (c3924 != null) {
                c3924.m7018(c5086);
            }
        }
        this.f13066 = c3920;
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final boolean m7019() {
        C3920 c3920 = this.f13066;
        if (c3920 != null) {
            return c3920.m7019();
        }
        C3920 c3921 = this.f13068;
        if (c3921 != null) {
            return c3921.m7019();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥؒ */
    public final void m7020() {
        C3920 c3920 = this.f13068;
        if (c3920 != null) {
            c3920.m7020();
        }
        C3920 c3921 = this.f13066;
        if (c3921 != null) {
            c3921.m7020();
        }
        this.f13066 = null;
    }

    @Override // p000.InterfaceC3126, p000.InterfaceC1293
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2727(long j) {
        this.f13067 = j;
    }

    @Override // p000.InterfaceC0289
    /* JADX INFO: renamed from: ۥٓ */
    public final Object mo612() {
        return C0373.f1383;
    }

    /* JADX INFO: renamed from: ۥٜ */
    public final void m7021() {
        C3920 c3920 = this.f13068;
        if (c3920 != null) {
            c3920.m7021();
            return;
        }
        C3920 c3921 = this.f13066;
        if (c3921 != null) {
            c3921.m7021();
        }
    }

    /* JADX INFO: renamed from: ۦؕ */
    public final void m7022() {
        C3920 c3920 = this.f13068;
        if (c3920 != null) {
            c3920.m7022();
            return;
        }
        C3920 c3921 = this.f13066;
        if (c3921 != null) {
            c3921.m7022();
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        this.f13068 = null;
        this.f13066 = null;
    }
}
