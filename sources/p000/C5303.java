package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۦْۜؗۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5303 {

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f17470;

    /* JADX INFO: renamed from: ۥۣ */
    public final Drawable f17471;

    public C5303(Drawable drawable, boolean z) {
        this.f17471 = drawable;
        this.f17470 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5303)) {
            return false;
        }
        C5303 c5303 = (C5303) obj;
        return AbstractC3831.m6874(this.f17471, c5303.f17471) && this.f17470 == c5303.f17470;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17470) + (this.f17471.hashCode() * 31);
    }
}
