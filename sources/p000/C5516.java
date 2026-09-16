package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: ۦٖۢؒۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5516 extends AbstractC0162 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1939 f18200;

    /* JADX INFO: renamed from: ۥُ */
    public final float f18201;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f18202;

    public C5516(C1939 c1939, float f, float f2) {
        this.f18200 = c1939;
        this.f18202 = f;
        this.f18201 = f2;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final float m9203() {
        C1939 c1939 = this.f18200;
        return (float) Math.toDegrees(Math.atan((c1939.f6399 - this.f18201) / (c1939.f6400 - this.f18202)));
    }

    @Override // p000.AbstractC0162
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo345(Matrix matrix, C5796 c5796, int i, Canvas canvas) {
        C1939 c1939 = this.f18200;
        float f = c1939.f6399;
        float f2 = this.f18201;
        float f3 = c1939.f6400;
        float f4 = this.f18202;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f618;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(m9203());
        c5796.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c5796.f19098;
        int[] iArr = C5796.f19094;
        iArr[0] = i2;
        iArr[1] = c5796.f19097;
        iArr[2] = c5796.f19102;
        Paint paint = c5796.f19096;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C5796.f19093, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }
}
