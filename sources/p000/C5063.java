package p000;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import de.robv.android.xposed.XposedBridge;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۦؘۘؗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5063 implements InterfaceC2003 {

    /* JADX INFO: renamed from: ۥً */
    public static Constructor f16801;

    /* JADX INFO: renamed from: ۦٚ */
    public static C3963 f16811;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16814;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final int[] f16813 = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: ۥْ */
    public static final int[] f16803 = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: ۥٓ */
    public static final int[] f16804 = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: ۥَ */
    public static final int[] f16802 = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: ۥٖ */
    public static final int[] f16805 = {R.attr.drawable};

    /* JADX INFO: renamed from: ۦٗ */
    public static final int[] f16810 = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: ۦۛ */
    public static final C0857 f16812 = new C0857(1813678076, new C0064(21), false);

    /* JADX INFO: renamed from: ۥۖ */
    public static final C0857 f16807 = new C0857(640328417, new C0064(22), false);

    /* JADX INFO: renamed from: ۦٕ */
    public static final C0857 f16809 = new C0857(-903452454, new C0064(23), false);

    /* JADX INFO: renamed from: ۥٙ */
    public static final C0857 f16806 = new C0857(1763392059, new C0064(24), false);

    /* JADX INFO: renamed from: ۥؖ */
    public static final ServiceConnectionC2110 f16800 = new ServiceConnectionC2110(0);

    /* JADX INFO: renamed from: ۥؓ */
    public static final int[] f16799 = {ru.bluecat.yandexmapspatcher.R.attr.colorPrimary};

    /* JADX INFO: renamed from: ۥۧ */
    public static final int[] f16808 = {ru.bluecat.yandexmapspatcher.R.attr.colorPrimaryVariant};

    public /* synthetic */ C5063(int i) {
        this.f16814 = i;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static final Rect m8607(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static Object m8608(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f16801;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f16801 = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static long m8609(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC0671.m1498(i6);
                    C1078.m2274();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return AbstractC0671.m1496(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m8610(C1966 c1966, C5648 c5648, C5362 c5362, int i) {
        c5362.m8979(-549272729);
        new C4441(new long[]{6561726971188585255L, -4189475343205824259L, 5450441234480706465L, -1624937649061086846L, 5852043389027349009L, 5392582393838450926L, 4991729932575085965L, -3878223540626898967L}).toString();
        int i2 = (c5362.m8963(c1966) ? 4 : 2) | i | (c5362.m8977(c5648) ? 32 : 16);
        int i3 = 0;
        boolean z = true;
        if (!c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            c5362.m8982();
        } else if (c1966.f6496) {
            c5362.m8957(441716479);
            new C4441(new long[]{-5131340853532404365L, 527493652844133879L, 9084013452017498477L, -6727123374487490040L, -2071704887205430841L, -2995920125801399901L, -3312917721857222992L}).toString();
            Map map = AbstractC0502.f1819;
            if (map == null) {
                new C4441(new long[]{-8496047775488141207L, -8806557851886061781L, 6110545739658209730L}).toString();
                map = null;
            }
            final int size = map.size();
            new C4441(new long[]{-3082042755815552027L, 6099754709329206879L, -8085065864805401577L, -7269115968047274110L, 5101732729847872569L}).toString();
            if ((i2 & 112) != 32 && !c5362.m8977(c5648)) {
                z = false;
            }
            Object objM8999 = c5362.m8999();
            if (z || objM8999 == C2850.f9517) {
                objM8999 = new C0037(1, c5648, C5648.class, new C4441(new long[]{7118215330042155392L, 5213550017686681814L, 9040407491789317668L}).toString(), new C4441(new long[]{-1294818990922965657L, -1193739291741789909L, -3414154148957555023L, 1649556840825507218L}).toString(), 0, 14);
                c5362.m8987(objM8999);
            }
            AbstractC3801.m6763((InterfaceC4745) ((C2818) objM8999), AbstractC3925.m7034(1025173971, new InterfaceC2609() { // from class: ۦۘؔؑٙ
                @Override // p000.InterfaceC2609
                /* JADX INFO: renamed from: ۦۙ */
                public final Object mo1173(Object obj, Object obj2, Object obj3) {
                    C4417 c4417 = (C4417) obj;
                    C5362 c5363 = (C5362) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    new C4441(new long[]{734141929521396998L, -608815755324974469L, -8329234610048772559L, 4566374326808371068L, -5384097742988192078L, -5815899614931861980L, 6195023934673938586L}).toString();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? c5363.m8963(c4417) : c5363.m8977(c4417) ? 4 : 2;
                    }
                    if (c5363.m9011(iIntValue & 1, (iIntValue & 19) != 18)) {
                        C1911 c1911 = C1298.f4426;
                        InterfaceC0705 interfaceC0705M9381 = AbstractC5568.m9381(AbstractC4410.m7700(AbstractC4410.m7707(AbstractC4410.f14521, 1), 0.0f, c4417.f14564, 1), 20.0f, 0.0f, 20.0f, c4417.f14561 + 10.0f, 2);
                        new C4441(new long[]{-6305738274589595604L, 8213045317944247627L, -4388701286458908338L, -1616161922422328517L, -5737780062188111191L}).toString();
                        int i4 = size;
                        boolean zM8988 = c5363.m8988(i4);
                        Object objM89910 = c5363.m8999();
                        if (zM8988 || objM89910 == C2850.f9517) {
                            objM89910 = new C2742(i4);
                            c5363.m8987(objM89910);
                        }
                        AbstractC4554.m7915(196608, 478, null, null, c1911, null, (InterfaceC4745) objM89910, c5363, null, interfaceC0705M9381, null, false);
                    } else {
                        c5363.m8982();
                    }
                    return C2358.f7817;
                }
            }, c5362), c5362, 48);
            c5362.m9009(false);
        } else {
            c5362.m8957(444172795);
            c5362.m9009(false);
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5115(c1966, c5648, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static String m8611(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(m8629(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(m8629(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۥؚ */
    public static String m8612(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public static final int m8613(InterfaceC0252 interfaceC0252, String str) {
        int iM5127 = AbstractC2765.m5127(interfaceC0252, str);
        if (iM5127 >= 0) {
            return iM5127;
        }
        int columnCount = interfaceC0252.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(interfaceC0252.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + AbstractC0973.m2056(arrayList, null, null, null, null, 63) + ']');
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final void m8614(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m8615(C1966 c1966, C5648 c5648, C5362 c5362, int i) {
        C5362 c5363 = c5362;
        c5363.m8979(1975533752);
        new C4441(new long[]{-314070975235568211L, 4242144276796496672L, 6488235912285900096L, 3618306005237467723L, -8290117361397887490L, -8742403282629294437L, -2795676478981639628L, 3766504879466168589L}).toString();
        int i2 = 2;
        int i3 = i | (c5363.m8963(c1966) ? 4 : 2) | (c5363.m8977(c5648) ? 32 : 16);
        int i4 = 0;
        if (!c5363.m9011(i3 & 1, (i3 & 19) != 18)) {
            c5363.m8982();
        } else if (c1966.f6493) {
            c5363.m8957(-810719938);
            new C4441(new long[]{-3555400635865724545L, -2488153015808404136L, -8443274137970275695L, -3340200430479342524L, 5971638639444836446L, 9599200918192153L}).toString();
            new C4441(new long[]{-5884339302574873914L, 8738886001077456152L, -1223244635206049471L, 150868119549667522L, -8128066295321394414L}).toString();
            boolean z = (i3 & 112) == 32 || c5363.m8977(c5648);
            Object objM8999 = c5363.m8999();
            if (z || objM8999 == C2850.f9517) {
                objM8999 = new C4052(c5648, i2);
                c5363.m8987(objM8999);
            }
            AbstractC4593.m7979((InterfaceC4448) objM8999, AbstractC3925.m7034(-1986130677, new C2310(c5648, i4), c5363), null, AbstractC2765.f9154, AbstractC2765.f9169, null, 0L, 0L, 0L, 0L, null, c5362, 1769520);
            c5363 = c5362;
            c5363.m9009(false);
        } else {
            c5363.m8957(-810062614);
            c5363.m9009(false);
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5115(c1966, c5648, i, 1);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final void m8616(C2247 c2247, C2197 c2197, C5362 c5362, int i) {
        C2247 c2248;
        C2197 c2198;
        C5362 c5363 = c5362;
        c5363.m8979(1974031783);
        new C4441(new long[]{-1806885676199875873L, 8885611405015117180L, -3419980386270567361L, -2387767834193865495L, 3786459697540711166L, -7095150600988068338L, -1288637971683537111L, 4187506996095071687L, -905351955962101531L, 5706074261965417287L, -979862910835586756L, 6016480312610056413L, -2875985188314619766L, -2395767827541183798L, -6569798383561005818L, -1812114117375751382L, -7169976979448785084L}).toString();
        int i2 = i | 18;
        if (c5363.m9011(i2 & 1, (i2 & 19) != 18)) {
            c5363.m8971();
            new C4441(new long[]{4532366570868729732L, 8182514119917152215L, 1575527850344085458L, -7368472386876448239L}).toString();
            int i3 = i & 1;
            C4036 c4036 = C2850.f9517;
            if (i3 == 0 || c5363.m8969()) {
                new C4441(new long[]{-5314114642087960875L, 1475553380641810559L, -2514611299698702605L, -2296140112733744838L, -5218950234779598000L, -7462270317245231186L, -2145597535097489393L, -8697582049179403344L, -4192741740756386456L, -5769916406427054267L, 6667342584735802832L, 6621326226669573682L, 1250790090018901621L, 8024606164677498905L, -4679954403104075481L, -6124684341142903282L}).toString();
                InterfaceC4680 interfaceC4680M4043 = AbstractC2095.m4043(c5363);
                if (interfaceC4680M4043 == null) {
                    throw new IllegalStateException(new C4441(new long[]{6146087220698004806L, 4453157120727050781L, 8787027372162618963L, 3544113413381013944L, -100480674360488665L, 950949473210666203L, 6584827785272041604L, 3905358567529275550L, -7108576560329628836L}).toString().toString());
                }
                C2247 c2249 = (C2247) m8631(AbstractC5041.m8557(C2247.class), interfaceC4680M4043.mo651(), AbstractC1434.m3036(interfaceC4680M4043), AbstractC3804.m6801(c5363));
                new C4441(new long[]{-282688250831168573L, 6413503820554496257L, -6784856123126127509L, -1606491129133338036L, -531492576574697306L, 5607594715228605029L, -8728682997660926251L, 79521196313107988L, 5010289467803396243L, -8953803174847790230L}).toString();
                C2354 c2354M6801 = AbstractC3804.m6801(c5363);
                new C4441(new long[]{683546398166132315L, 1234149413369117189L, 7830225344680476899L, -8698153204902289010L, -3900983107471874617L}).toString();
                boolean zM8963 = c5363.m8963(null) | c5363.m8963(c2354M6801);
                Object objM8999 = c5363.m8999();
                if (zM8963 || objM8999 == c4036) {
                    objM8999 = c2354M6801.m4427(AbstractC5041.m8557(C2197.class), null, null);
                    c5363.m8987(objM8999);
                }
                c2248 = c2249;
                c2198 = (C2197) objM8999;
            } else {
                c5363.m8982();
                c2248 = c2247;
                c2198 = c2197;
            }
            c5363.m8964();
            InterfaceC4367 interfaceC4367M6750 = AbstractC3801.m6750(c2248.f7455, c5363);
            m8653(null, c5363, 0);
            m8610((C1966) interfaceC4367M6750.getValue(), c2248.f7457, c5363, 64);
            MainActivity mainActivity = MainActivity.f411;
            C1489 c1489M5792 = C3133.m5792(AbstractC5537.m9214(), new C4441(new long[]{6316284634191832109L, -2516677405177537111L, 1768409032254825726L, -4373697284878479810L}).toString());
            c1489M5792.m3172("module_generated_version_result", new C4884(23, new C0398(c2248, 3)));
            c1489M5792.m3140((String) c1489M5792.f5057, "module_generated_version_get");
            C0846 c0846M3603 = AbstractC1833.m3603(c5363);
            C4994 c4994 = c2198.f7288;
            while (true) {
                Object value = c4994.getValue();
                if (c4994.m8386(value, C5890.m9722((C5890) value, c0846M3603.m1761() == 0, null, 2))) {
                    break;
                } else {
                    c5363 = c5362;
                }
            }
            new C4441(new long[]{-2403303071242866029L, -3532188942505412913L, 4172394634450773460L, -9161754781622678902L, -1566223048593380282L}).toString();
            boolean zM8964 = c5363.m8963(interfaceC4367M6750) | c5363.m8977(c2248);
            Object objM89910 = c5363.m8999();
            if (zM8964 || objM89910 == c4036) {
                objM89910 = new C0079(20, interfaceC4367M6750, c2248);
                c5363.m8987(objM89910);
            }
            AbstractC4554.m7915(0, 509, null, null, null, null, (InterfaceC4745) objM89910, c5363, c0846M3603, null, null, false);
        } else {
            c5362.m8982();
            c2248 = c2247;
            c2198 = c2197;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4762(i, 12, c2248, c2198);
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final Object m8617(InterfaceC3975 interfaceC3975, InterfaceC4448 interfaceC4448, AbstractC0772 abstractC0772) {
        Object obj;
        AbstractC1311 abstractC1311M9247;
        Object objMo4320;
        C2457 c2457;
        if (((AbstractC5381) interfaceC3975).f17791.f17786) {
            AbstractC5381 abstractC5381 = (AbstractC5381) interfaceC3975;
            if (!abstractC5381.f17791.f17786) {
                AbstractC3480.m6278("visitAncestors called on an unattached node");
            }
            AbstractC5381 abstractC5382 = abstractC5381.f17791.f17780;
            C0605 c0605M9270 = AbstractC5537.m9270(interfaceC3975);
            loop0: while (true) {
                obj = null;
                if (c0605M9270 == null) {
                    break;
                }
                if ((((AbstractC5381) c0605M9270.f2256.f8210).f17782 & 524288) != 0) {
                    while (abstractC5382 != null) {
                        if ((abstractC5382.f17781 & 524288) != 0) {
                            AbstractC5381 abstractC5381M9233 = abstractC5382;
                            C0863 c0863 = null;
                            while (abstractC5381M9233 != null) {
                                if (abstractC5381M9233 instanceof InterfaceC2269) {
                                    obj = abstractC5381M9233;
                                    break loop0;
                                }
                                if ((abstractC5381M9233.f17781 & 524288) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                    int i = 0;
                                    for (AbstractC5381 abstractC5383 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5383 != null; abstractC5383 = abstractC5383.f17783) {
                                        if ((abstractC5383.f17781 & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC5381M9233 = abstractC5383;
                                            } else {
                                                if (c0863 == null) {
                                                    c0863 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (abstractC5381M9233 != null) {
                                                    c0863.m1843(abstractC5381M9233);
                                                    abstractC5381M9233 = null;
                                                }
                                                c0863.m1843(abstractC5383);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC5381M9233 = AbstractC5537.m9233(c0863);
                            }
                        }
                        abstractC5382 = abstractC5382.f17780;
                    }
                }
                c0605M9270 = c0605M9270.m1356();
                abstractC5382 = (c0605M9270 == null || (c2457 = c0605M9270.f2256) == null) ? null : (C1850) c2457.f8202;
            }
            InterfaceC2269 interfaceC2269 = (InterfaceC2269) obj;
            if (interfaceC2269 != null && (objMo4320 = interfaceC2269.mo4320((abstractC1311M9247 = AbstractC5537.m9247(interfaceC3975)), new C5304(2, interfaceC4448, abstractC1311M9247), abstractC0772)) == EnumC2282.f7590) {
                return objMo4320;
            }
        }
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static void m8618(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0980.f3451, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(ru.bluecat.yandexmapspatcher.R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m8643(context, f16808, "Theme.MaterialComponents");
            }
        }
        m8643(context, f16799, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static Intent m8619(AbstractActivityC2747 abstractActivityC2747, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM8626 = m8626(abstractActivityC2747, componentName);
        if (strM8626 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM8626);
        return m8626(abstractActivityC2747, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static void m8620(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0980.f3451, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        C1078.m2272("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static final InterfaceC0705 m8621(InterfaceC0705 interfaceC0705, InterfaceC4745 interfaceC4745) {
        return interfaceC0705.mo1571(new C5776(interfaceC4745));
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static long m8622(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    AbstractC0671.m1498(i6);
                    C1078.m2274();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return AbstractC0671.m1496(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static final long m8623(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static final long m8624(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        EnumC3021 enumC3021 = EnumC3021.NANOSECONDS;
        if (j4 >= 0) {
            return AbstractC4009.m7170(j3, enumC3021);
        }
        EnumC3021 enumC3022 = EnumC3021.MILLISECONDS;
        if (enumC3021.compareTo(enumC3022) >= 0) {
            return C5805.m9618(m8641(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        C4036 c4036 = C5805.f19128;
        return C5805.m9616(AbstractC4009.m7170(j5, enumC3022), AbstractC4009.m7170(j6, enumC3021));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m8625(final C1966 c1966, final C2247 c2247, final String str, final boolean z, EnumC5242 enumC5242, C5362 c5362, final int i) {
        final EnumC5242 enumC5243;
        C3039 c3039;
        C3039 c30310;
        C3039 c30311 = C1298.f4431;
        C3039 c30312 = C1298.f4436;
        C3039 c30313 = C1298.f4428;
        c5362.m8979(1049076972);
        new C4441(new long[]{2796085384769189446L, 6903329560866754047L, 2680571916368926298L, 885608681431253726L, 5018280755909251598L, -4540449547718684644L, -8490860024698259422L, 6551248060000924649L, -4333652802104549916L, -8664866818820860059L, 8495869897507613027L, 5539791612089428161L, 4868445494166619902L, 7640107574475910734L, 5711718925781478952L, 7869872725721240346L, -7581405656190947185L, 5998804970911369717L}).toString();
        int i2 = i | (c5362.m8963(c1966) ? 4 : 2) | (c5362.m8977(c2247) ? 32 : 16) | (c5362.m8963(str) ? 256 : 128) | (c5362.m9006(z) ? 2048 : 1024) | (c5362.m8988(enumC5242.ordinal()) ? 16384 : 8192);
        int i3 = 0;
        if (c5362.m9011(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = c1966.f6495;
            C1808 c1808M1644 = AbstractC0757.m1644();
            Map map = AbstractC4168.f13869;
            C0969 c0969M7811 = AbstractC4489.m7811(0.0f, 400.0f, new C4207(4294967297L), 1);
            C4274 c4274 = C1298.f4421;
            C1931 c1931 = C1931.f6358;
            C4274 c4275 = C1298.f4433;
            if (AbstractC3831.m6874(c4274, c4275)) {
                c30310 = c30311;
                c3039 = c30313;
            } else if (AbstractC3831.m6874(c4274, c4274)) {
                c30310 = c30311;
                c3039 = c30312;
            } else {
                c3039 = c30311;
                c30310 = c3039;
            }
            C1808 c1808M3590 = c1808M1644.m3590(new C1808(new C3650((C3075) null, (C2565) null, new C5388(c3039, new C1749(c1931, i3), c0969M7811), (LinkedHashMap) null, 123)));
            C5521 c5521M1643 = AbstractC0757.m1643(null, 3);
            int i4 = 1;
            C0969 c0969M7812 = AbstractC4489.m7811(0.0f, 400.0f, new C4207(4294967297L), 1);
            C1931 c1932 = C1931.f6385;
            if (!AbstractC3831.m6874(c4274, c4275)) {
                c30313 = AbstractC3831.m6874(c4274, c4274) ? c30312 : c30310;
            }
            C5521 c5521M9204 = c5521M1643.m9204(new C5521(new C3650((C3075) null, (C2565) null, new C5388(c30313, new C1749(c1932, i4), c0969M7812), (LinkedHashMap) null, 123)));
            enumC5243 = enumC5242;
            AbstractC3933.m7078(z2, null, c1808M3590, c5521M9204, null, AbstractC3925.m7034(-736369388, new InterfaceC2609() { // from class: ۥۥؖؒۗ
                @Override // p000.InterfaceC2609
                /* JADX INFO: renamed from: ۦۙ */
                public final Object mo1173(Object obj, Object obj2, Object obj3) {
                    C5362 c5363 = (C5362) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    new C4441(new long[]{-5978661771998414561L, 7465122736355574245L, 6634685788450527177L, 731924043467105511L, -1775778215592187215L, -9048200809808654946L, 9065159507430208433L}).toString();
                    if (c5363.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                        InterfaceC0705 interfaceC0705M9382 = AbstractC5568.m9382(AbstractC5537.m9269(AbstractC5568.m9381(AbstractC4410.f14521, 15.0f, 5.0f, 15.0f, 0.0f, 8), AbstractC0520.m1170(20.0f)), AbstractC2133.m4122(c5363) ? AbstractC3951.f13219 : AbstractC3951.f13216, AbstractC2552.f8518);
                        boolean z3 = z;
                        InterfaceC0705 interfaceC0705M9377 = AbstractC5568.m9377(interfaceC0705M9382, 15.0f, 15.0f, 15.0f, z3 ? 10.0f : 15.0f);
                        new C4441(new long[]{-6754675170313454331L, -6755500195756513982L, 1248390900819980156L, -25965586650760317L, 798442035992555716L, 604463928141753436L, -7113615354629857064L, -4954647279129852579L, -8642709494365818170L, 3003959449553834692L, 5815598375690408123L, -1550584329824464165L, -4086158790786059487L, 885609857223620399L, -553136536844150428L}).toString();
                        C3113 c3113M9197 = AbstractC5501.m9197(AbstractC4225.f14009, C1298.f4443, c5363, 0);
                        new C4441(new long[]{-6691517813787753656L, -6210765631297781542L, 5031501377837677123L, -3030029243206200876L, -890749982544360529L, 8947808525775745150L, -2164880428135343168L, -7841096189017774867L, -2612875679531252032L, -7582560752163392941L, -6332612922892898443L, 71210980426487498L}).toString();
                        int iHashCode = Long.hashCode(c5363.f17657);
                        C2103 c2103M8994 = c5363.m8994();
                        InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5363, interfaceC0705M9377);
                        InterfaceC4576.f15106.getClass();
                        C3709 c3709 = C0849.f3049;
                        new C4441(new long[]{9083146413292735104L, -6716287425861867140L, 6939072353501579499L, 6092221776479005791L, 4399773754461023250L, -1317027420721171253L, -6247331391746894034L, -7093268833074903260L, -5571133940492280101L, -665572260754642670L, 1302227258386492079L, 1369089404429234012L}).toString();
                        c5363.m8983();
                        if (c5363.f17668) {
                            c5363.m9005(c3709);
                        } else {
                            c5363.m8972();
                        }
                        AbstractC0993.m2127(C0849.f3048, c5363, c3113M9197);
                        AbstractC0993.m2127(C0849.f3047, c5363, c2103M8994);
                        AbstractC0993.m2127(C0849.f3053, c5363, Integer.valueOf(iHashCode));
                        AbstractC0993.m2146(c5363, C0849.f3050);
                        AbstractC0993.m2127(C0849.f3052, c5363, interfaceC0705M2161);
                        new C4441(new long[]{-7403447061475954133L, 8777105448297722143L, 5762961439057473436L, 5805911688760497897L, 3437315610519702780L}).toString();
                        new C4441(new long[]{6217929631923209597L, -3763136690432271398L, 591955689701079914L, -6752998741483872344L, 2148933066762979066L, 8823050818723735664L, -1505480712024813760L}).toString();
                        AbstractC0495.m1105(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5363.m8997(AbstractC4957.f16399)).f14550, c5363, 0, 0, 131070);
                        if (z3) {
                            c5363.m8957(1441900660);
                            int i5 = 6;
                            new C4441(new long[]{5944108374415325949L, -3974353231427149969L, -6524682324082959672L, 6046079704395050647L, -3091091549520427212L, -9095374728217609128L}).toString();
                            InterfaceC0705 interfaceC0705M7703 = AbstractC4410.m7703(new C3621(C1298.f4453), 34.0f);
                            new C4441(new long[]{620363523985428450L, 3519540795420663071L, 8957846999885715639L, 8598778791839924831L, 6069206586848999472L}).toString();
                            C2247 c2248 = c2247;
                            boolean zM8977 = c5363.m8977(c2248);
                            Object objM8999 = c5363.m8999();
                            if (zM8977 || objM8999 == C2850.f9517) {
                                objM8999 = new C3991(c2248, 2);
                                c5363.m8987(objM8999);
                            }
                            AbstractC3933.m7096((InterfaceC4448) objM8999, interfaceC0705M7703, false, null, null, null, AbstractC3925.m7034(-82349178, new C3032(i5, enumC5243), c5363), c5363, 805306368, 508);
                            c5363.m9009(false);
                        } else {
                            c5363.m8957(1442360452);
                            c5363.m9009(false);
                        }
                        c5363.m9009(true);
                    } else {
                        c5363.m8982();
                    }
                    return C2358.f7817;
                }
            }, c5362), c5362, 200064);
        } else {
            enumC5243 = enumC5242;
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            final EnumC5242 enumC5244 = enumC5243;
            c5863M8965.f19365 = new InterfaceC5731(c2247, str, z, enumC5244, i) { // from class: ۥۗؓۡۢ

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ EnumC5242 f6925;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ String f6926;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ boolean f6927;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ C2247 f6928;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(65);
                    C5063.m8625(this.f6929, this.f6928, this.f6926, this.f6927, this.f6925, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static String m8626(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final void m8627(C2247 c2247, C5362 c5362, int i) {
        C5362 c5363;
        c5362.m8979(-1724315698);
        new C4441(new long[]{5781361912470869567L, -7073190029683053348L, 7684486899865248465L, 1109689821947895762L, 7701426318237455618L, 2005526144679378889L, 6566484408281248102L, 889769957852816307L, 2938089628982292775L, -4161119872549620480L}).toString();
        int i2 = (c5362.m8977(c2247) ? 4 : 2) | i;
        int i3 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            App app = App.f407;
            C1443 c1443 = AbstractC2776.m5217().f409;
            C1542 c1542 = AbstractC2539.f8453;
            Object obj = c1542.f5218;
            String str = c1542.f5219;
            boolean z = C1443.f4940;
            boolean zBooleanValue = ((Boolean) c1443.m3068(obj, str)).booleanValue();
            new C4441(new long[]{7043252352294060448L, 3011764405920435769L, 1449294138001770103L, 3685638895259642011L, -7569699626579483029L}).toString();
            boolean z2 = (i2 & 14) == 4 || c5362.m8977(c2247);
            Object objM8999 = c5362.m8999();
            if (z2 || objM8999 == C2850.f9517) {
                objM8999 = new C0398(c2247, i3);
                c5362.m8987(objM8999);
            }
            c5363 = c5362;
            AbstractC0949.m1925(ru.bluecat.yandexmapspatcher.R.string.main_notifications_title, ru.bluecat.yandexmapspatcher.R.string.main_notifications_summary, zBooleanValue, null, (InterfaceC4745) objM8999, c5363, 0);
        } else {
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4164(i, 11, c2247);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m8628(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static String m8629(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strM6622 = AbstractC3761.m6622(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM6622), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strM6622.length() + 8 + name2.length() + 1);
            sb.append("<");
            sb.append(strM6622);
            sb.append(" threw ");
            sb.append(name2);
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m8630(C1966 c1966, C5648 c5648, C5362 c5362, int i) {
        C5362 c5363 = c5362;
        c5363.m8979(-1857107343);
        new C4441(new long[]{1400303530326718085L, 608775049711761548L, 5847237381061892746L, -1312193535949078946L, 6189143427723384702L, -4980967700364545476L, 630610190195159246L, 9153864736444533950L}).toString();
        int i2 = i | (c5363.m8963(c1966) ? 4 : 2) | (c5363.m8977(c5648) ? 32 : 16);
        int i3 = 1;
        if (!c5363.m9011(i2 & 1, (i2 & 19) != 18)) {
            c5363.m8982();
        } else if (c1966.f6492) {
            c5363.m8957(-1610988187);
            new C4441(new long[]{649149022786579492L, 5061146729839090702L, -2885632986152215798L, -5013855593973362619L, -2507990348336999525L, -3054712035281118716L, -3282536530469010733L, -5150684617004230610L}).toString();
            new C4441(new long[]{-2675954943779808961L, -6382590199402533495L, 7557839537785960755L, -1449553549963726783L, -1188005050538334488L}).toString();
            boolean z = (i2 & 112) == 32 || c5363.m8977(c5648);
            Object objM8999 = c5363.m8999();
            if (z || objM8999 == C2850.f9517) {
                objM8999 = new C4052(c5648, 3);
                c5363.m8987(objM8999);
            }
            AbstractC4593.m7979((InterfaceC4448) objM8999, AbstractC3925.m7034(-1731620988, new C2310(c5648, i3), c5363), null, AbstractC2765.f9166, AbstractC3925.m7034(-305941473, new C2819(c1966), c5363), null, 0L, 0L, 0L, 0L, null, c5362, 1769520);
            c5363 = c5362;
            c5363.m9009(false);
        } else {
            c5363.m8957(-1610361615);
            c5363.m9009(false);
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5115(c1966, c5648, i, 2);
        }
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static final AbstractC0941 m8631(C3131 c3131, C3160 c3160, AbstractC5760 abstractC5760, C2354 c2354) {
        C1489 c1489 = new C1489(c3160, new C3369(3, c3131, c2354), abstractC5760);
        c3131.m5776();
        String strM5776 = c3131.m5776();
        if (strM5776 != null) {
            return c1489.m3136(c3131, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM5776));
        }
        C1078.m2272("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static void m8632(C3657 c3657, AbstractC4294 abstractC4294) {
        Method method;
        if (c3657 == null || (method = c3657.f12248) == null) {
            return;
        }
        m8637(method, abstractC4294);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static final float m8633(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m8634(C1966 c1966, C2247 c2247, C5362 c5362, int i) {
        c5362.m8979(307292192);
        new C4441(new long[]{1164360278491722432L, -8010899408662135216L, 7141397213788783204L, -6189883670619769809L, 4635344599010838877L, -4386999922228059218L, 990438457168232267L, 829653739020736235L}).toString();
        int i2 = (c5362.m8963(c1966) ? 4 : 2) | i | (c5362.m8977(c2247) ? 32 : 16);
        int i3 = 1;
        int i4 = 0;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            EnumC5242 enumC5242 = c1966.f6494;
            if (enumC5242 == EnumC5242.f17310 || enumC5242 == EnumC5242.f17307) {
                c5362.m8957(1966584637);
                new C4441(new long[]{8539288878726559638L, 3892583597863569452L, 674201605943880718L, -1475198007057356479L, 397890003638447425L, 6494878589815059210L}).toString();
                m8630(c1966, c2247.f7457, c5362, (i2 & 14) | 64);
                new C4441(new long[]{2519274830866153778L, -7136588438232946907L, 7637435373025516758L, 7384495928428245521L, 7510257193736219374L}).toString();
                boolean z = (i2 & 112) == 32 || c5362.m8977(c2247);
                Object objM8999 = c5362.m8999();
                if (z || objM8999 == C2850.f9517) {
                    objM8999 = new C3991(c2247, i4);
                    c5362.m8987(objM8999);
                }
                AbstractC1434.m3045(ru.bluecat.yandexmapspatcher.R.string.main_lspatch_title, ru.bluecat.yandexmapspatcher.R.string.main_lspatch_summary, null, (InterfaceC4448) objM8999, c5362, 0, 4);
                c5362.m9009(false);
            } else {
                c5362.m8957(1966773954);
                c5362.m9009(false);
            }
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0929(c1966, c2247, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static final long m8635(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    /* JADX INFO: renamed from: ۦؖ */
    public static final int m8636(C0739 c0739, Layout layout, C1414 c1414, int i, RectF rectF, InterfaceC3596 interfaceC3596, C4164 c4164, boolean z) {
        C1997[] c1997Arr;
        C1997[] c1997Arr2;
        int i2;
        int iMo4411;
        int i3;
        int i4;
        int iMo4414;
        Bidi bidiCreateLineBidi;
        float fM6901;
        float fM6902;
        float fM6903;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = c0739.f2683;
        int lineStart2 = layout2.getLineStart(i);
        int iM1628 = c0739.m1628(i);
        if (i5 < (iM1628 - lineStart2) * 2) {
            AbstractC3767.m6644("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        C3871 c3871 = new C3871(c0739);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iM1628) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fM6901 = c3871.m6901(lineStart2, z2, z2, true);
                fM6903 = c3871.m6901(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fM6903 = c3871.m6901(lineStart2, false, false, false);
                fM6901 = c3871.m6901(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fM6902 = c3871.m6901(lineStart2, false, false, true);
                    fM6901 = c3871.m6901(lineStart2 + 1, true, true, true);
                } else {
                    fM6901 = c3871.m6901(lineStart2, false, false, false);
                    fM6902 = c3871.m6901(lineStart2 + 1, true, true, false);
                }
                fM6903 = fM6902;
            }
            fArr[i6] = fM6901;
            fArr[i6 + 1] = fM6903;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) c1414.f4871;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iM3012 = c1414.m3012(lineStart3, false);
        int iM2992 = c1414.m2992(iM3012);
        int i7 = lineStart3 - iM2992;
        int i8 = lineEnd2 - iM2992;
        Bidi bidiM3009 = c1414.m3009(iM3012);
        if (bidiM3009 == null || (bidiCreateLineBidi = bidiM3009.createLineBidi(i7, i8)) == null) {
            c1997Arr = new C1997[]{new C1997(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            c1997Arr = new C1997[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                c1997Arr[i9] = new C1997(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        C1803 c3046 = z ? new C3046(0, c1997Arr.length - 1, 1) : new C1803(c1997Arr.length - 1, 0, -1);
        int i11 = c3046.f6006;
        int i12 = c3046.f6005;
        int i13 = c3046.f6004;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            C1997 c1997 = c1997Arr[i11];
            boolean z4 = c1997.f6580;
            int iMo4401 = c1997.f6582;
            int iMo4408 = c1997.f6581;
            float f = z4 ? fArr[((iMo4408 - 1) - lineStart) * 2] : fArr[(iMo4401 - lineStart) * 2];
            float fM8633 = z4 ? m8633(iMo4401, lineStart, fArr) : m8633(iMo4408 - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                c1997Arr2 = c1997Arr;
                if (fM8633 < f2) {
                    iMo4408 = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fM8633) && (!z4 || f2 > f)) {
                        int i15 = iMo4408;
                        int i16 = iMo4401;
                        while (i15 - i16 > 1) {
                            int i17 = (i15 + i16) / 2;
                            float f4 = fArr[(i17 - lineStart) * 2];
                            int i18 = i15;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i15 = i18;
                                i16 = i17;
                            } else {
                                i15 = i17;
                            }
                        }
                        i2 = z4 ? i15 : i16;
                    } else {
                        i2 = iMo4408 - 1;
                    }
                    int iMo4415 = interfaceC3596.mo4414(i2 + 1);
                    if (iMo4415 == -1 || (iMo4411 = interfaceC3596.mo4411(iMo4415)) <= iMo4401) {
                        iMo4408 = -1;
                        break;
                    }
                    if (iMo4415 < iMo4401) {
                        iMo4415 = iMo4401;
                    }
                    if (iMo4411 <= iMo4408) {
                        iMo4408 = iMo4411;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iMo4416 = iMo4415;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iMo4408 - 1) - lineStart) * 2] : fArr[(iMo4416 - lineStart) * 2];
                        rectF2.right = z4 ? m8633(iMo4416, lineStart, fArr) : m8633(iMo4408 - 1, lineStart, fArr);
                        if (((Boolean) c4164.mo219(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iMo4408 = interfaceC3596.mo4408(iMo4408);
                        if (iMo4408 == -1 || iMo4408 <= iMo4401) {
                            iMo4408 = -1;
                            break;
                        }
                        iMo4416 = interfaceC3596.mo4414(iMo4408);
                        if (iMo4416 < iMo4401) {
                            iMo4416 = iMo4401;
                        }
                    }
                } else {
                    iMo4408 = -1;
                    break;
                }
                iMo4401 = iMo4408;
            } else {
                if (fM8633 < f2) {
                    c1997Arr2 = c1997Arr;
                    iMo4401 = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fM8633)) {
                        int i19 = iMo4408;
                        int i20 = iMo4401;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z4 ? i3 : i20;
                    } else {
                        i4 = iMo4401;
                    }
                    int iMo4412 = interfaceC3596.mo4411(i4);
                    if (iMo4412 != -1 && (iMo4414 = interfaceC3596.mo4414(iMo4412)) < iMo4408) {
                        if (iMo4414 >= iMo4401) {
                            iMo4401 = iMo4414;
                        }
                        if (iMo4412 > iMo4408) {
                            iMo4412 = iMo4408;
                        }
                        c1997Arr2 = c1997Arr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iMo4413 = iMo4412;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iMo4413 - 1) - lineStart) * 2] : fArr[(iMo4401 - lineStart) * 2];
                            rectF3.right = z4 ? m8633(iMo4401, lineStart, fArr) : m8633(iMo4413 - 1, lineStart, fArr);
                            if (((Boolean) c4164.mo219(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iMo4401 = interfaceC3596.mo4401(iMo4401);
                            if (iMo4401 != -1 && iMo4401 < iMo4408) {
                                iMo4413 = interfaceC3596.mo4411(iMo4401);
                                if (iMo4413 > iMo4408) {
                                    iMo4413 = iMo4408;
                                }
                            }
                        }
                    } else {
                        c1997Arr2 = c1997Arr;
                    }
                    iMo4401 = -1;
                    break;
                } else {
                    c1997Arr2 = c1997Arr;
                    iMo4401 = -1;
                    break;
                }
            }
            if (iMo4401 >= 0) {
                return iMo4401;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            c1997Arr = c1997Arr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX INFO: renamed from: ۦؗ */
    public static C5606 m8637(Member member, AbstractC4294 abstractC4294) {
        Object c4535;
        boolean zBooleanValue;
        Object c4536;
        int i;
        int[] iArr = AbstractC2776.f9251;
        C1039 c1039 = null;
        if (member != null) {
            boolean zBooleanValue2 = false;
            int i2 = iArr[0];
            if (AbstractC1630.f5457[AbstractC3761.m6632(i2)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c4535 = Boolean.TRUE;
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                if (c4535 instanceof C4535) {
                    c4535 = null;
                }
                Boolean bool = (Boolean) c4535;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                i2 = 2;
            }
            int iM6632 = AbstractC3761.m6632(i2);
            if (iM6632 != 0) {
                if (iM6632 != 1) {
                    C1078.m2275();
                    return null;
                }
                C1078.m2276("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
                return null;
            }
            int i3 = iArr[0];
            if (AbstractC1630.f5457[AbstractC3761.m6632(i3)] == 1) {
                try {
                    XposedBridge.getXposedVersion();
                    c4536 = Boolean.TRUE;
                } catch (Throwable th2) {
                    c4536 = new C4535(th2);
                }
                if (c4536 instanceof C4535) {
                    c4536 = null;
                }
                Boolean bool2 = (Boolean) c4536;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                }
            }
            if (!zBooleanValue2) {
                i3 = 2;
            }
            int iM6633 = AbstractC3761.m6632(i3);
            if (iM6633 != 0) {
                if (iM6633 != 1) {
                    C1078.m2275();
                    return null;
                }
                C1078.m2276("YukiHookAPI cannot support current Hook API or cannot found any available Hook APIs in current environment");
                return null;
            }
            int iM6634 = AbstractC3761.m6632(abstractC4294.mo2633());
            if (iM6634 == 0) {
                i = 50;
            } else if (iM6634 == 1) {
                i = -10000;
            } else {
                if (iM6634 != 2) {
                    C1078.m2275();
                    return null;
                }
                i = 10000;
            }
            c1039 = new C1039(21, new C0101(16, XposedBridge.hookMethod(member, new C5347(abstractC4294, i))));
        }
        return new C5606(c1039);
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final int m8638(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                C1078.m2272("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final void m8639(C1966 c1966, C2247 c2247, C5362 c5362, int i) {
        C5362 c5363;
        c5362.m8979(696423480);
        new C4441(new long[]{-2193506270320139876L, -411694386011628738L, -4379427638835182400L, -4054271635220146550L, -119336639204645832L, 6427878384612413046L, 8486005480636493600L, -3479313731789745640L, 1900479372308950187L, -8512581900991603740L, -6047395838441503056L, -3178782561876088253L, 7964517940477538289L}).toString();
        int i2 = 4;
        int i3 = (c5362.m8963(c1966) ? 4 : 2) | i | (c5362.m8977(c2247) ? 32 : 16);
        int i4 = 1;
        if (c5362.m9011(i3 & 1, (i3 & 19) != 18)) {
            int i5 = (i3 & 14) | 64;
            int i6 = i3 & 112;
            m8640(c1966, c2247, c5362, i5 | i6);
            new C4441(new long[]{-8616183422302218113L, 3536524605727875140L, 4527978162962423393L, -7334170888040914374L, -6283099004792352378L}).toString();
            boolean z = i6 == 32 || c5362.m8977(c2247);
            Object objM8999 = c5362.m8999();
            if (z || objM8999 == C2850.f9517) {
                objM8999 = new C3991(c2247, i4);
                c5362.m8987(objM8999);
            }
            c5363 = c5362;
            AbstractC1434.m3045(ru.bluecat.yandexmapspatcher.R.string.main_search_history_title, ru.bluecat.yandexmapspatcher.R.string.main_search_history_summary, null, (InterfaceC4448) objM8999, c5363, 0, 4);
        } else {
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0929(c1966, c2247, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final void m8640(C1966 c1966, C2247 c2247, C5362 c5362, int i) {
        C5362 c5363;
        c5362.m8979(-2146573744);
        new C4441(new long[]{3590831178559221435L, 8446419247443248926L, 7523312854815440412L, 6420726633186807788L, -120393051385958259L, 8486740440837323067L, -4795216562669097992L, 6182359280428165288L, -3726905327791217587L}).toString();
        int i2 = (c5362.m8963(c1966) ? 4 : 2) | i | (c5362.m8977(c2247) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        int i5 = 5;
        if (!c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            c5363 = c5362;
            c5363.m8982();
        } else if (c1966.f6490) {
            c5362.m8957(-810114654);
            new C4441(new long[]{-5256543883857850337L, 2843989385823568235L, 1618246350237227701L, 3471512604687183003L, -4844520639537268918L, -4290294331496278390L, 4295361433180350628L}).toString();
            C5648 c5648 = c2247.f7457;
            new C4441(new long[]{827591146904992995L, -8461543948415741508L, 7045098970215985802L, 5618974350000332301L, -5403982680935164660L}).toString();
            boolean zM8977 = c5362.m8977(c5648);
            Object objM8999 = c5362.m8999();
            if (zM8977 || objM8999 == C2850.f9517) {
                objM8999 = new C4052(c5648, i3);
                c5362.m8987(objM8999);
            }
            c5363 = c5362;
            AbstractC0186.m425((InterfaceC4448) objM8999, null, AbstractC3925.m7034(1989061342, new C4673(c1966, c5648, c2247, i4), c5362), c5363, 384, 2);
            c5363.m9009(false);
        } else {
            c5363 = c5362;
            c5363.m8957(-806655054);
            c5363.m9009(false);
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0929(c1966, c2247, i, i5);
        }
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final long m8641(long j) {
        if (j < 0) {
            C4036 c4036 = C5805.f19128;
            return C5805.f19127;
        }
        C4036 c4037 = C5805.f19128;
        return C5805.f19126;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static final void m8642(InterfaceC4933 interfaceC4933) {
        AbstractC5537.m9270(interfaceC4933).m1326();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static void m8643(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                C1078.m2272(AbstractC3761.m6629("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static Intent m8644(AbstractActivityC2747 abstractActivityC2747) {
        Intent parentActivityIntent = abstractActivityC2747.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM8626 = m8626(abstractActivityC2747, abstractActivityC2747.getComponentName());
            if (strM8626 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC2747, strM8626);
            try {
                return m8626(abstractActivityC2747, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM8626 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final void m8645(int i, C5362 c5362) {
        c5362.m8979(-1219429265);
        new C4441(new long[]{-2174808453484306244L, -7093503070825108177L, 4272853641757553548L, 6503452305461646015L, 7776591702141326546L, 9087474026868816735L, -1247512402993968139L, 6416532889659017090L}).toString();
        int i2 = 0;
        if (c5362.m9011(i & 1, i != 0)) {
            C1542 c1542 = AbstractC2539.f8452;
            C4681 c4681 = EnumC3528.f11699;
            ArrayList arrayList = new ArrayList(AbstractC5573.m9402(c4681, 10));
            C0084 c0084 = new C0084(i2, c4681);
            while (c0084.hasNext()) {
                EnumC3528 enumC3528 = (EnumC3528) c0084.next();
                arrayList.add(new C0379(enumC3528.f11700, enumC3528.f11701));
            }
            AbstractC2774.m5185(c1542, arrayList, c5362, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4876(i, 9);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final void m8646(C1966 c1966, C2247 c2247, C5362 c5362, int i) {
        c5362.m8979(1434271171);
        new C4441(new long[]{-2780292997287468004L, -3898681541991538878L, 7527678687110683388L, 3683369949502527104L, 2992110307533086365L, -9073010547779726113L, 6300224004233118805L, 6603701366618247035L, 6744686397390209210L, 5743780225790827785L, -8438212819977569458L, 5671385264426257951L, 463261450887141555L}).toString();
        int i2 = (c5362.m8963(c1966) ? 4 : 2) | i | (c5362.m8977(c2247) ? 32 : 16);
        int i3 = 0;
        boolean z = true;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            m8615(c1966, c2247.f7457, c5362, (i2 & 14) | 64);
            App app = App.f407;
            C1443 c1443 = AbstractC2776.m5217().f409;
            C1542 c1542 = AbstractC2539.f8444;
            Object obj = c1542.f5218;
            String str = c1542.f5219;
            boolean z2 = C1443.f4940;
            boolean zBooleanValue = ((Boolean) c1443.m3068(obj, str)).booleanValue();
            new C4441(new long[]{2954523466053432431L, -267147756156152799L, 8409415320182632229L, -2675901031967271498L, 8534067196365614908L}).toString();
            if ((i2 & 112) != 32 && !c5362.m8977(c2247)) {
                z = false;
            }
            Object objM8999 = c5362.m8999();
            if (z || objM8999 == C2850.f9517) {
                objM8999 = new C0398(c2247, i3);
                c5362.m8987(objM8999);
            }
            AbstractC0949.m1925(ru.bluecat.yandexmapspatcher.R.string.main_layer_title, ru.bluecat.yandexmapspatcher.R.string.main_layer_summary, zBooleanValue, null, (InterfaceC4745) objM8999, c5362, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0929(c1966, c2247, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final void m8647(C1966 c1966, C5362 c5362, int i) {
        long j;
        C3963 c3963M4517;
        int i2;
        C5362 c5363 = c5362;
        c5363.m8979(797951898);
        new C4441(new long[]{258340093480287344L, -4053731557389542103L, 8721286480362428733L, 7483385765796839936L, -8871764081397180961L, 9122596776367073976L, 242129077906692938L, 4990642341690947010L, 2966432649591633514L, -7108577655578124683L, 4029645012024140618L}).toString();
        int i3 = i | (c5363.m8963(c1966) ? 4 : 2);
        if (c5363.m9011(i3 & 1, (i3 & 3) != 2)) {
            EnumC5242 enumC5242 = c1966.f6494;
            switch (enumC5242.ordinal()) {
                case 1:
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                case 8:
                case 9:
                    c5363.m8957(-1967360382);
                    c5363.m9009(false);
                    j = AbstractC3951.f13220;
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    c5363.m8957(-1967363392);
                    c5363.m9009(false);
                    j = AbstractC3951.f13213;
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                default:
                    c5363.m8957(-1967359418);
                    new C4441(new long[]{-4462949574668287606L, -6054026752105795124L, 1272225011610085560L}).toString();
                    j = AbstractC2133.m4122(c5363) ? AbstractC3951.f13218 : AbstractC3951.f13217;
                    c5363.m9009(false);
                    break;
            }
            InterfaceC5372 interfaceC5372M4275 = AbstractC2214.m4275(j, null, new C4441(new long[]{2195650654525980547L, -1300493450625925333L, -5693126246244415535L, 198780474105038486L}).toString(), c5363, 384, 10);
            int iOrdinal = enumC5242.ordinal();
            if (iOrdinal == 1 || iOrdinal == 6 || iOrdinal == 8 || iOrdinal == 9) {
                c3963M4517 = AbstractC0993.f3536;
                if (c3963M4517 == null) {
                    C2398 c2398 = new C2398("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i4 = AbstractC0184.f672;
                    C0547 c0547 = new C0547(C1327.f4588);
                    C1115 c1115 = new C1115(0, false);
                    c1115.m2332(12.0f, 2.0f);
                    c1115.m2328(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    c1115.m2336(4.48f, 10.0f, 10.0f, 10.0f);
                    c1115.m2336(10.0f, -4.48f, 10.0f, -10.0f);
                    C0292 c0292 = new C0292(17.52f, 2.0f, 12.0f, 2.0f);
                    ArrayList arrayList = c1115.f3914;
                    arrayList.add(c0292);
                    c1115.m2331();
                    c1115.m2332(10.0f, 17.0f);
                    c1115.m2337(-5.0f, -5.0f);
                    c1115.m2337(1.41f, -1.41f);
                    c1115.m2330(10.0f, 14.17f);
                    c1115.m2337(7.59f, -7.59f);
                    c1115.m2330(19.0f, 8.0f);
                    c1115.m2337(-9.0f, 9.0f);
                    c1115.m2331();
                    C2398.m4516(c2398, arrayList, c0547);
                    c3963M4517 = c2398.m4517();
                    AbstractC0993.f3536 = c3963M4517;
                }
            } else {
                c3963M4517 = f16811;
                if (c3963M4517 == null) {
                    C2398 c2399 = new C2398("Filled.Error", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i5 = AbstractC0184.f672;
                    C0547 c0548 = new C0547(C1327.f4588);
                    C1115 c1116 = new C1115(0, false);
                    c1116.m2332(12.0f, 2.0f);
                    c1116.m2328(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    c1116.m2336(4.48f, 10.0f, 10.0f, 10.0f);
                    c1116.m2336(10.0f, -4.48f, 10.0f, -10.0f);
                    C0292 c0293 = new C0292(17.52f, 2.0f, 12.0f, 2.0f);
                    ArrayList arrayList2 = c1116.f3914;
                    arrayList2.add(c0293);
                    c1116.m2331();
                    c1116.m2332(13.0f, 17.0f);
                    c1116.m2329(-2.0f);
                    c1116.m2335(-2.0f);
                    c1116.m2329(2.0f);
                    c1116.m2335(2.0f);
                    c1116.m2331();
                    c1116.m2332(13.0f, 13.0f);
                    c1116.m2329(-2.0f);
                    c1116.m2330(11.0f, 7.0f);
                    c1116.m2329(2.0f);
                    c1116.m2335(6.0f);
                    c1116.m2331();
                    C2398.m4516(c2399, arrayList2, c0548);
                    c3963M4517 = c2399.m4517();
                    f16811 = c3963M4517;
                }
            }
            C4274 c4274 = C1298.f4423;
            InterfaceC0705 interfaceC0705M9269 = AbstractC5537.m9269(AbstractC5568.m9377(AbstractC4410.f14521, 15.0f, 10.0f, 15.0f, 5.0f), AbstractC0520.m1170(20.0f));
            new C4441(new long[]{-7300900660491385019L, 1777867168240638307L, -7674560973189239322L, 222368535582827881L, -6563748174862072845L}).toString();
            boolean zM8963 = c5363.m8963(interfaceC5372M4275);
            Object objM8999 = c5363.m8999();
            if (zM8963 || objM8999 == C2850.f9517) {
                objM8999 = new C2446(interfaceC5372M4275, 1);
                c5363.m8987(objM8999);
            }
            InterfaceC0705 interfaceC0705M9376 = AbstractC5568.m9376(AbstractC1434.m3037(interfaceC0705M9269, (InterfaceC4745) objM8999), 25.0f);
            new C4441(new long[]{-8984480972506311870L, -819593840406487902L, 5901044845042346870L, 355716306230650052L, 4046384503999110012L, -2487155075277684552L, -5047183743394340586L, -1913230359700331778L, -1110226607505754394L, -8087466846624572985L, 7578251014201972844L, 7190129564093039759L, 7668372497248034864L, -2672800773338095233L}).toString();
            C3668 c3668M6047 = AbstractC3287.m6047(AbstractC4225.f14014, c4274, c5363, 48);
            new C4441(new long[]{-8612265923315017726L, 408334455118093336L, 6317928474701555459L, -5061710002826559836L, 6881374841764724794L, -2725469062575694107L, -4823656504839261261L, 8196013073450859902L, -199668008809850255L, -2972207346650847646L, 6784016523622628778L, -1973523798059608785L}).toString();
            int iHashCode = Long.hashCode(c5363.f17657);
            C2103 c2103M8994 = c5363.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5363, interfaceC0705M9376);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            new C4441(new long[]{-1145980183717027819L, 5332191867757571414L, -8242424435581968787L, 8730904453878787505L, -1184767864141782700L, 2491965759394487783L, -7911479928442971574L, -1206465624465020404L, -662520218855622588L, -3465549987964931354L, 7211381154134767068L, -7315123876542612822L}).toString();
            c5363.m8983();
            if (c5363.f17668) {
                c5363.m9005(c3709);
            } else {
                c5363.m8972();
            }
            C3136 c3136 = C0849.f3048;
            AbstractC0993.m2127(c3136, c5363, c3668M6047);
            C3136 c3137 = C0849.f3047;
            AbstractC0993.m2127(c3137, c5363, c2103M8994);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C3136 c3138 = C0849.f3053;
            AbstractC0993.m2127(c3138, c5363, numValueOf);
            C1931 c1931 = C0849.f3050;
            AbstractC0993.m2146(c5363, c1931);
            C3136 c3139 = C0849.f3052;
            AbstractC0993.m2127(c3139, c5363, interfaceC0705M2161);
            new C4441(new long[]{6005454887201696266L, -4402845596791313958L, -1241234544890849391L, -2030207948038210761L, -3397876121074099386L}).toString();
            new C4441(new long[]{4428563154028602545L, 7379999055504596411L, 203832503123624523L, 5948667155475356676L, 1860806980026001094L, -6323915113319941175L, 976659873812450041L}).toString();
            AbstractC3925.m7041(c3963M4517, null, null, new C4441(new long[]{-7574321722966379924L, -5982365682592616515L, 2619093035165647810L}).toString(), c5363, 27648);
            new C4441(new long[]{5078502666438234095L, 3145973639265219805L, 3315332303476706792L, -8880271192515092272L, 4006068054281884741L, 1642530542336426810L, -6502327183583885000L, 4471156042923641838L, -2725106170211596501L, -5672371548065053723L, 5233280051422549304L, 4738168376586273801L, 1478698072615186183L, 3299921421220049704L, 6174878450403217914L}).toString();
            C3113 c3113M9197 = AbstractC5501.m9197(AbstractC4225.f14009, C1298.f4443, c5363, 0);
            new C4441(new long[]{-3385381840289355379L, 6867241687967321612L, 3498459926734089428L, 8509748568332199127L, 7681295683951430933L, 1834691937132004035L, 6433007775040755881L, 2988389704295174310L, 6092170331133918215L, -3638041966746119693L, -5286111338781817768L, -920967774109029616L}).toString();
            int iHashCode2 = Long.hashCode(c5363.f17657);
            C2103 c2103M8995 = c5363.m8994();
            C4217 c4217 = C4217.f13994;
            InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5363, c4217);
            new C4441(new long[]{-703825022757346431L, -1758419232362598517L, 916032387572056218L, 2267412830978441160L, 2772723570329270901L, -7655853104977893723L, 452007848818231607L, -9110886033141923170L, 109212858658705584L, -5391810400088826126L, 1044238370749822269L, -301817754237765597L}).toString();
            c5363.m8983();
            if (c5363.f17668) {
                c5363.m9005(c3709);
            } else {
                c5363.m8972();
            }
            AbstractC0993.m2127(c3136, c5363, c3113M9197);
            AbstractC0993.m2127(c3137, c5363, c2103M8995);
            AbstractC0993.m2127(c3138, c5363, Integer.valueOf(iHashCode2));
            AbstractC0993.m2146(c5363, c1931);
            AbstractC0993.m2127(c3139, c5363, interfaceC0705M2162);
            new C4441(new long[]{-4399261412396315739L, 2746907274150857933L, 1294287982406876421L, -1079374297159011504L, -7026177666156812242L}).toString();
            new C4441(new long[]{-2965768994390923696L, -7554664583868672694L, -830283561473463831L, 8579068388090758273L, 8859776466293077749L, -6202627664875630739L, 8921112904140016697L, 7763228805613181921L, 6662286218982956592L, 1974019831574270998L, 1283000464988361147L, -2989905958557886693L, 4381383434318939804L, 8048890002897717614L, 3335763180063247728L}).toString();
            switch (enumC5242.ordinal()) {
                case 1:
                case 9:
                    i2 = ru.bluecat.yandexmapspatcher.R.string.status_module_lspatch;
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    i2 = ru.bluecat.yandexmapspatcher.R.string.status_module_not_fully_activated;
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                case 8:
                    i2 = ru.bluecat.yandexmapspatcher.R.string.status_module_is_activated;
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                default:
                    i2 = ru.bluecat.yandexmapspatcher.R.string.status_module_not_activated;
                    break;
            }
            String strM5804 = C3133.m5804(i2, c5363);
            C4216 c4216 = AbstractC4957.f16399;
            AbstractC0495.m1105(strM5804, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5363.m8997(c4216)).f14539, c5362, 0, 0, 131070);
            AbstractC1434.m3048(c5362, AbstractC4410.m7703(c4217, 2.0f));
            AbstractC0495.m1105(C3133.m5786(ru.bluecat.yandexmapspatcher.R.string.status_module_version, new Object[]{new C4441(new long[]{-1821048252324479966L, 7065701647377135496L}).toString(), 394}, c5362), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5362.m8997(c4216)).f14550, c5362, 0, 0, 131070);
            c5363 = c5362;
            if (AbstractC0487.m1036(new C4441(new long[]{-3358404982324519082L, -6131763400278953197L, -6026457488900639945L, 1216099012029560489L}).toString()) == null) {
                c5363.m8957(1991187962);
                c5363.m9009(false);
            } else {
                c5363.m8957(1991187963);
                new C4441(new long[]{-2761249040121320336L, -6177523610423504387L, -3638499625080386942L, -7760331259367693627L, 7387556572151000414L, 9072718069816512145L, -1729048515049132905L, -3823401812479892777L}).toString();
                AbstractC1434.m3048(c5363, AbstractC4410.m7703(c4217, 8.0f));
                PackageInfo packageInfoM1036 = AbstractC0487.m1036(new C4441(new long[]{-6884086918489851802L, -7112902078887067367L, 723234025206548512L, 3776500305919128151L}).toString());
                String str = packageInfoM1036 != null ? packageInfoM1036.versionName : null;
                AbstractC0495.m1105(C3133.m5786(ru.bluecat.yandexmapspatcher.R.string.status_maps_version, new Object[]{str + " (" + AbstractC0487.m1073() + ")"}, c5363), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5363.m8997(c4216)).f14550, c5362, 0, 0, 131070);
                c5363 = c5362;
                c5363.m9009(false);
            }
            c5363.m9009(true);
            c5363.m9009(true);
        } else {
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C2819(c1966, i);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final void m8648(C1966 c1966, C2247 c2247, C5362 c5362, int i) {
        C0929 c0929;
        C5863 c5863M8965;
        int i2;
        String strM5804;
        c5362.m8979(-1058248934);
        new C4441(new long[]{-330561720582419597L, -535607830843923019L, -7746671666607409572L, 7504902454101222426L, 752249672867019638L, 6376224566365755659L, -5100518177130271272L, -5609239669548464041L, -2600512643348168120L, 3719281655962479688L, 7107578257113222956L, -327431827945153121L, 791278342237510061L}).toString();
        int i3 = 2;
        int i4 = (c5362.m8963(c1966) ? 4 : 2) | i | (c5362.m8977(c2247) ? 32 : 16);
        int i5 = 0;
        int i6 = 3;
        if (c5362.m9011(i4 & 1, (i4 & 19) != 18)) {
            EnumC5242 enumC5242 = c1966.f6494;
            if (enumC5242 == EnumC5242.f17308 || enumC5242 == EnumC5242.f17310) {
                c5863M8965 = c5362.m8965();
                if (c5863M8965 == null) {
                    return;
                } else {
                    c0929 = new C0929(c1966, c2247, i, i3);
                }
            } else {
                int iOrdinal = enumC5242.ordinal();
                if (iOrdinal == 0) {
                    i2 = ru.bluecat.yandexmapspatcher.R.string.status_env_not_ready;
                } else if (iOrdinal == 2) {
                    i2 = ru.bluecat.yandexmapspatcher.R.string.status_lspatch_message;
                } else if (iOrdinal == 3) {
                    i2 = ru.bluecat.yandexmapspatcher.R.string.status_no_app_message;
                } else if (iOrdinal == 4) {
                    i2 = ru.bluecat.yandexmapspatcher.R.string.status_low_version_message;
                } else if (iOrdinal == 5) {
                    i2 = ru.bluecat.yandexmapspatcher.R.string.status_sync_message;
                } else if (iOrdinal != 7) {
                    i2 = (iOrdinal == 8 || iOrdinal == 9) ? ru.bluecat.yandexmapspatcher.R.string.status_hooks_missing : ru.bluecat.yandexmapspatcher.R.string.status_module_disabled;
                } else {
                    i2 = ru.bluecat.yandexmapspatcher.R.string.status_no_root_message;
                }
                if (AbstractC2532.f8386[enumC5242.ordinal()] == 2) {
                    c5362.m8957(930049865);
                    new C4441(new long[]{-4719722517823888278L, 7179237882971762234L, 3767220286388202455L}).toString();
                    strM5804 = C3133.m5786(i2, new Object[]{new C4441(new long[]{-4802174729110109351L, -6327702963111998842L}).toString(), 739523110}, c5362);
                    c5362.m9009(false);
                } else {
                    c5362.m8957(930051887);
                    new C4441(new long[]{8745247790405563970L, -7622798832577787798L, -8459346243613727726L}).toString();
                    strM5804 = C3133.m5804(i2, c5362);
                    c5362.m9009(false);
                }
                int i7 = i4 & 112;
                m8625(c1966, c2247, strM5804, AbstractC0246.m513(new EnumC5242[]{EnumC5242.f17303, EnumC5242.f17309, EnumC5242.f17306, EnumC5242.f17307, EnumC5242.f17305}).contains(enumC5242), enumC5242, c5362, (i4 & 14) | 64 | i7);
                new C4441(new long[]{-2999730413495768740L, -1777781345229621481L, -7782120616150989975L, -3819660924221581789L, 3091483225793737789L}).toString();
                boolean z = i7 == 32 || c5362.m8977(c2247);
                Object objM8999 = c5362.m8999();
                if (z || objM8999 == C2850.f9517) {
                    objM8999 = new C0542(c2247, null, i5);
                    c5362.m8987(objM8999);
                }
                AbstractC3925.m7030((InterfaceC5731) objM8999, c5362, enumC5242);
            }
            c5863M8965.f19365 = c0929;
        }
        c5362.m8982();
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c0929 = new C0929(c1966, c2247, i, i6);
            c5863M8965.f19365 = c0929;
        }
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۦۛ */
    public static String m8649(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static String m8650(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, string2.length() != 0 ? "Exception during lenientFormat for ".concat(string2) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + string2.length() + 9);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb3.append((CharSequence) str, i3, iIndexOf);
            sb3.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final boolean m8651(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static final C5906 m8652(C5906 c5906, C5906 c5907, float f) {
        long jM7450 = AbstractC4225.m7450(c5906.f19489, c5907.f19489, f);
        long j = c5906.f19488;
        long j2 = c5907.f19488;
        float fM7993 = AbstractC4593.m7993(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fM7994 = AbstractC4593.m7993(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return new C5906(jM7450, (((long) Float.floatToRawIntBits(fM7993)) << 32) | (((long) Float.floatToRawIntBits(fM7994)) & 4294967295L), AbstractC4593.m7993(c5906.f19487, c5907.f19487, f));
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final void m8653(C5081 c5081, C5362 c5362, int i) {
        c5362.m8979(-2030988197);
        int i2 = 10;
        new C4441(new long[]{1092572973343310968L, -5589389741024566162L, -6266145068997596482L, -3216254614582161154L, 5458515403820838366L, 9028976199784606433L, 2169972462185874316L, -4846779578116818587L, -4330904884381044575L, -8810143147735179544L}).toString();
        int i3 = i | 2;
        int i4 = 0;
        if (c5362.m9011(i3 & 1, (i3 & 3) != 2)) {
            c5362.m8971();
            new C4441(new long[]{6041985575341729981L, 763427785256742284L, 5154702091680189086L}).toString();
            if ((i & 1) == 0 || c5362.m8969()) {
                new C4441(new long[]{-5961255674535288611L, -7543206819018101366L, -946942843964873041L, -5190534061896664168L, -5975487433868198721L, 7747261681239264387L, -6925163447568839242L, 4116164697110795919L, 2409081579555524420L, -6109585971685086120L, 8565513175886551916L, -5487905128037647772L, 1771819552391014547L, -1028551544681021622L, 2407557848984894235L, 7576408371002584066L}).toString();
                InterfaceC4680 interfaceC4680M4043 = AbstractC2095.m4043(c5362);
                if (interfaceC4680M4043 == null) {
                    throw new IllegalStateException(new C4441(new long[]{-1893091294081875013L, -5064697294643813403L, -7559076616493178639L, 9029356188751168397L, -148469256307815865L, -5789082847971766101L, 4382861739191149993L, -9165430097775092288L, 3593358500517213728L}).toString().toString());
                }
                c5081 = (C5081) m8631(AbstractC5041.m8557(C5081.class), interfaceC4680M4043.mo651(), AbstractC1434.m3036(interfaceC4680M4043), AbstractC3804.m6801(c5362));
            } else {
                c5362.m8982();
            }
            C5081 c5082 = c5081;
            c5362.m8964();
            InterfaceC4367 interfaceC4367M6750 = AbstractC3801.m6750(c5082.f16851, c5362);
            if (((C3584) interfaceC4367M6750.getValue()).f11933) {
                c5362.m8957(-1964798794);
                new C4441(new long[]{7663318128157098561L, -7634422819255236052L, -6200052821580991943L, -6645826896599915049L, 4858995604350873848L, 8550124705515038434L, -4247755700414423633L}).toString();
                C3103 c3103 = ((C3584) interfaceC4367M6750.getValue()).f11932;
                new C4441(new long[]{2028936020798882353L, 7531431960958235653L, -8387228729762362123L, -3082277262108038552L, -4099014707532958830L}).toString();
                boolean zM8977 = c5362.m8977(c5082);
                Object objM8999 = c5362.m8999();
                if (zM8977 || objM8999 == C2850.f9517) {
                    C0037 c0037 = new C0037(1, c5082, C5081.class, new C4441(new long[]{2057832293317767437L, 365656915074179882L, -3185680497735202197L}).toString(), new C4441(new long[]{4576097308413443667L, -8634603867403467239L, 5605327403286172531L, -1642718356834814056L}).toString(), 0, 15);
                    c5362.m8987(c0037);
                    objM8999 = c0037;
                }
                AbstractC3801.m6763((InterfaceC4745) ((C2818) objM8999), AbstractC3925.m7034(-803333521, new C4513(i4, c3103, c5082), c5362), c5362, 48);
                c5362.m9009(false);
            } else {
                c5362.m8957(-1961430489);
                c5362.m9009(false);
            }
            c5081 = c5082;
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4164(i, i2, c5081);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۖ */
    public final String m8654(byte[] bArr, int i, int i2) throws C3406 {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.f16814) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw C3406.m6171();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || C3133.m5809(b6)) {
                                    throw C3406.m6171();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw C3406.m6171();
                                    }
                                    b4 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!C3133.m5809(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !C3133.m5809(b7) && !C3133.m5809(b8)) {
                                            int i10 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw C3406.m6171();
                                }
                                if (i3 < i5 - 1) {
                                    throw C3406.m6171();
                                }
                                int i11 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!C3133.m5809(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || C3133.m5809(b9)))) {
                                    throw C3406.m6171();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw C3406.m6171();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw C3406.m6171();
                        }
                        if (b >= -16) {
                            if (i3 < i5 - 1) {
                                throw C3406.m6171();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (C3133.m5809(b3)) {
                            }
                            throw C3406.m6171();
                        }
                        if (i3 < i5 - 2) {
                            throw C3406.m6171();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!C3133.m5809(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw C3406.m6171();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = AbstractC3576.f11899;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw C3406.m6171();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    /* JADX INFO: renamed from: ۦٕ */
    public final int m8655(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 55296;
        switch (this.f16814) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new C5699(i7, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i3);
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new C5699(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j = i;
                long j2 = ((long) i2) + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i20 = 0;
                while (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                    AbstractC1194.m2520(bArr, j, (byte) cCharAt3);
                    i20++;
                    j++;
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt5 = str.charAt(i20);
                        if (cCharAt5 < 128 && j < j2) {
                            AbstractC1194.m2520(bArr, j, (byte) cCharAt5);
                            j++;
                        } else if (cCharAt5 >= c || j > j2 - 2) {
                            int i21 = i20;
                            if ((cCharAt5 >= c2 && 57343 >= cCharAt5) || j > j2 - 3) {
                                if (j > j2 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new C5699(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                }
                                i20 = i21 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        AbstractC1194.m2520(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                        AbstractC1194.m2520(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j3 = j + 3;
                                        AbstractC1194.m2520(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j += 4;
                                        AbstractC1194.m2520(bArr, j3, (byte) ((codePoint2 & 63) | 128));
                                    }
                                } else {
                                    i20 = i21;
                                }
                                throw new C5699(i20 - 1, length2);
                            }
                            AbstractC1194.m2520(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j4 = j + 2;
                            AbstractC1194.m2520(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j += 3;
                            AbstractC1194.m2520(bArr, j4, (byte) ((cCharAt5 & '?') | 128));
                            i20 = i21;
                        } else {
                            long j5 = j + 1;
                            AbstractC1194.m2520(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
                            j += 2;
                            AbstractC1194.m2520(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                            i20 = i20;
                        }
                        i20++;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j;
        }
    }
}
