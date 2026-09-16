package p000;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import java.util.List;

/* JADX INFO: renamed from: ۥۤؔۦؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2677 extends AbstractC4485 implements InterfaceC0174, InterfaceC5671 {

    /* JADX INFO: renamed from: ۥِ */
    public final C5893 f8869;

    /* JADX INFO: renamed from: ۥۘ */
    public final C3468 f8870;

    /* JADX INFO: renamed from: ۥۡ */
    public C2851 f8871;

    /* JADX INFO: renamed from: ۥۢ */
    public C4164 f8872;

    /* JADX INFO: renamed from: ۥۥ */
    public final C3323 f8873;

    /* JADX INFO: renamed from: ۥۨ */
    public final C3645 f8874;

    /* JADX INFO: renamed from: ۦ */
    public C4020 f8875;

    /* JADX INFO: renamed from: ۦؔ */
    public final C2567 f8876;

    /* JADX INFO: renamed from: ۦٝ */
    public C3031 f8877;

    /* JADX INFO: renamed from: ۦٞ */
    public C5484 f8878;

    /* JADX INFO: renamed from: ۦ۠ */
    public final C4545 f8879;

    /* JADX INFO: renamed from: ۦۧ */
    public InterfaceC0738 f8880;

    public C2677(C2851 c2851, InterfaceC3762 interfaceC3762, InterfaceC0738 interfaceC0738, C2243 c2243, EnumC1616 enumC1616, InterfaceC3096 interfaceC3096, boolean z, boolean z2) {
        super(AbstractC2927.f9843, z, c2243, enumC1616);
        this.f8871 = c2851;
        this.f8880 = interfaceC0738;
        C3323 c3323 = new C3323();
        this.f8873 = c3323;
        C3645 c3645 = new C3645(new C5468(new C3121(AbstractC2927.f9844)));
        this.f8874 = c3645;
        C2851 c2852 = this.f8871;
        InterfaceC0738 interfaceC0739 = this.f8880;
        C4545 c4545 = new C4545(interfaceC3096, c2852, interfaceC0739 == null ? c3645 : interfaceC0739, enumC1616, z2, c3323, this, new C0197(this, 0));
        this.f8879 = c4545;
        C5893 c5893 = new C5893(c4545, z);
        this.f8869 = c5893;
        C3468 c3468 = new C3468(2, null, 10);
        m5603(c3468);
        this.f8870 = c3468;
        C2567 c2567 = new C2567(enumC1616, c4545, z2, interfaceC3762, new C0197(this, 1));
        m5603(c2567);
        this.f8876 = c2567;
        m5603(new C1386(c5893, c3323));
        C3957 c3957 = new C3957();
        c3957.f13229 = c2567;
        m5603(c3957);
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        if (this.f17786) {
            InterfaceC2880 interfaceC2880 = AbstractC5537.m9270(this).f2236;
            C3645 c3645 = this.f8874;
            c3645.getClass();
            c3645.f12206 = new C5468(new C3121(interfaceC2880));
        }
        C3031 c3031 = this.f8877;
        if (c3031 != null) {
            c3031.f8529 = AbstractC5537.m9270(this).f2236;
        }
        C5484 c5484 = this.f8878;
        if (c5484 != null) {
            c5484.f8529 = AbstractC5537.m9270(this).f2236;
        }
    }

    @Override // p000.AbstractC4485
    /* JADX INFO: renamed from: ۥٌٍۣؕ, reason: contains not printable characters */
    public final void mo9875(C0457 c0457) {
        AbstractC2765.m5135(this.f8873.m6097(), null, 0, new C5030(c0457, this, null, 14), 3);
    }

    @Override // p000.InterfaceC0174
    /* JADX INFO: renamed from: ۥۡ */
    public final boolean mo363(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f14822 || ((!AbstractC0708.m1574(AbstractC1434.m3030(keyEvent), AbstractC0708.f2602) && !AbstractC0708.m1574(AbstractC1631.m3422(keyEvent.getKeyCode()), AbstractC0708.f2575)) || AbstractC1434.m3056(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.f8879.f15016 == EnumC1616.f5425;
        C2567 c2567 = this.f8876;
        if (z) {
            int iM4843 = (int) (c2567.m4843() & 4294967295L);
            float f = AbstractC0708.m1574(AbstractC1631.m3422(keyEvent.getKeyCode()), AbstractC0708.f2575) ? iM4843 : -iM4843;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        } else {
            int iM4844 = (int) (c2567.m4843() >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(AbstractC0708.m1574(AbstractC1631.m3422(keyEvent.getKeyCode()), AbstractC0708.f2575) ? iM4844 : -iM4844);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        AbstractC2765.m5135(m9076(), null, 0, new C4020(this, (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32), null, 0), 3);
        return true;
    }

    @Override // p000.InterfaceC3975
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo933() {
        mo783();
        if (this.f17786) {
            InterfaceC2880 interfaceC2880 = AbstractC5537.m9270(this).f2236;
            C3645 c3645 = this.f8874;
            c3645.getClass();
            c3645.f12206 = new C5468(new C3121(interfaceC2880));
        }
        C3031 c3031 = this.f8877;
        if (c3031 != null) {
            c3031.f8529 = AbstractC5537.m9270(this).f2236;
        }
        C5484 c5484 = this.f8878;
        if (c5484 != null) {
            c5484.f8529 = AbstractC5537.m9270(this).f2236;
        }
    }

    @Override // p000.AbstractC4485
    /* JADX INFO: renamed from: ۦؕ */
    public final Object mo4983(C1614 c1614, C1614 c1615) {
        C4545 c4545 = this.f8879;
        Object objM7868 = c4545.m7868(EnumC4386.f14454, new C0061(c1614, c4545, null, 27), c1615);
        return objM7868 == EnumC2282.f7590 ? objM7868 : C2358.f7817;
    }

    @Override // p000.AbstractC4485
    /* JADX INFO: renamed from: ۦُْؕؓ, reason: contains not printable characters */
    public final boolean mo9876() {
        C4545 c4545 = this.f8879;
        if (c4545.f15015.mo1397()) {
            return true;
        }
        C2851 c2851 = c4545.f15013;
        if (c2851 == null) {
            return false;
        }
        C0585 c0585 = c2851.f9518;
        EdgeEffect edgeEffect = c0585.f2184;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0797.m1707(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c0585.f2179;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0797.m1707(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c0585.f2180;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0797.m1707(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c0585.f2188;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC0797.m1707(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0142  */
    @Override // p000.AbstractC4485, p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؗ */
    public final void mo785(C5639 c5639, EnumC3834 enumC3834, long j) {
        EnumC3834 enumC3835;
        EnumC3834 enumC3836;
        int i;
        int i2;
        int i3;
        List list = c5639.f18583;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((Boolean) this.f14815.mo211(new C5407(((C3536) list.get(i4)).f11737))).booleanValue()) {
                super.mo785(c5639, enumC3834, j);
                break;
            }
        }
        if (this.f14818 == null) {
            C4774 c4774 = new C4774(this);
            m5603(c4774);
            this.f14818 = c4774;
        }
        if (this.f14822) {
            InterfaceC0443 interfaceC0443 = null;
            C4545 c4545 = this.f8879;
            EnumC3834 enumC3837 = EnumC3834.f12725;
            if (enumC3834 == enumC3837 && c5639.f18581 == 6) {
                C3031 c3031 = this.f8877;
                int i5 = 4;
                if (c3031 == null) {
                    i3 = 4;
                    enumC3835 = enumC3837;
                    C3031 c3032 = new C3031(c4545, new C5086(i5, ViewConfiguration.get(AbstractC4489.m7803(this).getContext())), new C2283(2, this, C2677.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), AbstractC5537.m9270(this).f2236);
                    this.f8877 = c3032;
                    c3031 = c3032;
                } else {
                    enumC3835 = enumC3837;
                    i3 = 4;
                }
                InterfaceC4643 interfaceC4643M9076 = m9076();
                if (c3031.f10194 == null) {
                    c3031.f10194 = AbstractC2765.m5135(interfaceC4643M9076, null, 0, new C5030(c3031, interfaceC0443, i3), 3);
                }
            } else {
                enumC3835 = enumC3837;
            }
            C3031 c3033 = this.f8877;
            EnumC3834 enumC3838 = EnumC3834.f12724;
            if (c3033 == null || c5639.f18581 != 6) {
                enumC3836 = enumC3835;
                break;
            }
            int size2 = list.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    enumC3836 = enumC3835;
                    if (enumC3834 == enumC3836 && c3033.f8533) {
                        c3033.m5622(c5639);
                        AbstractC2557.m4835(c5639);
                    }
                    if (enumC3834 != enumC3838 || c3033.f8533 || !c3033.m5622(c5639)) {
                        break;
                        break;
                        break;
                    } else {
                        AbstractC2557.m4835(c5639);
                        break;
                    }
                }
                if (((C3536) list.get(i6)).m6326()) {
                    enumC3836 = enumC3835;
                    break;
                }
                i6++;
            }
            if (enumC3834 == enumC3836 && ((i2 = c5639.f18581) == 10 || i2 == 11 || i2 == 12)) {
                C5484 c5484 = this.f8878;
                if (c5484 == null) {
                    C5484 c5485 = new C5484(c4545, new C2283(2, this, C2677.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), AbstractC5537.m9270(this).f2236);
                    this.f8878 = c5485;
                    c5484 = c5485;
                }
                InterfaceC4643 interfaceC4643M9077 = m9076();
                if (c5484.f18092 == null) {
                    i = 0;
                    c5484.f18092 = AbstractC2765.m5135(interfaceC4643M9077, null, 0, new C1734(c5484, null), 3);
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
            C5484 c5486 = this.f8878;
            if (c5486 != null) {
                int i7 = c5639.f18581;
                if (i7 == 10 || i7 == 11 || i7 == 12) {
                    int size3 = list.size();
                    while (i < size3) {
                        if (((C3536) list.get(i)).m6326()) {
                            return;
                        } else {
                            i++;
                        }
                    }
                    if (enumC3834 == enumC3836 && c5486.f8533) {
                        c5486.m9180(c5639);
                        AbstractC2557.m4835(c5639);
                    }
                    if (enumC3834 == enumC3838 && !c5486.f8533 && c5486.m9180(c5639)) {
                        AbstractC2557.m4835(c5639);
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.InterfaceC0174
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo364(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: ۦُؑۛۖ, reason: contains not printable characters */
    public final void m9877(C2851 c2851, InterfaceC3762 interfaceC3762, InterfaceC0738 interfaceC0738, C2243 c2243, EnumC1616 enumC1616, InterfaceC3096 interfaceC3096, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.f14822 != z) {
            this.f8869.f19440 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        InterfaceC0738 interfaceC0739 = interfaceC0738 == null ? this.f8874 : interfaceC0738;
        C4545 c4545 = this.f8879;
        if (!AbstractC3831.m6874(c4545.f15015, interfaceC3096)) {
            c4545.f15015 = interfaceC3096;
            z5 = true;
        }
        c4545.f15013 = c2851;
        EnumC1616 enumC1617 = c4545.f15016;
        if (enumC1617 != enumC1616) {
            c4545.f15016 = enumC1616;
            enumC1617 = enumC1616;
            z5 = true;
        }
        if (c4545.f15011 != z2) {
            c4545.f15011 = z2;
        } else {
            z4 = z5;
        }
        c4545.f15010 = interfaceC0739;
        c4545.f15012 = this.f8873;
        C2567 c2567 = this.f8876;
        c2567.f8570 = enumC1616;
        c2567.f8571 = z2;
        c2567.f8572 = interfaceC3762;
        this.f8871 = c2851;
        this.f8880 = interfaceC0738;
        C4215 c4215 = AbstractC2927.f9843;
        EnumC1616 enumC1618 = EnumC1616.f5425;
        if (enumC1617 != enumC1618) {
            enumC1618 = EnumC1616.f5424;
        }
        m9884(c4215, z, c2243, enumC1618, z4);
        if (z3) {
            this.f8872 = null;
            this.f8875 = null;
            AbstractC0186.m412(this);
        }
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        if (this.f14822 && (this.f8872 == null || this.f8875 == null)) {
            this.f8872 = new C4164(17, this);
            this.f8875 = new C4020(this, null);
        }
        C4164 c4164 = this.f8872;
        if (c4164 != null) {
            InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
            interfaceC1066.mo2266(AbstractC0208.f776, new C0078(null, c4164));
        }
        C4020 c4020 = this.f8875;
        if (c4020 != null) {
            InterfaceC0504[] interfaceC0504Arr2 = AbstractC3992.f13322;
            interfaceC1066.mo2266(AbstractC0208.f765, c4020);
        }
    }

    @Override // p000.AbstractC4485
    /* JADX INFO: renamed from: ۦًۢؖۡ, reason: contains not printable characters */
    public final void mo9878(long j) {
    }
}
