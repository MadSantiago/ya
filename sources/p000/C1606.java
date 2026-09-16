package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ۥ٘ؖۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1606 implements Comparable {

    /* JADX INFO: renamed from: ۥْ */
    public static final List f5401;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final Set f5402;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f5403;

    static {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        f5402 = AbstractC0246.m513(new C1606[]{new C1606(i), new C1606(i2), new C1606(i3)});
        List listM4188 = AbstractC2164.m4188(new C1606(i3), new C1606(i2), new C1606(i));
        f5401 = listM4188;
        AbstractC0973.m2052(listM4188);
    }

    public /* synthetic */ C1606(int i) {
        this.f5403 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C4497.m7827(AbstractC1631.m3432(this.f5403), AbstractC1631.m3432(((C1606) obj).f5403));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1606) {
            return this.f5403 == ((C1606) obj).f5403;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5403);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("WindowWidthSizeClass.");
        int i = this.f5403;
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
