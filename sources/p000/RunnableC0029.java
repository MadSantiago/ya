package p000;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥٛ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0029 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f5848;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5849;

    public /* synthetic */ RunnableC0029(int i, Object obj) {
        this.f5849 = i;
        this.f5848 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x025e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0272  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:172:0x030a  */
    /* JADX WARN: Code duplicated, block: B:174:0x030e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0327  */
    /* JADX WARN: Code duplicated, block: B:179:0x0331  */
    /* JADX WARN: Code duplicated, block: B:180:0x0367  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:191:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:195:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:199:0x0415  */
    /* JADX WARN: Code duplicated, block: B:201:0x0418  */
    /* JADX WARN: Code duplicated, block: B:203:0x041b A[LOOP:5: B:193:0x03f8->B:203:0x041b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0426  */
    /* JADX WARN: Code duplicated, block: B:208:0x042c  */
    /* JADX WARN: Code duplicated, block: B:250:0x0509  */
    /* JADX WARN: Code duplicated, block: B:357:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0432 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x042f A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850;
        int i;
        long j;
        long j2;
        float f;
        long j3;
        long j4;
        boolean z;
        float f2;
        C3312 c3312;
        float f3;
        float f4;
        float f5;
        float f6;
        C3312 c3313;
        boolean z2;
        ArrayList arrayList;
        C0254 c0254M536;
        ArrayList arrayList2;
        int iIndexOf;
        int i2;
        int size;
        float f7;
        C1257 c1257;
        Context context;
        View viewFindFocus;
        int i3 = 3;
        int i4 = 2;
        Object systemService = null;
        Map mapUnmodifiableMap = null;
        Boolean bool = null;
        boolean z3 = false;
        switch (this.f5849) {
            case 0:
                ((AbstractC0054) this.f5848).m5670();
                return;
            case 1:
                boolean z4 = true;
                Activity activity = (Activity) this.f5848;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = AbstractC4587.f15138;
                Method method = AbstractC4587.f15134;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i5 != 26 && i5 != 27) || method != null) && (AbstractC4587.f15133 != null || AbstractC4587.f15137 != null)) {
                    try {
                        Object obj2 = AbstractC4587.f15132.get(activity);
                        if (obj2 != null && (obj = AbstractC4587.f15135.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0239 c0239 = new C0239(activity);
                            application.registerActivityLifecycleCallbacks(c0239);
                            handler.post(new RunnableC4985(i4, c0239, obj2));
                            if (i5 != 26 && i5 != 27) {
                                z4 = false;
                            }
                            try {
                                if (z4) {
                                    Boolean bool2 = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool2, null, null, bool2, bool2);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC4985(i3, application, c0239));
                                return;
                            } catch (Throwable th) {
                                handler.post(new RunnableC4985(i3, application, c0239));
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = (ViewOnAttachStateChangeListenerC2392) this.f5848;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC2392.f7934.m1781(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC2392.m4507();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC2392.f7930 = false;
                        return;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ViewOnAttachStateChangeListenerC4316 viewOnAttachStateChangeListenerC4316 = (ViewOnAttachStateChangeListenerC4316) this.f5848;
                boolean zM7611 = viewOnAttachStateChangeListenerC4316.m7611();
                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0851 = viewOnAttachStateChangeListenerC4316.f14275;
                if (zM7611) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC0851.m1781(true);
                        C4912 c4912 = viewOnAttachStateChangeListenerC4316.f14271;
                        int[] iArr = c4912.f18947;
                        long[] jArr = c4912.f18948;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    long j6 = j5;
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((255 & j6) < 128) {
                                            int i9 = iArr[(i6 << 3) + i8];
                                            if (!viewOnAttachStateChangeListenerC4316.m7610().m9572(i9)) {
                                                viewOnAttachStateChangeListenerC4316.f14267.add(new C0359(i9, viewOnAttachStateChangeListenerC4316.f14270, 2, null));
                                                viewOnAttachStateChangeListenerC4316.f14272.mo5597(C2358.f7817);
                                            }
                                        }
                                        j6 >>= 8;
                                        i8++;
                                        viewTreeObserverOnGlobalLayoutListenerC0851 = viewTreeObserverOnGlobalLayoutListenerC0851;
                                    }
                                    viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                                    if (i7 == 8) {
                                    }
                                } else {
                                    viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                                }
                                if (i6 != length) {
                                    i6++;
                                    viewTreeObserverOnGlobalLayoutListenerC0851 = viewTreeObserverOnGlobalLayoutListenerC0850;
                                }
                            }
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            viewOnAttachStateChangeListenerC4316.m7612(viewTreeObserverOnGlobalLayoutListenerC0850.getSemanticsOwner().m9199(), viewOnAttachStateChangeListenerC4316.f14269);
                            Trace.endSection();
                            viewOnAttachStateChangeListenerC4316.m7613(viewOnAttachStateChangeListenerC4316.m7610());
                            viewOnAttachStateChangeListenerC4316.m7614();
                            viewOnAttachStateChangeListenerC4316.f14264 = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
                return;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ActionMode actionMode = ((C3738) this.f5848).f12448;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C0254 c0254 = (C0254) ((C0254) this.f5848).f942.f14025;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = c0254.f945;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    C1714 c1714 = (C1714) arrayList3.get(i10);
                    if (c1714 == null) {
                        jUptimeMillis = jUptimeMillis;
                        jUptimeMillis2 = jUptimeMillis2;
                    } else {
                        C0796 c0796 = c0254.f947;
                        Long l = (Long) c0796.get(c1714);
                        if (l == null) {
                            j = c1714.f5709;
                            if (j == 0) {
                                c1714.f5709 = jUptimeMillis;
                                c1714.m3532(c1714.f5702);
                                jUptimeMillis = jUptimeMillis;
                                jUptimeMillis2 = jUptimeMillis2;
                            } else {
                                j2 = jUptimeMillis - j;
                                c1714.f5709 = jUptimeMillis;
                                f = C0254.m536().f949;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = c1714.f5713;
                                f2 = c1714.f5712;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        c1714.f5707.f11094 = f2;
                                        c1714.f5712 = Float.MAX_VALUE;
                                    }
                                    c1714.f5702 = (float) c1714.f5707.f11094;
                                    c1714.f5704 = 0.0f;
                                    c1714.f5713 = z3;
                                    jUptimeMillis = jUptimeMillis;
                                    jUptimeMillis2 = jUptimeMillis2;
                                } else {
                                    c3312 = c1714.f5707;
                                    f3 = c1714.f5702;
                                    f4 = c1714.f5704;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j7 = j4 / 2;
                                        C4695 c4695M6087 = c3312.m6087(f3, f4, j7);
                                        C3312 c3314 = c1714.f5707;
                                        c3314.f11094 = c1714.f5712;
                                        c1714.f5712 = Float.MAX_VALUE;
                                        C4695 c4695M6088 = c3314.m6087(c4695M6087.f15484, c4695M6087.f15483, j7);
                                        f5 = c4695M6088.f15484;
                                        c1714.f5702 = f5;
                                        c1714.f5704 = c4695M6088.f15483;
                                    } else {
                                        C4695 c4695M6089 = c3312.m6087(f3, f4, j4);
                                        f5 = c4695M6089.f15484;
                                        c1714.f5702 = f5;
                                        c1714.f5704 = c4695M6089.f15483;
                                    }
                                    float fMax = Math.max(f5, c1714.f5703);
                                    c1714.f5702 = fMax;
                                    float fMin = Math.min(fMax, c1714.f5711);
                                    c1714.f5702 = fMin;
                                    f6 = c1714.f5704;
                                    c3313 = c1714.f5707;
                                    c3313.getClass();
                                    if (Math.abs(f6) < c3313.f11087) {
                                    }
                                    z2 = false;
                                    float fMin2 = Math.min(c1714.f5702, c1714.f5711);
                                    c1714.f5702 = fMin2;
                                    float fMax2 = Math.max(fMin2, c1714.f5703);
                                    c1714.f5702 = fMax2;
                                    c1714.m3532(fMax2);
                                    if (z2) {
                                        arrayList = c1714.f5710;
                                        c1714.f5701 = false;
                                        c0254M536 = C0254.m536();
                                        c0254M536.f947.remove(c1714);
                                        arrayList2 = c0254M536.f945;
                                        iIndexOf = arrayList2.indexOf(c1714);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            c0254M536.f944 = true;
                                        }
                                        c1714.f5709 = 0L;
                                        c1714.f5699 = false;
                                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                                            if (arrayList.get(i2) != null) {
                                                AbstractC4297 abstractC4297 = (AbstractC4297) arrayList.get(i2);
                                                f7 = c1714.f5702;
                                                abstractC4297.getClass();
                                                if (f7 < 1.0f) {
                                                    throw null;
                                                }
                                                throw null;
                                            }
                                        }
                                        for (size = arrayList.size() - 1; size >= 0; size--) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                z2 = true;
                                float fMin3 = Math.min(c1714.f5702, c1714.f5711);
                                c1714.f5702 = fMin3;
                                float fMax3 = Math.max(fMin3, c1714.f5703);
                                c1714.f5702 = fMax3;
                                c1714.m3532(fMax3);
                                if (z2) {
                                    arrayList = c1714.f5710;
                                    c1714.f5701 = false;
                                    c0254M536 = C0254.m536();
                                    c0254M536.f947.remove(c1714);
                                    arrayList2 = c0254M536.f945;
                                    iIndexOf = arrayList2.indexOf(c1714);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        c0254M536.f944 = true;
                                    }
                                    c1714.f5709 = 0L;
                                    c1714.f5699 = false;
                                    while (i2 < arrayList.size()) {
                                        if (arrayList.get(i2) != null) {
                                            AbstractC4297 abstractC4298 = (AbstractC4297) arrayList.get(i2);
                                            f7 = c1714.f5702;
                                            abstractC4298.getClass();
                                            if (f7 < 1.0f) {
                                                throw null;
                                            }
                                            throw null;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis2) {
                            c0796.remove(c1714);
                            j = c1714.f5709;
                            if (j == 0) {
                                c1714.f5709 = jUptimeMillis;
                                c1714.m3532(c1714.f5702);
                                jUptimeMillis = jUptimeMillis;
                                jUptimeMillis2 = jUptimeMillis2;
                            } else {
                                j2 = jUptimeMillis - j;
                                c1714.f5709 = jUptimeMillis;
                                f = C0254.m536().f949;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = c1714.f5713;
                                f2 = c1714.f5712;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        c1714.f5707.f11094 = f2;
                                        c1714.f5712 = Float.MAX_VALUE;
                                    }
                                    c1714.f5702 = (float) c1714.f5707.f11094;
                                    c1714.f5704 = 0.0f;
                                    c1714.f5713 = z3;
                                    jUptimeMillis = jUptimeMillis;
                                    jUptimeMillis2 = jUptimeMillis2;
                                } else {
                                    c3312 = c1714.f5707;
                                    f3 = c1714.f5702;
                                    f4 = c1714.f5704;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j8 = j4 / 2;
                                        C4695 c4695M60810 = c3312.m6087(f3, f4, j8);
                                        C3312 c3315 = c1714.f5707;
                                        c3315.f11094 = c1714.f5712;
                                        c1714.f5712 = Float.MAX_VALUE;
                                        C4695 c4695M60811 = c3315.m6087(c4695M60810.f15484, c4695M60810.f15483, j8);
                                        f5 = c4695M60811.f15484;
                                        c1714.f5702 = f5;
                                        c1714.f5704 = c4695M60811.f15483;
                                    } else {
                                        C4695 c4695M60812 = c3312.m6087(f3, f4, j4);
                                        f5 = c4695M60812.f15484;
                                        c1714.f5702 = f5;
                                        c1714.f5704 = c4695M60812.f15483;
                                    }
                                    float fMax4 = Math.max(f5, c1714.f5703);
                                    c1714.f5702 = fMax4;
                                    float fMin4 = Math.min(fMax4, c1714.f5711);
                                    c1714.f5702 = fMin4;
                                    f6 = c1714.f5704;
                                    c3313 = c1714.f5707;
                                    c3313.getClass();
                                    if (Math.abs(f6) < c3313.f11087 || Math.abs(fMin4 - ((float) c3313.f11094)) >= c3313.f11092) {
                                        z2 = false;
                                    } else {
                                        c1714.f5702 = (float) c1714.f5707.f11094;
                                        c1714.f5704 = 0.0f;
                                    }
                                    float fMin5 = Math.min(c1714.f5702, c1714.f5711);
                                    c1714.f5702 = fMin5;
                                    float fMax5 = Math.max(fMin5, c1714.f5703);
                                    c1714.f5702 = fMax5;
                                    c1714.m3532(fMax5);
                                    if (z2) {
                                        arrayList = c1714.f5710;
                                        c1714.f5701 = false;
                                        c0254M536 = C0254.m536();
                                        c0254M536.f947.remove(c1714);
                                        arrayList2 = c0254M536.f945;
                                        iIndexOf = arrayList2.indexOf(c1714);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            c0254M536.f944 = true;
                                        }
                                        c1714.f5709 = 0L;
                                        c1714.f5699 = false;
                                        while (i2 < arrayList.size()) {
                                            if (arrayList.get(i2) != null) {
                                                AbstractC4297 abstractC4299 = (AbstractC4297) arrayList.get(i2);
                                                f7 = c1714.f5702;
                                                abstractC4299.getClass();
                                                if (f7 < 1.0f) {
                                                    throw null;
                                                }
                                                throw null;
                                            }
                                        }
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                z2 = true;
                                float fMin6 = Math.min(c1714.f5702, c1714.f5711);
                                c1714.f5702 = fMin6;
                                float fMax6 = Math.max(fMin6, c1714.f5703);
                                c1714.f5702 = fMax6;
                                c1714.m3532(fMax6);
                                if (z2) {
                                    arrayList = c1714.f5710;
                                    c1714.f5701 = false;
                                    c0254M536 = C0254.m536();
                                    c0254M536.f947.remove(c1714);
                                    arrayList2 = c0254M536.f945;
                                    iIndexOf = arrayList2.indexOf(c1714);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        c0254M536.f944 = true;
                                    }
                                    c1714.f5709 = 0L;
                                    c1714.f5699 = false;
                                    while (i2 < arrayList.size()) {
                                        if (arrayList.get(i2) != null) {
                                            AbstractC4297 abstractC42910 = (AbstractC4297) arrayList.get(i2);
                                            f7 = c1714.f5702;
                                            abstractC42910.getClass();
                                            if (f7 < 1.0f) {
                                                throw null;
                                            }
                                            throw null;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            jUptimeMillis = jUptimeMillis;
                            jUptimeMillis2 = jUptimeMillis2;
                        }
                    }
                    i10++;
                    jUptimeMillis2 = jUptimeMillis2;
                    jUptimeMillis = jUptimeMillis;
                    z3 = false;
                }
                if (c0254.f944) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    if (arrayList3.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        C5002 c5002 = c0254.f946;
                        ValueAnimator.unregisterDurationScaleChangeListener((C5661) c5002.f16551);
                        c5002.f16551 = null;
                    }
                    i = 0;
                    c0254.f944 = false;
                } else {
                    i = 0;
                }
                if (arrayList3.size() > 0) {
                    ((Choreographer) c0254.f943.f16551).postFrameCallback(new ChoreographerFrameCallbackC1810(c0254.f948, i));
                    return;
                }
                return;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context2 = (Context) this.f5848;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i11 >= 33) {
                            C1821 c1821 = AbstractC3533.f11721;
                            c1821.getClass();
                            C1102 c1102 = new C1102(c1821);
                            while (c1102.hasNext()) {
                                AbstractC3533 abstractC3533 = (AbstractC3533) ((WeakReference) c1102.next()).get();
                                if (abstractC3533 != null && (context = ((LayoutInflaterFactory2C1852) abstractC3533).f6156) != null) {
                                    systemService = context.getSystemService("locale");
                                    if (systemService != null) {
                                        c1257 = new C1257(new C3446(AbstractC4458.m7741(systemService)));
                                    } else {
                                        c1257 = C1257.f4323;
                                    }
                                }
                            }
                            if (systemService != null) {
                                c1257 = new C1257(new C3446(AbstractC4458.m7741(systemService)));
                            } else {
                                c1257 = C1257.f4323;
                            }
                        } else {
                            c1257 = AbstractC3533.f11717;
                            if (c1257 == null) {
                                c1257 = C1257.f4323;
                            }
                        }
                        if (c1257.f4324.f11452.isEmpty()) {
                            String strM6873 = AbstractC3831.m6873(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                AbstractC4458.m7740(systemService2, AbstractC3765.m6641(strM6873));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC3533.f11719 = true;
                return;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((AbstractC1053) this.f5848).mo2260();
                return;
            case 8:
                ViewTreeObserverOnDrawListenerC4281 viewTreeObserverOnDrawListenerC4281 = (ViewTreeObserverOnDrawListenerC4281) this.f5848;
                Runnable runnable = viewTreeObserverOnDrawListenerC4281.f14166;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC4281.f14166 = null;
                    return;
                }
                return;
            case 9:
                DialogC2438.m4548((DialogC2438) this.f5848);
                return;
            case 10:
                Iterator it = ((C2790) this.f5848).f9331.iterator();
                if (it.hasNext()) {
                    throw AbstractC5078.m8675(it);
                }
                return;
            case 11:
                InterfaceC3196 interfaceC3196 = (InterfaceC3196) this.f5848;
                if (interfaceC3196 != null) {
                    interfaceC3196.mo871(null);
                    return;
                }
                return;
            case 12:
                ((C0324) this.f5848).m727();
                return;
            case 13:
                ((C4432) this.f5848).m7725();
                return;
            case 14:
                C5273.setRippleState$lambda$1((C5273) this.f5848);
                return;
            case 15:
                InterfaceC0964 interfaceC0964 = (InterfaceC0964) this.f5848;
                try {
                    ExecutorService executorService = C3267.f10970;
                    C3267 c3267M4818 = AbstractC2552.m4818();
                    if (c3267M4818.m6030()) {
                        c3267M4818.m6033(interfaceC0964);
                        return;
                    }
                    return;
                } catch (IOException e) {
                    AbstractC2774.m5205("LIBSU", e);
                    return;
                }
            case 16:
                ((Iterator) this.f5848).remove();
                return;
            case 17:
                C3267 c3267 = (C3267) this.f5848;
                while (true) {
                    InterfaceC0964 interfaceC0964M6031 = c3267.m6031(false);
                    if (interfaceC0964M6031 == null) {
                        return;
                    } else {
                        try {
                            c3267.m6034(interfaceC0964M6031);
                        } catch (IOException unused2) {
                        }
                    }
                }
                break;
            case 18:
                BinderC0972 binderC0972 = (BinderC0972) this.f5848;
                HashSet hashSet = binderC0972.f3434;
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((ServiceConnection) it2.next()).onServiceDisconnected(binderC0972.f3433);
                }
                hashSet.clear();
                AbstractC2605.m4915(binderC0972);
                return;
            case 19:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ((C1039) this.f5848).f3672;
                int i12 = sideSheetBehavior.f343;
                if (i12 != 2 || i12 == 0) {
                    return;
                }
                sideSheetBehavior.f343 = 0;
                return;
            case 20:
                View view = (View) this.f5848;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 21:
                C5257 c5257 = ((C1909) this.f5848).f6299;
                ViewParent parent = c5257.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c5257);
                    return;
                }
                return;
            case 22:
                C2240 c2240 = (C2240) this.f5848;
                C2808 c2808 = c2240.f7417;
                c2240.f7427 = null;
                C0863 c0863 = c2240.f7422;
                View view2 = c2240.f7419;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    c0863.m1851();
                    return;
                }
                Object[] objArr = c0863.f3182;
                int i13 = c0863.f3180;
                Boolean boolValueOf = null;
                for (int i14 = 0; i14 < i13; i14++) {
                    EnumC2261 enumC2261 = (EnumC2261) objArr[i14];
                    int iOrdinal = enumC2261.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            C1078.m2275();
                            return;
                        } else if (!AbstractC3831.m6874(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(enumC2261 == EnumC2261.f7513);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                c0863.m1851();
                if (AbstractC3831.m6874(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((InterfaceC5130) c2808.f9376).getValue()).restartInput((View) c2808.f9378);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((C3121) ((C1039) c2808.f9377).f3672).mo3458();
                    } else {
                        ((C3121) ((C1039) c2808.f9377).f3672).mo3459();
                    }
                }
                if (AbstractC3831.m6874(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((InterfaceC5130) c2808.f9376).getValue()).restartInput((View) c2808.f9378);
                    return;
                }
                return;
            case 23:
                C1405 c1405 = (C1405) this.f5848;
                ((AtomicReference) c1405.f4835).set(null);
                synchronized (c1405) {
                    if (((AtomicMarkableReference) c1405.f4836).isMarked()) {
                        C5911 c5911 = (C5911) ((AtomicMarkableReference) c1405.f4836).getReference();
                        synchronized (c5911) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(c5911.f19498));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c1405.f4836;
                        atomicMarkableReference.set((C5911) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    C2711 c2711 = (C2711) c1405.f4838;
                    ((C1640) c2711.f8984).m3456((String) c2711.f8985, mapUnmodifiableMap, c1405.f4837);
                    return;
                }
                return;
            default:
                C1489 c1489 = (C1489) this.f5848;
                ((C1835) c1489.f5056).m3609(new C5322(14, c1489));
                return;
        }
    }
}
