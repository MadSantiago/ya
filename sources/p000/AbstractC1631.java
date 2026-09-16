package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.text.Spanned;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.KeyEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۥؚۣٙؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1631 {

    /* JADX INFO: renamed from: ۥۣ */
    public static volatile AbstractC3538 f5463;

    /* JADX INFO: renamed from: ۦِ */
    public static final /* synthetic */ int f5467 = 0;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0857 f5461 = new C0857(-378909972, new C0064(10), false);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0857 f5458 = new C0857(848270220, new C0064(11), false);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0857 f5464 = new C0857(1774196846, new C0064(12), false);

    /* JADX INFO: renamed from: ۥُ */
    public static final C0857 f5459 = new C0857(-1486418055, new C0064(13), false);

    /* JADX INFO: renamed from: ۥّ */
    public static final C0857 f5460 = new C0857(1876222626, new C0064(14), false);

    /* JADX INFO: renamed from: ۦۙ */
    public static final C0857 f5470 = new C0857(224454871, new C2463(15), false);

    /* JADX INFO: renamed from: ۥۜ */
    public static final C0857 f5462 = new C0857(1287180583, new C0064(15), false);

    /* JADX INFO: renamed from: ۦٛ */
    public static final C0857 f5468 = new C0857(2011057925, new C0064(16), false);

    /* JADX INFO: renamed from: ۦۗ */
    public static final C1068 f5469 = new C1068(6);

    /* JADX INFO: renamed from: ۦؚ */
    public static final C1657 f5465 = new C1657(0);

    /* JADX INFO: renamed from: ۦٌ */
    public static final C1660 f5466 = new C1660(1);

    /* JADX INFO: renamed from: ۥؓ */
    public static final void m3403(Object[] objArr, int i, int i2) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static List m3404(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C5559 m3405(int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i == -2) {
            if (i2 != 1) {
                return new C4355(1, i2);
            }
            InterfaceC4541.f15007.getClass();
            return new C5559(C0852.f3156);
        }
        if (i == -1) {
            if (i2 == 1) {
                return new C4355(1, 2);
            }
            C1078.m2272("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return i2 == 1 ? new C5559(0) : new C4355(1, i2);
        }
        if (i != Integer.MAX_VALUE) {
            return i2 == 1 ? new C5559(i) : new C4355(i, i2);
        }
        return new C5559(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ۥً */
    public static final String m3406(Object[] objArr, int i, int i2, AbstractC0014 abstractC0014) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC0014) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final boolean m3407(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX WARN: Code duplicated, block: B:156:0x01fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r40v0, types: [ۦ۟ؗٙ۟] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ۦٕٗؕؕ] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, ۦٕٗؕؕ] */
    /* JADX INFO: renamed from: ۥُ */
    public static final void m3408(final InterfaceC0705 interfaceC0705, C1249 c1249, final InterfaceC4745 interfaceC4745, final boolean z, final Map map, final C3564 c3564, final int i, final boolean z2, final int i2, final int i3, final InterfaceC4434 interfaceC4434, final InterfaceC4745 interfaceC4746, C5362 c5362, final int i4, final int i5) {
        C1249 c12410;
        C0165 c0165;
        InterfaceC4448 interfaceC4448;
        InterfaceC4448 interfaceC4449;
        C3869 c3869;
        InterfaceC4745 interfaceC4747;
        ?? r9;
        int i6;
        Object obj;
        Object obj2;
        Object c1498;
        Object obj3;
        Object obj4;
        Object obj5;
        List list;
        c5362.m8979(-2118572703);
        int i7 = (i4 & 6) == 0 ? (c5362.m8963(interfaceC0705) ? 4 : 2) | i4 : i4;
        if ((i4 & 48) == 0) {
            i7 |= c5362.m8963(c1249) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= c5362.m8977(interfaceC4745) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= c5362.m9006(z) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= c5362.m8977(map) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i7 |= c5362.m8963(c3564) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i7 |= c5362.m8988(i) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i7 |= c5362.m9006(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i7 |= c5362.m8988(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i7 |= c5362.m8988(i3) ? 536870912 : 268435456;
        }
        int i8 = (i5 & 6) == 0 ? i5 | (c5362.m8977(interfaceC4434) ? 4 : 2) : i5;
        if ((i5 & 48) == 0) {
            i8 |= c5362.m8977(null) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i8 |= c5362.m8977(null) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 |= c5362.m8977(interfaceC4746) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= (32768 & i5) == 0 ? c5362.m8963(null) : c5362.m8977(null) ? 16384 : 8192;
        }
        if (c5362.m9011(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean zM7176 = AbstractC4009.m7176(c1249);
            C4036 c4036 = C2850.f9517;
            if (zM7176) {
                c5362.m8957(145641571);
                boolean z3 = (i7 & 112) == 32;
                Object objM8999 = c5362.m8999();
                Object obj6 = objM8999;
                if (z3 || objM8999 == c4036) {
                    C0165 c0166 = new C0165(c1249);
                    c5362.m8987(c0166);
                    obj6 = c0166;
                }
                c5362.m9009(false);
                c0165 = (C0165) obj6;
            } else {
                c5362.m8957(145707228);
                c5362.m9009(false);
                c0165 = null;
            }
            if (AbstractC4009.m7176(c1249)) {
                c5362.m8957(145905443);
                boolean zM8963 = ((i7 & 112) == 32) | c5362.m8963(c0165);
                Object objM89910 = c5362.m8999();
                Object obj7 = objM89910;
                if (zM8963 || objM89910 == c4036) {
                    C1225 c1225 = new C1225(4, c0165, c1249);
                    c5362.m8987(c1225);
                    obj7 = c1225;
                }
                interfaceC4448 = (InterfaceC4448) obj7;
                c5362.m9009(false);
            } else {
                c5362.m8957(146002721);
                boolean z4 = (i7 & 112) == 32;
                Object objM89911 = c5362.m8999();
                Object obj8 = objM89911;
                if (z4 || objM89911 == c4036) {
                    C0101 c0101 = new C0101(5, c1249);
                    c5362.m8987(c0101);
                    obj8 = c0101;
                }
                interfaceC4448 = (InterfaceC4448) obj8;
                c5362.m9009(false);
            }
            if (z) {
                if (map != null) {
                    C3869 c38610 = AbstractC3044.f10238;
                    if (map.isEmpty()) {
                        interfaceC4449 = interfaceC4448;
                        c3869 = AbstractC3044.f10238;
                    } else {
                        int length = c1249.f4307.length();
                        List list2 = c1249.f4308;
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList(list2.size());
                            int size = list2.size();
                            int i9 = 0;
                            while (i9 < size) {
                                List list3 = list2;
                                C2331 c2331 = (C2331) list2.get(i9);
                                int i10 = size;
                                Object obj9 = c2331.f7719;
                                int i11 = i9;
                                int i12 = c2331.f7717;
                                int i13 = c2331.f7718;
                                InterfaceC4448 interfaceC44410 = interfaceC4448;
                                String str = c2331.f7720;
                                if ((obj9 instanceof C3435) && "androidx.compose.foundation.text.inlineContent".equals(str) && AbstractC5556.m9310(0, length, i13, i12)) {
                                    arrayList.add(new C2331(i13, i12, ((C3435) c2331.f7719).f11405, str));
                                }
                                i9 = i11 + 1;
                                size = i10;
                                list2 = list3;
                                interfaceC4448 = interfaceC44410;
                            }
                            interfaceC4449 = interfaceC4448;
                            list = arrayList;
                        } else {
                            interfaceC4449 = interfaceC4448;
                            list = C2340.f7777;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = list.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            if (map.get(((C2331) list.get(i14)).f7719) != null) {
                                C0178.m382();
                                return;
                            }
                        }
                        c3869 = new C3869(arrayList2, arrayList3);
                    }
                } else {
                    interfaceC4449 = interfaceC4448;
                    c3869 = AbstractC3044.f10238;
                }
                interfaceC4747 = null;
            } else {
                interfaceC4449 = interfaceC4448;
                interfaceC4747 = null;
                c3869 = new C3869(null, null);
            }
            List list4 = (List) c3869.f12915;
            List list5 = (List) c3869.f12914;
            if (z) {
                c5362.m8957(146318828);
                Object objM89912 = c5362.m8999();
                if (objM89912 == c4036) {
                    obj5 = objM89912;
                    C4852 c4852M5183 = AbstractC2774.m5183(interfaceC4747);
                    c5362.m8987(c4852M5183);
                    obj5 = c4852M5183;
                }
                obj5 = objM89912;
                c5362.m9009(false);
                r9 = (InterfaceC4367) obj5;
            } else {
                c5362.m8957(146406588);
                c5362.m9009(false);
                r9 = interfaceC4747;
            }
            if (z) {
                c5362.m8957(146499837);
                boolean zM8964 = c5362.m8963(r9);
                Object objM89913 = c5362.m8999();
                if (zM8964 || objM89913 == c4036) {
                    C2136 c2136 = new C2136(r9, 2);
                    c5362.m8987(c2136);
                    obj4 = c2136;
                } else {
                    obj4 = objM89913;
                }
                interfaceC4747 = (InterfaceC4745) obj4;
                c5362.m9009(false);
            } else {
                c5362.m8957(146571260);
                c5362.m9009(false);
            }
            InterfaceC4745 interfaceC4748 = interfaceC4747;
            int i15 = (i7 >> 3) & 14;
            AbstractC3616.m6446(c1249, c3564, interfaceC4434, list4, c5362);
            C1249 c12411 = (C1249) interfaceC4449.mo449();
            boolean zM8977 = ((i7 & 896) == 256) | c5362.m8977(c0165);
            Object objM89914 = c5362.m8999();
            if (zM8977 || objM89914 == c4036) {
                i6 = 0;
                C3908 c3908 = new C3908(c0165, interfaceC4745, i6);
                c5362.m8987(c3908);
                obj = c3908;
            } else {
                i6 = 0;
                obj = objM89914;
            }
            ?? r5 = r9;
            ?? r2 = i6;
            InterfaceC0705 interfaceC0705M3431 = m3431(interfaceC0705, c12411, c3564, (InterfaceC4745) obj, i, z2, i2, i3, interfaceC4434, list4, interfaceC4748, interfaceC4746);
            if (z) {
                c5362.m8957(147927697);
                boolean zM8978 = c5362.m8977(c0165);
                Object objM89915 = c5362.m8999();
                if (zM8978 || objM89915 == c4036) {
                    obj2 = objM89915;
                    C1824 c1824 = new C1824(c0165, 1);
                    c5362.m8987(c1824);
                    obj2 = c1824;
                }
                InterfaceC4448 interfaceC44411 = (InterfaceC4448) obj2;
                boolean zM8965 = c5362.m8963(r5);
                Object objM89916 = c5362.m8999();
                Object obj10 = objM89916;
                if (zM8965 || objM89916 == c4036) {
                    C0681 c0681 = new C0681(r5, 2);
                    c5362.m8987(c0681);
                    obj10 = c0681;
                }
                c1498 = new C1498(1, interfaceC44411, (InterfaceC4448) obj10);
                c5362.m9009(r2);
            } else {
                c5362.m8957(147750935);
                boolean zM8979 = c5362.m8977(c0165);
                Object objM89917 = c5362.m8999();
                if (zM8979 || objM89917 == c4036) {
                    obj3 = objM89917;
                    C1824 c1825 = new C1824(c0165, r2 == true ? 1 : 0);
                    c5362.m8987(c1825);
                    obj3 = c1825;
                }
                c1498 = new C3227((InterfaceC4448) obj3, r2 == true ? 1 : 0);
                c5362.m9009(r2);
            }
            int iHashCode = Long.hashCode(c5362.f17657);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M3431);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, c1498);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
            AbstractC0993.m2146(c5362, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            if (c0165 == null) {
                c5362.m8957(-433557001);
            } else {
                c5362.m8957(-291080374);
                c0165.m351(r2 == true ? 1 : 0, c5362);
            }
            c5362.m9009(r2);
            if (list5 == null) {
                c5362.m8957(-433506223);
                c5362.m9009(r2);
                c12410 = c1249;
            } else {
                c5362.m8957(-433506222);
                c12410 = c1249;
                AbstractC3044.m5651(c12410, list5, c5362, i15);
                c5362.m9009(r2);
            }
            c5362.m9009(true);
        } else {
            c12410 = c1249;
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            final C1249 c12412 = c12410;
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥٕؒؗۨ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj11, Object obj12) {
                    ((Integer) obj12).getClass();
                    int iM6835 = AbstractC3831.m6835(i4 | 1);
                    int iM6836 = AbstractC3831.m6835(i5);
                    AbstractC1631.m3408(interfaceC0705, c12412, interfaceC4745, z, map, c3564, i, z2, i2, i3, interfaceC4434, interfaceC4746, (C5362) obj11, iM6835, iM6836);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final void m3409(final C5745 c5745, final InterfaceC4745 interfaceC4745, final InterfaceC0705 interfaceC0705, boolean z, C3564 c3564, final InterfaceC5731 interfaceC5731, C2316 c2316, final C2826 c2826, final C0163 c0163, final boolean z2, int i, int i2, final InterfaceC2864 interfaceC2864, final C2154 c2154, C5362 c5362, final int i3) {
        C5362 c5363;
        final boolean z3;
        final C3564 c3565;
        final C2316 c2317;
        final int i4;
        final int i5;
        C3564 c3566;
        int i6;
        int i7;
        C2316 c2318;
        boolean z4;
        c5362.m8979(2057288437);
        int i8 = i3 | (c5362.m8963(c5745) ? 4 : 2) | (c5362.m8963(interfaceC0705) ? 256 : 128) | 114912256;
        if (c5362.m9011(i8 & 1, ((i8 & 306783379) == 306783378 && (((c5362.m8963(c0163) ? (char) 0 : (char) 0) | 28086) & 306783379) == 306783378 && (((c5362.m8963(c2154) ? (char) 256 : (char) 128) | ((c5362.m8963(interfaceC2864) ? ' ' : (char) 16) | 6)) & 147) == 146) ? false : true)) {
            c5362.m8971();
            if ((i3 & 1) == 0 || c5362.m8969()) {
                c3566 = (C3564) c5362.m8997(AbstractC0495.f1787);
                C2316 c2319 = C1298.f4444;
                i6 = z2 ? 1 : Integer.MAX_VALUE;
                i7 = 1;
                c2318 = c2319;
                z4 = true;
            } else {
                c5362.m8982();
                z4 = z;
                c3566 = c3564;
                c2318 = c2316;
                i6 = i;
                i7 = i2;
            }
            c5362.m8964();
            c5362.m8957(-502250010);
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = new C2243();
                c5362.m8987(objM8999);
            }
            C2243 c2243 = (C2243) objM8999;
            c5362.m9009(false);
            c5362.m8957(1369277167);
            long jM6359 = c3566.m6359();
            if (jM6359 == 16) {
                boolean zBooleanValue = ((Boolean) AbstractC0186.m433(c2243, c5362, 0).getValue()).booleanValue();
                if (z4) {
                    jM6359 = zBooleanValue ? c2154.f7092 : c2154.f7089;
                } else {
                    jM6359 = c2154.f7076;
                }
            }
            long j = jM6359;
            c5362.m9009(false);
            int i9 = i7;
            c5363 = c5362;
            C4773.m8137(AbstractC4457.f14701.mo4313(c2154.f7108), AbstractC3925.m7034(-2094276683, new C2578(interfaceC0705, c2154, c5745, interfaceC4745, z4, c3566.m6360(new C3564(j, 0L, null, 0L, 0, 0L, null, null, 16777214)), c2826, c0163, z2, i6, i9, c2318, c2243, interfaceC5731, interfaceC2864), c5363), c5363, 56);
            z3 = z4;
            c2317 = c2318;
            c3565 = c3566;
            i5 = i9;
            i4 = i6;
        } else {
            c5363 = c5362;
            c5363.m8982();
            z3 = z;
            c3565 = c3564;
            c2317 = c2316;
            i4 = i;
            i5 = i2;
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(interfaceC4745, interfaceC0705, z3, c3565, interfaceC5731, c2317, c2826, c0163, z2, i4, i5, interfaceC2864, c2154, i3) { // from class: ۦٍٍؐؔ

                /* JADX INFO: renamed from: ۥؓ */
                public final /* synthetic */ InterfaceC2864 f10018;

                /* JADX INFO: renamed from: ۥؖ */
                public final /* synthetic */ int f10019;

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ C3564 f10020;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ InterfaceC0705 f10021;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ boolean f10022;

                /* JADX INFO: renamed from: ۥٖ */
                public final /* synthetic */ InterfaceC5731 f10023;

                /* JADX INFO: renamed from: ۥٙ */
                public final /* synthetic */ int f10024;

                /* JADX INFO: renamed from: ۥۖ */
                public final /* synthetic */ C0163 f10025;

                /* JADX INFO: renamed from: ۥۧ */
                public final /* synthetic */ C2154 f10026;

                /* JADX INFO: renamed from: ۦٕ */
                public final /* synthetic */ boolean f10027;

                /* JADX INFO: renamed from: ۦٗ */
                public final /* synthetic */ C2316 f10028;

                /* JADX INFO: renamed from: ۦۛ */
                public final /* synthetic */ C2826 f10029;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC4745 f10030;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(805306417);
                    AbstractC1631.m3409(this.f10031, this.f10030, this.f10021, this.f10022, this.f10020, this.f10023, this.f10028, this.f10029, this.f10025, this.f10027, this.f10024, this.f10019, this.f10018, this.f10026, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public static App m3410() {
        App app = App.f407;
        if (app != null) {
            return app;
        }
        C1078.m2276("App is dead, You cannot call to appContext");
        return null;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final C2354 m3411(AbstractActivityC2747 abstractActivityC2747) {
        C1414 c1414 = C1397.f4778;
        if (c1414 != null) {
            return (C2354) ((C1489) c1414.f4869).f5056;
        }
        C1078.m2276("KoinApplication has not been started");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ۥٍٍُؑ, ۦۤؗٗٔ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: ۥٕ */
    public static final ArrayList m3412(C3222 c3222, int i, Integer num) {
        ?? c0931 = new C0931(c3222);
        i = c3222.m5916(i);
        C4356 c4356M5921 = c3222.m5921(i);
        while (i >= 0) {
            c0931.m9494(c3222.m5927(i), c3222.m5928(i) ? c3222.m5931(c3222.f10824, i) : C2850.f9517, c3222.f10826.m4874(i), num);
            if (i >= 0) {
                C4356 c4356 = c4356M5921;
                c4356M5921 = c3222.m5921(i);
                i = c3222.m5916(i);
                num = c4356;
            } else {
                num = c4356M5921;
            }
        }
        return (ArrayList) c0931.f18660;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static boolean m3413(Context context, int i) {
        if (m3417(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C3225 c3225M5951 = C3225.m5951(context);
                if (packageInfo != null) {
                    if (!C3225.m5952(packageInfo, false)) {
                        if (C3225.m5952(packageInfo, true)) {
                            if (!AbstractC2292.m4347((Context) c3225M5951.f10839)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static InterfaceC3953 m3414(XmlResourceParser xmlResourceParser, Resources resources) throws Throwable {
        int next;
        int i;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m3421(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0293.f1080);
        int i2 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i3 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0293.f1077);
                        int i4 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i6 = typedArrayObtainAttributes2.getInt(i5, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i7, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i7);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m3421(xmlResourceParser);
                        }
                        arrayList.add(new C0920(string7, i4, z, string6, i6, resourceId2));
                    } else {
                        m3421(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C2293((C0920[]) arrayList.toArray(new C0920[0]));
        }
        List listM3404 = m3404(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i3) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0293.f1082);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i2);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i3) {
                            m3421(xmlResourceParser);
                        }
                        try {
                            typedArray = typedArrayObtainAttributes3;
                            try {
                                C0223 c0223 = new C0223(string, string2, string8, listM3404, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(c0223);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = typedArrayObtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                m3421(xmlResourceParser);
                i3 = i3;
                integer = integer;
                i = 2;
                i2 = 0;
            }
        }
        int i8 = integer;
        if (!arrayList2.isEmpty()) {
            return new C2924(arrayList2, i8, integer2, string5);
        }
        if (string3 == null) {
            C1078.m2272("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new C0223(string, string2, string3, listM3404, null, null));
        if (string4 != null) {
            arrayList2.add(new C0223(string, string2, string4, listM3404, null, null));
        }
        return new C2924(arrayList2, i8, integer2, string5);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final ArrayList m3415(List list, InterfaceC4448 interfaceC4448) {
        C4360 c4360;
        if (!((Boolean) interfaceC4448.mo449()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1827 interfaceC1827 = (InterfaceC1827) list.get(i);
            C5017 c5017 = ((C1317) interfaceC1827.mo570()).f4538;
            C0165 c0165 = (C0165) c5017.f16600;
            C2331 c2331 = (C2331) c5017.f16599;
            C3828 c3828 = (C3828) c0165.f622.getValue();
            if (c3828 == null) {
                c4360 = new C4360(0, 0, new C2971(15));
            } else {
                C2331 c2331M349 = C0165.m349(c2331, c3828);
                if (c2331M349 == null) {
                    c4360 = new C4360(0, 0, new C2971(16));
                } else {
                    C4730 c4730M5141 = AbstractC2765.m5141(c3828.m6830(c2331M349.f7718, c2331M349.f7717).m1908());
                    c4360 = new C4360(c4730M5141.f15610 - c4730M5141.f15612, c4730M5141.f15613 - c4730M5141.f15611, new C0463(11, c4730M5141));
                }
            }
            int i2 = c4360.f14362;
            int i3 = c4360.f14361;
            arrayList.add(new C3869(interfaceC1827.mo3597(C5063.m8609(i2, i2, i3, i3)), (InterfaceC4448) c4360.f14360));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0108  */
    /* JADX WARN: Code duplicated, block: B:103:0x0114  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x0164  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101  */
    /* JADX WARN: Code duplicated, block: B:97:0x0103  */
    /* JADX WARN: Code duplicated, block: B:99:0x0106  */
    /* JADX INFO: renamed from: ۥۗ */
    public static final void m3416(final String str, final InterfaceC0705 interfaceC0705, final C3564 c3564, int i, boolean z, final int i2, int i3, C5362 c5362, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean zM8977;
        int i14;
        boolean z3;
        final int i15;
        final boolean z4;
        final int i16;
        C5863 c5863M8965;
        boolean z5;
        int i17;
        Executor executor;
        boolean z6;
        C3709 c3709;
        int i18;
        c5362.m8979(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (c5362.m8963(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c5362.m8963(interfaceC0705) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c5362.m8963(c3564) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= c5362.m8977(null) ? 2048 : 1024;
        }
        int i19 = i5 & 16;
        if (i19 == 0) {
            if ((i4 & 24576) == 0) {
                i7 = i;
                i6 |= c5362.m8988(i7) ? 16384 : 8192;
            }
            i8 = i5 & 32;
            if (i8 != 0) {
                if ((196608 & i4) == 0) {
                    z2 = z;
                    if (c5362.m9006(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i6 |= i9;
                }
                if ((1572864 & i4) == 0) {
                    if (c5362.m8988(i2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i6 |= i18;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    if ((12582912 & i4) == 0) {
                        i11 = i3;
                        if (c5362.m8988(i11)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i6 |= i12;
                    }
                    i13 = 100663296 | i6;
                    if ((i5 & 512) != 0) {
                        i13 = i6 | 905969664;
                    } else if ((805306368 & i4) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zM8977 = c5362.m8963(null);
                        } else {
                            zM8977 = c5362.m8977(null);
                        }
                        if (zM8977) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i13 |= i14;
                    }
                    if ((306783379 & i13) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c5362.m9011(i13 & 1, z3)) {
                        if (i19 != 0) {
                            i7 = 1;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i11;
                        }
                        AbstractC5568.m9371(i17, i2);
                        if (c5362.m8997(AbstractC1286.f4392) == null) {
                            C0178.m382();
                            return;
                        }
                        c5362.m8957(356914239);
                        c5362.m9009(false);
                        InterfaceC4434 interfaceC4434 = (InterfaceC4434) c5362.m8997(AbstractC2853.f9553);
                        executor = (Executor) c5362.m8997(AbstractC3616.f12051);
                        if (executor == null && AbstractC3616.m6445(str.length())) {
                            c5362.m8957(1254298614);
                            try {
                                executor.execute(new RunnableC4991(c3564, (EnumC2459) c5362.m8997(AbstractC2853.f9555), str, (InterfaceC2880) c5362.m8997(AbstractC2853.f9544), interfaceC4434, 0));
                            } catch (RejectedExecutionException unused) {
                            }
                            z6 = false;
                            c5362.m9009(false);
                        } else {
                            z6 = false;
                            c5362.m8957(1255914055);
                            c5362.m9009(false);
                        }
                        c5362.m8957(357875859);
                        c5362.m9009(z6);
                        InterfaceC0705 interfaceC0705Mo1571 = interfaceC0705.mo1571(new C5399(str, c3564, interfaceC4434, i7, z5, i2, i17));
                        C2480 c2480 = C2480.f8264;
                        int iHashCode = Long.hashCode(c5362.f17657);
                        InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705Mo1571);
                        C2103 c2103M8994 = c5362.m8994();
                        InterfaceC4576.f15106.getClass();
                        c3709 = C0849.f3049;
                        c5362.m8983();
                        if (c5362.f17668) {
                            c5362.m9005(c3709);
                        } else {
                            c5362.m8972();
                        }
                        AbstractC0993.m2127(C0849.f3048, c5362, c2480);
                        AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                        AbstractC0993.m2146(c5362, C0849.f3050);
                        AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                        AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                        c5362.m9009(true);
                        i15 = i7;
                        z4 = z5;
                        i16 = i17;
                    } else {
                        c5362.m8982();
                        i15 = i7;
                        z4 = z2;
                        i16 = i11;
                    }
                    c5863M8965 = c5362.m8965();
                    if (c5863M8965 != null) {
                        c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦ۟ؑٙۗ
                            @Override // p000.InterfaceC5731
                            /* JADX INFO: renamed from: ۥۜ */
                            public final Object mo219(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC1631.m3416(str, interfaceC0705, c3564, i15, z4, i2, i16, (C5362) obj, AbstractC3831.m6835(i4 | 1), i5);
                                return C2358.f7817;
                            }
                        };
                    }
                }
                i6 |= 12582912;
                i11 = i3;
                i13 = 100663296 | i6;
                if ((i5 & 512) != 0) {
                    i13 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zM8977 = c5362.m8963(null);
                    } else {
                        zM8977 = c5362.m8977(null);
                    }
                    if (zM8977) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i13 |= i14;
                }
                if ((306783379 & i13) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c5362.m9011(i13 & 1, z3)) {
                    if (i19 != 0) {
                        i7 = 1;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i11;
                    }
                    AbstractC5568.m9371(i17, i2);
                    if (c5362.m8997(AbstractC1286.f4392) == null) {
                        C0178.m382();
                        return;
                    }
                    c5362.m8957(356914239);
                    c5362.m9009(false);
                    InterfaceC4434 interfaceC4435 = (InterfaceC4434) c5362.m8997(AbstractC2853.f9553);
                    executor = (Executor) c5362.m8997(AbstractC3616.f12051);
                    if (executor == null) {
                        z6 = false;
                        c5362.m8957(1255914055);
                        c5362.m9009(false);
                    } else {
                        z6 = false;
                        c5362.m8957(1255914055);
                        c5362.m9009(false);
                    }
                    c5362.m8957(357875859);
                    c5362.m9009(z6);
                    InterfaceC0705 interfaceC0705Mo1572 = interfaceC0705.mo1571(new C5399(str, c3564, interfaceC4435, i7, z5, i2, i17));
                    C2480 c2481 = C2480.f8264;
                    int iHashCode2 = Long.hashCode(c5362.f17657);
                    InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5362, interfaceC0705Mo1572);
                    C2103 c2103M8995 = c5362.m8994();
                    InterfaceC4576.f15106.getClass();
                    c3709 = C0849.f3049;
                    c5362.m8983();
                    if (c5362.f17668) {
                        c5362.m9005(c3709);
                    } else {
                        c5362.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5362, c2481);
                    AbstractC0993.m2127(C0849.f3047, c5362, c2103M8995);
                    AbstractC0993.m2146(c5362, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2162);
                    AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode2));
                    c5362.m9009(true);
                    i15 = i7;
                    z4 = z5;
                    i16 = i17;
                } else {
                    c5362.m8982();
                    i15 = i7;
                    z4 = z2;
                    i16 = i11;
                }
                c5863M8965 = c5362.m8965();
                if (c5863M8965 != null) {
                    c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦ۟ؑٙۗ
                        @Override // p000.InterfaceC5731
                        /* JADX INFO: renamed from: ۥۜ */
                        public final Object mo219(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC1631.m3416(str, interfaceC0705, c3564, i15, z4, i2, i16, (C5362) obj, AbstractC3831.m6835(i4 | 1), i5);
                            return C2358.f7817;
                        }
                    };
                }
            }
            i6 |= 196608;
            z2 = z;
            if ((1572864 & i4) == 0) {
                if (c5362.m8988(i2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i6 |= i18;
            }
            i10 = i5 & 128;
            if (i10 != 0) {
                if ((12582912 & i4) == 0) {
                    i11 = i3;
                    if (c5362.m8988(i11)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
                i13 = 100663296 | i6;
                if ((i5 & 512) != 0) {
                    i13 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zM8977 = c5362.m8963(null);
                    } else {
                        zM8977 = c5362.m8977(null);
                    }
                    if (zM8977) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i13 |= i14;
                }
                if ((306783379 & i13) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c5362.m9011(i13 & 1, z3)) {
                    if (i19 != 0) {
                        i7 = 1;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i11;
                    }
                    AbstractC5568.m9371(i17, i2);
                    if (c5362.m8997(AbstractC1286.f4392) == null) {
                        C0178.m382();
                        return;
                    }
                    c5362.m8957(356914239);
                    c5362.m9009(false);
                    InterfaceC4434 interfaceC4436 = (InterfaceC4434) c5362.m8997(AbstractC2853.f9553);
                    executor = (Executor) c5362.m8997(AbstractC3616.f12051);
                    if (executor == null) {
                        z6 = false;
                        c5362.m8957(1255914055);
                        c5362.m9009(false);
                    } else {
                        z6 = false;
                        c5362.m8957(1255914055);
                        c5362.m9009(false);
                    }
                    c5362.m8957(357875859);
                    c5362.m9009(z6);
                    InterfaceC0705 interfaceC0705Mo1573 = interfaceC0705.mo1571(new C5399(str, c3564, interfaceC4436, i7, z5, i2, i17));
                    C2480 c2482 = C2480.f8264;
                    int iHashCode3 = Long.hashCode(c5362.f17657);
                    InterfaceC0705 interfaceC0705M2163 = AbstractC0993.m2161(c5362, interfaceC0705Mo1573);
                    C2103 c2103M8996 = c5362.m8994();
                    InterfaceC4576.f15106.getClass();
                    c3709 = C0849.f3049;
                    c5362.m8983();
                    if (c5362.f17668) {
                        c5362.m9005(c3709);
                    } else {
                        c5362.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5362, c2482);
                    AbstractC0993.m2127(C0849.f3047, c5362, c2103M8996);
                    AbstractC0993.m2146(c5362, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2163);
                    AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode3));
                    c5362.m9009(true);
                    i15 = i7;
                    z4 = z5;
                    i16 = i17;
                } else {
                    c5362.m8982();
                    i15 = i7;
                    z4 = z2;
                    i16 = i11;
                }
                c5863M8965 = c5362.m8965();
                if (c5863M8965 != null) {
                    c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦ۟ؑٙۗ
                        @Override // p000.InterfaceC5731
                        /* JADX INFO: renamed from: ۥۜ */
                        public final Object mo219(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC1631.m3416(str, interfaceC0705, c3564, i15, z4, i2, i16, (C5362) obj, AbstractC3831.m6835(i4 | 1), i5);
                            return C2358.f7817;
                        }
                    };
                }
            }
            i6 |= 12582912;
            i11 = i3;
            i13 = 100663296 | i6;
            if ((i5 & 512) != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zM8977 = c5362.m8963(null);
                } else {
                    zM8977 = c5362.m8977(null);
                }
                if (zM8977) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i13 |= i14;
            }
            if ((306783379 & i13) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c5362.m9011(i13 & 1, z3)) {
                if (i19 != 0) {
                    i7 = 1;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i10 != 0) {
                    i17 = 1;
                } else {
                    i17 = i11;
                }
                AbstractC5568.m9371(i17, i2);
                if (c5362.m8997(AbstractC1286.f4392) == null) {
                    C0178.m382();
                    return;
                }
                c5362.m8957(356914239);
                c5362.m9009(false);
                InterfaceC4434 interfaceC4437 = (InterfaceC4434) c5362.m8997(AbstractC2853.f9553);
                executor = (Executor) c5362.m8997(AbstractC3616.f12051);
                if (executor == null) {
                    z6 = false;
                    c5362.m8957(1255914055);
                    c5362.m9009(false);
                } else {
                    z6 = false;
                    c5362.m8957(1255914055);
                    c5362.m9009(false);
                }
                c5362.m8957(357875859);
                c5362.m9009(z6);
                InterfaceC0705 interfaceC0705Mo1574 = interfaceC0705.mo1571(new C5399(str, c3564, interfaceC4437, i7, z5, i2, i17));
                C2480 c2483 = C2480.f8264;
                int iHashCode4 = Long.hashCode(c5362.f17657);
                InterfaceC0705 interfaceC0705M2164 = AbstractC0993.m2161(c5362, interfaceC0705Mo1574);
                C2103 c2103M8997 = c5362.m8994();
                InterfaceC4576.f15106.getClass();
                c3709 = C0849.f3049;
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(c3709);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(C0849.f3048, c5362, c2483);
                AbstractC0993.m2127(C0849.f3047, c5362, c2103M8997);
                AbstractC0993.m2146(c5362, C0849.f3050);
                AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2164);
                AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode4));
                c5362.m9009(true);
                i15 = i7;
                z4 = z5;
                i16 = i17;
            } else {
                c5362.m8982();
                i15 = i7;
                z4 = z2;
                i16 = i11;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦ۟ؑٙۗ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC1631.m3416(str, interfaceC0705, c3564, i15, z4, i2, i16, (C5362) obj, AbstractC3831.m6835(i4 | 1), i5);
                        return C2358.f7817;
                    }
                };
            }
        }
        i6 |= 24576;
        i7 = i;
        i8 = i5 & 32;
        if (i8 != 0) {
            if ((196608 & i4) == 0) {
                z2 = z;
                if (c5362.m9006(z2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i6 |= i9;
            }
            if ((1572864 & i4) == 0) {
                if (c5362.m8988(i2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i6 |= i18;
            }
            i10 = i5 & 128;
            if (i10 != 0) {
                if ((12582912 & i4) == 0) {
                    i11 = i3;
                    if (c5362.m8988(i11)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
                i13 = 100663296 | i6;
                if ((i5 & 512) != 0) {
                    i13 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zM8977 = c5362.m8963(null);
                    } else {
                        zM8977 = c5362.m8977(null);
                    }
                    if (zM8977) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i13 |= i14;
                }
                if ((306783379 & i13) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c5362.m9011(i13 & 1, z3)) {
                    if (i19 != 0) {
                        i7 = 1;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i11;
                    }
                    AbstractC5568.m9371(i17, i2);
                    if (c5362.m8997(AbstractC1286.f4392) == null) {
                        C0178.m382();
                        return;
                    }
                    c5362.m8957(356914239);
                    c5362.m9009(false);
                    InterfaceC4434 interfaceC4438 = (InterfaceC4434) c5362.m8997(AbstractC2853.f9553);
                    executor = (Executor) c5362.m8997(AbstractC3616.f12051);
                    if (executor == null) {
                        z6 = false;
                        c5362.m8957(1255914055);
                        c5362.m9009(false);
                    } else {
                        z6 = false;
                        c5362.m8957(1255914055);
                        c5362.m9009(false);
                    }
                    c5362.m8957(357875859);
                    c5362.m9009(z6);
                    InterfaceC0705 interfaceC0705Mo1575 = interfaceC0705.mo1571(new C5399(str, c3564, interfaceC4438, i7, z5, i2, i17));
                    C2480 c2484 = C2480.f8264;
                    int iHashCode5 = Long.hashCode(c5362.f17657);
                    InterfaceC0705 interfaceC0705M2165 = AbstractC0993.m2161(c5362, interfaceC0705Mo1575);
                    C2103 c2103M8998 = c5362.m8994();
                    InterfaceC4576.f15106.getClass();
                    c3709 = C0849.f3049;
                    c5362.m8983();
                    if (c5362.f17668) {
                        c5362.m9005(c3709);
                    } else {
                        c5362.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5362, c2484);
                    AbstractC0993.m2127(C0849.f3047, c5362, c2103M8998);
                    AbstractC0993.m2146(c5362, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2165);
                    AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode5));
                    c5362.m9009(true);
                    i15 = i7;
                    z4 = z5;
                    i16 = i17;
                } else {
                    c5362.m8982();
                    i15 = i7;
                    z4 = z2;
                    i16 = i11;
                }
                c5863M8965 = c5362.m8965();
                if (c5863M8965 != null) {
                    c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦ۟ؑٙۗ
                        @Override // p000.InterfaceC5731
                        /* JADX INFO: renamed from: ۥۜ */
                        public final Object mo219(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC1631.m3416(str, interfaceC0705, c3564, i15, z4, i2, i16, (C5362) obj, AbstractC3831.m6835(i4 | 1), i5);
                            return C2358.f7817;
                        }
                    };
                }
            }
            i6 |= 12582912;
            i11 = i3;
            i13 = 100663296 | i6;
            if ((i5 & 512) != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zM8977 = c5362.m8963(null);
                } else {
                    zM8977 = c5362.m8977(null);
                }
                if (zM8977) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i13 |= i14;
            }
            if ((306783379 & i13) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c5362.m9011(i13 & 1, z3)) {
                if (i19 != 0) {
                    i7 = 1;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i10 != 0) {
                    i17 = 1;
                } else {
                    i17 = i11;
                }
                AbstractC5568.m9371(i17, i2);
                if (c5362.m8997(AbstractC1286.f4392) == null) {
                    C0178.m382();
                    return;
                }
                c5362.m8957(356914239);
                c5362.m9009(false);
                InterfaceC4434 interfaceC4439 = (InterfaceC4434) c5362.m8997(AbstractC2853.f9553);
                executor = (Executor) c5362.m8997(AbstractC3616.f12051);
                if (executor == null) {
                    z6 = false;
                    c5362.m8957(1255914055);
                    c5362.m9009(false);
                } else {
                    z6 = false;
                    c5362.m8957(1255914055);
                    c5362.m9009(false);
                }
                c5362.m8957(357875859);
                c5362.m9009(z6);
                InterfaceC0705 interfaceC0705Mo1576 = interfaceC0705.mo1571(new C5399(str, c3564, interfaceC4439, i7, z5, i2, i17));
                C2480 c2485 = C2480.f8264;
                int iHashCode6 = Long.hashCode(c5362.f17657);
                InterfaceC0705 interfaceC0705M2166 = AbstractC0993.m2161(c5362, interfaceC0705Mo1576);
                C2103 c2103M8999 = c5362.m8994();
                InterfaceC4576.f15106.getClass();
                c3709 = C0849.f3049;
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(c3709);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(C0849.f3048, c5362, c2485);
                AbstractC0993.m2127(C0849.f3047, c5362, c2103M8999);
                AbstractC0993.m2146(c5362, C0849.f3050);
                AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2166);
                AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode6));
                c5362.m9009(true);
                i15 = i7;
                z4 = z5;
                i16 = i17;
            } else {
                c5362.m8982();
                i15 = i7;
                z4 = z2;
                i16 = i11;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦ۟ؑٙۗ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC1631.m3416(str, interfaceC0705, c3564, i15, z4, i2, i16, (C5362) obj, AbstractC3831.m6835(i4 | 1), i5);
                        return C2358.f7817;
                    }
                };
            }
        }
        i6 |= 196608;
        z2 = z;
        if ((1572864 & i4) == 0) {
            if (c5362.m8988(i2)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i6 |= i18;
        }
        i10 = i5 & 128;
        if (i10 != 0) {
            if ((12582912 & i4) == 0) {
                i11 = i3;
                if (c5362.m8988(i11)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i6 |= i12;
            }
            i13 = 100663296 | i6;
            if ((i5 & 512) != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zM8977 = c5362.m8963(null);
                } else {
                    zM8977 = c5362.m8977(null);
                }
                if (zM8977) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i13 |= i14;
            }
            if ((306783379 & i13) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c5362.m9011(i13 & 1, z3)) {
                if (i19 != 0) {
                    i7 = 1;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i10 != 0) {
                    i17 = 1;
                } else {
                    i17 = i11;
                }
                AbstractC5568.m9371(i17, i2);
                if (c5362.m8997(AbstractC1286.f4392) == null) {
                    C0178.m382();
                    return;
                }
                c5362.m8957(356914239);
                c5362.m9009(false);
                InterfaceC4434 interfaceC44310 = (InterfaceC4434) c5362.m8997(AbstractC2853.f9553);
                executor = (Executor) c5362.m8997(AbstractC3616.f12051);
                if (executor == null) {
                    z6 = false;
                    c5362.m8957(1255914055);
                    c5362.m9009(false);
                } else {
                    z6 = false;
                    c5362.m8957(1255914055);
                    c5362.m9009(false);
                }
                c5362.m8957(357875859);
                c5362.m9009(z6);
                InterfaceC0705 interfaceC0705Mo1577 = interfaceC0705.mo1571(new C5399(str, c3564, interfaceC44310, i7, z5, i2, i17));
                C2480 c2486 = C2480.f8264;
                int iHashCode7 = Long.hashCode(c5362.f17657);
                InterfaceC0705 interfaceC0705M2167 = AbstractC0993.m2161(c5362, interfaceC0705Mo1577);
                C2103 c2103M89910 = c5362.m8994();
                InterfaceC4576.f15106.getClass();
                c3709 = C0849.f3049;
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(c3709);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(C0849.f3048, c5362, c2486);
                AbstractC0993.m2127(C0849.f3047, c5362, c2103M89910);
                AbstractC0993.m2146(c5362, C0849.f3050);
                AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2167);
                AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode7));
                c5362.m9009(true);
                i15 = i7;
                z4 = z5;
                i16 = i17;
            } else {
                c5362.m8982();
                i15 = i7;
                z4 = z2;
                i16 = i11;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦ۟ؑٙۗ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC1631.m3416(str, interfaceC0705, c3564, i15, z4, i2, i16, (C5362) obj, AbstractC3831.m6835(i4 | 1), i5);
                        return C2358.f7817;
                    }
                };
            }
        }
        i6 |= 12582912;
        i11 = i3;
        i13 = 100663296 | i6;
        if ((i5 & 512) != 0) {
            i13 = i6 | 905969664;
        } else if ((805306368 & i4) == 0) {
            if ((1073741824 & i4) == 0) {
                zM8977 = c5362.m8963(null);
            } else {
                zM8977 = c5362.m8977(null);
            }
            if (zM8977) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i13 |= i14;
        }
        if ((306783379 & i13) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c5362.m9011(i13 & 1, z3)) {
            if (i19 != 0) {
                i7 = 1;
            }
            if (i8 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i10 != 0) {
                i17 = 1;
            } else {
                i17 = i11;
            }
            AbstractC5568.m9371(i17, i2);
            if (c5362.m8997(AbstractC1286.f4392) == null) {
                C0178.m382();
                return;
            }
            c5362.m8957(356914239);
            c5362.m9009(false);
            InterfaceC4434 interfaceC44311 = (InterfaceC4434) c5362.m8997(AbstractC2853.f9553);
            executor = (Executor) c5362.m8997(AbstractC3616.f12051);
            if (executor == null) {
                z6 = false;
                c5362.m8957(1255914055);
                c5362.m9009(false);
            } else {
                z6 = false;
                c5362.m8957(1255914055);
                c5362.m9009(false);
            }
            c5362.m8957(357875859);
            c5362.m9009(z6);
            InterfaceC0705 interfaceC0705Mo1578 = interfaceC0705.mo1571(new C5399(str, c3564, interfaceC44311, i7, z5, i2, i17));
            C2480 c2487 = C2480.f8264;
            int iHashCode8 = Long.hashCode(c5362.f17657);
            InterfaceC0705 interfaceC0705M2168 = AbstractC0993.m2161(c5362, interfaceC0705Mo1578);
            C2103 c2103M89911 = c5362.m8994();
            InterfaceC4576.f15106.getClass();
            c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, c2487);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M89911);
            AbstractC0993.m2146(c5362, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2168);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode8));
            c5362.m9009(true);
            i15 = i7;
            z4 = z5;
            i16 = i17;
        } else {
            c5362.m8982();
            i15 = i7;
            z4 = z2;
            i16 = i11;
        }
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦ۟ؑٙۗ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1631.m3416(str, interfaceC0705, c3564, i15, z4, i2, i16, (C5362) obj, AbstractC3831.m6835(i4 | 1), i5);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static boolean m3417(int i, Context context, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C3866.m6899(context).f972.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5293 m3418(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new C5293(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m3419(final C1249 c1249, final InterfaceC0705 interfaceC0705, final C3564 c3564, final InterfaceC4745 interfaceC4745, final int i, final boolean z, final int i2, final int i3, final Map map, C5362 c5362, final int i4, final int i5) {
        int i6;
        InterfaceC0705 interfaceC0706;
        InterfaceC4745 interfaceC4746;
        int i7;
        int i8;
        boolean z2;
        List list;
        c5362.m8979(-1343466571);
        if ((i4 & 6) == 0) {
            i6 = (c5362.m8963(c1249) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            interfaceC0706 = interfaceC0705;
            i6 |= c5362.m8963(interfaceC0706) ? 32 : 16;
        } else {
            interfaceC0706 = interfaceC0705;
        }
        if ((i4 & 384) == 0) {
            i6 |= c5362.m8963(c3564) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            interfaceC4746 = interfaceC4745;
            i6 |= c5362.m8977(interfaceC4746) ? 2048 : 1024;
        } else {
            interfaceC4746 = interfaceC4745;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c5362.m8988(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= c5362.m9006(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= c5362.m8988(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i6 |= c5362.m8988(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i6 |= c5362.m8977(map) ? 67108864 : 33554432;
        }
        int i9 = i6 | 805306368;
        if ((i5 & 6) == 0) {
            i7 = i5 | ((i5 & 8) == 0 ? c5362.m8963(null) : c5362.m8977(null) ? 4 : 2);
        } else {
            i7 = i5;
        }
        boolean z3 = false;
        if (c5362.m9011(i9 & 1, ((i9 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            AbstractC5568.m9371(i3, i2);
            if (c5362.m8997(AbstractC1286.f4392) != null) {
                C0178.m382();
                return;
            }
            c5362.m8957(1588759409);
            c5362.m9009(false);
            C3869 c3869 = AbstractC3044.f10238;
            int length = c1249.f4307.length();
            List list2 = c1249.f4308;
            if (list2 == null) {
                i8 = i9;
                z2 = z3;
                break;
            }
            int size = list2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i8 = i9;
                    z2 = z3;
                    break;
                }
                C2331 c2331 = (C2331) list2.get(i10);
                i8 = i9;
                if (c2331.f7719 instanceof C3435) {
                    list = list2;
                    if ("androidx.compose.foundation.text.inlineContent".equals(c2331.f7720)) {
                        int i11 = c2331.f7718;
                        int i12 = c2331.f7717;
                        z3 = false;
                        if (AbstractC5556.m9310(0, length, i11, i12)) {
                            z2 = true;
                            break;
                        }
                    }
                    i10++;
                    i9 = i8;
                    list2 = list;
                } else {
                    list = list2;
                }
                z3 = false;
                i10++;
                i9 = i8;
                list2 = list;
            }
            boolean zM7176 = AbstractC4009.m7176(c1249);
            InterfaceC4434 interfaceC4434 = (InterfaceC4434) c5362.m8997(AbstractC2853.f9553);
            if (z2 || zM7176) {
                c5362.m8957(1590022070);
                boolean z4 = (i8 & 14) != 4 ? z3 : true;
                Object objM8999 = c5362.m8999();
                Object obj = C2850.f9517;
                if (z4 || objM8999 == obj) {
                    objM8999 = AbstractC2774.m5183(c1249);
                    c5362.m8987(objM8999);
                }
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
                C1249 c12410 = (C1249) interfaceC4367.getValue();
                boolean zM8963 = c5362.m8963(interfaceC4367);
                Object objM89910 = c5362.m8999();
                if (zM8963 || objM89910 == obj) {
                    objM89910 = new C2136(interfaceC4367, 3);
                    c5362.m8987(objM89910);
                }
                int i13 = i8 << 6;
                m3408(interfaceC0705, c12410, interfaceC4745, z2, map, c3564, i, z, i2, i3, interfaceC4434, (InterfaceC4745) objM89910, c5362, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), ((i8 >> 21) & 896) | (57344 & (i7 << 12)));
                c5362.m9009(z3);
            } else {
                c5362.m8957(1589006262);
                AbstractC3616.m6446(c1249, c3564, interfaceC4434, null, c5362);
                InterfaceC0705 interfaceC0705M3431 = m3431(interfaceC0706, c1249, c3564, interfaceC4746, i, z, i2, i3, interfaceC4434, null, null, null);
                C2480 c2480 = C2480.f8264;
                int iHashCode = Long.hashCode(c5362.f17657);
                InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M3431);
                C2103 c2103M8994 = c5362.m8994();
                InterfaceC4576.f15106.getClass();
                InterfaceC4448 interfaceC4448 = C0849.f3049;
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(interfaceC4448);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(C0849.f3048, c5362, c2480);
                AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                AbstractC0993.m2146(c5362, C0849.f3050);
                AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                c5362.m9009(true);
                c5362.m9009(false);
            }
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦَؗؒٚ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC1631.m3419(c1249, interfaceC0705, c3564, interfaceC4745, i, z, i2, i3, map, (C5362) obj2, AbstractC3831.m6835(i4 | 1), AbstractC3831.m6835(i5));
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static C2441 m3420(Set set) {
        C2441 c2441 = new C2441();
        c2441.f8134 = f5466;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C2632 c2632 = (C2632) it.next();
            AbstractC3933.m7065(c2632, "key");
            boolean z = c2632.f8741;
            HashMap map = c2441.f8135;
            HashMap map2 = c2441.f8136;
            if (!z) {
                map.remove(c2632);
                map2.put(c2632, C2441.f8133);
            } else {
                if (!z) {
                    C1078.m2272("key must be repeating");
                    return null;
                }
                map2.remove(c2632);
                map.put(c2632, C2441.f8132);
            }
        }
        return c2441;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static void m3421(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final long m3422(int i) {
        long j = ((long) i) << 32;
        int i2 = AbstractC0708.f2610;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x0177, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0048, B:74:0x0173, B:76:0x017a, B:77:0x017d, B:78:0x017e, B:26:0x004c, B:28:0x0050, B:29:0x005d, B:31:0x0063, B:37:0x0079, B:39:0x007f, B:40:0x008b, B:61:0x0157, B:62:0x015a, B:70:0x016a, B:69:0x0167, B:71:0x016b, B:72:0x0170, B:73:0x0171, B:32:0x0069, B:36:0x0070), top: B:83:0x0007, inners: #4 }] */
    /* JADX INFO: renamed from: ۦؖ */
    public static AbstractC3538 m3423(Context context) {
        AbstractC3538 abstractC3538;
        AbstractC3538 c4152;
        AbstractC3538 c4153;
        char c;
        AbstractC3538 abstractC3539 = f5463;
        if (abstractC3539 != null) {
            return abstractC3539;
        }
        synchronized (AbstractC1631.class) {
            try {
                abstractC3538 = f5463;
                if (abstractC3538 == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    C4461 c4461 = AbstractC4385.f14451;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        abstractC3538 = C0034.f6711;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c2 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                c4152 = file.exists() ? new C4152(file) : C0034.f6711;
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                c4152 = C0034.f6711;
                            }
                            if (c4152.mo3984()) {
                                File file2 = (File) c4152.mo3985();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        C0796 c0796 = new C0796(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c2]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                C0796 c0797 = (C0796) c0796.get(str3);
                                                if (c0797 == null) {
                                                    c = 0;
                                                    c0797 = new C0796(0);
                                                    c0796.put(str3, c0797);
                                                } else {
                                                    c = 0;
                                                }
                                                c0797.put(strDecode, strDecode2);
                                                c2 = c;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        C4270 c4270 = new C4270(c0796);
                                        bufferedReader.close();
                                        c4153 = new C4152(c4270);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                c4153 = C0034.f6711;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            abstractC3538 = c4153;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        abstractC3538 = C0034.f6711;
                    }
                    f5463 = abstractC3538;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return abstractC3538;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final void m3424(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        RunnableC1948 runnableC1948 = new RunnableC1948(level, exc, str, objArr, 7, false);
        int i = AbstractC3290.f11024;
        int i2 = 11;
        executor.execute(new RunnableC0624(i2, new C5450(), AbstractC5474.m9170(), runnableC1948, false));
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final long m3425(long j, long j2) {
        int iM6113;
        int iM6109 = C3346.m6109(j);
        int iM6108 = C3346.m6108(j);
        if ((C3346.m6109(j2) < C3346.m6108(j)) && (C3346.m6109(j) < C3346.m6108(j2))) {
            if ((C3346.m6109(j2) <= C3346.m6109(j)) && (C3346.m6108(j) <= C3346.m6108(j2))) {
                iM6109 = C3346.m6109(j2);
                iM6108 = iM6109;
            } else {
                if ((C3346.m6109(j) <= C3346.m6109(j2)) && (C3346.m6108(j2) <= C3346.m6108(j))) {
                    iM6113 = C3346.m6113(j2);
                } else {
                    int iM61010 = C3346.m6109(j2);
                    if (iM6109 >= C3346.m6108(j2) || iM61010 > iM6109) {
                        iM6108 = C3346.m6109(j2);
                    } else {
                        iM6109 = C3346.m6109(j2);
                        iM6113 = C3346.m6113(j2);
                    }
                }
                iM6108 -= iM6113;
            }
        } else if (iM6108 > C3346.m6109(j2)) {
            iM6109 -= C3346.m6113(j2);
            iM6113 = C3346.m6113(j2);
            iM6108 -= iM6113;
        }
        return AbstractC2765.m5145(iM6109, iM6108);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static C2148 m3426(String str, AbstractC0487 abstractC0487, InterfaceC0103[] interfaceC0103Arr) {
        if (AbstractC0684.m1534(str)) {
            C1078.m2272("Blank serial names are prohibited");
            return null;
        }
        if (abstractC0487.equals(C3626.f12098)) {
            C1078.m2272("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C1917 c1917 = new C1917(str);
        return new C2148(str, abstractC0487, c1917.f6316.size(), AbstractC0246.m509(interfaceC0103Arr), c1917);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ۥٍٍُؑ, ۦۤؗٗٔ] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ۦٟٗؓٛ] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: ۦٌ */
    public static final List m3427(C0126 c0126, Integer num, int i, Integer num2) {
        int iM262;
        int iM237;
        C2730 c2730;
        if (c0126.f489 || c0126.m271() == 0) {
            return C2340.f7777;
        }
        ?? c0931 = new C0931(c0126);
        if (num2 != null) {
            iM262 = num2.intValue();
        } else {
            iM262 = c0126.f503;
            if (iM262 < 0) {
                iM262 = c0126.m262(c0126.f490, i);
            }
        }
        if (num == 0) {
            int iM229 = c0126.f499 - c0126.m229(c0126.f490, c0126.m236(i));
            C4912 c4912 = c0126.f483;
            num = Integer.valueOf(iM229 + ((c4912 == null || (c2730 = (C2730) c4912.m9571(i)) == null) ? 0 : c2730.f9040));
        }
        int iM236 = c0126.m236(i) * 5;
        int[] iArr = c0126.f490;
        if (iM236 < iArr.length) {
            iM237 = c0126.m237(i);
        } else {
            int iM263 = iM262 >= 0 ? c0126.m262(iArr, iM262) : iM262;
            iM237 = c0126.m237(iM262);
            int i2 = iM262;
            iM262 = iM263;
            i = i2;
        }
        while (i >= 0) {
            c0931.m9494(iM237, (c0126.f490[(c0126.m236(i) * 5) + 1] & 536870912) != 0 ? c0126.m233(i) : C2850.f9517, c0126.m268(i), num);
            num = c0126.m244(i);
            if (iM262 >= 0) {
                int iM264 = c0126.m262(c0126.f490, iM262);
                iM237 = c0126.m237(iM262);
                int i3 = iM262;
                iM262 = iM264;
                i = i3;
            } else {
                i = iM262;
            }
        }
        return (ArrayList) c0931.f18660;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final C2148 m3428(String str, InterfaceC0103[] interfaceC0103Arr, InterfaceC4745 interfaceC4745) {
        if (AbstractC0684.m1534(str)) {
            C1078.m2272("Blank serial names are prohibited");
            return null;
        }
        C1917 c1917 = new C1917(str);
        interfaceC4745.mo211(c1917);
        return new C2148(str, C3626.f12098, c1917.f6316.size(), AbstractC0246.m509(interfaceC0103Arr), c1917);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static void m3429(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final boolean m3430(int i, KeyEvent keyEvent) {
        return ((int) (AbstractC1434.m3030(keyEvent) >> 32)) == i;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static final InterfaceC0705 m3431(InterfaceC0705 interfaceC0705, C1249 c1249, C3564 c3564, InterfaceC4745 interfaceC4745, int i, boolean z, int i2, int i3, InterfaceC4434 interfaceC4434, List list, InterfaceC4745 interfaceC4746, InterfaceC4745 interfaceC4747) {
        return interfaceC0705.mo1571(C4217.f13994).mo1571(new C0747(c1249, c3564, interfaceC4434, interfaceC4745, i, z, i2, i3, list, interfaceC4746, interfaceC4747));
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static float m3432(int i) {
        Set set = C1606.f5402;
        if (i == 2) {
            return 840.0f;
        }
        return i == 1 ? 600.0f : 0.0f;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final C2148 m3433(String str, AbstractC0487 abstractC0487, InterfaceC0103[] interfaceC0103Arr, InterfaceC4745 interfaceC4745) {
        if (AbstractC0684.m1534(str)) {
            C1078.m2272("Blank serial names are prohibited");
            return null;
        }
        if (abstractC0487.equals(C3626.f12098)) {
            C1078.m2272("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        C1917 c1917 = new C1917(str);
        interfaceC4745.mo211(c1917);
        return new C2148(str, abstractC0487, c1917.f6316.size(), AbstractC0246.m509(interfaceC0103Arr), c1917);
    }

    /* JADX WARN: Code duplicated, block: B:162:0x025d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0287  */
    /* JADX WARN: Code duplicated, block: B:165:0x028b  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:182:0x0314  */
    /* JADX WARN: Code duplicated, block: B:185:0x0332  */
    /* JADX WARN: Code duplicated, block: B:188:0x0347  */
    /* JADX WARN: Code duplicated, block: B:190:0x034d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0352  */
    /* JADX WARN: Code duplicated, block: B:195:0x0358  */
    /* JADX WARN: Code duplicated, block: B:198:0x035e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0399  */
    /* JADX WARN: Code duplicated, block: B:201:0x039d  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:208:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:212:0x0423  */
    /* JADX WARN: Code duplicated, block: B:213:0x0427  */
    /* JADX WARN: Code duplicated, block: B:218:0x0442  */
    /* JADX WARN: Code duplicated, block: B:221:0x0462  */
    /* JADX WARN: Code duplicated, block: B:224:0x047c  */
    /* JADX WARN: Code duplicated, block: B:225:0x047f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0483  */
    /* JADX WARN: Code duplicated, block: B:228:0x0486  */
    /* JADX WARN: Code duplicated, block: B:231:0x0494  */
    /* JADX WARN: Code duplicated, block: B:232:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:235:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:236:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:241:0x0503  */
    /* JADX WARN: Code duplicated, block: B:244:0x051c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0527  */
    /* JADX WARN: Code duplicated, block: B:248:0x052b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0534  */
    /* JADX WARN: Code duplicated, block: B:253:0x0538  */
    /* JADX WARN: Code duplicated, block: B:257:0x0541  */
    /* JADX WARN: Code duplicated, block: B:261:0x0548  */
    /* JADX WARN: Code duplicated, block: B:264:0x0584  */
    /* JADX WARN: Code duplicated, block: B:265:0x0588  */
    /* JADX WARN: Code duplicated, block: B:268:0x0595  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:272:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:274:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:276:0x0609  */
    /* JADX WARN: Code duplicated, block: B:277:0x060d  */
    /* JADX WARN: Code duplicated, block: B:282:0x0628  */
    /* JADX WARN: Code duplicated, block: B:284:0x0644  */
    /* JADX INFO: renamed from: ۦۙ */
    public static final void m3434(final InterfaceC5731 interfaceC5731, InterfaceC2609 interfaceC2609, InterfaceC5731 interfaceC5732, final InterfaceC5731 interfaceC5733, final InterfaceC5731 interfaceC5734, final InterfaceC5731 interfaceC5735, InterfaceC5731 interfaceC5736, final boolean z, final C3176 c3176, final C4444 c4444, final InterfaceC4745 interfaceC4745, final C0857 c0857, InterfaceC5731 interfaceC5737, InterfaceC1291 interfaceC1291, C5362 c5362, final int i, final int i2) {
        int i3;
        int i4;
        InterfaceC5731 interfaceC5738;
        InterfaceC2609 interfaceC26010;
        InterfaceC5731 interfaceC5739;
        final InterfaceC5731 interfaceC57310;
        C5362 c5363;
        C3039 c3039;
        C5362 c5364;
        C3039 c30310;
        C3136 c3136;
        C0573 c0573;
        boolean z2;
        float fM9379;
        float fM9387;
        float f;
        InterfaceC5731 interfaceC57311;
        C3039 c30311;
        InterfaceC5731 interfaceC57312;
        float f2;
        float f3;
        float f4;
        InterfaceC0705 interfaceC0705M9381;
        InterfaceC2609 interfaceC26011;
        int iM1958;
        InterfaceC5731 interfaceC57313;
        InterfaceC5731 interfaceC57314;
        boolean z3;
        int iM1959;
        C4444 c4445;
        boolean z4;
        Object objM8999;
        int iM19510;
        int iM19511;
        int iM19512;
        int iM19513;
        int iM19514;
        InterfaceC5731 interfaceC57315 = interfaceC5736;
        InterfaceC1291 interfaceC1292 = interfaceC1291;
        C3039 c30312 = C1298.f4431;
        C3039 c30313 = C1298.f4456;
        c5362.m8979(753699262);
        int i5 = i & 6;
        C4217 c4217 = C4217.f13994;
        if (i5 == 0) {
            i3 = i | (c5362.m8963(c4217) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c5362.m8977(interfaceC5731) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c5362.m8977(interfaceC2609) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c5362.m8977(interfaceC5732) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c5362.m8977(interfaceC5733) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c5362.m8977(interfaceC5734) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c5362.m8977(interfaceC5735) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c5362.m8977(interfaceC57315) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c5362.m9006(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c5362.m8963(c3176) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? c5362.m8963(c4444) : c5362.m8977(c4444) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c5362.m8977(interfaceC4745) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c5362.m8977(c0857) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c5362.m8977(interfaceC5737) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c5362.m8963(interfaceC1292) ? 16384 : 8192;
        }
        int i6 = i4;
        if (c5362.m9011(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            float fM1069 = AbstractC0487.m1069(c5362);
            int i7 = i6 & 14;
            boolean zM8956 = ((i6 & 57344) == 16384) | ((i6 & 112) == 32) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i7 == 4 || ((i6 & 8) != 0 && c5362.m8963(c4444))) | c5362.m8956(fM1069);
            Object objM89910 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (zM8956 || objM89910 == c4036) {
                c3039 = c30312;
                C5362 c5365 = c5362;
                C4606 c4606 = new C4606(interfaceC4745, z, c3176, c4444, interfaceC1292, fM1069);
                c5365.m8987(c4606);
                objM89910 = c4606;
                c5364 = c5365;
            } else {
                c3039 = c30312;
                c5364 = c5362;
            }
            C4606 c4607 = (C4606) objM89910;
            EnumC2459 enumC2459 = (EnumC2459) c5364.m8997(AbstractC2853.f9555);
            int iM19515 = AbstractC0949.m1958(c5364);
            C2103 c2103M8994 = c5364.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5364, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0208: INVOKE (r7v3 'interfaceC0705M2161' ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ) = (r3v5 'c5364' ￛﾦￛﾟ￘ﾗ￙ﾙￛﾟ), (r21v2 ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ) STATIC call: ￛﾥ￙ﾎ￘ﾒ￘ﾑ￙ﾒ.ￛﾦￛﾜ(ￛﾦￛﾟ￘ﾗ￙ﾙￛﾟ, ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ):ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ A[DECLARE_VAR, MD:(ￛﾦￛﾟ￘ﾗ￙ﾙￛﾟ, ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ):ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ (m)] (LINE:16) in method: ￛﾥ￙ﾙ￘ﾑￛﾣ￘ﾚ.ￛﾦￛﾙ(ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾥￛﾢ￘ﾓￛﾙ￙ﾔ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, boolean, ￛﾦ￘ﾓ￘ﾔ￙ﾗ￘ﾗ, ￛﾦ￙ﾘ￘ﾖ￙ﾖￛﾛ, ￛﾦ￙ﾝ￘ﾔ￙ﾏ￙ﾌ, ￛﾥ￙ﾋ￘ﾖￛﾠ￘ﾒ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾥ￙ﾓ￘ﾖ￙ﾌ￙ﾓ, ￛﾦￛﾟ￘ﾗ￙ﾙￛﾟ, int, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v2 ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1674
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC1631.m3434(ۦۦؙؑؑ, ۥۢؓۙٔ, ۦۦؙؑؑ, ۦۦؙؑؑ, ۦۦؙؑؑ, ۦۦؙؑؑ, ۦۦؙؑؑ, boolean, ۦؓؔٗؗ, ۦٖ٘ؖۛ, ۦٌُٝؔ, ۥًؖ۠ؒ, ۦۦؙؑؑ, ۥٌٓؖٓ, ۦ۟ؗٙ۟, int, int):void");
        }

        /* JADX INFO: renamed from: ۦۚ */
        public static void m3435(Object obj, String str) {
            if (obj != null) {
                return;
            }
            C0178.m387(str);
        }

        /* JADX INFO: renamed from: ۦۛ */
        public static final boolean m3436(C5293 c5293) {
            long j = c5293.f17431;
            return (j >>> 32) == (4294967295L & j) && j == c5293.f17432 && j == c5293.f17437 && j == c5293.f17434;
        }

        /* JADX INFO: renamed from: ۦ۟ */
        public static final Integer m3437(C3222 c3222, AbstractC2109 abstractC2109, int i, int i2) {
            Integer numM3437;
            int[] iArr = c3222.f10824;
            while (true) {
                if (i >= i2) {
                    return null;
                }
                int i3 = iArr[(i * 5) + 3] + i;
                if (c3222.m5925(i) && c3222.m5927(i) == 206 && AbstractC3831.m6874(c3222.m5931(iArr, i), AbstractC5508.f18187)) {
                    Object objM5920 = c3222.m5920(i, 0);
                    C1670 c1670 = objM5920 instanceof C1670 ? (C1670) objM5920 : null;
                    InterfaceC3424 interfaceC3424 = c1670 != null ? c1670.f5567 : null;
                    C2682 c2682 = interfaceC3424 instanceof C2682 ? (C2682) interfaceC3424 : null;
                    if (c2682 != null && c2682.f8900 == abstractC2109) {
                        return Integer.valueOf(i);
                    }
                }
                if (c3222.m5922(i) && (numM3437 = m3437(c3222, abstractC2109, i + 1, i3)) != null) {
                    return Integer.valueOf(numM3437.intValue());
                }
                i = i3;
            }
        }

        /* JADX INFO: renamed from: ۦۨ */
        public static void m3438(ArrayList arrayList) {
            HashMap map = new HashMap(arrayList.size());
            Iterator it = arrayList.iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    Iterator it2 = map.values().iterator();
                    while (it2.hasNext()) {
                        for (C5160 c5160 : (Set) it2.next()) {
                            for (C0332 c0332 : c5160.f17095.f17236) {
                                if (c0332.f1240 == 0) {
                                    Set<C5160> set = (Set) map.get(new C5877(c0332.f1242, c0332.f1241 == 2));
                                    if (set != null) {
                                        for (C5160 c5161 : set) {
                                            c5160.f17094.add(c5161);
                                            c5161.f17093.add(c5160);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    HashSet<C5160> hashSet = new HashSet();
                    Iterator it3 = map.values().iterator();
                    while (it3.hasNext()) {
                        hashSet.addAll((Set) it3.next());
                    }
                    HashSet hashSet2 = new HashSet();
                    for (C5160 c5162 : hashSet) {
                        if (c5162.f17093.isEmpty()) {
                            hashSet2.add(c5162);
                        }
                    }
                    while (!hashSet2.isEmpty()) {
                        C5160 c5163 = (C5160) hashSet2.iterator().next();
                        hashSet2.remove(c5163);
                        i++;
                        for (C5160 c5164 : c5163.f17094) {
                            c5164.f17093.remove(c5163);
                            if (c5164.f17093.isEmpty()) {
                                hashSet2.add(c5164);
                            }
                        }
                    }
                    if (i == arrayList.size()) {
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (C5160 c5165 : hashSet) {
                        if (!c5165.f17093.isEmpty() && !c5165.f17094.isEmpty()) {
                            arrayList2.add(c5165.f17095);
                        }
                    }
                    throw new C2690(1, "Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
                }
                C5221 c5221 = (C5221) it.next();
                C5160 c5166 = new C5160(c5221);
                for (C1166 c1166 : c5221.f17239) {
                    boolean z = c5221.f17237 == 0;
                    C5877 c5877 = new C5877(c1166, !z);
                    if (!map.containsKey(c5877)) {
                        map.put(c5877, new HashSet());
                    }
                    Set set2 = (Set) map.get(c5877);
                    if (!set2.isEmpty() && z) {
                        throw new IllegalArgumentException("Multiple components provide " + c1166 + ".");
                    }
                    set2.add(c5166);
                }
            }
        }
    }
