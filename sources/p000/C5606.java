package p000;

/* JADX INFO: renamed from: ۦِۣؔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5606 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C1039 f18462;

    public C5606(C1039 c1039) {
        this.f18462 = c1039;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5606) && AbstractC3831.m6874(this.f18462, ((C5606) obj).f18462);
    }

    public final int hashCode() {
        C1039 c1039 = this.f18462;
        if (c1039 == null) {
            return 0;
        }
        return c1039.hashCode();
    }

    public final String toString() {
        return "YukiHookResult(hookedMember=" + this.f18462 + ")";
    }
}
