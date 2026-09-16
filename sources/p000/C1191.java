package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: renamed from: ۥْؑۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1191 extends AbstractC2653 {

    /* JADX INFO: renamed from: ۥُ */
    public float f4100;

    /* JADX INFO: renamed from: ۥّ */
    public C3510 f4101;

    /* JADX INFO: renamed from: ۥۜ */
    public float f4102;

    /* JADX INFO: renamed from: ۦؑ */
    public C3510 f4103;

    /* JADX INFO: renamed from: ۦؚ */
    public Paint.Cap f4104;

    /* JADX INFO: renamed from: ۦٌ */
    public Paint.Join f4105;

    /* JADX INFO: renamed from: ۦِ */
    public float f4106;

    /* JADX INFO: renamed from: ۦٛ */
    public float f4107;

    /* JADX INFO: renamed from: ۦۗ */
    public float f4108;

    /* JADX INFO: renamed from: ۦۙ */
    public float f4109;

    /* JADX INFO: renamed from: ۦۚ */
    public float f4110;

    public float getFillAlpha() {
        return this.f4102;
    }

    public int getFillColor() {
        return this.f4101.f11622;
    }

    public float getStrokeAlpha() {
        return this.f4109;
    }

    public int getStrokeColor() {
        return this.f4103.f11622;
    }

    public float getStrokeWidth() {
        return this.f4100;
    }

    public float getTrimPathEnd() {
        return this.f4106;
    }

    public float getTrimPathOffset() {
        return this.f4108;
    }

    public float getTrimPathStart() {
        return this.f4107;
    }

    public void setFillAlpha(float f) {
        this.f4102 = f;
    }

    public void setFillColor(int i) {
        this.f4101.f11622 = i;
    }

    public void setStrokeAlpha(float f) {
        this.f4109 = f;
    }

    public void setStrokeColor(int i) {
        this.f4103.f11622 = i;
    }

    public void setStrokeWidth(float f) {
        this.f4100 = f;
    }

    public void setTrimPathEnd(float f) {
        this.f4106 = f;
    }

    public void setTrimPathOffset(float f) {
        this.f4108 = f;
    }

    public void setTrimPathStart(float f) {
        this.f4107 = f;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p000.AbstractC4623
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo2508(int[] iArr) {
        boolean z;
        C3510 c3510 = this.f4101;
        boolean z2 = true;
        if (c3510.m6304()) {
            ColorStateList colorStateList = (ColorStateList) c3510.f11624;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c3510.f11622) {
                c3510.f11622 = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        C3510 c3511 = this.f4103;
        if (c3511.m6304()) {
            ColorStateList colorStateList2 = (ColorStateList) c3511.f11624;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c3511.f11622) {
                c3511.f11622 = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }

    @Override // p000.AbstractC4623
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo2509() {
        return this.f4101.m6304() || this.f4103.m6304();
    }
}
