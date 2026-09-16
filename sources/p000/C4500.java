package p000;

/* JADX INFO: renamed from: ۦَٙؖؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4500 implements InterfaceC1400 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f14874;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1249 f14875;

    public C4500(int i, String str) {
        this.f14875 = new C1249(str);
        this.f14874 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4500)) {
            return false;
        }
        C4500 c4500 = (C4500) obj;
        return AbstractC3831.m6874(this.f14875.f4307, c4500.f14875.f4307) && this.f14874 == c4500.f14874;
    }

    public final int hashCode() {
        return (this.f14875.f4307.hashCode() * 31) + this.f14874;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f14875.f4307);
        sb.append("', newCursorPosition=");
        return AbstractC3761.m6638(sb, this.f14874, ')');
    }

    @Override // p000.InterfaceC1400
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo773(C1093 c1093) {
        String str = this.f14875.f4307;
        int i = c1093.f3842;
        if (i != -1) {
            c1093.m2313(i, c1093.f3839, str);
            if (str.length() > 0) {
                c1093.m2308(i, str.length() + i);
            }
        } else {
            int i2 = c1093.f3840;
            c1093.m2313(i2, c1093.f3838, str);
            if (str.length() > 0) {
                c1093.m2308(i2, str.length() + i2);
            }
        }
        int i3 = c1093.f3840;
        int i4 = c1093.f3838;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.f14874;
        int iM7934 = AbstractC4554.m7934(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, c1093.f3841.m1730());
        c1093.m2309(iM7934, iM7934);
    }
}
