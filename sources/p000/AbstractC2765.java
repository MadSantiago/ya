package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥۥٖؗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2765 implements InterfaceC2125, InterfaceC5308, InterfaceC3596 {

    /* JADX INFO: renamed from: ۥؓ */
    public static final C0857 f9154;

    /* JADX INFO: renamed from: ۥؔ */
    public static final C5536 f9155;

    /* JADX INFO: renamed from: ۥؖ */
    public static final C0857 f9156;

    /* JADX INFO: renamed from: ۥً */
    public static final C0857 f9157;

    /* JADX INFO: renamed from: ۥٕ */
    public static final C0857 f9161;

    /* JADX INFO: renamed from: ۥٛ */
    public static C3963 f9165;

    /* JADX INFO: renamed from: ۥۖ */
    public static final C0857 f9166;

    /* JADX INFO: renamed from: ۥۧ */
    public static final C0857 f9169;

    /* JADX INFO: renamed from: ۦؗ */
    public static final C3223 f9171;

    /* JADX INFO: renamed from: ۦُ */
    public static final C4992 f9173;

    /* JADX INFO: renamed from: ۦٖ */
    public static final C4036 f9175;

    /* JADX INFO: renamed from: ۦٚ */
    public static final C0857 f9177;

    /* JADX INFO: renamed from: ۦۛ */
    public static final C0857 f9178;

    /* JADX INFO: renamed from: ۦۨ */
    public static final int[] f9182 = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: ۦ۟ */
    public static final int[] f9180 = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: ۥْ */
    public static final int[] f9159 = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: ۥٓ */
    public static final int[] f9160 = {R.attr.name, R.attr.pathData};

    /* JADX INFO: renamed from: ۥَ */
    public static final C0857 f9158 = new C0857(-1476952267, new C2463(21), false);

    /* JADX INFO: renamed from: ۥٖ */
    public static final C0857 f9162 = new C0857(328888889, new C2654(0), false);

    /* JADX INFO: renamed from: ۦٗ */
    public static final C0857 f9176 = new C0857(1557455169, new C2654(1), false);

    /* JADX INFO: renamed from: ۦٕ */
    public static final C0857 f9174 = new C0857(-1975740559, new C2463(22), false);

    /* JADX INFO: renamed from: ۥٙ */
    public static final C0857 f9164 = new C0857(1951334440, new C2463(23), false);

    /* JADX INFO: renamed from: ۥۙ */
    public static final C0857 f9167 = new C0857(138961337, new C2463(28), false);

    /* JADX INFO: renamed from: ۦؙ */
    public static final C0857 f9172 = new C0857(-2091994128, new C2463(29), false);

    /* JADX INFO: renamed from: ۦؖ */
    public static final int[] f9170 = {R.attr.theme, ru.bluecat.yandexmapspatcher.R.attr.theme};

    /* JADX INFO: renamed from: ۥۦ */
    public static final int[] f9168 = {ru.bluecat.yandexmapspatcher.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: ۦۜ */
    public static final C5338 f9179 = new C5338(15);

    /* JADX INFO: renamed from: ۦۣ */
    public static final C5338 f9181 = new C5338(16);

    /* JADX INFO: renamed from: ۥ٘ */
    public static final C5338 f9163 = new C5338(17);

    static {
        int i = 2;
        f9178 = new C0857(1532817319, new C2654(i), false);
        int i2 = 27;
        f9166 = new C0857(-591077376, new C0064(i2), false);
        int i3 = 24;
        f9156 = new C0857(-187043730, new C2463(i3), false);
        int i4 = 25;
        f9154 = new C0857(-1140380025, new C0064(i4), false);
        int i5 = 26;
        f9169 = new C0857(-2002684186, new C0064(i5), false);
        f9157 = new C0857(230719966, new C2463(i4), false);
        f9177 = new C0857(1420814151, new C2463(i5), false);
        f9161 = new C0857(-1528398938, new C2463(i2), false);
        f9171 = new C3223(i3);
        f9173 = new C4992(i4);
        f9175 = new C4036(i4);
        f9155 = new C5536(i, "NO_THREAD_ELEMENTS");
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static C2926 m5120(C3950 c3950, InterfaceC5731 interfaceC5731) throws Throwable {
        C2926 c2926 = new C2926(AbstractC2774.m5173(c3950, C4794.f15814), true);
        c2926.m3707(1, c2926, interfaceC5731);
        return c2926;
    }

    /* JADX INFO: renamed from: ۥؕ */
    public static final void m5121(InterfaceC3534 interfaceC3534, Object obj) {
        if (obj == f9155) {
            return;
        }
        if (!(obj instanceof C3313)) {
            ((C0464) interfaceC3534.mo875(f9181, null)).m979(obj);
            return;
        }
        C3313 c3313 = (C3313) obj;
        C0464[] c0464Arr = c3313.f11096;
        int length = c0464Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            c0464Arr[length].m979(c3313.f11097[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static final InterfaceC0705 m5122(InterfaceC0705 interfaceC0705, C3985 c3985) {
        return interfaceC0705.mo1571(new C2225(c3985));
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static final void m5123(InterfaceC3983 interfaceC3983) {
        EnumC0458 enumC0458Mo2387 = interfaceC3983.mo110().mo2387();
        if (enumC0458Mo2387 != EnumC0458.f1656 && enumC0458Mo2387 != EnumC0458.f1653) {
            C1078.m2272("Failed requirement.");
        } else if (interfaceC3983.mo648().m4419("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C2869 c2869 = new C2869(interfaceC3983.mo648(), (InterfaceC4680) interfaceC3983);
            interfaceC3983.mo648().m4413("androidx.lifecycle.internal.SavedStateHandlesProvider", c2869);
            interfaceC3983.mo110().mo2388(new C4654(3, c2869));
        }
    }

    /* JADX INFO: renamed from: ۥٌ */
    public static int m5124(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۥٍ */
    public static final long m5125(long j) {
        C4036 c4036 = C5805.f19128;
        boolean z = j > 0;
        if (z) {
            long jM9616 = C5805.m9616(j, AbstractC4009.m7170(999999L, EnumC3021.NANOSECONDS));
            return ((((int) jM9616) & 1) != 1 || C5805.m9615(jM9616)) ? C5805.m9621(jM9616, EnumC3021.MILLISECONDS) : jM9616 >> 1;
        }
        if (!z) {
            return 0L;
        }
        C1078.m2275();
        return 0L;
    }

    /* JADX INFO: renamed from: ۥِ */
    public static final boolean m5126(C0605 c0605) {
        if (c0605.f2271 == null) {
            return false;
        }
        C0605 c0605M1356 = c0605.m1356();
        return (c0605M1356 != null ? c0605M1356.f2271 : null) == null || c0605.f2261.f4241;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[RETURN] */
    /* JADX INFO: renamed from: ۥ٘ */
    public static final int m5127(InterfaceC0252 interfaceC0252, String str) {
        int columnCount = interfaceC0252.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(interfaceC0252.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String strM8669 = AbstractC5078.m8669('`', "`", str);
        int columnCount2 = interfaceC0252.getColumnCount();
        while (i < columnCount2) {
            if (strM8669.equals(interfaceC0252.getColumnName(i))) {
                if (i >= 0) {
                    return i;
                }
                return -1;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥٚ */
    public static final void m5128(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static final float m5129(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static final Object m5130(long j, InterfaceC0443 interfaceC0443) {
        if (j > 0) {
            C2600 c2600 = new C2600(1, AbstractC2776.m5232(interfaceC0443));
            c2600.m4913();
            if (j < Long.MAX_VALUE) {
                m5134(c2600.f8690).mo1553(j, c2600);
            }
            Object objM4909 = c2600.m4909();
            if (objM4909 == EnumC2282.f7590) {
                return objM4909;
            }
        }
        return C2358.f7817;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0366  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:154:0x0408 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x040a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0412  */
    /* JADX WARN: Code duplicated, block: B:163:0x042d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x042f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0437  */
    /* JADX WARN: Code duplicated, block: B:169:0x0447  */
    /* JADX WARN: Code duplicated, block: B:170:0x044a  */
    /* JADX WARN: Code duplicated, block: B:173:0x0450  */
    /* JADX INFO: renamed from: ۥٞ */
    public static final AbstractC0643 m5131(int i, C5362 c5362) {
        TypedValue typedValue;
        long jM7468;
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        int i6;
        C3510 c3510M410;
        int i7;
        Shader shader;
        AbstractC0548 c0547;
        Shader shader2;
        AbstractC0548 c0548;
        AbstractC0548 abstractC0548;
        int i8;
        Context context = (Context) c5362.m8997(AbstractC4354.f14355);
        Resources resources = (Resources) c5362.m8997(AbstractC4354.f14352);
        C4446 c4446 = (C4446) c5362.m8997(AbstractC4354.f14353);
        synchronized (c4446) {
            typedValue = (TypedValue) c4446.f14659.m9571(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                C4912 c4912 = c4446.f14659;
                int iM8318 = c4912.m8318(i);
                Object[] objArr = c4912.f18945;
                Object obj = objArr[iM8318];
                c4912.f18947[iM8318] = i;
                objArr[iM8318] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !AbstractC0684.m1517(charSequence, ".xml")) {
            c5362.m8957(-1771643000);
            boolean zM8963 = c5362.m8963(context.getTheme()) | c5362.m8963(charSequence) | c5362.m8988(i);
            Object objM8999 = c5362.m8999();
            if (zM8963 || objM8999 == C2850.f9517) {
                try {
                    objM8999 = new C1955(((BitmapDrawable) resources.getDrawable(i, null)).getBitmap());
                    c5362.m8987(objM8999);
                } catch (Exception e) {
                    throw new C1228(7, "Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            C5374 c5374 = new C5374((C1955) objM8999);
            c5362.m9009(false);
            return c5374;
        }
        c5362.m8957(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i9 = typedValue.changingConfigurations;
        C4789 c4789 = (C4789) c5362.m8997(AbstractC4354.f14357);
        C3630 c3630 = new C3630(theme, i);
        WeakReference weakReference = (WeakReference) c4789.f15799.get(c3630);
        C4977 c4977 = weakReference != null ? (C4977) weakReference.get() : null;
        if (c4977 == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!AbstractC3831.m6874(xml.getName(), "vector")) {
                C1078.m2272("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            C2824 c2824 = new C2824(xml);
            TypedArray typedArrayM431 = AbstractC0186.m431(resources, theme, attributeSetAsAttributeSet, f9182);
            c2824.m5390(typedArrayM431.getChangingConfigurations());
            boolean z = !AbstractC0186.m408(xml, "autoMirrored") ? false : typedArrayM431.getBoolean(5, false);
            c2824.m5390(typedArrayM431.getChangingConfigurations());
            float fM5391 = c2824.m5391(typedArrayM431, "viewportWidth", 7, 0.0f);
            float fM5392 = c2824.m5391(typedArrayM431, "viewportHeight", 8, 0.0f);
            if (fM5391 <= 0.0f) {
                throw new XmlPullParserException(typedArrayM431.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fM5392 <= 0.0f) {
                throw new XmlPullParserException(typedArrayM431.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            int i10 = 3;
            float dimension = typedArrayM431.getDimension(3, 0.0f);
            c2824.m5390(typedArrayM431.getChangingConfigurations());
            float dimension2 = typedArrayM431.getDimension(2, 0.0f);
            c2824.m5390(typedArrayM431.getChangingConfigurations());
            if (typedArrayM431.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayM431.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jM7468 = C1327.f4591;
                } else {
                    ColorStateList colorStateListM420 = AbstractC0186.m420(typedArrayM431, xml, theme);
                    c2824.m5390(typedArrayM431.getChangingConfigurations());
                    jM7468 = colorStateListM420 != null ? AbstractC4225.m7468(colorStateListM420.getDefaultColor()) : C1327.f4591;
                }
            } else {
                jM7468 = C1327.f4591;
            }
            long j = jM7468;
            int i11 = typedArrayM431.getInt(6, -1);
            c2824.m5390(typedArrayM431.getChangingConfigurations());
            if (i11 == -1) {
                i2 = 5;
            } else if (i11 == 3) {
                i2 = 3;
            } else if (i11 == 5) {
                i2 = 5;
            } else if (i11 != 9) {
                switch (i11) {
                    case 14:
                        i2 = 13;
                        break;
                    case 15:
                        i2 = 14;
                        break;
                    case 16:
                        i2 = 12;
                        break;
                    default:
                        i2 = 5;
                        break;
                }
            } else {
                i2 = 9;
            }
            float f = dimension / resources.getDisplayMetrics().density;
            float f2 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayM431.recycle();
            C2398 c2398 = new C2398(null, f, f2, fM5391, fM5392, j, i2, z, 1);
            int i12 = 0;
            while (xml.getEventType() != 1 && (xml.getDepth() >= 1 || xml.getEventType() != i10)) {
                List listM2241 = C2340.f7777;
                XmlPullParser xmlPullParser = c2824.f9439;
                C1039 c1039 = c2824.f9437;
                XmlResourceParser xmlResourceParser = xml;
                int eventType = xmlPullParser.getEventType();
                int i13 = i9;
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            i3 = i12;
                            if (iHashCode == 3433509) {
                                if (name.equals("path")) {
                                    TypedArray typedArrayM432 = AbstractC0186.m431(resources, theme, attributeSetAsAttributeSet, f9159);
                                    c2824.m5390(typedArrayM432.getChangingConfigurations());
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                        C1078.m2272("No path data available");
                                        return null;
                                    }
                                    String string = typedArrayM432.getString(0);
                                    c2824.m5390(typedArrayM432.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    String string2 = typedArrayM432.getString(2);
                                    c2824.m5390(typedArrayM432.getChangingConfigurations());
                                    if (string2 == null) {
                                        int i14 = AbstractC0184.f672;
                                    } else {
                                        listM2241 = C1039.m2241(c1039, string2);
                                    }
                                    List list = listM2241;
                                    C3510 c3510M411 = AbstractC0186.m410(typedArrayM432, c2824.f9439, theme, "fillColor", 1);
                                    c2824.m5390(typedArrayM432.getChangingConfigurations());
                                    float fM5393 = c2824.m5391(typedArrayM432, "fillAlpha", 12, 1.0f);
                                    int i15 = !AbstractC0186.m408(c2824.f9439, "strokeLineCap") ? -1 : typedArrayM432.getInt(8, -1);
                                    c2824.m5390(typedArrayM432.getChangingConfigurations());
                                    if (i15 == 0) {
                                        i5 = 0;
                                    } else if (i15 == 1) {
                                        i5 = 1;
                                    } else if (i15 != 2) {
                                        i5 = 0;
                                    } else {
                                        i5 = 2;
                                    }
                                    int i16 = !AbstractC0186.m408(c2824.f9439, "strokeLineJoin") ? -1 : typedArrayM432.getInt(9, -1);
                                    c2824.m5390(typedArrayM432.getChangingConfigurations());
                                    if (i16 != 0) {
                                        if (i16 == 1) {
                                            i6 = 1;
                                        } else if (i16 == 2) {
                                            i6 = 2;
                                        }
                                        float fM5394 = c2824.m5391(typedArrayM432, "strokeMiterLimit", 10, 4.0f);
                                        c3510M410 = AbstractC0186.m410(typedArrayM432, c2824.f9439, theme, "strokeColor", 3);
                                        c2824.m5390(typedArrayM432.getChangingConfigurations());
                                        float fM5395 = c2824.m5391(typedArrayM432, "strokeAlpha", 11, 1.0f);
                                        float fM5396 = c2824.m5391(typedArrayM432, "strokeWidth", 4, 1.0f);
                                        float fM5397 = c2824.m5391(typedArrayM432, "trimPathEnd", 6, 1.0f);
                                        float fM5398 = c2824.m5391(typedArrayM432, "trimPathOffset", 7, 0.0f);
                                        float fM5399 = c2824.m5391(typedArrayM432, "trimPathStart", 5, 0.0f);
                                        if (AbstractC0186.m408(c2824.f9439, "fillType")) {
                                            i7 = typedArrayM432.getInt(13, 0);
                                        } else {
                                            i7 = 0;
                                        }
                                        c2824.m5390(typedArrayM432.getChangingConfigurations());
                                        typedArrayM432.recycle();
                                        shader = (Shader) c3510M411.f11621;
                                        if (shader == null && c3510M411.f11622 == 0) {
                                            c0547 = null;
                                        } else if (shader != null) {
                                            c0547 = new C0714(shader);
                                        } else {
                                            c0547 = new C0547(AbstractC4225.m7468(c3510M411.f11622));
                                        }
                                        shader2 = (Shader) c3510M410.f11621;
                                        if (shader2 != null && c3510M410.f11622 == 0) {
                                            abstractC0548 = null;
                                        } else {
                                            if (shader2 != null) {
                                                c0548 = new C0714(shader2);
                                            } else {
                                                c0548 = new C0547(AbstractC4225.m7468(c3510M410.f11622));
                                            }
                                            abstractC0548 = c0548;
                                        }
                                        if (i7 == 0) {
                                            i8 = 0;
                                        } else {
                                            i8 = 1;
                                        }
                                        if (c2398.f7980) {
                                            AbstractC3480.m6278("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        ArrayList arrayList = c2398.f7979;
                                        ((C3005) arrayList.get(arrayList.size() - 1)).f10111.add(new C2005(str, list, i8, c0547, fM5393, abstractC0548, fM5395, fM5396, i5, i6, fM5394, fM5399, fM5397, fM5398));
                                    }
                                    i6 = 0;
                                    float fM53910 = c2824.m5391(typedArrayM432, "strokeMiterLimit", 10, 4.0f);
                                    c3510M410 = AbstractC0186.m410(typedArrayM432, c2824.f9439, theme, "strokeColor", 3);
                                    c2824.m5390(typedArrayM432.getChangingConfigurations());
                                    float fM53911 = c2824.m5391(typedArrayM432, "strokeAlpha", 11, 1.0f);
                                    float fM53912 = c2824.m5391(typedArrayM432, "strokeWidth", 4, 1.0f);
                                    float fM53913 = c2824.m5391(typedArrayM432, "trimPathEnd", 6, 1.0f);
                                    float fM53914 = c2824.m5391(typedArrayM432, "trimPathOffset", 7, 0.0f);
                                    float fM53915 = c2824.m5391(typedArrayM432, "trimPathStart", 5, 0.0f);
                                    if (AbstractC0186.m408(c2824.f9439, "fillType")) {
                                        i7 = 0;
                                    } else {
                                        i7 = typedArrayM432.getInt(13, 0);
                                    }
                                    c2824.m5390(typedArrayM432.getChangingConfigurations());
                                    typedArrayM432.recycle();
                                    shader = (Shader) c3510M411.f11621;
                                    if (shader == null) {
                                        c0547 = null;
                                    } else if (shader != null) {
                                        c0547 = new C0714(shader);
                                    } else {
                                        c0547 = new C0547(AbstractC4225.m7468(c3510M411.f11622));
                                    }
                                    shader2 = (Shader) c3510M410.f11621;
                                    if (shader2 != null) {
                                        if (shader2 != null) {
                                            c0548 = new C0714(shader2);
                                        } else {
                                            c0548 = new C0547(AbstractC4225.m7468(c3510M410.f11622));
                                        }
                                        abstractC0548 = c0548;
                                    } else {
                                        abstractC0548 = null;
                                    }
                                    if (i7 == 0) {
                                        i8 = 0;
                                    } else {
                                        i8 = 1;
                                    }
                                    if (c2398.f7980) {
                                        AbstractC3480.m6278("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ArrayList arrayList2 = c2398.f7979;
                                    ((C3005) arrayList2.get(arrayList2.size() - 1)).f10111.add(new C2005(str, list, i8, c0547, fM5393, abstractC0548, fM53911, fM53912, i5, i6, fM53910, fM53915, fM53913, fM53914));
                                }
                                b = -1;
                                i4 = 3;
                            } else if (iHashCode == 98629247 && name.equals("group")) {
                                TypedArray typedArrayM433 = AbstractC0186.m431(resources, theme, attributeSetAsAttributeSet, f9180);
                                c2824.m5390(typedArrayM433.getChangingConfigurations());
                                float fM53916 = c2824.m5391(typedArrayM433, "rotation", 5, 0.0f);
                                float f3 = typedArrayM433.getFloat(1, 0.0f);
                                c2824.m5390(typedArrayM433.getChangingConfigurations());
                                float f4 = typedArrayM433.getFloat(2, 0.0f);
                                c2824.m5390(typedArrayM433.getChangingConfigurations());
                                float fM53917 = c2824.m5391(typedArrayM433, "scaleX", 3, 1.0f);
                                float fM53918 = c2824.m5391(typedArrayM433, "scaleY", 4, 1.0f);
                                float fM53919 = c2824.m5391(typedArrayM433, "translateX", 6, 0.0f);
                                float fM53920 = c2824.m5391(typedArrayM433, "translateY", 7, 0.0f);
                                String string3 = typedArrayM433.getString(0);
                                c2824.m5390(typedArrayM433.getChangingConfigurations());
                                String str2 = string3 == null ? "" : string3;
                                typedArrayM433.recycle();
                                int i17 = AbstractC0184.f672;
                                if (c2398.f7980) {
                                    AbstractC3480.m6278("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                c2398.f7979.add(new C3005(str2, fM53916, f3, f4, fM53917, fM53918, fM53919, fM53920, listM2241, 512));
                            }
                        } else {
                            i3 = i12;
                            b = -1;
                            i4 = 3;
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayM434 = AbstractC0186.m431(resources, theme, attributeSetAsAttributeSet, f9160);
                                c2824.m5390(typedArrayM434.getChangingConfigurations());
                                String string4 = typedArrayM434.getString(0);
                                c2824.m5390(typedArrayM434.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                String string5 = typedArrayM434.getString(1);
                                c2824.m5390(typedArrayM434.getChangingConfigurations());
                                if (string5 == null) {
                                    int i18 = AbstractC0184.f672;
                                } else {
                                    listM2241 = C1039.m2241(c1039, string5);
                                }
                                List list2 = listM2241;
                                typedArrayM434.recycle();
                                if (c2398.f7980) {
                                    AbstractC3480.m6278("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                c2398.f7979.add(new C3005(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i3++;
                            }
                        }
                        xmlResourceParser.next();
                        xml = xmlResourceParser;
                        i9 = i13;
                        i10 = i4;
                        i12 = i3;
                    } else {
                        i3 = i12;
                    }
                    b = -1;
                    i4 = 3;
                } else if (eventType == i10 && "group".equals(xmlPullParser.getName())) {
                    int i19 = i12 + 1;
                    int i20 = 0;
                    while (i20 < i19) {
                        ArrayList arrayList3 = c2398.f7979;
                        if (c2398.f7980) {
                            AbstractC3480.m6278("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                        }
                        C3005 c3005 = (C3005) arrayList3.remove(arrayList3.size() - 1);
                        ((C3005) arrayList3.get(arrayList3.size() - 1)).f10111.add(new C2715(c3005.f10109, c3005.f10107, c3005.f10104, c3005.f10110, c3005.f10105, c3005.f10106, c3005.f10113, c3005.f10108, c3005.f10112, c3005.f10111));
                        i20++;
                        i10 = 3;
                    }
                    i4 = i10;
                    b = -1;
                    i3 = 0;
                } else {
                    i3 = i12;
                    i4 = i10;
                    b = -1;
                }
                xmlResourceParser.next();
                xml = xmlResourceParser;
                i9 = i13;
                i10 = i4;
                i12 = i3;
            }
            c4977 = new C4977(c2398.m4517(), i9 | c2824.f9438);
            c4789.f15799.put(c3630, new WeakReference(c4977));
        }
        C2161 c2161M7896 = AbstractC4554.m7896(c4977.f16464, c5362);
        c5362.m9009(false);
        return c2161M7896;
    }

    /* JADX INFO: renamed from: ۥۘ */
    public static final boolean m5132(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Object m5133(long j, InterfaceC0443 interfaceC0443) {
        Object objM5130 = m5130(m5125(j), interfaceC0443);
        return objM5130 == EnumC2282.f7590 ? objM5130 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static final InterfaceC1312 m5134(InterfaceC3534 interfaceC3534) {
        InterfaceC4137 interfaceC4137Mo865 = interfaceC3534.mo865(C0373.f1369);
        InterfaceC1312 interfaceC1312 = interfaceC4137Mo865 instanceof InterfaceC1312 ? (InterfaceC1312) interfaceC4137Mo865 : null;
        return interfaceC1312 == null ? AbstractC4195.f13945 : interfaceC1312;
    }

    /* JADX INFO: renamed from: ۥۢ */
    public static C2127 m5135(InterfaceC4643 interfaceC4643, InterfaceC3534 interfaceC3534, int i, InterfaceC5731 interfaceC5731, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC3534 = C4794.f15814;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return m5142(interfaceC4643, interfaceC3534, i, interfaceC5731);
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static final C1106 m5136(C4397 c4397) {
        LinkedHashMap linkedHashMap = c4397.f18983;
        InterfaceC3983 interfaceC3983 = (InterfaceC3983) linkedHashMap.get(f9171);
        Bundle bundle = null;
        if (interfaceC3983 == null) {
            C1078.m2272("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        InterfaceC4680 interfaceC4680 = (InterfaceC4680) linkedHashMap.get(f9173);
        if (interfaceC4680 == null) {
            C1078.m2272("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(f9175);
        String str = (String) linkedHashMap.get(AbstractC2164.f7142);
        if (str == null) {
            C1078.m2272("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        InterfaceC2895 interfaceC2895M4419 = interfaceC3983.mo648().m4419("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C2869 c2869 = interfaceC2895M4419 instanceof C2869 ? (C2869) interfaceC2895M4419 : null;
        if (c2869 == null) {
            C1078.m2276("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        C1183 c1183M5137 = m5137(interfaceC4680);
        C1106 c1106 = (C1106) c1183M5137.f4070.get(str);
        if (c1106 != null) {
            return c1106;
        }
        c2869.m5437();
        Bundle bundle3 = c2869.f9585;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC4554.m7904((C3869[]) Arrays.copyOf(new C3869[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                c2869.f9585 = null;
            }
            bundle = bundle4;
        }
        C1106 c1106M7895 = AbstractC4554.m7895(bundle, bundle2);
        c1183M5137.f4070.put(str, c1106M7895);
        return c1106M7895;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static final C1183 m5137(InterfaceC4680 interfaceC4680) {
        return (C1183) new C1489(interfaceC4680.mo651(), new C5096(), interfaceC4680 instanceof InterfaceC5833 ? ((InterfaceC5833) interfaceC4680).mo640() : C4390.f14468).m3136(AbstractC5041.m8557(C1183.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static final void m5138(C3998 c3998, C5362 c5362, int i) {
        C3998 c3999;
        C3998 c39910;
        C3998 c39911;
        String strM5804;
        c5362.m8979(-2128274641);
        new C4441(new long[]{-3213106921188410678L, 3500257535368206042L, -5669204686185979235L, 6506357371732711094L, 2280920933485135445L, 1869729627910838323L, 846289524089506239L, -2075670217479939125L, -1904812024274341539L, -4447263221133559300L}).toString();
        int i2 = i | 2;
        int i3 = 0;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            c5362.m8971();
            new C4441(new long[]{6255945851989843983L, 557655556682316853L, 4980285690042103852L}).toString();
            int i4 = i & 1;
            Object obj = C2850.f9517;
            if (i4 == 0 || c5362.m8969()) {
                new C4441(new long[]{-8689789258690678853L, -8921647756361092227L, -6893537124179790554L, -212407791202180415L, -2795581032289394996L, 6552296311082026743L, 1265622227481068607L, -5192571583105471477L, 2941947708795866757L, 9130356990716243649L}).toString();
                C2354 c2354M6801 = AbstractC3804.m6801(c5362);
                new C4441(new long[]{-5725125104876069318L, -1553419778971460841L, 4076472002088694562L, 8444096944729884239L, -5346098996997347354L}).toString();
                boolean zM8963 = c5362.m8963(null) | c5362.m8963(c2354M6801);
                Object objM8999 = c5362.m8999();
                if (zM8963 || objM8999 == obj) {
                    objM8999 = c2354M6801.m4427(AbstractC5041.m8557(C3998.class), null, null);
                    c5362.m8987(objM8999);
                }
                c39910 = (C3998) objM8999;
            } else {
                c5362.m8982();
                c39910 = c3998;
            }
            c5362.m8964();
            InterfaceC4367 interfaceC4367M6750 = AbstractC3801.m6750(c39910.f13334, c5362);
            if (((C0783) interfaceC4367M6750.getValue()).f2829) {
                c5362.m8957(-1122427328);
                new C4441(new long[]{-9205039817250237214L, 6231513686793662704L, -2248818289779004574L, 1821297437947360890L, 8266876692751719545L, 5292618725082477695L, -6014254778602212665L, 2597186954724744000L, -8694437710791405572L}).toString();
                if (((C0783) interfaceC4367M6750.getValue()).f2826.length() > 0) {
                    c5362.m8957(-867490271);
                    new C4441(new long[]{4290166769821213142L, 182560446205859133L, -6607236366487397082L}).toString();
                    strM5804 = C3133.m5786(((C0783) interfaceC4367M6750.getValue()).f2827, new Object[]{((C0783) interfaceC4367M6750.getValue()).f2826}, c5362);
                    c5362.m9009(false);
                } else {
                    c5362.m8957(-867488241);
                    new C4441(new long[]{-1004507047016567930L, -1625068927571915843L, -1369117155384207976L}).toString();
                    strM5804 = C3133.m5804(((C0783) interfaceC4367M6750.getValue()).f2827, c5362);
                    c5362.m9009(false);
                }
                new C4441(new long[]{6876830827539990194L, -2303070879729628741L, -8753224824105257358L, 4604460864434144660L, -6250650437118987502L, 4095427177101641062L, -3632578890076116565L}).toString();
                boolean zM8977 = c5362.m8977(c39910);
                Object objM89910 = c5362.m8999();
                if (zM8977 || objM89910 == obj) {
                    objM89910 = new C0207(c39910, 0);
                    c5362.m8987(objM89910);
                }
                c39911 = c39910;
                AbstractC4593.m7979((InterfaceC4448) objM89910, AbstractC3925.m7034(-2002788286, new C5053(c39910), c5362), null, AbstractC3925.m7034(-862244674, new C2472(interfaceC4367M6750, i3), c5362), AbstractC3925.m7034(-577108771, new C4164(4, strM5804), c5362), null, 0L, 0L, 0L, 0L, null, c5362, 1769520);
                c5362.m9009(false);
            } else {
                c39911 = c39910;
                c5362.m8957(-1121671021);
                c5362.m9009(false);
            }
            c3999 = c39911;
        } else {
            c5362.m8982();
            c3999 = c3998;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5053(c3999, i);
        }
    }

    /* JADX INFO: renamed from: ۥۨ */
    public static final int m5139(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: ۦ */
    public static final void m5140(AbstractActivityC2747 abstractActivityC2747, InterfaceC4448 interfaceC4448) {
        C0649 c0649 = AbstractC0912.f3276;
        m5135(AbstractC4009.m7151(AbstractC5794.f19088), null, 0, new C1734(abstractActivityC2747, interfaceC4448, null, 3), 3);
    }

    /* JADX INFO: renamed from: ۦؓ */
    public static final C4730 m5141(C2793 c2793) {
        return new C4730(Math.round(c2793.f9343), Math.round(c2793.f9342), Math.round(c2793.f9341), Math.round(c2793.f9344));
    }

    /* JADX INFO: renamed from: ۦؔ */
    public static final C2127 m5142(InterfaceC4643 interfaceC4643, InterfaceC3534 interfaceC3534, int i, InterfaceC5731 interfaceC5731) throws Throwable {
        InterfaceC3534 interfaceC3534M5173 = AbstractC2774.m5173(interfaceC4643, interfaceC3534);
        C2127 c3420 = i == 2 ? new C3420(interfaceC3534M5173, interfaceC5731) : new C2127(interfaceC3534M5173, true);
        c3420.m3707(i, c3420, interfaceC5731);
        return c3420;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final void m5143(long j, C3564 c3564, InterfaceC5731 interfaceC5731, C5362 c5362, int i) {
        int i2;
        c5362.m8979(-684938728);
        if ((i & 6) == 0) {
            i2 = (c5362.m8961(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8963(c3564) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8977(interfaceC5731) ? 256 : 128;
        }
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            C4216 c4216 = AbstractC0495.f1787;
            C4773.m8123(new C3467[]{AbstractC0194.f721.mo4313(new C1327(j)), c4216.mo4313(((C3564) c5362.m8997(c4216)).m6360(c3564))}, interfaceC5731, c5362, ((i2 >> 3) & 112) | 8);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4710(j, c3564, interfaceC5731, i, 1);
        }
    }

    /* JADX INFO: renamed from: ۦَ */
    public static final Object m5144(InterfaceC3534 interfaceC3534, InterfaceC5731 interfaceC5731, InterfaceC0443 interfaceC0443) {
        Unsafe unsafe;
        long j;
        InterfaceC3534 interfaceC3534Mo334 = interfaceC0443.mo334();
        InterfaceC3534 interfaceC3534Mo860 = !((Boolean) interfaceC3534.mo875(new C4876(1), Boolean.FALSE)).booleanValue() ? interfaceC3534Mo334.mo860(interfaceC3534) : AbstractC2774.m5208(interfaceC3534Mo334, interfaceC3534, false);
        AbstractC5568.m9360(interfaceC3534Mo860);
        if (interfaceC3534Mo860 == interfaceC3534Mo334) {
            C5555 c5555 = new C5555(interfaceC0443, interfaceC3534Mo860);
            return AbstractC0487.m1066(c5555, true, c5555, interfaceC5731);
        }
        C0373 c0373 = C0373.f1369;
        if (AbstractC3831.m6874(interfaceC3534Mo860.mo865(c0373), interfaceC3534Mo334.mo865(c0373))) {
            C5278 c5278 = new C5278(interfaceC0443, interfaceC3534Mo860);
            InterfaceC3534 interfaceC3535 = c5278.f6194;
            Object objM5152 = m5152(interfaceC3535, null);
            try {
                return AbstractC0487.m1066(c5278, true, c5278, interfaceC5731);
            } finally {
                m5121(interfaceC3535, objM5152);
            }
        }
        C1755 c1755 = new C1755(interfaceC0443, interfaceC3534Mo860);
        try {
            AbstractC5378.m9066(AbstractC2776.m5232(AbstractC2776.m5246(c1755, c1755, interfaceC5731)), C2358.f7817);
            do {
                unsafe = AbstractC3456.f11473;
                j = C1755.f5847;
                int intVolatile = unsafe.getIntVolatile(c1755, j);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        C1078.m2276("Already suspended");
                        return null;
                    }
                    Object objM9033 = AbstractC5378.m9033(c1755.m890());
                    if (objM9033 instanceof C5036) {
                        throw ((C5036) objM9033).f16702;
                    }
                    return objM9033;
                }
            } while (!unsafe.compareAndSwapInt(c1755, j, 0, 1));
            return EnumC2282.f7590;
        } catch (Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof C0768) {
                th2 = ((C0768) th2).f2784;
            }
            c1755.mo335(new C4535(th2));
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final long m5145(int i, int i2) {
        if (i < 0 || i2 < 0) {
            AbstractC3767.m6644("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = C3346.f11195;
        return j;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static void m5146(StringBuilder sb, Object obj, InterfaceC4745 interfaceC4745) {
        if (interfaceC4745 != null) {
            sb.append((CharSequence) interfaceC4745.mo211(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX INFO: renamed from: ۦٝ */
    public static void m5147(Context context, String str) {
        if (context != null) {
            try {
                File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str);
                file.setReadable(true, false);
                file.setExecutable(true, false);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦۜ */
    public static final void m5148(AbstractC0772 abstractC0772) {
        C5466 c5466;
        if (abstractC0772 instanceof C5466) {
            c5466 = (C5466) abstractC0772;
            int i = c5466.f18026;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5466.f18026 = i - Integer.MIN_VALUE;
            } else {
                c5466 = new C5466(abstractC0772);
            }
        } else {
            c5466 = new C5466(abstractC0772);
        }
        Object obj = c5466.f18027;
        int i2 = c5466.f18026;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            c5466.f18026 = 1;
            C2600 c2600 = new C2600(1, AbstractC2776.m5232(c5466));
            c2600.m4913();
            if (c2600.m4909() == EnumC2282.f7590) {
                return;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC0186.m409(obj);
        }
        C1078.m2274();
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static final boolean m5149(float f, float f2, C0935 c0935) {
        C2793 c2793 = new C2793(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        C0935 c0935M669 = AbstractC0317.m669();
        C0935.m1904(c0935M669, c2793);
        C0935 c0935M6610 = AbstractC0317.m669();
        c0935M6610.m1906(c0935, c0935M669, 1);
        boolean zIsEmpty = c0935M6610.f3328.isEmpty();
        c0935M6610.m1907();
        c0935M669.m1907();
        return !zIsEmpty;
    }

    /* JADX INFO: renamed from: ۦۢ */
    public static Context m5150(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9168, i, i2);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i3 = iArr2[0];
        boolean z = (context instanceof C5260) && ((C5260) context).f17348 == i3;
        if (i3 == 0 || z) {
            return context;
        }
        C5260 c5260 = new C5260(context, i3);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr3[i4] = typedArrayObtainStyledAttributes2.getResourceId(i4, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr3[i5];
            if (i6 != 0) {
                c5260.getTheme().applyStyle(i6, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f9170);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            c5260.getTheme().applyStyle(resourceId, true);
        }
        return c5260;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static final long m5151(long j, int i) {
        int i2 = C3346.f11195;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : m5145(i4, i);
    }

    /* JADX INFO: renamed from: ۦۤ */
    public static final Object m5152(InterfaceC3534 interfaceC3534, Object obj) {
        if (obj == null) {
            obj = interfaceC3534.mo875(f9179, 0);
        }
        if (obj == 0) {
            return f9155;
        }
        if (!(obj instanceof Integer)) {
            return ((C0464) obj).m980();
        }
        return interfaceC3534.mo875(f9163, new C3313(((Number) obj).intValue(), interfaceC3534));
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static final AbstractC2045 m5153(AbstractC2045 abstractC2045) {
        C0605 c0605 = abstractC2045.f6744.f4513;
        while (true) {
            C0605 c0605M1356 = c0605.m1356();
            C0605 c0606 = null;
            if ((c0605M1356 != null ? c0605M1356.f2271 : null) == null) {
                return ((AbstractC1311) c0605.f2256.f8201).mo2793();
            }
            C0605 c0605M1357 = c0605.m1356();
            if (c0605M1357 != null) {
                c0606 = c0605M1357.f2271;
            }
            c0606.getClass();
            c0605 = c0605.m1356().f2271;
        }
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥؓ */
    public String mo4103() {
        m5159();
        throw null;
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥؖ */
    public abstract short mo4104();

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC2125 mo5154(C3907 c3907, int i) {
        return mo4107(c3907.mo190(i));
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۥً */
    public long mo5155(InterfaceC0103 interfaceC0103, int i) {
        return mo4108();
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥُ */
    public boolean mo4105() {
        return true;
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥّ */
    public char mo4106() {
        m5159();
        throw null;
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۥْ */
    public short mo5157(C3907 c3907, int i) {
        return mo4104();
    }

    @Override // p000.InterfaceC3596
    /* JADX INFO: renamed from: ۥٕ */
    public int mo4401(int i) {
        int iMo2900 = mo2900(i);
        if (iMo2900 == -1 || mo2900(iMo2900) == -1) {
            return -1;
        }
        return iMo2900;
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۥٙ */
    public int mo5158(InterfaceC0103 interfaceC0103, int i) {
        return mo4116();
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥۗ */
    public abstract long mo4108();

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥۙ */
    public int mo4109(InterfaceC0103 interfaceC0103) {
        m5159();
        throw null;
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥۧ */
    public float mo4111() {
        m5159();
        throw null;
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦؑ */
    public boolean mo4112() {
        m5159();
        throw null;
    }

    /* JADX INFO: renamed from: ۦؒ */
    public void m5159() {
        throw new C0480(AbstractC5041.m8557(getClass()) + " can't retrieve untyped values");
    }

    @Override // p000.InterfaceC3596
    /* JADX INFO: renamed from: ۦؖ */
    public int mo4408(int i) {
        int iMo2901 = mo2901(i);
        if (iMo2901 == -1 || mo2901(iMo2901) == -1) {
            return -1;
        }
        return iMo2901;
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦؙ */
    public double mo4113() {
        m5159();
        throw null;
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۦؚ */
    public char mo5160(C3907 c3907, int i) {
        return mo4106();
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۦٌ */
    public float mo5161(C3907 c3907, int i) {
        return mo4111();
    }

    @Override // p000.InterfaceC3596
    /* JADX INFO: renamed from: ۦِ */
    public int mo4411(int i) {
        return mo2900(i);
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۦٕ */
    public Object mo5162(InterfaceC0103 interfaceC0103, int i, InterfaceC4734 interfaceC4734, Object obj) {
        return mo4110(interfaceC4734);
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۦٗ */
    public boolean mo5163(InterfaceC0103 interfaceC0103, int i) {
        return mo4112();
    }

    @Override // p000.InterfaceC3596
    /* JADX INFO: renamed from: ۦٛ */
    public int mo4414(int i) {
        return mo2901(i);
    }

    /* JADX INFO: renamed from: ۦٞ */
    public abstract int mo2900(int i);

    /* JADX INFO: renamed from: ۦٟ */
    public abstract int mo2901(int i);

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۦۗ */
    public double mo5164(C3907 c3907, int i) {
        return mo4113();
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۦۙ */
    public Object mo5165(InterfaceC0103 interfaceC0103, int i, InterfaceC4734 interfaceC4734, Object obj) {
        if (interfaceC4734.mo193().mo187() || mo4105()) {
            return mo4110(interfaceC4734);
        }
        return null;
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۦۚ */
    public byte mo5166(C3907 c3907, int i) {
        return mo4115();
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦۛ */
    public abstract byte mo4115();

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦ۟ */
    public abstract int mo4116();

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۦۨ */
    public String mo5167(InterfaceC0103 interfaceC0103, int i) {
        return mo4103();
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۥَ */
    public void mo5156(InterfaceC0103 interfaceC0103) {
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥۖ */
    public InterfaceC2125 mo4107(InterfaceC0103 interfaceC0103) {
        return this;
    }

    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦٚ */
    public InterfaceC5308 mo4114(InterfaceC0103 interfaceC0103) {
        return this;
    }
}
