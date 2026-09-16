package p000;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؙۤؔؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5649 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Resources.Theme f18602;

    /* JADX INFO: renamed from: ۥۣ */
    public final Resources f18603;

    public C5649(Resources resources, Resources.Theme theme) {
        this.f18603 = resources;
        this.f18602 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5649.class == obj.getClass()) {
            C5649 c5649 = (C5649) obj;
            if (this.f18603.equals(c5649.f18603) && Objects.equals(this.f18602, c5649.f18602)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18603, this.f18602);
    }
}
