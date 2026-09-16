package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: ۥُؒؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0261 implements Comparator {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3510 f959;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f960;

    public /* synthetic */ C0261(C3510 c3510, int i) {
        this.f960 = i;
        this.f959 = c3510;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f960;
        C3510 c3510 = this.f959;
        switch (i) {
            case 0:
                return Integer.valueOf(c3510.m6297(((C5851) obj).f19296)).compareTo(Integer.valueOf(c3510.m6297(((C5851) obj2).f19296)));
            case 1:
                return Integer.valueOf(c3510.m6297(((C5851) obj).f19296)).compareTo(Integer.valueOf(c3510.m6297(((C5851) obj2).f19296)));
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return Integer.valueOf(c3510.m6297(((C5851) obj2).f19296)).compareTo(Integer.valueOf(c3510.m6297(((C5851) obj).f19296)));
            default:
                return Integer.valueOf(c3510.m6297(((C5851) obj2).f19296)).compareTo(Integer.valueOf(c3510.m6297(((C5851) obj).f19296)));
        }
    }
}
