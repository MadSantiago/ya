package p000;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: ۥٗؒۥۣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1516 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f5153;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f5154;

    /* JADX INFO: renamed from: ۥۣ */
    public final ColorFilter f5155;

    public C1516(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2875.m5467();
            porterDuffColorFilter = AbstractC2875.m5458(AbstractC4225.m7470(j), AbstractC3801.m6799(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC4225.m7470(j), AbstractC3801.m6797(i));
        }
        this.f5155 = porterDuffColorFilter;
        this.f5154 = j;
        this.f5153 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1516)) {
            return false;
        }
        C1516 c1516 = (C1516) obj;
        long j = c1516.f5154;
        int i = C1327.f4593;
        return C4462.m7744(this.f5154, j) && this.f5153 == c1516.f5153;
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Integer.hashCode(this.f5153) + (Long.hashCode(this.f5154) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC5078.m8677(this.f5154, sb, ", blendMode=");
        sb.append((Object) C4773.m8129(this.f5153));
        sb.append(')');
        return sb.toString();
    }
}
