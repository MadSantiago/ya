package p000;

/* JADX INFO: renamed from: ۦۧۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5852 {

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC0475 f19300;

    /* JADX INFO: renamed from: ۥۗ */
    public C0163 f19301;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3508 f19302;

    public C5852(InterfaceC3508 interfaceC3508) {
        this.f19302 = interfaceC3508;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m9678(int i) {
        InterfaceC4745 interfaceC4745;
        InterfaceC3508 interfaceC3508;
        if (i == 7) {
            C0163 c0163 = this.f19301;
            if (c0163 == null) {
                c0163 = null;
            }
            interfaceC4745 = c0163.f619;
        } else {
            if (i == 2) {
                C0163 c0164 = this.f19301;
                if (c0164 == null) {
                    c0164 = null;
                }
                c0164.getClass();
            } else if (i == 6) {
                C0163 c0165 = this.f19301;
                if (c0165 == null) {
                    c0165 = null;
                }
                c0165.getClass();
            } else if (i == 5) {
                C0163 c0166 = this.f19301;
                if (c0166 == null) {
                    c0166 = null;
                }
                c0166.getClass();
            } else if (i == 3) {
                C0163 c0167 = this.f19301;
                if (c0167 == null) {
                    c0167 = null;
                }
                c0167.getClass();
            } else if (i == 4) {
                C0163 c0168 = this.f19301;
                if (c0168 == null) {
                    c0168 = null;
                }
                c0168.getClass();
            } else if (i != 1 && i != 0) {
                C1078.m2276("invalid ImeAction");
                return false;
            }
            interfaceC4745 = null;
        }
        if (interfaceC4745 != null) {
            interfaceC4745.mo211(this);
            return true;
        }
        if (i == 6) {
            InterfaceC0475 interfaceC0475 = this.f19300;
            ((C2016) (interfaceC0475 != null ? interfaceC0475 : null)).m3933(1, true);
            return true;
        }
        if (i == 5) {
            InterfaceC0475 interfaceC0476 = this.f19300;
            ((C2016) (interfaceC0476 != null ? interfaceC0476 : null)).m3933(2, true);
            return true;
        }
        if (i != 7 || (interfaceC3508 = this.f19302) == null) {
            return false;
        }
        ((C3773) interfaceC3508).m6677();
        return true;
    }
}
