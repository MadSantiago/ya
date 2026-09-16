package p000;

/* JADX INFO: renamed from: ۦٌِؔۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3721 implements InterfaceC4686 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C4852 f12395;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f12396;

    public C3721(C5295 c5295, String str) {
        this.f12396 = str;
        this.f12395 = AbstractC2774.m5183(c5295);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3721) {
            return AbstractC3831.m6874(m6572(), ((C3721) obj).m6572());
        }
        return false;
    }

    public final int hashCode() {
        return this.f12396.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f12396);
        sb.append("(left=");
        sb.append(m6572().f17442);
        sb.append(", top=");
        sb.append(m6572().f17441);
        sb.append(", right=");
        sb.append(m6572().f17440);
        sb.append(", bottom=");
        return AbstractC3761.m6638(sb, m6572().f17443, ')');
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1865(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        return m6572().f17440;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C5295 m6572() {
        return (C5295) this.f12395.getValue();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m6573(C5295 c5295) {
        this.f12395.setValue(c5295);
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1868(InterfaceC2880 interfaceC2880) {
        return m6572().f17441;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo1869(InterfaceC2880 interfaceC2880) {
        return m6572().f17443;
    }

    @Override // p000.InterfaceC4686
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1870(InterfaceC2880 interfaceC2880, EnumC2459 enumC2459) {
        return m6572().f17442;
    }
}
