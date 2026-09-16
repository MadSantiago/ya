package p000;

import android.content.Context;
import android.graphics.Path;
import android.os.Looper;
import android.util.Log;
import android.util.Xml;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.HandwritingGesture;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦَُؒٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3831 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5536 f12710;

    /* JADX INFO: renamed from: ۦۙ */
    public static final C1280 f12719;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Object f12712 = new Object();

    /* JADX INFO: renamed from: ۥؗ */
    public static final char[] f12707 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ۦؑ */
    public static final char[] f12713 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ۥُ */
    public static final int[] f12708 = {13, 15, 14};

    /* JADX INFO: renamed from: ۥّ */
    public static final C1280 f12709 = new C1280(new C3875(0), new C3875(17));

    /* JADX INFO: renamed from: ۥۜ */
    public static final C1280 f12711 = new C1280(new C3875(3), new C3875(4));

    /* JADX INFO: renamed from: ۦٛ */
    public static final C1280 f12717 = new C1280(new C3875(5), new C3875(6));

    /* JADX INFO: renamed from: ۦِ */
    public static final C1280 f12716 = new C1280(new C3875(7), new C3875(8));

    /* JADX INFO: renamed from: ۦۗ */
    public static final C1280 f12718 = new C1280(new C3875(9), new C3875(10));

    /* JADX INFO: renamed from: ۦؚ */
    public static final C1280 f12714 = new C1280(new C3875(11), new C3875(12));

    /* JADX INFO: renamed from: ۦٌ */
    public static final C1280 f12715 = new C1280(new C3875(13), new C3875(14));

    /* JADX INFO: renamed from: ۦۚ */
    public static final C1280 f12720 = new C1280(new C3875(15), new C3875(16));

    static {
        int i = 2;
        f12710 = new C5536(i, "CLOSED");
        f12719 = new C1280(new C3875(1), new C3875(i));
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static void m6834(long j, C1249 c1249, boolean z, C0091 c0091) {
        if (z) {
            int i = C3346.f11195;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c1249, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c1249.f4307.length() ? Character.codePointAt(c1249, iCharCount2) : 10;
            if (AbstractC2776.m5236(iCodePointBefore) && (AbstractC2776.m5238(iCodePointAt) || AbstractC2776.m5225(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c1249, iCharCount);
                    }
                } while (AbstractC2776.m5236(iCodePointBefore));
                j = AbstractC2765.m5145(iCharCount, iCharCount2);
            } else if (AbstractC2776.m5236(iCodePointAt) && (AbstractC2776.m5238(iCodePointBefore) || AbstractC2776.m5225(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c1249.f4307.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c1249, iCharCount2);
                    }
                } while (AbstractC2776.m5236(iCodePointAt));
                j = AbstractC2765.m5145(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        c0091.mo211(new C2143(new InterfaceC1400[]{new C2890(i2, i2), new C0351(C3346.m6113(j), 0)}));
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static final int m6835(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static final float m6836(InterfaceC3534 interfaceC3534) {
        InterfaceC3800 interfaceC3800 = (InterfaceC3800) interfaceC3534.mo865(C1298.f4434);
        float fMo3501 = interfaceC3800 != null ? interfaceC3800.mo3501() : 1.0f;
        if (fMo3501 >= 0.0f) {
            return fMo3501;
        }
        AbstractC0388.m901("negative scale factor");
        return fMo3501;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m6837(C1039 c1039, C3536 c3536, long j) {
        C2394 c2394 = (C2394) c1039.f3672;
        C5426 c5426 = (C5426) c2394.f7964;
        C5426 c5427 = (C5426) c2394.f7965;
        boolean zM6800 = AbstractC3801.m6800(c3536);
        long j2 = c3536.f11730;
        if (zM6800) {
            AbstractC0246.m515(c5427.f17915, null);
            c5427.f17910 = 0;
            AbstractC0246.m515(c5426.f17915, null);
            c5426.f17910 = 0;
            c2394.f7966 = 0L;
        }
        if (!AbstractC3801.m6754(c3536)) {
            List list = c3536.f11735;
            if (list == null) {
                list = C2340.f7777;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                C0545 c0545 = (C0545) list.get(i);
                c2394.m4514(c0545.f1963, C1553.m3304(c0545.f1961, j));
                i++;
            }
            c2394.m4514(j2, C1553.m3304(c3536.f11740, j));
        }
        if (AbstractC3801.m6754(c3536) && j2 - c2394.f7966 > 40) {
            AbstractC0246.m515(c5427.f17915, null);
            c5427.f17910 = 0;
            AbstractC0246.m515(c5426.f17915, null);
            c5426.f17910 = 0;
            c2394.f7966 = 0L;
        }
        c2394.f7966 = j2;
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static int m6838(Object obj, InterfaceC0759 interfaceC0759, byte[] bArr, int i, int i2, int i3, C0958 c0958) throws C5463 {
        C5031 c5031 = (C5031) interfaceC0759;
        int i4 = c0958.f3400 + 1;
        c0958.f3400 = i4;
        if (i4 >= 100) {
            C2316.m4358("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iM8469 = c5031.m8469(obj, bArr, i, i2, i3, c0958);
        c0958.f3400--;
        c0958.f3397 = obj;
        return iM8469;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static int m6839(Object obj, InterfaceC0759 interfaceC0759, byte[] bArr, int i, int i2, C0958 c0958) throws C5463 {
        int iM6847 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM6847 = m6847(i3, bArr, iM6847, c0958);
            i3 = c0958.f3399;
        }
        int i4 = iM6847;
        if (i3 < 0 || i3 > i2 - i4) {
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = c0958.f3400 + 1;
        c0958.f3400 = i5;
        if (i5 >= 100) {
            C2316.m4358("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        interfaceC0759.mo1653(obj, bArr, i4, i6, c0958);
        c0958.f3400--;
        c0958.f3397 = obj;
        return i6;
    }

    /* JADX INFO: renamed from: ۥً */
    public static final void m6840(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            AbstractC3480.m6279("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            System.arraycopy(fArr4[i9], 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr8 = fArr5[i10];
                float fM6872 = m6872(fArr7, fArr8);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr8[i11] * fM6872);
                }
            }
            float fSqrt = (float) Math.sqrt(m6872(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr9 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr9[i13] = i13 < i9 ? 0.0f : m6872(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fM6873 = m6872(fArr5[i14], fArr2);
            float[] fArr10 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fM6873 -= fArr10[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fM6873 / fArr10[i14];
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final long m6841() {
        return Thread.currentThread().getId();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00df A[Catch: CancellationException -> 0x0117, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0117, blocks: (B:42:0x00cd, B:44:0x00df), top: B:74:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010e, code lost:
    
        if (m6876(r3, r5, r8) == r11) goto L50;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010e -> B:31:0x008c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۥُ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m6842(p000.C3411 r22, p000.InterfaceC4334 r23, long r24, final p000.InterfaceC4745 r26, p000.AbstractC0772 r27) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC3831.m6842(ۦؗؓٝ۟, ۦٖٜۡ, long, ۦٌُٝؔ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final Object m6843(C3411 c3411, C5468 c5468, boolean z, InterfaceC4745 interfaceC4745, AbstractC0772 abstractC0772) {
        Object objM6842 = m6842(c3411, new C1331(c5468, c3411.f11360, c3411.f11359.getValue(), c3411.f11356), z ? c3411.f11357 : Long.MIN_VALUE, interfaceC4745, abstractC0772);
        return objM6842 == EnumC2282.f7590 ? objM6842 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static int m6844(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static void m6845(FileInputStream fileInputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = fileInputStream.read(bArr);
        while (i >= 0) {
            byteArrayOutputStream.write(bArr, 0, i);
            i = fileInputStream.read(bArr);
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final void m6846(C5535 c5535, long j, float f, InterfaceC4334 interfaceC4334, C3411 c3411, InterfaceC4745 interfaceC4745) {
        long jMo2834 = f == 0.0f ? interfaceC4334.mo2834() : (long) ((j - c5535.f18268) / f);
        c5535.f18276 = j;
        c5535.f18269.setValue(interfaceC4334.mo2837(jMo2834));
        c5535.f18270 = interfaceC4334.mo2836(jMo2834);
        if (interfaceC4334.m7629(jMo2834)) {
            c5535.f18272 = c5535.f18276;
            c5535.f18275.setValue(Boolean.FALSE);
        }
        m6878(c5535, c3411);
        interfaceC4745.mo211(c5535);
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static int m6847(int i, byte[] bArr, int i2, C0958 c0958) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c0958.f3399 = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c0958.f3399 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c0958.f3399 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c0958.f3399 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c0958.f3399 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static final long m6848(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static int m6849(byte[] bArr, int i, C0958 c0958) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c0958.f3398 = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c0958.f3398 = j2;
        return i3;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static int m6850(byte[] bArr, int i, C0958 c0958) throws C5463 {
        int iM6881 = m6881(bArr, i, c0958);
        int i2 = c0958.f3399;
        if (i2 < 0) {
            C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            c0958.f3397 = "";
            return iM6881;
        }
        c0958.f3397 = AbstractC5011.m8428(bArr, iM6881, i2);
        return iM6881 + i2;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static int m6851(HandwritingGesture handwritingGesture, C0091 c0091) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c0091.mo211(new C1472(1, fallbackText));
        return 5;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m6852(final int i, InterfaceC5731 interfaceC5731, C0857 c0857, InterfaceC5731 interfaceC5732, InterfaceC5731 interfaceC5733, final InterfaceC4686 interfaceC4686, InterfaceC5731 interfaceC5734, C5362 c5362, int i2) {
        int i3;
        c5362.m8979(-280287501);
        int i4 = i2 | (c5362.m8988(i) ? 4 : 2) | (c5362.m8977(interfaceC5731) ? 32 : 16) | (c5362.m8977(c0857) ? 256 : 128) | (c5362.m8977(interfaceC5732) ? 2048 : 1024) | (c5362.m8977(interfaceC5733) ? 16384 : 8192) | (c5362.m8963(interfaceC4686) ? 131072 : 65536) | (c5362.m8977(interfaceC5734) ? 1048576 : 524288);
        if (c5362.m9011(i4 & 1, (599187 & i4) != 599186)) {
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            if (objM8999 == obj) {
                objM8999 = new C5512();
                c5362.m8987(objM8999);
            }
            final C5512 c5512 = (C5512) objM8999;
            boolean z = (i4 & 112) == 32;
            Object objM89910 = c5362.m8999();
            int i5 = 5;
            if (z || objM89910 == obj) {
                objM89910 = new C0857(605195056, new C4343(i5, interfaceC5731), true);
                c5362.m8987(objM89910);
            }
            final InterfaceC5731 interfaceC5735 = (InterfaceC5731) objM89910;
            boolean z2 = (i4 & 7168) == 2048;
            Object objM89911 = c5362.m8999();
            if (z2 || objM89911 == obj) {
                objM89911 = new C0857(418899191, new C4343(4, interfaceC5732), true);
                c5362.m8987(objM89911);
            }
            final InterfaceC5731 interfaceC5736 = (InterfaceC5731) objM89911;
            boolean z3 = (57344 & i4) == 16384;
            Object objM89912 = c5362.m8999();
            if (z3 || objM89912 == obj) {
                objM89912 = new C0857(338600263, new C4343(3, interfaceC5733), true);
                c5362.m8987(objM89912);
            }
            final InterfaceC5731 interfaceC5737 = (InterfaceC5731) objM89912;
            boolean z4 = (i4 & 896) == 256;
            Object objM89913 = c5362.m8999();
            if (z4 || objM89913 == obj) {
                objM89913 = new C0857(-1776388365, new C0491(c0857, c5512, 5), true);
                c5362.m8987(objM89913);
            }
            final InterfaceC5731 interfaceC5738 = (InterfaceC5731) objM89913;
            boolean z5 = (i4 & 3670016) == 1048576;
            Object objM89914 = c5362.m8999();
            if (z5 || objM89914 == obj) {
                objM89914 = new C0857(-1731662488, new C4343(2, interfaceC5734), true);
                c5362.m8987(objM89914);
            }
            final InterfaceC5731 interfaceC5739 = (InterfaceC5731) objM89914;
            boolean zM8963 = ((i4 & 458752) == 131072) | c5362.m8963(interfaceC5735) | c5362.m8963(interfaceC5736) | c5362.m8963(interfaceC5737) | ((i4 & 14) == 4) | c5362.m8963(interfaceC5739) | c5362.m8963(interfaceC5738);
            Object objM89915 = c5362.m8999();
            if (zM8963 || objM89915 == obj) {
                i3 = 0;
                Object obj2 = new InterfaceC5731() { // from class: ۦٜؕؔۘ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj3, Object obj4) {
                        int i6;
                        int iMo743;
                        int iMo744;
                        C2268 c2268;
                        boolean z6;
                        final Integer numValueOf;
                        int i7;
                        int iIntValue;
                        int iMo745;
                        int iMo1869;
                        final InterfaceC1422 interfaceC1422 = (InterfaceC1422) obj3;
                        C3693 c3693 = (C3693) obj4;
                        final int iM6556 = C3693.m6556(c3693.f12325);
                        final int iM6551 = C3693.m6551(c3693.f12325);
                        long jM6550 = C3693.m6550(c3693.f12325, 0, 0, 0, 0, 10);
                        EnumC2459 layoutDirection = interfaceC1422.getLayoutDirection();
                        final InterfaceC4686 interfaceC4687 = interfaceC4686;
                        int iMo1870 = interfaceC4687.mo1870(interfaceC1422, layoutDirection);
                        int iMo1865 = interfaceC4687.mo1865(interfaceC1422, interfaceC1422.getLayoutDirection());
                        int iMo18610 = interfaceC4687.mo1869(interfaceC1422);
                        final AbstractC0275 abstractC0275Mo3597 = ((InterfaceC1827) AbstractC0973.m2045(interfaceC1422.mo750(interfaceC5735, EnumC0523.f1858))).mo3597(jM6550);
                        int i8 = (-iMo1870) - iMo1865;
                        int i9 = -iMo18610;
                        final AbstractC0275 abstractC0275Mo3598 = ((InterfaceC1827) AbstractC0973.m2045(interfaceC1422.mo750(interfaceC5736, EnumC0523.f1854))).mo3597(AbstractC0671.m1500(i8, i9, jM6550));
                        final AbstractC0275 abstractC0275Mo3599 = ((InterfaceC1827) AbstractC0973.m2045(interfaceC1422.mo750(interfaceC5737, EnumC0523.f1855))).mo3597(AbstractC0671.m1500(i8, i9, jM6550));
                        int i10 = abstractC0275Mo3599.f985;
                        int i11 = i;
                        if (i10 == 0 && abstractC0275Mo3599.f984 == 0) {
                            c2268 = null;
                            z6 = true;
                        } else {
                            int i12 = abstractC0275Mo3599.f984;
                            EnumC2459 enumC2459 = EnumC2459.f8215;
                            if (i11 == 0) {
                                i6 = iMo1870;
                                if (interfaceC1422.getLayoutDirection() == enumC2459) {
                                    iMo743 = interfaceC1422.mo743(16.0f);
                                    iMo744 = iMo743 + i6;
                                } else {
                                    iMo744 = ((iM6556 - interfaceC1422.mo743(16.0f)) - i10) - iMo1865;
                                }
                            } else {
                                i6 = iMo1870;
                                if (i11 != 2 && i11 != 3) {
                                    iMo744 = (((iM6556 - i10) + i6) - iMo1865) / 2;
                                } else if (interfaceC1422.getLayoutDirection() == enumC2459) {
                                    iMo744 = ((iM6556 - interfaceC1422.mo743(16.0f)) - i10) - iMo1865;
                                } else {
                                    iMo743 = interfaceC1422.mo743(16.0f);
                                    iMo744 = iMo743 + i6;
                                }
                            }
                            z6 = true;
                            c2268 = new C2268(iMo744, i12, 1);
                        }
                        final AbstractC0275 abstractC0275Mo35910 = ((InterfaceC1827) AbstractC0973.m2045(interfaceC1422.mo750(interfaceC5739, EnumC0523.f1853))).mo3597(jM6550);
                        boolean z7 = (abstractC0275Mo35910.f985 == 0 && abstractC0275Mo35910.f984 == 0) ? z6 : false;
                        if (c2268 != null) {
                            int i13 = c2268.f7526;
                            if (z7 || i11 == 3) {
                                iMo745 = interfaceC1422.mo743(16.0f) + i13;
                                iMo1869 = interfaceC4687.mo1869(interfaceC1422);
                            } else {
                                iMo745 = abstractC0275Mo35910.f984 + i13;
                                iMo1869 = interfaceC1422.mo743(16.0f);
                            }
                            numValueOf = Integer.valueOf(iMo1869 + iMo745);
                        } else {
                            numValueOf = null;
                        }
                        int i14 = abstractC0275Mo3598.f984;
                        if (i14 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                Integer numValueOf2 = z7 ? null : Integer.valueOf(abstractC0275Mo35910.f984);
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : interfaceC4687.mo1869(interfaceC1422);
                            }
                            i7 = iIntValue + i14;
                        } else {
                            i7 = 0;
                        }
                        C0492 c0492 = new C0492(interfaceC4687, interfaceC1422);
                        final C2268 c2269 = c2268;
                        c5512.f18193.setValue(new C1393(AbstractC5568.m9379(c0492, interfaceC1422.getLayoutDirection()), (abstractC0275Mo3597.f985 == 0 && abstractC0275Mo3597.f984 == 0) ? c0492.mo1103() : interfaceC1422.mo756(abstractC0275Mo3597.f984), AbstractC5568.m9387(c0492, interfaceC1422.getLayoutDirection()), z7 ? c0492.mo1100() : interfaceC1422.mo756(abstractC0275Mo35910.f984)));
                        final AbstractC0275 abstractC0275Mo35911 = ((InterfaceC1827) AbstractC0973.m2045(interfaceC1422.mo750(interfaceC5738, EnumC0523.f1857))).mo3597(jM6550);
                        final int i15 = i7;
                        return interfaceC1422.mo755(iM6556, iM6551, C0204.f751, new InterfaceC4745() { // from class: ۥؔؗٔ۠
                            @Override // p000.InterfaceC4745
                            /* JADX INFO: renamed from: ۦؚ */
                            public final Object mo211(Object obj5) {
                                AbstractC1842 abstractC1842 = (AbstractC1842) obj5;
                                AbstractC1842.m3626(abstractC1842, abstractC0275Mo35911, 0, 0);
                                AbstractC1842.m3626(abstractC1842, abstractC0275Mo3597, 0, 0);
                                AbstractC0275 abstractC0275 = abstractC0275Mo3598;
                                int i16 = iM6556 - abstractC0275.f985;
                                InterfaceC1422 interfaceC1423 = interfaceC1422;
                                EnumC2459 layoutDirection2 = interfaceC1423.getLayoutDirection();
                                InterfaceC4686 interfaceC4688 = interfaceC4687;
                                int iMo1871 = ((interfaceC4688.mo1870(interfaceC1423, layoutDirection2) + i16) - interfaceC4688.mo1865(interfaceC1423, interfaceC1423.getLayoutDirection())) / 2;
                                int i17 = iM6551;
                                AbstractC1842.m3626(abstractC1842, abstractC0275, iMo1871, i17 - i15);
                                AbstractC0275 abstractC0276 = abstractC0275Mo35910;
                                AbstractC1842.m3626(abstractC1842, abstractC0276, 0, i17 - abstractC0276.f984);
                                C2268 c22610 = c2269;
                                if (c22610 != null) {
                                    AbstractC1842.m3626(abstractC1842, abstractC0275Mo3599, c22610.f7527, i17 - numValueOf.intValue());
                                }
                                return C2358.f7817;
                            }
                        });
                    }
                };
                c5362.m8987(obj2);
                objM89915 = obj2;
            } else {
                i3 = 0;
            }
            AbstractC0186.m428(null, (InterfaceC5731) objM89915, c5362, i3);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4460(i, interfaceC5731, c0857, interfaceC5732, interfaceC5733, interfaceC4686, interfaceC5734, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static void m6853(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static /* synthetic */ Object m6854(C3411 c3411, Float f, InterfaceC3347 interfaceC3347, C0511 c0511, AbstractC0772 abstractC0772, int i) {
        boolean z = (i & 4) == 0;
        InterfaceC4745 c4215 = c0511;
        if ((i & 8) != 0) {
            c4215 = new C4215(24);
        }
        return m6875(c3411, f, interfaceC3347, z, c4215, abstractC0772);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m6855(byte[] bArr, int i, C0958 c0958) throws C5463 {
        int iM6881 = m6881(bArr, i, c0958);
        int i2 = c0958.f3399;
        if (i2 < 0) {
            C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM6881) {
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            c0958.f3397 = AbstractC4314.f14260;
            return iM6881;
        }
        c0958.f3397 = AbstractC4314.m7597(bArr, iM6881, i2);
        return iM6881 + i2;
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static int m6856(int i, byte[] bArr, int i2, int i3, InterfaceC5083 interfaceC5083, C0958 c0958) {
        C2667 c2667 = (C2667) interfaceC5083;
        int iM6881 = m6881(bArr, i2, c0958);
        c2667.m4969(c0958.f3399);
        while (iM6881 < i3) {
            int iM6882 = m6881(bArr, iM6881, c0958);
            if (i != c0958.f3399) {
                break;
            }
            iM6881 = m6881(bArr, iM6882, c0958);
            c2667.m4969(c0958.f3399);
        }
        return iM6881;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۣ */
    public static final void m6857(InterfaceC0705 interfaceC0705, InterfaceC5731 interfaceC5731, InterfaceC5731 interfaceC5732, InterfaceC5731 interfaceC5733, InterfaceC5731 interfaceC5734, int i, long j, long j2, InterfaceC4686 interfaceC4686, final C0857 c0857, C5362 c5362, final int i2, final int i3) {
        final InterfaceC5731 interfaceC5735;
        int i4;
        int i5;
        InterfaceC5731 interfaceC5736;
        int i6;
        int i7;
        boolean z;
        final InterfaceC0705 interfaceC0706;
        final InterfaceC5731 interfaceC5737;
        final InterfaceC5731 interfaceC5738;
        final int i8;
        final long j3;
        final long j4;
        final InterfaceC4686 interfaceC4687;
        final InterfaceC5731 interfaceC5739;
        C5863 c5863M8965;
        InterfaceC5731 interfaceC57310;
        InterfaceC5731 interfaceC57311;
        InterfaceC5731 interfaceC57312;
        long j5;
        long jM215;
        int i9;
        InterfaceC0705 interfaceC0707;
        InterfaceC4686 interfaceC4688;
        boolean zM8963;
        Object objM8999;
        C2997 c2997;
        boolean zM8964;
        Object objM89910;
        c5362.m8979(-1211482744);
        int i10 = i2 | 6;
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                interfaceC5735 = interfaceC5731;
                i10 |= c5362.m8977(interfaceC5735) ? 32 : 16;
            }
            i4 = i10 | 3456;
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    interfaceC5736 = interfaceC5734;
                    if (c5362.m8977(interfaceC5736)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 38469632;
                if ((306783379 & i7) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (c5362.m9011(i7 & 1, z)) {
                    c5362.m8971();
                    if ((i2 & 1) != 0 || c5362.m8969()) {
                        if (i11 != 0) {
                            interfaceC57310 = AbstractC3403.f11322;
                        } else {
                            interfaceC57310 = interfaceC5735;
                        }
                        interfaceC57311 = AbstractC3403.f11321;
                        interfaceC57312 = AbstractC3403.f11320;
                        if (i5 != 0) {
                            interfaceC5736 = AbstractC3403.f11323;
                        }
                        j5 = ((C2917) c5362.m8997(AbstractC0118.f470)).f9775;
                        jM215 = AbstractC0118.m215(j5, c5362);
                        WeakHashMap weakHashMap = C2816.f9398;
                        C3080 c3080 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                        i9 = 2;
                        interfaceC0707 = C4217.f13994;
                        interfaceC4688 = c3080;
                    } else {
                        c5362.m8982();
                        interfaceC0707 = interfaceC0705;
                        interfaceC57312 = interfaceC5733;
                        i9 = i;
                        j5 = j;
                        jM215 = j2;
                        interfaceC4688 = interfaceC4686;
                        interfaceC57310 = interfaceC5735;
                        interfaceC57311 = interfaceC5732;
                    }
                    c5362.m8964();
                    zM8963 = c5362.m8963(interfaceC4688);
                    objM8999 = c5362.m8999();
                    Object obj = C2850.f9517;
                    if (zM8963 || objM8999 == obj) {
                        objM8999 = new C2997(interfaceC4688);
                        c5362.m8987(objM8999);
                    }
                    c2997 = (C2997) objM8999;
                    zM8964 = c5362.m8963(c2997) | c5362.m8963(interfaceC4688);
                    InterfaceC5731 interfaceC57313 = interfaceC5736;
                    objM89910 = c5362.m8999();
                    if (zM8964 || objM89910 == obj) {
                        objM89910 = new C1708(3, c2997, interfaceC4688);
                        c5362.m8987(objM89910);
                    }
                    InterfaceC5731 interfaceC57314 = interfaceC57310;
                    InterfaceC5731 interfaceC57315 = interfaceC57311;
                    InterfaceC5731 interfaceC57316 = interfaceC57312;
                    int i12 = i9;
                    long j6 = j5;
                    long j7 = jM215;
                    AbstractC0701.m1560(AbstractC5568.m9367(interfaceC0707, (InterfaceC4745) objM89910), null, j6, j7, 0.0f, 0.0f, AbstractC3925.m7034(848889571, new C2915(i12, interfaceC57314, c0857, interfaceC57316, interfaceC57313, c2997, interfaceC57315), c5362), c5362, 12582912, 114);
                    j3 = j6;
                    j4 = j7;
                    interfaceC0706 = interfaceC0707;
                    interfaceC4687 = interfaceC4688;
                    interfaceC5735 = interfaceC57314;
                    interfaceC5737 = interfaceC57315;
                    interfaceC5738 = interfaceC57316;
                    interfaceC5739 = interfaceC57313;
                    i8 = i12;
                } else {
                    c5362.m8982();
                    interfaceC0706 = interfaceC0705;
                    interfaceC5737 = interfaceC5732;
                    interfaceC5738 = interfaceC5733;
                    i8 = i;
                    j3 = j;
                    j4 = j2;
                    interfaceC4687 = interfaceC4686;
                    interfaceC5739 = interfaceC5736;
                }
                c5863M8965 = c5362.m8965();
                if (c5863M8965 != null) {
                    c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥٞؔٗۙ
                        @Override // p000.InterfaceC5731
                        /* JADX INFO: renamed from: ۥۜ */
                        public final Object mo219(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iM6835 = AbstractC3831.m6835(i2 | 1);
                            AbstractC3831.m6857(interfaceC0706, interfaceC5735, interfaceC5737, interfaceC5738, interfaceC5739, i8, j3, j4, interfaceC4687, c0857, (C5362) obj2, iM6835, i3);
                            return C2358.f7817;
                        }
                    };
                }
            }
            i4 = i10 | 28032;
            interfaceC5736 = interfaceC5734;
            i7 = i4 | 38469632;
            if ((306783379 & i7) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (c5362.m9011(i7 & 1, z)) {
                c5362.m8971();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        interfaceC57310 = AbstractC3403.f11322;
                    } else {
                        interfaceC57310 = interfaceC5735;
                    }
                    interfaceC57311 = AbstractC3403.f11321;
                    interfaceC57312 = AbstractC3403.f11320;
                    if (i5 != 0) {
                        interfaceC5736 = AbstractC3403.f11323;
                    }
                    j5 = ((C2917) c5362.m8997(AbstractC0118.f470)).f9775;
                    jM215 = AbstractC0118.m215(j5, c5362);
                    WeakHashMap weakHashMap2 = C2816.f9398;
                    C3080 c3081 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                    i9 = 2;
                    interfaceC0707 = C4217.f13994;
                    interfaceC4688 = c3081;
                } else {
                    if (i11 != 0) {
                        interfaceC57310 = AbstractC3403.f11322;
                    } else {
                        interfaceC57310 = interfaceC5735;
                    }
                    interfaceC57311 = AbstractC3403.f11321;
                    interfaceC57312 = AbstractC3403.f11320;
                    if (i5 != 0) {
                        interfaceC5736 = AbstractC3403.f11323;
                    }
                    j5 = ((C2917) c5362.m8997(AbstractC0118.f470)).f9775;
                    jM215 = AbstractC0118.m215(j5, c5362);
                    WeakHashMap weakHashMap3 = C2816.f9398;
                    C3080 c3082 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                    i9 = 2;
                    interfaceC0707 = C4217.f13994;
                    interfaceC4688 = c3082;
                }
                c5362.m8964();
                zM8963 = c5362.m8963(interfaceC4688);
                objM8999 = c5362.m8999();
                Object obj2 = C2850.f9517;
                if (zM8963) {
                    objM8999 = new C2997(interfaceC4688);
                    c5362.m8987(objM8999);
                } else {
                    objM8999 = new C2997(interfaceC4688);
                    c5362.m8987(objM8999);
                }
                c2997 = (C2997) objM8999;
                zM8964 = c5362.m8963(c2997) | c5362.m8963(interfaceC4688);
                InterfaceC5731 interfaceC57317 = interfaceC5736;
                objM89910 = c5362.m8999();
                if (zM8964) {
                    objM89910 = new C1708(3, c2997, interfaceC4688);
                    c5362.m8987(objM89910);
                } else {
                    objM89910 = new C1708(3, c2997, interfaceC4688);
                    c5362.m8987(objM89910);
                }
                InterfaceC5731 interfaceC57318 = interfaceC57310;
                InterfaceC5731 interfaceC57319 = interfaceC57311;
                InterfaceC5731 interfaceC573110 = interfaceC57312;
                int i13 = i9;
                long j8 = j5;
                long j9 = jM215;
                AbstractC0701.m1560(AbstractC5568.m9367(interfaceC0707, (InterfaceC4745) objM89910), null, j8, j9, 0.0f, 0.0f, AbstractC3925.m7034(848889571, new C2915(i13, interfaceC57318, c0857, interfaceC573110, interfaceC57317, c2997, interfaceC57319), c5362), c5362, 12582912, 114);
                j3 = j8;
                j4 = j9;
                interfaceC0706 = interfaceC0707;
                interfaceC4687 = interfaceC4688;
                interfaceC5735 = interfaceC57318;
                interfaceC5737 = interfaceC57319;
                interfaceC5738 = interfaceC573110;
                interfaceC5739 = interfaceC57317;
                i8 = i13;
            } else {
                c5362.m8982();
                interfaceC0706 = interfaceC0705;
                interfaceC5737 = interfaceC5732;
                interfaceC5738 = interfaceC5733;
                i8 = i;
                j3 = j;
                j4 = j2;
                interfaceC4687 = interfaceC4686;
                interfaceC5739 = interfaceC5736;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥٞؔٗۙ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iM6835 = AbstractC3831.m6835(i2 | 1);
                        AbstractC3831.m6857(interfaceC0706, interfaceC5735, interfaceC5737, interfaceC5738, interfaceC5739, i8, j3, j4, interfaceC4687, c0857, (C5362) obj3, iM6835, i3);
                        return C2358.f7817;
                    }
                };
            }
        }
        i10 = i2 | 54;
        interfaceC5735 = interfaceC5731;
        i4 = i10 | 3456;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                interfaceC5736 = interfaceC5734;
                if (c5362.m8977(interfaceC5736)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i4 | 38469632;
            if ((306783379 & i7) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (c5362.m9011(i7 & 1, z)) {
                c5362.m8971();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        interfaceC57310 = AbstractC3403.f11322;
                    } else {
                        interfaceC57310 = interfaceC5735;
                    }
                    interfaceC57311 = AbstractC3403.f11321;
                    interfaceC57312 = AbstractC3403.f11320;
                    if (i5 != 0) {
                        interfaceC5736 = AbstractC3403.f11323;
                    }
                    j5 = ((C2917) c5362.m8997(AbstractC0118.f470)).f9775;
                    jM215 = AbstractC0118.m215(j5, c5362);
                    WeakHashMap weakHashMap4 = C2816.f9398;
                    C3080 c3083 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                    i9 = 2;
                    interfaceC0707 = C4217.f13994;
                    interfaceC4688 = c3083;
                } else {
                    if (i11 != 0) {
                        interfaceC57310 = AbstractC3403.f11322;
                    } else {
                        interfaceC57310 = interfaceC5735;
                    }
                    interfaceC57311 = AbstractC3403.f11321;
                    interfaceC57312 = AbstractC3403.f11320;
                    if (i5 != 0) {
                        interfaceC5736 = AbstractC3403.f11323;
                    }
                    j5 = ((C2917) c5362.m8997(AbstractC0118.f470)).f9775;
                    jM215 = AbstractC0118.m215(j5, c5362);
                    WeakHashMap weakHashMap5 = C2816.f9398;
                    C3080 c3084 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                    i9 = 2;
                    interfaceC0707 = C4217.f13994;
                    interfaceC4688 = c3084;
                }
                c5362.m8964();
                zM8963 = c5362.m8963(interfaceC4688);
                objM8999 = c5362.m8999();
                Object obj3 = C2850.f9517;
                if (zM8963) {
                    objM8999 = new C2997(interfaceC4688);
                    c5362.m8987(objM8999);
                } else {
                    objM8999 = new C2997(interfaceC4688);
                    c5362.m8987(objM8999);
                }
                c2997 = (C2997) objM8999;
                zM8964 = c5362.m8963(c2997) | c5362.m8963(interfaceC4688);
                InterfaceC5731 interfaceC573111 = interfaceC5736;
                objM89910 = c5362.m8999();
                if (zM8964) {
                    objM89910 = new C1708(3, c2997, interfaceC4688);
                    c5362.m8987(objM89910);
                } else {
                    objM89910 = new C1708(3, c2997, interfaceC4688);
                    c5362.m8987(objM89910);
                }
                InterfaceC5731 interfaceC573112 = interfaceC57310;
                InterfaceC5731 interfaceC573113 = interfaceC57311;
                InterfaceC5731 interfaceC573114 = interfaceC57312;
                int i14 = i9;
                long j10 = j5;
                long j11 = jM215;
                AbstractC0701.m1560(AbstractC5568.m9367(interfaceC0707, (InterfaceC4745) objM89910), null, j10, j11, 0.0f, 0.0f, AbstractC3925.m7034(848889571, new C2915(i14, interfaceC573112, c0857, interfaceC573114, interfaceC573111, c2997, interfaceC573113), c5362), c5362, 12582912, 114);
                j3 = j10;
                j4 = j11;
                interfaceC0706 = interfaceC0707;
                interfaceC4687 = interfaceC4688;
                interfaceC5735 = interfaceC573112;
                interfaceC5737 = interfaceC573113;
                interfaceC5738 = interfaceC573114;
                interfaceC5739 = interfaceC573111;
                i8 = i14;
            } else {
                c5362.m8982();
                interfaceC0706 = interfaceC0705;
                interfaceC5737 = interfaceC5732;
                interfaceC5738 = interfaceC5733;
                i8 = i;
                j3 = j;
                j4 = j2;
                interfaceC4687 = interfaceC4686;
                interfaceC5739 = interfaceC5736;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥٞؔٗۙ
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        int iM6835 = AbstractC3831.m6835(i2 | 1);
                        AbstractC3831.m6857(interfaceC0706, interfaceC5735, interfaceC5737, interfaceC5738, interfaceC5739, i8, j3, j4, interfaceC4687, c0857, (C5362) obj4, iM6835, i3);
                        return C2358.f7817;
                    }
                };
            }
        }
        i4 = i10 | 28032;
        interfaceC5736 = interfaceC5734;
        i7 = i4 | 38469632;
        if ((306783379 & i7) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (c5362.m9011(i7 & 1, z)) {
            c5362.m8971();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    interfaceC57310 = AbstractC3403.f11322;
                } else {
                    interfaceC57310 = interfaceC5735;
                }
                interfaceC57311 = AbstractC3403.f11321;
                interfaceC57312 = AbstractC3403.f11320;
                if (i5 != 0) {
                    interfaceC5736 = AbstractC3403.f11323;
                }
                j5 = ((C2917) c5362.m8997(AbstractC0118.f470)).f9775;
                jM215 = AbstractC0118.m215(j5, c5362);
                WeakHashMap weakHashMap6 = C2816.f9398;
                C3080 c3085 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                i9 = 2;
                interfaceC0707 = C4217.f13994;
                interfaceC4688 = c3085;
            } else {
                if (i11 != 0) {
                    interfaceC57310 = AbstractC3403.f11322;
                } else {
                    interfaceC57310 = interfaceC5735;
                }
                interfaceC57311 = AbstractC3403.f11321;
                interfaceC57312 = AbstractC3403.f11320;
                if (i5 != 0) {
                    interfaceC5736 = AbstractC3403.f11323;
                }
                j5 = ((C2917) c5362.m8997(AbstractC0118.f470)).f9775;
                jM215 = AbstractC0118.m215(j5, c5362);
                WeakHashMap weakHashMap7 = C2816.f9398;
                C3080 c3086 = new C3080(AbstractC1434.m3061(c5362).f9416, AbstractC1434.m3061(c5362).f9406);
                i9 = 2;
                interfaceC0707 = C4217.f13994;
                interfaceC4688 = c3086;
            }
            c5362.m8964();
            zM8963 = c5362.m8963(interfaceC4688);
            objM8999 = c5362.m8999();
            Object obj4 = C2850.f9517;
            if (zM8963) {
                objM8999 = new C2997(interfaceC4688);
                c5362.m8987(objM8999);
            } else {
                objM8999 = new C2997(interfaceC4688);
                c5362.m8987(objM8999);
            }
            c2997 = (C2997) objM8999;
            zM8964 = c5362.m8963(c2997) | c5362.m8963(interfaceC4688);
            InterfaceC5731 interfaceC573115 = interfaceC5736;
            objM89910 = c5362.m8999();
            if (zM8964) {
                objM89910 = new C1708(3, c2997, interfaceC4688);
                c5362.m8987(objM89910);
            } else {
                objM89910 = new C1708(3, c2997, interfaceC4688);
                c5362.m8987(objM89910);
            }
            InterfaceC5731 interfaceC573116 = interfaceC57310;
            InterfaceC5731 interfaceC573117 = interfaceC57311;
            InterfaceC5731 interfaceC573118 = interfaceC57312;
            int i15 = i9;
            long j12 = j5;
            long j13 = jM215;
            AbstractC0701.m1560(AbstractC5568.m9367(interfaceC0707, (InterfaceC4745) objM89910), null, j12, j13, 0.0f, 0.0f, AbstractC3925.m7034(848889571, new C2915(i15, interfaceC573116, c0857, interfaceC573118, interfaceC573115, c2997, interfaceC573117), c5362), c5362, 12582912, 114);
            j3 = j12;
            j4 = j13;
            interfaceC0706 = interfaceC0707;
            interfaceC4687 = interfaceC4688;
            interfaceC5735 = interfaceC573116;
            interfaceC5737 = interfaceC573117;
            interfaceC5738 = interfaceC573118;
            interfaceC5739 = interfaceC573115;
            i8 = i15;
        } else {
            c5362.m8982();
            interfaceC0706 = interfaceC0705;
            interfaceC5737 = interfaceC5732;
            interfaceC5738 = interfaceC5733;
            i8 = i;
            j3 = j;
            j4 = j2;
            interfaceC4687 = interfaceC4686;
            interfaceC5739 = interfaceC5736;
        }
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥٞؔٗۙ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iM6835 = AbstractC3831.m6835(i2 | 1);
                    AbstractC3831.m6857(interfaceC0706, interfaceC5735, interfaceC5737, interfaceC5738, interfaceC5739, i8, j3, j4, interfaceC4687, c0857, (C5362) obj5, iM6835, i3);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static int m6858(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static int m6859(InterfaceC0759 interfaceC0759, int i, byte[] bArr, int i2, int i3, InterfaceC5083 interfaceC5083, C0958 c0958) throws C5463 {
        AbstractC5212 abstractC5212Mo1651 = interfaceC0759.mo1651();
        InterfaceC0759 interfaceC07510 = interfaceC0759;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C0958 c0959 = c0958;
        int iM6839 = m6839(abstractC5212Mo1651, interfaceC07510, bArr2, i2, i4, c0959);
        interfaceC07510.mo1654(abstractC5212Mo1651);
        c0959.f3397 = abstractC5212Mo1651;
        interfaceC5083.add(abstractC5212Mo1651);
        while (iM6839 < i4) {
            C0958 c09510 = c0959;
            int i5 = i4;
            int iM6881 = m6881(bArr2, iM6839, c09510);
            if (i != c09510.f3399) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC0759 interfaceC07511 = interfaceC07510;
            AbstractC5212 abstractC5212Mo1652 = interfaceC07511.mo1651();
            iM6839 = m6839(abstractC5212Mo1652, interfaceC07511, bArr3, iM6881, i5, c09510);
            interfaceC07510 = interfaceC07511;
            bArr2 = bArr3;
            i4 = i5;
            c0959 = c09510;
            interfaceC07510.mo1654(abstractC5212Mo1652);
            c0959.f3397 = abstractC5212Mo1652;
            interfaceC5083.add(abstractC5212Mo1652);
        }
        return iM6839;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static final void m6860(C5817 c5817, C3129 c3129) {
        Object objM6027 = c3129.m5769().f8490.m6027(AbstractC2771.f9230);
        if (objM6027 == null) {
            objM6027 = null;
        }
        if (objM6027 != null) {
            C0178.m382();
            return;
        }
        C3129 c3129M5766 = c3129.m5766();
        if (c3129M5766 == null) {
            return;
        }
        Object objM6028 = c3129M5766.m5769().f8490.m6027(AbstractC2771.f9200);
        if (objM6028 == null) {
            objM6028 = null;
        }
        if (objM6028 != null) {
            Object objM6029 = c3129M5766.m5769().f8490.m6027(AbstractC2771.f9201);
            C5548 c5548 = (C5548) (objM6029 != null ? objM6029 : null);
            if (c5548 == null || (c5548.f18325 >= 0 && c5548.f18324 >= 0)) {
                if (c3129.m5769().f8490.m6015(AbstractC2771.f9218)) {
                    ArrayList arrayList = new ArrayList();
                    List listM5756 = C3129.m5756(4, c3129M5766);
                    int size = listM5756.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        C3129 c31210 = (C3129) listM5756.get(i2);
                        if (c31210.m5769().f8490.m6015(AbstractC2771.f9218)) {
                            arrayList.add(c31210);
                            if (c31210.f10471.m1362() < c3129.f10471.m1362()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zM6867 = m6867(arrayList);
                    int i3 = zM6867 ? 0 : i;
                    int i4 = zM6867 ? i : 0;
                    Object objM60210 = c3129.m5769().f8490.m6027(AbstractC2771.f9218);
                    if (objM60210 == null) {
                        objM60210 = Boolean.FALSE;
                    }
                    c5817.f19154.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) objM60210).booleanValue()));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۧ */
    public static void m6861(Context context, String str) {
        synchronized (f12712) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Exception e) {
                        Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX INFO: renamed from: ۥۨ */
    public static int m6862(int i, byte[] bArr, int i2, int i3, C3192 c3192, C0958 c0958) throws C5463 {
        if ((i >>> 3) == 0) {
            C2316.m4358("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM6849 = m6849(bArr, i2, c0958);
            c3192.m5890(i, Long.valueOf(c0958.f3398));
            return iM6849;
        }
        if (i4 == 1) {
            c3192.m5890(i, Long.valueOf(m6864(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM6881 = m6881(bArr, i2, c0958);
            int i5 = c0958.f3399;
            if (i5 < 0) {
                C2316.m4358("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iM6881) {
                C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                c3192.m5890(i, AbstractC4314.f14260);
            } else {
                c3192.m5890(i, AbstractC4314.m7597(bArr, iM6881, i5));
            }
            return iM6881 + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                c3192.m5890(i, Integer.valueOf(m6858(i2, bArr)));
                return i2 + 4;
            }
            C2316.m4358("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        C3192 c3192M5886 = C3192.m5886();
        int i7 = c0958.f3400 + 1;
        c0958.f3400 = i7;
        if (i7 >= 100) {
            C2316.m4358("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iM6882 = m6881(bArr, i2, c0958);
            int i9 = c0958.f3399;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM6882;
                break;
            }
            i2 = m6862(i9, bArr, iM6882, i3, c3192M5886, c0958);
            i8 = i9;
        }
        c0958.f3400--;
        if (i2 > i3 || i8 != i6) {
            C2316.m4358("Failed to parse the message.");
            return 0;
        }
        c3192.m5890(i, c3192M5886);
        return i2;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final Object m6863(float f, float f2, float f3, InterfaceC3347 interfaceC3347, InterfaceC5731 interfaceC5731, AbstractC2426 abstractC2426) {
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        C1280 c1280 = f12709;
        InterfaceC4745 interfaceC4745 = c1280.f4359;
        AbstractC1814 abstractC1814Mo2171 = (AbstractC1814) interfaceC4745.mo211(f6);
        if (abstractC1814Mo2171 == null) {
            abstractC1814Mo2171 = ((AbstractC1814) interfaceC4745.mo211(f4)).mo2171();
        }
        AbstractC1814 abstractC1814 = abstractC1814Mo2171;
        Object objM6842 = m6842(new C3411(c1280, f4, abstractC1814, 56), new C4214(interfaceC3347, c1280, f4, f5, abstractC1814), Long.MIN_VALUE, new C4884(15, interfaceC5731), abstractC2426);
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (objM6842 != enumC2282) {
            objM6842 = c2358;
        }
        return objM6842 == enumC2282 ? objM6842 : c2358;
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static long m6864(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static InterfaceC0705 m6865(InterfaceC0705 interfaceC0705, boolean z, InterfaceC4448 interfaceC4448) {
        return interfaceC0705.mo1571(new C2879(z, null, null, true, true, null, interfaceC4448));
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final InterfaceC0705 m6866(InterfaceC0705 interfaceC0705, boolean z, InterfaceC3016 interfaceC3016, boolean z2, C2155 c2155, InterfaceC4448 interfaceC4448) {
        InterfaceC0705 interfaceC0705M2152;
        if (interfaceC3016 != null) {
            interfaceC0705M2152 = new C2879(z, null, interfaceC3016, false, z2, c2155, interfaceC4448);
        } else if (interfaceC3016 == null) {
            interfaceC0705M2152 = new C2879(z, null, null, false, z2, c2155, interfaceC4448);
        } else {
            interfaceC0705M2152 = AbstractC0993.m2152(C4217.f13994, new C3423(interfaceC3016, z, z2, c2155, interfaceC4448));
        }
        return interfaceC0705.mo1571(interfaceC0705M2152);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final boolean m6867(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = C2340.f7777;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iM4181 = AbstractC2164.m4181(arrayList);
                int i = 0;
                while (i < iM4181) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    C3129 c3129 = (C3129) obj2;
                    C3129 c31210 = (C3129) obj;
                    arrayList2.add(new C1553((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c31210.m5770().m5319() >> 32)) - Float.intBitsToFloat((int) (c3129.m5770().m5319() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c31210.m5770().m5319() & 4294967295L)) - Float.intBitsToFloat((int) (c3129.m5770().m5319() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((C1553) AbstractC0973.m2045(list)).f5241;
            } else {
                if (list.isEmpty()) {
                    AbstractC0844.m1755("Empty collection can't be reduced.");
                }
                Object objM2045 = AbstractC0973.m2045(list);
                int iM4182 = AbstractC2164.m4181(list);
                if (1 <= iM4182) {
                    int i2 = 1;
                    while (true) {
                        objM2045 = new C1553(C1553.m3304(((C1553) objM2045).f5241, ((C1553) list.get(i2)).f5241));
                        if (i2 == iM4182) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((C1553) objM2045).f5241;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final List m6868(InterfaceC4112 interfaceC4112, C3833 c3833, C5086 c5086) {
        C3046 c3046;
        C0863 c0863 = (C0863) c5086.f16877;
        if (!(c0863.f3180 != 0) && c3833.f12721.isEmpty()) {
            return C2340.f7777;
        }
        ArrayList arrayList = new ArrayList();
        if (((C0863) c5086.f16877).f3180 != 0) {
            int i = c0863.f3180;
            if (i == 0) {
                C0178.m384("MutableVector is empty.");
                return null;
            }
            Object[] objArr = c0863.f3182;
            int i2 = ((C1973) objArr[0]).f6531;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((C1973) objArr[i3]).f6531;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                AbstractC4690.m8038("negative minIndex");
            }
            int i5 = c0863.f3180;
            if (i5 == 0) {
                C0178.m384("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = c0863.f3182;
            int i6 = ((C1973) objArr2[0]).f6530;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((C1973) objArr2[i7]).f6530;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            c3046 = new C3046(i2, Math.min(i6, interfaceC4112.mo5821() - 1), 1);
        } else {
            c3046 = C3046.f10240;
        }
        int size = c3833.f12721.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1506 c1506 = (C1506) c3833.get(i9);
            int iM7441 = AbstractC4225.m7441(c1506.f5113, interfaceC4112, c1506.f5117);
            int i10 = c3046.f6006;
            if ((iM7441 > c3046.f6005 || i10 > iM7441) && iM7441 >= 0 && iM7441 < interfaceC4112.mo5821()) {
                arrayList.add(Integer.valueOf(iM7441));
            }
        }
        int i11 = c3046.f6006;
        int i12 = c3046.f6005;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final void m6869(C3131 c3131, String str) {
        String strM8669;
        String str2 = "in the polymorphic scope of '" + c3131.m5775() + '\'';
        if (str == null) {
            strM8669 = AbstractC5078.m8669('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            strM8669 = "Serializer for subclass '" + str + "' is not found " + str2 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + c3131.m5775() + "' has to be sealed and '@Serializable'.";
        }
        throw new C0480(strM8669);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static final Object m6870(AbstractC4971 abstractC4971, long j, InterfaceC5731 interfaceC5731) {
        Unsafe unsafe;
        long j2;
        while (true) {
            AbstractC4971 abstractC4972 = abstractC4971;
            while (true) {
                if (abstractC4972.f16448 >= j && !abstractC4972.mo3084()) {
                    return abstractC4972;
                }
                Object objectVolatile = AbstractC3456.f11473.getObjectVolatile(abstractC4972, AbstractC1469.f5003);
                C5536 c5536 = f12710;
                if (objectVolatile == c5536) {
                    return c5536;
                }
                abstractC4971 = (AbstractC4971) ((AbstractC1469) objectVolatile);
                if (abstractC4971 != null) {
                    break;
                }
                AbstractC4971 abstractC4973 = (AbstractC4971) interfaceC5731.mo219(Long.valueOf(abstractC4972.f16448 + 1), abstractC4972);
                do {
                    unsafe = AbstractC3456.f11473;
                    j2 = AbstractC1469.f5003;
                    if (unsafe.compareAndSwapObject(abstractC4972, j2, (Object) null, abstractC4973)) {
                        if (abstractC4972.mo3084()) {
                            abstractC4972.m3087();
                        }
                        abstractC4972 = abstractC4973;
                        break;
                    }
                } while (unsafe.getObjectVolatile(abstractC4972, j2) == null);
            }
        }
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static final void m6871(List list, C0935 c0935) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        Path path = c0935.f3328;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path.setFillType(fillType2);
        AbstractC3008 abstractC3008 = list2.isEmpty() ? C0991.f3518 : (AbstractC3008) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i < size) {
            AbstractC3008 abstractC3009 = (AbstractC3008) list2.get(i);
            if (abstractC3009 instanceof C0991) {
                path.close();
                path = path;
                size = size;
                f11 = f11;
                i = i;
                abstractC3009 = abstractC3009;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (abstractC3009 instanceof C4510) {
                    C4510 c4510 = (C4510) abstractC3009;
                    float f18 = c4510.f14906;
                    f14 += f18;
                    float f19 = c4510.f14907;
                    f15 += f19;
                    path.rMoveTo(f18, f19);
                    path = path;
                    f16 = f14;
                    f17 = f15;
                } else if (abstractC3009 instanceof C5744) {
                    C5744 c5744 = (C5744) abstractC3009;
                    float f20 = c5744.f18940;
                    float f21 = c5744.f18941;
                    path.moveTo(f20, f21);
                    f15 = f21;
                    f17 = f15;
                    f14 = f20;
                    f16 = f14;
                } else if (abstractC3009 instanceof C2544) {
                    C2544 c2544 = (C2544) abstractC3009;
                    float f22 = c2544.f8495;
                    float f23 = c2544.f8494;
                    path.rLineTo(f23, f22);
                    f14 += f23;
                    f15 += f22;
                } else if (abstractC3009 instanceof C2649) {
                    C2649 c2649 = (C2649) abstractC3009;
                    float f24 = c2649.f8798;
                    float f25 = c2649.f8797;
                    path.lineTo(f25, f24);
                    f14 = f25;
                    f15 = f24;
                } else if (abstractC3009 instanceof C0749) {
                    float f26 = ((C0749) abstractC3009).f2726;
                    path.rLineTo(f26, f11);
                    f14 += f26;
                } else if (abstractC3009 instanceof C2254) {
                    float f27 = ((C2254) abstractC3009).f7470;
                    path.lineTo(f27, f15);
                    f14 = f27;
                } else if (abstractC3009 instanceof C4227) {
                    float f28 = ((C4227) abstractC3009).f14021;
                    path.rLineTo(f11, f28);
                    f15 += f28;
                } else if (abstractC3009 instanceof C1732) {
                    float f29 = ((C1732) abstractC3009).f5761;
                    path.lineTo(f14, f29);
                    f15 = f29;
                } else {
                    if (abstractC3009 instanceof C3208) {
                        C3208 c3208 = (C3208) abstractC3009;
                        path.rCubicTo(c3208.f10760, c3208.f10764, c3208.f10761, c3208.f10762, c3208.f10765, c3208.f10763);
                        f3 = c3208.f10761 + f14;
                        f4 = c3208.f10762 + f15;
                        f14 += c3208.f10765;
                        f10 = c3208.f10763;
                    } else {
                        if (abstractC3009 instanceof C2052) {
                            C2052 c2052 = (C2052) abstractC3009;
                            path.cubicTo(c2052.f6761, c2052.f6765, c2052.f6762, c2052.f6763, c2052.f6766, c2052.f6764);
                            f3 = c2052.f6762;
                            f5 = c2052.f6763;
                            f6 = c2052.f6766;
                            f7 = c2052.f6764;
                        } else if (abstractC3009 instanceof C4864) {
                            if (abstractC3008.f10128) {
                                f8 = f14 - f12;
                                f9 = f15 - f13;
                            } else {
                                f8 = f11;
                                f9 = f8;
                            }
                            C4864 c4864 = (C4864) abstractC3009;
                            path.rCubicTo(f8, f9, c4864.f15997, c4864.f16000, c4864.f15998, c4864.f15999);
                            f3 = c4864.f15997 + f14;
                            f4 = c4864.f16000 + f15;
                            f14 += c4864.f15998;
                            f10 = c4864.f15999;
                        } else if (abstractC3009 instanceof C0292) {
                            if (abstractC3008.f10128) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            C0292 c0292 = (C0292) abstractC3009;
                            path.cubicTo(f14, f15, c0292.f1073, c0292.f1076, c0292.f1074, c0292.f1075);
                            f3 = c0292.f1073;
                            f5 = c0292.f1076;
                            f6 = c0292.f1074;
                            f7 = c0292.f1075;
                        } else if (abstractC3009 instanceof C0501) {
                            C0501 c0501 = (C0501) abstractC3009;
                            float f30 = c0501.f1813;
                            float f31 = c0501.f1812;
                            float f32 = c0501.f1814;
                            float f33 = c0501.f1811;
                            path.rQuadTo(f33, f32, f31, f30);
                            float f34 = f33 + f14;
                            float f35 = f32 + f15;
                            f14 += f31;
                            f15 += f30;
                            f12 = f34;
                            f13 = f35;
                        } else if (abstractC3009 instanceof C2855) {
                            C2855 c2855 = (C2855) abstractC3009;
                            float f36 = c2855.f9561;
                            float f37 = c2855.f9560;
                            float f38 = c2855.f9562;
                            f3 = c2855.f9559;
                            path.quadTo(f3, f38, f37, f36);
                            f15 = f36;
                            f14 = f37;
                            f13 = f38;
                            f12 = f3;
                        } else if (abstractC3009 instanceof C3854) {
                            if (abstractC3008.f10127) {
                                f = f14 - f12;
                                f2 = f15 - f13;
                            } else {
                                f = f11;
                                f2 = f;
                            }
                            C3854 c3854 = (C3854) abstractC3009;
                            float f39 = c3854.f12877;
                            float f40 = c3854.f12876;
                            path.rQuadTo(f, f2, f40, f39);
                            f3 = f + f14;
                            f4 = f2 + f15;
                            f14 += f40;
                            f15 += f39;
                            f13 = f4;
                            f12 = f3;
                        } else if (abstractC3009 instanceof C2130) {
                            if (abstractC3008.f10127) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            C2130 c2130 = (C2130) abstractC3009;
                            float f41 = c2130.f6993;
                            float f42 = c2130.f6992;
                            path.quadTo(f14, f15, f42, f41);
                            path = path;
                            size = size;
                            f11 = f11;
                            i = i;
                            f13 = f15;
                            abstractC3009 = abstractC3009;
                            f15 = f41;
                            f12 = f14;
                            f14 = f42;
                        } else if (abstractC3009 instanceof C0596) {
                            C0596 c0596 = (C0596) abstractC3009;
                            float f43 = c0596.f2204 + f14;
                            float f44 = c0596.f2206 + f15;
                            size = size;
                            f11 = 0.0f;
                            path = path;
                            i = i;
                            m6877(c0935, f14, f15, f43, f44, c0596.f2201, c0596.f2205, c0596.f2202, c0596.f2203, c0596.f2207);
                            f12 = f43;
                            f14 = f12;
                            f13 = f44;
                            f15 = f13;
                            abstractC3009 = abstractC3009;
                        } else {
                            path = path;
                            size = size;
                            f11 = f11;
                            i = i;
                            if (!(abstractC3009 instanceof C5626)) {
                                C1078.m2275();
                                return;
                            }
                            C5626 c5626 = (C5626) abstractC3009;
                            float f45 = c5626.f18550;
                            float f46 = c5626.f18548;
                            abstractC3009 = abstractC3009;
                            m6877(c0935, f14, f15, f46, f45, c5626.f18545, c5626.f18549, c5626.f18546, c5626.f18547, c5626.f18551);
                            f13 = f45;
                            f15 = f13;
                            f12 = f46;
                            f14 = f12;
                        }
                        path = path;
                        f14 = f6;
                        f15 = f7;
                        f13 = f5;
                        f12 = f3;
                    }
                    f15 += f10;
                    f13 = f4;
                    f12 = f3;
                }
                abstractC3009 = abstractC3009;
            }
            i++;
            list2 = list;
            size = size;
            path = path;
            abstractC3008 = abstractC3009;
            f11 = f11;
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final float m6872(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦٚ */
    public static String m6873(Context context) {
        String attributeValue;
        synchronized (f12712) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException | XmlPullParserException unused2) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static boolean m6874(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final Object m6875(C3411 c3411, Float f, InterfaceC3347 interfaceC3347, boolean z, InterfaceC4745 interfaceC4745, AbstractC0772 abstractC0772) {
        Object objM6842 = m6842(c3411, new C4214(interfaceC3347, c3411.f11360, c3411.f11359.getValue(), f, c3411.f11356), z ? c3411.f11357 : Long.MIN_VALUE, interfaceC4745, abstractC0772);
        return objM6842 == EnumC2282.f7590 ? objM6842 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final Object m6876(InterfaceC4334 interfaceC4334, InterfaceC4745 interfaceC4745, C1296 c1296) {
        InterfaceC3534 interfaceC3534 = c1296.f2791;
        if (!interfaceC4334.mo2838()) {
            return AbstractC2133.m4131(interfaceC3534).m4526(new C3282(interfaceC4745, 2), c1296);
        }
        if (interfaceC3534.mo865(C1298.f4458) == null) {
            return AbstractC2133.m4131(interfaceC3534).m4526(interfaceC4745, c1296);
        }
        C0178.m382();
        return null;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final void m6877(C0935 c0935, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            m6877(c0935, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            c0935.f3328.cubicTo((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            dSin2 = dSin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final void m6878(C5535 c5535, C3411 c3411) {
        c3411.f11359.setValue(c5535.f18269.getValue());
        AbstractC1814 abstractC1814 = c3411.f11356;
        AbstractC1814 abstractC1815 = c5535.f18270;
        int iMo2173 = abstractC1814.mo2173();
        for (int i = 0; i < iMo2173; i++) {
            abstractC1814.mo2172(i, abstractC1815.mo2174(i));
        }
        c3411.f11355 = c5535.f18272;
        c3411.f11357 = c5535.f18276;
        c3411.f11358 = ((Boolean) c5535.f18275.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static int m6879(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static int m6880(int i, byte[] bArr, int i2, int i3, C0958 c0958) throws C5463 {
        if ((i >>> 3) == 0) {
            C2316.m4358("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m6849(bArr, i2, c0958);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m6881(bArr, i2, c0958) + c0958.f3399;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            C2316.m4358("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m6881(bArr, i2, c0958);
            i6 = c0958.f3399;
            if (i6 == i5) {
                break;
            }
            i2 = m6880(i6, bArr, i2, i3, c0958);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        C2316.m4358("Failed to parse the message.");
        return 0;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static int m6881(byte[] bArr, int i, C0958 c0958) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m6847(b, bArr, i2, c0958);
        }
        c0958.f3399 = b;
        return i2;
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static int m6882(byte[] bArr, int i, InterfaceC5083 interfaceC5083, C0958 c0958) throws C5463 {
        C2667 c2667 = (C2667) interfaceC5083;
        int iM6881 = m6881(bArr, i, c0958);
        int i2 = c0958.f3399 + iM6881;
        while (iM6881 < i2) {
            iM6881 = m6881(bArr, iM6881, c0958);
            c2667.m4969(c0958.f3399);
        }
        if (iM6881 == i2) {
            return iM6881;
        }
        C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m6883(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    /* JADX INFO: renamed from: ۥٕ */
    public abstract void mo4832(C1489 c1489, C2067 c2067);

    /* JADX INFO: renamed from: ۦؗ */
    public abstract AbstractC0881 mo4833(String str);

    /* JADX INFO: renamed from: ۦِ */
    public InterfaceC0858 mo4390(Context context, Looper looper, C2813 c2813, Object obj, InterfaceC1895 interfaceC1895, InterfaceC3785 interfaceC3785) {
        return mo4391(context, looper, c2813, obj, (C3184) interfaceC1895, (C3184) interfaceC3785);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public InterfaceC0858 mo4391(Context context, Looper looper, C2813 c2813, Object obj, C3184 c3184, C3184 c3185) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
