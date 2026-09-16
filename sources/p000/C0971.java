package p000;

/* JADX INFO: renamed from: ۥٍۣٕؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0971 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0971 f3428 = new C0971();

    /* JADX INFO: renamed from: ۥۣ */
    public final C3510 f3430 = new C3510(5, (byte) 0);

    /* JADX INFO: renamed from: ۥۗ */
    public final C4228 f3429 = new C4228(20);

    /* JADX INFO: renamed from: ۥۗ */
    public final String m2034(InterfaceC4734 interfaceC4734, Object obj) {
        char[] cArr;
        C0322 c0322 = new C0322((char) 0, 5);
        C2622 c2622 = C2622.f8724;
        synchronized (c2622) {
            C5219 c5219 = c2622.f8726;
            cArr = null;
            char[] cArr2 = (char[]) (c5219.isEmpty() ? null : c5219.removeLast());
            if (cArr2 != null) {
                c2622.f8725 -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c0322.f1178 = cArr;
        try {
            new C3782(new C0390(c0322), this, EnumC5504.OBJ, new C3782[EnumC5504.f18173.mo624()]).m6701(interfaceC4734, obj);
            return c0322.toString();
        } finally {
            c0322.m705();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m2035(InterfaceC4734 interfaceC4734, String str) {
        C3915 c3915M4808 = AbstractC2552.m4808(this, str);
        Object objMo4110 = new C3501(this, EnumC5504.OBJ, c3915M4808, interfaceC4734.mo193()).mo4110(interfaceC4734);
        if (c3915M4808.m7000() == 10) {
            return objMo4110;
        }
        C3915.m6997(c3915M4808, "Expected EOF after parsing, but had " + c3915M4808.f13052.charAt(c3915M4808.f13054 - 1) + " instead", 0, null, 6);
        throw null;
    }
}
