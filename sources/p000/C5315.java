package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: ۦًۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5315 extends AbstractC2758 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f17497;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ ViewGroup f17498;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5315(ViewGroup viewGroup, int i) {
        super(1);
        this.f17497 = i;
        this.f17498 = viewGroup;
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥّ */
    public final C2639 mo281(C2639 c2639, List list) {
        int i = this.f17497;
        ViewGroup viewGroup = this.f17498;
        switch (i) {
            case 0:
                return ((C4855) viewGroup).m4766(c2639);
            default:
                C0617 c0617 = (C0617) viewGroup;
                if (c0617.f2302) {
                    return c2639;
                }
                View childAt = c0617.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c0617.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c0617.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? c2639 : c2639.f8768.mo2741(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // p000.AbstractC2758
    /* JADX INFO: renamed from: ۥۜ */
    public final C2346 mo282(C0460 c0460, C2346 c2346) {
        int i = this.f17497;
        ViewGroup viewGroup = this.f17498;
        switch (i) {
            case 0:
                C2935 c2935 = (C2935) ((C4855) viewGroup).f8415.f2256.f8206;
                if (!c2935.f9864.f17786) {
                    return c2346;
                }
                long jM8635 = C5063.m8635(c2935.mo2808(0L));
                int i2 = (int) (jM8635 >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jM8635 & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jMo2799 = C4773.m8145(c2935).mo2799();
                int i4 = (int) (jMo2799 >> 32);
                int i5 = (int) (jMo2799 & 4294967295L);
                long j = c2935.f982;
                long jM8636 = C5063.m8635(c2935.mo2808((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jM8636 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (jM8636 & 4294967295L));
                int i8 = i7 >= 0 ? i7 : 0;
                return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? c2346 : new C2346(16, AbstractC2535.m4765((C5364) c2346.f7786, i2, i3, i6, i8), AbstractC2535.m4765((C5364) c2346.f7785, i2, i3, i6, i8));
            default:
                C0617 c0617 = (C0617) viewGroup;
                if (c0617.f2302) {
                    return c2346;
                }
                View childAt = c0617.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c0617.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c0617.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return c2346;
                }
                C5364 c5364M9014 = C5364.m9014(iMax, iMax2, iMax3, iMax4);
                int i9 = c5364M9014.f17695;
                C5364 c5364 = (C5364) c2346.f7786;
                int i10 = c5364M9014.f17694;
                int i11 = c5364M9014.f17693;
                int i12 = c5364M9014.f17696;
                return new C2346(16, C2639.m4954(c5364, i9, i10, i11, i12), C2639.m4954((C5364) c2346.f7785, i9, i10, i11, i12));
        }
    }
}
