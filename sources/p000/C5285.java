package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: ۦَۜؔۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5285 extends AbstractC1127 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f17414;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f17415;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5285(int i, Object obj) {
        super(0);
        this.f17415 = i;
        this.f17414 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[LOOP:0: B:13:0x004b->B:23:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:303:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:306:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:308:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:311:0x05f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:312:0x05f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:318:0x0602  */
    /* JADX WARN: Code duplicated, block: B:325:0x0618  */
    /* JADX WARN: Code duplicated, block: B:330:0x0627  */
    /* JADX WARN: Code duplicated, block: B:333:0x064b  */
    /* JADX WARN: Code duplicated, block: B:335:0x064f  */
    /* JADX WARN: Code duplicated, block: B:337:0x0653  */
    /* JADX WARN: Code duplicated, block: B:391:0x0728 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:392:0x072a  */
    /* JADX WARN: Code duplicated, block: B:394:0x0739 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:395:0x073b  */
    /* JADX WARN: Code duplicated, block: B:397:0x0750  */
    /* JADX WARN: Code duplicated, block: B:399:0x0759  */
    /* JADX WARN: Code duplicated, block: B:402:0x0776  */
    /* JADX WARN: Code duplicated, block: B:405:0x077f  */
    /* JADX WARN: Code duplicated, block: B:407:0x0789  */
    /* JADX WARN: Code duplicated, block: B:414:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:416:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:421:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:425:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:427:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:429:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:436:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:486:0x0083 A[SYNTHETIC] */
    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        C5014 c5014;
        int i;
        boolean z;
        Exception exc;
        ColorSpace colorSpace;
        Context context;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        AbstractC3925 abstractC3925Mo2613;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int iMin;
        double dMax;
        Bitmap bitmapDecodeStream;
        Exception exc2;
        Matrix matrix;
        float width;
        float height;
        RectF rectF;
        float f;
        Bitmap.Config config4;
        Bitmap bitmapCreateBitmap;
        boolean z3;
        int iM3913;
        int iM3914;
        int i6;
        Bitmap.Config config5;
        C1946 c1946;
        int iM1519;
        long j;
        C3869 c3869;
        C3869 c38610;
        long j2 = 0;
        int i7 = 4;
        boolean z4 = false;
        switch (this.f17415) {
            case 0:
                AbstractC4009.m7180(((C0717) this.f17414).f2622, null);
                return C2358.f7817;
            case 1:
                return C2358.f7817;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0777 c0777 = (C0777) this.f17414;
                Object objM1671 = c0777.m1671();
                EnumC0211 enumC0211 = EnumC0211.f793;
                return Boolean.valueOf(objM1671 == enumC0211 && c0777.f2814.getValue() == enumC0211);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C4781 c4781 = (C4781) this.f17414;
                BitmapFactory.Options options = new BitmapFactory.Options();
                C1765 c1765 = c4781.f15775;
                AbstractC1237 abstractC1237 = c4781.f15776;
                C3988 c3988 = new C3988(abstractC1237.mo2610());
                C4162 c4162 = new C4162(c3988);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new C4809(new C4162(new C2454(c4162)), 1), null, options);
                Exception exc3 = (Exception) c3988.f13314;
                if (exc3 != null) {
                    throw exc3;
                }
                options.inJustDecodeBounds = false;
                Paint paint = AbstractC4565.f15073;
                String str = options.outMimeType;
                Set set = AbstractC0394.f1457;
                int iM6632 = AbstractC3761.m6632(2);
                if (iM6632 != 0) {
                    if (iM6632 == 1) {
                        if (str == null || !AbstractC0394.f1457.contains(str)) {
                            c5014 = C5014.f16590;
                        }
                        i = c5014.f16591;
                        z = c5014.f16592;
                        exc = (Exception) c3988.f13314;
                        if (exc != null) {
                            throw exc;
                        }
                        options.inMutable = false;
                        colorSpace = c1765.f5876;
                        context = c1765.f5881;
                        C0181 c0181 = c1765.f5882;
                        if (colorSpace != null) {
                            options.inPreferredColorSpace = colorSpace;
                        }
                        options.inPremultiplied = c1765.f5880;
                        config = c1765.f5879;
                        config = !z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.ARGB_8888;
                        if (c1765.f5888) {
                            config = Bitmap.Config.RGB_565;
                        }
                        config2 = options.outConfig;
                        config3 = Bitmap.Config.RGBA_F16;
                        if (config2 == config3) {
                            config = config3;
                        }
                        options.inPreferredConfig = config;
                        abstractC3925Mo2613 = abstractC1237.mo2613();
                        if (abstractC3925Mo2613 instanceof C3335) {
                            i2 = options.outWidth;
                            if (i2 > 0) {
                                i3 = 1;
                                options.inSampleSize = 1;
                                z2 = false;
                                options.inScaled = false;
                                bitmapDecodeStream = BitmapFactory.decodeStream(new C4809(c4162, i3), null, options);
                                c4162.close();
                                exc2 = (Exception) c3988.f13314;
                                if (exc2 != null) {
                                    throw exc2;
                                }
                                if (bitmapDecodeStream != null) {
                                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                    if (z == 0) {
                                        matrix = new Matrix();
                                        width = bitmapDecodeStream.getWidth() / 2.0f;
                                        height = bitmapDecodeStream.getHeight() / 2.0f;
                                        if (z) {
                                            matrix.postScale(-1.0f, 1.0f, width, height);
                                        }
                                        if (i > 0) {
                                            matrix.postRotate(i, width, height);
                                        }
                                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        f = rectF.left;
                                        if (f == 0.0f) {
                                            matrix.postTranslate(-f, -rectF.top);
                                        } else {
                                            matrix.postTranslate(-f, -rectF.top);
                                        }
                                        if (i != 90) {
                                            int height2 = bitmapDecodeStream.getHeight();
                                            int width2 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                                        } else {
                                            int height3 = bitmapDecodeStream.getHeight();
                                            int width3 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height3, width3, config4);
                                        }
                                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                        bitmapDecodeStream.recycle();
                                        bitmapDecodeStream = bitmapCreateBitmap;
                                    } else {
                                        matrix = new Matrix();
                                        width = bitmapDecodeStream.getWidth() / 2.0f;
                                        height = bitmapDecodeStream.getHeight() / 2.0f;
                                        if (z) {
                                            matrix.postScale(-1.0f, 1.0f, width, height);
                                        }
                                        if (i > 0) {
                                            matrix.postRotate(i, width, height);
                                        }
                                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        f = rectF.left;
                                        if (f == 0.0f) {
                                            matrix.postTranslate(-f, -rectF.top);
                                        } else {
                                            matrix.postTranslate(-f, -rectF.top);
                                        }
                                        if (i != 90) {
                                            int height4 = bitmapDecodeStream.getHeight();
                                            int width4 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height4, width4, config4);
                                        } else {
                                            int height5 = bitmapDecodeStream.getHeight();
                                            int width5 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height5, width5, config4);
                                        }
                                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                        bitmapDecodeStream.recycle();
                                        bitmapDecodeStream = bitmapCreateBitmap;
                                    }
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                                    if (options.inSampleSize <= 1) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    return new C5303(bitmapDrawable, z3);
                                }
                                C1078.m2276("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                            } else {
                                i3 = 1;
                                options.inSampleSize = 1;
                                z2 = false;
                                options.inScaled = false;
                                bitmapDecodeStream = BitmapFactory.decodeStream(new C4809(c4162, i3), null, options);
                                c4162.close();
                                exc2 = (Exception) c3988.f13314;
                                if (exc2 != null) {
                                    throw exc2;
                                }
                                if (bitmapDecodeStream != null) {
                                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                    if (z == 0) {
                                        matrix = new Matrix();
                                        width = bitmapDecodeStream.getWidth() / 2.0f;
                                        height = bitmapDecodeStream.getHeight() / 2.0f;
                                        if (z) {
                                            matrix.postScale(-1.0f, 1.0f, width, height);
                                        }
                                        if (i > 0) {
                                            matrix.postRotate(i, width, height);
                                        }
                                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        f = rectF.left;
                                        if (f == 0.0f) {
                                            matrix.postTranslate(-f, -rectF.top);
                                        } else {
                                            matrix.postTranslate(-f, -rectF.top);
                                        }
                                        if (i != 90) {
                                            int height6 = bitmapDecodeStream.getHeight();
                                            int width6 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height6, width6, config4);
                                        } else {
                                            int height7 = bitmapDecodeStream.getHeight();
                                            int width7 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height7, width7, config4);
                                        }
                                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                        bitmapDecodeStream.recycle();
                                        bitmapDecodeStream = bitmapCreateBitmap;
                                    } else {
                                        matrix = new Matrix();
                                        width = bitmapDecodeStream.getWidth() / 2.0f;
                                        height = bitmapDecodeStream.getHeight() / 2.0f;
                                        if (z) {
                                            matrix.postScale(-1.0f, 1.0f, width, height);
                                        }
                                        if (i > 0) {
                                            matrix.postRotate(i, width, height);
                                        }
                                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        f = rectF.left;
                                        if (f == 0.0f) {
                                            matrix.postTranslate(-f, -rectF.top);
                                        } else {
                                            matrix.postTranslate(-f, -rectF.top);
                                        }
                                        if (i != 90) {
                                            int height8 = bitmapDecodeStream.getHeight();
                                            int width8 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height8, width8, config4);
                                        } else {
                                            int height9 = bitmapDecodeStream.getHeight();
                                            int width9 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height9, width9, config4);
                                        }
                                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                        bitmapDecodeStream.recycle();
                                        bitmapDecodeStream = bitmapCreateBitmap;
                                    }
                                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                                    if (options.inSampleSize <= 1) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    return new C5303(bitmapDrawable2, z3);
                                }
                                C1078.m2276("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                            }
                        } else {
                            i2 = options.outWidth;
                            if (i2 > 0) {
                                i3 = 1;
                                options.inSampleSize = 1;
                                z2 = false;
                                options.inScaled = false;
                                bitmapDecodeStream = BitmapFactory.decodeStream(new C4809(c4162, i3), null, options);
                                c4162.close();
                                exc2 = (Exception) c3988.f13314;
                                if (exc2 != null) {
                                    throw exc2;
                                }
                                if (bitmapDecodeStream != null) {
                                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                    if (z == 0) {
                                        matrix = new Matrix();
                                        width = bitmapDecodeStream.getWidth() / 2.0f;
                                        height = bitmapDecodeStream.getHeight() / 2.0f;
                                        if (z) {
                                            matrix.postScale(-1.0f, 1.0f, width, height);
                                        }
                                        if (i > 0) {
                                            matrix.postRotate(i, width, height);
                                        }
                                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        f = rectF.left;
                                        if (f == 0.0f) {
                                            matrix.postTranslate(-f, -rectF.top);
                                        } else {
                                            matrix.postTranslate(-f, -rectF.top);
                                        }
                                        if (i != 90) {
                                            int height10 = bitmapDecodeStream.getHeight();
                                            int width10 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height10, width10, config4);
                                        } else {
                                            int height11 = bitmapDecodeStream.getHeight();
                                            int width11 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height11, width11, config4);
                                        }
                                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                        bitmapDecodeStream.recycle();
                                        bitmapDecodeStream = bitmapCreateBitmap;
                                    } else {
                                        matrix = new Matrix();
                                        width = bitmapDecodeStream.getWidth() / 2.0f;
                                        height = bitmapDecodeStream.getHeight() / 2.0f;
                                        if (z) {
                                            matrix.postScale(-1.0f, 1.0f, width, height);
                                        }
                                        if (i > 0) {
                                            matrix.postRotate(i, width, height);
                                        }
                                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        f = rectF.left;
                                        if (f == 0.0f) {
                                            matrix.postTranslate(-f, -rectF.top);
                                        } else {
                                            matrix.postTranslate(-f, -rectF.top);
                                        }
                                        if (i != 90) {
                                            int height12 = bitmapDecodeStream.getHeight();
                                            int width12 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height12, width12, config4);
                                        } else {
                                            int height13 = bitmapDecodeStream.getHeight();
                                            int width13 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height13, width13, config4);
                                        }
                                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                        bitmapDecodeStream.recycle();
                                        bitmapDecodeStream = bitmapCreateBitmap;
                                    }
                                    BitmapDrawable bitmapDrawable3 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                                    if (options.inSampleSize <= 1) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    return new C5303(bitmapDrawable3, z3);
                                }
                                C1078.m2276("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                            } else {
                                i3 = 1;
                                options.inSampleSize = 1;
                                z2 = false;
                                options.inScaled = false;
                                bitmapDecodeStream = BitmapFactory.decodeStream(new C4809(c4162, i3), null, options);
                                c4162.close();
                                exc2 = (Exception) c3988.f13314;
                                if (exc2 != null) {
                                    throw exc2;
                                }
                                if (bitmapDecodeStream != null) {
                                    bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                    if (z == 0) {
                                        matrix = new Matrix();
                                        width = bitmapDecodeStream.getWidth() / 2.0f;
                                        height = bitmapDecodeStream.getHeight() / 2.0f;
                                        if (z) {
                                            matrix.postScale(-1.0f, 1.0f, width, height);
                                        }
                                        if (i > 0) {
                                            matrix.postRotate(i, width, height);
                                        }
                                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        f = rectF.left;
                                        if (f == 0.0f) {
                                            matrix.postTranslate(-f, -rectF.top);
                                        } else {
                                            matrix.postTranslate(-f, -rectF.top);
                                        }
                                        if (i != 90) {
                                            int height14 = bitmapDecodeStream.getHeight();
                                            int width14 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height14, width14, config4);
                                        } else {
                                            int height15 = bitmapDecodeStream.getHeight();
                                            int width15 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height15, width15, config4);
                                        }
                                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                        bitmapDecodeStream.recycle();
                                        bitmapDecodeStream = bitmapCreateBitmap;
                                    } else {
                                        matrix = new Matrix();
                                        width = bitmapDecodeStream.getWidth() / 2.0f;
                                        height = bitmapDecodeStream.getHeight() / 2.0f;
                                        if (z) {
                                            matrix.postScale(-1.0f, 1.0f, width, height);
                                        }
                                        if (i > 0) {
                                            matrix.postRotate(i, width, height);
                                        }
                                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                        matrix.mapRect(rectF);
                                        f = rectF.left;
                                        if (f == 0.0f) {
                                            matrix.postTranslate(-f, -rectF.top);
                                        } else {
                                            matrix.postTranslate(-f, -rectF.top);
                                        }
                                        if (i != 90) {
                                            int height16 = bitmapDecodeStream.getHeight();
                                            int width16 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height16, width16, config4);
                                        } else {
                                            int height17 = bitmapDecodeStream.getHeight();
                                            int width17 = bitmapDecodeStream.getWidth();
                                            config4 = bitmapDecodeStream.getConfig();
                                            if (config4 == null) {
                                                config4 = Bitmap.Config.ARGB_8888;
                                            }
                                            bitmapCreateBitmap = Bitmap.createBitmap(height17, width17, config4);
                                        }
                                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                        bitmapDecodeStream.recycle();
                                        bitmapDecodeStream = bitmapCreateBitmap;
                                    }
                                    BitmapDrawable bitmapDrawable4 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                                    if (options.inSampleSize <= 1) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    return new C5303(bitmapDrawable4, z3);
                                }
                                C1078.m2276("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                            }
                        }
                    } else if (iM6632 != 2) {
                        C1078.m2275();
                    }
                    C5099 c5099 = new C5099(new C1739(new C4809(new C4162(new C2454(c4162)), 1)));
                    C2006 c2006M8707 = c5099.m8707("Orientation");
                    if (c2006M8707 == null) {
                        iM3913 = 1;
                    } else {
                        try {
                            iM3913 = c2006M8707.m3913(c5099.f16925);
                        } catch (NumberFormatException unused) {
                            iM3913 = 1;
                        }
                    }
                    boolean z5 = iM3913 == 2 || iM3913 == 7 || iM3913 == 4 || iM3913 == 5;
                    C2006 c2006M8708 = c5099.m8707("Orientation");
                    if (c2006M8708 == null) {
                        iM3914 = 1;
                    } else {
                        try {
                            iM3914 = c2006M8708.m3913(c5099.f16925);
                        } catch (NumberFormatException unused2) {
                            iM3914 = 1;
                        }
                    }
                    switch (iM3914) {
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            i6 = 180;
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                        case 8:
                            i6 = 270;
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            i6 = 90;
                            break;
                        default:
                            i6 = 0;
                            break;
                    }
                    c5014 = new C5014(i6, z5);
                    i = c5014.f16591;
                    z = c5014.f16592;
                    exc = (Exception) c3988.f13314;
                    if (exc != null) {
                        throw exc;
                    }
                    options.inMutable = false;
                    colorSpace = c1765.f5876;
                    context = c1765.f5881;
                    C0181 c0182 = c1765.f5882;
                    if (colorSpace != null) {
                        options.inPreferredColorSpace = colorSpace;
                    }
                    options.inPremultiplied = c1765.f5880;
                    config = c1765.f5879;
                    if (!z) {
                    }
                    if (c1765.f5888) {
                        config = Bitmap.Config.RGB_565;
                    }
                    config2 = options.outConfig;
                    config3 = Bitmap.Config.RGBA_F16;
                    if (config2 == config3) {
                        config = config3;
                    }
                    options.inPreferredConfig = config;
                    abstractC3925Mo2613 = abstractC1237.mo2613();
                    if (abstractC3925Mo2613 instanceof C3335) {
                        i2 = options.outWidth;
                        if (i2 > 0) {
                            i3 = 1;
                            options.inSampleSize = 1;
                            z2 = false;
                            options.inScaled = false;
                            bitmapDecodeStream = BitmapFactory.decodeStream(new C4809(c4162, i3), null, options);
                            c4162.close();
                            exc2 = (Exception) c3988.f13314;
                            if (exc2 != null) {
                                throw exc2;
                            }
                            if (bitmapDecodeStream != null) {
                                bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                if (z == 0) {
                                    matrix = new Matrix();
                                    width = bitmapDecodeStream.getWidth() / 2.0f;
                                    height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i > 0) {
                                        matrix.postRotate(i, width, height);
                                    }
                                    rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    f = rectF.left;
                                    if (f == 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    } else {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i != 90) {
                                        int height18 = bitmapDecodeStream.getHeight();
                                        int width18 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height18, width18, config4);
                                    } else {
                                        int height19 = bitmapDecodeStream.getHeight();
                                        int width19 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height19, width19, config4);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                } else {
                                    matrix = new Matrix();
                                    width = bitmapDecodeStream.getWidth() / 2.0f;
                                    height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i > 0) {
                                        matrix.postRotate(i, width, height);
                                    }
                                    rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    f = rectF.left;
                                    if (f == 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    } else {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i != 90) {
                                        int height110 = bitmapDecodeStream.getHeight();
                                        int width110 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height110, width110, config4);
                                    } else {
                                        int height111 = bitmapDecodeStream.getHeight();
                                        int width111 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height111, width111, config4);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                }
                                BitmapDrawable bitmapDrawable5 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                                if (options.inSampleSize <= 1) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                return new C5303(bitmapDrawable5, z3);
                            }
                            C1078.m2276("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        } else {
                            i3 = 1;
                            options.inSampleSize = 1;
                            z2 = false;
                            options.inScaled = false;
                            bitmapDecodeStream = BitmapFactory.decodeStream(new C4809(c4162, i3), null, options);
                            c4162.close();
                            exc2 = (Exception) c3988.f13314;
                            if (exc2 != null) {
                                throw exc2;
                            }
                            if (bitmapDecodeStream != null) {
                                bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                if (z == 0) {
                                    matrix = new Matrix();
                                    width = bitmapDecodeStream.getWidth() / 2.0f;
                                    height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i > 0) {
                                        matrix.postRotate(i, width, height);
                                    }
                                    rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    f = rectF.left;
                                    if (f == 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    } else {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i != 90) {
                                        int height112 = bitmapDecodeStream.getHeight();
                                        int width112 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height112, width112, config4);
                                    } else {
                                        int height113 = bitmapDecodeStream.getHeight();
                                        int width113 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height113, width113, config4);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                } else {
                                    matrix = new Matrix();
                                    width = bitmapDecodeStream.getWidth() / 2.0f;
                                    height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i > 0) {
                                        matrix.postRotate(i, width, height);
                                    }
                                    rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    f = rectF.left;
                                    if (f == 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    } else {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i != 90) {
                                        int height114 = bitmapDecodeStream.getHeight();
                                        int width114 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height114, width114, config4);
                                    } else {
                                        int height115 = bitmapDecodeStream.getHeight();
                                        int width115 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height115, width115, config4);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                }
                                BitmapDrawable bitmapDrawable6 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                                if (options.inSampleSize <= 1) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                return new C5303(bitmapDrawable6, z3);
                            }
                            C1078.m2276("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        }
                    } else {
                        i2 = options.outWidth;
                        if (i2 > 0) {
                            i3 = 1;
                            options.inSampleSize = 1;
                            z2 = false;
                            options.inScaled = false;
                            bitmapDecodeStream = BitmapFactory.decodeStream(new C4809(c4162, i3), null, options);
                            c4162.close();
                            exc2 = (Exception) c3988.f13314;
                            if (exc2 != null) {
                                throw exc2;
                            }
                            if (bitmapDecodeStream != null) {
                                bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                if (z == 0) {
                                    matrix = new Matrix();
                                    width = bitmapDecodeStream.getWidth() / 2.0f;
                                    height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i > 0) {
                                        matrix.postRotate(i, width, height);
                                    }
                                    rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    f = rectF.left;
                                    if (f == 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    } else {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i != 90) {
                                        int height116 = bitmapDecodeStream.getHeight();
                                        int width116 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height116, width116, config4);
                                    } else {
                                        int height117 = bitmapDecodeStream.getHeight();
                                        int width117 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height117, width117, config4);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                } else {
                                    matrix = new Matrix();
                                    width = bitmapDecodeStream.getWidth() / 2.0f;
                                    height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i > 0) {
                                        matrix.postRotate(i, width, height);
                                    }
                                    rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    f = rectF.left;
                                    if (f == 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    } else {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i != 90) {
                                        int height118 = bitmapDecodeStream.getHeight();
                                        int width118 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height118, width118, config4);
                                    } else {
                                        int height119 = bitmapDecodeStream.getHeight();
                                        int width119 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height119, width119, config4);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                }
                                BitmapDrawable bitmapDrawable7 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                                if (options.inSampleSize <= 1) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                return new C5303(bitmapDrawable7, z3);
                            }
                            C1078.m2276("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        } else {
                            i3 = 1;
                            options.inSampleSize = 1;
                            z2 = false;
                            options.inScaled = false;
                            bitmapDecodeStream = BitmapFactory.decodeStream(new C4809(c4162, i3), null, options);
                            c4162.close();
                            exc2 = (Exception) c3988.f13314;
                            if (exc2 != null) {
                                throw exc2;
                            }
                            if (bitmapDecodeStream != null) {
                                bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                if (z == 0) {
                                    matrix = new Matrix();
                                    width = bitmapDecodeStream.getWidth() / 2.0f;
                                    height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i > 0) {
                                        matrix.postRotate(i, width, height);
                                    }
                                    rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    f = rectF.left;
                                    if (f == 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    } else {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i != 90) {
                                        int height1110 = bitmapDecodeStream.getHeight();
                                        int width1110 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height1110, width1110, config4);
                                    } else {
                                        int height1111 = bitmapDecodeStream.getHeight();
                                        int width1111 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height1111, width1111, config4);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                } else {
                                    matrix = new Matrix();
                                    width = bitmapDecodeStream.getWidth() / 2.0f;
                                    height = bitmapDecodeStream.getHeight() / 2.0f;
                                    if (z) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i > 0) {
                                        matrix.postRotate(i, width, height);
                                    }
                                    rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    f = rectF.left;
                                    if (f == 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    } else {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i != 90) {
                                        int height1112 = bitmapDecodeStream.getHeight();
                                        int width1112 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height1112, width1112, config4);
                                    } else {
                                        int height1113 = bitmapDecodeStream.getHeight();
                                        int width1113 = bitmapDecodeStream.getWidth();
                                        config4 = bitmapDecodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(height1113, width1113, config4);
                                    }
                                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCreateBitmap;
                                }
                                BitmapDrawable bitmapDrawable8 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                                if (options.inSampleSize <= 1) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                return new C5303(bitmapDrawable8, z3);
                            }
                            C1078.m2276("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        }
                    }
                    break;
                } else {
                    c5014 = C5014.f16590;
                    i = c5014.f16591;
                    z = c5014.f16592;
                    exc = (Exception) c3988.f13314;
                    if (exc != null) {
                        throw exc;
                    }
                    options.inMutable = false;
                    colorSpace = c1765.f5876;
                    context = c1765.f5881;
                    C0181 c0183 = c1765.f5882;
                    if (colorSpace != null) {
                        options.inPreferredColorSpace = colorSpace;
                    }
                    options.inPremultiplied = c1765.f5880;
                    config = c1765.f5879;
                    if ((!z || i > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    }
                    if (c1765.f5888 && config == Bitmap.Config.ARGB_8888 && AbstractC3831.m6874(options.outMimeType, "image/jpeg")) {
                        config = Bitmap.Config.RGB_565;
                    }
                    config2 = options.outConfig;
                    config3 = Bitmap.Config.RGBA_F16;
                    if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                        config = config3;
                    }
                    options.inPreferredConfig = config;
                    abstractC3925Mo2613 = abstractC1237.mo2613();
                    if ((abstractC3925Mo2613 instanceof C3335) || !AbstractC3831.m6874(c0183, C0181.f668)) {
                        i2 = options.outWidth;
                        if (i2 > 0 || (i4 = options.outHeight) <= 0) {
                            i3 = 1;
                            options.inSampleSize = 1;
                            z2 = false;
                            options.inScaled = false;
                        } else {
                            int i8 = (i == 90 || i == 270) ? i4 : i2;
                            if (i != 90 && i != 270) {
                                i2 = i4;
                            }
                            int i9 = c1765.f5877;
                            C0181 c0184 = C0181.f668;
                            int iM7961 = AbstractC3831.m6874(c0183, c0184) ? i8 : AbstractC0080.m7961(c0183.f670, i9);
                            int iM7962 = AbstractC3831.m6874(c0183, c0184) ? i2 : AbstractC0080.m7961(c0183.f669, i9);
                            int iHighestOneBit = Integer.highestOneBit(i8 / iM7961);
                            int iHighestOneBit2 = Integer.highestOneBit(i2 / iM7962);
                            int iM6633 = AbstractC3761.m6632(i9);
                            if (iM6633 != 0) {
                                i5 = 1;
                                if (iM6633 == 1) {
                                    iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                                } else {
                                    C1078.m2275();
                                }
                            } else {
                                i5 = 1;
                                iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                            }
                            if (iMin < i5) {
                                iMin = 1;
                            }
                            options.inSampleSize = iMin;
                            double d = iMin;
                            double d2 = ((double) i8) / d;
                            double d3 = ((double) i2) / d;
                            double d4 = ((double) iM7961) / d2;
                            double d5 = ((double) iM7962) / d3;
                            int iM6634 = AbstractC3761.m6632(i9);
                            if (iM6634 == 0) {
                                dMax = Math.max(d4, d5);
                            } else if (iM6634 == 1) {
                                dMax = Math.min(d4, d5);
                            } else {
                                C1078.m2275();
                            }
                            if (c1765.f5878 && dMax > 1.0d) {
                                dMax = 1.0d;
                            }
                            boolean z6 = dMax == 1.0d;
                            options.inScaled = !z6;
                            if (!z6) {
                                if (dMax > 1.0d) {
                                    options.inDensity = AbstractC2776.m5229(2.147483647E9d / dMax);
                                    options.inTargetDensity = Integer.MAX_VALUE;
                                } else {
                                    options.inDensity = Integer.MAX_VALUE;
                                    options.inTargetDensity = AbstractC2776.m5229(2.147483647E9d * dMax);
                                }
                            }
                            z2 = false;
                            i3 = 1;
                        }
                    } else {
                        options.inSampleSize = 1;
                        options.inScaled = true;
                        options.inDensity = ((C3335) abstractC3925Mo2613).f11157;
                        options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                        z2 = false;
                        i3 = 1;
                    }
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(new C4809(c4162, i3), null, options);
                        c4162.close();
                        exc2 = (Exception) c3988.f13314;
                        if (exc2 != null) {
                            throw exc2;
                        }
                        if (bitmapDecodeStream != null) {
                            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                            if (z == 0 || i > 0) {
                                matrix = new Matrix();
                                width = bitmapDecodeStream.getWidth() / 2.0f;
                                height = bitmapDecodeStream.getHeight() / 2.0f;
                                if (z) {
                                    matrix.postScale(-1.0f, 1.0f, width, height);
                                }
                                if (i > 0) {
                                    matrix.postRotate(i, width, height);
                                }
                                rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                matrix.mapRect(rectF);
                                f = rectF.left;
                                if (f == 0.0f || rectF.top != 0.0f) {
                                    matrix.postTranslate(-f, -rectF.top);
                                }
                                if (i != 90 || i == 270) {
                                    int height1114 = bitmapDecodeStream.getHeight();
                                    int width1114 = bitmapDecodeStream.getWidth();
                                    config4 = bitmapDecodeStream.getConfig();
                                    if (config4 == null) {
                                        config4 = Bitmap.Config.ARGB_8888;
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(height1114, width1114, config4);
                                } else {
                                    int width20 = bitmapDecodeStream.getWidth();
                                    int height20 = bitmapDecodeStream.getHeight();
                                    Bitmap.Config config6 = bitmapDecodeStream.getConfig();
                                    if (config6 == null) {
                                        config6 = Bitmap.Config.ARGB_8888;
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(width20, height20, config6);
                                }
                                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, AbstractC4565.f15073);
                                bitmapDecodeStream.recycle();
                                bitmapDecodeStream = bitmapCreateBitmap;
                            }
                            BitmapDrawable bitmapDrawable9 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                            if (options.inSampleSize <= 1 || options.inScaled) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            return new C5303(bitmapDrawable9, z3);
                        }
                        C1078.m2276("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC4554.m7932(c4162, th);
                            throw th2;
                        }
                    }
                }
                return null;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return (C2793) this.f17414;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5686 c5686 = (C5686) this.f17414;
                boolean zM7431 = C4207.m7431(0L, 0L);
                View view = c5686.f18700;
                return zM7431 ? AbstractC5537.m9256(view) : new C2934(0L, AbstractC4009.m7168(view.getContext()).mo752(AbstractC5537.m9235(0L)));
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                Object obj = C0365.f1342;
                File file = (File) this.f17414;
                synchronized (obj) {
                    C0365.f1343.remove(file.getAbsolutePath());
                }
                return C2358.f7817;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C3468) this.f17414).m6250();
                return C2358.f7817;
            case 8:
                C1552 c1552 = (C1552) this.f17414;
                AbstractC1237 abstractC1238 = c1552.f5240;
                C1765 c1766 = c1552.f5239;
                C4162 c4163 = new C4162(new C2596(abstractC1238.mo2610()));
                try {
                    Movie movieDecodeStream = Movie.decodeStream(c4163.mo2675());
                    c4163.close();
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        C1078.m2276("Failed to decode GIF.");
                    } else {
                        if (movieDecodeStream.isOpaque() && c1766.f5888) {
                            config5 = Bitmap.Config.RGB_565;
                        } else {
                            config5 = c1766.f5879;
                            if (config5 == Bitmap.Config.HARDWARE) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                        }
                        int i10 = c1766.f5877;
                        C5311 c5311 = c1766.f5883;
                        C0283 c0283 = new C0283(movieDecodeStream, config5, i10);
                        if (c5311.f17489.get("coil#repeat_count") == null && c5311.f17489.get("coil#animation_start_callback") == null && c5311.f17489.get("coil#animation_end_callback") == null && c5311.f17489.get("coil#animated_transformation") == null) {
                            c0283.f1037 = null;
                            c0283.f1041 = 1;
                            c0283.f1043 = false;
                            c0283.invalidateSelf();
                            return new C5303(c0283, false);
                        }
                        C0178.m382();
                    }
                    return null;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC4554.m7932(c4163, th3);
                        throw th4;
                    }
                }
            case 9:
                return (List) this.f17414;
            case 10:
                try {
                    return (List) ((InterfaceC4448) this.f17414).mo449();
                } catch (SSLPeerUnverifiedException unused3) {
                    return C2340.f7777;
                }
            case 11:
                return (InputMethodManager) ((View) ((C2808) this.f17414).f9378).getContext().getSystemService("input_method");
            case 12:
                C1233 c1233 = ((C0605) this.f17414).f2261;
                c1233.f4252.f7746 = true;
                C2921 c2921 = c1233.f4240;
                if (c2921 != null) {
                    c2921.f9811 = true;
                }
                return C2358.f7817;
            case 13:
                C1325 c1325 = (C1325) this.f17414;
                if (!((Boolean) c1325.f4581.getValue()).booleanValue() && (c1946 = c1325.f4574) != null) {
                    c1946.m3824();
                }
                return C2358.f7817;
            case 14:
                C3860 c3860 = (C3860) ((C4782) this.f17414).f15779.f10451;
                if (!c3860.f12891) {
                    if (c3860.f12889) {
                        AbstractC2731.m5089("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c3860.m6893();
                    c3860.f12889 = true;
                }
                return C2358.f7817;
            case 15:
                ((InterfaceC4883) this.f17414).mo1376();
                return C2358.f7817;
            case 16:
                return ((C3323) this.f17414).f11135;
            case 17:
                return ((C1386) this.f17414).m2942();
            case 18:
                C2453 c2453 = (C2453) this.f17414;
                InterfaceC2015 parentLayoutCoordinates = c2453.getParentLayoutCoordinates();
                if (((parentLayoutCoordinates == null || !parentLayoutCoordinates.mo2807()) ? null : parentLayoutCoordinates) != null && c2453.m9800getPopupContentSizebOM6tXw() != null) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 19:
                File file2 = (File) ((C5304) this.f17414).mo449();
                if (AbstractC0684.m1535('.', file2.getName(), "").equals("preferences_pb")) {
                    return file2.getAbsoluteFile();
                }
                C1078.m2277(file2, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                return null;
            case 20:
                C5461 c5461 = (C5461) this.f17414;
                c5461.f18007 = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    c5461.m9138();
                    return C2358.f7817;
                } finally {
                    Trace.endSection();
                }
            case 21:
                C5134 c5134 = (C5134) this.f17414;
                ClassLoader classLoader = c5134.f17012;
                AbstractC1567 abstractC1567 = c5134.f17011;
                ArrayList<URL> list = Collections.list(classLoader.getResources(""));
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    if (AbstractC3831.m6874(url.getProtocol(), "file")) {
                        String str2 = C5051.f16766;
                        c38610 = new C3869(abstractC1567, C4992.m8379(new File(url.toURI())));
                    } else {
                        c38610 = null;
                    }
                    if (c38610 != null) {
                        arrayList.add(c38610);
                    }
                }
                ArrayList list2 = Collections.list(classLoader.getResources("META-INF/MANIFEST.MF"));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String string = ((URL) it.next()).toString();
                    if (string.startsWith("jar:file:") && (iM1519 = AbstractC0684.m1519(6, string, "!")) != -1) {
                        String str3 = C5051.f16766;
                        C5051 c5051M8379 = C4992.m8379(new File(URI.create(string.substring(i7, iM1519))));
                        String str4 = "unsupported zip: spanned";
                        C3886 c3886Mo1569 = abstractC1567.mo1569(c5051M8379);
                        try {
                            long size = c3886Mo1569.size();
                            long j3 = size - 22;
                            if (j3 < j2) {
                                throw new IOException("not a zip: size=" + c3886Mo1569.size());
                            }
                            long jMax = Math.max(size - 65558, j2);
                            j = j2;
                            long j4 = j3;
                            while (true) {
                                C4162 c4164 = new C4162(c3886Mo1569.m6971(j4));
                                try {
                                    if (c4164.m7363() == 101010256) {
                                        int iM7359 = c4164.m7359() & 65535;
                                        int iM73510 = c4164.m7359() & 65535;
                                        String str5 = str4;
                                        long jM7359 = c4164.m7359() & 65535;
                                        if (jM7359 != (c4164.m7359() & 65535) || iM7359 != 0 || iM73510 != 0) {
                                            throw new IOException(str5);
                                        }
                                        c4164.skip(4L);
                                        long jM7363 = ((long) c4164.m7363()) & 4294967295L;
                                        int iM73511 = c4164.m7359() & 65535;
                                        C1649 c1649 = new C1649(iM73511, jM7359, jM7363);
                                        c4164.m7360(iM73511);
                                        c4164.close();
                                        long j5 = j4 - 20;
                                        if (j5 > j) {
                                            C4162 c4165 = new C4162(c3886Mo1569.m6971(j5));
                                            try {
                                                if (c4165.m7363() == 117853008) {
                                                    int iM7363 = c4165.m7363();
                                                    long jM7358 = c4165.m7358();
                                                    if (c4165.m7363() != 1 || iM7363 != 0) {
                                                        throw new IOException(str5);
                                                    }
                                                    C4162 c4166 = new C4162(c3886Mo1569.m6971(jM7358));
                                                    try {
                                                        int iM7364 = c4166.m7363();
                                                        if (iM7364 != 101075792) {
                                                            throw new IOException("bad zip: expected " + AbstractC4489.m7781(101075792) + " but was " + AbstractC4489.m7781(iM7364));
                                                        }
                                                        c4166.skip(12L);
                                                        int iM7365 = c4166.m7363();
                                                        int iM7366 = c4166.m7363();
                                                        long jM73510 = c4166.m7358();
                                                        if (jM73510 != c4166.m7358() || iM7365 != 0 || iM7366 != 0) {
                                                            throw new IOException(str5);
                                                        }
                                                        c4166.skip(8L);
                                                        C1649 c16410 = new C1649(iM73511, jM73510, c4166.m7358());
                                                        c4166.close();
                                                        c1649 = c16410;
                                                    } catch (Throwable th5) {
                                                        try {
                                                            throw th5;
                                                        } catch (Throwable th6) {
                                                            AbstractC4554.m7932(c4166, th5);
                                                            throw th6;
                                                        }
                                                    }
                                                }
                                                c4165.close();
                                            } catch (Throwable th7) {
                                                try {
                                                    throw th7;
                                                } catch (Throwable th8) {
                                                    AbstractC4554.m7932(c4165, th7);
                                                    throw th8;
                                                }
                                            }
                                        }
                                        C1649 c16411 = c1649;
                                        long j6 = c16411.f5500;
                                        ArrayList arrayList3 = new ArrayList();
                                        C4162 c4167 = new C4162(c3886Mo1569.m6971(j6));
                                        try {
                                            long j7 = c16411.f5501;
                                            long j8 = j;
                                            while (j8 < j7) {
                                                C2440 c2440M7776 = AbstractC4489.m7776(c4167);
                                                long j9 = j6;
                                                if (c2440M7776.f8131 >= j9) {
                                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                                }
                                                C5051 c5051 = C5134.f17010;
                                                if (AbstractC1605.m3342(c2440M7776.f8129)) {
                                                    arrayList3.add(c2440M7776);
                                                }
                                                j8++;
                                                j6 = j9;
                                            }
                                            c4167.close();
                                            C0703 c0703 = new C0703(c5051M8379, abstractC1567, AbstractC4489.m7809(arrayList3));
                                            c3886Mo1569.close();
                                            c3869 = new C3869(c0703, C5134.f17010);
                                        } catch (Throwable th9) {
                                            try {
                                                throw th9;
                                            } catch (Throwable th10) {
                                                AbstractC4554.m7932(c4167, th9);
                                                throw th10;
                                            }
                                        }
                                        try {
                                            throw th;
                                        } catch (Throwable th11) {
                                            AbstractC4554.m7932(c3886Mo1569, th);
                                            throw th11;
                                        }
                                    }
                                    String str6 = str4;
                                    c4164.close();
                                    j4--;
                                    if (j4 < jMax) {
                                        throw new IOException("not a zip: end of central directory signature not found");
                                    }
                                    str4 = str6;
                                } catch (Throwable th12) {
                                    c4164.close();
                                    throw th12;
                                }
                            }
                        } catch (Throwable th13) {
                            throw th13;
                        }
                    } else {
                        j = j2;
                        c3869 = null;
                    }
                    if (c3869 != null) {
                        arrayList2.add(c3869);
                    }
                    j2 = j;
                    i7 = 4;
                }
                return AbstractC0973.m2049(arrayList, arrayList2);
            case 22:
                C0851 c0851M7619 = ((C4319) this.f17414).m7619();
                C0605 c0605 = c0851M7619.f3155;
                if (c0851M7619.f3149 != ((C0863) ((C3482) c0605.m1368()).f11560).f3180) {
                    C3262 c3262 = c0851M7619.f3146;
                    Object[] objArr = c3262.f10944;
                    long[] jArr = c3262.f10948;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j10 = jArr[i11];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j10) < 128) {
                                        ((C1325) objArr[(i11 << 3) + i13]).f4580 = true;
                                    }
                                    j10 >>= 8;
                                }
                                if (i12 == 8) {
                                    if (i11 != length) {
                                        i11++;
                                    }
                                }
                            } else if (i11 != length) {
                                i11++;
                            }
                        }
                    }
                    if (c0605.f2271 != null) {
                        if (!c0605.f2261.f4238) {
                            C0605.m1313(c0605, false, 7);
                        }
                    } else if (!c0605.m1324()) {
                        C0605.m1312(c0605, false, 7);
                    }
                }
                return C2358.f7817;
            case 23:
                return new BaseInputConnection(((C2240) this.f17414).f7419, false);
            default:
                C2161 c2161 = (C2161) this.f17414;
                C2358 c2358 = C2358.f7817;
                c2161.f7130.setValue(c2358);
                return c2358;
        }
    }
}
