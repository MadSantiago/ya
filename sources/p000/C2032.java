package p000;

/* JADX INFO: renamed from: ۥٟۣۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2032 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f6691;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3177 f6692;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3177 f6693;

    public C2032(C3177 c3177, C3177 c3178, boolean z) {
        this.f6693 = c3177;
        this.f6692 = c3178;
        this.f6691 = z;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2032 m3982(C2032 c2032, C3177 c3177, C3177 c3178, boolean z, int i) {
        if ((i & 1) != 0) {
            c3177 = c2032.f6693;
        }
        if ((i & 2) != 0) {
            c3178 = c2032.f6692;
        }
        c2032.getClass();
        return new C2032(c3177, c3178, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2032)) {
            return false;
        }
        C2032 c2032 = (C2032) obj;
        return AbstractC3831.m6874(this.f6693, c2032.f6693) && AbstractC3831.m6874(this.f6692, c2032.f6692) && this.f6691 == c2032.f6691;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6691) + ((this.f6692.hashCode() + (this.f6693.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f6693 + ", end=" + this.f6692 + ", handlesCrossed=" + this.f6691 + ')';
    }
}
