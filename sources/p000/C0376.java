package p000;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: ۥُؔؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0376 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f1399;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f1400;

    /* JADX INFO: renamed from: ۥۣ */
    public int f1401 = 3;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f1402;

    public C0376(Paint paint) {
        this.f1400 = paint;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public int m806() {
        Paint.Join strokeJoin = ((Paint) this.f1400).getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC1514.f5148[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m807(float f) {
        ((Paint) this.f1400).setAlpha((int) Math.rint(f * 255.0f));
    }

    /* JADX INFO: renamed from: ۥّ */
    public void m808(int i) {
        if (this.f1401 == i) {
            return;
        }
        this.f1401 = i;
        Paint paint = (Paint) this.f1400;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(AbstractC3801.m6799(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC3801.m6797(i)));
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public int m809() {
        Paint.Cap strokeCap = ((Paint) this.f1400).getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC1514.f5149[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public void m810(C1516 c1516) {
        this.f1402 = c1516;
        ((Paint) this.f1400).setColorFilter(c1516 != null ? c1516.f5155 : null);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m811(C5639 c5639, boolean z) {
        C2317 c2317 = (C2317) this.f1402;
        List list = c5639.f18583;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C3536) list.get(i)).m6326()) {
                m820(c5639);
                return;
            }
        }
        AbstractC1311 abstractC1311 = (AbstractC1311) this.f1400;
        if (abstractC1311 == null) {
            C1078.m2276("layoutCoordinates not set");
            return;
        }
        AbstractC1605.m3360(c5639, abstractC1311.mo2808(0L), new C5544(9, this, c2317), false);
        if (this.f1401 == 2) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C3536) list.get(i2)).m6327();
                }
            }
            C5470 c5470 = c5639.f18582;
            if (c5470 != null) {
                c5470.f18035 = !c2317.f7657;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m812() {
        C4040 c4040 = new C4040();
        c4040.f13473 = new C4928();
        c4040.f13471 = new C4928();
        c4040.f13468 = new C4928();
        c4040.f13474 = new C4928();
        c4040.f13469 = new C0074(0.0f);
        c4040.f13470 = new C0074(0.0f);
        c4040.f13479 = new C0074(0.0f);
        c4040.f13472 = new C0074(0.0f);
        int i = 0;
        c4040.f13477 = new C1298(i);
        c4040.f13476 = new C1298(i);
        c4040.f13478 = new C1298(i);
        c4040.f13475 = new C1298(i);
        this.f1400 = c4040;
        this.f1399 = new int[10][];
        this.f1402 = new C4040[10];
    }

    /* JADX INFO: renamed from: ۦؚ */
    public void m813(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.f1400;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m814(float f) {
        ((Paint) this.f1400).setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: ۦِ */
    public void m815(Shader shader) {
        this.f1399 = shader;
        ((Paint) this.f1400).setShader(shader);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m816(int i) {
        ((Paint) this.f1400).setFilterBitmap(!(i == 0));
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m817(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.f1400;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m818(long j) {
        ((Paint) this.f1400).setColor(AbstractC4225.m7470(j));
    }

    /* JADX INFO: renamed from: ۦۚ */
    public void m819(int i) {
        ((Paint) this.f1400).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m820(C5639 c5639) {
        if (this.f1401 == 2) {
            AbstractC1311 abstractC1311 = (AbstractC1311) this.f1400;
            if (abstractC1311 == null) {
                C1078.m2276("layoutCoordinates not set");
                return;
            } else {
                AbstractC1605.m3360(c5639, abstractC1311.mo2808(0L), new C2932(24, (C2317) this.f1402), true);
            }
        }
        this.f1401 = 3;
    }
}
