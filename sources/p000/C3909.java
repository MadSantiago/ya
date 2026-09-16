package p000;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* JADX INFO: renamed from: ۦُؕٛ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3909 extends Canvas {

    /* JADX INFO: renamed from: ۥۣ */
    public Canvas f13040;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        return m6996().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        return m6996().clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return m6996().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return m6996().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        m6996().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        m6996().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        m6996().drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        m6996().drawArc(rectF, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        m6996().drawBitmap(bitmap, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        m6996().drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        m6996().drawCircle(f, f2, f3, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        m6996().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        m6996().drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        m6996().drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        m6996().drawLine(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        m6996().drawLines(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        m6996().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        m6996().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        m6996().drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        m6996().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        m6996().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        m6996().drawPoint(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        m6996().drawPoints(fArr, i, i2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        m6996().drawPosText(cArr, i, i2, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        m6996().drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        m6996().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        m6996().drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        m6996().drawRoundRect(rectF, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        m6996().drawText(cArr, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        m6996().drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        m6996().drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        m6996().drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        m6996().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = m6996().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return m6996().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return m6996().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return m6996().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        m6996().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return m6996().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return m6996().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return m6996().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return m6996().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return m6996().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return m6996().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        m6996().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        m6996().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        m6996().rotate(f);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return m6996().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        return m6996().saveLayer(rectF, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        return m6996().saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        m6996().scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        m6996().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        m6996().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        m6996().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        m6996().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        m6996().skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        m6996().translate(f, f2);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Canvas m6996() {
        Canvas canvas = this.f13040;
        if (canvas != null) {
            return canvas;
        }
        AbstractC3767.m6642("Text drawing wrapper is missing a Canvas!");
        C1078.m2274();
        return null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        m6996().drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        m6996().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        m6996().drawColor(j);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        m6996().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        m6996().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        m6996().drawOval(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        m6996().drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        m6996().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        m6996().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        m6996().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        m6996().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        m6996().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f2, Paint paint) {
        m6996().drawText(str, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        m6996().drawTextOnPath(str, path, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        m6996().drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        return m6996().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return m6996().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        return m6996().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        m6996().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        m6996().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        m6996().drawRect(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        m6996().drawText(str, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        return m6996().quickReject(rectF);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return m6996().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        return m6996().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return m6996().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        m6996().drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        m6996().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        m6996().drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        m6996().drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        return m6996().saveLayer(f, f2, f3, f4, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return m6996().saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        return m6996().clipOutRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return m6996().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        m6996().drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        m6996().drawColor(i, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return m6996().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        return m6996().saveLayer(f, f2, f3, f4, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return m6996().saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        return m6996().clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        m6996().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        return m6996().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        return m6996().clipOutRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        return m6996().clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        m6996().drawColor(j, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        return m6996().clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        return m6996().quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        return m6996().quickReject(f, f2, f3, f4);
    }
}
