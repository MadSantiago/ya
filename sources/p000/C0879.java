package p000;

/* JADX INFO: renamed from: ۥٌؑۧؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0879 implements InterfaceC4686 {

    /* JADX INFO: renamed from: ۥۗ */
    public final String f3211;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f3212;

    /* JADX INFO: renamed from: ۥؗ */
    public final C4852 f3210 = AbstractC2774.m5183(C5364.f17692);

    /* JADX INFO: renamed from: ۦؑ */
    public final C4852 f3213 = AbstractC2774.m5183(Boolean.TRUE);

    public C0879(int i, String str) {
        this.f3212 = i;
        this.f3211 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0879) {
            return this.f3212 == ((C0879) obj).f3212;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3212;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f3211);
        sb.append('(');
        sb.append(m1866().f17695);
        sb.append(", ");
        sb.append(m1866().f17694);
        sb.append(", ");
        sb.append(m1866().f17693);
        sb.append(", ");
        return AbstractC3761.m6638(sb, m1866().f17696, ')');
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1865(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        return m1866().f17693;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C5364 m1866() {
        return (C5364) this.f3210.getValue();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m1867(boolean z) {
        this.f3213.setValue(Boolean.valueOf(z));
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1868(InterfaceC2880 interfaceC2880) {
        return m1866().f17694;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo1869(InterfaceC2880 interfaceC2880) {
        return m1866().f17696;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1870(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        return m1866().f17695;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m1871(C2639 c2639, int i) {
        int i2 = this.f3212;
        if (i == 0 || (i & i2) != 0) {
            this.f3210.setValue(c2639.f8768.mo2752(i2));
            m1867(c2639.f8768.mo2751(i2));
        }
    }
}
