package p000;

/* JADX INFO: renamed from: ۦؚؒۚٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3584 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C3103 f11932;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f11933;

    public C3584(boolean z, C3103 c3103) {
        this.f11933 = z;
        this.f11932 = c3103;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3584 m6401(C3584 c3584, boolean z, C3103 c3103, int i) {
        if ((i & 1) != 0) {
            z = c3584.f11933;
        }
        if ((i & 2) != 0) {
            c3103 = c3584.f11932;
        }
        c3584.getClass();
        return new C3584(z, c3103);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3584)) {
            return false;
        }
        C3584 c3584 = (C3584) obj;
        return this.f11933 == c3584.f11933 && AbstractC3831.m6874(this.f11932, c3584.f11932);
    }

    public final int hashCode() {
        return this.f11932.hashCode() + (Boolean.hashCode(this.f11933) * 31);
    }

    public final String toString() {
        return "ModuleUpdaterStates(isUpdateAvailable=" + this.f11933 + ", repoResponse=" + this.f11932 + ")";
    }
}
