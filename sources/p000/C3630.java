package p000;

import android.content.res.Resources;

/* JADX INFO: renamed from: ۦَؚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3630 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f12117;

    /* JADX INFO: renamed from: ۥۣ */
    public final Resources.Theme f12118;

    public C3630(Resources.Theme theme, int i) {
        this.f12118 = theme;
        this.f12117 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3630)) {
            return false;
        }
        C3630 c3630 = (C3630) obj;
        return AbstractC3831.m6874(this.f12118, c3630.f12118) && this.f12117 == c3630.f12117;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12117) + (this.f12118.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f12118);
        sb.append(", id=");
        return AbstractC3761.m6638(sb, this.f12117, ')');
    }
}
