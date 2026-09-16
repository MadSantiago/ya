package p000;

/* JADX INFO: renamed from: ۥٕٝؖۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1902 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3945 f6283;

    public C1902(C3945 c3945) {
        this.f6283 = c3945;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1902) {
            return AbstractC3831.m6874(this.f6283, ((C1902) obj).f6283);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC5078.m8672(this.f6283.hashCode() * 31, 31, false);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C0699 c0699 = (C0699) abstractC5381;
        c0699.f2539 = this.f6283;
        c0699.f2540 = true;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C0699 c0699 = new C0699();
        c0699.f2539 = this.f6283;
        c0699.f2540 = true;
        return c0699;
    }
}
