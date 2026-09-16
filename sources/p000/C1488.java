package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥؙٖۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1172
public final class C1488 {
    public static final C0205 Companion = new C0205();

    /* JADX INFO: renamed from: ۥؗ */
    public static final InterfaceC5130[] f5052 = {null, AbstractC3933.m7095(2, new C0062(24))};

    /* JADX INFO: renamed from: ۥۗ */
    public final List f5053;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f5054;

    public /* synthetic */ C1488(int i, String str, List list) {
        if (3 != (i & 3)) {
            AbstractC5568.m9392(i, 3, C0370.f1358.mo193());
            throw null;
        }
        this.f5054 = str;
        this.f5053 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1488)) {
            return false;
        }
        C1488 c1488 = (C1488) obj;
        return AbstractC3831.m6874(this.f5054, c1488.f5054) && AbstractC3831.m6874(this.f5053, c1488.f5053);
    }

    public final int hashCode() {
        return this.f5053.hashCode() + (this.f5054.hashCode() * 31);
    }

    public final String toString() {
        return "DeleteRemoteParams(cacheDir=" + this.f5054 + ", options=" + this.f5053 + ")";
    }

    public C1488(String str, List list) {
        this.f5054 = str;
        this.f5053 = list;
    }
}
