package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۦْٟؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4868 extends AbstractC2758 implements Runnable, InterfaceC3662, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥَ */
    public C2639 f16025;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f16026;

    /* JADX INFO: renamed from: ۥٓ */
    public int f16027;

    /* JADX INFO: renamed from: ۥٖ */
    public final C3262 f16028;

    /* JADX INFO: renamed from: ۥۖ */
    public final C1347 f16029;

    /* JADX INFO: renamed from: ۦٗ */
    public final C0169 f16030;

    /* JADX INFO: renamed from: ۦۛ */
    public final C2730 f16031;

    public RunnableC4868() {
        super(1);
        C3262 c3262 = new C3262(9);
        InterfaceC2144.f7023.getClass();
        c3262.m6023(C1114.f3907, new C4244("caption bar"));
        c3262.m6023(C1114.f3904, new C4244("display cutout"));
        c3262.m6023(C1114.f3910, new C4244("ime"));
        c3262.m6023(C1114.f3905, new C4244("mandatory system gestures"));
        c3262.m6023(C1114.f3906, new C4244("navigation bars"));
        c3262.m6023(C1114.f3913, new C4244("status bars"));
        c3262.m6023(C1114.f3908, new C4244("system gestures"));
        c3262.m6023(C1114.f3912, new C4244("tappable element"));
        c3262.m6023(C1114.f3911, new C4244("waterfall"));
        this.f16028 = c3262;
        this.f16030 = new C0169(0);
        this.f16031 = new C2730(4);
        this.f16029 = new C1347();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        AbstractC5039.m8554(view, this);
        C0460.m977(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        AbstractC5039.m8554(view, null);
        C0460.m977(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16026) {
            this.f16027 = 0;
            this.f16026 = false;
            C2639 c2639 = this.f16025;
            if (c2639 != null) {
                m8224(c2639);
                this.f16025 = null;
            }
        }
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥُ */
    public final void mo280(C0460 c0460) {
        this.f16026 = true;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥّ */
    public final C2639 mo281(C2639 c2639, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0460 c0460 = (C0460) list.get(i);
            InterfaceC2144 interfaceC2144 = (InterfaceC2144) AbstractC0722.f2637.m9571(c0460.f1659.mo8773());
            if (interfaceC2144 != null) {
                C4244 c4244 = (C4244) this.f16028.m6027(interfaceC2144);
                if (((Boolean) c4244.f14060.getValue()).booleanValue()) {
                    AbstractC5902 abstractC5902 = c0460.f1659;
                    c4244.f14057.m1710(abstractC5902.mo8769());
                    c4244.f14058.m1710(abstractC5902.mo8772());
                    c4244.f14063.m1900(abstractC5902.mo8771());
                }
            }
        }
        m8224(c2639);
        return c2639;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final void m8224(C2639 c2639) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        C4912 c4912 = AbstractC0722.f2637;
        int[] iArr2 = c4912.f18947;
        Object[] objArr3 = c4912.f18945;
        long[] jArr2 = c4912.f18948;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            InterfaceC2144 interfaceC2144 = (InterfaceC2144) objArr3[i6];
                            C5364 c5364Mo2752 = c2639.f8768.mo2752(i7);
                            long j3 = (((long) c5364Mo2752.f17695) << 48) | (((long) c5364Mo2752.f17694) << 32) | (((long) c5364Mo2752.f17693) << 16) | ((long) c5364Mo2752.f17696);
                            C4244 c4244 = (C4244) this.f16028.m6027(interfaceC2144);
                            if (!AbstractC4489.m7807(j3, c4244.f14061)) {
                                c4244.f14061 = j3;
                                z2 = true;
                                if (!AbstractC4489.m7807(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                C5364 c5364Mo2749 = c2639.f8768.mo2749(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) c5364Mo2749.f17694) << 32) | (((long) c5364Mo2749.f17695) << 48) | (((long) c5364Mo2749.f17693) << 16) | ((long) c5364Mo2749.f17696);
                                if (!AbstractC4489.m7807(c4244.f14065, j4)) {
                                    c4244.f14065 = j4;
                                    z2 = true;
                                    if (!AbstractC4489.m7807(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            c4244.f14062.setValue(Boolean.valueOf(c2639.f8768.mo2751(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        C1798 c1798Mo6259 = c2639.f8768.mo6259();
        if (c1798Mo6259 == null) {
            j = 0;
        } else {
            C5364 c5364M3584 = c1798Mo6259.m3584();
            j = (((long) c5364M3584.f17695) << c3) | (((long) c5364M3584.f17694) << c2) | (((long) c5364M3584.f17693) << c) | ((long) c5364M3584.f17696);
        }
        C3262 c3262 = this.f16028;
        InterfaceC2144.f7023.getClass();
        C4244 c4245 = (C4244) c3262.m6027(C1114.f3911);
        c4245.f14062.setValue(Boolean.valueOf(!AbstractC4489.m7807(j, 0L)));
        if (!AbstractC4489.m7807(c4245.f14061, j)) {
            c4245.f14061 = j;
            c4245.f14065 = j;
            z2 = z;
            if (!AbstractC4489.m7807(j, 0L)) {
                z3 = z2;
            }
        }
        if (c1798Mo6259 == null) {
            C2730 c2730 = this.f16031;
            if (c2730.f9040 > 0) {
                c2730.m5080();
                this.f16029.clear();
                z2 = z;
            }
        } else {
            List listM4923 = Build.VERSION.SDK_INT >= 28 ? AbstractC2611.m4923(c1798Mo6259.f5996) : Collections.EMPTY_LIST;
            int size = listM4923.size();
            C2730 c2731 = this.f16031;
            if (size < c2731.f9040) {
                c2731.m5081(listM4923.size(), this.f16031.f9040);
                this.f16029.m2856(listM4923.size(), this.f16029.size());
                z2 = z;
            } else {
                int size2 = listM4923.size() - this.f16031.f9040;
                int i8 = 0;
                while (i8 < size2) {
                    C2730 c2732 = this.f16031;
                    c2732.m5079(AbstractC2774.m5183(listM4923.get(c2732.f9040)));
                    this.f16029.add(new C5655("display cutout rect " + this.f16031.f9040));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listM4923.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listM4923.get(i9);
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) this.f16031.m5076(i9);
                if (!AbstractC3831.m6874(interfaceC4367.getValue(), rect)) {
                    interfaceC4367.setValue(rect);
                    z2 = z;
                }
            }
            if (!listM4923.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.f16030.m360() != 0) && z2) {
            C0169 c0169 = this.f16030;
            c0169.m359(c0169.m360() + 1);
            synchronized (AbstractC1538.f5203) {
                C3639 c3639 = AbstractC1538.f5210.f16713;
                z4 = (c3639 == null || c3639.m6494() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                AbstractC1538.m3269();
            }
        }
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۜ */
    public final C2346 mo282(C0460 c0460, C2346 c2346) {
        C2639 c2639 = this.f16025;
        boolean z = false;
        this.f16026 = false;
        this.f16025 = null;
        if (c0460.f1659.mo8771() > 0 && c2639 != null) {
            int iMo8773 = c0460.f1659.mo8773();
            this.f16027 |= iMo8773;
            InterfaceC2144 interfaceC2144 = (InterfaceC2144) AbstractC0722.f2637.m9571(iMo8773);
            if (interfaceC2144 != null) {
                C4244 c4244 = (C4244) this.f16028.m6027(interfaceC2144);
                C5364 c5364Mo2752 = c2639.f8768.mo2752(iMo8773);
                long j = (((long) c5364Mo2752.f17695) << 48) | (((long) c5364Mo2752.f17694) << 32) | (((long) c5364Mo2752.f17693) << 16) | ((long) c5364Mo2752.f17696);
                long j2 = c4244.f14061;
                if (!AbstractC4489.m7807(j, j2)) {
                    c4244.f14064 = j2;
                    c4244.f14066 = j;
                    c4244.f14060.setValue(Boolean.TRUE);
                    AbstractC5902 abstractC5902 = c0460.f1659;
                    c4244.f14057.m1710(abstractC5902.mo8769());
                    c4244.f14058.m1710(abstractC5902.mo8772());
                    c4244.f14063.m1900(abstractC5902.mo8771());
                    C0169 c0169 = this.f16030;
                    c0169.m359(c0169.m360() + 1);
                    synchronized (AbstractC1538.f5203) {
                        C3639 c3639 = AbstractC1538.f5210.f16713;
                        if (c3639 != null && c3639.m6494()) {
                            z = true;
                        }
                    }
                    if (z) {
                        AbstractC1538.m3269();
                        return c2346;
                    }
                }
            }
        }
        return c2346;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo283(C0460 c0460) {
        boolean z = false;
        this.f16026 = false;
        int iMo8773 = c0460.f1659.mo8773();
        this.f16027 &= ~iMo8773;
        this.f16025 = null;
        InterfaceC2144 interfaceC2144 = (InterfaceC2144) AbstractC0722.f2637.m9571(iMo8773);
        if (interfaceC2144 != null) {
            C4244 c4244 = (C4244) this.f16028.m6027(interfaceC2144);
            c4244.f14057.m1710(0.0f);
            c4244.f14058.m1710(1.0f);
            c4244.f14063.m1900(0L);
            c4244.f14057.m1710(0.0f);
            c4244.f14060.setValue(Boolean.FALSE);
            c4244.f14064 = -1L;
            c4244.f14066 = -1L;
            C0169 c0169 = this.f16030;
            c0169.m359(c0169.m360() + 1);
            synchronized (AbstractC1538.f5203) {
                C3639 c3639 = AbstractC1538.f5210.f16713;
                if (c3639 != null && c3639.m6494()) {
                    z = true;
                }
            }
            if (z) {
                AbstractC1538.m3269();
            }
        }
    }

    @Override // p000.InterfaceC3662
    /* JADX INFO: renamed from: ۦۙ */
    public final C2639 mo284(View view, C2639 c2639) {
        if (this.f16026) {
            this.f16025 = c2639;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c2639;
            }
        } else if (this.f16027 == 0) {
            m8224(c2639);
        }
        return c2639;
    }
}
