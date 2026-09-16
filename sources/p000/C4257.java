package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦٕؗؕٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4257 extends AbstractC2237 {

    /* JADX INFO: renamed from: ۥؗ */
    public final List f14105;

    /* JADX INFO: renamed from: ۥُ */
    public final int f14106;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f14107;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f14108;

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC2237 f14109;

    public C4257(String str, String str2, List list, AbstractC2237 abstractC2237, int i) {
        this.f14108 = str;
        this.f14107 = str2;
        this.f14105 = list;
        this.f14109 = abstractC2237;
        this.f14106 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2237) {
            C4257 c4257 = (C4257) ((AbstractC2237) obj);
            if (this.f14108.equals(c4257.f14108)) {
                String str = c4257.f14107;
                String str2 = this.f14107;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f14105.equals(c4257.f14105)) {
                        AbstractC2237 abstractC2237 = c4257.f14109;
                        AbstractC2237 abstractC2238 = this.f14109;
                        if (abstractC2238 != null ? abstractC2238.equals(abstractC2237) : abstractC2237 == null) {
                            if (this.f14106 == c4257.f14106) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f14108.hashCode() ^ 1000003) * 1000003;
        String str = this.f14107;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f14105.hashCode()) * 1000003;
        AbstractC2237 abstractC2237 = this.f14109;
        return this.f14106 ^ ((iHashCode2 ^ (abstractC2237 != null ? abstractC2237.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f14108);
        sb.append(", reason=");
        sb.append(this.f14107);
        sb.append(", frames=");
        sb.append(this.f14105);
        sb.append(", causedBy=");
        sb.append(this.f14109);
        sb.append(", overflowCount=");
        return AbstractC3761.m6630(this.f14106, "}", sb);
    }
}
