package p000;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: renamed from: ۥؘُٛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1798 {

    /* JADX INFO: renamed from: ۥۣ */
    public final DisplayCutout f5996;

    public C1798(DisplayCutout displayCutout) {
        this.f5996 = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1798.class != obj.getClass()) {
            return false;
        }
        return this.f5996.equals(((C1798) obj).f5996);
    }

    public final int hashCode() {
        return this.f5996.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5996 + "}";
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C5364 m3584() {
        return Build.VERSION.SDK_INT >= 30 ? C5364.m9017(AbstractC5604.m9456(this.f5996)) : C5364.f17692;
    }
}
