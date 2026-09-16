package p000;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۥٜۘؕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2164 implements InterfaceC1953 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3033 f7140 = new C3033(0);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3033 f7139 = new C3033(1);

    /* JADX INFO: renamed from: ۥؗ */
    public static final int[] f7136 = new int[0];

    /* JADX INFO: renamed from: ۦؑ */
    public static final long[] f7141 = new long[0];

    /* JADX INFO: renamed from: ۥُ */
    public static final Object[] f7137 = new Object[0];

    /* JADX INFO: renamed from: ۥّ */
    public static final C4036 f7138 = new C4036(26);

    /* JADX INFO: renamed from: ۦۙ */
    public static final C4452 f7142 = new C4452(4);

    /* JADX INFO: renamed from: ۥؓ */
    public static C2877 m4179(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        C1078.m2272(AbstractC5078.m8670(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new C2877(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static void m4180() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static int m4181(List list) {
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: ۥً */
    public static final boolean m4182(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final float m4183(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m4184(final InterfaceC4448 interfaceC4448, final C3564 c3564, final InterfaceC0705 interfaceC0705, final InterfaceC2864 interfaceC2864, final long j, final long j2, final C1890 c1890, final C0857 c0857, C5362 c5362, final int i, final int i2) {
        int i3;
        long j3;
        C0857 c0858;
        int i4;
        c5362.m8979(121669932);
        if ((i & 6) == 0) {
            i3 = (c5362.m8977(interfaceC4448) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c5362.m8963(c3564) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c5362.m8956(56.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c5362.m8956(56.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c5362.m8963(interfaceC0705) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c5362.m8963(interfaceC2864) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c5362.m8961(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            j3 = j2;
            i3 |= c5362.m8961(j3) ? 8388608 : 4194304;
        } else {
            j3 = j2;
        }
        if ((100663296 & i) == 0) {
            i3 |= c5362.m8963(c1890) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= c5362.m8963(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            c0858 = c0857;
            i4 = i2 | (c5362.m8977(c0858) ? 4 : 2);
        } else {
            c0858 = c0857;
            i4 = i2;
        }
        if (c5362.m9011(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            c5362.m8971();
            if ((i & 1) != 0 && !c5362.m8969()) {
                c5362.m8982();
            }
            c5362.m8964();
            c5362.m8957(-282833393);
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            if (objM8999 == obj) {
                objM8999 = new C2243();
                c5362.m8987(objM8999);
            }
            C2243 c2243 = (C2243) objM8999;
            c5362.m9009(false);
            Object objM89910 = c5362.m8999();
            if (objM89910 == obj) {
                objM89910 = new C2582(4);
                c5362.m8987(objM89910);
            }
            InterfaceC0705 interfaceC0705M3510 = AbstractC1697.m3510(interfaceC0705, false, (InterfaceC4745) objM89910);
            float f = c1890.f6271;
            int i5 = i3 >> 21;
            int i6 = i5 & 112;
            boolean zM8963 = c5362.m8963(c2243);
            Object objM89911 = c5362.m8999();
            if (zM8963 || objM89911 == obj) {
                objM89911 = new C1044(c1890.f6271, c1890.f6270, c1890.f6272, c1890.f6269);
                c5362.m8987(objM89911);
            }
            C1044 c1044 = (C1044) objM89911;
            boolean zM8977 = c5362.m8977(c1044) | (((i6 ^ 48) > 32 && c5362.m8963(c1890)) || (i5 & 48) == 32);
            Object objM89912 = c5362.m8999();
            if (zM8977 || objM89912 == obj) {
                objM89912 = new C0023(c1044, c1890, null, 24);
                c5362.m8987(objM89912);
            }
            AbstractC3925.m7030((InterfaceC5731) objM89912, c5362, c1890);
            boolean zM8964 = c5362.m8963(c2243) | c5362.m8977(c1044);
            Object objM89913 = c5362.m8999();
            if (zM8964 || objM89913 == obj) {
                objM89913 = new C0061(c2243, c1044, (InterfaceC0443) null);
                c5362.m8987(objM89913);
            }
            AbstractC3925.m7030((InterfaceC5731) objM89913, c5362, c2243);
            int i7 = i3 >> 6;
            AbstractC0701.m1559(interfaceC4448, interfaceC0705M3510, false, interfaceC2864, j, j2, f, ((C4497) c1044.f3689.f19169.f11359.getValue()).f14871, c2243, AbstractC3925.m7034(-1779603465, new C1874(j3, c3564, c0858, 1), c5362), c5362, (i3 & 14) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 260);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥؘؘؚٚ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC2164.m4184(interfaceC4448, c3564, interfaceC0705, interfaceC2864, j, j2, c1890, c0857, (C5362) obj2, AbstractC3831.m6835(i | 1), AbstractC3831.m6835(i2));
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final void m4185(int i, InterfaceC0705 interfaceC0705, long j, long j2, C0857 c0857, InterfaceC5731 interfaceC5731, C0857 c0858, C5362 c5362, int i2) {
        InterfaceC0705 interfaceC0706;
        long j3;
        long j4;
        InterfaceC5731 interfaceC5732;
        InterfaceC5731 interfaceC5733;
        long j5;
        long j6;
        InterfaceC0705 interfaceC0707;
        c5362.m8979(-1012974221);
        int i3 = i2 | (c5362.m8988(i) ? 4 : 2) | 197808;
        if (c5362.m9011(i3 & 1, (599187 & i3) != 599186)) {
            c5362.m8971();
            if ((i2 & 1) == 0 || c5362.m8969()) {
                long jM216 = AbstractC0118.m216(AbstractC1431.f4910, c5362);
                long jM217 = AbstractC0118.m216(AbstractC1431.f4908, c5362);
                interfaceC5733 = AbstractC0924.f3308;
                j5 = jM217;
                j6 = jM216;
                interfaceC0707 = C4217.f13994;
            } else {
                c5362.m8982();
                interfaceC0707 = interfaceC0705;
                j6 = j;
                j5 = j2;
                interfaceC5733 = interfaceC5731;
            }
            c5362.m8964();
            m4204(interfaceC0707, j6, j5, c0857, interfaceC5733, c0858, c5362, 224262);
            interfaceC5732 = interfaceC5733;
            j4 = j5;
            interfaceC0706 = interfaceC0707;
            j3 = j6;
        } else {
            c5362.m8982();
            interfaceC0706 = interfaceC0705;
            j3 = j;
            j4 = j2;
            interfaceC5732 = interfaceC5731;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0338(i, interfaceC0706, j3, j4, c0857, interfaceC5732, c0858, i2);
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public static int m4186(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        int size2 = arrayList.size();
        int i = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            C0178.m391(size, size2, ") is greater than size (", "toIndex (");
            return 0;
        }
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iM3368 = AbstractC1605.m3368((Comparable) arrayList.get(i3), comparable);
            if (iM3368 < 0) {
                i = i3 + 1;
            } else {
                if (iM3368 <= 0) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static C3251 m4187(C3251 c3251) {
        c3251.m5973();
        c3251.f10918 = true;
        return c3251.f10919 > 0 ? c3251 : C3251.f10917;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static List m4188(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : C2340.f7777;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static C3251 m4189() {
        return new C3251(10);
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static boolean m4190(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static int m4191(View view, int i) {
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = view.getClass().getCanonicalName();
        TypedValue typedValueM5253 = AbstractC2776.m5253(context2.getTheme(), i);
        if (typedValueM5253 == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, context2.getResources().getResourceName(i)));
        }
        int i2 = typedValueM5253.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueM5253.data;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۥۖ */
    public static EnumC2044 m4192(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC2044.f6739;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC2044.f6738;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC2044.f6742;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC2044.f6737;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC2044.f6740;
        }
        C1078.m2272("Unexpected TLS version: ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static ArrayList m4193(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4604(objArr, true));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final void m4194(InterfaceC0705 interfaceC0705, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(155925518);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(c0857) ? 32 : 16;
        }
        int i3 = 3;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            boolean z = c5362.m8997(AbstractC0405.f1488) != null;
            boolean z2 = c5362.m8997(AbstractC0405.f1487) != null;
            if (z && z2) {
                c5362.m8957(-1977187922);
                InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, true);
                int iHashCode = Long.hashCode(c5362.f17657);
                C2103 c2103M8994 = c5362.m8994();
                InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705);
                InterfaceC4576.f15106.getClass();
                C3709 c3709 = C0849.f3049;
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(c3709);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228M2297);
                AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                AbstractC0993.m2146(c5362, C0849.f3050);
                AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                c0857.mo219(c5362, Integer.valueOf((i2 >> 3) & 14));
                c5362.m9009(true);
                c5362.m9009(false);
            } else if (z) {
                c5362.m8957(-1976997706);
                C3133.m5793(interfaceC0705, c0857, c5362, i2 & 126);
                c5362.m9009(false);
            } else if (z2) {
                c5362.m8957(-1976846922);
                AbstractC1211.m2582(interfaceC0705, c0857, c5362, i2 & 126);
                c5362.m9009(false);
            } else {
                c5362.m8957(-1976716505);
                m4211(interfaceC0705, c0857, c5362, i2 & 126);
                c5362.m9009(false);
            }
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3690(interfaceC0705, c0857, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0067 A[EDGE_INSN: B:109:0x0067->B:22:0x0067 BREAK  A[LOOP:2: B:16:0x0049->B:20:0x005a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a A[LOOP:2: B:16:0x0049->B:20:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a7  */
    /* JADX INFO: renamed from: ۥۦ */
    public static C1035 m4195(C4714 c4714) {
        int i;
        int length;
        int length2;
        int i2;
        String string;
        String string2;
        C4714 c4715 = c4714;
        int size = c4715.size();
        int i3 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iM7218 = -1;
        int iM7219 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iM72110 = -1;
        int iM72111 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < size) {
            String strM8049 = c4715.m8049(i3);
            String strM8047 = c4715.m8047(i3);
            if (AbstractC4981.m8360(strM8049, "Cache-Control")) {
                if (str == null) {
                    str = strM8047;
                }
                i = 0;
                while (i < strM8047.length()) {
                    length = strM8047.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strM8047.length();
                            break;
                        }
                        i2 = size;
                        if (AbstractC0684.m1528("=,;", strM8047.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = AbstractC0684.m9760(strM8047.substring(i, length2)).toString();
                    if (length2 != strM8047.length() || strM8047.charAt(length2) == ',' || strM8047.charAt(length2) == ';') {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = AbstractC4031.f13451;
                        int length4 = strM8047.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strM8047.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strM8047.length();
                                break;
                            }
                        }
                        if (length3 >= strM8047.length() || strM8047.charAt(length3) != '\"') {
                            int length5 = strM8047.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strM8047.length();
                                    break;
                                }
                                int i4 = length5;
                                if (AbstractC0684.m1528(",;", strM8047.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i4;
                            }
                            int i5 = length6;
                            string2 = AbstractC0684.m9760(strM8047.substring(length3, length6)).toString();
                            i = i5;
                        } else {
                            int i6 = length3 + 1;
                            int iM1521 = AbstractC0684.m1521('\"', i6, 4, strM8047);
                            string2 = strM8047.substring(i6, iM1521);
                            i = iM1521 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iM7218 = AbstractC4031.m7218(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iM7219 = AbstractC4031.m7218(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iM72110 = AbstractC4031.m7218(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iM72111 = AbstractC4031.m7218(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                    size = i2;
                }
                i3++;
                c4715 = c4714;
                size = size;
            } else {
                if (AbstractC4981.m8360(strM8049, "Pragma")) {
                }
                i3++;
                c4715 = c4714;
                size = size;
            }
            z = false;
            i = 0;
            while (i < strM8047.length()) {
                length = strM8047.length();
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        i2 = size;
                        length2 = strM8047.length();
                        break;
                    }
                    i2 = size;
                    if (AbstractC0684.m1528("=,;", strM8047.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i2;
                }
                string = AbstractC0684.m9760(strM8047.substring(i, length2)).toString();
                if (length2 != strM8047.length()) {
                    i = length2 + 1;
                    string2 = null;
                } else {
                    i = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iM7218 = AbstractC4031.m7218(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iM7219 = AbstractC4031.m7218(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iM72110 = AbstractC4031.m7218(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iM72111 = AbstractC4031.m7218(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z9 = true;
                }
                size = i2;
            }
            i3++;
            c4715 = c4714;
            size = size;
        }
        return new C1035(z2, z3, iM7218, iM7219, z4, z5, z6, iM72110, iM72111, z7, z8, z9, !z ? null : str);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static InterfaceC0705 m4196(InterfaceC0705 interfaceC0705, C2243 c2243) {
        return interfaceC0705.mo1571(new C2860(c2243));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m4197(final InterfaceC4448 interfaceC4448, final InterfaceC0705 interfaceC0705, InterfaceC2864 interfaceC2864, long j, long j2, C1890 c1890, final C0857 c0857, C5362 c5362, final int i, final int i2) {
        InterfaceC4448 interfaceC4449;
        int i3;
        InterfaceC0705 interfaceC0706;
        final InterfaceC2864 interfaceC2864M546;
        final long jM216;
        final long jM215;
        final C1890 c1891;
        C0857 c0858;
        c5362.m8979(748201188);
        if ((i & 6) == 0) {
            interfaceC4449 = interfaceC4448;
            i3 = (c5362.m8977(interfaceC4449) ? 4 : 2) | i;
        } else {
            interfaceC4449 = interfaceC4448;
            i3 = i;
        }
        if ((i & 48) == 0) {
            interfaceC0706 = interfaceC0705;
            i3 |= c5362.m8963(interfaceC0706) ? 32 : 16;
        } else {
            interfaceC0706 = interfaceC0705;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                interfaceC2864M546 = interfaceC2864;
                int i4 = c5362.m8963(interfaceC2864M546) ? 256 : 128;
                i3 |= i4;
            } else {
                interfaceC2864M546 = interfaceC2864;
            }
            i3 |= i4;
        } else {
            interfaceC2864M546 = interfaceC2864;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jM216 = j;
                int i5 = c5362.m8961(jM216) ? 2048 : 1024;
                i3 |= i5;
            } else {
                jM216 = j;
            }
            i3 |= i5;
        } else {
            jM216 = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jM215 = j2;
                int i6 = c5362.m8961(jM215) ? 16384 : 8192;
                i3 |= i6;
            } else {
                jM215 = j2;
            }
            i3 |= i6;
        } else {
            jM215 = j2;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                c1891 = c1890;
                int i7 = c5362.m8963(c1891) ? 131072 : 65536;
                i3 |= i7;
            } else {
                c1891 = c1890;
            }
            i3 |= i7;
        } else {
            c1891 = c1890;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= c5362.m8963(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            c0858 = c0857;
            i3 |= c5362.m8977(c0858) ? 8388608 : 4194304;
        } else {
            c0858 = c0857;
        }
        if (c5362.m9011(i3 & 1, (4793491 & i3) != 4793490)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                if ((i2 & 4) != 0) {
                    interfaceC2864M546 = AbstractC0265.m546(8, c5362);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM216 = AbstractC0118.m216(27, c5362);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jM215 = AbstractC0118.m215(jM216, c5362);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    c1891 = new C1890(6.0f, 6.0f, 6.0f, 8.0f);
                    i3 &= -458753;
                }
            } else {
                c5362.m8982();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
            c5362.m8964();
            int i8 = i3 << 9;
            m4184(interfaceC4449, AbstractC4957.m8333(10, c5362), interfaceC0706, interfaceC2864M546, jM216, jM215, c1891, c0858, c5362, (i3 & 14) | 3456 | (57344 & i8) | (458752 & i8) | (3670016 & i8) | (29360128 & i8) | (234881024 & i8) | (i8 & 1879048192), (i3 >> 21) & 14);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦًؓؗۛ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2164.m4197(interfaceC4448, interfaceC0705, interfaceC2864M546, jM216, jM215, c1891, c0857, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final InterfaceC0705 m4198(InterfaceC0705 interfaceC0705, InterfaceC4745 interfaceC4745) {
        return interfaceC0705.mo1571(new C3274(interfaceC4745));
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final List m4199(InterfaceC0252 interfaceC0252) {
        int iM5127 = AbstractC2765.m5127(interfaceC0252, "id");
        int iM5128 = AbstractC2765.m5127(interfaceC0252, "seq");
        int iM5129 = AbstractC2765.m5127(interfaceC0252, "from");
        int iM51210 = AbstractC2765.m5127(interfaceC0252, "to");
        C3251 c3251M4189 = m4189();
        while (interfaceC0252.mo533()) {
            c3251M4189.add(new C3974(interfaceC0252.mo534(iM5129), (int) interfaceC0252.getLong(iM5127), (int) interfaceC0252.getLong(iM5128), interfaceC0252.mo534(iM51210)));
        }
        return AbstractC0973.m2042(m4187(c3251M4189));
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static void m4200(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final void m4201(C5535 c5535, InterfaceC1437 interfaceC1437, InterfaceC4745 interfaceC4745, float f) {
        float fMo927;
        try {
            fMo927 = interfaceC1437.mo927(f);
        } catch (CancellationException unused) {
            c5535.m9211();
            fMo927 = 0.0f;
        }
        interfaceC4745.mo211(Float.valueOf(fMo927));
        if (Math.abs(f - fMo927) > 0.5f) {
            c5535.m9211();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: ۦٌ */
    public static final Object m4202(InterfaceC1437 interfaceC1437, float f, float f2, C3411 c3411, C0969 c0969, InterfaceC4745 interfaceC4745, AbstractC0772 abstractC0772) {
        C4445 c4445;
        float fFloatValue;
        C3411 c3412;
        C1916 c1916;
        float f3 = f;
        if (abstractC0772 instanceof C4445) {
            c4445 = (C4445) abstractC0772;
            int i = c4445.f14656;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4445.f14656 = i - Integer.MIN_VALUE;
            } else {
                c4445 = new C4445(abstractC0772);
            }
        } else {
            c4445 = new C4445(abstractC0772);
        }
        C4445 c4446 = c4445;
        Object obj = c4446.f14658;
        int i2 = c4446.f14656;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C1916 c1917 = new C1916();
            fFloatValue = ((Number) c3411.m6174()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) c3411.m6174()).floatValue() == 0.0f;
            C5829 c5829 = new C5829(f2, c1917, interfaceC1437, interfaceC4745, 1);
            c4446.f14655 = c3411;
            c4446.f14657 = c1917;
            c4446.f14654 = f3;
            c4446.f14653 = fFloatValue;
            c4446.f14656 = 1;
            Object objM6875 = AbstractC3831.m6875(c3411, f4, c0969, !z, c5829, c4446);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM6875 == enumC2282) {
                return enumC2282;
            }
            c3412 = c3411;
            c1916 = c1917;
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = c4446.f14653;
            float f6 = c4446.f14654;
            c1916 = c4446.f14657;
            c3412 = c4446.f14655;
            AbstractC0186.m409(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new C3241(new Float(f3 - c1916.f6312), AbstractC4554.m7892(c3412, 0.0f, m4183(((Number) c3412.m6174()).floatValue(), fFloatValue), 29));
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final C2886 m4203(InterfaceC3879 interfaceC3879, String str, boolean z) {
        InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM5127 = AbstractC2765.m5127(interfaceC0252Mo971, "seqno");
            int iM5128 = AbstractC2765.m5127(interfaceC0252Mo971, "cid");
            int iM5129 = AbstractC2765.m5127(interfaceC0252Mo971, "name");
            int iM51210 = AbstractC2765.m5127(interfaceC0252Mo971, "desc");
            if (iM5127 != -1 && iM5128 != -1 && iM5129 != -1 && iM51210 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (interfaceC0252Mo971.mo533()) {
                    if (((int) interfaceC0252Mo971.getLong(iM5128)) >= 0) {
                        int i = (int) interfaceC0252Mo971.getLong(iM5127);
                        String strMo534 = interfaceC0252Mo971.mo534(iM5129);
                        String str2 = interfaceC0252Mo971.getLong(iM51210) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strMo534);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listM2055 = AbstractC0973.m2055(linkedHashMap.entrySet(), new C1206(12));
                ArrayList arrayList = new ArrayList(AbstractC5573.m9402(listM2055, 10));
                Iterator it = listM2055.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM2039 = AbstractC0973.m2039(arrayList);
                List listM2056 = AbstractC0973.m2055(linkedHashMap2.entrySet(), new C1206(13));
                ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(listM2056, 10));
                Iterator it2 = listM2056.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                C2886 c2886 = new C2886(str, z, listM2039, AbstractC0973.m2039(arrayList2));
                AbstractC1434.m3052(interfaceC0252Mo971, null);
                return c2886;
            }
            AbstractC1434.m3052(interfaceC0252Mo971, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1434.m3052(interfaceC0252Mo971, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final void m4204(InterfaceC0705 interfaceC0705, long j, long j2, C0857 c0857, InterfaceC5731 interfaceC5731, C0857 c0858, C5362 c5362, int i) {
        int i2;
        c5362.m8979(1955286154);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8961(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8961(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m8977(c0857) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c5362.m8977(interfaceC5731) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c5362.m8977(c0858) ? 131072 : 65536;
        }
        if (c5362.m9011(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            AbstractC0701.m1560(AbstractC1697.m3510(interfaceC0705, false, new C4215(11)), null, j, j2, 0.0f, 0.0f, AbstractC3925.m7034(830280655, new C3589(c0858, interfaceC5731, c0857), c5362), c5362, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0338(interfaceC0705, j, j2, c0857, interfaceC5731, c0858, i);
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static int m4205(Context context, int i) {
        Integer numValueOf;
        TypedValue typedValueM5253 = AbstractC2776.m5253(context.getTheme(), i);
        if (typedValueM5253 != null) {
            int i2 = typedValueM5253.resourceId;
            numValueOf = Integer.valueOf(i2 != 0 ? context.getColor(i2) : typedValueM5253.data);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static int m4206(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static boolean m4207(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static int m4208(float f, int i, int i2) {
        return AbstractC1373.m2910(AbstractC1373.m2912(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final void m4209(InterfaceC4112 interfaceC4112, Object obj, int i, Object obj2, C5362 c5362, int i2) {
        c5362.m8979(1439843069);
        int i3 = (c5362.m8963(interfaceC4112) ? 4 : 2) | i2 | (c5362.m8963(obj) ? 32 : 16) | (c5362.m8988(i) ? 256 : 128) | (c5362.m8963(obj2) ? 2048 : 1024);
        if (c5362.m9011(i3 & 1, (i3 & 1171) != 1170)) {
            ((InterfaceC0770) obj).mo1661(obj2, AbstractC3925.m7034(980966366, new C0016(i, interfaceC4112, obj2), c5362), c5362, 48);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0021(interfaceC4112, obj, i, obj2, i2, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦۗ */
    public static final Object m4210(InterfaceC1437 interfaceC1437, float f, C3411 c3411, C5468 c5468, InterfaceC4745 interfaceC4745, AbstractC0772 abstractC0772) {
        C2430 c2430;
        float f2;
        C1916 c1916;
        if (abstractC0772 instanceof C2430) {
            c2430 = (C2430) abstractC0772;
            int i = c2430.f8093;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2430.f8093 = i - Integer.MIN_VALUE;
            } else {
                c2430 = new C2430(abstractC0772);
            }
        } else {
            c2430 = new C2430(abstractC0772);
        }
        Object obj = c2430.f8092;
        int i2 = c2430.f8093;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C1916 c1917 = new C1916();
            boolean z = ((Number) c3411.m6174()).floatValue() == 0.0f;
            C5829 c5829 = new C5829(f, c1917, interfaceC1437, interfaceC4745, 0);
            c2430.f8089 = c3411;
            c2430.f8091 = c1917;
            c2430.f8090 = f;
            c2430.f8093 = 1;
            Object objM6843 = AbstractC3831.m6843(c3411, c5468, !z, c5829, c2430);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM6843 == enumC2282) {
                return enumC2282;
            }
            f2 = f;
            c1916 = c1917;
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = c2430.f8090;
            c1916 = c2430.f8091;
            c3411 = c2430.f8089;
            AbstractC0186.m409(obj);
        }
        return new C3241(new Float(f2 - c1916.f6312), c3411);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final void m4211(InterfaceC0705 interfaceC0705, C0857 c0857, C5362 c5362, int i) {
        int i2;
        InterfaceC0705 interfaceC0706;
        C0857 c0858;
        c5362.m8979(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(c0857) ? 32 : 16;
        }
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
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
                objM89910 = new C0681(interfaceC4367, 10);
                c5362.m8987(objM89910);
            }
            InterfaceC4448 interfaceC4448 = (InterfaceC4448) objM89910;
            C5236 c5236 = AbstractC1211.f4185;
            C4817 c4817M1962 = AbstractC0949.m1962(AbstractC0993.f3539, c5362, 6);
            interfaceC0706 = interfaceC0705;
            c0858 = c0857;
            C4773.m8123(new C3467[]{AbstractC0405.f1487.mo4313(C3133.m5788(interfaceC4448, c5362, 2)), AbstractC0405.f1488.mo4313(c4817M1962)}, AbstractC3925.m7034(1070596993, new C4135(interfaceC0706, interfaceC4367, c0858, c4817M1962, interfaceC4448), c5362), c5362, 56);
        } else {
            interfaceC0706 = interfaceC0705;
            c0858 = c0857;
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3690(interfaceC0706, c0858, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static ArrayList m4212(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4604(objArr, true));
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final boolean m4213(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final ExtractedText m4214(C5745 c5745) {
        ExtractedText extractedText = new ExtractedText();
        String str = c5745.f18944.f4307;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c5745.f18943;
        extractedText.selectionStart = C3346.m6109(j);
        extractedText.selectionEnd = C3346.m6108(j);
        extractedText.flags = !AbstractC0684.m1528(c5745.f18944.f4307, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final int m4215(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static String m4216(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + C3133.m5791(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + C3133.m5791(Float.intBitsToFloat(i)) + ", " + C3133.m5791(Float.intBitsToFloat(i2)) + ')';
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final int m4217(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    @Override // p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥؗ */
    public void mo3065() {
    }

    @Override // p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥۗ */
    public void mo3066() {
    }
}
