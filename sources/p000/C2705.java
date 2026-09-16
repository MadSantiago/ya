package p000;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ۥۤٔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2705 extends AbstractC2758 {

    /* JADX INFO: renamed from: ۥْ */
    public final HashMap f8963;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C1909 f8964;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2705(C1909 c1909) {
        super(0);
        this.f8964 = c1909;
        this.f8963 = new HashMap();
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥُ */
    public final void mo280(C0460 c0460) {
        ArrayList arrayList = this.f8964.f6298;
        if ((c0460.f1659.mo8773() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C2075) arrayList.get(size)).f6850++;
            }
        }
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥّ */
    public final C2639 mo281(C2639 c2639, List list) {
        ArrayList arrayList = this.f8964.f6298;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            C0460 c0460 = (C0460) list.get(size);
            Integer num = (Integer) this.f8963.get(c0460);
            if (num != null) {
                int iIntValue = num.intValue();
                float fMo8772 = c0460.f1659.mo8772();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fMo8772;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fMo8772;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fMo8772;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fMo8772;
                }
                i |= iIntValue;
            }
        }
        C5364 c5364M9015 = C5364.m9015(c2639.f8768.mo2752(519), c2639.f8768.mo2752(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C2075 c2075 = (C2075) arrayList.get(size2);
            C5364 c5364 = c2075.f6854;
            ArrayList arrayList2 = c2075.f6853;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                C3931 c3931 = (C3931) arrayList2.get(size3);
                int i2 = c3931.f13119;
                if ((i2 & i) != 0) {
                    C3264 c3264 = c3931.f13117;
                    if (!c3264.f10958) {
                        c3264.f10958 = true;
                        C3369 c3369 = c3264.f10959;
                        if (c3369 != null) {
                            ((View) c3369.f11254).setVisibility(0);
                        }
                    }
                    if (i2 == 1) {
                        int i3 = c5364.f17695;
                        if (i3 > 0) {
                            c3931.m7062(c5364M9015.f17695 / i3);
                        }
                        c3931.m7063(rectF.left);
                    } else if (i2 == 2) {
                        int i4 = c5364.f17694;
                        if (i4 > 0) {
                            c3931.m7062(c5364M9015.f17694 / i4);
                        }
                        c3931.m7063(rectF.top);
                    } else if (i2 == 4) {
                        int i5 = c5364.f17693;
                        if (i5 > 0) {
                            c3931.m7062(c5364M9015.f17693 / i5);
                        }
                        c3931.m7063(rectF.right);
                    } else if (i2 == 8) {
                        int i6 = c5364.f17696;
                        if (i6 > 0) {
                            c3931.m7062(c5364M9015.f17696 / i6);
                        }
                        c3931.m7063(rectF.bottom);
                    }
                }
            }
        }
        return c2639;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۜ */
    public final C2346 mo282(C0460 c0460, C2346 c2346) {
        if ((c0460.f1659.mo8773() & 519) != 0) {
            C5364 c5364 = (C5364) c2346.f7785;
            C5364 c5365 = (C5364) c2346.f7786;
            int i = c5364.f17695 != c5365.f17695 ? 1 : 0;
            if (c5364.f17694 != c5365.f17694) {
                i |= 2;
            }
            if (c5364.f17693 != c5365.f17693) {
                i |= 4;
            }
            if (c5364.f17696 != c5365.f17696) {
                i |= 8;
            }
            this.f8963.put(c0460, Integer.valueOf(i));
        }
        return c2346;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo283(C0460 c0460) {
        ArrayList arrayList = this.f8964.f6298;
        if ((c0460.f1659.mo8773() & 519) != 0) {
            this.f8963.remove(c0460);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C2075 c2075 = (C2075) arrayList.get(size);
                int i = c2075.f6850;
                boolean z = i > 0;
                int i2 = i - 1;
                c2075.f6850 = i2;
                if (z && i2 == 0) {
                    c2075.m4019();
                }
            }
        }
    }
}
