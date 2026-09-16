package p000;

import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦٍُؔؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3223 implements InterfaceC2218, InterfaceC1133, InterfaceC3814, InterfaceC4132, InterfaceC5641, InterfaceC1411, InterfaceC0711, InterfaceC1351, InterfaceC5241, InterfaceC4895 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static C3223 f10835;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10836;

    public C3223(C4036 c4036) {
        this.f10836 = 13;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static boolean m5933() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static C5700 m5934(String str) {
        C5700 c5700 = new C5700(str);
        C5700.f18763.put(str, c5700);
        return c5700;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static boolean m5935(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC4031.m7224(str.charAt(i + 1)) != -1 && AbstractC4031.m7224(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static ArrayList m5936(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM1521 = AbstractC0684.m1521('&', i, 4, str);
            if (iM1521 == -1) {
                iM1521 = str.length();
            }
            int iM1522 = AbstractC0684.m1521('=', i, 4, str);
            if (iM1522 == -1 || iM1522 > iM1521) {
                arrayList.add(str.substring(i, iM1521));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM1522));
                arrayList.add(str.substring(iM1522 + 1, iM1521));
            }
            i = iM1521 + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static String m5937(int i, int i2, int i3, String str, String str2) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            int i6 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || AbstractC0684.m1528(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !m5935(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                C1270 c1270 = new C1270();
                c1270.m2687(i4, iCharCount, str);
                C1270 c1271 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            c1270.m2677(z ? "+" : "%2B");
                        } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z4) || AbstractC0684.m1528(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !m5935(iCharCount, length, str)))))) {
                            if (c1271 == null) {
                                c1271 = new C1270();
                            }
                            c1271.m2684(iCodePointAt2);
                            while (!c1271.m2693()) {
                                byte b = c1271.readByte();
                                c1270.m2680(37);
                                char[] cArr = C0774.f2794;
                                c1270.m2680(cArr[((b & 255) >> 4) & 15]);
                                c1270.m2680(cArr[b & 15]);
                            }
                        } else {
                            c1270.m2684(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                    i6 = 32;
                }
                return c1270.m2669();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static Typeface m5938(String str, C1626 c1626, int i) {
        if (i == 0 && AbstractC3831.m6874(c1626, C1626.f5439) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM3041 = AbstractC1434.m3041(c1626, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM3041) : Typeface.create(str, iM3041);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static void m5939(List list, StringBuilder sb) {
        C1803 c1803M7940 = AbstractC4554.m7940(AbstractC4554.m7917(0, list.size()), 2);
        int i = c1803M7940.f6006;
        int i2 = c1803M7940.f6005;
        int i3 = c1803M7940.f6004;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static String m5940(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C1270 c1270 = new C1270();
                c1270.m2687(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iM7224 = AbstractC4031.m7224(str.charAt(iCharCount + 1));
                        int iM7225 = AbstractC4031.m7224(str.charAt(i4));
                        if (iM7224 == -1 || iM7225 == -1) {
                            c1270.m2684(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c1270.m2680((iM7224 << 4) + iM7225);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c1270.m2680(32);
                        iCharCount++;
                    } else {
                        c1270.m2684(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c1270.m2669();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static byte[] m5941(List list) {
        C1270 c1270 = new C1270();
        for (String str : m5942(list)) {
            c1270.m2680(str.length());
            c1270.m2677(str);
        }
        return c1270.m2667(c1270.f4340);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static ArrayList m5942(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC1658) obj) != EnumC1658.f5517) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC1658) it.next()).f5518);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static C5163 m5943(String str) {
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int i = length - 1;
            int i2 = i;
            while (i2 > -1) {
                if (Character.isDigit(str.charAt(i2))) {
                    int i3 = i2 + 1;
                    try {
                        return new C5163(i2 == i ? null : str.substring(i3, length), Float.parseFloat(str.substring(0, i3)));
                    } catch (NumberFormatException unused) {
                        break;
                    }
                }
                i2--;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static C5040 m5944(C4369 c4369) {
        return new C5040(System.currentTimeMillis() + 3600000, new C1984(8), new C1515(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        switch (this.f10836) {
            case 9:
                return C3142.f10609;
            default:
                C4575 c4575 = new C4575(4);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    C0178.m387("Null flags");
                    return null;
                }
                map.put(EnumC4021.f13412, new C5526(30000L, 86400000L, set));
                if (set == null) {
                    C0178.m387("Null flags");
                    return null;
                }
                map.put(EnumC4021.f13409, new C5526(1000L, 86400000L, set));
                if (set == null) {
                    C0178.m387("Null flags");
                    return null;
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC2063.f6791)));
                if (setUnmodifiableSet == null) {
                    C0178.m387("Null flags");
                    return null;
                }
                map.put(EnumC4021.f13411, new C5526(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() >= EnumC4021.values().length) {
                    new HashMap();
                    return new C0450(c4575, map);
                }
                C1078.m2276("Not all priorities have been configured");
                return null;
        }
    }

    public String toString() {
        switch (this.f10836) {
            case 1:
                return "CompositionErrorContext";
            case 27:
                return "SharingStarted.Eagerly";
            case 28:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC1133
    /* JADX INFO: renamed from: ۥؗ */
    public long mo2390(long j, long j2) {
        float fM5129 = AbstractC2765.m5129(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM5129)) << 32) | (((long) Float.floatToRawIntBits(fM5129)) & 4294967295L);
        int i = AbstractC2579.f8620;
        return jFloatToRawIntBits;
    }

    @Override // p000.InterfaceC4132
    /* JADX INFO: renamed from: ۥُ */
    public CharSequence mo5945(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f223.getString(R.string.not_set);
        }
        return null;
    }

    @Override // p000.InterfaceC1411
    /* JADX INFO: renamed from: ۥّ */
    public boolean mo2977(C0181 c0181) {
        AbstractC3831 abstractC3831 = c0181.f670;
        if ((abstractC3831 instanceof C0189 ? ((C0189) abstractC3831).f704 : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        AbstractC3831 abstractC3832 = c0181.f669;
        return (abstractC3832 instanceof C0189 ? ((C0189) abstractC3832).f704 : Integer.MAX_VALUE) > 100;
    }

    /* JADX INFO: renamed from: ۥْ */
    public synchronized C5700 m5946(String str) {
        C5700 c5700;
        String strConcat;
        try {
            LinkedHashMap linkedHashMap = C5700.f18763;
            c5700 = (C5700) linkedHashMap.get(str);
            if (c5700 == null) {
                if (str.startsWith("TLS_")) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = str.startsWith("SSL_") ? "TLS_".concat(str.substring(4)) : str;
                }
                c5700 = (C5700) linkedHashMap.get(strConcat);
                if (c5700 == null) {
                    c5700 = new C5700(str);
                }
                linkedHashMap.put(str, c5700);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5700;
    }

    @Override // p000.InterfaceC1411
    /* JADX INFO: renamed from: ۥۗ */
    public boolean mo2978() {
        boolean z;
        synchronized (C1671.f5571) {
            try {
                int i = C1671.f5568;
                C1671.f5568 = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > C1671.f5572 + 30000) {
                    C1671.f5568 = 0;
                    C1671.f5572 = SystemClock.uptimeMillis();
                    String[] list = C1671.f5570.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    C1671.f5569 = list.length < 800;
                }
                z = C1671.f5569;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC1351
    /* JADX INFO: renamed from: ۥۣ */
    public Typeface mo2860(C1626 c1626, int i) {
        return m5938(null, c1626, i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    @Override // p000.InterfaceC1351
    /* JADX INFO: renamed from: ۦؑ */
    public Typeface mo2861(C3277 c3277, C1626 c1626, int i) {
        String str;
        c3277.getClass();
        int i2 = c1626.f5444 / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 <= i2 && i2 < 4) {
            str = "sans-serif-light";
        } else if (i2 == 4) {
            str = "sans-serif";
        } else if (i2 == 5) {
            str = "sans-serif-medium";
        } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
            str = "sans-serif-black";
        } else {
            str = "sans-serif";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface typefaceM5938 = m5938(str, c1626, i);
            if (!AbstractC3831.m6874(typefaceM5938, Typeface.create(Typeface.DEFAULT, AbstractC1434.m3041(c1626, i))) && !AbstractC3831.m6874(typefaceM5938, m5938(null, c1626, i))) {
                typeface = typefaceM5938;
            }
        }
        return typeface == null ? m5938("sans-serif", c1626, i) : typeface;
    }

    @Override // p000.InterfaceC3814
    /* JADX INFO: renamed from: ۦؚ */
    public C3580 mo4409(Object obj) {
        return AbstractC5378.m9075(Boolean.TRUE);
    }

    @Override // p000.InterfaceC0711
    /* JADX INFO: renamed from: ۦِ */
    public StackTraceElement[] mo1576(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r7 == r5) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ۥُۜؑٔ] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: ۦۗ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m5947(p000.InterfaceC2361 r8, p000.AbstractC0772 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p000.C1754
            if (r0 == 0) goto L13
            r0 = r9
            ۥٚۨؑ r0 = (p000.C1754) r0
            int r1 = r0.f5846
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5846 = r1
            goto L18
        L13:
            ۥٚۨؑ r0 = new ۥٚۨؑ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.f5843
            int r9 = r0.f5846
            java.lang.String r1 = "FirebaseSessions"
            r2 = 2
            r3 = 1
            java.lang.String r4 = ""
            ۥٟۚؕۨ r5 = p000.EnumC2282.f7590
            if (r9 == 0) goto L45
            if (r9 == r3) goto L3b
            if (r9 != r2) goto L34
            java.lang.Object r8 = r0.f5844
            java.lang.String r8 = (java.lang.String) r8
            p000.AbstractC0186.m409(r7)     // Catch: java.lang.Exception -> L32
            goto L81
        L32:
            r7 = move-exception
            goto L88
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1078.m2276(r7)
            r7 = 0
            return r7
        L3b:
            java.lang.Object r8 = r0.f5844
            ۥُۜؑٔ r8 = (p000.InterfaceC2361) r8
            p000.AbstractC0186.m409(r7)     // Catch: java.lang.Exception -> L43
            goto L5d
        L43:
            r7 = move-exception
            goto L69
        L45:
            p000.AbstractC0186.m409(r7)
            r7 = r8
            ۥٍْۡ r7 = (p000.C2588) r7     // Catch: java.lang.Exception -> L43
            ۦؚۣؑۛ r8 = r7.m4883()     // Catch: java.lang.Exception -> L43
            r0.f5844 = r7     // Catch: java.lang.Exception -> L65
            r0.f5846 = r3     // Catch: java.lang.Exception -> L65
            java.lang.Object r8 = p000.AbstractC1605.m3332(r8, r0)     // Catch: java.lang.Exception -> L65
            if (r8 != r5) goto L5a
            goto L80
        L5a:
            r6 = r8
            r8 = r7
            r7 = r6
        L5d:
            ۦؚٖٔ r7 = (p000.C4330) r7     // Catch: java.lang.Exception -> L43
            java.lang.String r7 = r7.f14303     // Catch: java.lang.Exception -> L43
            r6 = r8
            r8 = r7
            r7 = r6
            goto L70
        L65:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L69:
            java.lang.String r9 = "Error getting authentication token."
            android.util.Log.w(r1, r9, r7)
            r7 = r8
            r8 = r4
        L70:
            ۥٍْۡ r7 = (p000.C2588) r7     // Catch: java.lang.Exception -> L32
            ۦؚۣؑۛ r7 = r7.m4882()     // Catch: java.lang.Exception -> L32
            r0.f5844 = r8     // Catch: java.lang.Exception -> L32
            r0.f5846 = r2     // Catch: java.lang.Exception -> L32
            java.lang.Object r7 = p000.AbstractC1605.m3332(r7, r0)     // Catch: java.lang.Exception -> L32
            if (r7 != r5) goto L81
        L80:
            return r5
        L81:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
            if (r7 != 0) goto L86
            goto L8d
        L86:
            r4 = r7
            goto L8d
        L88:
            java.lang.String r9 = "Error getting Firebase installation id ."
            android.util.Log.w(r1, r9, r7)
        L8d:
            ۥٍؗ۠ؒ r7 = new ۥٍؗ۠ؒ
            r7.<init>(r4, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3223.m5947(ۥُۜؑٔ, ۥؚؒۥؔ):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۦۚ */
    public void m5948(String str) {
        AbstractC3761.m6627(5, 1);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0064->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0081 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0084 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۦۛ */
    public Object m5949(List list, C1058 c1058, AbstractC0772 abstractC0772) throws Throwable {
        C3961 c3961;
        List list2;
        Iterator it;
        C5450 c5450;
        Throwable th;
        InterfaceC4745 interfaceC4745;
        if (abstractC0772 instanceof C3961) {
            c3961 = (C3961) abstractC0772;
            int i = c3961.f13245;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3961.f13245 = i - Integer.MIN_VALUE;
            } else {
                c3961 = new C3961(this, abstractC0772);
            }
        } else {
            c3961 = new C3961(this, abstractC0772);
        }
        Object obj = c3961.f13243;
        int i2 = c3961.f13245;
        InterfaceC0443 interfaceC0443 = null;
        int i3 = 1;
        Object obj2 = EnumC2282.f7590;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            ArrayList arrayList = new ArrayList();
            C5770 c5770 = new C5770(list, arrayList, interfaceC0443, i3);
            c3961.f13242 = arrayList;
            c3961.f13245 = 1;
            if (c1058.m2264(c5770, c3961) != obj2) {
                list2 = arrayList;
            }
            return obj2;
        }
        if (i2 == 1) {
            list2 = (List) c3961.f13242;
            AbstractC0186.m409(obj);
        } else {
            if (i2 != 2) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = c3961.f13241;
            c5450 = (C5450) c3961.f13242;
            try {
                AbstractC0186.m409(obj);
            } catch (Throwable th2) {
                Object obj3 = c5450.f17965;
                if (obj3 == null) {
                    c5450.f17965 = th2;
                } else {
                    AbstractC5537.m9223((Throwable) obj3, th2);
                }
            }
        }
        while (it.hasNext()) {
            interfaceC4745 = (InterfaceC4745) it.next();
            c3961.f13242 = c5450;
            c3961.f13241 = it;
            c3961.f13245 = 2;
            if (interfaceC4745.mo211(c3961) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) c5450.f17965;
        if (th == null) {
            return C2358.f7817;
        }
        throw th;
        C5450 c5451 = new C5450();
        it = list2.iterator();
        c5450 = c5451;
        while (it.hasNext()) {
            interfaceC4745 = (InterfaceC4745) it.next();
            c3961.f13242 = c5450;
            c3961.f13241 = it;
            c3961.f13245 = 2;
            if (interfaceC4745.mo211(c3961) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) c5450.f17965;
        if (th == null) {
            return C2358.f7817;
        }
        throw th;
    }

    public /* synthetic */ C3223(int i) {
        this.f10836 = i;
    }
}
