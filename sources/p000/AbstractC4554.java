package p000;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Path;
import android.icu.text.DecimalFormatSymbols;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.ActionMode;
import android.widget.TextView;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;

/* JADX INFO: renamed from: ۦٚؔٚٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4554 {

    /* JADX INFO: renamed from: ۦٌ */
    public static boolean f15046 = true;

    /* JADX INFO: renamed from: ۦِ */
    public static C1117 f15047;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3893 f15043 = new C3893(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0994 f15041 = new C0994(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3855 f15038 = new C3855(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C1453 f15044 = new C1453(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: ۥُ */
    public static final C3893 f15039 = new C3893(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: ۥّ */
    public static final C0994 f15040 = new C0994(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: ۦۙ */
    public static final C3855 f15050 = new C3855(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: ۥۜ */
    public static final C1453 f15042 = new C1453(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: ۦٛ */
    public static final C0857 f15048 = new C0857(-1670955818, new C0064(29), false);

    /* JADX INFO: renamed from: ۦۗ */
    public static final C5536 f15049 = new C5536(2, "NO_OWNER");

    /* JADX INFO: renamed from: ۦؚ */
    public static final Type[] f15045 = new Type[0];

    /* JADX INFO: renamed from: ۥؓ */
    public static C1844 m7881(C3755 c3755) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C1844(AbstractC2611.m4942(c3755));
        }
        TextPaint textPaint = new TextPaint(c3755.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c3755.getBreakStrategy();
        int hyphenationFrequency = c3755.getHyphenationFrequency();
        if (c3755.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c3755.getInputType() & 15) != 3) {
            boolean z = c3755.getLayoutDirection() == 1;
            switch (c3755.getTextDirection()) {
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC2611.m4924(DecimalFormatSymbols.getInstance(c3755.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C1844(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static IllegalArgumentException m7882(Method method, Exception exc, int i, String str, Object... objArr) {
        return m7923(method, exc, str + " (" + AbstractC4057.f13517.mo8219(method, i) + ")", objArr);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static Type m7883(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m7898(type, cls, m7900(type, cls, Map.class));
        }
        C0178.m393();
        return null;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C1634 m7884() {
        return new C1634(1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static int m7885(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static int m7886(char c, int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥً */
    public static final InterfaceC0705 m7887(InterfaceC0705 interfaceC0705, InterfaceC4745 interfaceC4745) {
        return interfaceC0705.mo1571(new C1167(interfaceC4745));
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final void m7888(C1412 c1412, C2715 c2715) {
        ArrayList arrayList = c2715.f9001;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1090 abstractC1090 = (AbstractC1090) arrayList.get(i);
            if (abstractC1090 instanceof C2005) {
                C2182 c2182 = new C2182();
                C2005 c2005 = (C2005) abstractC1090;
                c2182.f7221 = c2005.f6617;
                c2182.f7229 = true;
                c2182.m8896();
                c2182.f7213.f3328.setFillType(c2005.f6608 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                c2182.m8896();
                c2182.m8896();
                c2182.f7219 = c2005.f6609;
                c2182.m8896();
                c2182.f7212 = c2005.f6607;
                c2182.m8896();
                c2182.f7228 = c2005.f6610;
                c2182.m8896();
                c2182.f7214 = c2005.f6615;
                c2182.m8896();
                c2182.f7215 = c2005.f6616;
                c2182.f7231 = true;
                c2182.m8896();
                c2182.f7220 = c2005.f6612;
                c2182.f7231 = true;
                c2182.m8896();
                c2182.f7226 = c2005.f6614;
                c2182.f7231 = true;
                c2182.m8896();
                c2182.f7224 = c2005.f6611;
                c2182.f7231 = true;
                c2182.m8896();
                c2182.f7227 = c2005.f6606;
                c2182.f7230 = true;
                c2182.m8896();
                c2182.f7222 = c2005.f6605;
                c2182.f7230 = true;
                c2182.m8896();
                c2182.f7223 = c2005.f6613;
                c2182.f7230 = true;
                c2182.m8896();
                c1412.m2979(i, c2182);
            } else if (abstractC1090 instanceof C2715) {
                C1412 c1413 = new C1412();
                C2715 c2716 = (C2715) abstractC1090;
                c1413.f4862 = c2716.f9005;
                c1413.m8896();
                c1413.f4858 = c2716.f9004;
                c1413.f4850 = true;
                c1413.m8896();
                c1413.f4866 = c2716.f8996;
                c1413.f4850 = true;
                c1413.m8896();
                c1413.f4865 = c2716.f8999;
                c1413.f4850 = true;
                c1413.m8896();
                c1413.f4853 = c2716.f9002;
                c1413.f4850 = true;
                c1413.m8896();
                c1413.f4854 = c2716.f9003;
                c1413.f4850 = true;
                c1413.m8896();
                c1413.f4859 = c2716.f8997;
                c1413.f4850 = true;
                c1413.m8896();
                c1413.f4864 = c2716.f8998;
                c1413.f4850 = true;
                c1413.m8896();
                c1413.f4852 = c2716.f9000;
                c1413.f4863 = true;
                c1413.m8896();
                m7888(c1413, c2716);
                c1412.m2979(i, c1413);
            }
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m7889(int i, C5362 c5362) {
        c5362.m8979(-1159323327);
        new C4441(new long[]{-2812370178541315925L, -734183845132080418L, 6422792715661864026L, 2679525421107707308L, -2330856707591991556L, 8698518965176436764L, -5808927931772224545L, 5167776368677384976L, 1403359749108085421L, -4184382238058419656L, -3779694471537387372L, 8791975845037152507L, -1163443778115085999L}).toString();
        if (c5362.m9011(i & 1, i != 0)) {
            String str = null;
            AbstractC2765.m5138(null, c5362, 0);
            C4216 c4216 = AbstractC2264.f7521;
            Object[] objArr = new Object[0];
            C2346 c2346 = C5765.f19004;
            boolean zM8956 = c5362.m8956(-3.4028235E38f) | c5362.m8956(0.0f) | c5362.m8956(0.0f);
            Object objM8999 = c5362.m8999();
            int i2 = 10;
            Object obj = C2850.f9517;
            if (zM8956 || objM8999 == obj) {
                objM8999 = new C0062(i2);
                c5362.m8987(objM8999);
            }
            C5765 c5765 = (C5765) AbstractC5378.m9036(objArr, c2346, (InterfaceC4448) objM8999, c5362, 0);
            Object objM89910 = c5362.m8999();
            if (objM89910 == obj) {
                objM89910 = new C0062(25);
                c5362.m8987(objM89910);
            }
            InterfaceC4448 interfaceC4448 = (InterfaceC4448) objM89910;
            C0969 c0969M4817 = AbstractC2552.m4817(4, c5362);
            C5468 c5468M6228 = AbstractC3451.m6228(c5362);
            boolean zM8963 = c5362.m8963(c5765) | c5362.m8963(interfaceC4448) | c5362.m8963(c0969M4817) | c5362.m8963(c5468M6228);
            Object objM89911 = c5362.m8999();
            if (zM8963 || objM89911 == obj) {
                objM89911 = new C5277(c5765, c0969M4817, c5468M6228, interfaceC4448);
                c5362.m8987(objM89911);
            }
            C5277 c5277 = (C5277) objM89911;
            SideActivity sideActivity = SideActivity.f416;
            String str2 = AbstractC4489.m7812().f418;
            if (str2 != null) {
                str = str2;
            } else {
                new C4441(new long[]{4261950385277770897L, -1925274571051165917L}).toString();
            }
            AbstractC3831.m6857(null, AbstractC3925.m7034(1681942789, new C4076(AbstractC3831.m6874(str, C4548.f15024.f18563) ? R.string.menu_settings : R.string.menu_about, c5277), c5362), null, null, null, 0, 0L, 0L, null, AbstractC3925.m7034(341305360, new C3032(i2, c5277), c5362), c5362, 805306416, 509);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5338(i, 9);
        }
    }

    /* JADX INFO: renamed from: ۥِ */
    public static final String m7890(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: ۥّ */
    public static C2084 m7891() {
        return new C2084(null);
    }

    /* JADX INFO: renamed from: ۥْ */
    public static C3411 m7892(C3411 c3411, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) c3411.f11359.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C3893) c3411.f11356).f13013;
        }
        return new C3411(c3411.f11360, Float.valueOf(f), new C3893(f2), c3411.f11357, c3411.f11355, c3411.f11358);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static Handler m7893(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC2611.m4928(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C5028.m8450(cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static InterfaceC0705 m7894(InterfaceC0705 interfaceC0705, float f, InterfaceC2864 interfaceC2864, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        long j = AbstractC5477.f18071;
        InterfaceC2864 interfaceC2865 = (i & 2048) != 0 ? AbstractC2552.f8518 : interfaceC2864;
        long j2 = AbstractC1938.f6398;
        return interfaceC0705.mo1571(new C4793(1.0f, 1.0f, f2, 0.0f, j, interfaceC2865, true, j2, j2));
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static C1106 m7895(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            C1106 c1106 = new C1106();
            new LinkedHashMap();
            c1106.f3892 = new C1414(C0204.f751);
            return c1106;
        }
        bundle.setClassLoader(C1106.class.getClassLoader());
        C3598 c3598 = new C3598(bundle.size());
        for (String str : bundle.keySet()) {
            c3598.put(str, bundle.get(str));
        }
        C3598 c3598M6407 = c3598.m6407();
        C1106 c1107 = new C1106();
        new LinkedHashMap();
        c1107.f3892 = new C1414(c3598M6407);
        return c1107;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static final C2161 m7896(C3963 c3963, C5362 c5362) {
        InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
        boolean zM8961 = c5362.m8961((((long) Float.floatToRawIntBits(interfaceC2880.mo746())) & 4294967295L) | (((long) Float.floatToRawIntBits(c3963.f13256)) << 32));
        Object objM8999 = c5362.m8999();
        if (zM8961 || objM8999 == C2850.f9517) {
            C1412 c1412 = new C1412();
            m7888(c1412, c3963.f13251);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(interfaceC2880.mo741(c3963.f13252))) << 32) | (((long) Float.floatToRawIntBits(interfaceC2880.mo741(c3963.f13249))) & 4294967295L);
            float fIntBitsToFloat = c3963.f13255;
            float fIntBitsToFloat2 = c3963.f13250;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            C2161 c2161 = new C2161(c1412);
            String str = c3963.f13254;
            long j = c3963.f13258;
            C1516 c1516 = j != 16 ? new C1516(j, c3963.f13253) : null;
            boolean z = c3963.f13257;
            c2161.f7128.setValue(new C3291(jFloatToRawIntBits));
            c2161.f7129.setValue(Boolean.valueOf(z));
            C3532 c3532 = c2161.f7133;
            c3532.f11715.setValue(c1516);
            c3532.f11713.setValue(new C3291(jFloatToRawIntBits2));
            c3532.f11704 = str;
            c5362.m8987(c2161);
            objM8999 = c2161;
        }
        return (C2161) objM8999;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static Class m7897(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            C0178.m393();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m7897(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m7897(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        C2316.m4363(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX INFO: renamed from: ۥٛ */
    public static Type m7898(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeM7898;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeM7899 = m7898(type, cls, componentType);
                        return componentType == typeM7899 ? cls2 : new C2241(typeM7899);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeM78910 = m7898(type, cls, genericComponentType);
                    return genericComponentType == typeM78910 ? genericArrayType : new C2241(typeM78910);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeM78911 = m7898(type, cls, ownerType);
                    boolean z = typeM78911 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeM78912 = m7898(type, cls, actualTypeArguments[i]);
                        if (typeM78912 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeM78912;
                        }
                        i++;
                    }
                    return z ? new C3549(typeM78911, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM78913 = m7898(type, cls, lowerBounds[0]);
                        if (typeM78913 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new C5804(new Type[]{Object.class}, new Type[]{typeM78913});
                        }
                    } else if (upperBounds.length == 1 && (typeM7898 = m7898(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new C5804(new Type[]{typeM7898}, f15045);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeM7900 = m7900(type, cls, cls3);
                if (typeM7900 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            C0178.m381();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type4 = ((ParameterizedType) typeM7900).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static void m7899(TextView textView, int i) {
        if (i < 0) {
            C0178.m393();
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static Type m7900(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m7900(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m7900(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C3411 m7901(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new C3411(AbstractC3831.f12709, Float.valueOf(f), new C3893(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: ۥۘ */
    public static String m7902(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static boolean m7903(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return m7903(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            C2316.m4359("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (m7903(type2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final Bundle m7904(C3869... c3869Arr) {
        Bundle bundle = new Bundle(c3869Arr.length);
        for (C3869 c3869 : c3869Arr) {
            String str = (String) c3869.f12915;
            Object obj = c3869.f12914;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        C1078.m2280("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\"");
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    C1078.m2280("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\"");
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m7905(TextView textView, int i) {
        if (i < 0) {
            C0178.m393();
            return;
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static final void m7906(String str) {
        MainActivity mainActivity = MainActivity.f411;
        MainActivity mainActivityM9214 = AbstractC5537.m9214();
        Class<SideActivity> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(SideActivity.class));
        Intent intent = new Intent(mainActivityM9214, clsM9037 != null ? clsM9037 : SideActivity.class);
        intent.putExtra(new C4441(new long[]{-459237951724195061L, 5396546003853620411L}).toString(), str);
        AbstractC5537.m9214().startActivity(intent);
    }

    /* JADX INFO: renamed from: ۥۢ */
    public static InterfaceC0705 m7907(InterfaceC0705 interfaceC0705, C3945 c3945) {
        return interfaceC0705.mo1571(AbstractC5537.m9269(C4217.f13994, C0809.f2879)).mo1571(new C4721(null, null, null, c3945.f13177, EnumC1616.f5425, c3945, true, true)).mo1571(new C1902(c3945));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C5825 m7908(float f) {
        return new C5825(Float.valueOf(f), AbstractC3831.f12709, Float.valueOf(0.01f), 8);
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static Object m7909(InterfaceC4448 interfaceC4448, AbstractC0772 abstractC0772) {
        return AbstractC2765.m5144(C4794.f15814, new C5558(interfaceC4448, null, 2), abstractC0772);
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static void m7910(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static int m7911(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static Object m7912(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: ۥۨ */
    public static Map m7913(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C0204.f751;
        }
        if (size == 1) {
            C3869 c3869 = (C3869) arrayList.get(0);
            return Collections.singletonMap(c3869.f12915, c3869.f12914);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m7911(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3869 c38610 = (C3869) it.next();
            linkedHashMap.put(c38610.f12915, c38610.f12914);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۦ */
    public static ActionMode.Callback m7914(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC5077) || callback == null) ? callback : new ActionModeCallbackC5077(callback, textView);
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x016b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0181  */
    /* JADX INFO: renamed from: ۦؑ */
    public static final void m7915(int i, int i2, C2851 c2851, InterfaceC3195 interfaceC3195, C1911 c1911, InterfaceC0738 interfaceC0738, InterfaceC4745 interfaceC4745, C5362 c5362, C0846 c0846, InterfaceC0705 interfaceC0705, InterfaceC1291 interfaceC1291, boolean z) {
        InterfaceC0705 interfaceC0706;
        int i3;
        InterfaceC1291 interfaceC1292;
        int i4;
        int i5;
        C1911 c1912;
        int i6;
        int i7;
        boolean z2;
        C2851 c2852;
        InterfaceC3195 interfaceC3196;
        InterfaceC0738 interfaceC0739;
        InterfaceC0705 interfaceC0707;
        InterfaceC1291 interfaceC1293;
        C1911 c1913;
        C0846 c0847;
        boolean z3;
        C5863 c5863M8965;
        InterfaceC0705 interfaceC0708;
        C0846 c0846M3603;
        InterfaceC1291 c1393;
        C5468 c5468M6228;
        boolean zM8963;
        Object objM8999;
        InterfaceC0705 interfaceC0709;
        C0846 c0848;
        InterfaceC0738 interfaceC07310;
        InterfaceC1291 interfaceC1294;
        InterfaceC3195 interfaceC3197;
        C2851 c2851M8206;
        int i8;
        boolean z4;
        int i9;
        c5362.m8979(53695811);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            interfaceC0706 = interfaceC0705;
        } else if ((i & 6) == 0) {
            interfaceC0706 = interfaceC0705;
            i3 = (c5362.m8963(interfaceC0706) ? 4 : 2) | i;
        } else {
            interfaceC0706 = interfaceC0705;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && c5362.m8963(c0846)) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                interfaceC1292 = interfaceC1291;
                i3 |= c5362.m8963(interfaceC1292) ? 256 : 128;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                i4 = i3 | 11264;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    c1912 = c1911;
                    if (c5362.m8963(c1912)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((1572864 & i) == 0) {
                    i4 |= 524288;
                }
                i7 = 12582912 | i4;
                if ((100663296 & i) == 0) {
                    i7 = 46137344 | i4;
                }
                if ((805306368 & i) == 0) {
                    if (c5362.m8977(interfaceC4745)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i7 |= i9;
                }
                if ((306783379 & i7) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c5362.m9011(i7 & 1, z2)) {
                    c5362.m8971();
                    if ((i & 1) != 0 || c5362.m8969()) {
                        if (i10 != 0) {
                            interfaceC0708 = C4217.f13994;
                        } else {
                            interfaceC0708 = interfaceC0706;
                        }
                        if ((i2 & 2) != 0) {
                            c0846M3603 = AbstractC1833.m3603(c5362);
                            i7 &= -113;
                        } else {
                            c0846M3603 = c0846;
                        }
                        if (i11 != 0) {
                            c1393 = new C1393(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            c1393 = interfaceC1292;
                        }
                        C1064 c1064 = AbstractC4225.f14009;
                        if (i5 != 0) {
                            c1912 = C1298.f4443;
                        }
                        c5468M6228 = AbstractC3451.m6228(c5362);
                        zM8963 = c5362.m8963(c5468M6228);
                        objM8999 = c5362.m8999();
                        if (zM8963 || objM8999 == C2850.f9517) {
                            objM8999 = new C3645(c5468M6228);
                            c5362.m8987(objM8999);
                        }
                        interfaceC0709 = interfaceC0708;
                        c0848 = c0846M3603;
                        interfaceC07310 = (C3645) objM8999;
                        interfaceC1294 = c1393;
                        interfaceC3197 = c1064;
                        c2851M8206 = AbstractC4834.m8206(c5362);
                        i8 = i7 & (-238608385);
                        z4 = true;
                    } else {
                        c5362.m8982();
                        if ((i2 & 2) != 0) {
                            i7 &= -113;
                        }
                        i8 = i7 & (-238608385);
                        c2851M8206 = c2851;
                        interfaceC3197 = interfaceC3195;
                        interfaceC07310 = interfaceC0738;
                        c0848 = c0846;
                        z4 = z;
                        interfaceC0709 = interfaceC0706;
                        interfaceC1294 = interfaceC1292;
                    }
                    C1911 c1914 = c1912;
                    c5362.m8964();
                    AbstractC2774.m5174((i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016) | ((i8 << 12) & 1879048192), (i8 >> 18) & 7168, c2851M8206, interfaceC3197, c1914, interfaceC07310, interfaceC4745, c5362, c0848, interfaceC0709, interfaceC1294, z4);
                    c2852 = c2851M8206;
                    interfaceC3196 = interfaceC3197;
                    c1913 = c1914;
                    interfaceC0739 = interfaceC07310;
                    c0847 = c0848;
                    interfaceC0707 = interfaceC0709;
                    interfaceC1293 = interfaceC1294;
                    z3 = z4;
                } else {
                    c5362.m8982();
                    c2852 = c2851;
                    interfaceC3196 = interfaceC3195;
                    interfaceC0739 = interfaceC0738;
                    interfaceC0707 = interfaceC0706;
                    interfaceC1293 = interfaceC1292;
                    c1913 = c1912;
                    c0847 = c0846;
                    z3 = z;
                }
                c5863M8965 = c5362.m8965();
                if (c5863M8965 != null) {
                    c5863M8965.f19365 = new C1026(interfaceC0707, c0847, interfaceC1293, interfaceC3196, c1913, interfaceC0739, z3, c2852, interfaceC4745, i, i2);
                }
            }
            i4 |= 196608;
            c1912 = c1911;
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i7 = 12582912 | i4;
            if ((100663296 & i) == 0) {
                i7 = 46137344 | i4;
            }
            if ((805306368 & i) == 0) {
                if (c5362.m8977(interfaceC4745)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i7 |= i9;
            }
            if ((306783379 & i7) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c5362.m9011(i7 & 1, z2)) {
                c5362.m8971();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC0708 = C4217.f13994;
                    } else {
                        interfaceC0708 = interfaceC0706;
                    }
                    if ((i2 & 2) != 0) {
                        c0846M3603 = AbstractC1833.m3603(c5362);
                        i7 &= -113;
                    } else {
                        c0846M3603 = c0846;
                    }
                    if (i11 != 0) {
                        c1393 = new C1393(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        c1393 = interfaceC1292;
                    }
                    C1064 c1065 = AbstractC4225.f14009;
                    if (i5 != 0) {
                        c1912 = C1298.f4443;
                    }
                    c5468M6228 = AbstractC3451.m6228(c5362);
                    zM8963 = c5362.m8963(c5468M6228);
                    objM8999 = c5362.m8999();
                    if (zM8963) {
                        objM8999 = new C3645(c5468M6228);
                        c5362.m8987(objM8999);
                    } else {
                        objM8999 = new C3645(c5468M6228);
                        c5362.m8987(objM8999);
                    }
                    interfaceC0709 = interfaceC0708;
                    c0848 = c0846M3603;
                    interfaceC07310 = (C3645) objM8999;
                    interfaceC1294 = c1393;
                    interfaceC3197 = c1065;
                    c2851M8206 = AbstractC4834.m8206(c5362);
                    i8 = i7 & (-238608385);
                    z4 = true;
                } else {
                    if (i10 != 0) {
                        interfaceC0708 = C4217.f13994;
                    } else {
                        interfaceC0708 = interfaceC0706;
                    }
                    if ((i2 & 2) != 0) {
                        c0846M3603 = AbstractC1833.m3603(c5362);
                        i7 &= -113;
                    } else {
                        c0846M3603 = c0846;
                    }
                    if (i11 != 0) {
                        c1393 = new C1393(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        c1393 = interfaceC1292;
                    }
                    C1064 c1066 = AbstractC4225.f14009;
                    if (i5 != 0) {
                        c1912 = C1298.f4443;
                    }
                    c5468M6228 = AbstractC3451.m6228(c5362);
                    zM8963 = c5362.m8963(c5468M6228);
                    objM8999 = c5362.m8999();
                    if (zM8963) {
                        objM8999 = new C3645(c5468M6228);
                        c5362.m8987(objM8999);
                    } else {
                        objM8999 = new C3645(c5468M6228);
                        c5362.m8987(objM8999);
                    }
                    interfaceC0709 = interfaceC0708;
                    c0848 = c0846M3603;
                    interfaceC07310 = (C3645) objM8999;
                    interfaceC1294 = c1393;
                    interfaceC3197 = c1066;
                    c2851M8206 = AbstractC4834.m8206(c5362);
                    i8 = i7 & (-238608385);
                    z4 = true;
                }
                C1911 c1915 = c1912;
                c5362.m8964();
                AbstractC2774.m5174((i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016) | ((i8 << 12) & 1879048192), (i8 >> 18) & 7168, c2851M8206, interfaceC3197, c1915, interfaceC07310, interfaceC4745, c5362, c0848, interfaceC0709, interfaceC1294, z4);
                c2852 = c2851M8206;
                interfaceC3196 = interfaceC3197;
                c1913 = c1915;
                interfaceC0739 = interfaceC07310;
                c0847 = c0848;
                interfaceC0707 = interfaceC0709;
                interfaceC1293 = interfaceC1294;
                z3 = z4;
            } else {
                c5362.m8982();
                c2852 = c2851;
                interfaceC3196 = interfaceC3195;
                interfaceC0739 = interfaceC0738;
                interfaceC0707 = interfaceC0706;
                interfaceC1293 = interfaceC1292;
                c1913 = c1912;
                c0847 = c0846;
                z3 = z;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new C1026(interfaceC0707, c0847, interfaceC1293, interfaceC3196, c1913, interfaceC0739, z3, c2852, interfaceC4745, i, i2);
            }
        }
        i3 |= 384;
        interfaceC1292 = interfaceC1291;
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 = i3 | 11264;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                c1912 = c1911;
                if (c5362.m8963(c1912)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i7 = 12582912 | i4;
            if ((100663296 & i) == 0) {
                i7 = 46137344 | i4;
            }
            if ((805306368 & i) == 0) {
                if (c5362.m8977(interfaceC4745)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i7 |= i9;
            }
            if ((306783379 & i7) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c5362.m9011(i7 & 1, z2)) {
                c5362.m8971();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC0708 = C4217.f13994;
                    } else {
                        interfaceC0708 = interfaceC0706;
                    }
                    if ((i2 & 2) != 0) {
                        c0846M3603 = AbstractC1833.m3603(c5362);
                        i7 &= -113;
                    } else {
                        c0846M3603 = c0846;
                    }
                    if (i11 != 0) {
                        c1393 = new C1393(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        c1393 = interfaceC1292;
                    }
                    C1064 c1067 = AbstractC4225.f14009;
                    if (i5 != 0) {
                        c1912 = C1298.f4443;
                    }
                    c5468M6228 = AbstractC3451.m6228(c5362);
                    zM8963 = c5362.m8963(c5468M6228);
                    objM8999 = c5362.m8999();
                    if (zM8963) {
                        objM8999 = new C3645(c5468M6228);
                        c5362.m8987(objM8999);
                    } else {
                        objM8999 = new C3645(c5468M6228);
                        c5362.m8987(objM8999);
                    }
                    interfaceC0709 = interfaceC0708;
                    c0848 = c0846M3603;
                    interfaceC07310 = (C3645) objM8999;
                    interfaceC1294 = c1393;
                    interfaceC3197 = c1067;
                    c2851M8206 = AbstractC4834.m8206(c5362);
                    i8 = i7 & (-238608385);
                    z4 = true;
                } else {
                    if (i10 != 0) {
                        interfaceC0708 = C4217.f13994;
                    } else {
                        interfaceC0708 = interfaceC0706;
                    }
                    if ((i2 & 2) != 0) {
                        c0846M3603 = AbstractC1833.m3603(c5362);
                        i7 &= -113;
                    } else {
                        c0846M3603 = c0846;
                    }
                    if (i11 != 0) {
                        c1393 = new C1393(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        c1393 = interfaceC1292;
                    }
                    C1064 c1068 = AbstractC4225.f14009;
                    if (i5 != 0) {
                        c1912 = C1298.f4443;
                    }
                    c5468M6228 = AbstractC3451.m6228(c5362);
                    zM8963 = c5362.m8963(c5468M6228);
                    objM8999 = c5362.m8999();
                    if (zM8963) {
                        objM8999 = new C3645(c5468M6228);
                        c5362.m8987(objM8999);
                    } else {
                        objM8999 = new C3645(c5468M6228);
                        c5362.m8987(objM8999);
                    }
                    interfaceC0709 = interfaceC0708;
                    c0848 = c0846M3603;
                    interfaceC07310 = (C3645) objM8999;
                    interfaceC1294 = c1393;
                    interfaceC3197 = c1068;
                    c2851M8206 = AbstractC4834.m8206(c5362);
                    i8 = i7 & (-238608385);
                    z4 = true;
                }
                C1911 c1916 = c1912;
                c5362.m8964();
                AbstractC2774.m5174((i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016) | ((i8 << 12) & 1879048192), (i8 >> 18) & 7168, c2851M8206, interfaceC3197, c1916, interfaceC07310, interfaceC4745, c5362, c0848, interfaceC0709, interfaceC1294, z4);
                c2852 = c2851M8206;
                interfaceC3196 = interfaceC3197;
                c1913 = c1916;
                interfaceC0739 = interfaceC07310;
                c0847 = c0848;
                interfaceC0707 = interfaceC0709;
                interfaceC1293 = interfaceC1294;
                z3 = z4;
            } else {
                c5362.m8982();
                c2852 = c2851;
                interfaceC3196 = interfaceC3195;
                interfaceC0739 = interfaceC0738;
                interfaceC0707 = interfaceC0706;
                interfaceC1293 = interfaceC1292;
                c1913 = c1912;
                c0847 = c0846;
                z3 = z;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new C1026(interfaceC0707, c0847, interfaceC1293, interfaceC3196, c1913, interfaceC0739, z3, c2852, interfaceC4745, i, i2);
            }
        }
        i4 |= 196608;
        c1912 = c1911;
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        i7 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i7 = 46137344 | i4;
        }
        if ((805306368 & i) == 0) {
            if (c5362.m8977(interfaceC4745)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i7 |= i9;
        }
        if ((306783379 & i7) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c5362.m9011(i7 & 1, z2)) {
            c5362.m8971();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    interfaceC0708 = C4217.f13994;
                } else {
                    interfaceC0708 = interfaceC0706;
                }
                if ((i2 & 2) != 0) {
                    c0846M3603 = AbstractC1833.m3603(c5362);
                    i7 &= -113;
                } else {
                    c0846M3603 = c0846;
                }
                if (i11 != 0) {
                    c1393 = new C1393(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    c1393 = interfaceC1292;
                }
                C1064 c1069 = AbstractC4225.f14009;
                if (i5 != 0) {
                    c1912 = C1298.f4443;
                }
                c5468M6228 = AbstractC3451.m6228(c5362);
                zM8963 = c5362.m8963(c5468M6228);
                objM8999 = c5362.m8999();
                if (zM8963) {
                    objM8999 = new C3645(c5468M6228);
                    c5362.m8987(objM8999);
                } else {
                    objM8999 = new C3645(c5468M6228);
                    c5362.m8987(objM8999);
                }
                interfaceC0709 = interfaceC0708;
                c0848 = c0846M3603;
                interfaceC07310 = (C3645) objM8999;
                interfaceC1294 = c1393;
                interfaceC3197 = c1069;
                c2851M8206 = AbstractC4834.m8206(c5362);
                i8 = i7 & (-238608385);
                z4 = true;
            } else {
                if (i10 != 0) {
                    interfaceC0708 = C4217.f13994;
                } else {
                    interfaceC0708 = interfaceC0706;
                }
                if ((i2 & 2) != 0) {
                    c0846M3603 = AbstractC1833.m3603(c5362);
                    i7 &= -113;
                } else {
                    c0846M3603 = c0846;
                }
                if (i11 != 0) {
                    c1393 = new C1393(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    c1393 = interfaceC1292;
                }
                C1064 c10610 = AbstractC4225.f14009;
                if (i5 != 0) {
                    c1912 = C1298.f4443;
                }
                c5468M6228 = AbstractC3451.m6228(c5362);
                zM8963 = c5362.m8963(c5468M6228);
                objM8999 = c5362.m8999();
                if (zM8963) {
                    objM8999 = new C3645(c5468M6228);
                    c5362.m8987(objM8999);
                } else {
                    objM8999 = new C3645(c5468M6228);
                    c5362.m8987(objM8999);
                }
                interfaceC0709 = interfaceC0708;
                c0848 = c0846M3603;
                interfaceC07310 = (C3645) objM8999;
                interfaceC1294 = c1393;
                interfaceC3197 = c10610;
                c2851M8206 = AbstractC4834.m8206(c5362);
                i8 = i7 & (-238608385);
                z4 = true;
            }
            C1911 c1917 = c1912;
            c5362.m8964();
            AbstractC2774.m5174((i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016) | ((i8 << 12) & 1879048192), (i8 >> 18) & 7168, c2851M8206, interfaceC3197, c1917, interfaceC07310, interfaceC4745, c5362, c0848, interfaceC0709, interfaceC1294, z4);
            c2852 = c2851M8206;
            interfaceC3196 = interfaceC3197;
            c1913 = c1917;
            interfaceC0739 = interfaceC07310;
            c0847 = c0848;
            interfaceC0707 = interfaceC0709;
            interfaceC1293 = interfaceC1294;
            z3 = z4;
        } else {
            c5362.m8982();
            c2852 = c2851;
            interfaceC3196 = interfaceC3195;
            interfaceC0739 = interfaceC0738;
            interfaceC0707 = interfaceC0706;
            interfaceC1293 = interfaceC1292;
            c1913 = c1912;
            c0847 = c0846;
            z3 = z;
        }
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1026(interfaceC0707, c0847, interfaceC1293, interfaceC3196, c1913, interfaceC0739, z3, c2852, interfaceC4745, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static void m7916(TextView textView, int i) {
        if (i < 0) {
            C0178.m393();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC2611.m4922(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ۦؔ */
    public static C3046 m7917(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C3046(i, i2 - 1, 1);
        }
        C3046 c3046 = C3046.f10240;
        return C3046.f10240;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static boolean m7918(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static Map m7919(C3869... c3869Arr) {
        if (c3869Arr.length <= 0) {
            return C0204.f751;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m7911(c3869Arr.length));
        m7936(linkedHashMap, c3869Arr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static boolean m7920(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static double m7921(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static float m7922(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* JADX INFO: renamed from: ۦُ */
    public static IllegalArgumentException m7923(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m7924(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            C0178.m393();
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static Type m7925(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM8680 = AbstractC5078.m8680(i, "Index ", " not in range [0,");
        sbM8680.append(actualTypeArguments.length);
        sbM8680.append(") for ");
        sbM8680.append(parameterizedType);
        throw new IllegalArgumentException(sbM8680.toString());
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static IllegalArgumentException m7926(Method method, int i, String str, Object... objArr) {
        return m7923(method, null, str + " (" + AbstractC4057.f13517.mo8219(method, i) + ")", objArr);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static C3783 m7927(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                C1984 c1984M3874 = C1984.m3874();
                String str = C3783.f12571;
                String str2 = C3783.f12571;
                String str3 = "Ignoring adding capability '" + i + '\'';
                if (c1984M3874.f6551 <= 5) {
                    Log.w(str2, str3, e);
                }
            }
        }
        int[] iArr3 = AbstractC3831.f12708;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!AbstractC0246.m520(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    C1984 c1984M3875 = C1984.m3874();
                    String str4 = C3783.f12571;
                    String str5 = C3783.f12571;
                    String str6 = "Ignoring removing default capability '" + i3 + '\'';
                    if (c1984M3875.f6551 <= 5) {
                        Log.w(str5, str6, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        return new C3783(builder.build());
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static InterfaceC0705 m7928(InterfaceC0705 interfaceC0705, float f, float f2, float f3, float f4, InterfaceC2864 interfaceC2864, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = AbstractC5477.f18071;
        InterfaceC2864 interfaceC2865 = (i & 2048) != 0 ? AbstractC2552.f8518 : interfaceC2864;
        long j2 = AbstractC1938.f6398;
        return interfaceC0705.mo1571(new C4793(f5, f6, f7, f8, j, interfaceC2865, false, j2, j2));
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final byte m7929(char c) {
        if (c < '~') {
            return C3199.f10738[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: ۦٝ */
    public static String m7930(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String strConcat = "".concat(str);
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    /* JADX INFO: renamed from: ۦٞ */
    public static int m7931(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final void m7932(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC5537.m9223(th, th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX INFO: renamed from: ۦۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m7933(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC4554.m7933(int, int, int, boolean):int");
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static int m7934(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static boolean m7935(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m7935(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final void m7936(HashMap map, C3869[] c3869Arr) {
        for (C3869 c3869 : c3869Arr) {
            map.put(c3869.f12915, c3869.f12914);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦ۟ */
    public static long[] m7937(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static Map m7938(Map map) {
        int size = map.size();
        if (size == 0) {
            return C0204.f751;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static final C3945 m7939(C5362 c5362) {
        Object[] objArr = new Object[0];
        boolean zM8988 = c5362.m8988(0);
        Object objM8999 = c5362.m8999();
        if (zM8988 || objM8999 == C2850.f9517) {
            objM8999 = new C2971(3);
            c5362.m8987(objM8999);
        }
        return (C3945) AbstractC5378.m9036(objArr, C3945.f13170, (InterfaceC4448) objM8999, c5362, 0);
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static C1803 m7940(C3046 c3046, int i) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = c3046.f6006;
        int i3 = c3046.f6005;
        if (c3046.f6004 <= 0) {
            i = -i;
        }
        return new C1803(i2, i3, i);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static long m7941(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }
}
