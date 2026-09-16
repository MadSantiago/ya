package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥًؘٜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2701 extends AbstractC5497 {

    /* JADX INFO: renamed from: ۥؗ */
    public final List f8953;

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC1355 f8954;

    /* JADX INFO: renamed from: ۥّ */
    public final List f8955;

    /* JADX INFO: renamed from: ۥۗ */
    public final List f8956;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC4467 f8957;

    /* JADX INFO: renamed from: ۦؑ */
    public final Boolean f8958;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f8959;

    public C2701(AbstractC4467 abstractC4467, List list, List list2, Boolean bool, AbstractC1355 abstractC1355, List list3, int i) {
        this.f8957 = abstractC4467;
        this.f8956 = list;
        this.f8953 = list2;
        this.f8958 = bool;
        this.f8954 = abstractC1355;
        this.f8955 = list3;
        this.f8959 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5497) {
            C2701 c2701 = (C2701) ((AbstractC5497) obj);
            if (this.f8957.equals(c2701.f8957)) {
                List list = c2701.f8956;
                List list2 = this.f8956;
                if (list2 != null ? list2.equals(list) : list == null) {
                    List list3 = c2701.f8953;
                    List list4 = this.f8953;
                    if (list4 != null ? list4.equals(list3) : list3 == null) {
                        Boolean bool = c2701.f8958;
                        Boolean bool2 = this.f8958;
                        if (bool2 != null ? bool2.equals(bool) : bool == null) {
                            AbstractC1355 abstractC1355 = c2701.f8954;
                            AbstractC1355 abstractC1356 = this.f8954;
                            if (abstractC1356 != null ? abstractC1356.equals(abstractC1355) : abstractC1355 == null) {
                                List list5 = c2701.f8955;
                                List list6 = this.f8955;
                                if (list6 != null ? list6.equals(list5) : list5 == null) {
                                    if (this.f8959 == c2701.f8959) {
                                        return true;
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
        int iHashCode = (this.f8957.hashCode() ^ 1000003) * 1000003;
        List list = this.f8956;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f8953;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f8958;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC1355 abstractC1355 = this.f8954;
        int iHashCode5 = (iHashCode4 ^ (abstractC1355 == null ? 0 : abstractC1355.hashCode())) * 1000003;
        List list3 = this.f8955;
        return this.f8959 ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f8957);
        sb.append(", customAttributes=");
        sb.append(this.f8956);
        sb.append(", internalKeys=");
        sb.append(this.f8953);
        sb.append(", background=");
        sb.append(this.f8958);
        sb.append(", currentProcessDetails=");
        sb.append(this.f8954);
        sb.append(", appProcessDetails=");
        sb.append(this.f8955);
        sb.append(", uiOrientation=");
        return AbstractC3761.m6630(this.f8959, "}", sb);
    }

    @Override // p000.AbstractC5497
    /* JADX INFO: renamed from: ۥۣ */
    public final C1771 mo5025() {
        C1771 c1771 = new C1771();
        c1771.f5908 = this.f8957;
        c1771.f5906 = this.f8956;
        c1771.f5903 = this.f8953;
        c1771.f5909 = this.f8958;
        c1771.f5904 = this.f8954;
        c1771.f5905 = this.f8955;
        c1771.f5910 = this.f8959;
        c1771.f5907 = (byte) 1;
        return c1771;
    }
}
