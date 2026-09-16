package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦؚؑؕؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3040 extends AbstractC2474 implements InterfaceC1681 {

    /* JADX INFO: renamed from: ۥؓ */
    public final C4461 f10214;

    /* JADX INFO: renamed from: ۥؖ */
    public final C3743 f10215;

    /* JADX INFO: renamed from: ۥً */
    public final C4461 f10216;

    /* JADX INFO: renamed from: ۥَ */
    public final C4461 f10217;

    /* JADX INFO: renamed from: ۥٓ */
    public final C4461 f10218;

    /* JADX INFO: renamed from: ۥٖ */
    public final C4461 f10219;

    /* JADX INFO: renamed from: ۥٙ */
    public final C5089 f10220;

    /* JADX INFO: renamed from: ۥۖ */
    public final C4461 f10221;

    /* JADX INFO: renamed from: ۥۧ */
    public final C4461 f10222;

    /* JADX INFO: renamed from: ۦٕ */
    public final C4461 f10223;

    /* JADX INFO: renamed from: ۦٗ */
    public final C4461 f10224;

    /* JADX INFO: renamed from: ۦۛ */
    public final C4461 f10225;

    public C3040(C5034 c5034) {
        super(c5034);
        this.f10218 = new C4461(0);
        this.f10217 = new C4461(0);
        this.f10219 = new C4461(0);
        this.f10224 = new C4461(0);
        this.f10225 = new C4461(0);
        this.f10221 = new C4461(0);
        this.f10214 = new C4461(0);
        this.f10222 = new C4461(0);
        this.f10216 = new C4461(0);
        this.f10223 = new C4461(0);
        this.f10220 = new C5089(this);
        this.f10215 = new C3743(0, this);
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static final C4461 m5625(C3256 c3256) {
        C4461 c4461 = new C4461(0);
        for (C4987 c4987 : c3256.m6004()) {
            c4461.put(c4987.m8373(), c4987.m8372());
        }
        return c4461;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static final EnumC4635 m5626(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return EnumC4635.f15302;
        }
        if (i2 == 2) {
            return EnumC4635.f15299;
        }
        if (i2 == 3) {
            return EnumC4635.f15300;
        }
        if (i2 != 4) {
            return null;
        }
        return EnumC4635.f15298;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final C1839 m5627(String str) {
        mo6517();
        m5632(str);
        C3256 c3256M5629 = m5629(str);
        if (c3256M5629 == null || !c3256M5629.m6003()) {
            return null;
        }
        return c3256M5629.m5991();
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final C3256 m5628(String str, byte[] bArr) {
        C5371 c5371 = (C5371) this.f18660;
        if (bArr == null) {
            return C3256.m5984();
        }
        try {
            C3256 c3256 = (C3256) ((C0337) C3117.m5718(C3256.m5983(), bArr)).m1977();
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12023.m9434(c3256.m5990() ? Long.valueOf(c3256.m5989()) : null, c3256.m5992() ? c3256.m6002() : null, "Parsed config. version, gmp_app_id");
            return c3256;
        } catch (RuntimeException e) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12022.m9434(C3610.m6440(str), e, "Unable to merge remote config. appId");
            return C3256.m5984();
        } catch (C5463 e2) {
            C3610 c3612 = c5371.f17717;
            C5371.m9020(c3612);
            c3612.f12022.m9434(C3610.m6440(str), e2, "Unable to merge remote config. appId");
            return C3256.m5984();
        }
    }

    @Override // p000.InterfaceC1681
    /* JADX INFO: renamed from: ۥؗ */
    public final String mo3507(String str, String str2) {
        mo6517();
        m5632(str);
        Map map = (Map) this.f10218.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥً */
    public final C3256 m5629(String str) {
        m4637();
        mo6517();
        AbstractC0487.m1090(str);
        m5632(str);
        return (C3256) this.f10221.get(str);
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m5630(String str, byte[] bArr, String str2, String str3) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        C0337 c0337;
        byte[] bArrM5754;
        Iterator it;
        int i;
        boolean z;
        m4637();
        mo6517();
        AbstractC0487.m1090(str);
        C0337 c0338 = (C0337) m5628(str, bArr).m8829();
        m5639(str, c0338);
        m5631(str, (C3256) c0338.m1977());
        C3256 c3256 = (C3256) c0338.m1977();
        C4461 c4461 = this.f10221;
        c4461.put(str, c3256);
        this.f10214.put(str, ((C3256) c0338.f3388).m5988());
        this.f10222.put(str, str2);
        this.f10216.put(str, str3);
        this.f10218.put(str, m5625((C3256) c0338.m1977()));
        C5034 c5034 = this.f19371;
        C1159 c1159 = c5034.f16670;
        C5034.m8484(c1159);
        ArrayList<C5462> arrayList = new ArrayList(Collections.unmodifiableList(((C3256) c0338.f3388).m5993()));
        C5371 c5371 = (C5371) c1159.f18660;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            C1352 c1352 = (C1352) ((C5462) arrayList.get(i2)).m8829();
            C4461 c4462 = c4461;
            if (((C5462) c1352.f3388).m9149() != 0) {
                int i3 = 0;
                while (i3 < ((C5462) c1352.f3388).m9149()) {
                    C2227 c2227 = (C2227) ((C5462) c1352.f3388).m9147(i3).m8829();
                    C2227 c2228 = (C2227) c2227.clone();
                    C5034 c5035 = c5034;
                    C0337 c0339 = c0338;
                    String strM1948 = AbstractC0949.m1948(((C3542) c2227.f3388).m6335(), AbstractC1605.f5396, AbstractC1605.f5399);
                    if (strM1948 != null) {
                        c2228.m1979();
                        ((C3542) c2228.f3388).m6334(strM1948);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < ((C3542) c2227.f3388).m6342()) {
                        C0529 c0529M6337 = ((C3542) c2227.f3388).m6337(i4);
                        boolean z2 = z;
                        C2227 c2229 = c2227;
                        String strM1949 = AbstractC0949.m1948(c0529M6337.m1179(), AbstractC4009.f13364, AbstractC4009.f13371);
                        if (strM1949 != null) {
                            C2798 c2798 = (C2798) c0529M6337.m8829();
                            c2798.m1979();
                            ((C0529) c2798.f3388).m1175(strM1949);
                            C0529 c0529 = (C0529) c2798.m1977();
                            c2228.m1979();
                            ((C3542) c2228.f3388).m6338(i4, c0529);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i4++;
                        c2227 = c2229;
                    }
                    if (z) {
                        c1352.m1979();
                        ((C5462) c1352.f3388).m9142(i3, (C3542) c2228.m1977());
                        arrayList.set(i2, (C5462) c1352.m1977());
                    }
                    i3++;
                    c5034 = c5035;
                    c0338 = c0339;
                }
            }
            C0337 c03310 = c0338;
            C5034 c5036 = c5034;
            if (((C5462) c1352.f3388).m9150() != 0) {
                for (int i5 = 0; i5 < ((C5462) c1352.f3388).m9150(); i5++) {
                    C4630 c4630M9151 = ((C5462) c1352.f3388).m9151(i5);
                    String strM19410 = AbstractC0949.m1948(c4630M9151.m8017(), AbstractC1434.f4918, AbstractC1434.f4915);
                    if (strM19410 != null) {
                        C1209 c1209 = (C1209) c4630M9151.m8829();
                        c1209.m1979();
                        ((C4630) c1209.f3388).m8014(strM19410);
                        c1352.m1979();
                        ((C5462) c1352.f3388).m9143(i5, (C4630) c1209.m1977());
                        arrayList.set(i2, (C5462) c1352.m1977());
                    }
                }
            }
            i2++;
            c4461 = c4462;
            c5034 = c5036;
            c0338 = c03310;
        }
        C0337 c03311 = c0338;
        C4461 c4463 = c4461;
        C5034 c5037 = c5034;
        c1159.m4637();
        c1159.mo6517();
        AbstractC0487.m1090(str);
        SQLiteDatabase sQLiteDatabaseM2463 = c1159.m2463();
        sQLiteDatabaseM2463.beginTransaction();
        try {
            c1159.m4637();
            c1159.mo6517();
            AbstractC0487.m1090(str);
            SQLiteDatabase sQLiteDatabaseM2464 = c1159.m2463();
            sQLiteDatabaseM2464.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM2464.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C5462 c5462 = (C5462) it2.next();
                c1159.m4637();
                c1159.mo6517();
                AbstractC0487.m1090(str);
                AbstractC0487.m1047(c5462);
                if (c5462.m9145()) {
                    int iM9144 = c5462.m9144();
                    Iterator it3 = c5462.m9148().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((C3542) it3.next()).m6333()) {
                                C3610 c3610 = c5371.f17717;
                                C5371.m9020(c3610);
                                c3610.f12022.m9434(C3610.m6440(str), Integer.valueOf(iM9144), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                break;
                            }
                        } else {
                            Iterator it4 = c5462.m9146().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = c5462.m9148().iterator();
                                    while (true) {
                                        C5462 c5463 = c5462;
                                        String str4 = "audience_id";
                                        sQLiteDatabase = sQLiteDatabaseM2463;
                                        String str5 = "app_id";
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            i = iM9144;
                                            for (C4630 c4630 : c5463.m9146()) {
                                                c1159.m4637();
                                                c1159.mo6517();
                                                AbstractC0487.m1090(str);
                                                AbstractC0487.m1047(c4630);
                                                if (c4630.m8017().isEmpty()) {
                                                    C3610 c3611 = c5371.f17717;
                                                    C5371.m9020(c3611);
                                                    c3611.f12022.m9431("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C3610.m6440(str), Integer.valueOf(i), String.valueOf(c4630.m8016() ? Integer.valueOf(c4630.m8015()) : null));
                                                } else {
                                                    byte[] bArrM5755 = c4630.m5754();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put(str4, Integer.valueOf(i));
                                                    contentValues.put("filter_id", c4630.m8016() ? Integer.valueOf(c4630.m8015()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", c4630.m8017());
                                                    contentValues.put("session_scoped", c4630.m8020() ? Boolean.valueOf(c4630.m8018()) : null);
                                                    contentValues.put("data", bArrM5755);
                                                    try {
                                                        if (c1159.m2463().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            C3610 c3612 = c5371.f17717;
                                                            C5371.m9020(c3612);
                                                            c3612.f12020.m9430(C3610.m6440(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        C3610 c3613 = c5371.f17717;
                                                        C5371.m9020(c3613);
                                                        c3613.f12020.m9434(C3610.m6440(str), e, "Error storing property filter. appId");
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            C3542 c3542 = (C3542) it5.next();
                                            c1159.m4637();
                                            c1159.mo6517();
                                            AbstractC0487.m1090(str);
                                            AbstractC0487.m1047(c3542);
                                            if (c3542.m6335().isEmpty()) {
                                                C3610 c3614 = c5371.f17717;
                                                C5371.m9020(c3614);
                                                c3614.f12022.m9431("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C3610.m6440(str), Integer.valueOf(iM9144), String.valueOf(c3542.m6333() ? Integer.valueOf(c3542.m6332()) : null));
                                                it = it2;
                                                i = iM9144;
                                            } else {
                                                it = it2;
                                                byte[] bArrM5756 = c3542.m5754();
                                                i = iM9144;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(i));
                                                contentValues2.put("filter_id", c3542.m6333() ? Integer.valueOf(c3542.m6332()) : null);
                                                contentValues2.put("event_name", c3542.m6335());
                                                contentValues2.put("session_scoped", c3542.m6339() ? Boolean.valueOf(c3542.m6331()) : null);
                                                contentValues2.put("data", bArrM5756);
                                                try {
                                                    if (c1159.m2463().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        C3610 c3615 = c5371.f17717;
                                                        C5371.m9020(c3615);
                                                        c3615.f12020.m9430(C3610.m6440(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    c5462 = c5463;
                                                    sQLiteDatabaseM2463 = sQLiteDatabase;
                                                    it2 = it;
                                                    iM9144 = i;
                                                } catch (SQLiteException e2) {
                                                    C3610 c3616 = c5371.f17717;
                                                    C5371.m9020(c3616);
                                                    c3616.f12020.m9434(C3610.m6440(str), e2, "Error storing event filter. appId");
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        c1159.m4637();
                                        c1159.mo6517();
                                        AbstractC0487.m1090(str);
                                        SQLiteDatabase sQLiteDatabaseM2465 = c1159.m2463();
                                        sQLiteDatabaseM2465.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        sQLiteDatabaseM2465.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        break;
                                    }
                                    sQLiteDatabaseM2463 = sQLiteDatabase;
                                    it2 = it;
                                    break;
                                }
                                if (!((C4630) it4.next()).m8016()) {
                                    C3610 c3617 = c5371.f17717;
                                    C5371.m9020(c3617);
                                    c3617.f12022.m9434(C3610.m6440(str), Integer.valueOf(iM9144), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    C3610 c3618 = c5371.f17717;
                    C5371.m9020(c3618);
                    c3618.f12022.m9430(C3610.m6440(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = sQLiteDatabaseM2463;
            ArrayList arrayList2 = new ArrayList();
            for (C5462 c5464 : arrayList) {
                arrayList2.add(c5464.m9145() ? Integer.valueOf(c5464.m9144()) : null);
            }
            AbstractC0487.m1090(str);
            c1159.m4637();
            c1159.mo6517();
            SQLiteDatabase sQLiteDatabaseM2466 = c1159.m2463();
            try {
                long jM2419 = c1159.m2419("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, c5371.f17715.m1153(str, AbstractC4936.f16295)));
                if (jM2419 > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseM2466.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i6);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i6++;
                    }
                }
            } catch (SQLiteException e3) {
                C3610 c3619 = c5371.f17717;
                C5371.m9020(c3619);
                c3619.f12020.m9434(C3610.m6440(str), e3, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                c03311.m1979();
                c0337 = c03311;
                try {
                    ((C3256) c0337.f3388).m6001();
                    bArrM5754 = ((C3256) c0337.m1977()).m5754();
                } catch (RuntimeException e4) {
                    e = e4;
                    C3610 c36110 = ((C5371) this.f18660).f17717;
                    C5371.m9020(c36110);
                    c36110.f12022.m9434(C3610.m6440(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrM5754 = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                c0337 = c03311;
            }
            C1159 c11510 = c5037.f16670;
            C5034.m8484(c11510);
            C5371 c5372 = (C5371) c11510.f18660;
            AbstractC0487.m1090(str);
            c11510.mo6517();
            c11510.m4637();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrM5754);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (c11510.m2463().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    C3610 c36111 = c5372.f17717;
                    C5371.m9020(c36111);
                    c36111.f12020.m9430(C3610.m6440(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                C3610 c36112 = c5372.f17717;
                C5371.m9020(c36112);
                c36112.f12020.m9434(C3610.m6440(str), e6, "Error storing remote config. appId");
            }
            c0337.m1979();
            ((C3256) c0337.f3388).m5986();
            c4463.put(str, (C3256) c0337.m1977());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseM2463;
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m5631(String str, C3256 c3256) {
        C5371 c5371 = (C5371) this.f18660;
        int iM5985 = c3256.m5985();
        C5089 c5089 = this.f10220;
        if (iM5985 == 0) {
            c5089.m4036(str);
            return;
        }
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3610);
        c3610.f12023.m9430(Integer.valueOf(c3256.m5985()), "EES programs found");
        int i = 0;
        C5808 c5808 = (C5808) c3256.m5987().get(0);
        try {
            C3924 c3924 = new C3924();
            C1489 c1489 = c3924.f13082;
            ((C5008) c1489.f5056).f16580.put("internal.remoteConfig", new CallableC5867(this, str, 2));
            ((C5008) c1489.f5056).f16580.put("internal.appMetadata", new CallableC5867(this, str, i));
            ((C5008) c1489.f5056).f16580.put("internal.logger", new CallableC2229(this));
            c3924.m7023(c5808);
            c5089.m4041(str, c3924);
            C5371.m9020(c3610);
            C5590 c5590 = c3610.f12023;
            c5590.m9434(str, Integer.valueOf(c5808.m9622().m6526()), "EES program loaded for appId, activities");
            for (C2260 c2260 : c5808.m9622().m6527()) {
                C5371.m9020(c3610);
                c5590.m9430(c2260.m4303(), "EES program activity");
            }
        } catch (C0898 unused) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12020.m9430(str, "Failed to load EES program. appId");
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m5632(String str) {
        m4637();
        mo6517();
        AbstractC0487.m1090(str);
        C4461 c4461 = this.f10221;
        if (c4461.get(str) == null) {
            C1159 c1159 = this.f19371.f16670;
            C5034.m8484(c1159);
            C5460 c5460M2440 = c1159.m2440(str);
            C4461 c4462 = this.f10216;
            C4461 c4463 = this.f10222;
            C4461 c4464 = this.f10214;
            C4461 c4465 = this.f10218;
            if (c5460M2440 != null) {
                C0337 c0337 = (C0337) m5628(str, (byte[]) c5460M2440.f18001).m8829();
                m5639(str, c0337);
                c4465.put(str, m5625((C3256) c0337.m1977()));
                c4461.put(str, (C3256) c0337.m1977());
                m5631(str, (C3256) c0337.m1977());
                c4464.put(str, ((C3256) c0337.f3388).m5988());
                c4463.put(str, (String) c5460M2440.f17999);
                c4462.put(str, (String) c5460M2440.f18000);
                return;
            }
            c4465.put(str, null);
            this.f10219.put(str, null);
            this.f10217.put(str, null);
            this.f10224.put(str, null);
            this.f10225.put(str, null);
            c4461.put(str, null);
            c4464.put(str, null);
            c4463.put(str, null);
            c4462.put(str, null);
            this.f10223.put(str, null);
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final boolean m5633(String str, String str2) {
        Boolean bool;
        mo6517();
        m5632(str);
        if ("1".equals(mo3507(str, "measurement.upload.blacklist_internal")) && C1512.m3188(str2)) {
            return true;
        }
        if ("1".equals(mo3507(str, "measurement.upload.blacklist_public")) && C1512.m3196(str2)) {
            return true;
        }
        Map map = (Map) this.f10219.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final int m5634(String str, String str2) {
        Integer num;
        mo6517();
        m5632(str);
        Map map = (Map) this.f10223.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final List m5635(String str) {
        mo6517();
        m5632(str);
        return (List) this.f10225.get(str);
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final boolean m5636(String str) {
        mo6517();
        m5632(str);
        C4461 c4461 = this.f10217;
        if (c4461.get(str) != null) {
            return ((Set) c4461.get(str)).contains("os_version") || ((Set) c4461.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final boolean m5637(String str, String str2) {
        Boolean bool;
        mo6517();
        m5632(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f10224.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: ۦُ */
    public final boolean m5638(String str) {
        mo6517();
        m5632(str);
        C4461 c4461 = this.f10217;
        return c4461.get(str) != null && ((Set) c4461.get(str)).contains("app_instance_id");
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m5639(String str, C0337 c0337) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        C4461 c4461 = new C4461(0);
        C4461 c4462 = new C4461(0);
        C4461 c4463 = new C4461(0);
        Iterator it = Collections.unmodifiableList(((C3256) c0337.f3388).m5996()).iterator();
        while (it.hasNext()) {
            hashSet.add(((C3484) it.next()).m6281());
        }
        C5371 c5371 = (C5371) this.f18660;
        C0515 c0515 = c5371.f17715;
        C3610 c3610 = c5371.f17717;
        C2462 c2462 = AbstractC4936.f16351;
        if (c0515.m1162(null, c2462)) {
            arrayList2.addAll(Collections.unmodifiableList(((C3256) c0337.f3388).m5997()));
        }
        while (i < ((C3256) c0337.f3388).m5994()) {
            C1341 c1341 = (C1341) ((C3256) c0337.f3388).m6000(i).m8829();
            if (c1341.m2855().isEmpty()) {
                C5371.m9020(c3610);
                c3610.f12022.m9432("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strM2855 = c1341.m2855();
                arrayList = arrayList2;
                String strM1948 = AbstractC0949.m1948(c1341.m2855(), AbstractC1605.f5396, AbstractC1605.f5399);
                if (!TextUtils.isEmpty(strM1948)) {
                    c1341.m1979();
                    ((C5485) c1341.f3388).m9184(strM1948);
                    c0337.m1979();
                    ((C3256) c0337.f3388).m5999(i, (C5485) c1341.m1977());
                }
                if (((C5485) c1341.f3388).m9181() && ((C5485) c1341.f3388).m9183()) {
                    c4461.put(strM2855, Boolean.TRUE);
                }
                if (((C5485) c1341.f3388).m9187() && ((C5485) c1341.f3388).m9188()) {
                    c4462.put(c1341.m2855(), Boolean.TRUE);
                }
                if (((C5485) c1341.f3388).m9185()) {
                    if (((C5485) c1341.f3388).m9186() < 2 || ((C5485) c1341.f3388).m9186() > 65535) {
                        C5371.m9020(c3610);
                        c3610.f12022.m9434(c1341.m2855(), Integer.valueOf(((C5485) c1341.f3388).m9186()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c4463.put(c1341.m2855(), Integer.valueOf(((C5485) c1341.f3388).m9186()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f10217.put(str, hashSet);
        if (c5371.f17715.m1162(null, c2462)) {
            this.f10225.put(str, arrayList3);
        }
        this.f10219.put(str, c4461);
        this.f10224.put(str, c4462);
        this.f10223.put(str, c4463);
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final boolean m5640(String str, EnumC4635 enumC4635) {
        mo6517();
        m5632(str);
        C1839 c1839M5627 = m5627(str);
        if (c1839M5627 == null) {
            return false;
        }
        for (C5569 c5569 : c1839M5627.m3616()) {
            if (enumC4635 == m5626(c5569.m9395())) {
                return c5569.m9394() == 2;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final EnumC3687 m5641(String str, EnumC4635 enumC4635) {
        mo6517();
        m5632(str);
        C1839 c1839M5627 = m5627(str);
        if (c1839M5627 != null) {
            for (C5569 c5569 : c1839M5627.m3618()) {
                if (m5626(c5569.m9395()) == enumC4635) {
                    int iM9394 = c5569.m9394() - 1;
                    if (iM9394 == 1) {
                        return EnumC3687.f12303;
                    }
                    if (iM9394 != 2) {
                        break;
                    }
                    return EnumC3687.f12305;
                }
            }
        }
        return EnumC3687.f12307;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final String m5642(String str) {
        mo6517();
        m5632(str);
        return (String) this.f10214.get(str);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m5643(String str) {
        mo6517();
        m5632(str);
        C1839 c1839M5627 = m5627(str);
        if (c1839M5627 == null) {
            return false;
        }
        for (C5569 c5569 : c1839M5627.m3616()) {
            if (c5569.m9395() == 3 && c5569.m9396() == 3) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC2474
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo2428() {
    }
}
