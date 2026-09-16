package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ۦَؖؒۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3332 implements Comparable {

    /* JADX INFO: renamed from: ۥْ */
    public static final List f11150;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final Set f11151;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f11152;

    static {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        f11151 = AbstractC0246.m513(new C3332[]{new C3332(i), new C3332(i2), new C3332(i3)});
        List listM4188 = AbstractC2164.m4188(new C3332(i3), new C3332(i2), new C3332(i));
        f11150 = listM4188;
        AbstractC0973.m2052(listM4188);
    }

    public /* synthetic */ C3332(int i) {
        this.f11152 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C4497.m7827(AbstractC1605.m3353(this.f11152), AbstractC1605.m3353(((C3332) obj).f11152));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3332) {
            return this.f11152 == ((C3332) obj).f11152;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11152);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("WindowHeightSizeClass.");
        int i = this.f11152;
        if (i == 0) {
            str = "Compact";
        } else if (i == 1) {
            str = "Medium";
        } else {
            str = i == 2 ? "Expanded" : "";
        }
        sb.append(str);
        return sb.toString();
    }
}
