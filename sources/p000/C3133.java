package p000;

import android.content.Context;
import android.content.res.Resources;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ۦؒؗۜؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3133 {

    /* JADX INFO: renamed from: ۥّ */
    public static C3963 f10546;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f10549;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0857 f10547 = new C0857(-1792598918, new C0064(20), false);

    /* JADX INFO: renamed from: ۥؗ */
    public static final Object f10544 = new Object();

    /* JADX INFO: renamed from: ۦؑ */
    public static final C2820 f10548 = new C2820();

    /* JADX INFO: renamed from: ۥُ */
    public static final C4885 f10545 = new C4885(1022);

    public /* synthetic */ C3133(int i) {
        this.f10549 = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥؓ */
    public static final Object m5777(InterfaceC4448 interfaceC4448, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        C1381 c1381;
        if (abstractC0772 instanceof C1381) {
            c1381 = (C1381) abstractC0772;
            int i = c1381.f4730;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1381.f4730 = i - Integer.MIN_VALUE;
            } else {
                c1381 = new C1381(abstractC0772);
            }
        } else {
            c1381 = new C1381(abstractC0772);
        }
        Object obj = c1381.f4731;
        int i2 = c1381.f4730;
        InterfaceC0443 interfaceC0443 = null;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj);
                C0061 c0061 = new C0061(interfaceC4448, interfaceC5731, interfaceC0443, 2);
                c1381.f4730 = 1;
                Object objM7173 = AbstractC4009.m7173(c0061, c1381);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM7173 == enumC2282) {
                    return enumC2282;
                }
            } else {
                if (i2 != 1) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
            }
        } catch (C3063 unused) {
        }
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static final Object m5778(C2103 c2103, AbstractC2266 abstractC2266) {
        Object objMo4312 = c2103.get(abstractC2266);
        if (objMo4312 == null) {
            objMo4312 = abstractC2266.mo4312();
        }
        return ((InterfaceC3633) objMo4312).mo3251(c2103);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥؗ */
    public static final Object m5779(C3002 c3002, InterfaceC4448 interfaceC4448, AbstractC0772 abstractC0772) {
        C0651 c0651;
        if (abstractC0772 instanceof C0651) {
            c0651 = (C0651) abstractC0772;
            int i = c0651.f2431;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0651.f2431 = i - Integer.MIN_VALUE;
            } else {
                c0651 = new C0651(abstractC0772);
            }
        } else {
            c0651 = new C0651(abstractC0772);
        }
        Object obj = c0651.f2429;
        int i2 = c0651.f2431;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj);
                if (c0651.f2791.mo865(C1397.f4791) != c3002) {
                    C1078.m2276("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                c0651.f2430 = interfaceC4448;
                c0651.f2431 = 1;
                C2600 c2600 = new C2600(1, AbstractC2776.m5232(c0651));
                c2600.m4913();
                c3002.m5593(new C5757(2, c2600));
                Object objM4909 = c2600.m4909();
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM4909 == enumC2282) {
                    return enumC2282;
                }
            } else {
                if (i2 != 1) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC4448 = c0651.f2430;
                AbstractC0186.m409(obj);
            }
            interfaceC4448.mo449();
            return C2358.f7817;
        } catch (Throwable th) {
            interfaceC4448.mo449();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public static final long m5780(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static C1046 m5781(DexKitBridge dexKitBridge, C0035 c0035) {
        int iM4031 = c0035.m4031(4);
        int i = iM4031 != 0 ? c0035.f6878.getInt(iM4031 + c0035.f6879) : 0;
        int iM4032 = c0035.m4031(6);
        int i2 = iM4032 != 0 ? c0035.f6878.getInt(iM4032 + c0035.f6879) : 0;
        int iM4033 = c0035.m4031(8);
        if (iM4033 != 0) {
            c0035.m4033(iM4033 + c0035.f6879);
        }
        int iM4034 = c0035.m4031(10);
        int i3 = iM4034 != 0 ? c0035.f6878.getInt(iM4034 + c0035.f6879) : 0;
        int iM4035 = c0035.m4031(12);
        String strM4033 = iM4035 != 0 ? c0035.m4033(iM4035 + c0035.f6879) : null;
        if (strM4033 == null) {
            strM4033 = "";
        }
        String str = strM4033;
        int iM4036 = c0035.m4031(14);
        int i4 = iM4036 != 0 ? c0035.f6878.getInt(iM4036 + c0035.f6879) : 0;
        Integer numValueOf = i4 != -1 ? Integer.valueOf(i4) : null;
        ArrayList arrayList = new ArrayList();
        int iM4037 = c0035.m4031(16);
        int iM4030 = iM4037 != 0 ? c0035.m4030(iM4037) : 0;
        for (int i5 = 0; i5 < iM4030; i5++) {
            int iM4038 = c0035.m4031(16);
            arrayList.add(Integer.valueOf(iM4038 != 0 ? c0035.f6878.getInt((i5 * 4) + c0035.m4029(iM4038)) : 0));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM4039 = c0035.m4031(18);
        int iM40310 = iM4039 != 0 ? c0035.m4030(iM4039) : 0;
        for (int i6 = 0; i6 < iM40310; i6++) {
            int iM40311 = c0035.m4031(18);
            arrayList2.add(Integer.valueOf(iM40311 != 0 ? c0035.f6878.getInt((i6 * 4) + c0035.m4029(iM40311)) : 0));
        }
        ArrayList arrayList3 = new ArrayList();
        int iM40312 = c0035.m4031(20);
        int iM40313 = iM40312 != 0 ? c0035.m4030(iM40312) : 0;
        for (int i7 = 0; i7 < iM40313; i7++) {
            int iM40314 = c0035.m4031(20);
            arrayList3.add(Integer.valueOf(iM40314 != 0 ? c0035.f6878.getInt((i7 * 4) + c0035.m4029(iM40314)) : 0));
        }
        return new C1046(dexKitBridge, i, i2, i3, str, numValueOf, arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final int m5782(AbstractC3625 abstractC3625, AbstractC4642 abstractC4642) {
        AbstractC3625 abstractC3625Mo2785 = abstractC3625.mo2785();
        if (abstractC3625Mo2785 == null) {
            AbstractC3480.m6278("Child of " + abstractC3625 + " cannot be null when calculating alignment line");
        }
        if (abstractC3625.mo2789().mo621().containsKey(abstractC4642)) {
            Integer num = (Integer) abstractC3625.mo2789().mo621().get(abstractC4642);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iMo567 = abstractC3625Mo2785.mo567(abstractC4642);
            if (iMo567 != Integer.MIN_VALUE) {
                abstractC3625Mo2785.f12095 = true;
                abstractC3625.f12092 = true;
                abstractC3625.mo2796();
                abstractC3625Mo2785.f12095 = false;
                abstractC3625.f12092 = false;
                return iMo567 + ((int) (abstractC4642 instanceof C2779 ? abstractC3625Mo2785.mo2797() & 4294967295L : abstractC3625Mo2785.mo2797() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final double m5783(int i, int i2, int i3, int i4, int i5) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int iM6632 = AbstractC3761.m6632(i5);
        if (iM6632 == 0) {
            return Math.max(d, d2);
        }
        if (iM6632 == 1) {
            return Math.min(d, d2);
        }
        C1078.m2275();
        return 0.0d;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final int m5784(ArrayList arrayList, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((C0158) AbstractC0973.m2040(arrayList)).f603) {
            return AbstractC2164.m4181(arrayList);
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C0158 c0158 = (C0158) arrayList.get(i2);
            if (c0158.f599 > f) {
                b = 1;
            } else {
                b = c0158.f603 <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final void m5785(ArrayList arrayList, long j, InterfaceC4745 interfaceC4745) {
        int size = arrayList.size();
        for (int iM5811 = m5811(C3346.m6109(j), arrayList); iM5811 < size; iM5811++) {
            C0158 c0158 = (C0158) arrayList.get(iM5811);
            if (c0158.f600 >= C3346.m6108(j)) {
                return;
            }
            if (c0158.f600 != c0158.f597) {
                interfaceC4745.mo211(c0158);
            }
        }
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static final String m5786(int i, Object[] objArr, C5362 c5362) {
        return ((Resources) c5362.m8997(AbstractC4354.f14352)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final int m5787(InterfaceC3879 interfaceC3879) {
        InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("SELECT changes()");
        try {
            interfaceC0252Mo971.mo533();
            int i = (int) interfaceC0252Mo971.getLong(0);
            AbstractC1434.m3052(interfaceC0252Mo971, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1434.m3052(interfaceC0252Mo971, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static final C3738 m5788(InterfaceC4448 interfaceC4448, C5362 c5362, int i) {
        View view = (View) c5362.m8997(AbstractC4354.f14354);
        boolean zM8963 = c5362.m8963(view);
        Object objM8999 = c5362.m8999();
        Object obj = C2850.f9517;
        if (zM8963 || objM8999 == obj) {
            objM8999 = new C3738(view, null, interfaceC4448);
            c5362.m8987(objM8999);
        }
        C3738 c3738 = (C3738) objM8999;
        boolean zM8977 = c5362.m8977(c3738);
        Object objM89910 = c5362.m8999();
        if (zM8977 || objM89910 == obj) {
            objM89910 = new C1484(c3738, 3);
            c5362.m8987(objM89910);
        }
        AbstractC3925.m7028(c3738, (InterfaceC4745) objM89910, c5362);
        return c3738;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final boolean m5789(C2384 c2384, float f) {
        c2384.m1402().getClass();
        return !(((c2384.m1395() ? -f : m5806(c2384)) > 0.0f ? 1 : ((c2384.m1395() ? -f : m5806(c2384)) == 0.0f ? 0 : -1)) > 0);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m5790(InterfaceC0705 interfaceC0705, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(771959668);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8977(c0857) ? 256 : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                C4852 c4852 = new C4852(null, C0373.f1364);
                c5362.m8987(c4852);
                objM8999 = c4852;
            }
            InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
            Object objM89910 = c5362.m8999();
            if (objM89910 == c4036) {
                objM89910 = new C0681(interfaceC4367, i3);
                c5362.m8987(objM89910);
            }
            C4773.m8137(AbstractC0405.f1487.mo4313(m5788((InterfaceC4448) objM89910, c5362, 0)), AbstractC3925.m7034(-291176396, new C3659(interfaceC0705, interfaceC4367, c0857, i3), c5362), c5362, 56);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3690(interfaceC0705, c0857, i, i4);
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final String m5791(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final C1489 m5792(Context context, String str) {
        C2993 c2993 = C2993.f10066;
        if (c2993 == null) {
            c2993 = new C2993();
            C2993.f10066 = c2993;
        }
        return c2993.m5587(context, str);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m5793(InterfaceC0705 interfaceC0705, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(2064964257);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(c0857) ? 32 : 16;
        }
        int i3 = 0;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            m5790(interfaceC0705, c0857, c5362, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3690(interfaceC0705, c0857, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static void m5794(AbstractC0866 abstractC0866) {
        if (m5797(abstractC0866) || abstractC0866.f3189 == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            m5794(abstractC0866.f3189);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX INFO: renamed from: ۥۧ */
    public static final int m5795(C5074 c5074, int i) {
        int i2;
        int[] iArr = c5074.f16832;
        int i3 = i + 1;
        int length = c5074.f16831.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static void m5796(AbstractC0866 abstractC0866) {
        if (m5797(abstractC0866) || abstractC0866.f3189 == null) {
            Trace.beginSection(abstractC0866.f3186);
            m5801(abstractC0866);
        } else {
            m5796(abstractC0866.f3189);
            m5801(abstractC0866);
        }
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static boolean m5797(AbstractC0866 abstractC0866) {
        return abstractC0866.f3185 != Thread.currentThread();
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final C2103 m5798(C3467[] c3467Arr, C2103 c2103, C2103 c2104) {
        C3881 c3881 = new C3881(C2103.f6923);
        for (C3467 c3467 : c3467Arr) {
            AbstractC2266 abstractC2266 = (AbstractC2266) c3467.f11503;
            if (c3467.f11502 || !c2103.containsKey(abstractC2266)) {
                c3881.put(abstractC2266, abstractC2266.m4311(c3467, (InterfaceC3633) c2104.get(abstractC2266)));
            }
        }
        return c3881.m6949();
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final InterfaceC0705 m5799(InterfaceC0705 interfaceC0705, C4536 c4536, InterfaceC5731 interfaceC5731) {
        return interfaceC0705.mo1571(new C2256(c4536, interfaceC5731));
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static void m5800(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    /* JADX INFO: renamed from: ۦُ */
    public static void m5801(AbstractC0866 abstractC0866) {
        String strSubstring = abstractC0866.f3187;
        AtomicReference atomicReference = AbstractC5474.f18063;
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r0 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r4 < 0) goto L19;
     */
    /* JADX INFO: renamed from: ۦِ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m5802(int r4, int r5) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r0.getClass()
            if (r5 == 0) goto L4c
            int r1 = r4 / r5
            int r2 = r5 * r1
            int r2 = r4 - r2
            if (r2 != 0) goto L10
            goto L43
        L10:
            r4 = r4 ^ r5
            int r4 = r4 >> 31
            r4 = r4 | 1
            int[] r3 = p000.AbstractC2012.f6631
            int r0 = r0.ordinal()
            r0 = r3[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L43;
                case 3: goto L3d;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L26;
                case 7: goto L26;
                case 8: goto L26;
                default: goto L20;
            }
        L20:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L26:
            int r0 = java.lang.Math.abs(r2)
            int r5 = java.lang.Math.abs(r5)
            int r5 = r5 - r0
            int r0 = r0 - r5
            if (r0 != 0) goto L37
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_EVEN
            goto L43
        L37:
            if (r0 <= 0) goto L43
            goto L3f
        L3a:
            if (r4 <= 0) goto L43
            goto L3f
        L3d:
            if (r4 >= 0) goto L43
        L3f:
            int r1 = r1 + r4
            return r1
        L41:
            if (r2 != 0) goto L44
        L43:
            return r1
        L44:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "mode was UNNECESSARY, but rounding was necessary"
            r4.<init>(r5)
            throw r4
        L4c:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "/ by zero"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3133.m5802(int, int):int");
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static int m5803(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("x (");
            sb.append(i);
            sb.append(") must be > 0");
            throw new IllegalArgumentException(sb.toString());
        }
        switch (AbstractC2012.f6631[roundingMode.ordinal()]) {
            case 1:
                if (!((i > 0) & (((i + (-1)) & i) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static final String m5804(int i, C5362 c5362) {
        return ((Resources) c5362.m8997(AbstractC4354.f14352)).getString(i);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final InterfaceC4707 m5805(InterfaceC4707 interfaceC4707) {
        return ((interfaceC4707 instanceof InterfaceC4311) || (interfaceC4707 instanceof C3173)) ? interfaceC4707 : new C3173(interfaceC4707);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final float m5806(C2384 c2384) {
        return c2384.m1402().f7485 == EnumC1616.f5424 ? Float.intBitsToFloat((int) (c2384.m1394() >> 32)) : Float.intBitsToFloat((int) (c2384.m1394() & 4294967295L));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m5807(String str, String str2, Object obj) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static String m5808(C0533 c0533) {
        StringBuilder sb = new StringBuilder(c0533.size());
        for (int i = 0; i < c0533.size(); i++) {
            byte bMo1188 = c0533.mo1188(i);
            if (bMo1188 == 34) {
                sb.append("\\\"");
            } else if (bMo1188 == 39) {
                sb.append("\\'");
            } else if (bMo1188 != 92) {
                switch (bMo1188) {
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo1188 < 32 || bMo1188 > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo1188 >>> 6) & 3) + 48));
                            sb.append((char) (((bMo1188 >>> 3) & 7) + 48));
                            sb.append((char) ((bMo1188 & 7) + 48));
                        } else {
                            sb.append((char) bMo1188);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static boolean m5809(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final int m5810(int i, List list) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C0158 c0158 = (C0158) list.get(i3);
            if (c0158.f602 > i) {
                b = 1;
            } else {
                b = c0158.f598 <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final int m5811(int i, List list) {
        int i2;
        byte b;
        int i3 = ((C0158) AbstractC0973.m2040(list)).f597;
        if (i > ((C0158) AbstractC0973.m2040(list)).f597) {
            AbstractC3767.m6644("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            C0158 c0158 = (C0158) list.get(i2);
            if (c0158.f600 > i) {
                b = 1;
            } else {
                b = c0158.f597 <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbM8680 = AbstractC5078.m8680(i2, "Found paragraph index ", " should be in range [0, ");
        sbM8680.append(list.size());
        sbM8680.append(").\nDebug info: index=");
        sbM8680.append(i);
        sbM8680.append(", paragraphs=[");
        sbM8680.append(AbstractC0844.m1757(list, null, new C4618(25), 31));
        sbM8680.append(']');
        AbstractC3767.m6644(sbM8680.toString());
        return i2;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m5812(InterfaceC0252 interfaceC0252, Object obj) throws IOException {
        int i;
        int i2;
        int[] iArrM2050;
        int[] iArrM2051;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 3;
        switch (this.f10549) {
            case 0:
                C0451 c0451 = (C0451) obj;
                interfaceC0252.mo530(1, c0451.f1645);
                interfaceC0252.mo530(2, c0451.f1644);
                return;
            case 1:
                C5435 c5435 = (C5435) obj;
                interfaceC0252.mo530(1, c5435.f17929);
                interfaceC0252.mo532(c5435.f17928.longValue(), 2);
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C3193 c3193 = (C3193) obj;
                interfaceC0252.mo530(1, c3193.f10729);
                interfaceC0252.mo532(c3193.f10728, 2);
                interfaceC0252.mo532(c3193.f10727, 3);
                return;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C3041 c3041 = (C3041) obj;
                interfaceC0252.mo530(1, c3041.f10227);
                interfaceC0252.mo530(2, c3041.f10226);
                return;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C4142 c4142 = (C4142) obj;
                interfaceC0252.mo530(1, c4142.f13787);
                interfaceC0252.mo532(AbstractC2552.m4806(c4142.f13785), 2);
                interfaceC0252.mo530(3, c4142.f13776);
                interfaceC0252.mo530(4, c4142.f13788);
                C2775 c2775 = C2775.f9249;
                interfaceC0252.mo535(5, AbstractC0993.m2142(c4142.f13778));
                interfaceC0252.mo535(6, AbstractC0993.m2142(c4142.f13779));
                interfaceC0252.mo532(c4142.f13796, 7);
                interfaceC0252.mo532(c4142.f13786, 8);
                interfaceC0252.mo532(c4142.f13794, 9);
                interfaceC0252.mo532(c4142.f13795, 10);
                int iM6632 = AbstractC3761.m6632(c4142.f13789);
                if (iM6632 == 0) {
                    i = 0;
                } else {
                    if (iM6632 != 1) {
                        C1078.m2275();
                        return;
                    }
                    i = 1;
                }
                interfaceC0252.mo532(i, 11);
                interfaceC0252.mo532(c4142.f13790, 12);
                interfaceC0252.mo532(c4142.f13797, 13);
                interfaceC0252.mo532(c4142.f13800, 14);
                interfaceC0252.mo532(c4142.f13799, 15);
                interfaceC0252.mo532(c4142.f13780 ? 1L : 0L, 16);
                int iM6633 = AbstractC3761.m6632(c4142.f13781);
                if (iM6633 == 0) {
                    i2 = 0;
                } else {
                    if (iM6633 != 1) {
                        C1078.m2275();
                        return;
                    }
                    i2 = 1;
                }
                interfaceC0252.mo532(i2, 17);
                interfaceC0252.mo532(c4142.f13777, 18);
                interfaceC0252.mo532(c4142.f13782, 19);
                interfaceC0252.mo532(c4142.f13793, 20);
                interfaceC0252.mo532(c4142.f13798, 21);
                interfaceC0252.mo532(c4142.f13784, 22);
                String str = c4142.f13792;
                if (str == null) {
                    interfaceC0252.mo531(23);
                } else {
                    interfaceC0252.mo530(23, str);
                }
                Boolean bool = c4142.f13783;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    interfaceC0252.mo531(24);
                } else {
                    interfaceC0252.mo532(numValueOf.intValue(), 24);
                }
                C4628 c4628 = c4142.f13791;
                int i4 = c4628.f15281;
                int iM6634 = AbstractC3761.m6632(i4);
                if (iM6634 == 0) {
                    i3 = 0;
                } else if (iM6634 == 1) {
                    i3 = 1;
                } else if (iM6634 == 2) {
                    i3 = 2;
                } else if (iM6634 != 3) {
                    if (iM6634 == 4) {
                        i3 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i4 != 6) {
                            throw new IllegalArgumentException("Could not convert " + AbstractC5078.m8684(i4) + " to int");
                        }
                        i3 = 5;
                    }
                }
                interfaceC0252.mo532(i3, 25);
                C3783 c3783 = c4628.f15279;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) c3783.f12572;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i5 >= 31) {
                                    iArrM2050 = networkRequest.getTransportTypes();
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i6 = 0; i6 < 10; i6++) {
                                        int i7 = iArr[i6];
                                        if (networkRequest.hasTransport(i7)) {
                                            arrayList.add(Integer.valueOf(i7));
                                        }
                                    }
                                    iArrM2050 = AbstractC0973.m2050(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrM2051 = networkRequest.getCapabilities();
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i8 = 0; i8 < 30; i8++) {
                                        int i9 = iArr2[i8];
                                        if (networkRequest.hasCapability(i9)) {
                                            arrayList2.add(Integer.valueOf(i9));
                                        }
                                    }
                                    iArrM2051 = AbstractC0973.m2050(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrM2050.length);
                                for (int i10 : iArrM2050) {
                                    objectOutputStream.writeInt(i10);
                                }
                                objectOutputStream.writeInt(iArrM2051.length);
                                for (int i11 : iArrM2051) {
                                    objectOutputStream.writeInt(i11);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AbstractC4554.m7932(objectOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC4554.m7932(byteArrayOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                }
                interfaceC0252.mo535(26, byteArray);
                interfaceC0252.mo532(c4628.f15276 ? 1L : 0L, 27);
                interfaceC0252.mo532(c4628.f15282 ? 1L : 0L, 28);
                interfaceC0252.mo532(c4628.f15277 ? 1L : 0L, 29);
                interfaceC0252.mo532(c4628.f15278 ? 1L : 0L, 30);
                interfaceC0252.mo532(c4628.f15284, 31);
                interfaceC0252.mo532(c4628.f15280, 32);
                Set<C5628> set = c4628.f15283;
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (C5628 c5628 : set) {
                                objectOutputStream2.writeUTF(c5628.f18556.toString());
                                objectOutputStream2.writeBoolean(c5628.f18555);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                AbstractC4554.m7932(objectOutputStream2, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            AbstractC4554.m7932(byteArrayOutputStream2, th7);
                            throw th8;
                        }
                    }
                }
                interfaceC0252.mo535(33, byteArray2);
                return;
            default:
                C0472 c0472 = (C0472) obj;
                interfaceC0252.mo530(1, c0472.f1720);
                interfaceC0252.mo530(2, c0472.f1719);
                return;
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public void m5813(InterfaceC3879 interfaceC3879, Object obj) {
        String str;
        if (obj == null) {
            return;
        }
        switch (this.f10549) {
            case 0:
                str = "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
                break;
            case 1:
                str = "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                str = "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                str = "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                str = "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                break;
            default:
                str = "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
                break;
        }
        InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971(str);
        try {
            m5812(interfaceC0252Mo971, obj);
            interfaceC0252Mo971.mo533();
            AbstractC1434.m3052(interfaceC0252Mo971, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1434.m3052(interfaceC0252Mo971, th);
                throw th2;
            }
        }
    }
}
