package p000;

/* JADX INFO: renamed from: ۥؚْؕؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1215 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f4199;

    /* JADX INFO: renamed from: ۥُ */
    public final C2155 f4200;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC4745 f4201;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2243 f4202;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f4203;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f4204;

    public C1215(boolean z, C2243 c2243, boolean z2, boolean z3, C2155 c2155, InterfaceC4745 interfaceC4745) {
        this.f4203 = z;
        this.f4202 = c2243;
        this.f4199 = z2;
        this.f4204 = z3;
        this.f4200 = c2155;
        this.f4201 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1215.class != obj.getClass()) {
            return false;
        }
        C1215 c1215 = (C1215) obj;
        return this.f4203 == c1215.f4203 && AbstractC3831.m6874(this.f4202, c1215.f4202) && this.f4199 == c1215.f4199 && this.f4204 == c1215.f4204 && AbstractC3831.m6874(this.f4200, c1215.f4200) && this.f4201 == c1215.f4201;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4203) * 31;
        C2243 c2243 = this.f4202;
        int iM8672 = AbstractC5078.m8672(AbstractC5078.m8672((iHashCode + (c2243 != null ? c2243.hashCode() : 0)) * 961, 31, this.f4199), 31, this.f4204);
        C2155 c2155 = this.f4200;
        return this.f4201.hashCode() + ((iM8672 + (c2155 != null ? Integer.hashCode(c2155.f7116) : 0)) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C5754 c5754 = (C5754) abstractC5381;
        boolean z = c5754.f18970;
        boolean z2 = this.f4203;
        if (z != z2) {
            c5754.f18970 = z2;
            AbstractC0186.m412(c5754);
        }
        c5754.f18971 = this.f4201;
        c5754.m9754(this.f4202, null, this.f4199, this.f4204, null, this.f4200, c5754.f18972);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C5754(this.f4203, this.f4202, this.f4199, this.f4204, this.f4200, this.f4201);
    }
}
