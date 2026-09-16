package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦًۡؔۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5458 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f17994;

    /* JADX INFO: renamed from: ۥۣ */
    public final List f17995;

    public C5458(int i, List list) {
        this.f17995 = list;
        this.f17994 = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder sbM8680 = AbstractC5078.m8680(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        sbM8680.append(new C3046(0, list.size() - 1, 1));
        sbM8680.append("'.");
        throw new IllegalArgumentException(sbM8680.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5458.class != obj.getClass()) {
            return false;
        }
        C5458 c5458 = (C5458) obj;
        return this.f17994 == c5458.f17994 && AbstractC3831.m6874(this.f17995, c5458.f17995);
    }

    public final int hashCode() {
        return this.f17995.hashCode() + (this.f17994 * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f17994 + ", mergedHistory=" + this.f17995 + ')';
    }

    public C5458() {
        this(-1, C2340.f7777);
    }
}
