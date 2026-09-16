package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ۦؘؘؗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3510 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f11621;

    /* JADX INFO: renamed from: ۥۗ */
    public int f11622;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f11623;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f11624;

    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    public C3510(C3046 c3046, AbstractC2776 abstractC2776) {
        Object c2184;
        this.f11623 = 8;
        C3510 c3510Mo4990 = abstractC2776.mo4990();
        int i = c3046.f6006;
        if (i < 0) {
            AbstractC4690.m8035("negative nearestRange.first");
        }
        int iMin = Math.min(c3046.f6005, c3510Mo4990.f11622 - 1);
        if (iMin < i) {
            this.f11621 = AbstractC0664.f2448;
            this.f11624 = new Object[0];
            this.f11622 = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.f11624 = new Object[i2];
        this.f11622 = i;
        C1254 c1254 = new C1254(i2);
        C0863 c0863 = (C0863) c3510Mo4990.f11621;
        if (i < 0 || i >= c3510Mo4990.f11622) {
            StringBuilder sbM8680 = AbstractC5078.m8680(i, "Index ", ", size ");
            sbM8680.append(c3510Mo4990.f11622);
            AbstractC4690.m8036(sbM8680.toString());
        }
        if (iMin < 0 || iMin >= c3510Mo4990.f11622) {
            StringBuilder sbM8681 = AbstractC5078.m8680(iMin, "Index ", ", size ");
            sbM8681.append(c3510Mo4990.f11622);
            AbstractC4690.m8036(sbM8681.toString());
        }
        if (iMin < i) {
            AbstractC4690.m8038("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iM7089 = AbstractC3933.m7089(i, c0863);
        int i3 = ((C4014) c0863.f3182[iM7089]).f13382;
        while (i3 <= iMin) {
            C4014 c4014 = (C4014) c0863.f3182[iM7089];
            InterfaceC4745 key = c4014.f13380.getKey();
            int i4 = c4014.f13382;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (c4014.f13381 + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        c2184 = key.mo211(Integer.valueOf(iMax - i4));
                        c2184 = c2184 == null ? new C2184(iMax) : c2184;
                    }
                    c1254.m2655(iMax, c2184);
                    ((Object[]) this.f11624)[iMax - this.f11622] = c2184;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += c4014.f13381;
            iM7089++;
        }
        this.f11621 = c1254;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static C3510 m6293(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM6976 = AbstractC3905.m6976(resources, xml, attributeSetAsAttributeSet, theme);
                return new C3510((Shader) null, colorStateListM6976, colorStateListM6976.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM431 = AbstractC0186.m431(resources, theme, attributeSetAsAttributeSet, AbstractC0293.f1078);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayM431.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM431.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM431.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM431.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM431.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM431.getFloat(4, 0.0f) : 0.0f;
        int i2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayM431.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM431.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM431.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM431.getColor(1, 0) : 0;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayM431.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM431.getFloat(5, 0.0f) : 0.0f;
        typedArrayM431.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM432 = AbstractC0186.m431(resources, theme, attributeSetAsAttributeSet, AbstractC0293.f1079);
                boolean zHasValue = typedArrayM432.hasValue(0);
                boolean zHasValue2 = typedArrayM432.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM432.getColor(0, 0);
                float f11 = typedArrayM432.getFloat(1, 0.0f);
                typedArrayM432.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        C4787 c4787 = arrayList2.size() > 0 ? new C4787(arrayList2, arrayList) : null;
        if (c4787 == null) {
            c4787 = z ? new C4787(color, color2, color3) : new C4787(color, color3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                int[] iArr = c4787.f15793;
                float[] fArr = c4787.f15792;
                if (i3 != 1) {
                    tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, c4787.f15793, c4787.f15792);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = c4787.f15793;
            float[] fArr2 = c4787.f15792;
            if (i3 != 1) {
                tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new C3510(radialGradient, (ColorStateList) null, 0);
    }

    public String toString() {
        String str;
        switch (this.f11623) {
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=true, prettyPrintIndent='");
                sb.append((String) this.f11621);
                sb.append("', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='");
                sb.append((String) this.f11624);
                sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
                int i = this.f11622;
                if (i == 1) {
                    str = "NONE";
                } else if (i != 2) {
                    str = i != 3 ? "null" : "POLYMORPHIC";
                } else {
                    str = "ALL_JSON_OBJECTS";
                }
                sb.append(str);
                sb.append(", exceptionsWithDebugInfo=true)");
                return sb.toString();
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return m6306();
            case 11:
                StringBuilder sb2 = new StringBuilder();
                if (((EnumC1658) this.f11621) == EnumC1658.f5517) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f11622);
                sb2.append(' ');
                sb2.append((String) this.f11624);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public C5147 m6295(boolean z) {
        C0479 c0479;
        C0479 c04710;
        if (z && (c04710 = (C0479) this.f11624) != null) {
            throw c04710.m1027();
        }
        C5147 c5147M8751 = C5147.m8751(this.f11622, (Object[]) this.f11621, this);
        if (!z || (c0479 = (C0479) this.f11624) == null) {
            return c5147M8751;
        }
        throw c0479.m1027();
    }

    /* JADX INFO: renamed from: ۥُ */
    public C4014 m6296(int i) {
        if (i < 0 || i >= this.f11622) {
            StringBuilder sbM8680 = AbstractC5078.m8680(i, "Index ", ", size ");
            sbM8680.append(this.f11622);
            AbstractC4690.m8036(sbM8680.toString());
        }
        C4014 c4014 = (C4014) this.f11624;
        if (c4014 != null) {
            int i2 = c4014.f13382;
            if (i < c4014.f13381 + i2 && i2 <= i) {
                return c4014;
            }
        }
        C0863 c0863 = (C0863) this.f11621;
        C4014 c4015 = (C4014) c0863.f3182[AbstractC3933.m7089(i, c0863)];
        this.f11624 = c4015;
        return c4015;
    }

    /* JADX INFO: renamed from: ۥّ */
    public int m6297(Object obj) {
        C1254 c1254 = (C1254) this.f11621;
        int iM2654 = c1254.m2654(obj);
        if (iM2654 >= 0) {
            return c1254.f4315[iM2654];
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥْ */
    public void m6298(int i, InterfaceC3275 interfaceC3275) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f11621;
        int i3 = this.f11622;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                interfaceC3275.mo1822(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m6299() {
        C1138 c1138;
        ImageView imageView = (ImageView) this.f11621;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC3522.m6316(drawable);
        }
        if (drawable == null || (c1138 = (C1138) this.f11624) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = C3465.f11497;
        C0141.m306(drawable, c1138, drawableState);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public void m6300(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.f11621;
        int i8 = this.f11622;
        int i9 = i8 + 3;
        this.f11622 = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            this.f11621 = Arrays.copyOf(jArr, iMax);
            this.f11624 = Arrays.copyOf((long[]) this.f11624, iMax);
        }
        long[] jArr2 = (long[]) this.f11621;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                int i13 = (i8 - i11) / 3;
                int i14 = AbstractC1322.f4562;
                jArr2[i12] = (((long) Math.min(i13, 1023)) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m6301(int i, InterfaceC4370 interfaceC4370) {
        if (i < 0) {
            AbstractC4690.m8038("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        C4014 c4014 = new C4014(this.f11622, i, interfaceC4370);
        this.f11622 += i;
        ((C0863) this.f11621).m1843(c4014);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public void m6302(Object obj, Object obj2) {
        int i = (this.f11622 + 1) * 2;
        Object[] objArrCopyOf = (Object[]) this.f11621;
        if (i > objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, C3094.m5680(objArrCopyOf.length, i));
            this.f11621 = objArrCopyOf;
        }
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            int i2 = this.f11622;
            int i3 = i2 * 2;
            objArrCopyOf[i3] = obj;
            objArrCopyOf[i3 + 1] = obj2;
            this.f11622 = i2 + 1;
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m6303(C5147 c5147) {
        Set setEntrySet = c5147.entrySet();
        int size = (setEntrySet.size() + this.f11622) * 2;
        Object[] objArr = (Object[]) this.f11621;
        if (size > objArr.length) {
            this.f11621 = Arrays.copyOf(objArr, C3094.m5680(objArr.length, size));
        }
        AbstractC0219 it = ((C0725) setEntrySet).iterator();
        while (true) {
            C1868 c1868 = (C1868) it;
            if (!c1868.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) c1868.next();
            m6302(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public boolean m6304() {
        ColorStateList colorStateList;
        return ((Shader) this.f11621) == null && (colorStateList = (ColorStateList) this.f11624) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m6305(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f11621;
        Context context = imageView.getContext();
        int[] iArr = AbstractC5618.f18512;
        C5460 c5460M9119 = C5460.m9119(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c5460M9119.f17999;
        AbstractC3608.m6435(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c5460M9119.f17999, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC4225.m7464(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC3522.m6316(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c5460M9119.m9120(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC3522.m6315(typedArray.getInt(3, -1), null));
            }
        } finally {
            c5460M9119.m9126();
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public String m6306() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f11622 + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f11621)[i2];
            if (obj instanceof InterfaceC0103) {
                InterfaceC0103 interfaceC0103 = (InterfaceC0103) obj;
                boolean zM6874 = AbstractC3831.m6874(interfaceC0103.mo183(), C3626.f12099);
                int[] iArr = (int[]) this.f11624;
                if (!zM6874) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC0103.mo184(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f11624)[i2]);
                    sb.append("]");
                }
            } else if (obj == C0373.f1361) {
                sb.append("[<debug info disabled>]");
            } else if (obj != C1298.f4432) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦۚ */
    public void m6307() {
        int i = this.f11622 * 2;
        this.f11621 = Arrays.copyOf((Object[]) this.f11621, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC0246.m516(0, 0, 14, (int[]) this.f11624, iArr);
        this.f11624 = iArr;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void m6308(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.f11621;
        long[] jArr2 = (long[]) this.f11624;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.f11622 : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i11] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        int i12 = AbstractC1322.f4562;
                        jArr2[i4] = ((-1125899873288193L) & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m6309(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f11621;
        int i3 = this.f11622;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    public C3510(int i, byte b) {
        this.f11623 = i;
        switch (i) {
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f11621 = new C0863(new C4014[16]);
                break;
            default:
                this.f11621 = "    ";
                this.f11624 = "type";
                this.f11622 = 3;
                break;
        }
    }

    public C3510(C3510 c3510) {
        this.f11623 = 6;
        this.f11621 = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f11624 = iArr;
        this.f11622 = -1;
    }

    public C3510(EnumC1658 enumC1658, int i, String str) {
        this.f11623 = 11;
        this.f11621 = enumC1658;
        this.f11622 = i;
        this.f11624 = str;
    }

    public C3510(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.f11623 = 0;
        this.f11621 = arrayList;
        this.f11622 = i;
        this.f11624 = motionEvent;
        if (arrayList.isEmpty()) {
            C1078.m2272("changes cannot be empty");
            throw null;
        }
    }

    public C3510(ImageView imageView) {
        this.f11623 = 1;
        this.f11622 = 0;
        this.f11621 = imageView;
    }

    public /* synthetic */ C3510(char c, int i) {
        this.f11623 = i;
    }

    public C3510(Shader shader, ColorStateList colorStateList, int i) {
        this.f11623 = 3;
        this.f11621 = shader;
        this.f11624 = colorStateList;
        this.f11622 = i;
    }

    public C3510(InterfaceC2509 interfaceC2509) {
        this.f11623 = 2;
        this.f11621 = interfaceC2509;
    }

    public C3510(int i) {
        this.f11623 = 4;
        this.f11621 = new Object[i * 2];
        this.f11622 = 0;
    }
}
