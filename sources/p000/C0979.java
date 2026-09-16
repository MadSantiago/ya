package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: renamed from: ۥٍؗٞؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0979 implements InterfaceC3212 {

    /* JADX INFO: renamed from: ۥؗ */
    public Rect f3445;

    /* JADX INFO: renamed from: ۥۗ */
    public Rect f3446;

    /* JADX INFO: renamed from: ۥۣ */
    public Canvas f3447 = AbstractC5664.f18633;

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2082(float f, long j, C0376 c0376) {
        this.f3447.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) c0376.f1400);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۥَ */
    public final void mo2083(C0935 c0935) {
        Canvas canvas = this.f3447;
        if (!(c0935 instanceof C0935)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c0935.f3328, Region.Op.INTERSECT);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2084(float f, float f2, float f3, float f4, int i) {
        this.f3447.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۥّ */
    public final void mo2085(float f, float f2) {
        this.f3447.translate(f, f2);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۥْ */
    public final void mo2086(float[] fArr) {
        if (AbstractC3801.m6784(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC0487.m1041(matrix, fArr);
        this.f3447.concat(matrix);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo2087() {
        AbstractC0186.m419(this.f3447, true);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2088(float f, float f2) {
        this.f3447.scale(f, f2);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo2089() {
        this.f3447.rotate(45.0f);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2090(C1955 c1955, C0376 c0376) {
        this.f3447.drawBitmap(AbstractC0949.m1928(c1955), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) c0376.f1400);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2091(C1955 c1955, long j, long j2, long j3, C0376 c0376) {
        if (this.f3446 == null) {
            this.f3446 = new Rect();
            this.f3445 = new Rect();
        }
        Canvas canvas = this.f3447;
        Bitmap bitmapM1928 = AbstractC0949.m1928(c1955);
        Rect rect = this.f3446;
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.f3445;
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapM1928, rect, rect2, (Paint) c0376.f1400);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo2092() {
        this.f3447.save();
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo2093(long j, long j2, C0376 c0376) {
        this.f3447.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) c0376.f1400);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۦِ */
    public final void mo2094(float f, float f2, float f3, float f4, float f5, float f6, C0376 c0376) {
        this.f3447.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) c0376.f1400);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo2095() {
        this.f3447.restore();
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo2096(C0935 c0935, C0376 c0376) {
        Canvas canvas = this.f3447;
        if (!(c0935 instanceof C0935)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c0935.f3328, AbstractC0993.m2150(c0376));
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo2097() {
        AbstractC0186.m419(this.f3447, false);
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo2098(float f, float f2, float f3, float f4, C0376 c0376) {
        this.f3447.drawRect(f, f2, f3, f4, AbstractC0993.m2150(c0376));
    }

    @Override // p000.InterfaceC3212
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo2099(C2793 c2793, C0376 c0376) {
        this.f3447.saveLayer(c2793.f9343, c2793.f9342, c2793.f9341, c2793.f9344, (Paint) c0376.f1400, 31);
    }
}
