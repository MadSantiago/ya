package p000;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: renamed from: ۥۛؒٓ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2308 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC0213 f7643;

    public C2308(AbstractC0213 abstractC0213) {
        this.f7643 = abstractC0213;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            C1548 c1548 = C1548.f5235;
            AbstractC0213 abstractC0213 = this.f7643;
            if (AbstractC3831.m6874(abstractC0213, c1548)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC0213 instanceof C3579)) {
                C1078.m2275();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            C3579 c3579 = (C3579) abstractC0213;
            textPaint.setStrokeWidth(c3579.f11906);
            textPaint.setStrokeMiter(c3579.f11905);
            int i = c3579.f11907;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = c3579.f11904;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
