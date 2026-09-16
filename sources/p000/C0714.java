package p000;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: renamed from: ۥؙؙٕؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0714 extends AbstractC0548 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ Shader f2616;

    /* JADX INFO: renamed from: ۥۗ */
    public long f2617 = 9205357640488583168L;

    /* JADX INFO: renamed from: ۥۣ */
    public C1039 f2618;

    public C0714(Shader shader) {
        this.f2616 = shader;
    }

    @Override // p000.AbstractC0548
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1239(float f, long j, C0376 c0376) {
        Paint paint = (Paint) c0376.f1400;
        C1039 c1039 = this.f2618;
        if (c1039 == null || !C3291.m6053(this.f2617, j)) {
            if (C3291.m6051(j)) {
                this.f2618 = null;
                this.f2617 = 9205357640488583168L;
                c1039 = null;
            } else {
                c1039 = this.f2618;
                if (c1039 == null) {
                    c1039 = new C1039(16, false);
                    this.f2618 = c1039;
                }
                c1039.f3672 = this.f2616;
                this.f2618 = c1039;
                this.f2617 = j;
            }
        }
        long jM7468 = AbstractC4225.m7468(paint.getColor());
        long j2 = C1327.f4588;
        if (!C4462.m7744(jM7468, j2)) {
            c0376.m818(j2);
        }
        if (!AbstractC3831.m6874((Shader) c0376.f1399, c1039 != null ? (Shader) c1039.f3672 : null)) {
            c0376.m815(c1039 != null ? (Shader) c1039.f3672 : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        c0376.m807(f);
    }
}
