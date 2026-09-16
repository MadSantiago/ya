package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: ۥٍؑٝؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0935 {

    /* JADX INFO: renamed from: ۥؗ */
    public float[] f3326;

    /* JADX INFO: renamed from: ۥۗ */
    public RectF f3327;

    /* JADX INFO: renamed from: ۥۣ */
    public final Path f3328;

    /* JADX INFO: renamed from: ۦؑ */
    public Matrix f3329;

    public C0935(Path path) {
        this.f3328 = path;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m1903(C0935 c0935, C5293 c5293) {
        Path.Direction direction;
        RectF rectF = c0935.f3327;
        if (rectF == null) {
            rectF = new RectF();
            c0935.f3327 = rectF;
        }
        float f = c5293.f17435;
        long j = c5293.f17434;
        long j2 = c5293.f17437;
        long j3 = c5293.f17432;
        long j4 = c5293.f17431;
        rectF.set(f, c5293.f17433, c5293.f17430, c5293.f17436);
        float[] fArr = c0935.f3326;
        if (fArr == null) {
            fArr = new float[8];
            c0935.f3326 = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c0935.f3328;
        RectF rectF2 = c0935.f3327;
        float[] fArr2 = c0935.f3326;
        int iM6632 = AbstractC3761.m6632(1);
        if (iM6632 == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (iM6632 != 1) {
                C1078.m2275();
                return;
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m1904(C0935 c0935, C2793 c2793) {
        Path.Direction direction;
        float f = c2793.f9343;
        float f2 = c2793.f9344;
        float f3 = c2793.f9341;
        float f4 = c2793.f9342;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            AbstractC0317.m668("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = c0935.f3327;
        if (rectF == null) {
            rectF = new RectF();
            c0935.f3327 = rectF;
        }
        rectF.set(f, f4, f3, f2);
        Path path = c0935.f3328;
        RectF rectF2 = c0935.f3327;
        int iM6632 = AbstractC3761.m6632(1);
        if (iM6632 == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (iM6632 != 1) {
                C1078.m2275();
                return;
            }
            direction = Path.Direction.CW;
        }
        path.addRect(rectF2, direction);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m1905(C0935 c0935, C0935 c0936) {
        Path path = c0935.f3328;
        if (!(c0936 instanceof C0935)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(c0936.f3328, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m1906(C0935 c0935, C0935 c0936, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(c0935 instanceof C0935)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c0935.f3328;
        if (c0936 instanceof C0935) {
            return this.f3328.op(path, c0936.f3328, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m1907() {
        this.f3328.reset();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C2793 m1908() {
        RectF rectF = this.f3327;
        if (rectF == null) {
            rectF = new RectF();
            this.f3327 = rectF;
        }
        this.f3328.computeBounds(rectF, true);
        return new C2793(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m1909(long j) {
        Matrix matrix = this.f3329;
        if (matrix == null) {
            this.f3329 = new Matrix();
        } else {
            matrix.reset();
        }
        this.f3329.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        this.f3328.transform(this.f3329);
    }
}
