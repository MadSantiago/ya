package p000;

/* JADX INFO: renamed from: ۥٍۧٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2890 implements InterfaceC1400 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f9639;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f9640;

    public C2890(int i, int i2) {
        this.f9640 = i;
        this.f9639 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2890)) {
            return false;
        }
        C2890 c2890 = (C2890) obj;
        return this.f9640 == c2890.f9640 && this.f9639 == c2890.f9639;
    }

    public final int hashCode() {
        return (this.f9640 * 31) + this.f9639;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f9640);
        sb.append(", end=");
        return AbstractC3761.m6638(sb, this.f9639, ')');
    }

    @Override // p000.InterfaceC1400
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo773(C1093 c1093) {
        int iM7934 = AbstractC4554.m7934(this.f9640, 0, c1093.f3841.m1730());
        int iM7935 = AbstractC4554.m7934(this.f9639, 0, c1093.f3841.m1730());
        if (iM7934 < iM7935) {
            c1093.m2309(iM7934, iM7935);
        } else {
            c1093.m2309(iM7935, iM7934);
        }
    }
}
