package p000;

/* JADX INFO: renamed from: ۥٖؕۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1472 implements InterfaceC1400 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f5008;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1249 f5009;

    public C1472(int i, String str) {
        this(new C1249(str), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1472)) {
            return false;
        }
        C1472 c1472 = (C1472) obj;
        return AbstractC3831.m6874(this.f5009.f4307, c1472.f5009.f4307) && this.f5008 == c1472.f5008;
    }

    public final int hashCode() {
        return (this.f5009.f4307.hashCode() * 31) + this.f5008;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f5009.f4307);
        sb.append("', newCursorPosition=");
        return AbstractC3761.m6638(sb, this.f5008, ')');
    }

    @Override // p000.InterfaceC1400
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo773(C1093 c1093) {
        int i = c1093.f3842;
        C1249 c1249 = this.f5009;
        if (i != -1) {
            c1093.m2313(i, c1093.f3839, c1249.f4307);
        } else {
            c1093.m2313(c1093.f3840, c1093.f3838, c1249.f4307);
        }
        int i2 = c1093.f3840;
        int i3 = c1093.f3838;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.f5008;
        int iM7934 = AbstractC4554.m7934(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - c1249.f4307.length(), 0, c1093.f3841.m1730());
        c1093.m2309(iM7934, iM7934);
    }

    public C1472(C1249 c1249, int i) {
        this.f5009 = c1249;
        this.f5008 = i;
    }
}
