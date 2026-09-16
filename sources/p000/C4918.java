package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: ۦٍٖۖؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4918 extends AbstractC0162 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2974 f16219;

    public C4918(C2974 c2974) {
        this.f16219 = c2974;
    }

    @Override // p000.AbstractC0162
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo345(Matrix matrix, C5796 c5796, int i, Canvas canvas) {
        RectF rectF = C2974.f9960;
        C2974 c2974 = this.f16219;
        float f = c2974.f9963;
        float f2 = c2974.f9966;
        RectF rectF2 = new RectF(c2974.f9964, c2974.f9961, c2974.f9965, c2974.f9962);
        Paint paint = c5796.f19099;
        boolean z = f2 < 0.0f;
        Path path = c5796.f19103;
        int[] iArr = C5796.f19095;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c5796.f19098;
            iArr[2] = c5796.f19097;
            iArr[3] = c5796.f19102;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = -i;
            rectF2.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c5796.f19102;
            iArr[2] = c5796.f19097;
            iArr[3] = c5796.f19098;
        }
        float fWidth = rectF2.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C5796.f19092;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF2.centerX(), rectF2.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF2.height() / rectF2.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c5796.f19100);
        }
        canvas.drawArc(rectF2, f, f2, true, paint);
        canvas.restore();
    }
}
