package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۥّؕؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0487 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0857 f1771;

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5536 f1772;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0857 f1773;

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5536 f1777;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f1778;

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0857 f1768 = new C0857(421232438, new C2463(16), false);

    /* JADX INFO: renamed from: ۥُ */
    public static final C0857 f1769 = new C0857(-511602031, new C0064(18), false);

    /* JADX INFO: renamed from: ۥّ */
    public static final C0857 f1770 = new C0857(1669091354, new C0064(19), false);

    /* JADX INFO: renamed from: ۦٛ */
    public static final byte[] f1775 = {112, 114, 111, 0};

    /* JADX INFO: renamed from: ۦِ */
    public static final byte[] f1774 = {112, 114, 109, 0};

    /* JADX INFO: renamed from: ۦۗ */
    public static final C0220 f1776 = new C0220("task-list-done");

    static {
        int i = 17;
        f1771 = new C0857(-81156083, new C0064(i), false);
        f1773 = new C0857(-1122660065, new C2463(i), false);
        int i2 = 2;
        f1777 = new C5536(i2, "REMOVED_TASK");
        f1772 = new C5536(i2, "CLOSED_EMPTY");
    }

    public /* synthetic */ AbstractC0487(int i) {
        this.f1778 = i;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static final C1911 m1035(C3176 c3176) {
        if (c3176 instanceof C3176) {
            return C1298.f4443;
        }
        C0178.m385(c3176, "Unknown position: ");
        return null;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static /* synthetic */ PackageInfo m1036(String str) {
        App app = App.f407;
        return m1081(AbstractC1631.m3410(), str);
    }

    /* JADX INFO: renamed from: ۥؕ */
    public static String m1037(int i, int i2, String str) {
        if (i < 0) {
            return C5063.m8611("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C5063.m8611("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C1078.m2272(AbstractC5078.m8673(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static final InterfaceC3534 m1038(WorkDatabase workDatabase, AbstractC0772 abstractC0772) {
        if (!workDatabase.m97()) {
            C3950 c3950 = workDatabase.f254;
            return (c3950 != null ? c3950 : null).f13208;
        }
        if (abstractC0772.mo334().mo865(AbstractC5727.f18869) == null) {
            C3950 c3951 = workDatabase.f254;
            return (c3951 != null ? c3951 : null).f13208;
        }
        C0178.m382();
        return null;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m1039(long j, C3564 c3564, C0857 c0857, C5362 c5362, int i) {
        long j2;
        C3564 c3565;
        C0857 c0858;
        C5362 c5363;
        c5362.m8979(396611577);
        int i2 = (c5362.m8961(j) ? 4 : 2) | i | (c5362.m8963(c3564) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= c5362.m8977(c0857) ? 256 : 128;
        }
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            c5363 = c5362;
            AbstractC2765.m5143(j, c3564, c0857, c5363, i2 & 1022);
            j2 = j;
            c3565 = c3564;
            c0858 = c0857;
        } else {
            j2 = j;
            c3565 = c3564;
            c0858 = c0857;
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4710(j2, c3565, c0858, i, 2);
        }
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static final void m1040(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static final void m1041(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    /* JADX INFO: renamed from: ۥً */
    public static final float m1042(C0522 c0522) {
        if (c0522 != null) {
            return c0522.f1852;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final void m1043(int i, int i2) {
        if (i < 0 || i > i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m1044(InterfaceC4396 interfaceC4396, C4153 c4153, InterfaceC4643 interfaceC4643, boolean z, InterfaceC4367 interfaceC4367, C0857 c0857, C5362 c5362, int i) {
        InterfaceC4396 interfaceC4397;
        int i2;
        c5362.m8979(-1413720282);
        if ((i & 6) == 0) {
            interfaceC4397 = interfaceC4396;
            i2 = (c5362.m8963(interfaceC4397) ? 4 : 2) | i;
        } else {
            interfaceC4397 = interfaceC4396;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c5362.m8963(c4153) : c5362.m8977(c4153) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8977(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m8977(interfaceC4643) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c5362.m9006(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c5362.m8963(interfaceC4367) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c5362.m8977(c0857) ? 1048576 : 524288;
        }
        int i3 = 0;
        int i4 = 1;
        if (c5362.m9011(i2 & 1, (599187 & i2) != 599186)) {
            String strM5804 = C3133.m5804(R.string.tooltip_description, c5362);
            boolean zM8977 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && c5362.m8977(c4153))) | ((i2 & 896) == 256) | c5362.m8977(interfaceC4643) | ((458752 & i2) == 131072);
            Object objM8999 = c5362.m8999();
            if (zM8977 || objM8999 == C2850.f9517) {
                objM8999 = new C1597(c4153, interfaceC4643, interfaceC4367, i4);
                c5362.m8987(objM8999);
            }
            int i5 = (i2 & 14) | 3072;
            AbstractC3026.m5617(interfaceC4397, (InterfaceC4448) objM8999, new C5236(1, 0, z, true), AbstractC3925.m7034(-1287705660, new C0491(i3, strM5804, c0857), c5362), c5362, i5, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1229(interfaceC4396, c4153, interfaceC4643, z, interfaceC4367, c0857, i);
        }
    }

    /* JADX INFO: renamed from: ۥِ */
    public static boolean m1045(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C2754[] c2754Arr) throws IOException {
        int i;
        long j;
        int length;
        byte[] bArr2 = AbstractC2133.f7003;
        byte[] bArr3 = AbstractC2133.f7004;
        byte[] bArr4 = AbstractC2133.f6996;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = AbstractC2133.f7006;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM1056 = m1056(c2754Arr, bArr5);
                AbstractC2552.m4820(byteArrayOutputStream, c2754Arr.length, 1);
                AbstractC2552.m4820(byteArrayOutputStream, bArrM1056.length, 4);
                byte[] bArrM4825 = AbstractC2552.m4825(bArrM1056);
                AbstractC2552.m4820(byteArrayOutputStream, bArrM4825.length, 4);
                byteArrayOutputStream.write(bArrM4825);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                AbstractC2552.m4820(byteArrayOutputStream, c2754Arr.length, 1);
                for (C2754 c2754 : c2754Arr) {
                    int size = c2754.f9118.size() * 4;
                    String strM1080 = m1080(c2754.f9116, c2754.f9114, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    AbstractC2552.m4792(byteArrayOutputStream, strM1080.getBytes(charset).length);
                    AbstractC2552.m4792(byteArrayOutputStream, c2754.f9115.length);
                    AbstractC2552.m4820(byteArrayOutputStream, size, 4);
                    AbstractC2552.m4820(byteArrayOutputStream, c2754.f9111, 4);
                    byteArrayOutputStream.write(strM1080.getBytes(charset));
                    Iterator it = c2754.f9118.keySet().iterator();
                    while (it.hasNext()) {
                        AbstractC2552.m4792(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        AbstractC2552.m4792(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c2754.f9115) {
                        AbstractC2552.m4792(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = AbstractC2133.f6998;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM1057 = m1056(c2754Arr, bArr6);
                AbstractC2552.m4820(byteArrayOutputStream, c2754Arr.length, 1);
                AbstractC2552.m4820(byteArrayOutputStream, bArrM1057.length, 4);
                byte[] bArrM4826 = AbstractC2552.m4825(bArrM1057);
                AbstractC2552.m4820(byteArrayOutputStream, bArrM4826.length, 4);
                byteArrayOutputStream.write(bArrM4826);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            AbstractC2552.m4792(byteArrayOutputStream, c2754Arr.length);
            for (C2754 c2755 : c2754Arr) {
                String str = c2755.f9116;
                TreeMap treeMap = c2755.f9118;
                String strM1081 = m1080(str, c2755.f9114, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                AbstractC2552.m4792(byteArrayOutputStream, strM1081.getBytes(charset2).length);
                AbstractC2552.m4792(byteArrayOutputStream, treeMap.size());
                AbstractC2552.m4792(byteArrayOutputStream, c2755.f9115.length);
                AbstractC2552.m4820(byteArrayOutputStream, c2755.f9111, 4);
                byteArrayOutputStream.write(strM1081.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    AbstractC2552.m4792(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c2755.f9115) {
                    AbstractC2552.m4792(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            AbstractC2552.m4792(byteArrayOutputStream2, c2754Arr.length);
            int i5 = 2;
            int i6 = 2;
            for (C2754 c2756 : c2754Arr) {
                AbstractC2552.m4820(byteArrayOutputStream2, c2756.f9111, 4);
                AbstractC2552.m4820(byteArrayOutputStream2, c2756.f9117, 4);
                AbstractC2552.m4820(byteArrayOutputStream2, c2756.f9119, 4);
                String strM1082 = m1080(c2756.f9116, c2756.f9114, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM1082.getBytes(charset3).length;
                AbstractC2552.m4792(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strM1082.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            C1344 c1344 = new C1344(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(c1344);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c2754Arr.length) {
                try {
                    C2754 c2757 = c2754Arr[i7];
                    AbstractC2552.m4792(byteArrayOutputStream3, i7);
                    AbstractC2552.m4792(byteArrayOutputStream3, c2757.f9112);
                    i8 = i8 + 4 + (c2757.f9112 * i5);
                    int[] iArr = c2757.f9115;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        AbstractC2552.m4792(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            C1344 c1345 = new C1344(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(c1345);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < c2754Arr.length; i13++) {
                try {
                    C2754 c2758 = c2754Arr[i13];
                    Iterator it3 = c2758.f9118.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m1085(byteArrayOutputStream5, iIntValue, c2758);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m1086(byteArrayOutputStream6, c2758);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            AbstractC2552.m4792(byteArrayOutputStream4, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            AbstractC2552.m4820(byteArrayOutputStream4, length4, 4);
                            AbstractC2552.m4792(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i14 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            C1344 c1346 = new C1344(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(c1346);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            AbstractC2552.m4820(byteArrayOutputStream, arrayList.size(), 4);
            int i15 = 0;
            while (i15 < arrayList.size()) {
                C1344 c1347 = (C1344) arrayList.get(i15);
                int i16 = c1347.f4631;
                byte[] bArr7 = c1347.f4630;
                if (i16 != 1) {
                    i = i11;
                    if (i16 == i) {
                        j = 1;
                    } else if (i16 == 3) {
                        j = 2;
                    } else if (i16 == 4) {
                        j = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                AbstractC2552.m4820(byteArrayOutputStream, j, 4);
                AbstractC2552.m4820(byteArrayOutputStream, size2, 4);
                if (c1347.f4629) {
                    long length5 = bArr7.length;
                    byte[] bArrM4827 = AbstractC2552.m4825(bArr7);
                    arrayList2.add(bArrM4827);
                    AbstractC2552.m4820(byteArrayOutputStream, bArrM4827.length, 4);
                    AbstractC2552.m4820(byteArrayOutputStream, length5, 4);
                    length = bArrM4827.length;
                } else {
                    arrayList2.add(bArr7);
                    AbstractC2552.m4820(byteArrayOutputStream, bArr7.length, 4);
                    AbstractC2552.m4820(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                i11 = i;
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final void m1046(C4153 c4153, InterfaceC4367 interfaceC4367, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(1873232064);
        int i3 = 1;
        int i4 = 2;
        int i5 = 4;
        if ((i & 6) == 0) {
            i2 = (c5362.m9006(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c5362.m8963(c4153) : c5362.m8977(c4153) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8963(interfaceC4367) ? 256 : 128;
        }
        int i6 = 0;
        if ((i & 3072) == 0) {
            i2 |= c5362.m9006(false) ? 2048 : 1024;
        }
        int i7 = i & 24576;
        C4217 c4217 = C4217.f13994;
        if (i7 == 0) {
            i2 |= c5362.m8963(c4217) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c5362.m8977(c0857) ? 131072 : 65536;
        }
        if (c5362.m9011(i2 & 1, (74899 & i2) != 74898)) {
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = AbstractC3925.m7061(c5362);
                c5362.m8987(objM8999);
            }
            InterfaceC4643 interfaceC4643 = (InterfaceC4643) objM8999;
            InterfaceC0705 interfaceC0705M426 = AbstractC0186.m426(C5063.m8621(AbstractC2995.m5588(AbstractC2995.m5588(c4217, c4153, new C5365(c4153, i6)), c4153, new C5365(c4153, i3)).mo1571(new C0459(new C3464(C3133.m5804(R.string.tooltip_label, c5362), interfaceC4643, c4153, i4))), new C0079(i5, interfaceC4643, c4153)), new C0519(i6, c4153, interfaceC4367));
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, false);
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M426);
            InterfaceC4576.f15106.getClass();
            InterfaceC4448 interfaceC4448 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(interfaceC4448);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228M2297);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            C3136 c3136 = C0849.f3053;
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5362, iM1958, c3136);
            }
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            c0857.mo219(c5362, Integer.valueOf((i2 >> 15) & 14));
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0021(c4153, interfaceC4367, c0857, i);
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public static void m1047(Object obj) {
        if (obj != null) {
            return;
        }
        C0178.m387("null reference");
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static void m1048(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0178.m387(str);
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static final InterfaceC0705 m1049(InterfaceC0705 interfaceC0705, InterfaceC2609 interfaceC2609) {
        return interfaceC0705.mo1571(new C0785(interfaceC2609));
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final void m1050(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            C1078.m2272(AbstractC5078.m8679("fromIndex: ", i, i2, " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static int[] m1051(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM4801 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM4801 += (int) AbstractC2552.m4801(byteArrayInputStream, 2);
            iArr[i2] = iM4801;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static final int m1052(Bitmap bitmap) {
        int i;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else {
                    i = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
                }
                return height * i;
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static C2754[] m1053(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C2754[] c2754Arr) throws IOException {
        byte[] bArr3 = AbstractC2133.f7005;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC2133.f7001)) {
                C1078.m2276("Unsupported meta version");
                return null;
            }
            int iM4801 = (int) AbstractC2552.m4801(fileInputStream, 2);
            byte[] bArrM4822 = AbstractC2552.m4822(fileInputStream, (int) AbstractC2552.m4801(fileInputStream, 4), (int) AbstractC2552.m4801(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C1078.m2276("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM4822);
            try {
                C2754[] c2754ArrM1072 = m1072(byteArrayInputStream, bArr2, iM4801, c2754Arr);
                byteArrayInputStream.close();
                return c2754ArrM1072;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC2133.f6996, bArr2)) {
            C1078.m2276("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C1078.m2276("Unsupported meta version");
            return null;
        }
        int iM4802 = (int) AbstractC2552.m4801(fileInputStream, 1);
        byte[] bArrM4823 = AbstractC2552.m4822(fileInputStream, (int) AbstractC2552.m4801(fileInputStream, 4), (int) AbstractC2552.m4801(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C1078.m2276("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM4823);
        try {
            C2754[] c2754ArrM1065 = m1065(byteArrayInputStream2, iM4802, c2754Arr);
            byteArrayInputStream2.close();
            return c2754ArrM1065;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static C2754[] m1054(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC2133.f7006)) {
            C1078.m2276("Unsupported version");
            return null;
        }
        int iM4801 = (int) AbstractC2552.m4801(fileInputStream, 1);
        byte[] bArrM4822 = AbstractC2552.m4822(fileInputStream, (int) AbstractC2552.m4801(fileInputStream, 4), (int) AbstractC2552.m4801(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C1078.m2276("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM4822);
        try {
            C2754[] c2754ArrM1061 = m1061(byteArrayInputStream, str, iM4801);
            byteArrayInputStream.close();
            return c2754ArrM1061;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥٞ */
    public static void m1055(int i, int i2) {
        String strM8611;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM8611 = C5063.m8611("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C1078.m2272(AbstractC5078.m8673(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strM8611 = C5063.m8611("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM8611);
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static byte[] m1056(C2754[] c2754Arr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C2754 c2754 : c2754Arr) {
            length += ((((c2754.f9119 * 2) + 7) & (-8)) / 8) + (c2754.f9112 * 2) + m1080(c2754.f9116, c2754.f9114, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c2754.f9113;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC2133.f6998)) {
            int length2 = c2754Arr.length;
            while (i < length2) {
                C2754 c2755 = c2754Arr[i];
                m1070(byteArrayOutputStream, c2755, m1080(c2755.f9116, c2755.f9114, bArr));
                m1063(byteArrayOutputStream, c2755);
                i++;
            }
        } else {
            for (C2754 c2756 : c2754Arr) {
                m1070(byteArrayOutputStream, c2756, m1080(c2756.f9116, c2756.f9114, bArr));
            }
            int length3 = c2754Arr.length;
            while (i < length3) {
                m1063(byteArrayOutputStream, c2754Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX WARN: Code duplicated, block: B:190:0x029f  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:194:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:196:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:200:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:203:0x02fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:208:0x0303  */
    /* JADX WARN: Code duplicated, block: B:210:0x0307  */
    /* JADX WARN: Code duplicated, block: B:213:0x030b  */
    /* JADX WARN: Code duplicated, block: B:216:0x0324 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x0326  */
    /* JADX WARN: Code duplicated, block: B:221:0x032d  */
    /* JADX WARN: Code duplicated, block: B:223:0x0331  */
    /* JADX WARN: Code duplicated, block: B:226:0x0335  */
    /* JADX WARN: Code duplicated, block: B:229:0x0355  */
    /* JADX WARN: Code duplicated, block: B:238:0x038a  */
    /* JADX WARN: Code duplicated, block: B:240:0x038d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:241:0x038f  */
    /* JADX WARN: Code duplicated, block: B:243:0x0393  */
    /* JADX WARN: Code duplicated, block: B:245:0x0397 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x0399  */
    /* JADX WARN: Code duplicated, block: B:249:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:251:0x03b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:254:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:256:0x03bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:260:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:262:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:268:0x041d  */
    /* JADX WARN: Code duplicated, block: B:271:0x0446  */
    /* JADX WARN: Code duplicated, block: B:273:0x044a  */
    /* JADX WARN: Code duplicated, block: B:276:0x0469  */
    /* JADX WARN: Code duplicated, block: B:277:0x046c  */
    /* JADX WARN: Code duplicated, block: B:281:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:284:0x0502  */
    /* JADX WARN: Code duplicated, block: B:287:0x0510  */
    /* JADX WARN: Code duplicated, block: B:288:0x051d  */
    /* JADX WARN: Code duplicated, block: B:291:0x054b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0571  */
    /* JADX WARN: Code duplicated, block: B:297:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:298:0x05a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:300:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:302:0x05af  */
    /* JADX WARN: Code duplicated, block: B:303:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:306:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:308:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:310:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:313:0x0637  */
    /* JADX WARN: Code duplicated, block: B:314:0x0639  */
    /* JADX WARN: Code duplicated, block: B:318:0x0647  */
    /* JADX WARN: Code duplicated, block: B:320:0x068c  */
    /* JADX WARN: Code duplicated, block: B:322:0x069b  */
    /* JADX INFO: renamed from: ۥۗ */
    public static final void m1057(final CharSequence charSequence, final InterfaceC5731 interfaceC5731, final C3176 c3176, final InterfaceC2609 interfaceC2609, final InterfaceC5731 interfaceC5732, final boolean z, final boolean z2, final C2243 c2243, final InterfaceC1291 interfaceC1291, final C2154 c2154, final C0857 c0857, C5362 c5362, final int i, final int i2) {
        int i3;
        CharSequence charSequence2;
        int i4;
        int i5;
        EnumC4851 enumC4851;
        int i6;
        long j;
        C4852 c4852;
        float f;
        int iOrdinal;
        float f2;
        int i7;
        C3051 c3051M5195;
        C0969 c0969M4817;
        C0969 c0969M4818;
        int iOrdinal2;
        float f3;
        int iOrdinal3;
        float f4;
        C2451 c2451M1673;
        C3051 c3051M5196;
        int iOrdinal4;
        float f5;
        int iOrdinal5;
        C3051 c3051M5197;
        EnumC4851 enumC4852;
        int[] iArr;
        long j2;
        AbstractC3292 abstractC3292M2824;
        boolean zM8963;
        Object objM8999;
        C4036 c4036;
        EnumC4851 enumC4853;
        long j3;
        EnumC4851 enumC4854;
        long j4;
        int i8;
        C3051 c3051M5198;
        AbstractC3292 abstractC3292M2825;
        boolean zM8964;
        Object objM89910;
        C3051 c3051M5199;
        Object objM89911;
        C1873 c1873;
        C0857 c0857M7034;
        Object objM89912;
        Object objM89913;
        int i9;
        long j5;
        boolean z3;
        C0857 c0858;
        int iM6632;
        Object objM89914;
        InterfaceC4367 interfaceC4367;
        boolean z4;
        boolean zM8965;
        Object objM89915;
        C5362 c5363 = c5362;
        c5363.m8979(546805032);
        if ((i & 6) == 0) {
            i3 = (c5363.m8988(AbstractC3761.m6632(2)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            charSequence2 = charSequence;
            i3 |= c5363.m8977(charSequence2) ? 32 : 16;
        } else {
            charSequence2 = charSequence;
        }
        if ((i & 384) == 0) {
            i3 |= c5363.m8977(interfaceC5731) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c5363.m8963(c3176) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c5363.m8977(interfaceC2609) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c5363.m8977(null) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c5363.m8977(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c5363.m8977(interfaceC5732) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c5363.m8977(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c5363.m8977(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c5363.m8977(null) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 = i4 | (c5363.m9006(z) ? 32 : 16);
        } else {
            i5 = i4;
        }
        if ((i2 & 384) == 0) {
            i5 |= c5363.m9006(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= c5363.m9006(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= c5363.m8963(c2243) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= c5363.m8963(interfaceC1291) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= c5363.m8963(c2154) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= c5363.m8977(c0857) ? 8388608 : 4194304;
        }
        int i10 = i5;
        if (c5363.m9011(i3 & 1, ((306783379 & i3) == 306783378 && (i10 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) AbstractC0186.m433(c2243, c5363, (i10 >> 12) & 14).getValue()).booleanValue();
            EnumC4851 enumC4855 = EnumC4851.f15967;
            EnumC4851 enumC4856 = EnumC4851.f15969;
            EnumC4851 enumC4857 = EnumC4851.f15970;
            if (zBooleanValue) {
                enumC4851 = enumC4857;
            } else {
                enumC4851 = charSequence2.length() == 0 ? enumC4856 : enumC4855;
            }
            if (z2) {
                i6 = i3;
                j = zBooleanValue != 0 ? c2154.f7103 : c2154.f7086;
            } else {
                i6 = i3;
                j = c2154.f7075;
            }
            C4413 c4413 = (C4413) c5363.m8997(AbstractC4957.f16399);
            C3564 c3564 = c4413.f14545;
            C3564 c3565 = c4413.f14543;
            long j6 = j;
            long jM6359 = c3564.m6359();
            long j7 = C1327.f4591;
            boolean z5 = (C4462.m7744(jM6359, j7) && !C4462.m7744(c3565.m6359(), j7)) || (!C4462.m7744(c3564.m6359(), j7) && C4462.m7744(c3565.m6359(), j7));
            long jM63510 = c3565.m6359();
            long j8 = (z5 && jM63510 == 16) ? j6 : jM63510;
            long jM63511 = c3564.m6359();
            long j9 = (z5 && jM63511 == 16) ? j6 : jM63511;
            boolean z6 = interfaceC2609 != null;
            C0777 c0777M5189 = AbstractC2774.m5189(enumC4851, "TextFieldInputState", c5363, 48, 0);
            C4852 c4853 = c0777M5189.f2814;
            C0969 c0969M4819 = AbstractC2552.m4817(2, c5363);
            C1280 c1280 = AbstractC3831.f12709;
            EnumC4851 enumC4858 = (EnumC4851) c0777M5189.m1671();
            c5363.m8957(-1436405362);
            int iOrdinal6 = enumC4858.ordinal();
            float f6 = 0.0f;
            if (iOrdinal6 != 0) {
                c4852 = c4853;
                if (iOrdinal6 == 1) {
                    if (z6) {
                        f = 0.0f;
                    }
                    c5363.m9009(false);
                    Float fValueOf = Float.valueOf(f);
                    EnumC4851 enumC4859 = (EnumC4851) c4852.getValue();
                    c5363.m8957(-1436405362);
                    iOrdinal = enumC4859.ordinal();
                    if (iOrdinal == 0) {
                        f2 = 1.0f;
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                C1078.m2275();
                                return;
                            }
                        } else if (z6) {
                            f2 = 0.0f;
                        }
                        f2 = 1.0f;
                    }
                    c5363.m9009(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    c0777M5189.m1673();
                    c5363.m8957(-709912974);
                    c5363.m9009(false);
                    i7 = i6;
                    c3051M5195 = AbstractC2774.m5195(c0777M5189, fValueOf, fValueOf2, c0969M4819, c1280, c5363, 196608);
                    c0969M4817 = AbstractC2552.m4817(5, c5363);
                    c0969M4818 = AbstractC2552.m4817(6, c5363);
                    EnumC4851 enumC48510 = (EnumC4851) c0777M5189.m1671();
                    c5363.m8957(-1093194547);
                    iOrdinal2 = enumC48510.ordinal();
                    if (iOrdinal2 == 0) {
                        f3 = 1.0f;
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                C1078.m2275();
                                return;
                            }
                        } else if (z6) {
                            f3 = 1.0f;
                        }
                        f3 = 0.0f;
                    }
                    c5363.m9009(false);
                    Float fValueOf3 = Float.valueOf(f3);
                    EnumC4851 enumC48511 = (EnumC4851) c4852.getValue();
                    c5363.m8957(-1093194547);
                    iOrdinal3 = enumC48511.ordinal();
                    if (iOrdinal3 == 0) {
                        f4 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                C1078.m2275();
                                return;
                            }
                        } else if (z6) {
                            f4 = 1.0f;
                        }
                        f4 = 0.0f;
                    }
                    c5363.m9009(false);
                    Float fValueOf4 = Float.valueOf(f4);
                    c2451M1673 = c0777M5189.m1673();
                    c5363.m8957(-984009111);
                    if (c2451M1673.m4575(enumC4857, enumC4856) || (!c2451M1673.m4575(enumC4856, enumC4857) && !c2451M1673.m4575(enumC4855, enumC4856))) {
                        c0969M4818 = c0969M4817;
                    }
                    c5363.m9009(false);
                    c3051M5196 = AbstractC2774.m5195(c0777M5189, fValueOf3, fValueOf4, c0969M4818, c1280, c5363, 196608);
                    EnumC4851 enumC48512 = (EnumC4851) c0777M5189.m1671();
                    c5363.m8957(-1258455321);
                    iOrdinal4 = enumC48512.ordinal();
                    if (iOrdinal4 == 0) {
                        f5 = 1.0f;
                    } else {
                        if (iOrdinal4 != 1) {
                            if (iOrdinal4 != 2) {
                                C1078.m2275();
                                return;
                            }
                        } else if (z6) {
                            f5 = 0.0f;
                        }
                        f5 = 1.0f;
                    }
                    c5363.m9009(false);
                    Float fValueOf5 = Float.valueOf(f5);
                    EnumC4851 enumC48513 = (EnumC4851) c4852.getValue();
                    c5363.m8957(-1258455321);
                    iOrdinal5 = enumC48513.ordinal();
                    if (iOrdinal5 == 0) {
                        f6 = 1.0f;
                    } else {
                        if (iOrdinal5 != 1) {
                            if (iOrdinal5 != 2) {
                                C1078.m2275();
                                return;
                            }
                        } else if (!z6) {
                        }
                        f6 = 1.0f;
                    }
                    c5363.m9009(false);
                    Float fValueOf6 = Float.valueOf(f6);
                    c0777M5189.m1673();
                    c5363.m8957(2126293195);
                    c5363.m9009(false);
                    c3051M5197 = AbstractC2774.m5195(c0777M5189, fValueOf5, fValueOf6, c0969M4817, c1280, c5363, 196608);
                    C0969 c0969M48110 = AbstractC2552.m4817(5, c5363);
                    enumC4852 = (EnumC4851) c4852.getValue();
                    c5363.m8957(-12973394);
                    iArr = AbstractC5579.f18407;
                    if (iArr[enumC4852.ordinal()] == 1) {
                        j2 = j8;
                    } else {
                        j2 = j9;
                    }
                    c5363.m9009(false);
                    abstractC3292M2824 = C1327.m2824(j2);
                    zM8963 = c5363.m8963(abstractC3292M2824);
                    objM8999 = c5363.m8999();
                    c4036 = C2850.f9517;
                    if (zM8963 || objM8999 == c4036) {
                        C1280 c1281 = new C1280(C1931.f6364, new C2932(8, abstractC3292M2824));
                        c5363.m8987(c1281);
                        objM8999 = c1281;
                    }
                    C1280 c1282 = (C1280) objM8999;
                    enumC4853 = (EnumC4851) c0777M5189.m1671();
                    c5363.m8957(-12973394);
                    if (iArr[enumC4853.ordinal()] == 1) {
                        j3 = j8;
                    } else {
                        j3 = j9;
                    }
                    c5363.m9009(false);
                    C1327 c1327 = new C1327(j3);
                    enumC4854 = (EnumC4851) c4852.getValue();
                    c5363.m8957(-12973394);
                    if (iArr[enumC4854.ordinal()] == 1) {
                        j4 = j8;
                    } else {
                        j4 = j9;
                    }
                    c5363.m9009(false);
                    C1327 c1328 = new C1327(j4);
                    c0777M5189.m1673();
                    c5363.m8957(1954111929);
                    c5363.m9009(false);
                    i8 = 8;
                    c3051M5198 = AbstractC2774.m5195(c0777M5189, c1327, c1328, c0969M48110, c1282, c5363, 196608);
                    c5363.m8957(-464752477);
                    c5363.m9009(false);
                    abstractC3292M2825 = C1327.m2824(j6);
                    zM8964 = c5363.m8963(abstractC3292M2825);
                    objM89910 = c5363.m8999();
                    if (zM8964 || objM89910 == c4036) {
                        C1280 c1283 = new C1280(C1931.f6364, new C2932(i8, abstractC3292M2825));
                        c5363.m8987(c1283);
                        objM89910 = c1283;
                    }
                    c5363.m8957(-464752477);
                    c5363.m9009(false);
                    C1327 c1329 = new C1327(j6);
                    c5363.m8957(-464752477);
                    c5363.m9009(false);
                    C1327 c13210 = new C1327(j6);
                    c0777M5189.m1673();
                    c5363.m8957(1190923886);
                    c5363.m9009(false);
                    c3051M5199 = AbstractC2774.m5195(c0777M5189, c1329, c13210, c0969M48110, (C1280) objM89910, c5363, 196608);
                    objM89911 = c5363.m8999();
                    if (objM89911 == c4036) {
                        objM89911 = new C1873();
                        c5363.m8987(objM89911);
                    }
                    c1873 = (C1873) objM89911;
                    if (interfaceC2609 == null) {
                        c5363.m8957(-1891724857);
                        c5363.m9009(false);
                        c0857M7034 = null;
                    } else {
                        c5363.m8957(-1891724856);
                        c0857M7034 = AbstractC3925.m7034(-1076580032, new C1743(c3564, c3565, c3051M5195, c3051M5199, z5, c3051M5198, interfaceC2609, c1873), c5363);
                        c5363.m9009(false);
                    }
                    objM89912 = c5363.m8999();
                    if (objM89912 == c4036) {
                        C1298 c1298 = C1298.f4439;
                        C4232 c4232 = new C4232(c3051M5196, 2);
                        C5460 c5460 = AbstractC3004.f10103;
                        C5704 c5704 = new C5704(c4232, c1298);
                        c5363.m8987(c5704);
                        objM89912 = c5704;
                    }
                    c5363.m8957(-1890217110);
                    c5363.m9009(false);
                    objM89913 = c5363.m8999();
                    i9 = 3;
                    if (objM89913 == c4036) {
                        C1298 c1299 = C1298.f4439;
                        C4232 c4233 = new C4232(c3051M5197, i9);
                        C5460 c5461 = AbstractC3004.f10103;
                        C5704 c5705 = new C5704(c4233, c1299);
                        c5363.m8987(c5705);
                        objM89913 = c5705;
                    }
                    c5363.m8957(-1889500886);
                    c5363.m9009(false);
                    c5363.m8957(-1888924534);
                    c5363.m9009(false);
                    c5363.m8957(-1888749663);
                    c5363.m9009(false);
                    if (!z2) {
                        j5 = c2154.f7111;
                    } else if (zBooleanValue) {
                        j5 = c2154.f7084;
                    } else {
                        j5 = c2154.f7105;
                    }
                    if (interfaceC5732 == null) {
                        c5363.m8957(-1888469888);
                        z3 = false;
                        c5363.m9009(false);
                        c0858 = null;
                    } else {
                        z3 = false;
                        c5363.m8957(-1888469887);
                        C0857 c0857M7035 = AbstractC3925.m7034(1334518521, new C5446(j5, interfaceC5732), c5363);
                        c5363.m9009(false);
                        c0858 = c0857M7035;
                    }
                    c5363.m8957(-1888176380);
                    c5363.m9009(z3);
                    iM6632 = AbstractC3761.m6632(2);
                    if (iM6632 != 0) {
                        c5363.m8957(-1887830698);
                        AbstractC2133.m4136(interfaceC5731, c0857M7034, null, null, c0858, null, null, z, c3176, new C4444(new C2589(0, 4, InterfaceC5372.class, c3051M5195, "value", "getValue()Ljava/lang/Object;")), AbstractC3925.m7034(-1729858187, new C5543(i9, c0857), c5363), null, interfaceC1291, c5362, ((i7 >> 3) & 112) | 6 | ((i10 << 21) & 234881024) | ((i7 << 18) & 1879048192), ((i10 >> 6) & 7168) | 48);
                        c5363 = c5362;
                        c5363.m9009(false);
                    } else {
                        if (iM6632 == 1) {
                            c5363.m8957(493292232);
                            c5363.m9009(z3);
                            C1078.m2275();
                            return;
                        }
                        c5363.m8957(-1886778186);
                        objM89914 = c5363.m8999();
                        if (objM89914 == c4036) {
                            objM89914 = AbstractC2774.m5183(new C3291(0L));
                            c5363.m8987(objM89914);
                        }
                        interfaceC4367 = (InterfaceC4367) objM89914;
                        C0857 c0857M7036 = AbstractC3925.m7034(528115858, new C1346(interfaceC4367, c3176, interfaceC1291, c0857), c5363);
                        C0857 c0859 = c0857M7034;
                        C4444 c4444 = new C4444(new C2589(0, 5, InterfaceC5372.class, c3051M5195, "value", "getValue()Ljava/lang/Object;"));
                        if ((i7 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zM8965 = c5363.m8963(c3051M5195) | z4;
                        objM89915 = c5363.m8999();
                        if (zM8965 || objM89915 == c4036) {
                            objM89915 = new C1708(c3176, c3051M5195, interfaceC4367, 7);
                            c5363.m8987(objM89915);
                        }
                        c5363 = c5363;
                        AbstractC1631.m3434(interfaceC5731, null, c0859, null, c0858, null, null, z, c3176, c4444, (InterfaceC4745) objM89915, c0857M7036, null, interfaceC1291, c5363, ((i7 >> 3) & 112) | 6 | ((i10 << 21) & 234881024) | ((i7 << 18) & 1879048192), ((i10 >> 3) & 57344) | 384);
                        c5363.m9009(false);
                    }
                } else if (iOrdinal6 != 2) {
                    C1078.m2275();
                    return;
                }
            } else {
                c4852 = c4853;
            }
            f = 1.0f;
            c5363.m9009(false);
            Float fValueOf7 = Float.valueOf(f);
            EnumC4851 enumC48514 = (EnumC4851) c4852.getValue();
            c5363.m8957(-1436405362);
            iOrdinal = enumC48514.ordinal();
            if (iOrdinal == 0) {
                f2 = 1.0f;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C1078.m2275();
                        return;
                    }
                } else if (z6) {
                    f2 = 0.0f;
                }
                f2 = 1.0f;
            }
            c5363.m9009(false);
            Float fValueOf8 = Float.valueOf(f2);
            c0777M5189.m1673();
            c5363.m8957(-709912974);
            c5363.m9009(false);
            i7 = i6;
            c3051M5195 = AbstractC2774.m5195(c0777M5189, fValueOf7, fValueOf8, c0969M4819, c1280, c5363, 196608);
            c0969M4817 = AbstractC2552.m4817(5, c5363);
            c0969M4818 = AbstractC2552.m4817(6, c5363);
            EnumC4851 enumC48515 = (EnumC4851) c0777M5189.m1671();
            c5363.m8957(-1093194547);
            iOrdinal2 = enumC48515.ordinal();
            if (iOrdinal2 == 0) {
                f3 = 1.0f;
            } else {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        C1078.m2275();
                        return;
                    }
                } else if (z6) {
                    f3 = 1.0f;
                }
                f3 = 0.0f;
            }
            c5363.m9009(false);
            Float fValueOf9 = Float.valueOf(f3);
            EnumC4851 enumC48516 = (EnumC4851) c4852.getValue();
            c5363.m8957(-1093194547);
            iOrdinal3 = enumC48516.ordinal();
            if (iOrdinal3 == 0) {
                f4 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        C1078.m2275();
                        return;
                    }
                } else if (z6) {
                    f4 = 1.0f;
                }
                f4 = 0.0f;
            }
            c5363.m9009(false);
            Float fValueOf10 = Float.valueOf(f4);
            c2451M1673 = c0777M5189.m1673();
            c5363.m8957(-984009111);
            if (c2451M1673.m4575(enumC4857, enumC4856)) {
                c0969M4818 = c0969M4817;
            } else {
                c0969M4818 = c0969M4817;
            }
            c5363.m9009(false);
            c3051M5196 = AbstractC2774.m5195(c0777M5189, fValueOf9, fValueOf10, c0969M4818, c1280, c5363, 196608);
            EnumC4851 enumC48517 = (EnumC4851) c0777M5189.m1671();
            c5363.m8957(-1258455321);
            iOrdinal4 = enumC48517.ordinal();
            if (iOrdinal4 == 0) {
                f5 = 1.0f;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        C1078.m2275();
                        return;
                    }
                } else if (z6) {
                    f5 = 0.0f;
                }
                f5 = 1.0f;
            }
            c5363.m9009(false);
            Float fValueOf11 = Float.valueOf(f5);
            EnumC4851 enumC48518 = (EnumC4851) c4852.getValue();
            c5363.m8957(-1258455321);
            iOrdinal5 = enumC48518.ordinal();
            if (iOrdinal5 == 0) {
                f6 = 1.0f;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        C1078.m2275();
                        return;
                    }
                } else if (!z6) {
                }
                f6 = 1.0f;
            }
            c5363.m9009(false);
            Float fValueOf12 = Float.valueOf(f6);
            c0777M5189.m1673();
            c5363.m8957(2126293195);
            c5363.m9009(false);
            c3051M5197 = AbstractC2774.m5195(c0777M5189, fValueOf11, fValueOf12, c0969M4817, c1280, c5363, 196608);
            C0969 c0969M48111 = AbstractC2552.m4817(5, c5363);
            enumC4852 = (EnumC4851) c4852.getValue();
            c5363.m8957(-12973394);
            iArr = AbstractC5579.f18407;
            if (iArr[enumC4852.ordinal()] == 1) {
                j2 = j8;
            } else {
                j2 = j9;
            }
            c5363.m9009(false);
            abstractC3292M2824 = C1327.m2824(j2);
            zM8963 = c5363.m8963(abstractC3292M2824);
            objM8999 = c5363.m8999();
            c4036 = C2850.f9517;
            if (zM8963) {
                C1280 c1284 = new C1280(C1931.f6364, new C2932(8, abstractC3292M2824));
                c5363.m8987(c1284);
                objM8999 = c1284;
            } else {
                C1280 c1285 = new C1280(C1931.f6364, new C2932(8, abstractC3292M2824));
                c5363.m8987(c1285);
                objM8999 = c1285;
            }
            C1280 c1286 = (C1280) objM8999;
            enumC4853 = (EnumC4851) c0777M5189.m1671();
            c5363.m8957(-12973394);
            if (iArr[enumC4853.ordinal()] == 1) {
                j3 = j8;
            } else {
                j3 = j9;
            }
            c5363.m9009(false);
            C1327 c13211 = new C1327(j3);
            enumC4854 = (EnumC4851) c4852.getValue();
            c5363.m8957(-12973394);
            if (iArr[enumC4854.ordinal()] == 1) {
                j4 = j8;
            } else {
                j4 = j9;
            }
            c5363.m9009(false);
            C1327 c13212 = new C1327(j4);
            c0777M5189.m1673();
            c5363.m8957(1954111929);
            c5363.m9009(false);
            i8 = 8;
            c3051M5198 = AbstractC2774.m5195(c0777M5189, c13211, c13212, c0969M48111, c1286, c5363, 196608);
            c5363.m8957(-464752477);
            c5363.m9009(false);
            abstractC3292M2825 = C1327.m2824(j6);
            zM8964 = c5363.m8963(abstractC3292M2825);
            objM89910 = c5363.m8999();
            if (zM8964) {
                C1280 c1287 = new C1280(C1931.f6364, new C2932(i8, abstractC3292M2825));
                c5363.m8987(c1287);
                objM89910 = c1287;
            } else {
                C1280 c1288 = new C1280(C1931.f6364, new C2932(i8, abstractC3292M2825));
                c5363.m8987(c1288);
                objM89910 = c1288;
            }
            c5363.m8957(-464752477);
            c5363.m9009(false);
            C1327 c13213 = new C1327(j6);
            c5363.m8957(-464752477);
            c5363.m9009(false);
            C1327 c13214 = new C1327(j6);
            c0777M5189.m1673();
            c5363.m8957(1190923886);
            c5363.m9009(false);
            c3051M5199 = AbstractC2774.m5195(c0777M5189, c13213, c13214, c0969M48111, (C1280) objM89910, c5363, 196608);
            objM89911 = c5363.m8999();
            if (objM89911 == c4036) {
                objM89911 = new C1873();
                c5363.m8987(objM89911);
            }
            c1873 = (C1873) objM89911;
            if (interfaceC2609 == null) {
                c5363.m8957(-1891724857);
                c5363.m9009(false);
                c0857M7034 = null;
            } else {
                c5363.m8957(-1891724856);
                c0857M7034 = AbstractC3925.m7034(-1076580032, new C1743(c3564, c3565, c3051M5195, c3051M5199, z5, c3051M5198, interfaceC2609, c1873), c5363);
                c5363.m9009(false);
            }
            objM89912 = c5363.m8999();
            if (objM89912 == c4036) {
                C1298 c12910 = C1298.f4439;
                C4232 c4234 = new C4232(c3051M5196, 2);
                C5460 c5462 = AbstractC3004.f10103;
                C5704 c5706 = new C5704(c4234, c12910);
                c5363.m8987(c5706);
                objM89912 = c5706;
            }
            c5363.m8957(-1890217110);
            c5363.m9009(false);
            objM89913 = c5363.m8999();
            i9 = 3;
            if (objM89913 == c4036) {
                C1298 c12911 = C1298.f4439;
                C4232 c4235 = new C4232(c3051M5197, i9);
                C5460 c5463 = AbstractC3004.f10103;
                C5704 c5707 = new C5704(c4235, c12911);
                c5363.m8987(c5707);
                objM89913 = c5707;
            }
            c5363.m8957(-1889500886);
            c5363.m9009(false);
            c5363.m8957(-1888924534);
            c5363.m9009(false);
            c5363.m8957(-1888749663);
            c5363.m9009(false);
            if (!z2) {
                j5 = c2154.f7111;
            } else if (zBooleanValue) {
                j5 = c2154.f7084;
            } else {
                j5 = c2154.f7105;
            }
            if (interfaceC5732 == null) {
                c5363.m8957(-1888469888);
                z3 = false;
                c5363.m9009(false);
                c0858 = null;
            } else {
                z3 = false;
                c5363.m8957(-1888469887);
                C0857 c0857M7037 = AbstractC3925.m7034(1334518521, new C5446(j5, interfaceC5732), c5363);
                c5363.m9009(false);
                c0858 = c0857M7037;
            }
            c5363.m8957(-1888176380);
            c5363.m9009(z3);
            iM6632 = AbstractC3761.m6632(2);
            if (iM6632 != 0) {
                c5363.m8957(-1887830698);
                AbstractC2133.m4136(interfaceC5731, c0857M7034, null, null, c0858, null, null, z, c3176, new C4444(new C2589(0, 4, InterfaceC5372.class, c3051M5195, "value", "getValue()Ljava/lang/Object;")), AbstractC3925.m7034(-1729858187, new C5543(i9, c0857), c5363), null, interfaceC1291, c5362, ((i7 >> 3) & 112) | 6 | ((i10 << 21) & 234881024) | ((i7 << 18) & 1879048192), ((i10 >> 6) & 7168) | 48);
                c5363 = c5362;
                c5363.m9009(false);
            } else {
                if (iM6632 == 1) {
                    c5363.m8957(493292232);
                    c5363.m9009(z3);
                    C1078.m2275();
                    return;
                }
                c5363.m8957(-1886778186);
                objM89914 = c5363.m8999();
                if (objM89914 == c4036) {
                    objM89914 = AbstractC2774.m5183(new C3291(0L));
                    c5363.m8987(objM89914);
                }
                interfaceC4367 = (InterfaceC4367) objM89914;
                C0857 c0857M7038 = AbstractC3925.m7034(528115858, new C1346(interfaceC4367, c3176, interfaceC1291, c0857), c5363);
                C0857 c08510 = c0857M7034;
                C4444 c4445 = new C4444(new C2589(0, 5, InterfaceC5372.class, c3051M5195, "value", "getValue()Ljava/lang/Object;"));
                if ((i7 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM8965 = c5363.m8963(c3051M5195) | z4;
                objM89915 = c5363.m8999();
                if (zM8965) {
                    objM89915 = new C1708(c3176, c3051M5195, interfaceC4367, 7);
                    c5363.m8987(objM89915);
                } else {
                    objM89915 = new C1708(c3176, c3051M5195, interfaceC4367, 7);
                    c5363.m8987(objM89915);
                }
                c5363 = c5363;
                AbstractC1631.m3434(interfaceC5731, null, c08510, null, c0858, null, null, z, c3176, c4445, (InterfaceC4745) objM89915, c0857M7038, null, interfaceC1291, c5363, ((i7 >> 3) & 112) | 6 | ((i10 << 21) & 234881024) | ((i7 << 18) & 1879048192), ((i10 >> 3) & 57344) | 384);
                c5363.m9009(false);
            }
        } else {
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥ٘ؓۗؖ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(i | 1);
                    int iM6836 = AbstractC3831.m6835(i2);
                    AbstractC0487.m1057(charSequence, interfaceC5731, c3176, interfaceC2609, interfaceC5732, z, z2, c2243, interfaceC1291, c2154, c0857, (C5362) obj, iM6835, iM6836);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۘ */
    public static final boolean m1058(Throwable th, InterfaceC4448 interfaceC4448) {
        List listAsList;
        Object objInvoke;
        Integer num = AbstractC1505.f5112;
        C0516 c0516 = null;
        if (num == null || num.intValue() >= 19) {
            listAsList = Arrays.asList(th.getSuppressed());
        } else {
            Method method = AbstractC0961.f3404;
            listAsList = (method == null || (objInvoke = method.invoke(th, null)) == null) ? C2340.f7777 : Arrays.asList((Throwable[]) objInvoke);
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof C0516) {
                return false;
            }
        }
        try {
            C4335 c4335 = (C4335) interfaceC4448.mo449();
            if (c4335 != null) {
                boolean z2 = c4335.f14311;
                List list = c4335.f14312;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1470) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                c0516 = new C0516(c4335);
            }
        } catch (Throwable th2) {
            c0516 = th2;
        }
        if (c0516 != null) {
            AbstractC5537.m9223(th, c0516);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static float m1059(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final boolean m1060(C3410 c3410) {
        return !c3410.f11350 && c3410.f11352;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C2754[] m1061(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C2754[0];
        }
        C2754[] c2754Arr = new C2754[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM4801 = (int) AbstractC2552.m4801(byteArrayInputStream, 2);
            int iM4802 = (int) AbstractC2552.m4801(byteArrayInputStream, 2);
            c2754Arr[i3] = new C2754(str, new String(AbstractC2552.m4795(byteArrayInputStream, iM4801), StandardCharsets.UTF_8), AbstractC2552.m4801(byteArrayInputStream, 4), iM4802, (int) AbstractC2552.m4801(byteArrayInputStream, 4), (int) AbstractC2552.m4801(byteArrayInputStream, 4), new int[iM4802], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            C2754 c2754 = c2754Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c2754.f9113;
            int i6 = c2754.f9119;
            TreeMap treeMap = c2754.f9118;
            int i7 = iAvailable - i5;
            int iM4803 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM4803 += (int) AbstractC2552.m4801(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM4803), 1);
                int iM4804 = (int) AbstractC2552.m4801(byteArrayInputStream, 2);
                while (iM4804 > 0) {
                    AbstractC2552.m4801(byteArrayInputStream, 2);
                    int iM4805 = (int) AbstractC2552.m4801(byteArrayInputStream, 1);
                    if (iM4805 != 6 && iM4805 != 7) {
                        while (iM4805 > 0) {
                            AbstractC2552.m4801(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM4806 = (int) AbstractC2552.m4801(byteArrayInputStream, 1); iM4806 > 0; iM4806--) {
                                AbstractC2552.m4801(byteArrayInputStream, 2);
                            }
                            iM4805--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM4804--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                C1078.m2276("Read too much data during profile line parse");
                return null;
            }
            c2754.f9115 = m1051(byteArrayInputStream, c2754.f9112);
            BitSet bitSetValueOf = BitSet.valueOf(AbstractC2552.m4795(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return c2754Arr;
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static void m1062(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC5604.m9454(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            AbstractC5604.m9454(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            m1096(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            m1096(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m1096(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        m1096(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: ۥۢ */
    public static void m1063(ByteArrayOutputStream byteArrayOutputStream, C2754 c2754) throws IOException {
        m1086(byteArrayOutputStream, c2754);
        int i = c2754.f9119;
        int[] iArr = c2754.f9115;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            AbstractC2552.m4792(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c2754.f9118.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m1064(InterfaceC4396 interfaceC4396, C0857 c0857, C4153 c4153, C0857 c0858, C5362 c5362, int i) {
        InterfaceC4396 interfaceC4397;
        int i2;
        InterfaceC4367 interfaceC4367;
        boolean z;
        c5362.m8979(-1221877520);
        if ((i & 6) == 0) {
            interfaceC4397 = interfaceC4396;
            i2 = (c5362.m8963(interfaceC4397) ? 4 : 2) | i;
        } else {
            interfaceC4397 = interfaceC4396;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(c0857) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? c5362.m8963(c4153) : c5362.m8977(c4153) ? 256 : 128;
        }
        int i3 = i & 3072;
        C4217 c4217 = C4217.f13994;
        if (i3 == 0) {
            i2 |= c5362.m8963(c4217) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c5362.m8977(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= c5362.m9006(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c5362.m9006(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c5362.m9006(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c5362.m8977(c0858) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if (c5362.m9011(i4 & 1, (38347923 & i4) != 38347922)) {
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            if (objM8999 == obj) {
                objM8999 = AbstractC3925.m7061(c5362);
                c5362.m8987(objM8999);
            }
            InterfaceC4643 interfaceC4643 = (InterfaceC4643) objM8999;
            Object objM89910 = c5362.m8999();
            if (objM89910 == obj) {
                objM89910 = AbstractC2774.m5183(Boolean.FALSE);
                c5362.m8987(objM89910);
            }
            InterfaceC4367 interfaceC4368 = (InterfaceC4367) objM89910;
            InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, false);
            int iM1958 = AbstractC0949.m1958(c5362);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, c4217);
            InterfaceC4576.f15106.getClass();
            InterfaceC4448 interfaceC4448 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(interfaceC4448);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228M2297);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            C3136 c3136 = C0849.f3053;
            if (c5362.f17668 || !AbstractC3831.m6874(c5362.m8999(), Integer.valueOf(iM1958))) {
                AbstractC3761.m6618(iM1958, c5362, iM1958, c3136);
            }
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            if (c4153.m7347()) {
                c5362.m8957(-1891243071);
                interfaceC4367 = interfaceC4368;
                m1044(interfaceC4397, c4153, interfaceC4643, false, interfaceC4367, c0857, c5362, (i4 & 14) | 196608 | ((i4 >> 3) & 112) | ((i4 >> 6) & 896) | ((i4 << 15) & 3670016));
                z = false;
                c5362.m9009(false);
            } else {
                interfaceC4367 = interfaceC4368;
                z = false;
                c5362.m8957(-1890863476);
                c5362.m9009(false);
            }
            m1046(c4153, interfaceC4367, c0858, c5362, ((i4 >> 18) & 14) | 384 | ((i4 >> 3) & 112) | ((i4 >> 12) & 7168) | (57344 & (i4 << 3)) | ((i4 >> 9) & 458752));
            c5362.m9009(true);
            boolean z2 = ((i4 & 896) == 256 || ((i4 & 512) != 0 && c5362.m8977(c4153))) ? true : z;
            Object objM89911 = c5362.m8999();
            if (z2 || objM89911 == obj) {
                objM89911 = new C0091(5, c4153);
                c5362.m8987(objM89911);
            }
            AbstractC3925.m7028(c4153, (InterfaceC4745) objM89911, c5362);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0089(interfaceC4396, c0857, c4153, c0858, i);
        }
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static C2754[] m1065(ByteArrayInputStream byteArrayInputStream, int i, C2754[] c2754Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C2754[0];
        }
        if (i != c2754Arr.length) {
            C1078.m2276("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM4801 = (int) AbstractC2552.m4801(byteArrayInputStream, 2);
            iArr[i2] = (int) AbstractC2552.m4801(byteArrayInputStream, 2);
            strArr[i2] = new String(AbstractC2552.m4795(byteArrayInputStream, iM4801), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C2754 c2754 = c2754Arr[i3];
            if (!c2754.f9114.equals(strArr[i3])) {
                C1078.m2276("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            c2754.f9112 = i4;
            c2754.f9115 = m1051(byteArrayInputStream, i4);
        }
        return c2754Arr;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static final Object m1066(C5555 c5555, boolean z, Object obj, InterfaceC5731 interfaceC5731) throws Throwable {
        Object c5036;
        Object objM853;
        try {
            if (interfaceC5731 instanceof AbstractC2870) {
                AbstractC3801.m6782(2, interfaceC5731);
                c5036 = interfaceC5731.mo219(obj, c5555);
            } else {
                InterfaceC3534 interfaceC3534Mo334 = c5555.mo334();
                Object c2967 = interfaceC3534Mo334 == C4794.f15814 ? new C2967(c5555) : new C1315(c5555, interfaceC3534Mo334);
                AbstractC3801.m6782(2, interfaceC5731);
                c5036 = interfaceC5731.mo219(obj, c2967);
            }
        } catch (C0768 e) {
            Throwable th = e.f2784;
            c5555.m854(new C5036(th, false));
            throw th;
        } catch (Throwable th2) {
            c5036 = new C5036(th2, false);
        }
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (c5036 == enumC2282 || (objM853 = c5555.m853(c5036)) == AbstractC5378.f17763) {
            return enumC2282;
        }
        c5555.mo8912();
        if (!(objM853 instanceof C5036)) {
            return AbstractC5378.m9033(objM853);
        }
        if (!z) {
            Throwable th3 = ((C5036) objM853).f16702;
            if ((th3 instanceof C4862) && ((C4862) th3).f15991 == c5555) {
                if (c5036 instanceof C5036) {
                    throw ((C5036) c5036).f16702;
                }
                return c5036;
            }
        }
        throw ((C5036) objM853).f16702;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static C0287 m1067(InterfaceC4745 interfaceC4745) {
        C0287 c0287 = new C0287();
        interfaceC4745.mo211(c0287);
        return c0287;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static final C0522 m1068(InterfaceC1827 interfaceC1827) {
        Object objMo570 = interfaceC1827.mo570();
        if (objMo570 instanceof C0522) {
            return (C0522) objMo570;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۨ */
    public static final float m1069(C5362 c5362) {
        float f = ((C4497) c5362.m8997(AbstractC4331.f14304)).f14871;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        float f2 = (f - 24.0f) / 2.0f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    /* JADX INFO: renamed from: ۦ */
    public static void m1070(ByteArrayOutputStream byteArrayOutputStream, C2754 c2754, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC2552.m4792(byteArrayOutputStream, str.getBytes(charset).length);
        AbstractC2552.m4792(byteArrayOutputStream, c2754.f9112);
        AbstractC2552.m4820(byteArrayOutputStream, c2754.f9113, 4);
        AbstractC2552.m4820(byteArrayOutputStream, c2754.f9111, 4);
        AbstractC2552.m4820(byteArrayOutputStream, c2754.f9119, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m1071(long j, InterfaceC5731 interfaceC5731, C5362 c5362, int i) {
        c5362.m8979(590397809);
        int i2 = (c5362.m8961(j) ? 4 : 2) | i | (c5362.m8977(interfaceC5731) ? 32 : 16);
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            C4773.m8137(AbstractC0194.f721.mo4313(new C1327(j)), interfaceC5731, c5362, (i2 & 112) | 8);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C2894(j, interfaceC5731, i);
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static C2754[] m1072(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C2754[] c2754Arr) throws IOException {
        C2754 c2754;
        if (byteArrayInputStream.available() == 0) {
            return new C2754[0];
        }
        if (i != c2754Arr.length) {
            C1078.m2276("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC2552.m4801(byteArrayInputStream, 2);
            String str = new String(AbstractC2552.m4795(byteArrayInputStream, (int) AbstractC2552.m4801(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM4801 = AbstractC2552.m4801(byteArrayInputStream, 4);
            int iM4801 = (int) AbstractC2552.m4801(byteArrayInputStream, 2);
            if (c2754Arr.length <= 0) {
                c2754 = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= c2754Arr.length) {
                    c2754 = null;
                    break;
                }
                if (c2754Arr[i3].f9114.equals(strSubstring)) {
                    c2754 = c2754Arr[i3];
                    break;
                }
                i3++;
            }
            if (c2754 == null) {
                C1078.m2276("Missing profile key: ".concat(str));
                return null;
            }
            c2754.f9117 = jM4801;
            int[] iArrM1051 = m1051(byteArrayInputStream, iM4801);
            if (Arrays.equals(bArr, AbstractC2133.f7003)) {
                c2754.f9112 = iM4801;
                c2754.f9115 = iArrM1051;
            }
        }
        return c2754Arr;
    }

    /* JADX INFO: renamed from: ۦؔ */
    public static final long m1073() {
        PackageInfo packageInfoM1036 = m1036(new C4441(new long[]{-7747194158318775008L, 8716603624864608469L, -2322859658248283877L, 6638634482829527824L}).toString());
        if (packageInfoM1036 != null) {
            return Build.VERSION.SDK_INT >= 28 ? packageInfoM1036.getLongVersionCode() : packageInfoM1036.versionCode;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final float m1074(C5362 c5362) {
        long j = ((C4413) c5362.m8997(AbstractC4957.f16399)).f14543.f11802.f1731;
        long j2 = AbstractC0580.f2135;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((InterfaceC2880) c5362.m8997(AbstractC2853.f9544)).mo751(j) / 2.0f;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final Object m1075(WorkDatabase workDatabase, boolean z, boolean z2, InterfaceC4745 interfaceC4745) {
        workDatabase.m93();
        InterfaceC0443 interfaceC0443 = null;
        if (workDatabase.m97() && !workDatabase.m100() && workDatabase.f253.get() != null) {
            C1078.m2276("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            return null;
        }
        C3614 c3614 = new C3614(null, interfaceC4745, workDatabase, z, z2);
        Thread.interrupted();
        return AbstractC5537.m9243(C4794.f15814, new C5558(c3614, interfaceC0443, 4));
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final void m1076(int i, int i2) {
        if (i < 0 || i >= i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static void m1077(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦُ */
    public static final Object m1078(WorkDatabase workDatabase, boolean z, C3875 c3875, AbstractC0772 abstractC0772) {
        C4813 c4813;
        if (abstractC0772 instanceof C4813) {
            c4813 = (C4813) abstractC0772;
            int i = c4813.f15875;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4813.f15875 = i - Integer.MIN_VALUE;
            } else {
                c4813 = new C4813(abstractC0772);
            }
        } else {
            c4813 = new C4813(abstractC0772);
        }
        Object objM1038 = c4813.f15874;
        int i2 = c4813.f15875;
        Object obj = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(objM1038);
            if (workDatabase.m97() && workDatabase.m96() && workDatabase.m100()) {
                C2113 c2113 = new C2113(null, c3875, workDatabase, z);
                c4813.f15875 = 1;
                Object objM84 = workDatabase.m84(z, c2113, c4813);
                if (objM84 != obj) {
                    return objM84;
                }
            } else {
                c4813.f15872 = workDatabase;
                c4813.f15871 = c3875;
                c4813.f15873 = z;
                c4813.f15875 = 2;
                objM1038 = m1038(workDatabase, c4813);
                if (objM1038 != obj) {
                }
            }
        }
        if (i2 == 1) {
            AbstractC0186.m409(objM1038);
            return objM1038;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                AbstractC0186.m409(objM1038);
                return objM1038;
            }
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = c4813.f15873;
        c3875 = c4813.f15871;
        workDatabase = c4813.f15872;
        AbstractC0186.m409(objM1038);
        C3746 c3746 = new C3746(null, c3875, workDatabase, z);
        c4813.f15872 = null;
        c4813.f15871 = null;
        c4813.f15875 = 3;
        Object objM5144 = AbstractC2765.m5144((InterfaceC3534) objM1038, c3746, c4813);
        return objM5144 == obj ? obj : objM5144;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m1079(String str, boolean z) {
        if (z) {
            return;
        }
        C1078.m2272(str);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static String m1080(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC2133.f7004;
        byte[] bArr3 = AbstractC2133.f7003;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC3761.m6621(new StringBuilder(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static final PackageInfo m1081(Context context, String str) {
        Object c4535;
        try {
            PackageManager packageManager = context.getPackageManager();
            c4535 = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str, 0);
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        if (c4535 instanceof C4535) {
            c4535 = null;
        }
        return (PackageInfo) c4535;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static void m1082(String str, boolean z) {
        if (z) {
            return;
        }
        C1078.m2276(str);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static boolean m1083(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final boolean m1084(C3410 c3410) {
        return c3410.f11350 && !c3410.f11352;
    }

    /* JADX INFO: renamed from: ۦٝ */
    public static void m1085(ByteArrayOutputStream byteArrayOutputStream, int i, C2754 c2754) throws IOException {
        int i2 = c2754.f9119;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c2754.f9118.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ۦٞ */
    public static void m1086(ByteArrayOutputStream byteArrayOutputStream, C2754 c2754) throws IOException {
        int i = 0;
        for (Map.Entry entry : c2754.f9118.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC2552.m4792(byteArrayOutputStream, iIntValue - i);
                AbstractC2552.m4792(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٟ */
    public static void m1087(int i, int i2, int i3) {
        String strM1037;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM1037 = m1037(i, i3, "start index");
            } else {
                strM1037 = (i2 < 0 || i2 > i3) ? m1037(i2, i3, "end index") : C5063.m8611("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM1037);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static void m1088(boolean z) {
        if (z) {
            return;
        }
        C0178.m393();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final void m1089(C1039 c1039, C3410 c3410, EnumC1616 enumC1616, C1040 c1040, C0322 c0322, long j) {
        float fIntBitsToFloat;
        C2730 c2730 = (C2730) c0322.f1178;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c3410.f11346 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c3410.f11346 & 4294967295L));
        if (m1060(c3410)) {
            c0322.f1179 = 0;
            c2730.m5080();
        }
        if (!m1084(c3410) && !m1060(c3410)) {
            if (c2730.f9040 == 3) {
                int i = c0322.f1179;
                c0322.f1179 = i + 1;
                c2730.m5087(i, c3410);
            } else {
                c2730.m5079(c3410);
            }
            if (c0322.f1179 == 3) {
                c0322.f1179 = 0;
            }
            Object[] objArr = c2730.f9041;
            int i2 = c2730.f9040;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((C3410) objArr[i3]).f11346 >> 32));
            }
            int i4 = c2730.f9040;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = c2730.f9041;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((C3410) objArr2[i5]).f11346 & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / c2730.f9040;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (enumC1616 != null) {
            int i6 = c1040.f3674;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = enumC1616 == EnumC1616.f5424 ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((C2394) c1039.f3672).m4514(c3410.f11349, C1553.m3304(jFloatToRawIntBits, j));
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static void m1090(String str) {
        if (TextUtils.isEmpty(str)) {
            C1078.m2272("Given String is empty or null");
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static StaticLayout m1091(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            AbstractC3767.m6644("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            AbstractC3767.m6644("invalid end value");
        }
        if (i3 < 0) {
            AbstractC3767.m6644("invalid maxLines value");
        }
        if (i < 0) {
            AbstractC3767.m6644("invalid width value");
        }
        if (i4 < 0) {
            AbstractC3767.m6644("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            AbstractC2207.m4271(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final long m1092(C3410 c3410, EnumC1616 enumC1616, C1040 c1040, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = c3410.f11354;
        if (enumC1616 != null) {
            int i = c1040.f3674;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (enumC1616 == EnumC1616.f5424) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jM3308 = C1553.m3308(m1095(c3410, enumC1616, c1040), j2);
        if (z || !c3410.f11353) {
            return jM3308;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static void m1093(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        C1078.m2276(str);
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static String m1094(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Characters";
        }
        if (i == 2) {
            return "Words";
        }
        return i == 3 ? "Sentences" : "Invalid";
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static final long m1095(C3410 c3410, EnumC1616 enumC1616, C1040 c1040) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (enumC1616 == null) {
            return c3410.f11346;
        }
        int i = c1040.f3674;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (c3410.f11346 >> 32));
        } else {
            if (i != 2) {
                return c3410.f11346;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (c3410.f11346 & 4294967295L));
        }
        if (enumC1616 == EnumC1616.f5424) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static void m1096(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m1097(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C1078.m2272(str2);
        }
    }

    public int hashCode() {
        switch (this.f1778) {
            case 21:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f1778) {
            case 21:
                return AbstractC5041.m8557(getClass()).m5775();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۦؙ */
    public abstract boolean mo1098(char c);
}
