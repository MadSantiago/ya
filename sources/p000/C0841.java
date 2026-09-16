package p000;

/* JADX INFO: renamed from: ۥًَْؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0841 {
    /* JADX INFO: renamed from: ۥۗ */
    public static boolean m1753(int i, C4902 c4902, Object obj) throws C3406 {
        int i2 = c4902.f16168;
        AbstractC2758 abstractC2758 = (AbstractC2758) c4902.f16167;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c4902.m8271(0);
            ((C5708) obj).m9524(i3 << 3, Long.valueOf(abstractC2758.mo5042()));
            return true;
        }
        if (i4 == 1) {
            c4902.m8271(1);
            ((C5708) obj).m9524((i3 << 3) | 1, Long.valueOf(abstractC2758.mo5067()));
            return true;
        }
        if (i4 == 2) {
            ((C5708) obj).m9524((i3 << 3) | 2, c4902.m8282());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw C3406.m6170();
            }
            c4902.m8271(5);
            ((C5708) obj).m9524(5 | (i3 << 3), Integer.valueOf(abstractC2758.mo5068()));
            return true;
        }
        C5708 c5708 = new C5708(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new C3406("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c4902.m8273() != Integer.MAX_VALUE && m1753(i7, c4902, c5708)) {
        }
        if (i6 != c4902.f16168) {
            throw new C3406("Protocol message end-group tag did not match expected tag.");
        }
        if (c5708.f18793) {
            c5708.f18793 = false;
        }
        ((C5708) obj).m9524(i5 | 3, c5708);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C5708 m1754(Object obj) {
        AbstractC0318 abstractC0318 = (AbstractC0318) obj;
        C5708 c5708 = abstractC0318.unknownFields;
        if (c5708 != C5708.f18791) {
            return c5708;
        }
        C5708 c5709 = new C5708(0, new int[8], new Object[8], true);
        abstractC0318.unknownFields = c5709;
        return c5709;
    }
}
