package p000;

/* JADX INFO: renamed from: ۥّٝۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1172
public final class C1185 {
    public static final C1738 Companion = new C1738();

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f4072;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f4073;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f4074;

    public /* synthetic */ C1185(int i, String str, boolean z, boolean z2) {
        if (1 != (i & 1)) {
            AbstractC5568.m9392(i, 1, C1036.f3669.mo193());
            throw null;
        }
        this.f4074 = str;
        if ((i & 2) == 0) {
            this.f4073 = false;
        } else {
            this.f4073 = z;
        }
        if ((i & 4) == 0) {
            this.f4072 = false;
        } else {
            this.f4072 = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1185)) {
            return false;
        }
        C1185 c1185 = (C1185) obj;
        return AbstractC3831.m6874(this.f4074, c1185.f4074) && this.f4073 == c1185.f4073 && this.f4072 == c1185.f4072;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4072) + AbstractC5078.m8672(this.f4074.hashCode() * 31, 31, this.f4073);
    }

    public final String toString() {
        return "HostHooksData(description=" + this.f4074 + ", exists=" + this.f4073 + ", exception=" + this.f4072 + ")";
    }

    public C1185(int i, String str) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) == 0;
        this.f4074 = str;
        this.f4073 = z;
        this.f4072 = z2;
    }
}
