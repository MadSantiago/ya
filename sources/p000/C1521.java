package p000;

/* JADX INFO: renamed from: ۥّٗؓٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1172
public final class C1521 {
    public static final C3799 Companion = new C3799();

    /* JADX INFO: renamed from: ۥؗ */
    public final int f5160;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f5161;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f5162;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f5163;

    public /* synthetic */ C1521(int i, String str, String str2, int i2, long j) {
        if (15 != (i & 15)) {
            AbstractC5568.m9392(i, 15, C3511.f11625.mo193());
            throw null;
        }
        this.f5162 = str;
        this.f5161 = str2;
        this.f5160 = i2;
        this.f5163 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1521)) {
            return false;
        }
        C1521 c1521 = (C1521) obj;
        return AbstractC3831.m6874(this.f5162, c1521.f5162) && AbstractC3831.m6874(this.f5161, c1521.f5161) && this.f5160 == c1521.f5160 && this.f5163 == c1521.f5163;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5163) + AbstractC2049.m3999(this.f5160, AbstractC5078.m8674(this.f5162.hashCode() * 31, 31, this.f5161), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f5162 + ", firstSessionId=" + this.f5161 + ", sessionIndex=" + this.f5160 + ", sessionStartTimestampUs=" + this.f5163 + ')';
    }

    public C1521(long j, String str, String str2, int i) {
        this.f5162 = str;
        this.f5161 = str2;
        this.f5160 = i;
        this.f5163 = j;
    }
}
