package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: ۥؕؖؓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0474 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f1722;

    /* JADX INFO: renamed from: ۥُ */
    public Object f1723;

    /* JADX INFO: renamed from: ۥّ */
    public Object f1724;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f1725;

    /* JADX INFO: renamed from: ۥۜ */
    public Object f1726;

    /* JADX INFO: renamed from: ۥۣ */
    public Object f1727;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f1728;

    /* JADX INFO: renamed from: ۦٛ */
    public Object f1729;

    /* JADX INFO: renamed from: ۦۙ */
    public Object f1730;

    /* JADX INFO: renamed from: ۥُ */
    public static int m1021(int[] iArr, C5851 c5851) {
        c5851.getClass();
        int i = iArr[0] + c5851.f19291;
        iArr[0] = i;
        return Math.max(0, i);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x00c7 A[EDGE_INSN: B:116:0x00c7->B:35:0x00c7 BREAK  A[LOOP:2: B:21:0x007e->B:33:0x00b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8 A[LOOP:2: B:21:0x007e->B:33:0x00b8, LOOP_END] */
    /* JADX INFO: renamed from: ۥؗ */
    public void m1022(int i, int i2, ArrayList arrayList, C3510 c3510, C3437 c3437, boolean z, boolean z2, int i3, int i4) throws Throwable {
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z3;
        Throwable th;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i5;
        ArrayList arrayList6 = (ArrayList) this.f1723;
        ArrayList arrayList7 = (ArrayList) this.f1728;
        C3639 c3639 = (C3639) this.f1722;
        C3262 c3262 = (C3262) this.f1727;
        ArrayList arrayList8 = (ArrayList) this.f1730;
        ArrayList arrayList9 = (ArrayList) this.f1724;
        C3510 c3511 = (C3510) this.f1725;
        this.f1725 = c3510;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C5851 c5851 = (C5851) arrayList.get(i6);
            int size2 = c5851.f19287.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ((AbstractC0275) c5851.f19287.get(i7)).mo570();
            }
        }
        if (c3262.m6025()) {
            m1025();
            return;
        }
        boolean z4 = z || !z2;
        Object[] objArr = c3262.f10947;
        long[] jArr = c3262.f10948;
        int length = jArr.length - 2;
        int i8 = 8;
        if (length >= 0) {
            z3 = z4;
            int i9 = 0;
            while (true) {
                long j = jArr[i9];
                arrayList2 = arrayList8;
                arrayList3 = arrayList9;
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i9 != length) {
                        break;
                        break;
                    }
                    i9++;
                    arrayList8 = arrayList2;
                    arrayList9 = arrayList3;
                    i8 = 8;
                } else {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j & 255) < 128) {
                            c3639.m6495(objArr[(i9 << 3) + i11]);
                        }
                        j >>= i8;
                        i11++;
                        i8 = i8;
                    }
                    if (i10 != i8) {
                        break;
                    }
                    if (i9 != length) {
                        break;
                    }
                    i9++;
                    arrayList8 = arrayList2;
                    arrayList9 = arrayList3;
                    i8 = 8;
                }
            }
        } else {
            arrayList2 = arrayList8;
            arrayList3 = arrayList9;
            z3 = z4;
        }
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            C5851 c5852 = (C5851) arrayList.get(i12);
            Object obj = c5852.f19296;
            List list = c5852.f19287;
            c3639.m6497(obj);
            int size4 = list.size();
            for (int i13 = 0; i13 < size4; i13++) {
                ((AbstractC0275) list.get(i13)).mo570();
            }
            AbstractC2049.m4001(((C3262) this.f1727).m6026(c5852.f19296));
        }
        int[] iArr = new int[1];
        Throwable th2 = null;
        if (z3 && c3511 != null) {
            if (arrayList7.isEmpty()) {
                i5 = 0;
            } else {
                if (arrayList7.size() > 1) {
                    AbstractC3872.m6902(arrayList7, new C0261(c3511, 2));
                }
                if (arrayList7.size() > 0) {
                    C5851 c5853 = (C5851) arrayList7.get(0);
                    m1021(iArr, c5853);
                    AbstractC2049.m4001(c3262.m6027(c5853.f19296));
                    c5853.m9677(0);
                    throw null;
                }
                i5 = 0;
                AbstractC0246.m507(iArr, 0);
            }
            if (!arrayList6.isEmpty()) {
                if (arrayList6.size() > 1) {
                    AbstractC3872.m6902(arrayList6, new C0261(c3511, i5));
                }
                if (arrayList6.size() > 0) {
                    C5851 c5854 = (C5851) arrayList6.get(i5);
                    m1021(iArr, c5854);
                    AbstractC2049.m4001(c3262.m6027(c5854.f19296));
                    c5854.m9677(i5);
                    throw null;
                }
                AbstractC0246.m507(iArr, i5);
            }
        }
        Object[] objArr2 = c3639.f12174;
        long[] jArr2 = c3639.f12175;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j2 = jArr2[i14];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    long j3 = j2;
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j3 & 255) < 128) {
                            AbstractC2049.m4001(c3262.m6027(objArr2[(i14 << 3) + i16]));
                        }
                        j3 >>= 8;
                        i16++;
                        th2 = th2;
                    }
                    th = th2;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    th = th2;
                }
                if (i14 == length2) {
                    break;
                }
                i14++;
                th2 = th;
            }
        } else {
            th = null;
        }
        if (arrayList3.isEmpty()) {
            arrayList4 = arrayList3;
        } else {
            if (arrayList3.size() > 1) {
                arrayList4 = arrayList3;
                AbstractC3872.m6902(arrayList4, new C0261(c3510, 3));
            } else {
                arrayList4 = arrayList3;
            }
            if (arrayList4.size() > 0) {
                C5851 c5855 = (C5851) arrayList4.get(0);
                AbstractC2049.m4001(c3262.m6027(c5855.f19296));
                m1021(iArr, c5855);
                if (!z) {
                    throw th;
                }
                ((C5851) AbstractC0973.m2045(arrayList)).m9677(0);
                throw th;
            }
            AbstractC0246.m507(iArr, 0);
        }
        if (arrayList2.isEmpty()) {
            arrayList5 = arrayList2;
        } else {
            int i17 = 1;
            if (arrayList2.size() > 1) {
                arrayList5 = arrayList2;
                AbstractC3872.m6902(arrayList5, new C0261(c3510, i17));
            } else {
                arrayList5 = arrayList2;
            }
            if (arrayList5.size() > 0) {
                C5851 c5856 = (C5851) arrayList5.get(0);
                AbstractC2049.m4001(c3262.m6027(c5856.f19296));
                m1021(iArr, c5856);
                throw th;
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList7.clear();
        arrayList6.clear();
        arrayList4.clear();
        arrayList5.clear();
        c3639.m6493();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m1023(C1360 c1360, int i) {
        byte[] bArr;
        long j;
        C2159 c2159;
        String str;
        C2159 c21510;
        int i2;
        C3971 c3971M8927;
        String str2;
        Integer numValueOf;
        C0474 c0474;
        final C0474 c0475 = this;
        final C1360 c1361 = c1360;
        byte[] bArr2 = c1361.f4675;
        C1835 c1835 = (C1835) c0475.f1724;
        InterfaceC3586 interfaceC3586M1268 = ((C0567) c0475.f1725).m1268(c1361.f4676);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            if (!((Boolean) c1835.m3609(new InterfaceC5109(c0475) { // from class: ۦِؕٛۚ

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ C0474 f13294;

                {
                    this.f13294 = c0475;
                }

                @Override // p000.InterfaceC5109
                /* JADX INFO: renamed from: ۥؗ */
                public final Object mo3986() {
                    Boolean bool;
                    int i4 = i3;
                    C1360 c1362 = c1361;
                    C0474 c0476 = this.f13294;
                    switch (i4) {
                        case 0:
                            C1835 c1836 = (C1835) c0476.f1722;
                            SQLiteDatabase sQLiteDatabaseM3610 = c1836.m3610();
                            sQLiteDatabaseM3610.beginTransaction();
                            try {
                                Long lM3605 = C1835.m3605(sQLiteDatabaseM3610, c1362);
                                if (lM3605 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c1836.m3610().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM3605.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM3610.setTransactionSuccessful();
                                sQLiteDatabaseM3610.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM3610.endTransaction();
                                throw th2;
                            }
                        default:
                            C1835 c1837 = (C1835) c0476.f1722;
                            c1837.getClass();
                            return (Iterable) c1837.m3611(new C5017(5, c1837, c1362));
                    }
                }
            })).booleanValue()) {
                c1835.m3609(new C5562(jMax, c0475, c1361));
                return;
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) c1835.m3609(new InterfaceC5109(c0475) { // from class: ۦِؕٛۚ

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ C0474 f13294;

                {
                    this.f13294 = c0475;
                }

                @Override // p000.InterfaceC5109
                /* JADX INFO: renamed from: ۥؗ */
                public final Object mo3986() {
                    Boolean bool;
                    int i5 = i4;
                    C1360 c1362 = c1361;
                    C0474 c0476 = this.f13294;
                    switch (i5) {
                        case 0:
                            C1835 c1836 = (C1835) c0476.f1722;
                            SQLiteDatabase sQLiteDatabaseM3610 = c1836.m3610();
                            sQLiteDatabaseM3610.beginTransaction();
                            try {
                                Long lM3605 = C1835.m3605(sQLiteDatabaseM3610, c1362);
                                if (lM3605 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c1836.m3610().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM3605.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM3610.setTransactionSuccessful();
                                sQLiteDatabaseM3610.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM3610.endTransaction();
                                throw th2;
                            }
                        default:
                            C1835 c1837 = (C1835) c0476.f1722;
                            c1837.getClass();
                            return (Iterable) c1837.m3611(new C5017(5, c1837, c1362));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (interfaceC3586M1268 == null) {
                C3133.m5807("Uploader", "Unknown backend for %s, deleting event batch for it...", c1361);
                c21510 = new C2159(-1L, 3);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList<C3245> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5793) it.next()).f19085);
                }
                if (bArr2 != null) {
                    C1835 c1836 = (C1835) c0475.f1729;
                    Objects.requireNonNull(c1836);
                    C2807 c2807 = (C2807) c1835.m3609(new C5385(c1836, i3));
                    C2457 c2457 = new C2457();
                    c2457.f8208 = new HashMap();
                    c2457.f8210 = Long.valueOf(((InterfaceC5375) c0475.f1730).mo7674());
                    c2457.f8204 = Long.valueOf(((InterfaceC5375) c0475.f1726).mo7674());
                    c2457.f8203 = "GDT_CLIENT_METRICS";
                    C1329 c1329 = new C1329("proto");
                    c2807.getClass();
                    C3369 c3369 = AbstractC5093.f16888;
                    c3369.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c3369.m6142(c2807, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c2457.f8202 = new C1273(c1329, byteArrayOutputStream.toByteArray());
                    arrayList.add(((C5782) interfaceC3586M1268).m9600(c2457.m4587()));
                }
                C5782 c5782 = (C5782) interfaceC3586M1268;
                HashMap map = new HashMap();
                for (C3245 c3245 : arrayList) {
                    String str3 = c3245.f10893;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(c3245);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c3245);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    C3245 c3246 = (C3245) ((List) entry.getValue()).get(0);
                    EnumC5117 enumC5117 = EnumC5117.f16966;
                    long jMo7674 = c5782.f19053.mo7674();
                    long jMo7675 = c5782.f19052.mo7674();
                    C2134 c2134 = new C2134(new C1081(Integer.valueOf(c3246.m5959("sdk-version")), c3246.m5960("model"), c3246.m5960("hardware"), c3246.m5960("device"), c3246.m5960("product"), c3246.m5960("os-uild"), c3246.m5960("manufacturer"), c3246.m5960("fingerprint"), c3246.m5960("locale"), c3246.m5960("country"), c3246.m5960("mcc_mnc"), c3246.m5960("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C3245 c3247 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        C1273 c1273 = c3247.f10888;
                        byte[] bArr4 = c3247.f10895;
                        C1329 c13210 = c1273.f4346;
                        byte[] bArr5 = c1273.f4345;
                        long j2 = jMax;
                        if (c13210.equals(new C1329("proto"))) {
                            c0474 = new C0474();
                            c0474.f1723 = bArr5;
                        } else {
                            if (c13210.equals(new C1329("json"))) {
                                String str4 = new String(bArr5, Charset.forName("UTF-8"));
                                C0474 c0476 = new C0474();
                                c0476.f1724 = str4;
                                c0474 = c0476;
                            } else {
                                String strConcat = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat, 5)) {
                                    Log.w(strConcat, "Received event of unsupported encoding " + c13210 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        c0474.f1727 = Long.valueOf(c3247.f10894);
                        c0474.f1728 = Long.valueOf(c3247.f10889);
                        String str5 = (String) c3247.f10890.get("tz-offset");
                        c0474.f1730 = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        c0474.f1726 = new C0688((EnumC3808) EnumC3808.f12638.get(c3247.m5959("net-type")), (EnumC3476) EnumC3476.f11553.get(c3247.m5959("mobile-subtype")));
                        Integer num = c3247.f10891;
                        if (num != null) {
                            c0474.f1725 = num;
                        }
                        Integer num2 = c3247.f10897;
                        if (num2 != null) {
                            C3760 c3760 = new C3760(new C0663(num2));
                            EnumC1600 enumC1600 = EnumC1600.f5372;
                            c0474.f1722 = new C1688(c3760);
                        }
                        byte[] bArr6 = c3247.f10896;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            c0474.f1729 = new C3648(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strConcat2 = ((Long) c0474.f1727) == null ? " eventTimeMs" : "";
                        if (((Long) c0474.f1728) == null) {
                            strConcat2 = strConcat2.concat(" eventUptimeMs");
                        }
                        if (((Long) c0474.f1730) == null) {
                            strConcat2 = strConcat2.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat2.isEmpty()) {
                            C1078.m2276("Missing required properties:".concat(strConcat2));
                            return;
                        } else {
                            arrayList4.add(new C4583(((Long) c0474.f1727).longValue(), (Integer) c0474.f1725, (C1688) c0474.f1722, ((Long) c0474.f1728).longValue(), (byte[]) c0474.f1723, (String) c0474.f1724, ((Long) c0474.f1730).longValue(), (C0688) c0474.f1726, (C3648) c0474.f1729));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new C3653(jMo7674, jMo7675, c2134, numValueOf, str2, arrayList4));
                }
                bArr = bArr2;
                j = jMax;
                C1134 c1134 = new C1134(arrayList3);
                URL urlM9599 = c5782.f19056;
                if (bArr != null) {
                    try {
                        C3518 c3518M6310 = C3518.m6310(bArr);
                        str = c3518M6310.f11652;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = c3518M6310.f11653;
                        if (str6 != null) {
                            urlM9599 = C5782.m9599(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        c2159 = new C2159(-1L, 3);
                    }
                } else {
                    str = null;
                }
                try {
                    C2808 c2808 = new C2808(urlM9599, c1134, str);
                    C5322 c5322 = new C5322(0, c5782);
                    int i5 = 5;
                    do {
                        c3971M8927 = c5322.m8927(c2808);
                        URL url = c3971M8927.f13275;
                        if (url != null) {
                            C3133.m5807("CctTransportBackend", "Following redirect to: %s", url);
                            c2808 = new C2808(url, (C1134) c2808.f9377, (String) c2808.f9376);
                        } else {
                            c2808 = null;
                        }
                        if (c2808 == null) {
                            break;
                        } else {
                            i5--;
                        }
                    } while (i5 >= 1);
                    int i6 = c3971M8927.f13276;
                    if (i6 == 200) {
                        c21510 = new C2159(c3971M8927.f13274, 1);
                    } else {
                        if (i6 >= 500 || i6 == 404) {
                            c2159 = new C2159(-1L, 2);
                        } else if (i6 == 400) {
                            try {
                                c2159 = new C2159(-1L, 4);
                            } catch (IOException e) {
                                e = e;
                                C3133.m5800("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                c21510 = new C2159(-1L, 2);
                            }
                        } else {
                            c2159 = new C2159(-1L, 3);
                        }
                        c21510 = c2159;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i7 = c21510.f7124;
            if (i7 == i2) {
                c1835.m3609(new C4555(this, iterable, c1360, j));
                ((C2808) this.f1728).m5349(c1360, i + 1, true);
                return;
            }
            c0475 = this;
            c1361 = c1360;
            jMax = j;
            c1835.m3609(new C5017(7, c0475, iterable));
            if (i7 == 1) {
                jMax = Math.max(jMax, c21510.f7123);
                if (bArr != null) {
                    c1835.m3609(new C5322(11, c0475));
                }
            } else if (i7 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str7 = ((C5793) it2.next()).f19085.f10893;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                c1835.m3609(new C5017(8, c0475, map2));
            }
            bArr2 = bArr;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public long m1024() {
        ArrayList arrayList = (ArrayList) this.f1726;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        AbstractC2049.m4001(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c A[LOOP:0: B:7:0x0015->B:18:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004f A[EDGE_INSN: B:22:0x004f->B:19:0x004f BREAK  A[LOOP:0: B:7:0x0015->B:18:0x004c], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦؑ */
    public void m1025() {
        C3262 c3262 = (C3262) this.f1727;
        if (c3262.m6024()) {
            Object[] objArr = c3262.f10944;
            long[] jArr = c3262.f10948;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                AbstractC2049.m4001(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            c3262.m6020();
        }
    }
}
