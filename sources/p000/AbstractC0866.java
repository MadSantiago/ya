package p000;

import android.text.TextUtils;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥًًؘ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0866 implements Closeable {

    /* JADX INFO: renamed from: ۥَ */
    public Thread f3185;

    /* JADX INFO: renamed from: ۥْ */
    public final String f3186;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f3187;

    /* JADX INFO: renamed from: ۦ۟ */
    public final UUID f3188;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC0866 f3189 = null;

    public AbstractC0866(String str, UUID uuid, String str2, C1037 c1037) {
        this.f3187 = str;
        this.f3188 = uuid;
        this.f3186 = str2;
        c1037.getClass();
        this.f3185 = Thread.currentThread();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m1854(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1037 c1037M9168 = AbstractC5474.m9168();
        AbstractC0866 abstractC0866 = c1037M9168.f3670;
        String str = this.f3187;
        if (abstractC0866 == null) {
            throw new C3759(AbstractC3761.m6622(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == abstractC0866) {
            AbstractC5474.m9169(c1037M9168, abstractC0866.f3189);
            this.f3185 = null;
            return;
        }
        String str2 = abstractC0866.f3187;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        sb.append("Tried to end span ");
        sb.append(str);
        sb.append(", but that span is not the current span. The current span is ");
        sb.append(str2);
        sb.append(".");
        throw new C3759(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:76:0x0213  */
    public final String toString() {
        int i;
        int i2;
        C4998 c4998;
        Iterator it;
        C2038 c2038;
        int i3;
        C2991 c2991;
        AtomicReference atomicReference = AbstractC5474.f18063;
        AbstractC0866 abstractC0866 = this;
        int i4 = 0;
        int length = 0;
        while (abstractC0866 != null) {
            i4++;
            length += abstractC0866.f3187.length();
            abstractC0866 = abstractC0866.f3189;
            if (abstractC0866 != null) {
                length += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            AbstractC0866 abstractC0867 = this;
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                strArr[i5] = abstractC0867.f3187;
                abstractC0867 = abstractC0867.f3189;
            }
            C3510 c3510 = new C3510(4);
            int i6 = 1;
            AbstractC0219 abstractC0219Mo1604 = (i4 != 0 ? i4 != 1 ? AbstractC4821.m8196(i4, (Object[]) strArr.clone()) : new C3537(strArr[0]) : C2745.f9080).iterator();
            int i7 = 0;
            while (abstractC0219Mo1604.hasNext()) {
                c3510.m6302(abstractC0219Mo1604.next(), Integer.valueOf(i7));
                i7++;
            }
            C5147 c5147M6295 = c3510.m6295(true);
            int i8 = c5147M6295.f17054;
            int i9 = i4 >> 2;
            if (i8 > i9) {
                c4998 = null;
            } else {
                int i10 = i4 + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i4; i11++) {
                    iArr[i11] = ((Integer) c5147M6295.get(strArr[i11])).intValue();
                }
                iArr[i4] = i8;
                C3043 c3043 = new C3043(iArr);
                int i12 = 0;
                while (true) {
                    int i13 = -1;
                    if (i12 >= i10) {
                        break;
                    }
                    c3043.f10236 += i6;
                    int i14 = iArr[i12];
                    while (true) {
                        C2991 c2992 = null;
                        while (true) {
                            if (c3043.f10236 <= 0) {
                                i3 = i6;
                                break;
                            }
                            int i15 = c3043.f10231;
                            c2991 = (C2991) c3043.f10237;
                            i3 = i6;
                            if (i15 == 0) {
                                break;
                            }
                            int i16 = ((C2991) c2991.f10060.get(Integer.valueOf(iArr[c3043.f10234]))).f10059;
                            int i17 = c3043.f10231;
                            if (iArr[i16 + i17] == i14) {
                                if (c2992 != null) {
                                    c2992.f10057 = (C2991) c3043.f10237;
                                }
                                c3043.f10231 = i17 + 1;
                                c3043.m5649();
                                break;
                            }
                            C2991 c2993 = (C2991) ((C2991) c3043.f10237).f10060.get(Integer.valueOf(iArr[c3043.f10234]));
                            int i18 = c2993.f10059;
                            int i19 = i13;
                            C2991 c2994 = new C2991(i18, (c3043.f10231 + i18) - 1);
                            ((C2991) c3043.f10237).f10060.put(Integer.valueOf(iArr[c3043.f10234]), c2994);
                            int i20 = c2994.f10058 + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i20]);
                            HashMap map = c2994.f10060;
                            map.put(numValueOf, c2993);
                            c2993.f10059 = i20;
                            if (c2992 != null) {
                                c2992.f10057 = c2994;
                            }
                            map.put(Integer.valueOf(i14), new C2991(i12, 1073741824));
                            c3043.f10236--;
                            c3043.m5648();
                            c2992 = c2994;
                            i6 = i3;
                            i13 = i19;
                        }
                        HashMap map2 = c2991.f10060;
                        Integer numValueOf2 = Integer.valueOf(i14);
                        if (map2.containsKey(numValueOf2)) {
                            if (c2992 != null) {
                                c2992.f10057 = (C2991) c3043.f10237;
                            }
                            c3043.f10234 = i12;
                            c3043.f10231++;
                            c3043.m5649();
                            break;
                        }
                        ((C2991) c3043.f10237).f10060.put(numValueOf2, new C2991(i12, 1073741824));
                        if (c2992 != null) {
                            c2992.f10057 = (C2991) c3043.f10237;
                        }
                        c3043.f10236 += i13;
                        c3043.m5648();
                        i6 = i3;
                    }
                    i12++;
                    i6 = i3;
                }
                int i21 = i6;
                ArrayDeque arrayDeque = new ArrayDeque();
                C2991 c2995 = (C2991) c3043.f10233;
                C2038 c2039 = new C2038(c2995, 0, -1, -1);
                arrayDeque.push(c2039);
                while (!arrayDeque.isEmpty()) {
                    C2038 c20310 = (C2038) arrayDeque.pop();
                    Iterator it2 = c20310.f6722.f10060.values().iterator();
                    while (it2.hasNext()) {
                        C2991 c2996 = (C2991) it2.next();
                        int i22 = c20310.f6720;
                        int i23 = c20310.f6719;
                        int i24 = c2996.f10059;
                        C2991 c2997 = c2995;
                        int i25 = c2996.f10058;
                        if (c3043.m5647(i22, i23, i24, i25)) {
                            it = it2;
                        } else {
                            if (c2996.f10060.isEmpty()) {
                                int i26 = c2996.f10059;
                                it = it2;
                                if (c3043.m5647(i22, i23, i26, (i26 + i23) - i22)) {
                                }
                                if (c2039.f6721 < c2038.f6721) {
                                    c2039 = c2038;
                                }
                                arrayDeque.push(c2038);
                                c2995 = c2997;
                                it2 = it;
                                i21 = 1;
                            } else {
                                it = it2;
                            }
                            c2038 = new C2038(c2996, i21, c2996.f10059, i25);
                            if (c2039.f6721 < c2038.f6721) {
                                c2039 = c2038;
                            }
                            arrayDeque.push(c2038);
                            c2995 = c2997;
                            it2 = it;
                            i21 = 1;
                        }
                        c2038 = new C2038(c2996, c20310.f6721 + i21, i22, i23);
                        if (c2039.f6721 < c2038.f6721) {
                            c2039 = c2038;
                        }
                        arrayDeque.push(c2038);
                        c2995 = c2997;
                        it2 = it;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int iMin = Math.min(iArr.length, c2039.f6719 + 1);
                int i27 = 0;
                loop9: while (true) {
                    i = c2039.f6720;
                    i2 = iMin - i;
                    c2995 = (C2991) c2995.f10060.get(Integer.valueOf(iArr[(i27 % i2) + i]));
                    if (c2995 == null) {
                        break;
                    }
                    for (int i28 = c2995.f10059; i28 < c2995.f10058 + 1 && i28 < iArr.length; i28++) {
                        if (iArr[(i27 % i2) + i] != iArr[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                int i29 = i27 / i2;
                C4998 c4999 = new C4998();
                c4999.f16540 = i;
                c4999.f16539 = iMin;
                c4999.f16538 = i29;
                if (i2 * i29 < i9) {
                    c4998 = null;
                } else {
                    c4998 = c4999;
                }
            }
            String strConcat = "";
            if (c4998 != null) {
                int i30 = c4998.f16540;
                String strConcat2 = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                int i31 = c4998.f16539;
                int i32 = c4998.f16538;
                int i33 = ((i31 - i30) * i32) + i30;
                strConcat = i33 < i4 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i33, i4)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i32 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        AbstractC0866 abstractC0868 = this;
        while (abstractC0868 != null) {
            String str = abstractC0868.f3187;
            length -= str.length();
            str.getChars(0, str.length(), cArr, length);
            abstractC0868 = abstractC0868.f3189;
            if (abstractC0868 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public abstract AbstractC0191 mo1184();

    /* JADX INFO: renamed from: ۦ۟ */
    public abstract AbstractC0191 mo1855();
}
