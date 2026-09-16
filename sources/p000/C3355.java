package p000;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: renamed from: ۦؚؖؔ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3355 {

    /* JADX INFO: renamed from: ۥؗ */
    public final UUID f11216;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4645 f11217;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4645 f11218;

    public C3355(C4645 c4645, C4645 c4646, UUID uuid) {
        this.f11218 = c4645;
        this.f11217 = c4646;
        this.f11216 = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3355)) {
            return false;
        }
        C3355 c3355 = (C3355) obj;
        return this.f11218.equals(c3355.f11218) && this.f11217.equals(c3355.f11217) && this.f11216.equals(c3355.f11216);
    }

    public final int hashCode() {
        return (this.f11216.hashCode() ^ ((((this.f11218.hashCode() ^ 1000003) * 1000003) ^ this.f11217.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.f11218);
    }
}
