package p000;

/* JADX INFO: renamed from: ۦؘِٙؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4515 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14920;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C4515 f14919 = new C4515(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final C4515 f14916 = new C4515(1);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C4515 f14917 = new C4515(2);

    /* JADX INFO: renamed from: ۥَ */
    public static final C4515 f14915 = new C4515(3);

    /* JADX INFO: renamed from: ۥٖ */
    public static final C4515 f14918 = new C4515(4);

    public /* synthetic */ C4515(int i) {
        this.f14920 = i;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        Object c1989;
        Object c19810;
        Object c19811;
        switch (this.f14920) {
            case 0:
                ((Number) obj).intValue();
                return null;
            case 1:
                C4571 c4571 = (C4571) obj;
                C3131 c3131M8557 = AbstractC5041.m8557(C1989.class);
                if (c3131M8557.equals(AbstractC5041.m8557(C5818.class))) {
                    c1989 = new C5818(c4571.mo3892());
                } else if (c3131M8557.equals(AbstractC5041.m8557(C2246.class))) {
                    c1989 = new C2246(c4571.mo3892());
                } else {
                    if (!c3131M8557.equals(AbstractC5041.m8557(C1989.class))) {
                        C0178.m383(AbstractC5041.m8557(C1989.class), "Unsupported accessor type: ");
                        return null;
                    }
                    c1989 = new C1989(c4571.mo3892());
                }
                return (C1989) c1989;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C4571 c4572 = (C4571) obj;
                C3131 c3131M8558 = AbstractC5041.m8557(C5818.class);
                if (c3131M8558.equals(AbstractC5041.m8557(C5818.class))) {
                    c19810 = new C5818(c4572.mo3892());
                } else if (c3131M8558.equals(AbstractC5041.m8557(C2246.class))) {
                    c19810 = new C2246(c4572.mo3892());
                } else {
                    if (!c3131M8558.equals(AbstractC5041.m8557(C1989.class))) {
                        C0178.m383(AbstractC5041.m8557(C5818.class), "Unsupported accessor type: ");
                        return null;
                    }
                    c19810 = new C1989(c4572.mo3892());
                }
                return (C5818) c19810;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C4571 c4573 = (C4571) obj;
                C3131 c3131M8559 = AbstractC5041.m8557(C2246.class);
                if (c3131M8559.equals(AbstractC5041.m8557(C5818.class))) {
                    c19811 = new C5818(c4573.mo3892());
                } else if (c3131M8559.equals(AbstractC5041.m8557(C2246.class))) {
                    c19811 = new C2246(c4573.mo3892());
                } else {
                    if (!c3131M8559.equals(AbstractC5041.m8557(C1989.class))) {
                        C0178.m383(AbstractC5041.m8557(C2246.class), "Unsupported accessor type: ");
                        return null;
                    }
                    c19811 = new C1989(c4573.mo3892());
                }
                return (C2246) c19811;
            default:
                return AbstractC3831.m6874(obj, Boolean.FALSE) ? new C1327(C1327.f4591) : new C1327(AbstractC4225.m7468(((Integer) obj).intValue()));
        }
    }
}
