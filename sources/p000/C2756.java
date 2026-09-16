package p000;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۥۥِؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2756 extends AbstractC5381 implements InterfaceC4825, InterfaceC0951, InterfaceC3126 {

    /* JADX INFO: renamed from: ۥؔ */
    public C2146 f9120;

    /* JADX INFO: renamed from: ۥً */
    public final C2243 f9121;

    /* JADX INFO: renamed from: ۥٕ */
    public final float f9122;

    /* JADX INFO: renamed from: ۥۙ */
    public final C3877 f9123;

    /* JADX INFO: renamed from: ۥۦ */
    public float f9124;

    /* JADX INFO: renamed from: ۦؖ */
    public C4752 f9125;

    /* JADX INFO: renamed from: ۦؙ */
    public final C1445 f9127;

    /* JADX INFO: renamed from: ۦُ */
    public boolean f9128;

    /* JADX INFO: renamed from: ۦٚ */
    public final boolean f9130;

    /* JADX INFO: renamed from: ۦۜ */
    public C5273 f9131;

    /* JADX INFO: renamed from: ۦؗ */
    public long f9126 = 0;

    /* JADX INFO: renamed from: ۦٖ */
    public final C2730 f9129 = new C2730();

    public C2756(C2243 c2243, boolean z, float f, C3877 c3877, C1445 c1445) {
        this.f9121 = c2243;
        this.f9130 = z;
        this.f9122 = f;
        this.f9123 = c3877;
        this.f9127 = c1445;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        AbstractC2765.m5135(m9076(), null, 0, new C5030(this, null, 13), 3);
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final void m5112(InterfaceC0166 interfaceC0166) {
        C5273 c5273;
        if (!(interfaceC0166 instanceof C3656)) {
            if (interfaceC0166 instanceof C0694) {
                C5273 c5274 = this.f9131;
                if (c5274 != null) {
                    c5274.m8911();
                    return;
                }
                return;
            }
            if (!(interfaceC0166 instanceof C0199) || (c5273 = this.f9131) == null) {
                return;
            }
            c5273.m8911();
            return;
        }
        C3656 c3656 = (C3656) interfaceC0166;
        long j = this.f9126;
        float f = this.f9124;
        C2146 c2146 = this.f9120;
        if (c2146 == null) {
            Object obj = (View) AbstractC2552.m4807(this, AbstractC4354.f14354);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    C2316.m4357(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    C2146 c2147 = new C2146(viewGroup.getContext());
                    viewGroup.addView(c2147);
                    c2146 = c2147;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof C2146) {
                        c2146 = (C2146) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.f9120 = c2146;
        }
        ArrayList arrayList = c2146.f7027;
        C2346 c2346 = c2146.f7026;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c2346.f7786;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c2346.f7786;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c2346.f7785;
        C5273 c5275 = (C5273) linkedHashMap.get(this);
        int i2 = 1;
        if (c5275 == null) {
            ArrayList arrayList2 = c2146.f7025;
            c5275 = (C5273) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (c5275 == null) {
                if (c2146.f7024 > AbstractC2164.m4181(arrayList)) {
                    c5275 = new C5273(c2146.getContext());
                    c2146.addView(c5275);
                    arrayList.add(c5275);
                } else {
                    c5275 = (C5273) arrayList.get(c2146.f7024);
                    C2756 c2756 = (C2756) linkedHashMap3.get(c5275);
                    if (c2756 != null) {
                        c2756.f9131 = null;
                        AbstractC5378.m9047(c2756);
                        C5273 c5276 = (C5273) linkedHashMap2.get(c2756);
                        if (c5276 != null) {
                        }
                        linkedHashMap2.remove(c2756);
                        c5275.m8908();
                    }
                }
                int i3 = c2146.f7024;
                if (i3 < c2146.f7028 - 1) {
                    c2146.f7024 = i3 + 1;
                } else {
                    c2146.f7024 = 0;
                }
            }
            linkedHashMap2.put(this, c5275);
            linkedHashMap3.put(c5275, this);
        }
        C5273 c5277 = c5275;
        int iM5235 = AbstractC2776.m5235(f);
        long jM6928 = this.f9123.m6928();
        this.f9127.mo449();
        c5277.m8910(c3656, this.f9130, j, iM5235, jM6928, new C0101(i2, this));
        this.f9131 = c5277;
        AbstractC5378.m9047(this);
    }

    @Override // p000.InterfaceC3126, p000.InterfaceC1293
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2727(long j) {
        float fMo741;
        this.f9128 = true;
        InterfaceC2880 interfaceC2880 = AbstractC5537.m9270(this).f2236;
        this.f9126 = AbstractC5537.m9235(j);
        float f = this.f9122;
        if (Float.isNaN(f)) {
            long j2 = this.f9126;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fMo741 = C1553.m3303((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.f9130) {
                fMo741 += interfaceC2880.mo741(10.0f);
            }
        } else {
            fMo741 = interfaceC2880.mo741(f);
        }
        this.f9124 = fMo741;
        C2730 c2730 = this.f9129;
        Object[] objArr = c2730.f9041;
        int i = c2730.f9040;
        for (int i2 = 0; i2 < i; i2++) {
            m5112((InterfaceC0166) objArr[i2]);
        }
        c2730.m5080();
    }

    @Override // p000.InterfaceC0951
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo1726(C2497 c2497) {
        C2004 c2004 = c2497.f8304;
        c2497.m4644();
        C4752 c4752 = this.f9125;
        if (c4752 != null) {
            float f = this.f9124;
            long jM6928 = this.f9123.m6928();
            float fFloatValue = ((Number) ((C5825) c4752.f15684).m9638()).floatValue();
            if (fFloatValue > 0.0f) {
                long jM2826 = C1327.m2826(jM6928, fFloatValue, 14);
                if (c4752.f15687) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c2004.mo4567() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2004.mo4567() & 4294967295L));
                    C2808 c2808 = c2004.f6603;
                    long jM5355 = c2808.m5355();
                    c2808.m5353().mo2092();
                    try {
                        ((C2808) ((C5086) c2808.f9378).f16877).m5353().mo2084(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        InterfaceC2442.m4560(c2497, jM2826, f, 0L, null, 124);
                        c2808.m5353().mo2095();
                        c2808.m5351(jM5355);
                    } catch (Throwable th) {
                        c2808.m5353().mo2095();
                        c2808.m5351(jM5355);
                        throw th;
                    }
                } else {
                    InterfaceC2442.m4560(c2497, jM2826, f, 0L, null, 124);
                }
            }
        }
        InterfaceC3212 interfaceC3212M5353 = c2004.f6603.m5353();
        C5273 c5273 = this.f9131;
        if (c5273 != null) {
            long j = this.f9126;
            int iM5235 = AbstractC2776.m5235(this.f9124);
            long jM6929 = this.f9123.m6928();
            this.f9127.mo449();
            c5273.m8909(iM5235, j, jM6929);
            Canvas canvas = AbstractC5664.f18633;
            c5273.draw(((C0979) interfaceC3212M5353).f3447);
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        C2146 c2146 = this.f9120;
        if (c2146 != null) {
            this.f9131 = null;
            AbstractC5378.m9047(this);
            C2346 c2346 = c2146.f7026;
            C5273 c5273 = (C5273) ((LinkedHashMap) c2346.f7786).get(this);
            if (c5273 != null) {
                c5273.m8908();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c2346.f7786;
                C5273 c5274 = (C5273) linkedHashMap.get(this);
                if (c5274 != null) {
                }
                linkedHashMap.remove(this);
                c2146.f7025.add(c5273);
            }
        }
    }
}
