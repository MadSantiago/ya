package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: ۥًٕۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0870 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f3191;

    /* JADX INFO: renamed from: ۥُ */
    public final C2813 f3192;

    /* JADX INFO: renamed from: ۥّ */
    public int f3193;

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f3194;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0201 f3195;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4752 f3196;

    public C0870(C0201 c0201, ArrayList arrayList, int i, C4752 c4752, C2813 c2813) {
        this.f3195 = c0201;
        this.f3194 = arrayList;
        this.f3191 = i;
        this.f3196 = c4752;
        this.f3192 = c2813;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0870 m1857(C0870 c0870, int i, C4752 c4752, C2813 c2813, int i2) {
        if ((i2 & 1) != 0) {
            i = c0870.f3191;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c4752 = c0870.f3196;
        }
        C4752 c4753 = c4752;
        if ((i2 & 4) != 0) {
            c2813 = c0870.f3192;
        }
        return new C0870(c0870.f3195, c0870.f3194, i3, c4753, c2813);
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:182:0x0325  */
    /* JADX WARN: Code duplicated, block: B:183:0x0328  */
    /* JADX WARN: Code duplicated, block: B:188:0x035f A[Catch: IOException -> 0x02cc, TryCatch #11 {IOException -> 0x02cc, blocks: (B:167:0x02c7, B:170:0x02cf, B:178:0x02f7, B:179:0x0313, B:186:0x0349, B:188:0x035f, B:191:0x0368, B:198:0x0381, B:200:0x0385, B:204:0x0392, B:206:0x03a5, B:208:0x03af, B:209:0x03b9, B:193:0x036e, B:212:0x03bf, B:213:0x03c2, B:180:0x031b, B:184:0x032a), top: B:387:0x02c7, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0367  */
    /* JADX WARN: Code duplicated, block: B:193:0x036e A[Catch: IOException -> 0x02cc, TryCatch #11 {IOException -> 0x02cc, blocks: (B:167:0x02c7, B:170:0x02cf, B:178:0x02f7, B:179:0x0313, B:186:0x0349, B:188:0x035f, B:191:0x0368, B:198:0x0381, B:200:0x0385, B:204:0x0392, B:206:0x03a5, B:208:0x03af, B:209:0x03b9, B:193:0x036e, B:212:0x03bf, B:213:0x03c2, B:180:0x031b, B:184:0x032a), top: B:387:0x02c7, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0381 A[Catch: IOException -> 0x02cc, TryCatch #11 {IOException -> 0x02cc, blocks: (B:167:0x02c7, B:170:0x02cf, B:178:0x02f7, B:179:0x0313, B:186:0x0349, B:188:0x035f, B:191:0x0368, B:198:0x0381, B:200:0x0385, B:204:0x0392, B:206:0x03a5, B:208:0x03af, B:209:0x03b9, B:193:0x036e, B:212:0x03bf, B:213:0x03c2, B:180:0x031b, B:184:0x032a), top: B:387:0x02c7, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0385 A[Catch: IOException -> 0x02cc, TryCatch #11 {IOException -> 0x02cc, blocks: (B:167:0x02c7, B:170:0x02cf, B:178:0x02f7, B:179:0x0313, B:186:0x0349, B:188:0x035f, B:191:0x0368, B:198:0x0381, B:200:0x0385, B:204:0x0392, B:206:0x03a5, B:208:0x03af, B:209:0x03b9, B:193:0x036e, B:212:0x03bf, B:213:0x03c2, B:180:0x031b, B:184:0x032a), top: B:387:0x02c7, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x038a  */
    /* JADX WARN: Code duplicated, block: B:204:0x0392 A[Catch: IOException -> 0x02cc, TryCatch #11 {IOException -> 0x02cc, blocks: (B:167:0x02c7, B:170:0x02cf, B:178:0x02f7, B:179:0x0313, B:186:0x0349, B:188:0x035f, B:191:0x0368, B:198:0x0381, B:200:0x0385, B:204:0x0392, B:206:0x03a5, B:208:0x03af, B:209:0x03b9, B:193:0x036e, B:212:0x03bf, B:213:0x03c2, B:180:0x031b, B:184:0x032a), top: B:387:0x02c7, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x03a5 A[Catch: IOException -> 0x02cc, TryCatch #11 {IOException -> 0x02cc, blocks: (B:167:0x02c7, B:170:0x02cf, B:178:0x02f7, B:179:0x0313, B:186:0x0349, B:188:0x035f, B:191:0x0368, B:198:0x0381, B:200:0x0385, B:204:0x0392, B:206:0x03a5, B:208:0x03af, B:209:0x03b9, B:193:0x036e, B:212:0x03bf, B:213:0x03c2, B:180:0x031b, B:184:0x032a), top: B:387:0x02c7, inners: #18 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:219:0x03cb A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:334:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:335:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:344:0x06f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:345:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:347:0x06fc  */
    /* JADX WARN: Instruction removed from duplicated block: B:347:0x06fc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [ۥُٖؑۙ] */
    /* JADX WARN: Type inference failed for: r2v35, types: [ۥُٖؑۙ] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r39v0, types: [ۥًٕۛ] */
    /* JADX WARN: Type inference failed for: r39v4 */
    /* JADX WARN: Type inference failed for: r39v5 */
    /* JADX WARN: Type inference failed for: r39v6 */
    /* JADX WARN: Type inference failed for: r39v7 */
    /* JADX WARN: Type inference failed for: r39v8 */
    /* JADX WARN: Type inference failed for: r39v9 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: ۥۗ */
    public final C2147 m1858(C2813 c2813) throws IOException {
        String str;
        String str2;
        C3758 c3758;
        ArrayList arrayList;
        C2147 c2147M1858;
        boolean z;
        AbstractC2978 abstractC2978;
        C3758 c3759;
        ?? r2;
        IOException iOException;
        ?? M8072;
        C2147 c2147M2239;
        int i;
        String strM8048;
        String str3;
        AbstractC2978 abstractC2979;
        long jMo3796;
        AbstractC2978 abstractC29710;
        Long lValueOf;
        String strM8049;
        C1033 c1033M8072;
        C3758 c37510;
        boolean z2;
        SSLSocketFactory sSLSocketFactory;
        C5125 c5125;
        C3175 c3175;
        String str4 = " must call proceed() exactly once";
        C4752 c4752 = this.f3196;
        int i2 = this.f3191;
        ArrayList arrayList2 = this.f3194;
        if (i2 >= arrayList2.size()) {
            C1078.m2276("Check failed.");
            return null;
        }
        this.f3193++;
        if (c4752 != null) {
            C4087 c4087 = (C4087) c4752.f15684;
            C0774 c0774 = (C0774) c2813.f9393;
            C0774 c0775 = c4087.f13643.f11486;
            if (c0774.f2796 != c0775.f2796 || !AbstractC3831.m6874(c0774.f2801, c0775.f2801)) {
                C1078.m2277(arrayList2.get(i2 - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.f3193 != 1) {
                C1078.m2277(arrayList2.get(i2 - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i3 = i2 + 1;
        C0870 c0870M1857 = m1857(this, i3, null, c2813, 58);
        C3758 c37511 = (C3758) arrayList2.get(i2);
        switch (c37511.f12520) {
            case 0:
                str = "interceptor ";
                str4 = " must call proceed() exactly once";
                c4752 = c4752;
                str2 = "network interceptor ";
                c3758 = c37511;
                arrayList = arrayList2;
                C0201 c0201 = c0870M1857.f3195;
                synchronized (c0201) {
                    try {
                        if (!c0201.f733) {
                            throw new IllegalStateException("released");
                        }
                        if (c0201.f739) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (c0201.f742) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C4087 c4088 = c0201.f743;
                C2561 c2561 = c0201.f746;
                c4088.getClass();
                try {
                    InterfaceC4559 interfaceC4559M6509 = c4088.m7278(!AbstractC3831.m6874((String) c0870M1857.f3192.f9389, "GET")).m6509(c2561, c0870M1857);
                    C4752 c4753 = new C4752();
                    c4753.f15686 = c0201;
                    c4753.f15684 = c4088;
                    c4753.f15688 = interfaceC4559M6509;
                    c4753.f15685 = interfaceC4559M6509.mo4247();
                    c0201.f740 = c4753;
                    c0201.f741 = c4753;
                    synchronized (c0201) {
                        c0201.f742 = true;
                        c0201.f739 = true;
                    }
                    if (c0201.f732) {
                        C5028.m8448("Canceled");
                        c2147M1858 = null;
                    } else {
                        c2147M1858 = m1857(c0870M1857, 0, c4753, null, 61).m1858(c0870M1857.f3192);
                    }
                    if (c2147M1858 != null) {
                        throw new NullPointerException(str + c3758 + " returned null");
                    }
                    if (c4752 == null && i3 < arrayList.size() && c0870M1857.f3193 != 1) {
                        C1078.m2277(c3758, str4, str2);
                        return null;
                    }
                    c37510 = c3758;
                    if (c2147M1858.f7039 != null) {
                        return c2147M1858;
                    }
                    C1078.m2277(c37510, " returned a response with no body", str);
                    return null;
                } catch (IOException e) {
                    c4088.m7277(e);
                    throw new C2493(e);
                } catch (C2493 e2) {
                    c4088.m7277(e2.f8290);
                    throw e2;
                }
            case 1:
                str = "interceptor ";
                str4 = " must call proceed() exactly once";
                c4752 = c4752;
                str2 = "network interceptor ";
                arrayList = arrayList2;
                C2813 c2814 = c0870M1857.f3192;
                C1414 c1414M5377 = c2814.m5377();
                C0774 c0776 = (C0774) c2814.f9393;
                C4714 c4714 = (C4714) c2814.f9390;
                c3758 = c37511;
                AbstractC2577 abstractC2577 = (AbstractC2577) c2814.f9388;
                long j = -1;
                if (abstractC2577 != null) {
                    C0822 c0822Mo3259 = abstractC2577.mo3259();
                    if (c0822Mo3259 != null) {
                        c1414M5377.m2993("Content-Type", c0822Mo3259.f2917);
                    }
                    long jMo3260 = abstractC2577.mo3260();
                    if (jMo3260 != -1) {
                        c1414M5377.m2993("Content-Length", String.valueOf(jMo3260));
                        c1414M5377.m3011("Transfer-Encoding");
                    } else {
                        c1414M5377.m2993("Transfer-Encoding", "chunked");
                        c1414M5377.m3011("Content-Length");
                    }
                }
                if (c4714.m8048("Host") == null) {
                    c1414M5377.m2993("Host", AbstractC4031.m7217(c0776, false));
                }
                if (c4714.m8048("Connection") == null) {
                    c1414M5377.m2993("Connection", "Keep-Alive");
                }
                if (c4714.m8048("Accept-Encoding") == null && c4714.m8048("Range") == null) {
                    c1414M5377.m2993("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                if (c4714.m8048("User-Agent") == null) {
                    c1414M5377.m2993("User-Agent", "okhttp/4.12.0");
                }
                C2147 c2147M1859 = c0870M1857.m1858(c1414M5377.m2998());
                C4714 c4715 = c2147M1859.f7034;
                int i4 = AbstractC0452.f1646;
                C1033 c1033M4176 = c2147M1859.m4176();
                c1033M4176.f3645 = c2814;
                if (z) {
                    String strM80410 = c4715.m8048("Content-Encoding");
                    if (strM80410 == null) {
                        strM80410 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strM80410) && AbstractC0452.m974(c2147M1859) && (abstractC2978 = c2147M1859.f7039) != null) {
                        C3206 c3206 = new C3206(abstractC2978.mo3797());
                        C5086 c5086M8046 = c4715.m8046();
                        c5086M8046.m8689("Content-Encoding");
                        c5086M8046.m8689("Content-Length");
                        c1033M4176.f3642 = c5086M8046.m8701().m8046();
                        String strM80411 = c4715.m8048("Content-Type");
                        c1033M4176.f3652 = new C3433(strM80411 == null ? null : strM80411, j, new C4162(c3206), 0);
                    }
                }
                c2147M1858 = c1033M4176.m2239();
                if (c2147M1858 != null) {
                    throw new NullPointerException(str + c3758 + " returned null");
                }
                if (c4752 == null) {
                    break;
                }
                c37510 = c3758;
                if (c2147M1858.f7039 != null) {
                    return c2147M1858;
                }
                C1078.m2277(c37510, " returned a response with no body", str);
                return null;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                str = "interceptor ";
                str4 = " must call proceed() exactly once";
                c4752 = c4752;
                str2 = "network interceptor ";
                arrayList = arrayList2;
                c3759 = c37511;
                System.currentTimeMillis();
                C2813 c2815 = c0870M1857.f3192;
                int i5 = 11;
                boolean z3 = false;
                Object obj = null;
                C5002 c5002 = new C5002(i5, c2815, obj, z3);
                if (c2815.m5374().f3665) {
                    c5002 = new C5002(i5, obj, obj, z3);
                }
                C2813 c2816 = (C2813) c5002.f16551;
                C2147 c2147 = (C2147) c5002.f16550;
                if (c2816 == null && c2147 == null) {
                    c2147M1858 = new C2147(c2815, EnumC1658.f5512, "Unsatisfiable Request (only-if-cached)", 504, null, new C4714((String[]) new ArrayList(20).toArray(new String[0])), AbstractC4031.f13447, null, null, null, -1L, System.currentTimeMillis(), null);
                } else if (c2816 == null) {
                    C1033 c1033M4177 = c2147.m4176();
                    C2147 c2147M7490 = AbstractC4225.m7490(c2147);
                    C1033.m2238("cacheResponse", c2147M7490);
                    c1033M4177.f3650 = c2147M7490;
                    c2147M1858 = c1033M4177.m2239();
                } else {
                    C2147 c2147M18510 = c0870M1857.m1858(c2816);
                    if (c2147 != null) {
                        if (c2147M18510.f7033 == 304) {
                            C1033 c1033M4178 = c2147.m4176();
                            C4714 c4716 = c2147.f7034;
                            C4714 c4717 = c2147M18510.f7034;
                            ArrayList arrayList3 = new ArrayList(20);
                            int size = c4716.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                String strM80412 = c4716.m8049(i6);
                                String strM8047 = c4716.m8047(i6);
                                if ((!"Warning".equalsIgnoreCase(strM80412) || !strM8047.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strM80412) || "Content-Encoding".equalsIgnoreCase(strM80412) || "Content-Type".equalsIgnoreCase(strM80412) || !AbstractC4225.m7436(strM80412) || c4717.m8048(strM80412) == null)) {
                                    arrayList3.add(strM80412);
                                    arrayList3.add(AbstractC0684.m9760(strM8047).toString());
                                }
                            }
                            int size2 = c4717.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                String strM80413 = c4717.m8049(i7);
                                if (!"Content-Length".equalsIgnoreCase(strM80413) && !"Content-Encoding".equalsIgnoreCase(strM80413) && !"Content-Type".equalsIgnoreCase(strM80413) && AbstractC4225.m7436(strM80413)) {
                                    String strM80414 = c4717.m8047(i7);
                                    arrayList3.add(strM80413);
                                    arrayList3.add(AbstractC0684.m9760(strM80414).toString());
                                }
                            }
                            String[] strArr = (String[]) arrayList3.toArray(new String[0]);
                            C5086 c5086 = new C5086(24);
                            ((ArrayList) c5086.f16877).addAll(Arrays.asList(strArr));
                            c1033M4178.f3642 = c5086;
                            c1033M4178.f3651 = c2147M18510.f7035;
                            c1033M4178.f3647 = c2147M18510.f7030;
                            C2147 c2147M7491 = AbstractC4225.m7490(c2147);
                            C1033.m2238("cacheResponse", c2147M7491);
                            c1033M4178.f3650 = c2147M7491;
                            C2147 c2147M7492 = AbstractC4225.m7490(c2147M18510);
                            C1033.m2238("networkResponse", c2147M7492);
                            c1033M4178.f3644 = c2147M7492;
                            c1033M4178.m2239();
                            c2147M18510.f7039.close();
                            throw null;
                        }
                        AbstractC2978 abstractC29711 = c2147.f7039;
                        if (abstractC29711 != null) {
                            AbstractC4031.m7212(abstractC29711);
                        }
                    }
                    C1033 c1033M4179 = c2147M18510.m4176();
                    C2147 c2147M7493 = AbstractC4225.m7490(c2147);
                    C1033.m2238("cacheResponse", c2147M7493);
                    c1033M4179.f3650 = c2147M7493;
                    C2147 c2147M7494 = AbstractC4225.m7490(c2147M18510);
                    C1033.m2238("networkResponse", c2147M7494);
                    c1033M4179.f3644 = c2147M7494;
                    c2147M1858 = c1033M4179.m2239();
                }
                c3758 = c3759;
                if (c2147M1858 != null) {
                    throw new NullPointerException(str + c3758 + " returned null");
                }
                if (c4752 == null) {
                    break;
                }
                c37510 = c3758;
                if (c2147M1858.f7039 != null) {
                    return c2147M1858;
                }
                C1078.m2277(c37510, " returned a response with no body", str);
                return null;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                c4752 = c4752;
                C4752 c4754 = c0870M1857.f3196;
                C2813 c2817 = c0870M1857.f3192;
                AbstractC2577 abstractC2578 = (AbstractC2577) c2817.f9388;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        c4754.getClass();
                        try {
                            C0201 c0202 = (C0201) c4754.f15686;
                            arrayList = arrayList2;
                            try {
                                InterfaceC4559 interfaceC4559 = (InterfaceC4559) c4754.f15688;
                                interfaceC4559.mo4248(c2817);
                                str = "interceptor ";
                                try {
                                    try {
                                        if (!AbstractC1605.m3335((String) c2817.f9389) || abstractC2578 == null) {
                                            str4 = " must call proceed() exactly once";
                                            str2 = "network interceptor ";
                                            c0202.m465(c4754, true, false, null);
                                            r2 = 0;
                                        } else {
                                            str4 = " must call proceed() exactly once";
                                            str2 = "network interceptor ";
                                            if ("100-continue".equalsIgnoreCase(((C4714) c2817.f9390).m8048("Expect"))) {
                                                try {
                                                    interfaceC4559.mo4249();
                                                    c1033M8072 = c4754.m8072(true);
                                                } catch (IOException e3) {
                                                    c4754.m8073(e3);
                                                    throw e3;
                                                }
                                            } else {
                                                c1033M8072 = null;
                                            }
                                            try {
                                                if (c1033M8072 == null) {
                                                    try {
                                                        this = c1033M8072;
                                                        long jMo3261 = ((AbstractC2577) c2817.f9388).mo3260();
                                                        C5025 c5025 = new C5025(new C2343(c4754, interfaceC4559.mo4242(c2817, jMo3261), jMo3261));
                                                        abstractC2578.mo3258(c5025);
                                                        c5025.close();
                                                    } catch (IOException e4) {
                                                        e = e4;
                                                        this = c1033M8072;
                                                        r2 = this;
                                                        if (e instanceof C0824) {
                                                            throw e;
                                                        }
                                                        throw e;
                                                    }
                                                } else {
                                                    this = c1033M8072;
                                                    c0202.m465(c4754, true, false, null);
                                                    if (!(((C3641) c4754.f15685).f12189 != null)) {
                                                        interfaceC4559.mo4247().m6511();
                                                    }
                                                }
                                                r2 = this;
                                            } catch (IOException e5) {
                                                e = e5;
                                            }
                                        }
                                        try {
                                            interfaceC4559.mo4239();
                                            iOException = null;
                                            M8072 = r2;
                                        } catch (IOException e6) {
                                            try {
                                                c4754.m8073(e6);
                                                throw e6;
                                            } catch (IOException e7) {
                                                e = e7;
                                                if ((e instanceof C0824) || !c4754.f15687) {
                                                    throw e;
                                                }
                                                iOException = e;
                                                if (M8072 == 0) {
                                                    M8072 = r2;
                                                    try {
                                                        M8072 = c4754.m8072(false);
                                                    } catch (IOException e8) {
                                                        if (iOException == null) {
                                                            throw e8;
                                                        }
                                                        AbstractC5537.m9223(iOException, e8);
                                                        throw iOException;
                                                    }
                                                }
                                                M8072 = r2;
                                                M8072.f3645 = c2817;
                                                M8072.f3641 = ((C3641) c4754.f15685).f12178;
                                                M8072.f3651 = jCurrentTimeMillis;
                                                c3759 = c37511;
                                                M8072.f3647 = System.currentTimeMillis();
                                                c2147M2239 = M8072.m2239();
                                                i = c2147M2239.f7033;
                                                if (i != 100) {
                                                    C1033 c1033M8073 = c4754.m8072(false);
                                                    c1033M8073.f3645 = c2817;
                                                    c1033M8073.f3641 = ((C3641) c4754.f15685).f12178;
                                                    c1033M8073.f3651 = jCurrentTimeMillis;
                                                    c1033M8073.f3647 = System.currentTimeMillis();
                                                    c2147M2239 = c1033M8073.m2239();
                                                    i = c2147M2239.f7033;
                                                } else {
                                                    C1033 c1033M8074 = c4754.m8072(false);
                                                    c1033M8074.f3645 = c2817;
                                                    c1033M8074.f3641 = ((C3641) c4754.f15685).f12178;
                                                    c1033M8074.f3651 = jCurrentTimeMillis;
                                                    c1033M8074.f3647 = System.currentTimeMillis();
                                                    c2147M2239 = c1033M8074.m2239();
                                                    i = c2147M2239.f7033;
                                                }
                                                C1033 c1033M41710 = c2147M2239.m4176();
                                                InterfaceC4559 interfaceC45510 = (InterfaceC4559) c4754.f15688;
                                                strM8048 = c2147M2239.f7034.m8048("Content-Type");
                                                if (strM8048 == null) {
                                                    str3 = null;
                                                } else {
                                                    str3 = strM8048;
                                                }
                                                long jMo4241 = interfaceC45510.mo4241(c2147M2239);
                                                c1033M41710.f3652 = new C3433(str3, jMo4241, new C4162(new C0185(c4754, interfaceC45510.mo4246(c2147M2239), jMo4241)), 0);
                                                c2147M1858 = c1033M41710.m2239();
                                                if ("close".equalsIgnoreCase(((C4714) c2147M1858.f7042.f9390).m8048("Connection"))) {
                                                    ((InterfaceC4559) c4754.f15688).mo4247().m6511();
                                                } else {
                                                    strM8049 = c2147M1858.f7034.m8048("Connection");
                                                    if (strM8049 == null) {
                                                        strM8049 = null;
                                                    }
                                                    if ("close".equalsIgnoreCase(strM8049)) {
                                                        ((InterfaceC4559) c4754.f15688).mo4247().m6511();
                                                    }
                                                }
                                                if (i != 204) {
                                                    abstractC2979 = c2147M1858.f7039;
                                                    if (abstractC2979 != null) {
                                                        jMo3796 = abstractC2979.mo3796();
                                                    } else {
                                                        jMo3796 = -1;
                                                    }
                                                    if (jMo3796 > 0) {
                                                        StringBuilder sb = new StringBuilder("HTTP ");
                                                        sb.append(i);
                                                        sb.append(" had non-zero Content-Length: ");
                                                        abstractC29710 = c2147M1858.f7039;
                                                        if (abstractC29710 != null) {
                                                            lValueOf = Long.valueOf(abstractC29710.mo3796());
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        sb.append(lValueOf);
                                                        throw new ProtocolException(sb.toString());
                                                    }
                                                } else {
                                                    abstractC2979 = c2147M1858.f7039;
                                                    if (abstractC2979 != null) {
                                                        jMo3796 = abstractC2979.mo3796();
                                                    } else {
                                                        jMo3796 = -1;
                                                    }
                                                    if (jMo3796 > 0) {
                                                        StringBuilder sb2 = new StringBuilder("HTTP ");
                                                        sb2.append(i);
                                                        sb2.append(" had non-zero Content-Length: ");
                                                        abstractC29710 = c2147M1858.f7039;
                                                        if (abstractC29710 != null) {
                                                            lValueOf = Long.valueOf(abstractC29710.mo3796());
                                                        } else {
                                                            lValueOf = null;
                                                        }
                                                        sb2.append(lValueOf);
                                                        throw new ProtocolException(sb2.toString());
                                                    }
                                                }
                                                c3758 = c3759;
                                                if (c2147M1858 != null) {
                                                    throw new NullPointerException(str + c3758 + " returned null");
                                                }
                                                if (c4752 == null) {
                                                    break;
                                                }
                                                c37510 = c3758;
                                                if (c2147M1858.f7039 != null) {
                                                    return c2147M1858;
                                                }
                                                C1078.m2277(c37510, " returned a response with no body", str);
                                                return null;
                                            }
                                        }
                                    } catch (IOException e9) {
                                        e = e9;
                                        str2 = "network interceptor ";
                                        r2 = 0;
                                        if (e instanceof C0824) {
                                            throw e;
                                        }
                                        throw e;
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                c4754.m8073(e);
                                throw e;
                            }
                        } catch (IOException e12) {
                            e = e12;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        r2 = 0;
                        if (e instanceof C0824) {
                            throw e;
                        }
                        throw e;
                    }
                } catch (IOException e14) {
                    e = e14;
                    str = "interceptor ";
                    str4 = " must call proceed() exactly once";
                    str2 = "network interceptor ";
                    arrayList = arrayList2;
                }
                if (M8072 == 0) {
                    M8072 = r2;
                    M8072 = c4754.m8072(false);
                }
                M8072 = r2;
                M8072.f3645 = c2817;
                M8072.f3641 = ((C3641) c4754.f15685).f12178;
                M8072.f3651 = jCurrentTimeMillis;
                c3759 = c37511;
                M8072.f3647 = System.currentTimeMillis();
                c2147M2239 = M8072.m2239();
                i = c2147M2239.f7033;
                if (i != 100 || (102 <= i && i < 200)) {
                    C1033 c1033M8075 = c4754.m8072(false);
                    c1033M8075.f3645 = c2817;
                    c1033M8075.f3641 = ((C3641) c4754.f15685).f12178;
                    c1033M8075.f3651 = jCurrentTimeMillis;
                    c1033M8075.f3647 = System.currentTimeMillis();
                    c2147M2239 = c1033M8075.m2239();
                    i = c2147M2239.f7033;
                }
                C1033 c1033M41711 = c2147M2239.m4176();
                InterfaceC4559 interfaceC45511 = (InterfaceC4559) c4754.f15688;
                try {
                    strM8048 = c2147M2239.f7034.m8048("Content-Type");
                    if (strM8048 == null) {
                        str3 = null;
                    } else {
                        str3 = strM8048;
                    }
                    long jMo4242 = interfaceC45511.mo4241(c2147M2239);
                    c1033M41711.f3652 = new C3433(str3, jMo4242, new C4162(new C0185(c4754, interfaceC45511.mo4246(c2147M2239), jMo4242)), 0);
                    c2147M1858 = c1033M41711.m2239();
                    if ("close".equalsIgnoreCase(((C4714) c2147M1858.f7042.f9390).m8048("Connection"))) {
                        ((InterfaceC4559) c4754.f15688).mo4247().m6511();
                    } else {
                        strM8049 = c2147M1858.f7034.m8048("Connection");
                        if (strM8049 == null) {
                            strM8049 = null;
                        }
                        if ("close".equalsIgnoreCase(strM8049)) {
                            ((InterfaceC4559) c4754.f15688).mo4247().m6511();
                        }
                    }
                    if (i != 204 || i == 205) {
                        abstractC2979 = c2147M1858.f7039;
                        if (abstractC2979 != null) {
                            jMo3796 = abstractC2979.mo3796();
                        } else {
                            jMo3796 = -1;
                        }
                        if (jMo3796 > 0) {
                            StringBuilder sb3 = new StringBuilder("HTTP ");
                            sb3.append(i);
                            sb3.append(" had non-zero Content-Length: ");
                            abstractC29710 = c2147M1858.f7039;
                            if (abstractC29710 != null) {
                                lValueOf = Long.valueOf(abstractC29710.mo3796());
                            } else {
                                lValueOf = null;
                            }
                            sb3.append(lValueOf);
                            throw new ProtocolException(sb3.toString());
                        }
                    }
                    c3758 = c3759;
                    if (c2147M1858 != null) {
                        throw new NullPointerException(str + c3758 + " returned null");
                    }
                    if (c4752 == null) {
                        break;
                    }
                    c37510 = c3758;
                    if (c2147M1858.f7039 != null) {
                        return c2147M1858;
                    }
                    C1078.m2277(c37510, " returned a response with no body", str);
                    return null;
                } catch (IOException e15) {
                    c4754.m8073(e15);
                    throw e15;
                }
            default:
                C2813 c2818 = c0870M1857.f3192;
                C0201 c0203 = c0870M1857.f3195;
                C2147 c2148 = null;
                List listM2046 = C2340.f7777;
                int i8 = 0;
                C2813 c2813M6616 = c2818;
                boolean z4 = true;
                while (true) {
                    if (c0203.f740 == null) {
                        synchronized (c0203) {
                            try {
                                if (c0203.f739) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (c0203.f742) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (z4) {
                            C0615 c0615 = c0203.f736;
                            C0774 c0777 = (C0774) c2813M6616.f9393;
                            C2561 c2562 = c0203.f746;
                            if (c0777.f2802) {
                                SSLSocketFactory sSLSocketFactory2 = c2562.f8547;
                                if (sSLSocketFactory2 != null) {
                                    C5125 c5126 = C5125.f16987;
                                    c3175 = c2562.f8546;
                                    sSLSocketFactory = sSLSocketFactory2;
                                    c5125 = c5126;
                                } else {
                                    C1078.m2276("CLEARTEXT-only client");
                                }
                            } else {
                                sSLSocketFactory = null;
                                c5125 = null;
                                c3175 = null;
                            }
                            c0203.f743 = new C4087(c0615, new C3462(c0777.f2801, c0777.f2796, c2562.f8543, sSLSocketFactory, c5125, c3175, c2562.f8545, c2562.f8548, c2562.f8540), c0203);
                        } else {
                            c4752 = c4752;
                        }
                        try {
                            if (c0203.f732) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    c2147M1858 = c0870M1857.m1858(c2813M6616);
                                    if (c2148 != null) {
                                        C1033 c1033M41712 = c2147M1858.m4176();
                                        C1033 c1033M41713 = c2148.m4176();
                                        c1033M41713.f3652 = null;
                                        C2147 c2147M22310 = c1033M41713.m2239();
                                        if (c2147M22310.f7039 != null) {
                                            throw new IllegalArgumentException("priorResponse.body != null");
                                        }
                                        c1033M41712.f3649 = c2147M22310;
                                        c2147M1858 = c1033M41712.m2239();
                                    }
                                    c2813M6616 = c37511.m6616(c2147M1858, c0203.f740);
                                    if (c2813M6616 == null) {
                                        c0203.m459(false);
                                    } else {
                                        AbstractC2978 abstractC29712 = c2147M1858.f7039;
                                        if (abstractC29712 != null) {
                                            AbstractC4031.m7212(abstractC29712);
                                        }
                                        int i9 = i8 + 1;
                                        if (i9 > 20) {
                                            throw new ProtocolException("Too many follow-up requests: " + i9);
                                        }
                                        c0203.m459(true);
                                        c2148 = c2147M1858;
                                        i8 = i9;
                                        z4 = true;
                                    }
                                } catch (IOException e16) {
                                    z2 = true;
                                    if (!c37511.m6615(e16, c0203, c2813M6616, !(e16 instanceof C0824))) {
                                        Iterator it = listM2046.iterator();
                                        while (it.hasNext()) {
                                            AbstractC5537.m9223(e16, (Exception) it.next());
                                        }
                                        throw e16;
                                    }
                                    listM2046 = AbstractC0973.m2046(listM2046, e16);
                                    c0203.m459(z2);
                                    z4 = false;
                                }
                            } catch (C2493 e17) {
                                boolean zM6615 = c37511.m6615(e17.f8290, c0203, c2813M6616, false);
                                IOException iOException2 = e17.f8291;
                                if (!zM6615) {
                                    Iterator it2 = listM2046.iterator();
                                    while (it2.hasNext()) {
                                        AbstractC5537.m9223(iOException2, (Exception) it2.next());
                                    }
                                    throw iOException2;
                                }
                                listM2046 = AbstractC0973.m2046(listM2046, iOException2);
                                z2 = true;
                                c0203.m459(z2);
                                z4 = false;
                            }
                        } catch (Throwable th3) {
                            c0203.m459(true);
                            throw th3;
                        }
                    } else {
                        C1078.m2276("Check failed.");
                    }
                    c2147M1858 = null;
                }
                str = "interceptor ";
                str4 = " must call proceed() exactly once";
                str2 = "network interceptor ";
                c3758 = c37511;
                arrayList = arrayList2;
                if (c2147M1858 != null) {
                    throw new NullPointerException(str + c3758 + " returned null");
                }
                if (c4752 == null) {
                    break;
                }
                c37510 = c3758;
                if (c2147M1858.f7039 != null) {
                    return c2147M1858;
                }
                C1078.m2277(c37510, " returned a response with no body", str);
                return null;
        }
    }
}
