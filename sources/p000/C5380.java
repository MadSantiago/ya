package p000;

/* JADX INFO: renamed from: ۦّۣ۠ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5380 implements InterfaceC0705 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0705 f17776;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0705 f17777;

    public C5380(InterfaceC0705 interfaceC0705, InterfaceC0705 interfaceC0706) {
        this.f17777 = interfaceC0705;
        this.f17776 = interfaceC0706;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5380)) {
            return false;
        }
        C5380 c5380 = (C5380) obj;
        return this.f17777.equals(c5380.f17777) && AbstractC3831.m6874(this.f17776, c5380.f17776);
    }

    public final int hashCode() {
        return (this.f17776.hashCode() * 31) + this.f17777.hashCode();
    }

    public final String toString() {
        return AbstractC5078.m8678(new StringBuilder("["), (String) mo1573(C3136.f10574, ""), ']');
    }

    @Override // p000.InterfaceC0705
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1572(InterfaceC4745 interfaceC4745) {
        return this.f17777.mo1572(interfaceC4745) && this.f17776.mo1572(interfaceC4745);
    }

    @Override // p000.InterfaceC0705
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo1573(InterfaceC5731 interfaceC5731, Object obj) {
        return this.f17776.mo1573(interfaceC5731, this.f17777.mo1573(interfaceC5731, obj));
    }
}
