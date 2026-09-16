package p000;

/* JADX INFO: renamed from: ۥًَٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1023 extends AbstractC5334 implements InterfaceC2252 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4745 f3609;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f3610;

    public C1023(InterfaceC4745 interfaceC4745, boolean z) {
        this.f3610 = z;
        this.f3609 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1023)) {
            return false;
        }
        C1023 c1023 = (C1023) obj;
        return this.f3610 == c1023.f3610 && this.f3609 == c1023.f3609;
    }

    public final int hashCode() {
        return this.f3609.hashCode() + (Boolean.hashCode(this.f3610) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2129 c2129 = (C2129) abstractC5381;
        c2129.f6989 = this.f3610;
        c2129.f6990 = this.f3609;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C2129(this.f3610, false, this.f3609);
    }
}
