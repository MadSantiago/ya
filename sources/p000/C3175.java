package p000;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: ۦْؓؔؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3175 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3175 f10672 = new C3175(AbstractC0973.m2052(new ArrayList()), null);

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC1434 f10673;

    /* JADX INFO: renamed from: ۥۣ */
    public final Set f10674;

    public C3175(Set set, AbstractC1434 abstractC1434) {
        this.f10674 = set;
        this.f10673 = abstractC1434;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3175)) {
            return false;
        }
        C3175 c3175 = (C3175) obj;
        return c3175.f10674.equals(this.f10674) && AbstractC3831.m6874(c3175.f10673, this.f10673);
    }

    public final int hashCode() {
        int iHashCode = (this.f10674.hashCode() + 1517) * 41;
        AbstractC1434 abstractC1434 = this.f10673;
        return iHashCode + (abstractC1434 != null ? abstractC1434.hashCode() : 0);
    }
}
