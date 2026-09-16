package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦٓؕۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4130 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4130 f13751 = new C4130(C0204.f751);

    /* JADX INFO: renamed from: ۥۣ */
    public final Map f13752;

    public C4130(Map map) {
        this.f13752 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4130) {
            return AbstractC3831.m6874(this.f13752, ((C4130) obj).f13752);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13752.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f13752 + ')';
    }
}
