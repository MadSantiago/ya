package p000;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.DoubleUnaryOperator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: ۥٟؑؓٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0186 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C2274 f680;

    /* JADX INFO: renamed from: ۥّ */
    public static final C2274 f681;

    /* JADX INFO: renamed from: ۥۜ */
    public static final C2274[] f683;

    /* JADX INFO: renamed from: ۦؚ */
    public static C0909 f686 = null;

    /* JADX INFO: renamed from: ۦٌ */
    public static boolean f687 = false;

    /* JADX INFO: renamed from: ۦِ */
    public static Method f688 = null;

    /* JADX INFO: renamed from: ۦٛ */
    public static Method f689 = null;

    /* JADX INFO: renamed from: ۦۗ */
    public static boolean f690 = false;

    /* JADX INFO: renamed from: ۦۙ */
    public static final C2274 f691;

    /* JADX INFO: renamed from: ۦۚ */
    public static Method f692 = null;

    /* JADX INFO: renamed from: ۦ۟ */
    public static Field f693 = null;

    /* JADX INFO: renamed from: ۦۨ */
    public static boolean f694 = false;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1634 f684 = new C1634(1.0f, 1.0f);

    /* JADX INFO: renamed from: ۥۗ */
    public static final InterfaceC0103[] f682 = new InterfaceC0103[0];

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3223 f679 = new C3223(28);

    /* JADX INFO: renamed from: ۦؑ */
    public static final Object f685 = new Object();

    static {
        C2274 c2274 = new C2274(1L, "commit_to_configuration_v2_api", true, -1);
        f680 = c2274;
        C2274 c2275 = new C2274(1L, "get_serving_version_api", true, -1);
        C2274 c2276 = new C2274(1L, "get_experiment_tokens_api", true, -1);
        C2274 c2277 = new C2274(2L, "register_flag_update_listener_api", true, -1);
        f681 = c2277;
        C2274 c2278 = new C2274(1L, "sync_after_api", true, -1);
        C2274 c2279 = new C2274(1L, "sync_after_for_application_api", true, -1);
        C2274 c22710 = new C2274(1L, "set_app_wide_properties_api", true, -1);
        C2274 c22711 = new C2274(1L, "set_runtime_properties_api", true, -1);
        C2274 c22712 = new C2274(1L, "get_storage_info_api", true, -1);
        f691 = c22712;
        f683 = new C2274[]{c2274, c2275, c2276, c2277, c2278, c2279, c22710, c22711, c22712};
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static boolean m408(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static final void m409(Object obj) {
        if (obj instanceof C4535) {
            throw ((C4535) obj).f14986;
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static C3510 m410(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C3510 c3510M6293;
        if (m408(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C3510((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c3510M6293 = C3510.m6293(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c3510M6293 = null;
            }
            if (c3510M6293 != null) {
                return c3510M6293;
            }
        }
        return new C3510((Shader) null, (ColorStateList) null, 0);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    /* JADX INFO: renamed from: ۥؗ */
    public static C1955 m411(int i, int i2, int i3) {
        ColorSpace rgb;
        String str;
        float[] fArrM9595;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] fArr;
        final int i4;
        ColorSpace.Rgb rgb2;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        C4017 c4017 = C3444.f11429;
        AbstractC0949.m1954(i3);
        Bitmap.Config configM1954 = AbstractC0949.m1954(i3);
        if (AbstractC3831.m6874(c4017, c4017)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (AbstractC3831.m6874(c4017, C3444.f11431)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (AbstractC3831.m6874(c4017, C3444.f11432)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (AbstractC3831.m6874(c4017, C3444.f11451)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (AbstractC3831.m6874(c4017, C3444.f11442)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (AbstractC3831.m6874(c4017, C3444.f11445)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (AbstractC3831.m6874(c4017, C3444.f11433)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (AbstractC3831.m6874(c4017, C3444.f11428)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (AbstractC3831.m6874(c4017, C3444.f11446)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (AbstractC3831.m6874(c4017, C3444.f11440)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (AbstractC3831.m6874(c4017, C3444.f11447)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (AbstractC3831.m6874(c4017, C3444.f11437)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (AbstractC3831.m6874(c4017, C3444.f11430)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (AbstractC3831.m6874(c4017, C3444.f11441)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (AbstractC3831.m6874(c4017, C3444.f11450)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!AbstractC3831.m6874(c4017, C3444.f11448)) {
                if (Build.VERSION.SDK_INT >= 34) {
                    if (AbstractC3831.m6874(c4017, C3444.f11449)) {
                        colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                    } else {
                        colorSpace2 = AbstractC3831.m6874(c4017, C3444.f11435) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    }
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                    } else if (c4017 != null) {
                        str = c4017.f11028;
                        fArrM9595 = c4017.f13390.m9595();
                        C2318 c2318 = c4017.f13396;
                        if (c2318 != null) {
                        }
                        fArr = c4017.f13394;
                        i4 = 0;
                        if (transferParameters != null) {
                            rgb2 = new ColorSpace.Rgb(str, c4017.f13389, fArrM9595, transferParameters);
                            if (!Float.isNaN(fArr[0])) {
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                        } else {
                            float[] fArr2 = c4017.f13389;
                            final C0513 c0513 = c4017.f13391;
                            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: ۥّؔؗۖ
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    int i5 = i4;
                                    InterfaceC4745 interfaceC4745 = c0513;
                                    switch (i5) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) interfaceC4745.mo211(Double.valueOf(d))).doubleValue();
                                }
                            };
                            final C0513 c0514 = c4017.f13399;
                            final int i5 = 1;
                            rgb2 = new ColorSpace.Rgb(str, fArr2, fArrM9595, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: ۥّؔؗۖ
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    int i6 = i5;
                                    InterfaceC4745 interfaceC4745 = c0514;
                                    switch (i6) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) interfaceC4745.mo211(Double.valueOf(d))).doubleValue();
                                }
                            }, c4017.f13386, c4017.f13387);
                        }
                        colorSpace = rgb2;
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                } else if (c4017 != null) {
                    str = c4017.f11028;
                    fArrM9595 = c4017.f13390.m9595();
                    C2318 c2319 = c4017.f13396;
                    transferParameters = c2319 != null ? new ColorSpace.Rgb.TransferParameters(c2319.f7664, c2319.f7661, c2319.f7666, c2319.f7662, c2319.f7663, c2319.f7667, c2319.f7665) : null;
                    fArr = c4017.f13394;
                    i4 = 0;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, c4017.f13389, fArrM9595, transferParameters);
                        if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr3 = c4017.f13389;
                        final InterfaceC4745 c0515 = c4017.f13391;
                        DoubleUnaryOperator doubleUnaryOperator2 = new DoubleUnaryOperator() { // from class: ۥّؔؗۖ
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i6 = i4;
                                InterfaceC4745 interfaceC4745 = c0515;
                                switch (i6) {
                                    case 0:
                                        break;
                                }
                                return ((Number) interfaceC4745.mo211(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final InterfaceC4745 c0516 = c4017.f13399;
                        final int i6 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr3, fArrM9595, doubleUnaryOperator2, new DoubleUnaryOperator() { // from class: ۥّؔؗۖ
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i7 = i6;
                                InterfaceC4745 interfaceC4745 = c0516;
                                switch (i7) {
                                    case 0:
                                        break;
                                }
                                return ((Number) interfaceC4745.mo211(Double.valueOf(d))).doubleValue();
                            }
                        }, c4017.f13386, c4017.f13387);
                    }
                    colorSpace = rgb2;
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new C1955(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM1954, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = rgb;
        return new C1955(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM1954, true, colorSpace));
    }

    /* JADX INFO: renamed from: ۥً */
    public static final void m412(InterfaceC5671 interfaceC5671) {
        AbstractC5537.m9270(interfaceC5671).m1334();
    }

    /* JADX INFO: renamed from: ۥَ */
    public static boolean m413(InterfaceC0608 interfaceC0608, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0608 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0608.mo547(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f687) {
                            try {
                                f692 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f687 = true;
                        }
                        Method method = f692;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (AbstractC3608.m6427(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f694) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f693 = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f694 = true;
                }
                Field field = f693;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (AbstractC3608.m6427(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && AbstractC3608.m6427(view, keyEvent)) || interfaceC0608.mo547(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m414(C4319 c4319, InterfaceC0705 interfaceC0705, InterfaceC5731 interfaceC5731, C5362 c5362, int i) {
        int i2;
        c5362.m8979(-511989831);
        if ((i & 6) == 0) {
            i2 = (c5362.m8977(c4319) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8963(interfaceC0705) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8977(interfaceC5731) ? 256 : 128;
        }
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(c5362.f17657);
            C3102 c3102M1926 = AbstractC0949.m1926(c5362);
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705);
            C2103 c2103M8994 = c5362.m8994();
            C3709 c3709 = C3709.f12367;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(c4319.f14280, c5362, c4319);
            AbstractC0993.m2127(c4319.f14284, c5362, c3102M1926);
            AbstractC0993.m2127(c4319.f14281, c5362, interfaceC5731);
            InterfaceC4576.f15106.getClass();
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            AbstractC0993.m2146(c5362, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
            c5362.m9009(true);
            if (c5362.m8953()) {
                c5362.m8957(-1259187287);
                c5362.m9009(false);
            } else {
                c5362.m8957(-1259245908);
                boolean zM8977 = c5362.m8977(c4319);
                Object objM8999 = c5362.m8999();
                if (zM8977 || objM8999 == C2850.f9517) {
                    objM8999 = new C5285(22, c4319);
                    c5362.m8987(objM8999);
                }
                AbstractC3925.m7040((InterfaceC4448) objM8999, c5362);
                c5362.m9009(false);
            }
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4245(c4319, interfaceC0705, interfaceC5731, i, 1);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static C5858 m415() throws InterruptedException {
        C5858 c5858 = C5858.f19345.f19350;
        if (c5858 == null) {
            long jNanoTime = System.nanoTime();
            C5858.f19347.await(C5858.f19346, TimeUnit.MILLISECONDS);
            if (C5858.f19345.f19350 != null || System.nanoTime() - jNanoTime < C5858.f19348) {
                return null;
            }
            return C5858.f19345;
        }
        long jNanoTime2 = c5858.f19351 - System.nanoTime();
        if (jNanoTime2 > 0) {
            C5858.f19347.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C5858.f19345.f19350 = c5858.f19350;
        c5858.f19350 = null;
        c5858.f19349 = 2;
        return c5858;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final long m416(long j, EnumC3021 enumC3021) {
        long j2;
        int iOrdinal = enumC3021.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                C5028.m8449(enumC3021, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static C5221 m417(String str, String str2) {
        C4550 c4550 = new C4550(str, str2);
        C4380 c4380M8847 = C5221.m8847(C4550.class);
        c4380M8847.f14437 = 1;
        c4380M8847.f14438 = new C1639(0, c4550);
        return c4380M8847.m7682();
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static final boolean m418(C0461 c0461, int i, int i2) {
        if (i > i2 && c0461.f1668) {
            return false;
        }
        Set set = c0461.f1669;
        if (c0461.f1672) {
            return set == null || !set.contains(Integer.valueOf(i));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static void m419(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f690) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f689 = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f688 = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f689 = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f688 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f689;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f688;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f690 = true;
        }
        if (z) {
            try {
                Method method4 = f689;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f688) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static ColorStateList m420(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!m408(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = AbstractC3905.f13035;
        try {
            return AbstractC3905.m6977(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static C5221 m421(String str, C5028 c5028) {
        C4380 c4380M8847 = C5221.m8847(C4550.class);
        c4380M8847.f14437 = 1;
        c4380M8847.m7683(C0332.m763(Context.class));
        c4380M8847.f14438 = new C5017(1, str, c5028);
        return c4380M8847.m7682();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m422(InterfaceC0705 interfaceC0705, InterfaceC5731 interfaceC5731, C5362 c5362, int i) {
        c5362.m8979(1090521195);
        int i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i | (c5362.m8977(interfaceC5731) ? 32 : 16);
        int i3 = 0;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = C2480.f8265;
                c5362.m8987(objM8999);
            }
            InterfaceC3228 interfaceC3228 = (InterfaceC3228) objM8999;
            int iHashCode = Long.hashCode(c5362.f17657);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            int i4 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
            AbstractC0993.m2146(c5362, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            interfaceC5731.mo219(c5362, Integer.valueOf((i4 >> 6) & 14));
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3483(interfaceC0705, interfaceC5731, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final void m423() {
        try {
            C0909 c0909 = f686;
            if (c0909 == null) {
                C0377 c0377M823 = C0377.m823();
                c0377M823.m825();
                c0909 = (C0909) ((C1830) ((InterfaceC1290) c0377M823.f1411.mo5371(InterfaceC1290.class))).f6080.get();
                f686 = c0909;
            }
            if (c0909.f3269) {
                c0909.m1892();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final Set m424(InterfaceC0103 interfaceC0103) {
        if (interfaceC0103 instanceof InterfaceC3717) {
            return ((InterfaceC3717) interfaceC0103).mo2326();
        }
        HashSet hashSet = new HashSet(interfaceC0103.mo189());
        int iMo189 = interfaceC0103.mo189();
        for (int i = 0; i < iMo189; i++) {
            hashSet.add(interfaceC0103.mo184(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m425(InterfaceC4448 interfaceC4448, C4231 c4231, C0857 c0857, C5362 c5362, int i, int i2) {
        int i3;
        C4231 c4232;
        int i4;
        C4231 c4233;
        c5362.m8979(826668973);
        if ((i & 6) == 0) {
            i3 = i | (c5362.m8977(interfaceC4448) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
            c4232 = c4231;
        } else {
            c4232 = c4231;
            i4 = i3 | (c5362.m8963(c4232) ? 32 : 16);
        }
        int i6 = i4;
        int i7 = 1;
        int i8 = 0;
        if (c5362.m9011(i6 & 1, (i6 & 147) != 146)) {
            C4231 c4234 = i5 != 0 ? new C4231() : c4232;
            View view = (View) c5362.m8997(AbstractC4354.f14354);
            InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
            EnumC2459 enumC2459 = (EnumC2459) c5362.m8997(AbstractC2853.f9555);
            C3102 c3102M1926 = AbstractC0949.m1926(c5362);
            InterfaceC4367 interfaceC4367M5175 = AbstractC2774.m5175(c0857, c5362);
            Object[] objArr = new Object[0];
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            Object obj2 = objM8999;
            if (objM8999 == obj) {
                Object obj3 = C3218.f10800;
                c5362.m8987(obj3);
                obj2 = obj3;
            }
            UUID uuid = (UUID) AbstractC5378.m9032(objArr, (InterfaceC4448) obj2, c5362);
            c4234.getClass();
            boolean zM8988 = c5362.m8988(2) | c5362.m8963(view) | c5362.m8963(interfaceC2880) | c5362.m8963(null);
            Object objM89910 = c5362.m8999();
            if (zM8988 || objM89910 == obj) {
                c4233 = c4234;
                DialogC3219 dialogC3219 = new DialogC3219(interfaceC4448, c4233, view, enumC2459, interfaceC2880, uuid);
                C0857 c0858 = new C0857(-1338939603, new C0046(i7, interfaceC4367M5175), true);
                C0617 c0617 = dialogC3219.f10808;
                c0617.setParentCompositionContext(c3102M1926);
                c0617.f2305.setValue(c0858);
                c0617.f2304 = true;
                c0617.m5671();
                c5362.m8987(dialogC3219);
                objM89910 = dialogC3219;
            } else {
                c4233 = c4234;
            }
            DialogC3219 dialogC32110 = (DialogC3219) objM89910;
            boolean zM8977 = c5362.m8977(dialogC32110);
            Object objM89911 = c5362.m8999();
            Object obj4 = objM89911;
            if (zM8977 || objM89911 == obj) {
                Object c3587 = new C3587(dialogC32110, i8);
                c5362.m8987(c3587);
                obj4 = c3587;
            }
            AbstractC3925.m7028(dialogC32110, (InterfaceC4745) obj4, c5362);
            int i9 = (c5362.m8977(dialogC32110) ? 1 : 0) | ((i6 & 14) == 4 ? 1 : 0) | ((i6 & 112) != 32 ? 0 : 1) | (c5362.m8988(enumC2459.ordinal()) ? 1 : 0);
            Object objM89912 = c5362.m8999();
            Object obj5 = objM89912;
            if (i9 != 0 || objM89912 == obj) {
                Object c3734 = new C3734(dialogC32110, interfaceC4448, c4233, enumC2459);
                c5362.m8987(c3734);
                obj5 = c3734;
            }
            AbstractC3925.m7040((InterfaceC4448) obj5, c5362);
        } else {
            c5362.m8982();
            c4233 = c4232;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3006(interfaceC4448, c4233, c0857, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static final InterfaceC0705 m426(InterfaceC0705 interfaceC0705, InterfaceC4745 interfaceC4745) {
        return interfaceC0705.mo1571(new C2251(null, interfaceC4745));
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static void m427(C5858 c5858, long j, boolean z) {
        long jMo3917;
        C5858 c5859;
        if (C5858.f19345 == null) {
            C5858.f19345 = new C5858();
            C5632 c5632 = new C5632("Okio Watchdog");
            c5632.setDaemon(true);
            c5632.start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z) {
            jMo3917 = Math.min(j, c5858.mo3917() - jNanoTime) + jNanoTime;
            c5858.f19351 = jMo3917;
        } else if (j != 0) {
            jMo3917 = j + jNanoTime;
            c5858.f19351 = jMo3917;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            jMo3917 = c5858.mo3917();
            c5858.f19351 = jMo3917;
        }
        long j2 = jMo3917 - jNanoTime;
        C5858 c58510 = C5858.f19345;
        while (true) {
            c5859 = c58510.f19350;
            if (c5859 == null || j2 < c5859.f19351 - jNanoTime) {
                break;
            } else {
                c58510 = c5859;
            }
        }
        c5858.f19350 = c5859;
        c58510.f19350 = c5858;
        if (c58510 == C5858.f19345) {
            C5858.f19347.signal();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m428(InterfaceC0705 interfaceC0705, InterfaceC5731 interfaceC5731, C5362 c5362, int i) {
        c5362.m8979(-1298353104);
        int i2 = i | 6 | (c5362.m8977(interfaceC5731) ? 32 : 16);
        int i3 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = new C4319(C1298.f4440);
                c5362.m8987(objM8999);
            }
            C4217 c4217 = C4217.f13994;
            m414((C4319) objM8999, c4217, interfaceC5731, c5362, (i2 << 3) & 1008);
            interfaceC0705 = c4217;
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3483(interfaceC0705, interfaceC5731, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final InterfaceC0705 m429(InterfaceC4745 interfaceC4745) {
        return new C2251(interfaceC4745, null);
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final Object m430(Object obj) {
        return obj instanceof C5036 ? new C4535(((C5036) obj).f16702) : obj;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static TypedArray m431(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static InterfaceC0705 m432(InterfaceC0705 interfaceC0705, boolean z, String str, InterfaceC4448 interfaceC4448, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return interfaceC0705.mo1571(new C1680(null, null, true, z2, str, null, interfaceC4448));
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final InterfaceC4367 m433(C2243 c2243, C5362 c5362, int i) {
        Object objM8999 = c5362.m8999();
        C4036 c4036 = C2850.f9517;
        if (objM8999 == c4036) {
            objM8999 = AbstractC2774.m5183(Boolean.FALSE);
            c5362.m8987(objM8999);
        }
        InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
        boolean z = (((i & 14) ^ 6) > 4 && c5362.m8963(c2243)) || (i & 6) == 4;
        Object objM89910 = c5362.m8999();
        if (z || objM89910 == c4036) {
            objM89910 = new C0023(c2243, interfaceC4367, null, 26);
            c5362.m8987(objM89910);
        }
        AbstractC3925.m7030((InterfaceC5731) objM89910, c5362, c2243);
        return interfaceC4367;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static /* synthetic */ InterfaceC0705 m434(InterfaceC0705 interfaceC0705, C2243 c2243, C0599 c0599, boolean z, C2155 c2155, InterfaceC4448 interfaceC4448, int i) {
        if ((i & 16) != 0) {
            c2155 = null;
        }
        return m438(interfaceC0705, c2243, c0599, z, c2155, interfaceC4448);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static int m435(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final void m436(C1527 c1527, InterfaceC5308 interfaceC5308, String str) {
        interfaceC5308.mo6288().getClass();
        AbstractC3831.m6869(c1527.f5173, str);
        throw null;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static final boolean m437(KeyEvent keyEvent) {
        long jM3030 = AbstractC1434.m3030(keyEvent);
        int i = AbstractC0708.f2610;
        return AbstractC0708.m1574(jM3030, AbstractC0708.f2587) || AbstractC0708.m1574(jM3030, AbstractC0708.f2580) || AbstractC0708.m1574(jM3030, AbstractC0708.f2581) || AbstractC0708.m1574(jM3030, AbstractC0708.f2579);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final InterfaceC0705 m438(InterfaceC0705 interfaceC0705, C2243 c2243, InterfaceC3016 interfaceC3016, boolean z, C2155 c2155, InterfaceC4448 interfaceC4448) {
        InterfaceC0705 interfaceC0705Mo1571;
        if (interfaceC3016 != null) {
            interfaceC0705Mo1571 = new C1680(c2243, interfaceC3016, false, z, null, c2155, interfaceC4448);
        } else if (interfaceC3016 == null) {
            interfaceC0705Mo1571 = new C1680(c2243, null, false, z, null, c2155, interfaceC4448);
        } else {
            C4217 c4217 = C4217.f13994;
            interfaceC0705Mo1571 = c2243 != null ? AbstractC5022.m8437(c4217, c2243, interfaceC3016).mo1571(new C1680(c2243, null, false, z, null, c2155, interfaceC4448)) : AbstractC0993.m2152(c4217, new C1726(interfaceC3016, z, c2155, interfaceC4448));
        }
        return interfaceC0705.mo1571(interfaceC0705Mo1571);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static InterfaceC0705 m439(InterfaceC4448 interfaceC4448) {
        return new C2373(new C0558(0, interfaceC4448));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m440(long j, C1270 c1270, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            C1078.m2272("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((C1007) arrayList4.get(i8)).mo2205() < i7) {
                C1078.m2272("Failed requirement.");
                return;
            }
        }
        C1007 c1007 = (C1007) arrayList.get(i2);
        C1007 c1008 = (C1007) arrayList4.get(i3 - 1);
        if (i7 == c1007.mo2205()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            C1007 c1009 = (C1007) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            c1007 = c1009;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (c1007.mo2213(i7) == c1008.mo2213(i7)) {
            int iMin = Math.min(c1007.mo2205(), c1008.mo2205());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && c1007.mo2213(i11) == c1008.mo2213(i11); i11++) {
                i10++;
            }
            long j3 = (c1270.f4340 / 4) + j + 2 + ((long) i10) + 1;
            c1270.m2664(-i10);
            c1270.m2664(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                c1270.m2664(c1007.mo2213(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((C1007) arrayList4.get(i4)).mo2205()) {
                    c1270.m2664(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    C1078.m2276("Check failed.");
                    return;
                }
            }
            C1270 c1271 = new C1270();
            c1270.m2664(((int) ((c1271.f4340 / 4) + j3)) * (-1));
            m440(j3, c1271, i12, arrayList4, i4, i3, arrayList5);
            c1270.m2701(c1271);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((C1007) arrayList4.get(i14 - 1)).mo2213(i7) != ((C1007) arrayList4.get(i14)).mo2213(i7)) {
                i13++;
            }
        }
        long j4 = (c1270.f4340 / 4) + j + 2 + ((long) (i13 * 2));
        c1270.m2664(i13);
        c1270.m2664(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iMo2213 = ((C1007) arrayList4.get(i15)).mo2213(i7);
            if (i15 == i4 || iMo2213 != ((C1007) arrayList4.get(i15 - 1)).mo2213(i7)) {
                c1270.m2664(iMo2213 & 255);
            }
        }
        C1270 c1272 = new C1270();
        int i16 = i4;
        while (i16 < i3) {
            byte bMo2213 = ((C1007) arrayList4.get(i16)).mo2213(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bMo2213 != ((C1007) arrayList4.get(i18)).mo2213(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((C1007) arrayList4.get(i16)).mo2205()) {
                c1270.m2664(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                c1270.m2664(((int) ((c1272.f4340 / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                m440(j2, c1272, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        c1270.m2701(c1272);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final C1197 m441(InterfaceC3975 interfaceC3975) {
        C1727 c1727;
        C5091 c5091 = new C5091();
        AbstractC5378.m9053(interfaceC3975, C5100.f16934, new C4884(new C4884(18, c5091), new C0037(1, c5091, C5091.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 23)));
        C2730 c2730 = new C2730();
        C2730 c2731 = c5091.f16885;
        Object[] objArr = c2731.f9041;
        int i = c2731.f9040;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        AbstractC2395 abstractC2395 = null;
        while (true) {
            c1727 = C1727.f5753;
            if (i3 >= i) {
                break;
            }
            AbstractC2395 abstractC2396 = (AbstractC2395) objArr[i3];
            if (!z || abstractC2396 != c1727) {
                if (abstractC2396 == c1727 && abstractC2395 == c1727) {
                    z = false;
                } else {
                    if (abstractC2396 != c1727) {
                        C2730 c2732 = c5091.f16884;
                        Object[] objArr2 = c2732.f9041;
                        int i4 = c2732.f9040;
                        int i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                if (((Boolean) ((InterfaceC4745) objArr2[i5]).mo211(abstractC2396)).booleanValue()) {
                                    i5++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    c2730.m5079(abstractC2396);
                    z = false;
                    abstractC2395 = abstractC2396;
                }
            }
            i3++;
        }
        if (((AbstractC2395) (c2730.m5078() ? null : c2730.f9041[c2730.f9040 - 1])) == c1727) {
            c2730.m5085(c2730.f9040 - 1);
        }
        C3482 c3482 = c2730.f9039;
        if (c3482 == null) {
            c3482 = new C3482(i2, c2730);
            c2730.f9039 = c3482;
        }
        return new C1197(c3482);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final void m442(C1527 c1527, C3782 c3782, Object obj) {
        C4036 c4036 = AbstractC2164.f7138;
        C3131 c3131 = c1527.f5173;
        c3131.m5774(obj);
        C3131 c3131M8557 = AbstractC5041.m8557(obj.getClass());
        String strM5775 = c3131M8557.m5775();
        if (strM5775 == null) {
            strM5775 = String.valueOf(c3131M8557);
        }
        AbstractC3831.m6869(c3131, strM5775);
        throw null;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static InterfaceC2150 m443(Object obj) {
        if (obj == null) {
            return InterfaceC2150.f7054;
        }
        if (obj instanceof String) {
            return new C2485((String) obj);
        }
        if (obj instanceof Double) {
            return new C5563((Double) obj);
        }
        if (obj instanceof Long) {
            return new C5563(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C5563(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C0726((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                C1078.m2272("Invalid value type");
                return null;
            }
            C1173 c1173 = new C1173();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1173.m2494(c1173.m2495(), m443(it.next()));
            }
            return c1173;
        }
        C5162 c5162 = new C5162();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC2150 interfaceC2150M443 = m443(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c5162.mo2283((String) string, interfaceC2150M443);
            }
        }
        return c5162;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final InterfaceC0103[] m444(List list) {
        InterfaceC0103[] interfaceC0103Arr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC0103Arr = (InterfaceC0103[]) list.toArray(new InterfaceC0103[0])) == null) ? f682 : interfaceC0103Arr;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static InterfaceC2150 m445(C1854 c1854) {
        if (c1854 == null) {
            return InterfaceC2150.f7060;
        }
        int iM3668 = c1854.m3668() - 1;
        if (iM3668 == 1) {
            return c1854.m3671() ? new C2485(c1854.m3675()) : InterfaceC2150.f7061;
        }
        if (iM3668 == 2) {
            return c1854.m3674() ? new C5563(Double.valueOf(c1854.m3672())) : new C5563(null);
        }
        if (iM3668 == 3) {
            return c1854.m3676() ? new C0726(Boolean.valueOf(c1854.m3673())) : new C0726(null);
        }
        if (iM3668 != 4) {
            C1078.m2272("Unknown type found. Cannot convert entity");
            return null;
        }
        List listM3670 = c1854.m3670();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM3670.iterator();
        while (it.hasNext()) {
            arrayList.add(m445((C1854) it.next()));
        }
        return new C4837(c1854.m3669(), arrayList);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static InterfaceC0705 m446(InterfaceC0705 interfaceC0705, C2243 c2243, InterfaceC4448 interfaceC4448) {
        return interfaceC0705.mo1571(new C4246(interfaceC4448, c2243));
    }

    /* JADX INFO: renamed from: ۦُ */
    public abstract void mo447(boolean z);

    /* JADX INFO: renamed from: ۦٖ */
    public abstract void mo448(boolean z);
}
