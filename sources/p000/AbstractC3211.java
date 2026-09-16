package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: ۦؔؑۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3211 {

    /* JADX INFO: renamed from: ۥؗ */
    public static Paint f10768;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2094 f10769;

    /* JADX INFO: renamed from: ۥۣ */
    public static final AbstractC1434 f10770;

    static {
        Trace.beginSection(AbstractC5568.m9363("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f10770 = new C3929(24);
        } else if (i >= 29) {
            f10770 = new C1274(24);
        } else if (i >= 28) {
            f10770 = new C1889();
        } else {
            f10770 = new C3247();
        }
        f10769 = new C2094(16);
        f10768 = null;
        Trace.endSection();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static Typeface m5897(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static String m5898(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۣ */
    public static Typeface m5899(Context context, InterfaceC3953 interfaceC3953, Resources resources, int i, String str, int i2, int i3, C0835 c0835, boolean z) {
        Typeface typefaceMo2708;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 18;
        if (interfaceC3953 instanceof C2924) {
            C2924 c2924 = (C2924) interfaceC3953;
            String str2 = c2924.f9836;
            typefaceMo2708 = null;
            int i5 = 1;
            char c = 0;
            byte b = 0;
            byte b2 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = m5897(str2)) == null) {
                ArrayList arrayList = c2924.f9835;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayList.size()) {
                                        C0223 c0223 = (C0223) arrayList.get(i7);
                                        if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(c0223.f829)) {
                                            customFallbackBuilder.setSystemFallback(c0223.f828);
                                        } else {
                                            String str3 = c0223.f828;
                                            String str4 = c0223.f829;
                                            Font fontM5900 = m5900(m5897(str3));
                                            if (fontM5900 == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + c0223.f828 + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontM5900).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(AbstractC5617.m9471(fontM5900).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i7++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (m5897(((C0223) arrayList.get(i6)).f828) != null) {
                                i6++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = m5897(((C0223) arrayList.get(0)).f828);
            }
            if (typefaceBuild != null) {
                if (c0835 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC5689(i4, c0835, typefaceBuild));
                }
                f10769.m4041(m5898(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            byte b3 = !z ? c0835 != null : c2924.f9833 != 0;
            int i8 = z ? c2924.f9834 : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C3121 c3121 = new C3121(c, 27);
            c3121.f10451 = c0835;
            ArrayList arrayList2 = c2924.f9835;
            ExecutorC5176 executorC5176 = new ExecutorC5176(handler);
            C5002 c5002 = new C5002(12, c3121, executorC5176, b2 == true ? 1 : 0);
            int i9 = 6;
            if (b3 != true) {
                String strM9460 = AbstractC5610.m9460(i3, arrayList2);
                Typeface typeface = (Typeface) AbstractC5610.f18469.m4035(strM9460);
                if (typeface != null) {
                    executorC5176.execute(new RunnableC4985(i9, c3121, typeface));
                    typefaceMo2708 = typeface;
                } else {
                    C3334 c3334 = new C3334(b == true ? 1 : 0, c5002);
                    synchronized (AbstractC5610.f18467) {
                        try {
                            C0796 c0796 = AbstractC5610.f18470;
                            ArrayList arrayList3 = (ArrayList) c0796.get(strM9460);
                            if (arrayList3 != null) {
                                arrayList3.add(c3334);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(c3334);
                                c0796.put(strM9460, arrayList4);
                                CallableC0421 callableC0421 = new CallableC0421(strM9460, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC5610.f18468;
                                C3334 c3335 = new C3334(i5, strM9460);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC0624 runnableC0624 = new RunnableC0624();
                                runnableC0624.f2313 = callableC0421;
                                runnableC0624.f2311 = c3335;
                                runnableC0624.f2312 = handler2;
                                threadPoolExecutor.execute(runnableC0624);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    C1078.m2272("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                C0223 c0224 = (C0223) arrayList2.get(0);
                C2094 c2094 = AbstractC5610.f18469;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{c0224}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strM9461 = AbstractC5610.m9460(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) AbstractC5610.f18469.m4035(strM9461);
                if (typeface2 != null) {
                    executorC5176.execute(new RunnableC4985(i9, c3121, typeface2));
                    typefaceMo2708 = typeface2;
                } else if (i8 == -1) {
                    Object[] objArr = {c0224};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    C2413 c2413M9459 = AbstractC5610.m9459(strM9461, context, Collections.unmodifiableList(arrayList6), i3);
                    c5002.m8406(c2413M9459);
                    typefaceMo2708 = c2413M9459.f8033;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    C2413 c2413 = (C2413) AbstractC5610.f18468.submit(new CallableC0421(strM9461, context, c0224, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                    c5002.m8406(c2413);
                                    typefaceMo2708 = c2413.f8033;
                                } catch (ExecutionException e) {
                                    throw new RuntimeException(e);
                                }
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((ExecutorC5176) c5002.f16550).execute(new RunnableC2054((C3121) c5002.f16551, -3));
                    }
                }
            }
        } else {
            typefaceMo2708 = f10770.mo2708(context, (C2293) interfaceC3953, resources, i3);
            if (c0835 != null) {
                if (typefaceMo2708 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC5689(i4, c0835, typefaceMo2708));
                } else {
                    c0835.m1735(-3);
                }
            }
        }
        if (typefaceMo2708 != null) {
            f10769.m4041(m5898(resources, i, str, i2, i3), typefaceMo2708);
        }
        return typefaceMo2708;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static Font m5900(Typeface typeface) {
        Paint paint = f10768;
        if (paint == null) {
            paint = new Paint();
            f10768 = paint;
        }
        paint.setTextSize(10.0f);
        f10768.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f10768);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
