package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦٓؓؓ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4113 extends AbstractC1038 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f13705;

    /* JADX INFO: renamed from: ۥُ */
    public final Long f13706;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f13707;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f13708;

    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC3029 f13709;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f13710;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f13711;

    /* JADX INFO: renamed from: ۦؚ */
    public final int f13712;

    /* JADX INFO: renamed from: ۦِ */
    public final AbstractC3054 f13713;

    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0895 f13714;

    /* JADX INFO: renamed from: ۦۗ */
    public final List f13715;

    /* JADX INFO: renamed from: ۦۙ */
    public final AbstractC2952 f13716;

    public C4113(String str, String str2, String str3, long j, Long l, boolean z, AbstractC2952 abstractC2952, AbstractC3029 abstractC3029, AbstractC0895 abstractC0895, AbstractC3054 abstractC3054, List list, int i) {
        this.f13710 = str;
        this.f13708 = str2;
        this.f13705 = str3;
        this.f13711 = j;
        this.f13706 = l;
        this.f13707 = z;
        this.f13716 = abstractC2952;
        this.f13709 = abstractC3029;
        this.f13714 = abstractC0895;
        this.f13713 = abstractC3054;
        this.f13715 = list;
        this.f13712 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1038) {
            C4113 c4113 = (C4113) ((AbstractC1038) obj);
            if (this.f13710.equals(c4113.f13710) && this.f13708.equals(c4113.f13708)) {
                String str = c4113.f13705;
                String str2 = this.f13705;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f13711 == c4113.f13711) {
                        Long l = c4113.f13706;
                        Long l2 = this.f13706;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f13707 == c4113.f13707 && this.f13716.equals(c4113.f13716)) {
                                AbstractC3029 abstractC3029 = c4113.f13709;
                                AbstractC3029 abstractC30210 = this.f13709;
                                if (abstractC30210 != null ? abstractC30210.equals(abstractC3029) : abstractC3029 == null) {
                                    AbstractC0895 abstractC0895 = c4113.f13714;
                                    AbstractC0895 abstractC0896 = this.f13714;
                                    if (abstractC0896 != null ? abstractC0896.equals(abstractC0895) : abstractC0895 == null) {
                                        AbstractC3054 abstractC3054 = c4113.f13713;
                                        AbstractC3054 abstractC3055 = this.f13713;
                                        if (abstractC3055 != null ? abstractC3055.equals(abstractC3054) : abstractC3054 == null) {
                                            List list = c4113.f13715;
                                            List list2 = this.f13715;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.f13712 == c4113.f13712) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f13710.hashCode() ^ 1000003) * 1000003) ^ this.f13708.hashCode()) * 1000003;
        String str = this.f13705;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.f13711;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.f13706;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f13707 ? 1231 : 1237)) * 1000003) ^ this.f13716.hashCode()) * 1000003;
        AbstractC3029 abstractC3029 = this.f13709;
        int iHashCode4 = (iHashCode3 ^ (abstractC3029 == null ? 0 : abstractC3029.hashCode())) * 1000003;
        AbstractC0895 abstractC0895 = this.f13714;
        int iHashCode5 = (iHashCode4 ^ (abstractC0895 == null ? 0 : abstractC0895.hashCode())) * 1000003;
        AbstractC3054 abstractC3054 = this.f13713;
        int iHashCode6 = (iHashCode5 ^ (abstractC3054 == null ? 0 : abstractC3054.hashCode())) * 1000003;
        List list = this.f13715;
        return this.f13712 ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f13710);
        sb.append(", identifier=");
        sb.append(this.f13708);
        sb.append(", appQualitySessionId=");
        sb.append(this.f13705);
        sb.append(", startedAt=");
        sb.append(this.f13711);
        sb.append(", endedAt=");
        sb.append(this.f13706);
        sb.append(", crashed=");
        sb.append(this.f13707);
        sb.append(", app=");
        sb.append(this.f13716);
        sb.append(", user=");
        sb.append(this.f13709);
        sb.append(", os=");
        sb.append(this.f13714);
        sb.append(", device=");
        sb.append(this.f13713);
        sb.append(", events=");
        sb.append(this.f13715);
        sb.append(", generatorType=");
        return AbstractC3761.m6630(this.f13712, "}", sb);
    }

    @Override // p000.AbstractC1038
    /* JADX INFO: renamed from: ۥۣ */
    public final C1572 mo2240() {
        C1572 c1572 = new C1572();
        c1572.f5303 = this.f13710;
        c1572.f5301 = this.f13708;
        c1572.f5298 = this.f13705;
        c1572.f5304 = this.f13711;
        c1572.f5299 = this.f13706;
        c1572.f5300 = this.f13707;
        c1572.f5310 = this.f13716;
        c1572.f5302 = this.f13709;
        c1572.f5308 = this.f13714;
        c1572.f5307 = this.f13713;
        c1572.f5309 = this.f13715;
        c1572.f5305 = this.f13712;
        c1572.f5306 = (byte) 7;
        return c1572;
    }
}
