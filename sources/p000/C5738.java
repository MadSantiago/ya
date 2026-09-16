package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۦْؒؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5738 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final Matrix f18917 = new Matrix();

    /* JADX INFO: renamed from: ۥؗ */
    public final Matrix f18918;

    /* JADX INFO: renamed from: ۥُ */
    public Paint f18919;

    /* JADX INFO: renamed from: ۥّ */
    public PathMeasure f18920;

    /* JADX INFO: renamed from: ۥۗ */
    public final Path f18921;

    /* JADX INFO: renamed from: ۥۜ */
    public float f18922;

    /* JADX INFO: renamed from: ۥۣ */
    public final Path f18923;

    /* JADX INFO: renamed from: ۦؑ */
    public Paint f18924;

    /* JADX INFO: renamed from: ۦؚ */
    public int f18925;

    /* JADX INFO: renamed from: ۦٌ */
    public String f18926;

    /* JADX INFO: renamed from: ۦِ */
    public float f18927;

    /* JADX INFO: renamed from: ۦٛ */
    public float f18928;

    /* JADX INFO: renamed from: ۦۗ */
    public float f18929;

    /* JADX INFO: renamed from: ۦۙ */
    public final C5873 f18930;

    /* JADX INFO: renamed from: ۦۚ */
    public Boolean f18931;

    /* JADX INFO: renamed from: ۦۨ */
    public final C4461 f18932;

    public C5738(C5738 c5738) {
        this.f18918 = new Matrix();
        this.f18922 = 0.0f;
        this.f18928 = 0.0f;
        this.f18927 = 0.0f;
        this.f18929 = 0.0f;
        this.f18925 = 255;
        this.f18926 = null;
        this.f18931 = null;
        C4461 c4461 = new C4461(0);
        this.f18932 = c4461;
        this.f18930 = new C5873(c5738.f18930, c4461);
        this.f18923 = new Path(c5738.f18923);
        this.f18921 = new Path(c5738.f18921);
        this.f18922 = c5738.f18922;
        this.f18928 = c5738.f18928;
        this.f18927 = c5738.f18927;
        this.f18929 = c5738.f18929;
        this.f18925 = c5738.f18925;
        this.f18926 = c5738.f18926;
        String str = c5738.f18926;
        if (str != null) {
            c4461.put(str, this);
        }
        this.f18931 = c5738.f18931;
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f18925;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f18925 = i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9543(C5873 c5873, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        boolean z;
        Matrix matrix2;
        ArrayList arrayList;
        float f;
        int i4;
        float[] fArr;
        int i5;
        Path path;
        Path path2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        Matrix matrix3 = c5873.f19397;
        ArrayList arrayList2 = c5873.f19395;
        matrix3.set(matrix);
        Matrix matrix4 = c5873.f19397;
        matrix4.preConcat(c5873.f19399);
        canvas.save();
        boolean z2 = false;
        int i6 = 0;
        while (i6 < arrayList2.size()) {
            AbstractC4623 abstractC4623 = (AbstractC4623) arrayList2.get(i6);
            if (abstractC4623 instanceof C5873) {
                m9543((C5873) abstractC4623, matrix4, canvas, i, i2);
            } else {
                if (abstractC4623 instanceof AbstractC2653) {
                    AbstractC2653 abstractC2653 = (AbstractC2653) abstractC4623;
                    float f14 = i / this.f18927;
                    float f15 = i2 / this.f18929;
                    float fMin = Math.min(f14, f15);
                    Matrix matrix5 = this.f18918;
                    matrix5.set(matrix4);
                    matrix5.postScale(f14, f15);
                    float[] fArr2 = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix4.mapVectors(fArr2);
                    double d = fArr2[z2 ? 1 : 0];
                    float f16 = fArr2[1];
                    byte b = z2 ? 1 : 0;
                    i3 = i6;
                    float fHypot = (float) Math.hypot(d, f16);
                    float fHypot2 = (float) Math.hypot(fArr2[2], fArr2[3]);
                    float f17 = (fArr2[b == true ? 1 : 0] * fArr2[3]) - (fArr2[1] * fArr2[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f17) / fMax : 0.0f;
                    if (fAbs == 0.0f) {
                        z2 = b == true ? 1 : 0;
                        matrix2 = matrix4;
                        arrayList = arrayList2;
                    } else {
                        Path path3 = this.f18923;
                        path3.reset();
                        C0381[] c0381Arr = abstractC2653.f8807;
                        if (c0381Arr != null) {
                            float[] fArr3 = new float[6];
                            int length = c0381Arr.length;
                            z = true;
                            char c = 'm';
                            int i7 = b == true ? 1 : 0;
                            while (i7 < length) {
                                C0381 c0381 = c0381Arr[i7];
                                char c2 = c0381.f1421;
                                Matrix matrix6 = matrix4;
                                float[] fArr4 = c0381.f1420;
                                float f18 = fArr3[b == true ? 1 : 0];
                                float f19 = fArr3[1];
                                float f20 = fArr3[2];
                                float f21 = fArr3[3];
                                float f22 = fArr3[4];
                                ArrayList arrayList3 = arrayList2;
                                float f23 = fArr3[5];
                                switch (c2) {
                                    case 'A':
                                    case 'a':
                                        i4 = 7;
                                        break;
                                    case 'C':
                                    case 'c':
                                        i4 = 6;
                                        break;
                                    case 'H':
                                    case 'V':
                                    case 'h':
                                    case 'v':
                                        i4 = 1;
                                        break;
                                    case 'Q':
                                    case 'S':
                                    case 'q':
                                    case 's':
                                        i4 = 4;
                                        break;
                                    case 'Z':
                                    case 'z':
                                        path3.close();
                                        path3.moveTo(f22, f23);
                                        f18 = f22;
                                        f20 = f18;
                                        f19 = f23;
                                        f21 = f19;
                                    default:
                                        i4 = 2;
                                        break;
                                }
                                float f24 = f22;
                                float f25 = f23;
                                float f26 = fAbs;
                                char c3 = c;
                                float f27 = f18;
                                float f28 = f19;
                                int i8 = b == true ? 1 : 0;
                                while (i8 < fArr4.length) {
                                    if (c2 != 'A') {
                                        if (c2 != 'C') {
                                            if (c2 == 'H') {
                                                fArr = fArr4;
                                                path2 = path3;
                                                i5 = i8;
                                                path2.lineTo(fArr[i5 == true ? 1 : 0], f28);
                                                f27 = fArr[i5 == true ? 1 : 0];
                                            } else if (c2 == 'Q') {
                                                fArr = fArr4;
                                                path2 = path3;
                                                i5 = i8;
                                                float f29 = fArr[i5 == true ? 1 : 0];
                                                int i9 = (i5 == true ? 1 : 0) + 1;
                                                float f30 = fArr[i9];
                                                int i10 = (i5 == true ? 1 : 0) + 2;
                                                float f31 = fArr[i10];
                                                int i11 = (i5 == true ? 1 : 0) + 3;
                                                path2.quadTo(f29, f30, f31, fArr[i11]);
                                                f20 = fArr[i5 == true ? 1 : 0];
                                                f21 = fArr[i9];
                                                f27 = fArr[i10];
                                                f28 = fArr[i11];
                                            } else if (c2 == 'V') {
                                                fArr = fArr4;
                                                i5 = i8;
                                                path3.lineTo(f27, fArr[i5 == true ? 1 : 0]);
                                                f28 = fArr[i5 == true ? 1 : 0];
                                            } else if (c2 == 'a') {
                                                fArr = fArr4;
                                                Path path4 = path3;
                                                i5 = i8;
                                                int i12 = (i5 == true ? 1 : 0) + 5;
                                                float f32 = fArr[i12] + f27;
                                                int i13 = (i5 == true ? 1 : 0) + 6;
                                                float f33 = f28;
                                                float f34 = f27;
                                                C0381.m828(path4, f34, f33, f32, fArr[i13] + f28, fArr[i5 == true ? 1 : 0], fArr[(i5 == true ? 1 : 0) + 1], fArr[(i5 == true ? 1 : 0) + 2], fArr[(i5 == true ? 1 : 0) + 3] != 0.0f ? true : b == true ? 1 : 0, fArr[(i5 == true ? 1 : 0) + 4] != 0.0f ? true : b == true ? 1 : 0);
                                                f27 = f34 + fArr[i12];
                                                f28 = f33 + fArr[i13];
                                                path3 = path4;
                                                f20 = f27;
                                                f21 = f28;
                                            } else if (c2 == 'c') {
                                                fArr = fArr4;
                                                i5 = i8;
                                                float f35 = fArr[i5 == true ? 1 : 0];
                                                float f36 = fArr[(i5 == true ? 1 : 0) + 1];
                                                int i14 = (i5 == true ? 1 : 0) + 2;
                                                float f37 = fArr[i14];
                                                int i15 = (i5 == true ? 1 : 0) + 3;
                                                float f38 = fArr[i15];
                                                int i16 = (i5 == true ? 1 : 0) + 4;
                                                float f39 = fArr[i16];
                                                int i17 = (i5 == true ? 1 : 0) + 5;
                                                path = path3;
                                                path.rCubicTo(f35, f36, f37, f38, f39, fArr[i17]);
                                                float f40 = f27 + fArr[i14];
                                                float f41 = f28 + fArr[i15];
                                                f27 += fArr[i16];
                                                f28 += fArr[i17];
                                                f21 = f41;
                                                f20 = f40;
                                            } else if (c2 != 'h') {
                                                if (c2 != 'q') {
                                                    if (c2 != 'v') {
                                                        if (c2 != 'L') {
                                                            if (c2 != 'M') {
                                                                if (c2 == 'S') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                                        f27 = (f27 * 2.0f) - f20;
                                                                        f28 = (f28 * 2.0f) - f21;
                                                                    }
                                                                    float f42 = f27;
                                                                    float f43 = f28;
                                                                    float f44 = fArr[i5 == true ? 1 : 0];
                                                                    int i18 = (i5 == true ? 1 : 0) + 1;
                                                                    float f45 = fArr[i18];
                                                                    int i19 = (i5 == true ? 1 : 0) + 2;
                                                                    float f46 = fArr[i19];
                                                                    int i20 = (i5 == true ? 1 : 0) + 3;
                                                                    path3.cubicTo(f42, f43, f44, f45, f46, fArr[i20]);
                                                                    f8 = fArr[i5 == true ? 1 : 0];
                                                                    f9 = fArr[i18];
                                                                    f27 = fArr[i19];
                                                                    f28 = fArr[i20];
                                                                } else if (c2 == 'T') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                        f27 = (f27 * 2.0f) - f20;
                                                                        f28 = (f28 * 2.0f) - f21;
                                                                    }
                                                                    float f47 = f27;
                                                                    float f48 = f28;
                                                                    float f49 = fArr[i5 == true ? 1 : 0];
                                                                    int i21 = (i5 == true ? 1 : 0) + 1;
                                                                    path3.quadTo(f47, f48, f49, fArr[i21]);
                                                                    f20 = f47;
                                                                    f21 = f48;
                                                                    f27 = fArr[i5 == true ? 1 : 0];
                                                                    f28 = fArr[i21];
                                                                } else if (c2 == 'l') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    float f50 = fArr[i5 == true ? 1 : 0];
                                                                    int i22 = (i5 == true ? 1 : 0) + 1;
                                                                    path3.rLineTo(f50, fArr[i22]);
                                                                    f27 += fArr[i5 == true ? 1 : 0];
                                                                    f5 = fArr[i22];
                                                                } else if (c2 == 'm') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    float f51 = fArr[i5 == true ? 1 : 0];
                                                                    f27 += f51;
                                                                    float f52 = fArr[(i5 == true ? 1 : 0) + 1];
                                                                    f28 += f52;
                                                                    if (i5 > 0) {
                                                                        path3.rLineTo(f51, f52);
                                                                    } else {
                                                                        path3.rMoveTo(f51, f52);
                                                                        f24 = f27;
                                                                    }
                                                                } else if (c2 == 's') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                                        f10 = f27 - f20;
                                                                        f11 = f28 - f21;
                                                                    } else {
                                                                        f10 = 0.0f;
                                                                        f11 = 0.0f;
                                                                    }
                                                                    float f53 = fArr[i5 == true ? 1 : 0];
                                                                    int i23 = (i5 == true ? 1 : 0) + 1;
                                                                    float f54 = fArr[i23];
                                                                    int i24 = (i5 == true ? 1 : 0) + 2;
                                                                    float f55 = fArr[i24];
                                                                    int i25 = (i5 == true ? 1 : 0) + 3;
                                                                    path3.rCubicTo(f10, f11, f53, f54, f55, fArr[i25]);
                                                                    f8 = f27 + fArr[i5 == true ? 1 : 0];
                                                                    f9 = f28 + fArr[i23];
                                                                    f27 += fArr[i24];
                                                                    f28 += fArr[i25];
                                                                } else if (c2 != 't') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                } else {
                                                                    fArr = fArr4;
                                                                    if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                        f12 = f27 - f20;
                                                                        f13 = f28 - f21;
                                                                    } else {
                                                                        f12 = 0.0f;
                                                                        f13 = 0.0f;
                                                                    }
                                                                    int i26 = i8 + 1;
                                                                    i5 = i8;
                                                                    path3.rQuadTo(f12, f13, fArr[i8], fArr[i26]);
                                                                    f2 = f27 + f12;
                                                                    f3 = f28 + f13;
                                                                    f27 += fArr[i5 == true ? 1 : 0];
                                                                    f4 = fArr[i26];
                                                                }
                                                                f21 = f9;
                                                                f20 = f8;
                                                            } else {
                                                                fArr = fArr4;
                                                                i5 = i8;
                                                                f6 = fArr[i5 == true ? 1 : 0];
                                                                f7 = fArr[(i5 == true ? 1 : 0) + 1];
                                                                if (i5 > 0) {
                                                                    path3.lineTo(f6, f7);
                                                                } else {
                                                                    path3.moveTo(f6, f7);
                                                                    f27 = f6;
                                                                    f24 = f27;
                                                                    f28 = f7;
                                                                }
                                                            }
                                                            f25 = f28;
                                                        } else {
                                                            fArr = fArr4;
                                                            i5 = i8;
                                                            float f56 = fArr[i5 == true ? 1 : 0];
                                                            int i27 = (i5 == true ? 1 : 0) + 1;
                                                            path3.lineTo(f56, fArr[i27]);
                                                            f6 = fArr[i5 == true ? 1 : 0];
                                                            f7 = fArr[i27];
                                                        }
                                                        f27 = f6;
                                                        f28 = f7;
                                                    } else {
                                                        fArr = fArr4;
                                                        i5 = i8;
                                                        path3.rLineTo(0.0f, fArr[i5 == true ? 1 : 0]);
                                                        f5 = fArr[i5 == true ? 1 : 0];
                                                    }
                                                    f28 += f5;
                                                } else {
                                                    fArr = fArr4;
                                                    i5 = i8;
                                                    float f57 = fArr[i5 == true ? 1 : 0];
                                                    int i28 = (i5 == true ? 1 : 0) + 1;
                                                    float f58 = fArr[i28];
                                                    int i29 = (i5 == true ? 1 : 0) + 2;
                                                    float f59 = fArr[i29];
                                                    int i30 = (i5 == true ? 1 : 0) + 3;
                                                    path3.rQuadTo(f57, f58, f59, fArr[i30]);
                                                    f2 = f27 + fArr[i5 == true ? 1 : 0];
                                                    f3 = f28 + fArr[i28];
                                                    f27 += fArr[i29];
                                                    f4 = fArr[i30];
                                                }
                                                f28 += f4;
                                                f20 = f2;
                                                f21 = f3;
                                            } else {
                                                fArr = fArr4;
                                                i5 = i8;
                                                path3.rLineTo(fArr[i5 == true ? 1 : 0], 0.0f);
                                                f27 += fArr[i5 == true ? 1 : 0];
                                            }
                                            path3 = path2;
                                        } else {
                                            fArr = fArr4;
                                            Path path5 = path3;
                                            i5 = i8;
                                            float f60 = fArr[i5 == true ? 1 : 0];
                                            float f61 = fArr[(i5 == true ? 1 : 0) + 1];
                                            int i31 = (i5 == true ? 1 : 0) + 2;
                                            float f62 = fArr[i31];
                                            int i32 = (i5 == true ? 1 : 0) + 3;
                                            float f63 = fArr[i32];
                                            int i33 = (i5 == true ? 1 : 0) + 4;
                                            float f64 = fArr[i33];
                                            int i34 = (i5 == true ? 1 : 0) + 5;
                                            path = path5;
                                            path.cubicTo(f60, f61, f62, f63, f64, fArr[i34]);
                                            float f65 = fArr[i33];
                                            float f66 = fArr[i34];
                                            float f67 = fArr[i31];
                                            f21 = fArr[i32];
                                            f27 = f65;
                                            f28 = f66;
                                            f20 = f67;
                                        }
                                        path3 = path;
                                    } else {
                                        fArr = fArr4;
                                        Path path6 = path3;
                                        i5 = i8;
                                        float f68 = f27;
                                        float f69 = f28;
                                        int i35 = (i5 == true ? 1 : 0) + 5;
                                        float f70 = fArr[i35];
                                        int i36 = (i5 == true ? 1 : 0) + 6;
                                        C0381.m828(path6, f68, f69, f70, fArr[i36], fArr[i5 == true ? 1 : 0], fArr[(i5 == true ? 1 : 0) + 1], fArr[(i5 == true ? 1 : 0) + 2], fArr[(i5 == true ? 1 : 0) + 3] != 0.0f ? true : b == true ? 1 : 0, fArr[(i5 == true ? 1 : 0) + 4] != 0.0f ? true : b == true ? 1 : 0);
                                        path3 = path6;
                                        float f71 = fArr[i35];
                                        f21 = fArr[i36];
                                        f28 = f21;
                                        f20 = f71;
                                        f27 = f20;
                                    }
                                    i8 = i5 + i4;
                                    c3 = c2;
                                    fArr4 = fArr;
                                }
                                fArr3[b == true ? 1 : 0] = f27;
                                fArr3[1] = f28;
                                fArr3[2] = f20;
                                fArr3[3] = f21;
                                fArr3[4] = f24;
                                fArr3[5] = f25;
                                i7++;
                                c = c0381.f1421;
                                matrix4 = matrix6;
                                arrayList2 = arrayList3;
                                fAbs = f26;
                            }
                        } else {
                            z = true;
                        }
                        matrix2 = matrix4;
                        arrayList = arrayList2;
                        float f72 = fAbs;
                        Path path7 = this.f18921;
                        path7.reset();
                        if (abstractC2653 instanceof C4364) {
                            path7.setFillType(abstractC2653.f8805 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path7.addPath(path3, matrix5);
                            canvas.clipPath(path7);
                            z2 = b == true ? 1 : 0;
                        } else {
                            C1191 c1191 = (C1191) abstractC2653;
                            float f73 = c1191.f4107;
                            if (f73 == 0.0f && c1191.f4106 == 1.0f) {
                                z2 = b == true ? 1 : 0;
                            } else {
                                float f74 = c1191.f4108;
                                float f75 = (f73 + f74) % 1.0f;
                                float f76 = (c1191.f4106 + f74) % 1.0f;
                                PathMeasure pathMeasure = this.f18920;
                                if (pathMeasure == null) {
                                    pathMeasure = new PathMeasure();
                                    this.f18920 = pathMeasure;
                                }
                                z2 = b == true ? 1 : 0;
                                pathMeasure.setPath(path3, z2);
                                float length2 = this.f18920.getLength();
                                float f77 = f75 * length2;
                                float f78 = f76 * length2;
                                path3.reset();
                                PathMeasure pathMeasure2 = this.f18920;
                                if (f77 > f78) {
                                    boolean z3 = z;
                                    pathMeasure2.getSegment(f77, length2, path3, z3);
                                    f = 0.0f;
                                    this.f18920.getSegment(0.0f, f78, path3, z3);
                                } else {
                                    f = 0.0f;
                                    pathMeasure2.getSegment(f77, f78, path3, z);
                                }
                                path3.rLineTo(f, f);
                            }
                            path7.addPath(path3, matrix5);
                            C3510 c3510 = c1191.f4101;
                            if (((Shader) c3510.f11621) != null || c3510.f11622 != 0) {
                                if (this.f18919 == null) {
                                    Paint paint = new Paint(1);
                                    this.f18919 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f18919;
                                Shader shader = (Shader) c3510.f11621;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix5);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(c1191.f4102 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i37 = c3510.f11622;
                                    float f79 = c1191.f4102;
                                    PorterDuff.Mode mode = C3603.f11997;
                                    paint2.setColor((i37 & 16777215) | (((int) (Color.alpha(i37) * f79)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path7.setFillType(c1191.f8805 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path7, paint2);
                            }
                            C3510 c3511 = c1191.f4103;
                            if (((Shader) c3511.f11621) != null || c3511.f11622 != 0) {
                                if (this.f18924 == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f18924 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f18924;
                                Paint.Join join = c1191.f4105;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c1191.f4104;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c1191.f4110);
                                Shader shader2 = (Shader) c3511.f11621;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix5);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(c1191.f4109 * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i38 = c3511.f11622;
                                    float f80 = c1191.f4109;
                                    PorterDuff.Mode mode2 = C3603.f11997;
                                    paint4.setColor((i38 & 16777215) | (((int) (Color.alpha(i38) * f80)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c1191.f4100 * fMin * f72);
                                canvas.drawPath(path7, paint4);
                            }
                        }
                    }
                }
                i6 = i3 + 1;
                matrix4 = matrix2;
                arrayList2 = arrayList;
            }
            matrix2 = matrix4;
            arrayList = arrayList2;
            i3 = i6;
            i6 = i3 + 1;
            matrix4 = matrix2;
            arrayList2 = arrayList;
        }
        canvas.restore();
    }

    public C5738() {
        this.f18918 = new Matrix();
        this.f18922 = 0.0f;
        this.f18928 = 0.0f;
        this.f18927 = 0.0f;
        this.f18929 = 0.0f;
        this.f18925 = 255;
        this.f18926 = null;
        this.f18931 = null;
        this.f18932 = new C4461(0);
        this.f18930 = new C5873();
        this.f18923 = new Path();
        this.f18921 = new Path();
    }
}
