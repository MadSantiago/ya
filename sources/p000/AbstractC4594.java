package p000;

/* JADX INFO: renamed from: ۦُٛؑٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4594 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ int f15164 = 0;

    /* JADX INFO: renamed from: ۥۣ */
    public static final long f15165;

    static {
        C3970[] c3970Arr = C5023.f16621;
        f15165 = C5023.f16620;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0477 m7996(C0477 c0477, int i, int i2, long j, C4755 c4755, C0823 c0823, C1220 c1220, int i3, int i4, C2309 c2309) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        C4755 c4756 = c4755;
        C0823 c0824 = c0823;
        C1220 c1221 = c1220;
        int i7 = i3;
        int i8 = i4;
        C2309 c23010 = c2309;
        if (i5 == 0 || i5 == c0477.f1736) {
            C3970[] c3970Arr = C5023.f16621;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (C5023.m8440(j3, c0477.f1731)) {
                }
            }
            if ((c4756 == null || c4756.equals(c0477.f1737)) && ((i6 == 0 || i6 == c0477.f1734) && ((c0824 == null || c0824.equals(c0477.f1732)) && ((c1221 == null || c1221.equals(c0477.f1733)) && ((i7 == 0 || i7 == c0477.f1739) && ((i8 == 0 || i8 == c0477.f1735) && (c23010 == null || c23010.equals(c0477.f1738)))))))) {
                return c0477;
            }
        } else {
            j2 = 0;
        }
        C3970[] c3970Arr2 = C5023.f16621;
        if ((j3 & 1095216660480L) == j2) {
            j3 = c0477.f1731;
        }
        if (c4756 == null) {
            c4756 = c0477.f1737;
        }
        if (i5 == 0) {
            i5 = c0477.f1736;
        }
        if (i6 == 0) {
            i6 = c0477.f1734;
        }
        C0823 c0825 = c0477.f1732;
        if (c0825 != null && c0824 == null) {
            c0824 = c0825;
        }
        if (c1221 == null) {
            c1221 = c0477.f1733;
        }
        if (i7 == 0) {
            i7 = c0477.f1739;
        }
        if (i8 == 0) {
            i8 = c0477.f1735;
        }
        if (c23010 == null) {
            c23010 = c0477.f1738;
        }
        return new C0477(i5, i6, j3, c4756, c0824, c1221, i7, i8, c23010);
    }
}
