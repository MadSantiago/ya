package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥًؙؗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0747 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4434 f2712;

    /* JADX INFO: renamed from: ۥُ */
    public final int f2713;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f2714;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3564 f2715;

    /* JADX INFO: renamed from: ۥۜ */
    public final int f2716;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1249 f2717;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4745 f2718;

    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC4745 f2719;

    /* JADX INFO: renamed from: ۦٛ */
    public final List f2720;

    /* JADX INFO: renamed from: ۦۗ */
    public final InterfaceC4745 f2721;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f2722;

    public C0747(C1249 c1249, C3564 c3564, InterfaceC4434 interfaceC4434, InterfaceC4745 interfaceC4745, int i, boolean z, int i2, int i3, List list, InterfaceC4745 interfaceC4746, InterfaceC4745 interfaceC4747) {
        this.f2717 = c1249;
        this.f2715 = c3564;
        this.f2712 = interfaceC4434;
        this.f2718 = interfaceC4745;
        this.f2713 = i;
        this.f2714 = z;
        this.f2722 = i2;
        this.f2716 = i3;
        this.f2720 = list;
        this.f2719 = interfaceC4746;
        this.f2721 = interfaceC4747;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0747)) {
            return false;
        }
        C0747 c0747 = (C0747) obj;
        return AbstractC3831.m6874(this.f2717, c0747.f2717) && AbstractC3831.m6874(this.f2715, c0747.f2715) && AbstractC3831.m6874(this.f2720, c0747.f2720) && AbstractC3831.m6874(this.f2712, c0747.f2712) && this.f2718 == c0747.f2718 && this.f2721 == c0747.f2721 && this.f2713 == c0747.f2713 && this.f2714 == c0747.f2714 && this.f2722 == c0747.f2722 && this.f2716 == c0747.f2716 && this.f2719 == c0747.f2719;
    }

    public final int hashCode() {
        int iHashCode = (this.f2712.hashCode() + AbstractC5078.m8668(this.f2715, this.f2717.hashCode() * 31, 31)) * 31;
        InterfaceC4745 interfaceC4745 = this.f2718;
        int iM8672 = (((AbstractC5078.m8672(AbstractC2049.m3999(this.f2713, (iHashCode + (interfaceC4745 != null ? interfaceC4745.hashCode() : 0)) * 31, 31), 31, this.f2714) + this.f2722) * 31) + this.f2716) * 31;
        List list = this.f2720;
        int iHashCode2 = (iM8672 + (list != null ? list.hashCode() : 0)) * 31;
        InterfaceC4745 interfaceC4746 = this.f2719;
        int iHashCode3 = (iHashCode2 + (interfaceC4746 != null ? interfaceC4746.hashCode() : 0)) * 29791;
        InterfaceC4745 interfaceC4747 = this.f2721;
        return iHashCode3 + (interfaceC4747 != null ? interfaceC4747.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        boolean z;
        C1249 c1249;
        boolean zM6874;
        boolean z2;
        boolean z3;
        List list;
        List list2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        InterfaceC4434 interfaceC4434;
        InterfaceC4434 interfaceC4435;
        int i5;
        int i6;
        InterfaceC4745 interfaceC4745;
        InterfaceC4745 interfaceC4746;
        InterfaceC4745 interfaceC4747;
        InterfaceC4745 interfaceC4748;
        InterfaceC4745 interfaceC4749;
        InterfaceC4745 interfaceC47410;
        C2640 c2640 = (C2640) abstractC5381;
        C3564 c3564 = c2640.f8781;
        boolean z6 = false;
        boolean z7 = true;
        C3564 c3565 = this.f2715;
        if (c3565 != c3564) {
            if (!c3565.f11803.m1243(c3564.f11803)) {
                z = true;
            }
            String str = c2640.f8770.f4307;
            c1249 = this.f2717;
            zM6874 = AbstractC3831.m6874(str, c1249.f4307);
            boolean zM6875 = AbstractC3831.m6874(c2640.f8770.f4308, c1249.f4308);
            if (zM6874 || !zM6875) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c2640.f8770 = c1249;
            }
            if (!zM6874) {
                c2640.f8773 = null;
            }
            z3 = !c2640.f8781.m6358(c3565);
            c2640.f8781 = c3565;
            list = c2640.f8779;
            list2 = this.f2720;
            if (!AbstractC3831.m6874(list, list2)) {
                c2640.f8779 = list2;
                z3 = true;
            }
            i = c2640.f8777;
            i2 = this.f2716;
            if (i != i2) {
                c2640.f8777 = i2;
                z3 = true;
            }
            i3 = c2640.f8775;
            i4 = this.f2722;
            if (i3 != i4) {
                c2640.f8775 = i4;
                z3 = true;
            }
            z4 = c2640.f8776;
            z5 = this.f2714;
            if (z4 != z5) {
                c2640.f8776 = z5;
                z3 = true;
            }
            interfaceC4434 = c2640.f8771;
            interfaceC4435 = this.f2712;
            if (!AbstractC3831.m6874(interfaceC4434, interfaceC4435)) {
                c2640.f8771 = interfaceC4435;
                z3 = true;
            }
            i5 = c2640.f8778;
            i6 = this.f2713;
            if (i5 != i6) {
                c2640.f8778 = i6;
                z3 = true;
            }
            interfaceC4745 = c2640.f8774;
            interfaceC4746 = this.f2718;
            if (interfaceC4745 != interfaceC4746) {
                c2640.f8774 = interfaceC4746;
                z6 = true;
            }
            interfaceC4747 = c2640.f8780;
            interfaceC4748 = this.f2719;
            if (interfaceC4747 != interfaceC4748) {
                c2640.f8780 = interfaceC4748;
                z6 = true;
            }
            interfaceC4749 = c2640.f8769;
            interfaceC47410 = this.f2721;
            if (interfaceC4749 != interfaceC47410) {
                c2640.f8769 = interfaceC47410;
            } else {
                z7 = z6;
            }
            if (z2 || z3 || z7) {
                c2640.m4956().m4457(c2640.f8770, c2640.f8781, c2640.f8771, c2640.f8778, c2640.f8776, c2640.f8775, c2640.f8777, c2640.f8779);
            }
            if (c2640.f17786) {
                if (z2 || (z && c2640.f8772 != null)) {
                    AbstractC0186.m412(c2640);
                }
                if (z2 || z3 || z7) {
                    C5063.m8642(c2640);
                    AbstractC5378.m9047(c2640);
                }
                if (z) {
                    AbstractC5378.m9047(c2640);
                }
            }
            return;
        }
        c3565.getClass();
        z = false;
        String str2 = c2640.f8770.f4307;
        c1249 = this.f2717;
        zM6874 = AbstractC3831.m6874(str2, c1249.f4307);
        boolean zM6876 = AbstractC3831.m6874(c2640.f8770.f4308, c1249.f4308);
        if (zM6874) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (z2) {
            c2640.f8770 = c1249;
        }
        if (!zM6874) {
            c2640.f8773 = null;
        }
        z3 = !c2640.f8781.m6358(c3565);
        c2640.f8781 = c3565;
        list = c2640.f8779;
        list2 = this.f2720;
        if (!AbstractC3831.m6874(list, list2)) {
            c2640.f8779 = list2;
            z3 = true;
        }
        i = c2640.f8777;
        i2 = this.f2716;
        if (i != i2) {
            c2640.f8777 = i2;
            z3 = true;
        }
        i3 = c2640.f8775;
        i4 = this.f2722;
        if (i3 != i4) {
            c2640.f8775 = i4;
            z3 = true;
        }
        z4 = c2640.f8776;
        z5 = this.f2714;
        if (z4 != z5) {
            c2640.f8776 = z5;
            z3 = true;
        }
        interfaceC4434 = c2640.f8771;
        interfaceC4435 = this.f2712;
        if (!AbstractC3831.m6874(interfaceC4434, interfaceC4435)) {
            c2640.f8771 = interfaceC4435;
            z3 = true;
        }
        i5 = c2640.f8778;
        i6 = this.f2713;
        if (i5 != i6) {
            c2640.f8778 = i6;
            z3 = true;
        }
        interfaceC4745 = c2640.f8774;
        interfaceC4746 = this.f2718;
        if (interfaceC4745 != interfaceC4746) {
            c2640.f8774 = interfaceC4746;
            z6 = true;
        }
        interfaceC4747 = c2640.f8780;
        interfaceC4748 = this.f2719;
        if (interfaceC4747 != interfaceC4748) {
            c2640.f8780 = interfaceC4748;
            z6 = true;
        }
        interfaceC4749 = c2640.f8769;
        interfaceC47410 = this.f2721;
        if (interfaceC4749 != interfaceC47410) {
            c2640.f8769 = interfaceC47410;
        } else {
            z7 = z6;
        }
        if (z2) {
            c2640.m4956().m4457(c2640.f8770, c2640.f8781, c2640.f8771, c2640.f8778, c2640.f8776, c2640.f8775, c2640.f8777, c2640.f8779);
        } else {
            c2640.m4956().m4457(c2640.f8770, c2640.f8781, c2640.f8771, c2640.f8778, c2640.f8776, c2640.f8775, c2640.f8777, c2640.f8779);
        }
        if (c2640.f17786) {
            return;
        }
        if (z2) {
            AbstractC0186.m412(c2640);
        } else {
            AbstractC0186.m412(c2640);
        }
        if (z2) {
            C5063.m8642(c2640);
            AbstractC5378.m9047(c2640);
        } else {
            C5063.m8642(c2640);
            AbstractC5378.m9047(c2640);
        }
        if (z) {
            AbstractC5378.m9047(c2640);
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2640 c2640 = new C2640();
        c2640.f8770 = this.f2717;
        c2640.f8781 = this.f2715;
        c2640.f8771 = this.f2712;
        c2640.f8774 = this.f2718;
        c2640.f8778 = this.f2713;
        c2640.f8776 = this.f2714;
        c2640.f8775 = this.f2722;
        c2640.f8777 = this.f2716;
        c2640.f8779 = this.f2720;
        c2640.f8780 = this.f2719;
        c2640.f8769 = this.f2721;
        return c2640;
    }
}
