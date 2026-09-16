package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۥٜۖؑؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2035 implements InterfaceC2429, InterfaceC5109, InterfaceC1268 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f6712;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f6713;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f6714;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6715;

    public /* synthetic */ C2035(Object obj, Object obj2, Object obj3, int i) {
        this.f6715 = i;
        this.f6714 = obj;
        this.f6712 = obj2;
        this.f6713 = obj3;
    }

    @Override // p000.InterfaceC1268
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        C1835 c1835;
        EnumC2114 enumC2114;
        int i = this.f6715;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        EnumC2114 enumC2115 = EnumC2114.f6944;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.f6713;
        Object obj3 = this.f6712;
        Object obj4 = this.f6714;
        int i8 = 0;
        switch (i) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C1835 c1836 = (C1835) obj4;
                C3245 c3245 = (C3245) obj3;
                C1273 c1273 = c3245.f10888;
                String str = c3245.f10893;
                C1360 c1360 = (C1360) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = c1836.m3610().compileStatement("PRAGMA page_size").simpleQueryForLong() * c1836.m3610().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C1276 c1276 = c1836.f6101;
                if (jSimpleQueryForLong >= c1276.f4353) {
                    c1836.m3608(1L, enumC2115, str);
                    return -1L;
                }
                Long lM3605 = C1835.m3605(sQLiteDatabase, c1360);
                if (lM3605 != null) {
                    jInsert = lM3605.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c1360.f4676);
                    contentValues.put("priority", Integer.valueOf(AbstractC3020.m5614(c1360.f4674)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c1360.f4675;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = c1276.f4351;
                byte[] bArr2 = c1273.f4345;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c3245.f10894));
                contentValues2.put("uptime_ms", Long.valueOf(c3245.f10889));
                contentValues2.put("payload_encoding", c1273.f4346.f4596);
                contentValues2.put("code", c3245.f10891);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", c3245.f10897);
                contentValues2.put("pseudonymous_id", c3245.f10892);
                contentValues2.put("experiment_ids_clear_blob", c3245.f10896);
                contentValues2.put("experiment_ids_encrypted_blob", c3245.f10895);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i9));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c3245.f10890).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C1835 c1837 = (C1835) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                C1360 c1361 = (C1360) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i7 : 0;
                    C2457 c2457 = new C2457();
                    c2457.f8208 = new HashMap();
                    String string = cursor2.getString(i7);
                    if (string == null) {
                        C0178.m387("Null transportName");
                        return null;
                    }
                    c2457.f8203 = string;
                    c2457.f8210 = Long.valueOf(cursor2.getLong(i6));
                    c2457.f8204 = Long.valueOf(cursor2.getLong(3));
                    if (i11 != 0) {
                        String string2 = cursor2.getString(4);
                        c2457.f8202 = new C1273(string2 == null ? C1835.f6098 : new C1329(string2), cursor2.getBlob(5));
                        c1835 = c1837;
                    } else {
                        String string3 = cursor2.getString(4);
                        C1329 c1329 = string3 == null ? C1835.f6098 : new C1329(string3);
                        Cursor cursorQuery = c1837.m3610().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i12 = 0;
                            int length2 = 0;
                            while (i12 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i12);
                                C1835 c1838 = c1837;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i12++;
                                    cursorQuery = cursor;
                                    c1837 = c1838;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            c1835 = c1837;
                            cursorQuery.close();
                            c2457.f8202 = new C1273(c1329, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c2457.f8206 = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        c2457.f8201 = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        c2457.f8200 = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        c2457.f8207 = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        c2457.f8209 = cursor2.getBlob(11);
                    }
                    arrayList.add(new C5793(j, c1361, c2457.m4587()));
                    c1837 = c1835;
                    i6 = 2;
                    i7 = 1;
                }
                return null;
            default:
                C1835 c1839 = (C1835) obj4;
                HashMap map = (HashMap) obj3;
                C1489 c1489 = (C1489) obj2;
                ArrayList arrayList3 = (ArrayList) c1489.f5057;
                Cursor cursor3 = (Cursor) obj;
                c1839.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i8);
                    int i13 = cursor3.getInt(1);
                    EnumC2114 enumC2116 = EnumC2114.f6949;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            enumC2116 = EnumC2114.f6943;
                        } else if (i13 == 2) {
                            enumC2114 = enumC2115;
                        } else if (i13 == i5) {
                            enumC2116 = EnumC2114.f6942;
                        } else if (i13 == i4) {
                            enumC2116 = EnumC2114.f6945;
                        } else if (i13 == i3) {
                            enumC2116 = EnumC2114.f6947;
                        } else if (i13 == i2) {
                            enumC2116 = EnumC2114.f6948;
                        } else {
                            C3133.m5807("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
                        }
                        enumC2114 = enumC2116;
                    } else {
                        enumC2114 = enumC2116;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new C0582(j2, enumC2114));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i8 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i14 = C4283.f14170;
                    new ArrayList();
                    arrayList3.add(new C4283((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jMo7674 = c1839.f6102.mo7674();
                SQLiteDatabase sQLiteDatabaseM3610 = c1839.m3610();
                sQLiteDatabaseM3610.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseM3610.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        C1882 c1882 = new C1882(cursorRawQuery.getLong(0), jMo7674);
                        cursorRawQuery.close();
                        sQLiteDatabaseM3610.setTransactionSuccessful();
                        sQLiteDatabaseM3610.endTransaction();
                        c1489.f5059 = c1882;
                        c1489.f5058 = new C2190(new C0372(c1839.m3610().compileStatement("PRAGMA page_size").simpleQueryForLong() * c1839.m3610().compileStatement("PRAGMA page_count").simpleQueryForLong(), C1276.f4349.f4353));
                        c1489.f5056 = (String) c1839.f6099.get();
                        return new C2807((C1882) c1489.f5059, Collections.unmodifiableList(arrayList3), (C2190) c1489.f5058, (String) c1489.f5056);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseM3610.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // p000.InterfaceC5109
    /* JADX INFO: renamed from: ۥؗ */
    public Object mo3986() {
        C1934 c1934 = (C1934) this.f6714;
        C1360 c1360 = (C1360) this.f6712;
        C3245 c3245 = (C3245) this.f6713;
        C1835 c1835 = c1934.f6396;
        c1835.getClass();
        EnumC4021 enumC4021 = c1360.f4674;
        String str = c3245.f10893;
        String str2 = c1360.f4676;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + enumC4021 + ", name=" + str + " for destination " + str2);
        }
        ((Long) c1835.m3611(new C2035(c1835, c3245, c1360, 2))).getClass();
        c1934.f6395.m5349(c1360, 1, false);
        return null;
    }

    @Override // p000.InterfaceC2429
    /* JADX INFO: renamed from: ۥّ */
    public Object mo396(C3580 c3580) {
        C2332 c2332 = (C2332) this.f6714;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6712;
        C4228 c4228 = (C4228) this.f6713;
        if (c3580.m6390()) {
            c2332.m4374(c3580.m6388());
        } else if (c3580.m6387() != null) {
            c2332.m4375(c3580.m6387());
        } else if (atomicBoolean.getAndSet(true)) {
            ((C3580) ((C1039) c4228.f14025).f3672).m6397(null);
        }
        return AbstractC5378.m9075(null);
    }
}
