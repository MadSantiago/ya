package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: ۥِٞؓؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1939 extends AbstractC3859 {

    /* JADX INFO: renamed from: ۥؗ */
    public float f6399;

    /* JADX INFO: renamed from: ۥۗ */
    public float f6400;

    @Override // p000.AbstractC3859
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3803(Matrix matrix, Path path) {
        Matrix matrix2 = this.f12888;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f6400, this.f6399);
        path.transform(matrix);
    }
}
