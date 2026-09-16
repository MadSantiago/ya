package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۥٓؗۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1298 implements InterfaceC1027, InterfaceC2003, InterfaceC2218, InterfaceC4230, InterfaceC2086, InterfaceC5346, InterfaceC5876, InterfaceC3237, InterfaceC0999, InterfaceC1655, InterfaceC0241, InterfaceC0130, InterfaceC3370, InterfaceC0601 {

    /* JADX INFO: renamed from: ۥۡ */
    public static final C1298 f4439;

    /* JADX INFO: renamed from: ۦۧ */
    public static final C0178 f4459;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4460;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C3039 f4456 = new C3039(-1.0f, -1.0f);

    /* JADX INFO: renamed from: ۥْ */
    public static final C3039 f4428 = new C3039(0.0f, -1.0f);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C3039 f4429 = new C3039(1.0f, -1.0f);

    /* JADX INFO: renamed from: ۥَ */
    public static final C3039 f4427 = new C3039(-1.0f, 0.0f);

    /* JADX INFO: renamed from: ۥٖ */
    public static final C3039 f4431 = new C3039(0.0f, 0.0f);

    /* JADX INFO: renamed from: ۦٗ */
    public static final C3039 f4452 = new C3039(1.0f, 0.0f);

    /* JADX INFO: renamed from: ۦۛ */
    public static final C3039 f4454 = new C3039(-1.0f, 1.0f);

    /* JADX INFO: renamed from: ۥۖ */
    public static final C3039 f4436 = new C3039(0.0f, 1.0f);

    /* JADX INFO: renamed from: ۦٕ */
    public static final C3039 f4450 = new C3039(1.0f, 1.0f);

    /* JADX INFO: renamed from: ۥٙ */
    public static final C4274 f4433 = new C4274(-1.0f);

    /* JADX INFO: renamed from: ۥؖ */
    public static final C4274 f4423 = new C4274(0.0f);

    /* JADX INFO: renamed from: ۥؓ */
    public static final C4274 f4421 = new C4274(1.0f);

    /* JADX INFO: renamed from: ۥۧ */
    public static final C1911 f4443 = new C1911(-1.0f);

    /* JADX INFO: renamed from: ۥً */
    public static final C1911 f4426 = new C1911(0.0f);

    /* JADX INFO: renamed from: ۦٚ */
    public static final C1911 f4453 = new C1911(1.0f);

    /* JADX INFO: renamed from: ۥٕ */
    public static final C1298 f4430 = new C1298(2);

    /* JADX INFO: renamed from: ۥۙ */
    public static final C1298 f4437 = new C1298(3);

    /* JADX INFO: renamed from: ۦؙ */
    public static final C1298 f4448 = new C1298(4);

    /* JADX INFO: renamed from: ۦؖ */
    public static final /* synthetic */ C1298 f4446 = new C1298(6);

    /* JADX INFO: renamed from: ۥۦ */
    public static final C1298 f4442 = new C1298(7);

    /* JADX INFO: renamed from: ۦؗ */
    public static final C1298 f4447 = new C1298(8);

    /* JADX INFO: renamed from: ۦُ */
    public static final C1634 f4449 = new C1634(1.0f, 1.0f);

    /* JADX INFO: renamed from: ۦٖ */
    public static final C1298 f4451 = new C1298(9);

    /* JADX INFO: renamed from: ۥؔ */
    public static final C1298 f4422 = new C1298(10);

    /* JADX INFO: renamed from: ۦۜ */
    public static final C1298 f4455 = new C1298(11);

    /* JADX INFO: renamed from: ۦۣ */
    public static final /* synthetic */ C1298 f4458 = new C1298(12);

    /* JADX INFO: renamed from: ۥ٘ */
    public static final C1298 f4432 = new C1298(13);

    /* JADX INFO: renamed from: ۥٛ */
    public static final /* synthetic */ C1298 f4434 = new C1298(14);

    /* JADX INFO: renamed from: ۥۤ */
    public static final C1298 f4440 = new C1298(15);

    /* JADX INFO: renamed from: ۦؒ */
    public static final C1298 f4445 = new C1298(16);

    /* JADX INFO: renamed from: ۥٝ */
    public static final C1298 f4435 = new C1298(17);

    /* JADX INFO: renamed from: ۥ۟ */
    public static final C1298 f4438 = new C1298(19);

    /* JADX INFO: renamed from: ۥؚ */
    public static final C1298 f4425 = new C1298(20);

    /* JADX INFO: renamed from: ۥؙ */
    public static final C2944 f4424 = new C2944(null, null, null, null, null);

    /* JADX INFO: renamed from: ۥۥ */
    public static final C0178 f4441 = new C0178(22);

    /* JADX INFO: renamed from: ۥۨ */
    public static final C2316 f4444 = new C2316();

    /* JADX INFO: renamed from: ۦ۠ */
    public static final C1298 f4457 = new C1298(24);

    static {
        int i = 21;
        f4439 = new C1298(i);
        f4459 = new C0178(i);
    }

    public /* synthetic */ C1298(int i) {
        this.f4460 = i;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static C3597 m2757(C5362 c5362) {
        C2917 c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
        C3597 c3597 = c2917.f9757;
        if (c3597 != null) {
            return c3597;
        }
        long jM212 = AbstractC0118.m212(c2917, AbstractC1843.f6119);
        long j = C1327.f4592;
        int i = AbstractC1843.f6117;
        long jM213 = AbstractC0118.m212(c2917, i);
        int i2 = AbstractC1843.f6114;
        C3597 c3598 = new C3597(jM212, j, jM213, j, C1327.m2826(AbstractC0118.m212(c2917, i2), 0.38f, 14), j, C1327.m2826(AbstractC0118.m212(c2917, i2), 0.38f, 14), AbstractC0118.m212(c2917, i), AbstractC0118.m212(c2917, AbstractC1843.f6116), C1327.m2826(AbstractC0118.m212(c2917, i2), 0.38f, 14), C1327.m2826(AbstractC0118.m212(c2917, AbstractC1843.f6115), 0.38f, 14), C1327.m2826(AbstractC0118.m212(c2917, i2), 0.38f, 14));
        c2917.f9757 = c3598;
        return c3598;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static String m2758() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(AbstractC3354.f11215.m6149(62)));
        }
        return sb.toString();
    }

    @Override // p000.InterfaceC2086
    public EnumC2459 getLayoutDirection() {
        return EnumC2459.f8215;
    }

    public String toString() {
        switch (this.f4460) {
            case 21:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0241
    /* JADX INFO: renamed from: ۥؗ */
    public boolean mo502(Object obj, Object obj2) {
        return AbstractC3831.m6874(obj, obj2);
    }

    /* JADX INFO: renamed from: ۥَ */
    public List mo2759(Executor executor) {
        return Collections.singletonList(new C1935(executor));
    }

    @Override // p000.InterfaceC0999
    /* JADX INFO: renamed from: ۥُ */
    public Object mo2179() {
        switch (this.f4460) {
            case 17:
                return new C1337(true);
            default:
                return f4424;
        }
    }

    @Override // p000.InterfaceC3237
    /* JADX INFO: renamed from: ۥّ */
    public void mo2760(C3753 c3753) {
        c3753.clear();
    }

    @Override // p000.InterfaceC3370
    /* JADX INFO: renamed from: ۥْ */
    public boolean mo2761(MenuC4903 menuC4903) {
        return false;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public List mo2762() {
        return Collections.EMPTY_LIST;
    }

    @Override // p000.InterfaceC2086
    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC2880 mo2763() {
        return f4449;
    }

    @Override // p000.InterfaceC1655
    /* JADX INFO: renamed from: ۥۜ */
    public long mo2764(C4902 c4902, int i) {
        String str = ((C3828) c4902.f16167).f12697.f8430.f4307;
        return AbstractC2765.m5145(AbstractC0993.m2123(i, str), AbstractC0993.m2125(i, str));
    }

    @Override // p000.InterfaceC2086
    /* JADX INFO: renamed from: ۦؑ */
    public long mo2766() {
        return 9205357640488583168L;
    }

    @Override // p000.InterfaceC0130
    /* JADX INFO: renamed from: ۦؚ */
    public boolean mo285(Class cls) {
        return AbstractC5212.class.isAssignableFrom(cls);
    }

    @Override // p000.InterfaceC5346
    /* JADX INFO: renamed from: ۦٌ */
    public Object mo400(C2813 c2813) {
        switch (this.f4460) {
            case 9:
                return AbstractC4489.m7819((Executor) c2813.mo5376(new C1166(InterfaceC0740.class, Executor.class)));
            default:
                return AbstractC4489.m7819((Executor) c2813.mo5376(new C1166(InterfaceC2900.class, Executor.class)));
        }
    }

    @Override // p000.InterfaceC2003
    /* JADX INFO: renamed from: ۦِ */
    public Object mo804(Object obj) {
        switch (this.f4460) {
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC2978 abstractC2978 = (AbstractC2978) obj;
                try {
                    C1270 c1270 = new C1270();
                    abstractC2978.mo3797().mo2674(c1270);
                    return new C3433(abstractC2978.mo3795(), abstractC2978.mo3796(), c1270, 1);
                } finally {
                    abstractC2978.close();
                }
            default:
                ((AbstractC2978) obj).close();
                return C2358.f7817;
        }
    }

    @Override // p000.InterfaceC1027
    /* JADX INFO: renamed from: ۦٛ */
    public Rect mo805(Activity activity) throws Exception {
        C3012 c3012 = InterfaceC1027.f3628;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutM9291 = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
            } else {
                rect.set((Rect) obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null));
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            c3012.getClass();
            Log.w(C3012.f10148, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (AbstractC5550.m9305(obj2)) {
                    displayCutoutM9291 = AbstractC5550.m9291(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                c3012.getClass();
                Log.w(C3012.f10148, e2);
            }
            if (displayCutoutM9291 != null) {
                if (rect.left == displayCutoutM9291.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutM9291.getSafeInsetRight()) {
                    rect.right = displayCutoutM9291.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutM9291.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutM9291.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutM9291.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    @Override // p000.InterfaceC0999
    /* JADX INFO: renamed from: ۦۗ */
    public void mo2180(Object obj, C0781 c0781) throws IOException {
        AbstractC0318 abstractC0318M402;
        switch (this.f4460) {
            case 17:
                Map mapM2851 = ((C1337) obj).m2851();
                C0344 c0344M8374 = C4989.m8374();
                for (Map.Entry entry : mapM2851.entrySet()) {
                    C3637 c3637 = (C3637) entry.getKey();
                    Object value = entry.getValue();
                    String str = c3637.f12167;
                    if (value instanceof Boolean) {
                        C1579 c1579M7540 = C4261.m7540();
                        boolean zBooleanValue = ((Boolean) value).booleanValue();
                        c1579M7540.m403();
                        ((C4261) c1579M7540.f666).m7549(zBooleanValue);
                        abstractC0318M402 = c1579M7540.m402();
                    } else if (value instanceof Float) {
                        C1579 c1579M7541 = C4261.m7540();
                        float fFloatValue = ((Number) value).floatValue();
                        c1579M7541.m403();
                        ((C4261) c1579M7541.f666).m7542(fFloatValue);
                        abstractC0318M402 = c1579M7541.m402();
                    } else if (value instanceof Double) {
                        C1579 c1579M7542 = C4261.m7540();
                        double dDoubleValue = ((Number) value).doubleValue();
                        c1579M7542.m403();
                        ((C4261) c1579M7542.f666).m7548(dDoubleValue);
                        abstractC0318M402 = c1579M7542.m402();
                    } else if (value instanceof Integer) {
                        C1579 c1579M7543 = C4261.m7540();
                        int iIntValue = ((Number) value).intValue();
                        c1579M7543.m403();
                        ((C4261) c1579M7543.f666).m7541(iIntValue);
                        abstractC0318M402 = c1579M7543.m402();
                    } else if (value instanceof Long) {
                        C1579 c1579M7544 = C4261.m7540();
                        long jLongValue = ((Number) value).longValue();
                        c1579M7544.m403();
                        ((C4261) c1579M7544.f666).m7550(jLongValue);
                        abstractC0318M402 = c1579M7544.m402();
                    } else if (value instanceof String) {
                        C1579 c1579M7545 = C4261.m7540();
                        c1579M7545.m403();
                        ((C4261) c1579M7545.f666).m7543((String) value);
                        abstractC0318M402 = c1579M7545.m402();
                    } else if (value instanceof Set) {
                        C1579 c1579M7546 = C4261.m7540();
                        C3604 c3604M6568 = C3710.m6568();
                        c3604M6568.m403();
                        ((C3710) c3604M6568.f666).m6569((Set) value);
                        c1579M7546.m403();
                        ((C4261) c1579M7546.f666).m7555((C3710) c3604M6568.m402());
                        abstractC0318M402 = c1579M7546.m402();
                    } else if (!(value instanceof byte[])) {
                        C1078.m2276("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    } else {
                        C1579 c1579M7547 = C4261.m7540();
                        byte[] bArr = (byte[]) value;
                        C0533 c0533M1185 = C0533.m1185(bArr, 0, bArr.length);
                        c1579M7547.m403();
                        ((C4261) c1579M7547.f666).m7553(c0533M1185);
                        abstractC0318M402 = c1579M7547.m402();
                    }
                    c0344M8374.getClass();
                    str.getClass();
                    c0344M8374.m403();
                    ((C4989) c0344M8374.f666).m8377().put(str, (C4261) abstractC0318M402);
                    break;
                }
                C4989 c4989 = (C4989) c0344M8374.m402();
                int iMo677 = c4989.mo677(null);
                Logger logger = C2100.f6914;
                if (iMo677 > 4096) {
                    iMo677 = 4096;
                }
                C2100 c2100 = new C2100(c0781, iMo677);
                c4989.mo675(c2100);
                if (c2100.f6920 > 0) {
                    c2100.m4073();
                }
                break;
            default:
                c0781.write(C0971.f3428.m2034(C2944.Companion.serializer(), (C2944) obj).getBytes(AbstractC4637.f15306));
                break;
        }
    }

    @Override // p000.InterfaceC4230
    /* JADX INFO: renamed from: ۦۙ */
    public float mo2767(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // p000.InterfaceC0999
    /* JADX INFO: renamed from: ۦۚ */
    public Object mo2181(FileInputStream fileInputStream) throws C1042 {
        byte[] bArr;
        switch (this.f4460) {
            case 17:
                try {
                    C4989 c4989M8375 = C4989.m8375(fileInputStream);
                    C1337 c1337 = new C1337(false);
                    AbstractC0652[] abstractC0652Arr = (AbstractC0652[]) Arrays.copyOf(new AbstractC0652[0], 0);
                    c1337.m2850();
                    if (abstractC0652Arr.length > 0) {
                        AbstractC0652 abstractC0652 = abstractC0652Arr[0];
                        throw null;
                    }
                    for (Map.Entry entry : c4989M8375.m8376().entrySet()) {
                        String str = (String) entry.getKey();
                        C4261 c4261 = (C4261) entry.getValue();
                        int iM7554 = c4261.m7554();
                        switch (iM7554 == 0 ? -1 : AbstractC1034.f3653[AbstractC3761.m6632(iM7554)]) {
                            case -1:
                                throw new C1042("Value case is null.", null);
                            case 0:
                            default:
                                C1078.m2275();
                                return null;
                            case 1:
                                c1337.m2852(new C3637(str), Boolean.valueOf(c4261.m7551()));
                                break;
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                c1337.m2852(new C3637(str), Float.valueOf(c4261.m7556()));
                                break;
                            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                c1337.m2852(new C3637(str), Double.valueOf(c4261.m7557()));
                                break;
                            case C4261.LONG_FIELD_NUMBER /* 4 */:
                                c1337.m2852(new C3637(str), Integer.valueOf(c4261.m7545()));
                                break;
                            case C4261.STRING_FIELD_NUMBER /* 5 */:
                                c1337.m2852(new C3637(str), Long.valueOf(c4261.m7546()));
                                break;
                            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                c1337.m2852(new C3637(str), c4261.m7544());
                                break;
                            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                                c1337.m2852(new C3637(str), AbstractC0973.m2052(c4261.m7547().m6570()));
                                break;
                            case 8:
                                C3637 c3637 = new C3637(str);
                                C0533 c0533M7552 = c4261.m7552();
                                int size = c0533M7552.size();
                                if (size == 0) {
                                    bArr = AbstractC3576.f11898;
                                } else {
                                    byte[] bArr2 = new byte[size];
                                    c0533M7552.mo1187(size, bArr2);
                                    bArr = bArr2;
                                }
                                c1337.m2852(c3637, bArr);
                                break;
                            case 9:
                                throw new C1042("Value not set.", null);
                        }
                    }
                    return new C1337(new LinkedHashMap(c1337.m2851()), true);
                } catch (C3406 e) {
                    throw new C1042("Unable to parse preferences proto.", e);
                }
            default:
                try {
                    C0971 c0971 = C0971.f3428;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, fileInputStream.available()));
                    AbstractC3831.m6845(fileInputStream, byteArrayOutputStream);
                    String str2 = new String(byteArrayOutputStream.toByteArray(), AbstractC4637.f15306);
                    c0971.getClass();
                    return (C2944) c0971.m2035(C2944.Companion.serializer(), str2);
                } catch (Exception e2) {
                    throw new C1042("Cannot parse session configs", e2);
                }
        }
    }

    @Override // p000.InterfaceC0130
    /* JADX INFO: renamed from: ۦ۟ */
    public C3730 mo286(Class cls) {
        if (!AbstractC5212.class.isAssignableFrom(cls)) {
            C1078.m2272("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (C3730) AbstractC5212.m8819(cls.asSubclass(AbstractC5212.class)).mo554(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // p000.InterfaceC3237
    /* JADX INFO: renamed from: ۦۨ */
    public boolean mo2768(Object obj, Object obj2) {
        return false;
    }

    @Override // p000.InterfaceC3370
    /* JADX INFO: renamed from: ۥۣ */
    public void mo2765(MenuC4903 menuC4903, boolean z) {
    }
}
