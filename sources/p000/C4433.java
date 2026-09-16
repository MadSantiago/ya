package p000;

/* JADX INFO: renamed from: ۦؚ٘ؔ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4433 implements InterfaceC1116 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f14614;

    public C4433(String str) {
        this.f14614 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4433) {
            return AbstractC3831.m6874(this.f14614, ((C4433) obj).f14614);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14614.hashCode();
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f14614, ')');
    }
}
