package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: ۦؐؒۥؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2974 extends AbstractC3859 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final RectF f9960 = new RectF();

    /* JADX INFO: renamed from: ۥؗ */
    public final float f9961;

    /* JADX INFO: renamed from: ۥُ */
    public final float f9962;

    /* JADX INFO: renamed from: ۥّ */
    public float f9963;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f9964;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f9965;

    /* JADX INFO: renamed from: ۦۙ */
    public float f9966;

    public C2974(float f, float f2, float f3, float f4) {
        this.f9964 = f;
        this.f9961 = f2;
        this.f9965 = f3;
        this.f9962 = f4;
    }

    @Override // p000.AbstractC3859
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3803(Matrix matrix, Path path) {
        Matrix matrix2 = this.f12888;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f9965;
        float f2 = this.f9962;
        RectF rectF = f9960;
        rectF.set(this.f9964, this.f9961, f, f2);
        path.arcTo(rectF, this.f9963, this.f9966, false);
        path.transform(matrix);
    }
}
