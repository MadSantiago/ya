package p000;

/* JADX INFO: renamed from: ۥٌؒؖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0880 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3262 f3214;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0681 f3215;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0770 f3216;

    public C0880(InterfaceC0770 interfaceC0770, C0681 c0681) {
        this.f3216 = interfaceC0770;
        this.f3215 = c0681;
        long[] jArr = AbstractC5064.f16815;
        this.f3214 = new C3262();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m1872(Object obj) {
        if (obj == null) {
            return null;
        }
        C4133 c4133 = (C4133) this.f3214.m6027(obj);
        if (c4133 != null) {
            return c4133.f13755;
        }
        InterfaceC4112 interfaceC4112 = (InterfaceC4112) this.f3215.mo449();
        int iMo5819 = interfaceC4112.mo5819(obj);
        if (iMo5819 != -1) {
            return interfaceC4112.mo7314(iMo5819);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5731 m1873(int i, Object obj, Object obj2) {
        C3262 c3262 = this.f3214;
        C4133 c4133 = (C4133) c3262.m6027(obj);
        int i2 = 9;
        if (c4133 != null && c4133.f13753 == i && AbstractC3831.m6874(c4133.f13755, obj2)) {
            C0857 c0857 = c4133.f13757;
            if (c0857 != null) {
                return c0857;
            }
            C0857 c0858 = new C0857(818252804, new C4762(i2, c4133.f13754, c4133), true);
            c4133.f13757 = c0858;
            return c0858;
        }
        C4133 c4134 = new C4133(this, i, obj, obj2);
        c3262.m6023(obj, c4134);
        C0857 c0859 = c4134.f13757;
        if (c0859 != null) {
            return c0859;
        }
        C0857 c08510 = new C0857(818252804, new C4762(i2, this, c4134), true);
        c4134.f13757 = c08510;
        return c08510;
    }
}
