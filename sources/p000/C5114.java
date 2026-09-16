package p000;

import android.graphics.RectF;

/* JADX INFO: renamed from: ۦۙؕٓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5114 extends AbstractC2776 {

    /* JADX INFO: renamed from: ۥۜ */
    public final int f16960;

    public C5114(int i) {
        this.f16960 = i;
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۥؖ */
    public final float mo2267(C3472 c3472) {
        float[] fArr = c3472.f11529;
        if (fArr != null) {
            return fArr[this.f16960];
        }
        return 0.0f;
    }

    @Override // p000.AbstractC2776
    /* JADX INFO: renamed from: ۥ۟ */
    public final void mo2268(C3472 c3472, float f) {
        float fMo5840;
        float[] fArr = c3472.f11529;
        if (fArr != null) {
            int i = this.f16960;
            if (fArr[i] != f) {
                fArr[i] = f;
                C5322 c5322 = c3472.f11534;
                if (c5322 != null) {
                    C0175 c0175 = c3472.f11539;
                    if (fArr != null) {
                        fMo5840 = (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
                    } else {
                        RectF rectFM6263 = c3472.m6263();
                        C4040 c4040Mo5482 = c3472.f11547.f14833.mo5482();
                        c0175.getClass();
                        fMo5840 = (((c3472.f11547.f14833.mo5482().f13472.mo5840(rectFM6263) + c4040Mo5482.f13469.mo5840(rectFM6263)) - c3472.f11547.f14833.mo5482().f13479.mo5840(rectFM6263)) - c3472.f11547.f14833.mo5482().f13470.mo5840(rectFM6263)) / 2.0f;
                    }
                    C0324 c0324 = (C0324) c5322.f17566;
                    int i2 = (int) (fMo5840 * 0.11f);
                    if (c0324.f1197 != i2) {
                        c0324.f1197 = i2;
                        c0324.m713();
                        c0324.invalidate();
                    }
                }
                c3472.invalidateSelf();
            }
        }
    }
}
