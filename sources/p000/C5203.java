package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: ۦۚؗۗؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5203 extends AbstractC5381 implements InterfaceC4933, InterfaceC0951, InterfaceC5671, InterfaceC2766, InterfaceC2827, InterfaceC1696, InterfaceC3126, InterfaceC0882, InterfaceC3392, InterfaceC5448, InterfaceC3569, InterfaceC3979, InterfaceC2086 {

    /* JADX INFO: renamed from: ۥً */
    public InterfaceC2252 f17199;

    @Override // p000.InterfaceC2086
    public final EnumC2459 getLayoutDirection() {
        return AbstractC5537.m9270(this).f2272;
    }

    public final String toString() {
        return this.f17199.toString();
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        m8804(true);
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final void m8804(boolean z) {
        if (!this.f17786) {
            AbstractC3480.m6278("initializeModifier called on unattached node");
        }
        InterfaceC2252 interfaceC2252 = this.f17199;
        if ((this.f17781 & 4) != 0 && !z) {
            AbstractC5537.m9245(this, 2).m9779();
        }
        if ((this.f17781 & 2) != 0) {
            if (((C1850) AbstractC5537.m9270(this).f2256.f8202).f6137) {
                AbstractC1311 abstractC1311 = this.f17789;
                ((C2355) abstractC1311).m9799(this);
                InterfaceC4384 interfaceC4384 = abstractC1311.f4522;
                if (interfaceC4384 != null) {
                    ((C0281) interfaceC4384).m584();
                }
            }
            if (!z) {
                AbstractC5537.m9245(this, 2).m9779();
                AbstractC5537.m9270(this).m1326();
            }
        }
        if (interfaceC2252 instanceof C1599) {
            C1599 c1599 = (C1599) interfaceC2252;
            C0605 c0605M9270 = AbstractC5537.m9270(this);
            switch (c1599.f5370) {
                case 0:
                    ((C0846) c1599.f5369).f3035 = c0605M9270;
                    break;
                default:
                    ((AbstractC0631) c1599.f5369).f2344.setValue(c0605M9270);
                    break;
            }
        }
        int i = this.f17781;
        if ((i & 16) != 0 && (interfaceC2252 instanceof C2317)) {
            ((C2317) interfaceC2252).f7660.f1400 = this.f17789;
        }
        if ((i & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).m1796();
        }
    }

    @Override // p000.InterfaceC3979
    /* JADX INFO: renamed from: ۥؓ */
    public final boolean mo1315() {
        return this.f17786;
    }

    @Override // p000.InterfaceC5448
    /* JADX INFO: renamed from: ۥؙ */
    public final void mo5853(InterfaceC0133 interfaceC0133) {
        InterfaceC2252 interfaceC2252 = this.f17199;
        AbstractC3480.m6278("applyFocusProperties called on wrong node");
        interfaceC2252.getClass();
        throw new ClassCastException();
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥً */
    public final int mo1554(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        InterfaceC3205 interfaceC3205 = (InterfaceC3205) this.f17199;
        interfaceC3205.getClass();
        return interfaceC3205.mo4547(new C3357(abstractC3625, abstractC3625.getLayoutDirection()), new C5230(interfaceC1827, 1, 2, 1), AbstractC0671.m1494(0, i, 0, 0, 13)).mo618();
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        return ((InterfaceC3205) this.f17199).mo4547(interfaceC2427, interfaceC1827, j);
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٗ */
    public final void mo1969() {
        AbstractC5378.m9047(this);
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        ((AbstractC5711) this.f17199).getClass();
        c2497.m4644();
    }

    @Override // p000.InterfaceC2086
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2880 mo2763() {
        return AbstractC5537.m9270(this).f2236;
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۥۘ */
    public final boolean mo5168() {
        C0376 c0376 = ((C2317) this.f17199).f7660;
        return true;
    }

    @Override // p000.InterfaceC1696
    /* JADX INFO: renamed from: ۥۚ */
    public final Object mo1853(Object obj) {
        C1317 c1317 = (C1317) this.f17199;
        c1317.getClass();
        return c1317;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo1555(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        InterfaceC3205 interfaceC3205 = (InterfaceC3205) this.f17199;
        interfaceC3205.getClass();
        return interfaceC3205.mo4547(new C3357(abstractC3625, abstractC3625.getLayoutDirection()), new C5230(interfaceC1827, 1, 1, 1), AbstractC0671.m1494(0, 0, 0, i, 7)).mo619();
    }

    @Override // p000.InterfaceC3975
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo933() {
        if (this.f17199 instanceof C2317) {
            mo783();
        }
    }

    @Override // p000.InterfaceC3392
    /* JADX INFO: renamed from: ۥۥ */
    public final void mo2392(EnumC4125 enumC4125) {
        InterfaceC2252 interfaceC2252 = this.f17199;
        AbstractC3480.m6278("onFocusEvent called on wrong node");
        interfaceC2252.getClass();
        throw new ClassCastException();
    }

    @Override // p000.InterfaceC2086
    /* JADX INFO: renamed from: ۦؑ */
    public final long mo2766() {
        return AbstractC5537.m9235(AbstractC5537.m9245(this, 128).f982);
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؓ */
    public final void mo783() {
        C0376 c0376 = ((C2317) this.f17199).f7660;
        C2317 c2317 = (C2317) c0376.f1402;
        if (c0376.f1401 == 2) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            C5157 c5157 = c2317.f7659;
            if (c5157 == null) {
                c5157 = null;
            }
            c5157.mo211(motionEventObtain);
            motionEventObtain.recycle();
            c0376.f1401 = 1;
            c2317.f7657 = false;
            c0376.f1399 = null;
        }
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؗ */
    public final void mo785(C5639 c5639, EnumC3834 enumC3834, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        C0376 c0376 = ((C2317) this.f17199).f7660;
        C2317 c2317 = (C2317) c0376.f1402;
        List list = c5639.f18583;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            C3536 c3536 = (C3536) list.get(i);
            if (AbstractC3801.m6800(c3536) || AbstractC3801.m6754(c3536)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((C3536) list.get(i2)).m6326()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (c2317.f7657) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                C3536 c3537 = (C3536) list.get(i3);
                if (!AbstractC3801.m6800(c3537) && !AbstractC3801.m6754(c3537)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        int i4 = c0376.f1401;
        EnumC3834 enumC3835 = EnumC3834.f12722;
        if (i4 != 3) {
            if (enumC3834 == EnumC3834.f12725 && z3) {
                c0376.f1399 = c5639;
                c0376.m811(c5639, !z || c2317.f7657);
            }
            if (enumC3834 == EnumC3834.f12724 && z && c5639 == ((C5639) c0376.f1399) && c2317.f7657) {
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((C3536) list.get(i5)).m6327();
                }
            }
            if (enumC3834 == enumC3835 && !z3 && c5639 != ((C5639) c0376.f1399)) {
                c0376.m811(c5639, true);
            }
        }
        if (enumC3834 == enumC3835) {
            int size5 = list.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    c0376.f1401 = 1;
                    c2317.f7657 = false;
                    c0376.f1399 = null;
                    break;
                } else if (!AbstractC3801.m6754((C3536) list.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            if (c5639 == ((C5639) c0376.f1399) && z) {
                int size6 = list.size();
                for (int i7 = 0; i7 < size6; i7++) {
                    if (((C3536) list.get(i7)).m6326()) {
                        if (c2317.f7657) {
                            break;
                        }
                        c0376.m820(c5639);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    ((C3536) list.get(i8)).m6327();
                }
            }
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        if (!this.f17786) {
            AbstractC3480.m6278("unInitializeModifier called on unattached node");
        }
        if ((this.f17781 & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).m1796();
        }
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦٔ */
    public final void mo5169() {
        C0376 c0376 = ((C2317) this.f17199).f7660;
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        C1023 c1023 = (C1023) this.f17199;
        c1023.getClass();
        C2542 c2542 = new C2542();
        c2542.f8487 = c1023.f3610;
        c1023.f3609.mo211(c2542);
        C2542 c2543 = (C2542) interfaceC1066;
        C3262 c3262 = c2543.f8490;
        if (c2542.f8487) {
            c2543.f8487 = true;
        }
        if (c2542.f8488) {
            c2543.f8488 = true;
        }
        C3262 c3263 = c2542.f8490;
        Object[] objArr = c3263.f10947;
        Object[] objArr2 = c3263.f10944;
        long[] jArr = c3263.f10948;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C3059 c3059 = (C3059) obj;
                        if (!c3262.m6018(c3059)) {
                            c3262.m6023(c3059, obj2);
                        } else if (obj2 instanceof C0078) {
                            C0078 c0078 = (C0078) c3262.m6027(c3059);
                            String str = c0078.f14721;
                            if (str == null) {
                                str = ((C0078) obj2).f14721;
                            }
                            InterfaceC0400 interfaceC0400 = c0078.f14720;
                            if (interfaceC0400 == null) {
                                interfaceC0400 = ((C0078) obj2).f14720;
                            }
                            c3262.m6023(c3059, new C0078(str, interfaceC0400));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p000.InterfaceC2827
    /* JADX INFO: renamed from: ۦۗ */
    public final C1397 mo5392() {
        return C1397.f4796;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo1556(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        InterfaceC3205 interfaceC3205 = (InterfaceC3205) this.f17199;
        interfaceC3205.getClass();
        return interfaceC3205.mo4547(new C3357(abstractC3625, abstractC3625.getLayoutDirection()), new C5230(interfaceC1827, 2, 1, 1), AbstractC0671.m1494(0, 0, 0, i, 7)).mo619();
    }

    @Override // p000.InterfaceC0882
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo1728(AbstractC1311 abstractC1311) {
        this.f17199.getClass();
        throw new ClassCastException();
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo1557(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        InterfaceC3205 interfaceC3205 = (InterfaceC3205) this.f17199;
        interfaceC3205.getClass();
        return interfaceC3205.mo4547(new C3357(abstractC3625, abstractC3625.getLayoutDirection()), new C5230(interfaceC1827, 2, 2, 1), AbstractC0671.m1494(0, i, 0, 0, 13)).mo618();
    }

    @Override // p000.InterfaceC3126, p000.InterfaceC1293
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2727(long j) {
    }

    @Override // p000.InterfaceC3126
    /* JADX INFO: renamed from: ۥْ */
    public final void mo5752(InterfaceC2015 interfaceC2015) {
    }
}
