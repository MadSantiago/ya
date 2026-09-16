package p000;

/* JADX INFO: renamed from: ۥٟؑۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1987 {

    /* JADX INFO: renamed from: ۥۗ */
    public C1249 f6558;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1249 f6559;

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f6557 = false;

    /* JADX INFO: renamed from: ۦؑ */
    public C2379 f6560 = null;

    public C1987(C1249 c1249, C1249 c12410) {
        this.f6559 = c1249;
        this.f6558 = c12410;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1987)) {
            return false;
        }
        C1987 c1987 = (C1987) obj;
        return AbstractC3831.m6874(this.f6559, c1987.f6559) && AbstractC3831.m6874(this.f6558, c1987.f6558) && this.f6557 == c1987.f6557 && AbstractC3831.m6874(this.f6560, c1987.f6560);
    }

    public final int hashCode() {
        int iM8672 = AbstractC5078.m8672((this.f6558.hashCode() + (this.f6559.hashCode() * 31)) * 31, 31, this.f6557);
        C2379 c2379 = this.f6560;
        return iM8672 + (c2379 == null ? 0 : c2379.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f6559) + ", substitution=" + ((Object) this.f6558) + ", isShowingSubstitution=" + this.f6557 + ", layoutCache=" + this.f6560 + ')';
    }
}
