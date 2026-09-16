package p000;

/* JADX INFO: renamed from: ۦؘۗؐٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C4984 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC5731 f16491;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f16492;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f16493;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f16494;

    public C4984(int i, boolean z, InterfaceC5731 interfaceC5731, Object obj) {
        this.f16493 = i;
        this.f16492 = z;
        this.f16491 = interfaceC5731;
        this.f16494 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4984.class != obj.getClass()) {
            return false;
        }
        C4984 c4984 = (C4984) obj;
        return this.f16493 == c4984.f16493 && this.f16492 == c4984.f16492 && this.f16494.equals(c4984.f16494);
    }

    public final int hashCode() {
        return this.f16494.hashCode() + AbstractC5078.m8672(AbstractC3761.m6632(this.f16493) * 31, 31, this.f16492);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C5853 c5853 = (C5853) abstractC5381;
        c5853.f19303 = this.f16493;
        c5853.f19305 = this.f16492;
        c5853.f19304 = this.f16491;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C5853 c5853 = new C5853();
        c5853.f19303 = this.f16493;
        c5853.f19305 = this.f16492;
        c5853.f19304 = this.f16491;
        return c5853;
    }
}
