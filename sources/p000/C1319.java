package p000;

/* JADX INFO: renamed from: ۥٕٔؒؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1319 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C3018 f4544 = new C3018(28);

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f4545;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC2609 f4546;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f4547;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4115 f4548;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC2609 f4549;

    public C1319(InterfaceC4115 interfaceC4115, boolean z, boolean z2, C5499 c5499, InterfaceC2609 interfaceC2609) {
        this.f4548 = interfaceC4115;
        this.f4547 = z;
        this.f4545 = z2;
        this.f4549 = c5499;
        this.f4546 = interfaceC2609;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1319.class != obj.getClass()) {
            return false;
        }
        C1319 c1319 = (C1319) obj;
        return AbstractC3831.m6874(this.f4548, c1319.f4548) && this.f4547 == c1319.f4547 && this.f4545 == c1319.f4545 && AbstractC3831.m6874(this.f4549, c1319.f4549) && AbstractC3831.m6874(this.f4546, c1319.f4546);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f4546.hashCode() + ((this.f4549.hashCode() + AbstractC5078.m8672(AbstractC5078.m8672((EnumC1616.f5425.hashCode() + (this.f4548.hashCode() * 31)) * 31, 961, this.f4547), 31, this.f4545)) * 31)) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        boolean z;
        boolean z2;
        C3923 c3923 = (C3923) abstractC5381;
        InterfaceC4115 interfaceC4115 = c3923.f13075;
        InterfaceC4115 interfaceC4116 = this.f4548;
        if (AbstractC3831.m6874(interfaceC4115, interfaceC4116)) {
            z = false;
        } else {
            c3923.f13075 = interfaceC4116;
            z = true;
        }
        EnumC1616 enumC1616 = c3923.f13079;
        EnumC1616 enumC1617 = EnumC1616.f5425;
        if (enumC1616 != enumC1617) {
            c3923.f13079 = enumC1617;
            z2 = true;
        } else {
            z2 = z;
        }
        c3923.f13077 = this.f4549;
        c3923.f13078 = this.f4546;
        c3923.f13076 = this.f4545;
        c3923.m9884(f4544, this.f4547, null, enumC1617, z2);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3018 c3018 = f4544;
        boolean z = this.f4547;
        EnumC1616 enumC1616 = EnumC1616.f5425;
        C3923 c3923 = new C3923(c3018, z, null, enumC1616);
        c3923.f13075 = this.f4548;
        c3923.f13079 = enumC1616;
        c3923.f13076 = this.f4545;
        c3923.f13077 = this.f4549;
        c3923.f13078 = this.f4546;
        return c3923;
    }
}
