package p000;

/* JADX INFO: renamed from: ۥُٜؖؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1172
public final class C1060 {
    public static final C3038 Companion = new C3038();

    /* JADX INFO: renamed from: ۥۗ */
    public final String f3737;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f3738;

    public /* synthetic */ C1060(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC5568.m9392(i, 3, C4304.f14238.mo193());
            throw null;
        }
        this.f3738 = i2;
        this.f3737 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1060)) {
            return false;
        }
        C1060 c1060 = (C1060) obj;
        return this.f3738 == c1060.f3738 && AbstractC3831.m6874(this.f3737, c1060.f3737);
    }

    public final int hashCode() {
        return this.f3737.hashCode() + (Integer.hashCode(this.f3738) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.f3738);
        sb.append(", uuid=");
        return AbstractC5078.m8678(sb, this.f3737, ')');
    }

    public C1060(int i, String str) {
        this.f3738 = i;
        this.f3737 = str;
    }
}
