package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦٌٖٕؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3741 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f12463;

    public C3741(Object obj) {
        this.f12463 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3741.class == obj.getClass() && this.f12463.equals(((C3741) obj).f12463);
    }

    public final int hashCode() {
        return Objects.hash(this.f12463, null);
    }
}
