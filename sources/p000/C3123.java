package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦؒؕٞٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3123 extends AbstractC4467 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC5574 f10457;

    /* JADX INFO: renamed from: ۥُ */
    public final C1668 f10458;

    /* JADX INFO: renamed from: ۥّ */
    public final List f10459;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC2237 f10460;

    /* JADX INFO: renamed from: ۥۣ */
    public final List f10461;

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC1942 f10462;

    public C3123(List list, AbstractC2237 abstractC2237, AbstractC5574 abstractC5574, AbstractC1942 abstractC1942, C1668 c1668, List list2) {
        this.f10461 = list;
        this.f10460 = abstractC2237;
        this.f10457 = abstractC5574;
        this.f10462 = abstractC1942;
        this.f10458 = c1668;
        this.f10459 = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4467)) {
            return false;
        }
        AbstractC4467 abstractC4467 = (AbstractC4467) obj;
        List list = this.f10461;
        if (list == null) {
            if (((C3123) abstractC4467).f10461 != null) {
                return false;
            }
        } else if (!list.equals(((C3123) abstractC4467).f10461)) {
            return false;
        }
        AbstractC2237 abstractC2237 = this.f10460;
        if (abstractC2237 == null) {
            if (((C3123) abstractC4467).f10460 != null) {
                return false;
            }
        } else if (!abstractC2237.equals(((C3123) abstractC4467).f10460)) {
            return false;
        }
        AbstractC5574 abstractC5574 = this.f10457;
        if (abstractC5574 == null) {
            if (((C3123) abstractC4467).f10457 != null) {
                return false;
            }
        } else if (!abstractC5574.equals(((C3123) abstractC4467).f10457)) {
            return false;
        }
        AbstractC1942 abstractC1942 = this.f10462;
        if (abstractC1942 == null) {
            if (((C3123) abstractC4467).f10462 != null) {
                return false;
            }
        } else if (!abstractC1942.equals(((C3123) abstractC4467).f10462)) {
            return false;
        }
        C3123 c3123 = (C3123) abstractC4467;
        return this.f10458.equals(c3123.f10458) && this.f10459.equals(c3123.f10459);
    }

    public final int hashCode() {
        List list = this.f10461;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC2237 abstractC2237 = this.f10460;
        int iHashCode2 = (iHashCode ^ (abstractC2237 == null ? 0 : abstractC2237.hashCode())) * 1000003;
        AbstractC5574 abstractC5574 = this.f10457;
        int iHashCode3 = (iHashCode2 ^ (abstractC5574 == null ? 0 : abstractC5574.hashCode())) * 1000003;
        AbstractC1942 abstractC1942 = this.f10462;
        return this.f10459.hashCode() ^ (((((abstractC1942 != null ? abstractC1942.hashCode() : 0) ^ iHashCode3) * 1000003) ^ this.f10458.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Execution{threads=" + this.f10461 + ", exception=" + this.f10460 + ", appExitInfo=" + this.f10457 + ", profilingManagerInfo=" + this.f10462 + ", signal=" + this.f10458 + ", binaries=" + this.f10459 + "}";
    }
}
