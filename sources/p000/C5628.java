package p000;

import android.net.Uri;

/* JADX INFO: renamed from: ۦًۣۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5628 {

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f18555;

    /* JADX INFO: renamed from: ۥۣ */
    public final Uri f18556;

    public C5628(boolean z, Uri uri) {
        this.f18556 = uri;
        this.f18555 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5628.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5628 c5628 = (C5628) obj;
        return AbstractC3831.m6874(this.f18556, c5628.f18556) && this.f18555 == c5628.f18555;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18555) + (this.f18556.hashCode() * 31);
    }
}
