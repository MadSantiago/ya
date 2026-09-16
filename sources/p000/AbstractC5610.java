package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦًْۣؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5610 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final Object f18467;

    /* JADX INFO: renamed from: ۥۗ */
    public static final ThreadPoolExecutor f18468;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2094 f18469 = new C2094(16);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0796 f18470;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC5169(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f18468 = threadPoolExecutor;
        f18467 = new Object();
        f18470 = new C0796(0);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C2413 m9459(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceMo2706;
        C2094 c2094 = f18469;
        Trace.beginSection(AbstractC5568.m9363("getFontSync"));
        try {
            Typeface typeface = (Typeface) c2094.m4035(str);
            if (typeface != null) {
                C2413 c2413 = new C2413(typeface);
                Trace.endSection();
                return c2413;
            }
            try {
                C0918 c0918M4879 = AbstractC2583.m4879(context, list);
                List list2 = c0918M4879.f3293;
                int i3 = c0918M4879.f3292;
                if (i3 == 0) {
                    C5056[] c5056Arr = (C5056[]) list2.get(0);
                    if (c5056Arr == null || c5056Arr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = c5056Arr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = c5056Arr[i4].f16788;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    C2413 c2414 = new C2413(i2);
                    Trace.endSection();
                    return c2414;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    C5056[] c5056Arr2 = (C5056[]) list2.get(0);
                    AbstractC1434 abstractC1434 = AbstractC3211.f10770;
                    Trace.beginSection(AbstractC5568.m9363("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceMo2706 = AbstractC3211.f10770.mo2706(context, c5056Arr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    AbstractC1434 abstractC1435 = AbstractC3211.f10770;
                    Trace.beginSection(AbstractC5568.m9363("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceMo2706 = AbstractC3211.f10770.mo2707(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceMo2706 == null) {
                    C2413 c2415 = new C2413(-3);
                    Trace.endSection();
                    return c2415;
                }
                c2094.m4041(str, typefaceMo2706);
                C2413 c2416 = new C2413(typefaceMo2706);
                Trace.endSection();
                return c2416;
            } catch (PackageManager.NameNotFoundException unused) {
                C2413 c2417 = new C2413(-1);
                Trace.endSection();
                return c2417;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m9460(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C0223) list.get(i2)).f833);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
