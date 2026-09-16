package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۗۥٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2133 {

    /* JADX INFO: renamed from: ۦٌ */
    public static C3963 f7002;

    /* JADX INFO: renamed from: ۥۣ */
    public static final char[] f6999 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ۥۗ */
    public static final char[] f6997 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0857 f6994 = new C0857(-1571120048, new C2278(), false);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0857 f7000 = new C0857(-1455401925, new C2463(0), false);

    /* JADX INFO: renamed from: ۥُ */
    public static final C4992 f6995 = new C4992(9);

    /* JADX INFO: renamed from: ۥّ */
    public static final byte[] f6996 = {48, 49, 53, 0};

    /* JADX INFO: renamed from: ۦۙ */
    public static final byte[] f7006 = {48, 49, 48, 0};

    /* JADX INFO: renamed from: ۥۜ */
    public static final byte[] f6998 = {48, 48, 57, 0};

    /* JADX INFO: renamed from: ۦٛ */
    public static final byte[] f7004 = {48, 48, 53, 0};

    /* JADX INFO: renamed from: ۦِ */
    public static final byte[] f7003 = {48, 48, 49, 0};

    /* JADX INFO: renamed from: ۦۗ */
    public static final byte[] f7005 = {48, 48, 49, 0};

    /* JADX INFO: renamed from: ۦؚ */
    public static final byte[] f7001 = {48, 48, 50, 0};

    /* JADX INFO: renamed from: ۥؓ */
    public static boolean m4120(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static final int m4121(C4523 c4523) {
        int iM7840;
        int i = c4523.f14948;
        int iM7841 = c4523.m7840(0);
        while (c4523.f14948 != 0 && c4523.m7840(0) == iM7841) {
            int i2 = c4523.f14948;
            if (i2 == 0) {
                C0178.m384("IntList is empty.");
                return 0;
            }
            c4523.m7841(0, c4523.f14949[i2 - 1]);
            c4523.m7844(c4523.f14948 - 1);
            int i3 = c4523.f14948;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iM7842 = c4523.m7840(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iM7843 = c4523.m7840(i7);
                if (i6 < i3 && (iM7840 = c4523.m7840(i6)) > iM7843) {
                    if (iM7840 <= iM7842) {
                        break;
                    }
                    c4523.m7841(i5, iM7840);
                    c4523.m7841(i6, iM7842);
                    i5 = i6;
                } else {
                    if (iM7843 <= iM7842) {
                        break;
                    }
                    c4523.m7841(i5, iM7843);
                    c4523.m7841(i7, iM7842);
                    i5 = i7;
                }
            }
        }
        return iM7841;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static final boolean m4122(C5362 c5362) {
        return (((Configuration) c5362.m8997(AbstractC4354.f14356)).uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m4123(C4523 c4523, int i) {
        if (c4523.f14948 == 0 || !(c4523.m7840(0) == i || c4523.m7840(c4523.f14948 - 1) == i)) {
            int i2 = c4523.f14948;
            c4523.m7843(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iM7840 = c4523.m7840(i3);
                if (i <= iM7840) {
                    break;
                }
                c4523.m7841(i2, iM7840);
                i2 = i3;
            }
            c4523.m7841(i2, i);
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public static InterfaceC5370 m4124(InterfaceC1674 interfaceC1674, int i, int i2, int i3, int i4, int i5, InterfaceC2427 interfaceC2427, List list, AbstractC0275[] abstractC0275Arr, int i6) {
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        List list2 = list;
        long j = i5;
        int[] iArr = new int[i6];
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i11 < i6) {
            InterfaceC1827 interfaceC1827 = (InterfaceC1827) list2.get(i11);
            float fM1042 = AbstractC0487.m1042(AbstractC0487.m1068(interfaceC1827));
            if (fM1042 > 0.0f) {
                f2 += fM1042;
                i12++;
                i8 = i11;
            } else {
                int i14 = i3 - i13;
                AbstractC0275 abstractC0275Mo3597 = abstractC0275Arr[i11];
                if (abstractC0275Mo3597 == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i8 = i11;
                        i9 = i12;
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i8 = i11;
                        i9 = i12;
                        i10 = i14 < 0 ? 0 : i14;
                    }
                    abstractC0275Mo3597 = interfaceC1827.mo3597(interfaceC1674.mo3502(0, i10, i4, false));
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                AbstractC0275 abstractC0275 = abstractC0275Mo3597;
                int iMo3506 = interfaceC1674.mo3506(abstractC0275);
                int iMo3503 = interfaceC1674.mo3503(abstractC0275);
                iArr[i8] = iMo3506;
                int i15 = i14 - iMo3506;
                if (i15 < 0) {
                    i15 = 0;
                }
                iMin = Math.min(i5, i15);
                i13 += iMo3506 + iMin;
                iMax = Math.max(iMax, iMo3503);
                abstractC0275Arr[i8] = abstractC0275;
                i12 = i9;
            }
            i11 = i8 + 1;
            j = j;
        }
        long j2 = j;
        int i16 = i12;
        if (i16 == 0) {
            i13 -= iMin;
            i7 = 0;
        } else {
            long j3 = ((long) (i16 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i13)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i17 = 0; i17 < i6; i17++) {
                jRound -= (long) Math.round(AbstractC0487.m1042(AbstractC0487.m1068((InterfaceC1827) list2.get(i17))) * f3);
            }
            int i18 = iMax;
            int i19 = 0;
            int i20 = 0;
            while (i19 < i6) {
                if (abstractC0275Arr[i19] == null) {
                    InterfaceC1827 interfaceC1828 = (InterfaceC1827) list2.get(i19);
                    C0522 c0522M1068 = AbstractC0487.m1068(interfaceC1828);
                    float fM1043 = AbstractC0487.m1042(c0522M1068);
                    if (fM1043 <= 0.0f) {
                        AbstractC5233.m8861("All weights <= 0 should have placeables");
                    }
                    f = f3;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fM1043 * f) + iSignum);
                    AbstractC0275 abstractC0275Mo3598 = interfaceC1828.mo3597(interfaceC1674.mo3502((!(c0522M1068 != null ? c0522M1068.f1851 : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iMo3507 = interfaceC1674.mo3506(abstractC0275Mo3598);
                    int iMo3504 = interfaceC1674.mo3503(abstractC0275Mo3598);
                    iArr[i19] = iMo3507;
                    i20 += iMo3507;
                    int iMax3 = Math.max(i18, iMo3504);
                    abstractC0275Arr[i19] = abstractC0275Mo3598;
                    i18 = iMax3;
                } else {
                    f = f3;
                }
                i19++;
                list2 = list;
                f3 = f;
            }
            i7 = (int) (((long) i20) + j3);
            int i21 = i3 - i13;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i21) {
                i7 = i21;
            }
            iMax = i18;
        }
        int i22 = i7 + i13;
        if (i22 < 0) {
            i22 = 0;
        }
        int iMax4 = Math.max(i22, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        interfaceC1674.mo3505(iMax4, iArr, iArr2, interfaceC2427);
        return interfaceC1674.mo3504(abstractC0275Arr, interfaceC2427, iArr2, iMax4, iMax5);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final C5686 m4125(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (C5686) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final Object m4126(InterfaceC4038 interfaceC4038, InterfaceC5731 interfaceC5731, InterfaceC0443 interfaceC0443) {
        Object objM4552 = ((C2439) interfaceC4038).m4552(new C1294(interfaceC0443.mo334(), interfaceC5731, null, 0), interfaceC0443);
        return objM4552 == EnumC2282.f7590 ? objM4552 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static synchronized long m4127(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final String m4128() {
        byte[] bArr = new byte[16];
        AbstractC0481.f1747.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long jM9258 = AbstractC5537.m9258(0, bArr);
        long jM9259 = AbstractC5537.m9258(8, bArr);
        return ((jM9258 == 0 && jM9259 == 0) ? C2665.f8827 : new C2665(jM9258, jM9259)).toString();
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static boolean m4129(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iM4152 = m4152(context, str, "bool");
            if (iM4152 > 0) {
                return resources.getBoolean(iM4152);
            }
            int iM4153 = m4152(context, str, "string");
            if (iM4153 > 0) {
                return Boolean.parseBoolean(context.getString(iM4153));
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static C3510 m4130(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        EnumC1658 enumC1658 = EnumC1658.f5517;
        if (zStartsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC1658 = EnumC1658.f5512;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new C3510(enumC1658, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final C2404 m4131(InterfaceC3534 interfaceC3534) {
        C2404 c2404 = (C2404) interfaceC3534.mo865(C0373.f1374);
        if (c2404 != null) {
            return c2404;
        }
        C1078.m2276("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static final double m4132(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static boolean m4133() {
        boolean zM4150 = m4150();
        String str = Build.TAGS;
        if ((zM4150 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zM4150 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static File m4134(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        C1078.m2276("getFilesDir returned null twice.");
        return null;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static String m4135(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f6999;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0237  */
    /* JADX WARN: Code duplicated, block: B:154:0x0263  */
    /* JADX WARN: Code duplicated, block: B:155:0x0267  */
    /* JADX WARN: Code duplicated, block: B:160:0x0282  */
    /* JADX WARN: Code duplicated, block: B:162:0x029c  */
    /* JADX WARN: Code duplicated, block: B:164:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:175:0x0310  */
    /* JADX WARN: Code duplicated, block: B:178:0x0329  */
    /* JADX WARN: Code duplicated, block: B:180:0x032e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0333  */
    /* JADX WARN: Code duplicated, block: B:185:0x0338  */
    /* JADX WARN: Code duplicated, block: B:188:0x0340  */
    /* JADX WARN: Code duplicated, block: B:190:0x037b  */
    /* JADX WARN: Code duplicated, block: B:191:0x037f  */
    /* JADX WARN: Code duplicated, block: B:196:0x039a  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:202:0x0405  */
    /* JADX WARN: Code duplicated, block: B:203:0x0409  */
    /* JADX WARN: Code duplicated, block: B:208:0x0424  */
    /* JADX WARN: Code duplicated, block: B:210:0x0440  */
    /* JADX WARN: Code duplicated, block: B:213:0x045e  */
    /* JADX WARN: Code duplicated, block: B:215:0x046f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0473  */
    /* JADX WARN: Code duplicated, block: B:220:0x047c  */
    /* JADX WARN: Code duplicated, block: B:222:0x0480  */
    /* JADX WARN: Code duplicated, block: B:226:0x0489  */
    /* JADX WARN: Code duplicated, block: B:230:0x0490  */
    /* JADX WARN: Code duplicated, block: B:233:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:234:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:237:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:239:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:242:0x0504  */
    /* JADX WARN: Code duplicated, block: B:245:0x051c  */
    /* JADX WARN: Code duplicated, block: B:246:0x051f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0523  */
    /* JADX WARN: Code duplicated, block: B:249:0x0526  */
    /* JADX WARN: Code duplicated, block: B:252:0x0534  */
    /* JADX WARN: Code duplicated, block: B:253:0x0556  */
    /* JADX WARN: Code duplicated, block: B:256:0x0584  */
    /* JADX WARN: Code duplicated, block: B:257:0x0588  */
    /* JADX WARN: Code duplicated, block: B:262:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:265:0x05be  */
    /* JADX WARN: Code duplicated, block: B:267:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:268:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:273:0x0619  */
    /* JADX WARN: Code duplicated, block: B:275:0x0635  */
    /* JADX INFO: renamed from: ۥۗ */
    public static final void m4136(InterfaceC5731 interfaceC5731, final InterfaceC5731 interfaceC5732, InterfaceC2609 interfaceC2609, final InterfaceC5731 interfaceC5733, final InterfaceC5731 interfaceC5734, InterfaceC5731 interfaceC5735, final InterfaceC5731 interfaceC5736, final boolean z, final C3176 c3176, final C4444 c4444, final C0857 c0857, InterfaceC5731 interfaceC5737, InterfaceC1291 interfaceC1291, C5362 c5362, final int i, final int i2) {
        int i3;
        int i4;
        InterfaceC5731 interfaceC5738;
        InterfaceC2609 interfaceC26010;
        C3039 c3039;
        C3136 c3136;
        C0573 c0573;
        boolean z2;
        float fM9379;
        float fM9387;
        float fM1069;
        float f;
        float f2;
        C3039 c30310;
        InterfaceC0705 interfaceC0705M9381;
        float f3;
        float f4;
        InterfaceC0705 interfaceC0705M9382;
        int iM1958;
        boolean z3;
        int iM1959;
        C4444 c4445;
        boolean z4;
        Object objM8999;
        int i5;
        int iM19510;
        int iM19511;
        int iM19512;
        int iM19513;
        int iM19514;
        final InterfaceC5731 interfaceC5739 = interfaceC5731;
        final InterfaceC5731 interfaceC57310 = interfaceC5735;
        InterfaceC1291 interfaceC1292 = interfaceC1291;
        C3039 c30311 = C1298.f4431;
        C3039 c30312 = C1298.f4456;
        c5362.m8979(-1086465551);
        int i6 = i & 6;
        C4217 c4217 = C4217.f13994;
        if (i6 == 0) {
            i3 = i | (c5362.m8963(c4217) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c5362.m8977(interfaceC5739) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c5362.m8977(interfaceC5732) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c5362.m8977(interfaceC2609) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c5362.m8977(interfaceC5733) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c5362.m8977(interfaceC5734) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c5362.m8977(interfaceC57310) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= c5362.m8977(interfaceC5736) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= c5362.m9006(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c5362.m8963(c3176) ? 536870912 : 268435456;
        }
        int i7 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? c5362.m8963(c4444) : c5362.m8977(c4444) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c5362.m8977(c0857) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c5362.m8977(interfaceC5737) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c5362.m8963(interfaceC1292) ? 2048 : 1024;
        }
        int i8 = i4;
        if (c5362.m9011(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            float fM1074 = AbstractC0487.m1074(c5362);
            int i9 = i8 & 14;
            boolean zM8956 = ((i8 & 7168) == 2048) | ((i7 & 234881024) == 67108864) | ((i7 & 1879048192) == 536870912) | (i9 == 4 || ((i8 & 8) != 0 && c5362.m8963(c4444))) | c5362.m8956(fM1074);
            Object objM89910 = c5362.m8999();
            Object obj = C2850.f9517;
            if (zM8956 || objM89910 == obj) {
                Object c4580 = new C4580(z, c3176, c4444, interfaceC1292, fM1074);
                c5362.m8987(c4580);
                objM89910 = c4580;
            }
            C4580 c4581 = (C4580) objM89910;
            EnumC2459 enumC2459 = (EnumC2459) c5362.m8997(AbstractC2853.f9555);
            int iM19515 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01e4: INVOKE (r14v7 'interfaceC0705M2161' ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ) = (r54v0 'c5362' ￛﾦￛﾟ￘ﾗ￙ﾙￛﾟ), (r26v0 ?? I:??[OBJECT, ARRAY]) STATIC call: ￛﾥ￙ﾎ￘ﾒ￘ﾑ￙ﾒ.ￛﾦￛﾜ(ￛﾦￛﾟ￘ﾗ￙ﾙￛﾟ, ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ):ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ A[DECLARE_VAR, MD:(ￛﾦￛﾟ￘ﾗ￙ﾙￛﾟ, ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ):ￛﾥ￘ﾙ￘ﾑ￙ﾟ￘ﾔ (m)] (LINE:16) in method: ￛﾥￛﾗￛﾥ￙ﾚ.ￛﾥￛﾗ(ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾥￛﾢ￘ﾓￛﾙ￙ﾔ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, boolean, ￛﾦ￘ﾓ￘ﾔ￙ﾗ￘ﾗ, ￛﾦ￙ﾘ￘ﾖ￙ﾖￛﾛ, ￛﾥ￙ﾋ￘ﾖￛﾠ￘ﾒ, ￛﾦￛﾦ￘ﾑ￘ﾑ￘ﾙ, ￛﾥ￙ﾓ￘ﾖ￙ﾌ￙ﾓ, ￛﾦￛﾟ￘ﾗ￙ﾙￛﾟ, int, int):void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1654
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC2133.m4136(ۦۦؙؑؑ, ۦۦؙؑؑ, ۥۢؓۙٔ, ۦۦؙؑؑ, ۦۦؙؑؑ, ۦۦؙؑؑ, ۦۦؙؑؑ, boolean, ۦؓؔٗؗ, ۦٖ٘ؖۛ, ۥًؖ۠ؒ, ۦۦؙؑؑ, ۥٌٓؖٓ, ۦ۟ؗٙ۟, int, int):void");
        }

        /* JADX INFO: renamed from: ۥۙ */
        public static final Class m4137(Type type) {
            if (type instanceof Class) {
                return (Class) type;
            }
            if (type instanceof ParameterizedType) {
                return m4137(((ParameterizedType) type).getRawType());
            }
            if (type instanceof WildcardType) {
                return m4137((Type) AbstractC0246.m517(((WildcardType) type).getUpperBounds()));
            }
            if (type instanceof GenericArrayType) {
                return m4137(((GenericArrayType) type).getGenericComponentType());
            }
            StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb.append(type);
            C2316.m4363(sb, " has type ", AbstractC5041.m8557(type.getClass()));
            return null;
        }

        /* JADX INFO: renamed from: ۥۜ */
        public static void m4138(Closeable closeable, String str) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", str, e);
                }
            }
        }

        /* JADX INFO: renamed from: ۥۣ */
        public static final void m4139(final C2384 c2384, InterfaceC0705 interfaceC0705, InterfaceC1291 interfaceC1291, C1298 c1298, final int i, final C4274 c4274, C1604 c1604, boolean z, InterfaceC3028 interfaceC3028, C0373 c0373, C2851 c2851, final C0857 c0857, C5362 c5362, final int i2) {
            int i3;
            final InterfaceC0705 interfaceC0706;
            final InterfaceC1291 interfaceC1292;
            final C1298 c1299;
            final C1604 c1605;
            final boolean z2;
            final InterfaceC3028 interfaceC3029;
            final C0373 c0374;
            final C2851 c2852;
            C1604 c1606;
            InterfaceC1291 interfaceC1293;
            C2851 c2851M8206;
            boolean z3;
            InterfaceC3028 interfaceC30210;
            InterfaceC0705 interfaceC0707;
            int i4;
            C1298 c12910;
            c5362.m8979(1860873769);
            if ((i2 & 6) == 0) {
                i3 = (c5362.m8963(c2384) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            int i5 = i3 | 3504;
            if ((i2 & 24576) == 0) {
                i5 |= c5362.m8988(i) ? 16384 : 8192;
            }
            int i6 = i5 | 196608;
            if ((1572864 & i2) == 0) {
                i6 |= c5362.m8963(c4274) ? 1048576 : 524288;
            }
            if ((12582912 & i2) == 0) {
                i6 |= 4194304;
            }
            int i7 = i6 | 905969664;
            if (c5362.m9011(i7 & 1, (306783379 & i7) != 306783378)) {
                c5362.m8971();
                if ((i2 & 1) == 0 || c5362.m8969()) {
                    C1393 c1393 = new C1393(0.0f, 0.0f, 0.0f, 0.0f);
                    C1298 c12911 = C1298.f4445;
                    int i8 = 196608 | (i7 & 14);
                    C3487 c3487 = new C3487();
                    C5468 c5468M6228 = AbstractC3451.m6228(c5362);
                    Map map = AbstractC4168.f13869;
                    C0969 c0969M7811 = AbstractC4489.m7811(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                    Object obj = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
                    EnumC2459 enumC2459 = (EnumC2459) c5362.m8997(AbstractC2853.f9555);
                    boolean zM8963 = ((((i8 & 14) ^ 6) > 4 && c5362.m8963(c2384)) || (i8 & 6) == 4) | c5362.m8963(c5468M6228) | c5362.m8963(c0969M7811) | c5362.m8963(c3487) | c5362.m8963(obj) | c5362.m8988(enumC2459.ordinal());
                    Object objM8999 = c5362.m8999();
                    Object obj2 = C2850.f9517;
                    if (zM8963 || objM8999 == obj2) {
                        Object c1607 = new C1604(new C3369(c2384, new C4513(3, c2384, enumC2459), c3487), c5468M6228, c0969M7811);
                        c5362.m8987(c1607);
                        objM8999 = c1607;
                    }
                    c1606 = (C1604) objM8999;
                    int i9 = i7 & (-29360129);
                    int i10 = (i7 & 14) | 432;
                    boolean z4 = (((i10 & 14) ^ 6) > 4 && c5362.m8963(c2384)) || (i10 & 6) == 4;
                    Object objM89910 = c5362.m8999();
                    if (z4 || objM89910 == obj2) {
                        objM89910 = new C5206(c2384);
                        c5362.m8987(objM89910);
                    }
                    c0374 = C0373.f1380;
                    interfaceC1293 = c1393;
                    c2851M8206 = AbstractC4834.m8206(c5362);
                    z3 = true;
                    interfaceC30210 = (C5206) objM89910;
                    interfaceC0707 = C4217.f13994;
                    i4 = i9;
                    c12910 = c12911;
                } else {
                    c5362.m8982();
                    interfaceC1293 = interfaceC1291;
                    c12910 = c1298;
                    c1606 = c1604;
                    z3 = z;
                    interfaceC30210 = interfaceC3028;
                    c0374 = c0373;
                    c2851M8206 = c2851;
                    i4 = i7 & (-29360129);
                    interfaceC0707 = interfaceC0705;
                }
                c5362.m8964();
                int i11 = i4 >> 6;
                int i12 = i4 << 12;
                AbstractC4593.m7965(interfaceC0707, c2384, interfaceC1293, c1606, z3, c2851M8206, i, c12910, interfaceC30210, c4274, c0374, c0857, c5362, ((i4 >> 3) & 14) | 24576 | ((i4 << 3) & 112) | (i4 & 896) | ((i4 >> 18) & 7168) | (3670016 & i11) | (i12 & 234881024) | (i12 & 1879048192), ((i4 >> 9) & 14) | 3456 | (i11 & 57344) | 1769472);
                c2852 = c2851M8206;
                interfaceC3029 = interfaceC30210;
                z2 = z3;
                c1299 = c12910;
                c1605 = c1606;
                interfaceC1292 = interfaceC1293;
                interfaceC0706 = interfaceC0707;
            } else {
                c5362.m8982();
                interfaceC0706 = interfaceC0705;
                interfaceC1292 = interfaceC1291;
                c1299 = c1298;
                c1605 = c1604;
                z2 = z;
                interfaceC3029 = interfaceC3028;
                c0374 = c0373;
                c2852 = c2851;
            }
            C5863 c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥٌٞؖ٘
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iM6835 = AbstractC3831.m6835(i2 | 1);
                        AbstractC2133.m4139(c2384, interfaceC0706, interfaceC1292, c1299, i, c4274, c1605, z2, interfaceC3029, c0374, c2852, c0857, (C5362) obj3, iM6835);
                        return C2358.f7817;
                    }
                };
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v18 ￛﾦ￙ﾝ￘ﾒￛﾙ￘ﾐ, still in use, count: 2, list:
              (r8v18 ￛﾦ￙ﾝ￘ﾒￛﾙ￘ﾐ) from 0x007a: IF  (r8v18 ￛﾦ￙ﾝ￘ﾒￛﾙ￘ﾐ) == (null ￛﾦ￙ﾝ￘ﾒￛﾙ￘ﾐ)  -> B:48:0x00c9 A[HIDDEN] (LINE:123)
              (r8v18 ￛﾦ￙ﾝ￘ﾒￛﾙ￘ﾐ) from 0x007d: PHI (r8 I:??) = (r8v18 ￛﾦ￙ﾝ￘ﾒￛﾙ￘ﾐ) binds: [B:31:0x007a] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:133)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        /* JADX INFO: renamed from: ۥۦ */
        public static final p000.InterfaceC4734 m4140(java.lang.reflect.Type r7, boolean r8) {
            /*
                Method dump skipped, instruction units count: 450
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC2133.m4140(java.lang.reflect.Type, boolean):ۦٝؒۙؐ");
        }

        /* JADX INFO: renamed from: ۥۧ */
        public static final InterfaceC0705 m4141(InterfaceC4464 interfaceC4464, C5086 c5086, EnumC1616 enumC1616) {
            return new C3356(interfaceC4464, c5086, enumC1616);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0068  */
        /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:22:0x0066->B:26:0x0073, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:0x004e A[EDGE_INSN: B:31:0x004e->B:18:0x004e BREAK  A[LOOP:0: B:22:0x0066->B:26:0x0073], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX INFO: renamed from: ۦؑ */
        public static final java.lang.Object m4142(p000.C5475 r7, p000.EnumC3834 r8, p000.AbstractC2870 r9) {
            /*
                boolean r0 = r9 instanceof p000.C4612
                if (r0 == 0) goto L13
                r0 = r9
                ۦْٛؓؖ r0 = (p000.C4612) r0
                int r1 = r0.f15229
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f15229 = r1
                goto L18
            L13:
                ۦْٛؓؖ r0 = new ۦْٛؓؖ
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f15228
                int r1 = r0.f15229
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L34
                if (r1 != r3) goto L2d
                ۦَِؒۖ r7 = r0.f15226
                ۦٜٖۡؕ r8 = r0.f15227
                p000.AbstractC0186.m409(r9)
                r6 = r8
                r8 = r7
                r7 = r6
                goto L5d
            L2d:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                p000.C1078.m2276(r7)
                r7 = 0
                return r7
            L34:
                p000.AbstractC0186.m409(r9)
                ۥْٖ۟ؓ r9 = r7.f18065
                ۦۤؑۗٛ r9 = r9.f8120
                java.util.List r9 = r9.f18583
                int r1 = r9.size()
                r4 = r2
            L42:
                if (r4 >= r1) goto L79
                java.lang.Object r5 = r9.get(r4)
                ۦؙؓۘ r5 = (p000.C3536) r5
                boolean r5 = r5.f11733
                if (r5 == 0) goto L76
            L4e:
                r0.f15227 = r7
                r0.f15226 = r8
                r0.f15229 = r3
                java.lang.Object r9 = r7.m9172(r8, r0)
                ۥٟۚؕۨ r1 = p000.EnumC2282.f7590
                if (r9 != r1) goto L5d
                return r1
            L5d:
                ۦۤؑۗٛ r9 = (p000.C5639) r9
                java.util.List r9 = r9.f18583
                int r1 = r9.size()
                r4 = r2
            L66:
                if (r4 >= r1) goto L79
                java.lang.Object r5 = r9.get(r4)
                ۦؙؓۘ r5 = (p000.C3536) r5
                boolean r5 = r5.f11733
                if (r5 == 0) goto L73
                goto L4e
            L73:
                int r4 = r4 + 1
                goto L66
            L76:
                int r4 = r4 + 1
                goto L42
            L79:
                ۥۜؑؒؑ r7 = p000.C2358.f7817
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC2133.m4142(ۦٜٖۡؕ, ۦَِؒۖ, ۥۧؔۡؗ):java.lang.Object");
        }

        /* JADX INFO: renamed from: ۦؖ */
        public static final InterfaceC4734 m4143(Type type) {
            InterfaceC4734 interfaceC4734M4140 = m4140(type, true);
            if (interfaceC4734M4140 != null) {
                return interfaceC4734M4140;
            }
            String strM5775 = AbstractC5041.m8557(m4137(type)).m5775();
            if (strM5775 == null) {
                strM5775 = "<local class name not available>";
            }
            throw new C0480(AbstractC3761.m6629("Serializer for class '", strM5775, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
        }

        /* JADX INFO: renamed from: ۦؗ */
        public static String m4144(String str) {
            byte[] bytes = str.getBytes();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(bytes);
                return m4135(messageDigest.digest());
            } catch (NoSuchAlgorithmException e) {
                Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e);
                return "";
            }
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
        /* JADX INFO: renamed from: ۦؙ */
        public static final InterfaceC4734 m4145(Class cls, List list) throws IllegalAccessException, InvocationTargetException {
            Object obj;
            InterfaceC4734 c1527;
            Field field;
            Object obj2;
            InterfaceC4734 interfaceC4734M7479;
            Field field2;
            InterfaceC4734 c4236;
            InterfaceC1172 interfaceC1172;
            InterfaceC4734[] interfaceC4734Arr = (InterfaceC4734[]) list.toArray(new InterfaceC4734[0]);
            InterfaceC4734[] interfaceC4734Arr2 = (InterfaceC4734[]) Arrays.copyOf(interfaceC4734Arr, interfaceC4734Arr.length);
            if (cls.isEnum() && cls.getAnnotation(InterfaceC1172.class) == null && cls.getAnnotation(InterfaceC2220.class) == null) {
                c4236 = new C4236(cls.getCanonicalName(), (Enum[]) cls.getEnumConstants());
            } else {
                InterfaceC4734[] interfaceC4734Arr3 = (InterfaceC4734[]) Arrays.copyOf(interfaceC4734Arr2, interfaceC4734Arr2.length);
                try {
                    Field declaredField = cls.getDeclaredField("Companion");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(null);
                } catch (Throwable unused) {
                    obj = null;
                }
                InterfaceC4734 interfaceC4734M74710 = obj == null ? null : AbstractC4225.m7479(obj, (InterfaceC4734[]) Arrays.copyOf(interfaceC4734Arr3, interfaceC4734Arr3.length));
                if (interfaceC4734M74710 != null) {
                    c4236 = interfaceC4734M74710;
                } else {
                    String canonicalName = cls.getCanonicalName();
                    if (canonicalName == null || canonicalName.startsWith("java.") || canonicalName.startsWith("kotlin.")) {
                        c1527 = null;
                    } else {
                        Field[] declaredFields = cls.getDeclaredFields();
                        int length = declaredFields.length;
                        int i = 0;
                        boolean z = false;
                        Field field3 = null;
                        while (true) {
                            if (i >= length) {
                                if (!z) {
                                    break;
                                }
                                break;
                            }
                            Field field4 = declaredFields[i];
                            if (AbstractC3831.m6874(field4.getName(), "INSTANCE") && AbstractC3831.m6874(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                                if (!z) {
                                    z = true;
                                    field3 = field4;
                                }
                            }
                            i++;
                            field3 = null;
                            break;
                        }
                        if (field3 == null) {
                            c1527 = null;
                        } else {
                            Object obj3 = field3.get(null);
                            Method[] methods = cls.getMethods();
                            int length2 = methods.length;
                            int i2 = 0;
                            boolean z2 = false;
                            Method method = null;
                            while (true) {
                                if (i2 >= length2) {
                                    if (!z2) {
                                        break;
                                    }
                                    break;
                                }
                                Method method2 = methods[i2];
                                if (AbstractC3831.m6874(method2.getName(), "serializer") && method2.getParameterTypes().length == 0 && AbstractC3831.m6874(method2.getReturnType(), InterfaceC4734.class)) {
                                    if (!z2) {
                                        z2 = true;
                                        method = method2;
                                    }
                                }
                                i2++;
                                method = null;
                                break;
                            }
                            if (method == null) {
                                c1527 = null;
                            } else {
                                Object objInvoke = method.invoke(obj3, null);
                                if (objInvoke instanceof InterfaceC4734) {
                                    c1527 = (InterfaceC4734) objInvoke;
                                } else {
                                    c1527 = null;
                                }
                            }
                        }
                    }
                    if (c1527 != null) {
                        c4236 = c1527;
                    } else {
                        InterfaceC4734[] interfaceC4734Arr4 = (InterfaceC4734[]) Arrays.copyOf(interfaceC4734Arr2, interfaceC4734Arr2.length);
                        Field[] declaredFields2 = cls.getDeclaredFields();
                        int length3 = declaredFields2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length3) {
                                field = null;
                                break;
                            }
                            field = declaredFields2[i3];
                            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(InterfaceC5430.class) != null) {
                                break;
                            }
                            i3++;
                        }
                        if (field == null) {
                            obj2 = null;
                        } else {
                            try {
                                field.setAccessible(true);
                                obj2 = field.get(null);
                            } catch (Throwable unused2) {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null || (interfaceC4734M7479 = AbstractC4225.m7479(obj2, (InterfaceC4734[]) Arrays.copyOf(interfaceC4734Arr4, interfaceC4734Arr4.length))) == null) {
                            try {
                                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                                int length4 = declaredClasses.length;
                                Class<?> cls2 = null;
                                int i4 = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i4 < length4) {
                                        Class<?> cls3 = declaredClasses[i4];
                                        if (cls3.getSimpleName().equals("$serializer")) {
                                            if (!z3) {
                                                z3 = true;
                                                cls2 = cls3;
                                            }
                                        }
                                        i4++;
                                    } else if (!z3) {
                                    }
                                    cls2 = null;
                                    break;
                                }
                                Object obj4 = (cls2 == null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                                interfaceC4734M7479 = obj4 instanceof InterfaceC4734 ? (InterfaceC4734) obj4 : null;
                            } catch (NoSuchFieldException unused3) {
                            }
                        }
                        c4236 = interfaceC4734M7479;
                        if (c4236 == null) {
                            if (cls.getAnnotation(InterfaceC2220.class) == null && ((interfaceC1172 = (InterfaceC1172) cls.getAnnotation(InterfaceC1172.class)) == null || !AbstractC5041.m8557(interfaceC1172.with()).equals(AbstractC5041.m8557(C1527.class)))) {
                                c4236 = null;
                            } else {
                                c1527 = new C1527(AbstractC5041.m8557(cls));
                                c4236 = c1527;
                            }
                        }
                    }
                }
            }
            if (c4236 != null) {
                return c4236;
            }
            InterfaceC4734 interfaceC4734 = (InterfaceC4734) AbstractC0798.f2865.get(AbstractC5041.m8557(cls));
            if (interfaceC4734 != null) {
                return interfaceC4734;
            }
            if (cls.isInterface()) {
                return new C1527(AbstractC5041.m8557(cls));
            }
            return null;
        }

        /* JADX INFO: renamed from: ۦؚ */
        public static boolean m4146(File file) {
            if (!file.isDirectory()) {
                file.delete();
                return true;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : fileArrListFiles) {
                z = m4146(file2) && z;
            }
            return z;
        }

        /* JADX INFO: renamed from: ۦٌ */
        public static final void m4147(C2276 c2276, InterfaceC3212 interfaceC3212, AbstractC0548 abstractC0548, float f, C5906 c5906, C1690 c1690, AbstractC0213 abstractC0213) {
            ArrayList arrayList = c2276.f7562;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0158 c0158 = (C0158) arrayList.get(i);
                c0158.f601.m7595(interfaceC3212, abstractC0548, f, c5906, c1690, abstractC0213);
                interfaceC3212.mo2085(0.0f, c0158.f601.m7592());
            }
        }

        /* JADX INFO: renamed from: ۦُ */
        public static final InterfaceC0705 m4148(C3592 c3592) {
            return new C5581(c3592);
        }

        /* JADX INFO: renamed from: ۦِ */
        public static final int m4149(char c) {
            if ('0' <= c && c < ':') {
                return c - '0';
            }
            if ('a' <= c && c < 'g') {
                return c - 'W';
            }
            if ('A' <= c && c < 'G') {
                return c - '7';
            }
            throw new IllegalArgumentException("Unexpected hex digit: " + c);
        }

        /* JADX INFO: renamed from: ۦٕ */
        public static boolean m4150() {
            if (Build.PRODUCT.contains("sdk")) {
                return true;
            }
            String str = Build.HARDWARE;
            return str.contains("goldfish") || str.contains("ranchu");
        }

        /* JADX INFO: renamed from: ۦٖ */
        public static String m4151(FileInputStream fileInputStream) {
            Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
            try {
                String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
                scannerUseDelimiter.close();
                return next;
            } catch (Throwable th) {
                if (scannerUseDelimiter != null) {
                    try {
                        scannerUseDelimiter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: ۦٗ */
        public static int m4152(Context context, String str, String str2) {
            String packageName;
            Resources resources = context.getResources();
            int i = context.getApplicationContext().getApplicationInfo().icon;
            if (i > 0) {
                try {
                    packageName = context.getResources().getResourcePackageName(i);
                    if ("android".equals(packageName)) {
                        packageName = context.getPackageName();
                    }
                } catch (Resources.NotFoundException unused) {
                    packageName = context.getPackageName();
                }
            } else {
                packageName = context.getPackageName();
            }
            return resources.getIdentifier(str, str2, packageName);
        }

        /* JADX INFO: renamed from: ۦٚ */
        public static final void m4153(Context context) {
            Map mapSingletonMap;
            if (context.getDatabasePath("androidx.work.workdb").exists()) {
                C1984.m3874().m3878(AbstractC0270.f971, "Migrating WorkDatabase to the no-backup directory");
                File databasePath = context.getDatabasePath("androidx.work.workdb");
                File noBackupFilesDir = context.getNoBackupFilesDir();
                String[] strArr = AbstractC0270.f970;
                int iM7911 = AbstractC4554.m7911(strArr.length);
                if (iM7911 < 16) {
                    iM7911 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM7911);
                for (String str : strArr) {
                    linkedHashMap.put(new File(databasePath.getPath() + str), new File(noBackupFilesDir.getPath() + str));
                }
                if (linkedHashMap.isEmpty()) {
                    mapSingletonMap = Collections.singletonMap(databasePath, noBackupFilesDir);
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    linkedHashMap2.put(databasePath, noBackupFilesDir);
                    mapSingletonMap = linkedHashMap2;
                }
                for (Map.Entry entry : mapSingletonMap.entrySet()) {
                    File file = (File) entry.getKey();
                    File file2 = (File) entry.getValue();
                    if (file.exists()) {
                        if (file2.exists()) {
                            C1984.m3874().m3885(AbstractC0270.f971, "Over-writing contents of " + file2);
                        }
                        C1984.m3874().m3878(AbstractC0270.f971, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۦٛ */
        public static C2415 m4154(long j, C5362 c5362) {
            long j2 = C1327.f4591;
            C2917 c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
            C2415 c2415 = c2917.f9734;
            if (c2415 == null) {
                C2415 c2416 = new C2415(AbstractC0118.m212(c2917, 35), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14));
                c2917.f9734 = c2416;
                c2415 = c2416;
            }
            return new C2415(j != 16 ? j : c2415.f8047, j2 != 16 ? j2 : c2415.f8045, j2 != 16 ? j2 : c2415.f8042, j2 != 16 ? j2 : c2415.f8048, j2 != 16 ? j2 : c2415.f8043, j2 != 16 ? j2 : c2415.f8044, j2 != 16 ? j2 : c2415.f8050, j2 != 16 ? j2 : c2415.f8046, j2 != 16 ? j2 : c2415.f8049);
        }

        /* JADX INFO: renamed from: ۦۗ */
        public static boolean m4155(Editable editable, KeyEvent keyEvent, boolean z) {
            AbstractC3079[] abstractC3079Arr;
            if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
                int selectionStart = Selection.getSelectionStart(editable);
                int selectionEnd = Selection.getSelectionEnd(editable);
                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (abstractC3079Arr = (AbstractC3079[]) editable.getSpans(selectionStart, selectionEnd, AbstractC3079.class)) != null && abstractC3079Arr.length > 0) {
                    for (AbstractC3079 abstractC3079 : abstractC3079Arr) {
                        int spanStart = editable.getSpanStart(null);
                        int spanEnd = editable.getSpanEnd(null);
                        if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ۦۙ */
        public static void m4156(int i) {
            if (2 > i || i >= 37) {
                StringBuilder sbM8680 = AbstractC5078.m8680(i, "radix ", " was not in valid range ");
                sbM8680.append(new C3046(2, 36, 1));
                throw new IllegalArgumentException(sbM8680.toString());
            }
        }

        /* JADX INFO: renamed from: ۦۚ */
        public static final boolean m4157(char c, char c2, boolean z) {
            if (c == c2) {
                return true;
            }
            if (!z) {
                return false;
            }
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }

        /* JADX INFO: renamed from: ۦۛ */
        public static boolean m4158(C5146 c5146, Editable editable, int i, int i2, boolean z) {
            int iMin;
            if (editable != null && i >= 0 && i2 >= 0) {
                int selectionStart = Selection.getSelectionStart(editable);
                int selectionEnd = Selection.getSelectionEnd(editable);
                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                    if (z) {
                        int iMax = Math.max(i, 0);
                        int length = editable.length();
                        if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                            loop0: while (true) {
                                boolean z2 = false;
                                while (true) {
                                    if (iMax == 0) {
                                        break loop0;
                                    }
                                    selectionStart--;
                                    if (selectionStart < 0) {
                                        if (!z2) {
                                            selectionStart = 0;
                                            break loop0;
                                        }
                                        break loop0;
                                    }
                                    char cCharAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        if (Character.isHighSurrogate(cCharAt)) {
                                            iMax--;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt)) {
                                        iMax--;
                                    } else if (!Character.isHighSurrogate(cCharAt)) {
                                        z2 = true;
                                    }
                                    selectionStart = -1;
                                    break loop0;
                                }
                            }
                        }
                        selectionStart = -1;
                        break loop0;
                        int iMax2 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                            loop2: while (true) {
                                boolean z3 = false;
                                while (true) {
                                    if (iMax2 != 0) {
                                        if (selectionEnd >= iMin) {
                                            if (!z3) {
                                                break loop2;
                                            }
                                            break loop2;
                                        }
                                        char cCharAt2 = editable.charAt(selectionEnd);
                                        if (z3) {
                                            if (Character.isLowSurrogate(cCharAt2)) {
                                                iMax2--;
                                                selectionEnd++;
                                            }
                                        } else if (!Character.isSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        } else if (!Character.isLowSurrogate(cCharAt2)) {
                                            selectionEnd++;
                                            z3 = true;
                                        }
                                        iMin = -1;
                                        break loop2;
                                    }
                                    iMin = selectionEnd;
                                    break loop2;
                                }
                            }
                        }
                        iMin = -1;
                        break loop2;
                        if (selectionStart != -1 && iMin != -1) {
                        }
                    } else {
                        selectionStart = Math.max(selectionStart - i, 0);
                        iMin = Math.min(selectionEnd + i2, editable.length());
                    }
                    AbstractC3079[] abstractC3079Arr = (AbstractC3079[]) editable.getSpans(selectionStart, iMin, AbstractC3079.class);
                    if (abstractC3079Arr != null && abstractC3079Arr.length > 0) {
                        for (AbstractC3079 abstractC3079 : abstractC3079Arr) {
                            int spanStart = editable.getSpanStart(null);
                            int spanEnd = editable.getSpanEnd(null);
                            selectionStart = Math.min(spanStart, selectionStart);
                            iMin = Math.max(spanEnd, iMin);
                        }
                        int iMax3 = Math.max(selectionStart, 0);
                        int iMin2 = Math.min(iMin, editable.length());
                        c5146.beginBatchEdit();
                        editable.delete(iMax3, iMin2);
                        c5146.endBatchEdit();
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ۦۜ */
        public static final List m4159(ArrayList arrayList) {
            int size = arrayList.size();
            if (size != 0) {
                return size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(AbstractC0973.m2045(arrayList));
            }
            return C2340.f7777;
        }

        /* JADX INFO: renamed from: ۦ۟ */
        public static final View m4160(View view) {
            if (!view.isAttachedToWindow()) {
                return view;
            }
            int iMin = Math.min(m4162(view, R.id.view_tree_lifecycle_owner), m4162(view, R.id.view_tree_saved_state_registry_owner));
            View view2 = view;
            int i = 0;
            View view3 = view2;
            while (view != null) {
                if (i == iMin) {
                    if (!(view.getParent() instanceof ViewGroup)) {
                        return view2;
                    }
                } else if (m4125(view) == null) {
                    i++;
                    Object objM7476 = AbstractC4225.m7476(view);
                    View view4 = view2;
                    view2 = view;
                    view = objM7476 instanceof View ? (View) objM7476 : null;
                    view3 = view4;
                }
                return view;
            }
            return view3;
        }

        /* JADX INFO: renamed from: ۦۣ */
        public static final Map m4161(Map map) {
            int size = map.size();
            if (size == 0) {
                return C0204.f751;
            }
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) AbstractC0973.m2037(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: renamed from: ۦۨ */
        public static final int m4162(View view, int i) {
            int i2 = 0;
            int i3 = Integer.MAX_VALUE;
            Object obj = null;
            while (view != null) {
                Object tag = view.getTag(i);
                if (tag != null) {
                    if (obj != null) {
                        if (!tag.equals(obj)) {
                            break;
                        }
                    } else {
                        obj = tag;
                    }
                    i3 = i2;
                }
                i2++;
                Object objM7476 = AbstractC4225.m7476(view);
                view = objM7476 instanceof View ? (View) objM7476 : null;
            }
            return i3;
        }
    }
