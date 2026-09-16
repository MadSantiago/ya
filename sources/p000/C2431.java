package p000;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: renamed from: ۥ۟ؒٔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2431 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Map f8094;

    /* JADX INFO: renamed from: ۥۣ */
    public final Bitmap f8095;

    public C2431(Bitmap bitmap, Map map) {
        this.f8095 = bitmap;
        this.f8094 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2431)) {
            return false;
        }
        C2431 c2431 = (C2431) obj;
        return this.f8095.equals(c2431.f8095) && AbstractC3831.m6874(this.f8094, c2431.f8094);
    }

    public final int hashCode() {
        return this.f8094.hashCode() + (this.f8095.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f8095 + ", extras=" + this.f8094 + ')';
    }
}
