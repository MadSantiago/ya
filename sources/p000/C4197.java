package p000;

/* JADX INFO: renamed from: ۦٕٔؗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4197 implements InterfaceC1400 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f13951;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f13952;

    public C4197(int i, int i2) {
        this.f13952 = i;
        this.f13951 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4197)) {
            return false;
        }
        C4197 c4197 = (C4197) obj;
        return this.f13952 == c4197.f13952 && this.f13951 == c4197.f13951;
    }

    public final int hashCode() {
        return (this.f13952 * 31) + this.f13951;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f13952);
        sb.append(", end=");
        return AbstractC3761.m6638(sb, this.f13951, ')');
    }

    @Override // p000.InterfaceC1400
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo773(C1093 c1093) {
        boolean z = c1093.f3842 != -1;
        C0835 c0835 = c1093.f3841;
        if (z) {
            c1093.f3842 = -1;
            c1093.f3839 = -1;
        }
        int iM7934 = AbstractC4554.m7934(this.f13952, 0, c0835.m1730());
        int iM7935 = AbstractC4554.m7934(this.f13951, 0, c0835.m1730());
        if (iM7934 != iM7935) {
            if (iM7934 < iM7935) {
                c1093.m2308(iM7934, iM7935);
            } else {
                c1093.m2308(iM7935, iM7934);
            }
        }
    }
}
