package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: ۥٍّؔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1159 extends AbstractC2474 {

    /* JADX INFO: renamed from: ۥَ */
    public final C2494 f4025;

    /* JADX INFO: renamed from: ۥٓ */
    public final C4159 f4026;

    /* JADX INFO: renamed from: ۥٖ */
    public static final String[] f4017 = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: ۦٗ */
    public static final String[] f4022 = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: ۦۛ */
    public static final String[] f4024 = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: ۥۖ */
    public static final String[] f4019 = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: ۦٕ */
    public static final String[] f4021 = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};

    /* JADX INFO: renamed from: ۥٙ */
    public static final String[] f4018 = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: ۥؖ */
    public static final String[] f4015 = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: ۥؓ */
    public static final String[] f4014 = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: ۥۧ */
    public static final String[] f4020 = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: ۥً */
    public static final String[] f4016 = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: ۦٚ */
    public static final String[] f4023 = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public C1159(C5034 c5034) {
        super(c5034);
        this.f4025 = new C2494(((C5371) this.f18660).f17719);
        C0515 c0515 = ((C5371) this.f18660).f17715;
        this.f4026 = new C4159(this, ((C5371) this.f18660).f17739);
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static final String m2416(List list) {
        return list.isEmpty() ? "" : AbstractC3761.m6629(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    /* JADX INFO: renamed from: ۥۘ */
    public static final void m2417(ContentValues contentValues, Object obj) {
        AbstractC0487.m1090("value");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            C1078.m2272("Invalid value type");
        }
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m2418() {
        mo6517();
        m4637();
        if (m2469()) {
            C5034 c5034 = this.f19371;
            long jM7371 = c5034.f16678.f17370.m7371();
            C5371 c5371 = (C5371) this.f18660;
            c5371.f17719.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM7371) > ((Long) AbstractC4936.f16260.m4592(null)).longValue()) {
                c5034.f16678.f17370.m7370(jElapsedRealtime);
                mo6517();
                m4637();
                if (m2469()) {
                    SQLiteDatabase sQLiteDatabaseM2463 = m2463();
                    c5371.f17719.getClass();
                    int iDelete = sQLiteDatabaseM2463.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) AbstractC4936.f16300.m4592(null)).longValue())});
                    if (iDelete > 0) {
                        C3610 c3610 = c5371.f17717;
                        C5371.m9020(c3610);
                        c3610.f12023.m9430(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final long m2419(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m2463().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                C3610 c3610 = ((C5371) this.f18660).f17717;
                C5371.m9020(c3610);
                c3610.f12020.m9434(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥؕ */
    public final boolean m2420(C1284 c1284) {
        C5371 c5371 = (C5371) this.f18660;
        String str = c1284.f4386;
        mo6517();
        m4637();
        String str2 = c1284.f4387;
        String str3 = c1284.f4384;
        if (m2451(str2, str3) == null) {
            if (C1512.m3196(str3)) {
                if (m2419("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(c5371.f17715.m1153(str2, AbstractC4936.f16266), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jM2419 = m2419("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                C0515 c0515 = c5371.f17715;
                if (jM2419 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(c1284.f4388));
        m2417(contentValues, c1284.f4385);
        try {
            if (m2463().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9430(C3610.m6440(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12020.m9434(C3610.m6440(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m2421(long j) {
        mo6517();
        m4637();
        try {
            if (m2463().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9430(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۥؙ */
    public final void m2422(String str, C5211 c5211) {
        AbstractC0487.m1047(str);
        AbstractC0487.m1047(c5211);
        mo6517();
        m4637();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c5211.m8817());
        contentValues.put("consent_source", Integer.valueOf(c5211.f17219));
        m2430(contentValues);
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m2423(Long l) {
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        m4637();
        if (m2469()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m2419(sb.toString(), null) > 0) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12022.m9432("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM2463 = m2463();
                c5371.f17719.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseM2463.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12020.m9430(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: ۥٌ */
    public final List m2424(String str, String str2, String str3) {
        AbstractC0487.m1090(str);
        mo6517();
        m4637();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m2438(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX INFO: renamed from: ۥٍ */
    public final List m2425(String str) {
        String str2;
        SQLiteException sQLiteException;
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1090(str);
        mo6517();
        m4637();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                C0515 c0515 = c5371.f17715;
                cursorQuery = m2463().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j = cursorQuery.getLong(2);
                        Object objM2462 = m2462(cursorQuery, 3);
                        if (objM2462 == null) {
                            try {
                                C3610 c3610 = c5371.f17717;
                                C5371.m9020(c3610);
                                c3610.f12020.m9430(C3610.m6440(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                C3610 c3611 = c5371.f17717;
                                C5371.m9020(c3611);
                                c3611.f12020.m9434(C3610.m6440(str2), sQLiteException, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new C1284(str2, str3, string, j, objM2462));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            C3610 c3612 = c5371.f17717;
                            C5371.m9020(c3612);
                            c3612.f12020.m9434(C3610.m6440(str2), sQLiteException, "Error querying user properties. appId");
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ef A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011b A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:66:0x018c->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: ۥِ */
    public final void m2426(String str, long j, long j2, C2739 c2739) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r3;
        long jM2468;
        long j3;
        String[] strArr2;
        String str3;
        long j4;
        C4102 c4102;
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        m4637();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM2463 = m2463();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                if (IsEmpty != 0) {
                    String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                    str4 = j2 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(str4.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str4);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseM2463.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r3 = string;
                                cursorRawQuery = sQLiteDatabaseM2463.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        C2523 c2523 = (C2523) ((C4192) C3117.m5718(C2523.m4663(), cursorRawQuery.getBlob(0))).m1977();
                                        if (cursorRawQuery.moveToNext()) {
                                            C3610 c3610 = c5371.f17717;
                                            C5371.m9020(c3610);
                                            c3610.f12022.m9430(C3610.m6440(r3), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        c2739.f9070 = c2523;
                                        jM2468 = m2468(-1L, "select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2});
                                        if (j2 == -1) {
                                            if (jM2468 != -1) {
                                                j3 = -1;
                                            } else {
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                                strArr2 = new String[]{r3, string2};
                                            }
                                            cursorRawQuery = sQLiteDatabaseM2463.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j4 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j5 = cursorRawQuery.getLong(4);
                                                    try {
                                                        c4102 = (C4102) C3117.m5718(C5580.m9403(), blob);
                                                        c4102.m7290(cursorRawQuery.getString(1));
                                                        long j6 = cursorRawQuery.getLong(2);
                                                        c4102.m1979();
                                                        ((C5580) c4102.f3388).m9429(j6);
                                                        c4102.m1979();
                                                        ((C5580) c4102.f3388).m9409(j5);
                                                        if (!c2739.m5091(j4, (C5580) c4102.m1977())) {
                                                            break;
                                                        }
                                                    } catch (IOException e) {
                                                        C3610 c3611 = c5371.f17717;
                                                        C5371.m9020(c3611);
                                                        c3611.f12020.m9434(C3610.m6440(r3), e, "Data loss. Failed to merge raw event. appId");
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                C3610 c3612 = c5371.f17717;
                                                C5371.m9020(c3612);
                                                c3612.f12022.m9430(C3610.m6440(r3), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j3 = j2;
                                        }
                                        if (j3 == -1 && jM2468 != -1) {
                                            jM2468 = Math.min(j3, jM2468);
                                        } else if (j3 != -1) {
                                            jM2468 = j3;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(jM2468)};
                                        cursorRawQuery = sQLiteDatabaseM2463.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j4 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j7 = cursorRawQuery.getLong(4);
                                                c4102 = (C4102) C3117.m5718(C5580.m9403(), blob2);
                                                c4102.m7290(cursorRawQuery.getString(1));
                                                long j8 = cursorRawQuery.getLong(2);
                                                c4102.m1979();
                                                ((C5580) c4102.f3388).m9429(j8);
                                                c4102.m1979();
                                                ((C5580) c4102.f3388).m9409(j7);
                                                if (!c2739.m5091(j4, (C5580) c4102.m1977())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            C3610 c3613 = c5371.f17717;
                                            C5371.m9020(c3613);
                                            c3613.f12022.m9430(C3610.m6440(r3), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e2) {
                                        C3610 c3614 = c5371.f17717;
                                        C5371.m9020(c3614);
                                        c3614.f12020.m9434(C3610.m6440(r3), e2, "Data loss. Failed to merge raw event metadata. appId");
                                    }
                                } else {
                                    C3610 c3615 = c5371.f17717;
                                    C5371.m9020(c3615);
                                    c3615.f12020.m9430(C3610.m6440(r3), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                C3610 c3616 = c5371.f17717;
                                C5371.m9020(c3616);
                                c3616.f12020.m9434(C3610.m6440(string), e, "Data loss. Error selecting raw event. appId");
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j2 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j2)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j2 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str4);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseM2463.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r3 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseM2463.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                C3610 c3617 = c5371.f17717;
                                C5371.m9020(c3617);
                                c3617.f12020.m9430(C3610.m6440(r3), "Raw event metadata record is missing. appId");
                            } else {
                                C2523 c2524 = (C2523) ((C4192) C3117.m5718(C2523.m4663(), cursorRawQuery.getBlob(0))).m1977();
                                if (cursorRawQuery.moveToNext()) {
                                    C3610 c3618 = c5371.f17717;
                                    C5371.m9020(c3618);
                                    c3618.f12022.m9430(C3610.m6440(r3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                c2739.f9070 = c2524;
                                jM2468 = m2468(-1L, "select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2});
                                if (j2 == -1) {
                                    if (jM2468 != -1) {
                                        j3 = -1;
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{r3, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseM2463.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j4 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j9 = cursorRawQuery.getLong(4);
                                            c4102 = (C4102) C3117.m5718(C5580.m9403(), blob3);
                                            c4102.m7290(cursorRawQuery.getString(1));
                                            long j10 = cursorRawQuery.getLong(2);
                                            c4102.m1979();
                                            ((C5580) c4102.f3388).m9429(j10);
                                            c4102.m1979();
                                            ((C5580) c4102.f3388).m9409(j9);
                                            if (!c2739.m5091(j4, (C5580) c4102.m1977())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        C3610 c3619 = c5371.f17717;
                                        C5371.m9020(c3619);
                                        c3619.f12022.m9430(C3610.m6440(r3), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j3 = j2;
                                }
                                if (j3 == -1) {
                                    if (j3 != -1) {
                                        jM2468 = j3;
                                    }
                                } else if (j3 != -1) {
                                    jM2468 = j3;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r3, string2, String.valueOf(jM2468)};
                                cursorRawQuery = sQLiteDatabaseM2463.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j4 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j11 = cursorRawQuery.getLong(4);
                                        c4102 = (C4102) C3117.m5718(C5580.m9403(), blob4);
                                        c4102.m7290(cursorRawQuery.getString(1));
                                        long j12 = cursorRawQuery.getLong(2);
                                        c4102.m1979();
                                        ((C5580) c4102.f3388).m9429(j12);
                                        c4102.m1979();
                                        ((C5580) c4102.f3388).m9409(j11);
                                        if (!c2739.m5091(j4, (C5580) c4102.m1977())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    C3610 c36110 = c5371.f17717;
                                    C5371.m9020(c36110);
                                    c36110.f12022.m9430(C3610.m6440(r3), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = IsEmpty;
                        C3610 c36111 = c5371.f17717;
                        C5371.m9020(c36111);
                        c36111.f12020.m9434(C3610.m6440(string), e, "Data loss. Error selecting raw event. appId");
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
            }
        } catch (SQLiteException e6) {
            e = e6;
            IsEmpty = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX INFO: renamed from: ۥٕ */
    public final long m2427(String str) {
        long j;
        ContentValues contentValues;
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1090(str);
        AbstractC0487.m1090("first_open_count");
        mo6517();
        m4637();
        SQLiteDatabase sQLiteDatabaseM2463 = m2463();
        sQLiteDatabaseM2463.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jM2468 = m2468(-1L, sb.toString(), new String[]{str});
                if (jM2468 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM2463.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        C3610 c3610 = c5371.f17717;
                        C5371.m9020(c3610);
                        c3610.f12020.m9434(C3610.m6440(str), "first_open_count", "Failed to insert column (got -1). appId");
                    } else {
                        jM2468 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jM2468));
                            if (sQLiteDatabaseM2463.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                C3610 c3611 = c5371.f17717;
                                C5371.m9020(c3611);
                                c3611.f12020.m9434(C3610.m6440(str), "first_open_count", "Failed to update column (got 0). appId");
                            } else {
                                sQLiteDatabaseM2463.setTransactionSuccessful();
                                j = jM2468;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j2 = jM2468;
                            C3610 c3612 = c5371.f17717;
                            C5371.m9020(c3612);
                            c3612.f12020.m9431("Error inserting column. appId", C3610.m6440(str), "first_open_count", e);
                            j = j2;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jM2468));
                    if (sQLiteDatabaseM2463.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        C3610 c3613 = c5371.f17717;
                        C5371.m9020(c3613);
                        c3613.f12020.m9434(C3610.m6440(str), "first_open_count", "Failed to update column (got 0). appId");
                    } else {
                        sQLiteDatabaseM2463.setTransactionSuccessful();
                        j = jM2468;
                    }
                }
            } finally {
                sQLiteDatabaseM2463.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        return j;
    }

    @Override // p000.AbstractC2474
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo2428() {
        C5371 c5371 = (C5371) this.f18660;
        if (c5371.f17715.m1162(null, AbstractC4936.f19565)) {
            C3644 c3644 = c5371.f17733;
            C5371.m9020(c3644);
            c3644.m6515(new RunnableC3365(17, this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0407  */
    /* JADX INFO: renamed from: ۥٗ */
    public final C2976 m2429(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1090(str);
        mo6517();
        m4637();
        Cursor cursor = null;
        try {
            cursorQuery = m2463().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        C5034 c5034 = this.f19371;
                        C2976 c2976 = new C2976(c5034.f16665, str);
                        C5371 c5372 = c2976.f9988;
                        C5211 c5211M8492 = c5034.m8492(str);
                        EnumC4635 enumC4635 = EnumC4635.f15299;
                        if (c5211M8492.m8815(enumC4635)) {
                            c2976.m5555(cursorQuery.getString(0));
                        }
                        boolean z = true;
                        c2976.m5549(cursorQuery.getString(1));
                        if (c5034.m8492(str).m8815(EnumC4635.f15302)) {
                            c2976.m5554(cursorQuery.getString(2));
                        }
                        c2976.m5533(cursorQuery.getLong(3));
                        c2976.m5528(cursorQuery.getLong(4));
                        c2976.m5569(cursorQuery.getLong(5));
                        c2976.m5539(cursorQuery.getString(6));
                        c2976.m5552(cursorQuery.getString(7));
                        c2976.m5542(cursorQuery.getLong(8));
                        c2976.m5547(cursorQuery.getLong(9));
                        c2976.m5551(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        c2976.m5564(cursorQuery.getLong(11));
                        c2976.m5559(cursorQuery.getLong(12));
                        c2976.m5565(cursorQuery.getLong(13));
                        c2976.m5556(cursorQuery.getLong(14));
                        c2976.m5534(cursorQuery.getLong(15));
                        c2976.m5566(cursorQuery.getLong(16));
                        c2976.m5548(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        c2976.m5561(cursorQuery.getString(18));
                        c2976.m5567(cursorQuery.getLong(19));
                        c2976.m5557(cursorQuery.getLong(20));
                        c2976.m5543(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        C3644 c3644 = c5372.f17733;
                        C5371.m9020(c3644);
                        c3644.mo6517();
                        c2976.f9989 |= c2976.f10011 != z2;
                        c2976.f10011 = z2;
                        c2976.m5530(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            c2976.m5540(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (c5034.m8492(str).m8815(enumC4635)) {
                            String string2 = cursorQuery.getString(28);
                            C3644 c3645 = c5372.f17733;
                            C5371.m9020(c3645);
                            c3645.mo6517();
                            c2976.f9989 |= !Objects.equals(c2976.f9979, string2);
                            c2976.f9979 = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        C3644 c3646 = c5372.f17733;
                        C5371.m9020(c3646);
                        c3646.mo6517();
                        c2976.f9989 |= c2976.f10003 != z3;
                        c2976.f10003 = z3;
                        c2976.m5536(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        C3644 c3647 = c5372.f17733;
                        C5371.m9020(c3647);
                        c3647.mo6517();
                        c2976.f9989 |= c2976.f9972 != string3;
                        c2976.f9972 = string3;
                        c2976.m5527(cursorQuery.getLong(30));
                        c2976.m5550(cursorQuery.getLong(31));
                        C0237.m498();
                        if (c5371.f17715.m1162(str, AbstractC4936.f16284)) {
                            int i = cursorQuery.getInt(32);
                            C3644 c3648 = c5372.f17733;
                            C5371.m9020(c3648);
                            c3648.mo6517();
                            c2976.f9989 |= c2976.f10001 != i;
                            c2976.f10001 = i;
                            c2976.m5531(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        C3644 c3649 = c5372.f17733;
                        C5371.m9020(c3649);
                        c3649.mo6517();
                        c2976.f9989 |= c2976.f9981 != z4;
                        c2976.f9981 = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        C3644 c36410 = c5372.f17733;
                        C5371.m9020(c36410);
                        c36410.mo6517();
                        c2976.f9989 |= !Objects.equals(c2976.f9976, boolValueOf);
                        c2976.f9976 = boolValueOf;
                        c2976.m5570(cursorQuery.getInt(37));
                        c2976.m5535(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            AbstractC0487.m1047(string);
                        }
                        C3644 c36411 = c5372.f17733;
                        C5371.m9020(c36411);
                        c36411.mo6517();
                        c2976.f9989 |= c2976.f9996 != string;
                        c2976.f9996 = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            C3644 c36412 = c5372.f17733;
                            C5371.m9020(c36412);
                            c36412.mo6517();
                            c2976.f9989 |= !Objects.equals(c2976.f9970, lValueOf);
                            c2976.f9970 = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            C3644 c36413 = c5372.f17733;
                            C5371.m9020(c36413);
                            c36413.mo6517();
                            c2976.f9989 |= !Objects.equals(c2976.f9968, lValueOf2);
                            c2976.f9968 = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        C3644 c36414 = c5372.f17733;
                        C5371.m9020(c36414);
                        c36414.mo6517();
                        c2976.f9989 |= c2976.f9994 != blob;
                        c2976.f9994 = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i2 = cursorQuery.getInt(44);
                            C3644 c36415 = c5372.f17733;
                            C5371.m9020(c36415);
                            c36415.mo6517();
                            boolean z5 = c2976.f9989;
                            if (c2976.f9990 == i2) {
                                z = false;
                            }
                            c2976.f9989 = z | z5;
                            c2976.f9990 = i2;
                        }
                        if (c5371.f17715.m1162(str, AbstractC4936.f19567) && !cursorQuery.isNull(45)) {
                            c2976.m5562(cursorQuery.getLong(45));
                        }
                        C3644 c36416 = c5372.f17733;
                        C5371.m9020(c36416);
                        c36416.mo6517();
                        c2976.f9989 = false;
                        if (cursorQuery.moveToNext()) {
                            C3610 c3610 = c5371.f17717;
                            C5371.m9020(c3610);
                            c3610.f12020.m9430(C3610.m6440(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return c2976;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12020.m9434(C3610.m6440(str), e, "Error querying app. appId");
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final void m2430(ContentValues contentValues) {
        C5371 c5371 = (C5371) this.f18660;
        try {
            SQLiteDatabase sQLiteDatabaseM2463 = m2463();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12026.m9430(C3610.m6440("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseM2463.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseM2463.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12020.m9434(C3610.m6440("consent_settings"), C3610.m6440("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            C3610 c3612 = c5371.f17717;
            C5371.m9020(c3612);
            c3612.f12020.m9431("Error storing into table. key", C3610.m6440("consent_settings"), C3610.m6440("app_id"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX INFO: renamed from: ۥٙ */
    public final String m2431() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseM2463 = m2463();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM2463.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    C3610 c3610 = ((C5371) this.f18660).f17717;
                    C5371.m9020(c3610);
                    c3610.f12020.m9430(e, "Database error getting next bundle app id");
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r1 = sQLiteDatabaseM2463;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX INFO: renamed from: ۥٚ */
    public final List m2432(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        String str5;
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1090(str);
        mo6517();
        m4637();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            C0515 c0515 = c5371.f17715;
            C3610 c3610 = c5371.f17717;
            Cursor cursorQuery = m2463().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    C5371.m9020(c3610);
                                    c3610.f12020.m9430(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                Object objM2462 = m2462(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objM2462 == null) {
                                    try {
                                        C5371.m9020(c3610);
                                        c3610.f12020.m9431("(2)Read invalid user property value, ignoring it", C3610.m6440(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            C3610 c3611 = c5371.f17717;
                                            C5371.m9020(c3611);
                                            c3611.f12020.m9431("(2)Error querying user properties", C3610.m6440(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new C1284(str, str5, string2, j, objM2462));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    C3610 c3612 = c5371.f17717;
                                    C5371.m9020(c3612);
                                    c3612.f12020.m9431("(2)Error querying user properties", C3610.m6440(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                C3610 c3613 = c5371.f17717;
                                C5371.m9020(c3613);
                                c3613.f12020.m9431("(2)Error querying user properties", C3610.m6440(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX INFO: renamed from: ۥٛ */
    public final C3047 m2433(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1090(str2);
        AbstractC0487.m1090(str3);
        mo6517();
        m4637();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = m2463().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = 0;
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j4 = cursorQuery.getLong(8);
                        }
                        C3047 c3047 = new C3047(str2, str3, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            C3610 c3610 = c5371.f17717;
                            C5371.m9020(c3610);
                            c3610.f12020.m9430(C3610.m6440(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return c3047;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    C3610 c3611 = c5371.f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9431("Error querying events. appId", C3610.m6440(str2), c5371.f17731.m7146(str3), e);
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r3 = arrayList;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final C1212 m2434(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        EnumC1962 enumC1962;
        C5371 c5371 = (C5371) this.f18660;
        if (TextUtils.isEmpty(str2)) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12015.m9432("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            C0231 c0231 = (C0231) C3117.m5718(C2533.m4748(), bArr);
            EnumC1962[] enumC1962ArrValues = EnumC1962.values();
            int length = enumC1962ArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    enumC1962 = EnumC1962.f6470;
                    break;
                }
                enumC1962 = enumC1962ArrValues[i3];
                if (enumC1962.f6473 == i) {
                    break;
                }
                i3++;
            }
            if (enumC1962 != EnumC1962.f6467 && enumC1962 != EnumC1962.f6469 && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((C2533) c0231.f3388).m4752()).iterator();
                while (it.hasNext()) {
                    C4192 c4192 = (C4192) ((C2523) it.next()).m8829();
                    c4192.m1979();
                    ((C2523) c4192.f3388).m4743(i2);
                    arrayList.add((C2523) c4192.m1977());
                }
                c0231.m1979();
                ((C2533) c0231.f3388).m4761();
                c0231.m1979();
                ((C2533) c0231.f3388).m4750(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        C3610 c3611 = c5371.f17717;
                        C5371.m9020(c3611);
                        c3611.f12020.m9430(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new C1212(j, (C2533) c0231.m1977(), str2, map, enumC1962, j2, j3, j4, i2);
        } catch (IOException e) {
            C3610 c3612 = c5371.f17717;
            C5371.m9020(c3612);
            c3612.f12020.m9434(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    /* JADX INFO: renamed from: ۥٞ */
    public final void m2435(String str) throws Throwable {
        boolean z;
        C3047 c3047M2433;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        C3047 c3047M2434 = m2433("events", str, "_f");
        C3047 c3047M2435 = m2433("events", str, "_v");
        m2450("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = m2463().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (c3047M2433 = m2433("events_snapshot", str, string)) != null) {
                            m2443("events", c3047M2433);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            C3610 c3610 = ((C5371) this.f18660).f17717;
                            C5371.m9020(c3610);
                            c3610.f12020.m9434(C3610.m6440(str), e, "Error querying snapshot. appId");
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && c3047M2434 != null) {
                                m2443("events", c3047M2434);
                            } else if (!z && c3047M2435 != null) {
                                m2443("events", c3047M2435);
                            }
                            m2450("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                m2443("events", c3047M2435);
                            }
                        } else if (!z) {
                            m2443("events", c3047M2435);
                        }
                        m2450("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && c3047M2434 != null) {
                    m2443("events", c3047M2434);
                } else if (!z && c3047M2435 != null) {
                    m2443("events", c3047M2435);
                }
            } else {
                cursorQuery.close();
                if (c3047M2434 != null) {
                    m2443("events", c3047M2434);
                } else if (c3047M2435 != null) {
                    m2443("events", c3047M2435);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        m2450("events_snapshot", str);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m2436(String str) {
        EnumC1962[] enumC1962Arr = {EnumC1962.f6467};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC1962Arr[0].f6473));
        String strM2416 = m2416(arrayList);
        String strM2439 = m2439();
        StringBuilder sb = new StringBuilder(strM2416.length() + 61 + strM2439.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strM2416);
        sb.append(" AND NOT ");
        sb.append(strM2439);
        return m2419(sb.toString(), new String[]{str}) != 0;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final boolean m2437(String str, String str2) {
        return m2419("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX INFO: renamed from: ۥۚ */
    public final List m2438(String str, String[] strArr) {
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        m4637();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                C0515 c0515 = c5371.f17715;
                cursorQuery = m2463().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            C3610 c3610 = c5371.f17717;
                            C5371.m9020(c3610);
                            c3610.f12020.m9430(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objM2462 = m2462(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        C3117 c3117 = this.f19371.f16692;
                        C5034.m8484(c3117);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<C2679> creator = C2679.CREATOR;
                        C2679 c2679 = (C2679) c3117.m5722(blob, creator);
                        long j2 = cursorQuery.getLong(8);
                        C5034.m8484(c3117);
                        C2679 c26710 = (C2679) c3117.m5722(cursorQuery.getBlob(9), creator);
                        long j3 = cursorQuery.getLong(10);
                        long j4 = cursorQuery.getLong(11);
                        C5034.m8484(c3117);
                        arrayList.add(new C1513(string, string2, new C1477(j3, objM2462, string3, string2), j2, z, string4, c2679, j, c26710, j4, (C2679) c3117.m5722(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12020.m9430(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final String m2439() {
        ((C5371) this.f18660).f17719.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) AbstractC4936.f16308.m4592(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String str2 = "(upload_type != 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) AbstractC4936.f16300.m4592(null)).longValue() + ")";
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb.append("(");
        sb.append(str);
        sb.append(" OR ");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: ۥ۠ */
    public final C5460 m2440(String str) {
        Throwable th;
        Cursor cursorQuery;
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1090(str);
        mo6517();
        m4637();
        ?? r2 = 0;
        try {
            try {
                cursorQuery = m2463().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            C3610 c3610 = c5371.f17717;
                            C5371.m9020(c3610);
                            c3610.f12020.m9430(C3610.m6440(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            C5460 c5460 = new C5460(blob, string, string2, 11);
                            cursorQuery.close();
                            return c5460;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    C3610 c3611 = c5371.f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9434(C3610.m6440(str), e, "Error querying remote config. appId");
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r2 = this;
            if (r2 != 0) {
                throw th;
            }
            r2.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۡ */
    public final List m2441(String str) {
        List list;
        String string;
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        m4637();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseM2463 = m2463();
            sQLiteDatabaseM2463.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseM2463.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                AbstractC0487.m1047(string);
                            }
                            if (string2 == null) {
                                C3610 c3610 = c5371.f17717;
                                C5371.m9020(c3610);
                                c3610.f12020.m9430(C3610.m6440(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursorQuery.getLong(2);
                                C4547 c4547M5472 = C2905.m5472();
                                c4547M5472.m1979();
                                ((C2905) c4547M5472.f3388).m5473(string2);
                                c4547M5472.m1979();
                                ((C2905) c4547M5472.f3388).m5476(j);
                                c4547M5472.m1979();
                                ((C2905) c4547M5472.f3388).m5475(string);
                                if (zIsEmpty) {
                                    c4547M5472.m1979();
                                    ((C2905) c4547M5472.f3388).m5474();
                                }
                                arrayList.add((C2905) c4547M5472.m1977());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseM2463.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseM2463.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseM2463.setTransactionSuccessful();
                    }
                } catch (SQLiteException e) {
                    C3610 c3611 = c5371.f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9434(C3610.m6440(str), e, "Error querying or deleting diagnostic signals. appId");
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    list = arrayList;
                    cursorQuery.close();
                }
                list = arrayList;
                sQLiteDatabaseM2463.endTransaction();
                return list;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseM2463.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            C3610 c3612 = c5371.f17717;
            C5371.m9020(c3612);
            c3612.f12020.m9434(C3610.m6440(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: ۥۢ */
    public final void m2442() {
        m4637();
        m2463().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final void m2443(String str, C3047 c3047) {
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1047(c3047);
        mo6517();
        m4637();
        ContentValues contentValues = new ContentValues();
        String str2 = c3047.f10246;
        contentValues.put("app_id", str2);
        contentValues.put("name", c3047.f10244);
        contentValues.put("lifetime_count", Long.valueOf(c3047.f10241));
        contentValues.put("current_bundle_count", Long.valueOf(c3047.f10247));
        contentValues.put("last_fire_timestamp", Long.valueOf(c3047.f10243));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c3047.f10251));
        contentValues.put("last_bundled_day", c3047.f10245);
        contentValues.put("last_sampled_complex_event_id", c3047.f10249);
        contentValues.put("last_sampling_rate", c3047.f10248);
        contentValues.put("current_session_count", Long.valueOf(c3047.f10242));
        Boolean bool = c3047.f10250;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m2463().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12020.m9430(C3610.m6440(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12020.m9434(C3610.m6440(str2), e, "Error storing event aggregates. appId");
        }
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final C5211 m2444(String str) {
        AbstractC0487.m1047(str);
        mo6517();
        m4637();
        return C5211.m8806(100, m2471("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final void m2445(String str, Long l, long j, C5580 c5580) {
        mo6517();
        m4637();
        AbstractC0487.m1047(c5580);
        AbstractC0487.m1090(str);
        C5371 c5371 = (C5371) this.f18660;
        byte[] bArrM5754 = c5580.m5754();
        C3610 c3610 = c5371.f17717;
        C3610 c3611 = c5371.f17717;
        C5371.m9020(c3610);
        c3610.f12023.m9434(c5371.f17731.m7146(str), Integer.valueOf(bArrM5754.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrM5754);
        try {
            if (m2463().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                C5371.m9020(c3611);
                c3611.f12020.m9430(C3610.m6440(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            C5371.m9020(c3611);
            c3611.f12020.m9434(C3610.m6440(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m2446(ArrayList arrayList) {
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        m4637();
        AbstractC0487.m1047(arrayList);
        if (arrayList.size() == 0) {
            C1078.m2272("Given Integer is zero");
            return;
        }
        if (m2469()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strM6622 = AbstractC3761.m6622(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (m2419(AbstractC3761.m6622(new StringBuilder(strM6622.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM6622, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12022.m9432("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM2463 = m2463();
                StringBuilder sb = new StringBuilder(strM6622.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strM6622);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM2463.execSQL(sb.toString());
            } catch (SQLiteException e) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12020.m9430(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: ۥۨ */
    public final C3047 m2447(String str, C5580 c5580, String str2) {
        C3047 c3047M2433 = m2433("events", str, c5580.m9415());
        if (c3047M2433 != null) {
            long j = c3047M2433.f10242 + 1;
            long j2 = c3047M2433.f10247 + 1;
            return new C3047(c3047M2433.f10246, c3047M2433.f10244, c3047M2433.f10241 + 1, j2, j, c3047M2433.f10243, c3047M2433.f10251, c3047M2433.f10245, c3047M2433.f10249, c3047M2433.f10248, c3047M2433.f10250);
        }
        C5371 c5371 = (C5371) this.f18660;
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3610);
        c3610.f12022.m9434(C3610.m6440(str), c5371.f17731.m7146(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new C3047(str, c5580.m9415(), 1L, 1L, 1L, c5580.m9413(), 0L, null, null, null, null);
    }

    /* JADX INFO: renamed from: ۦ */
    public final void m2448() {
        m4637();
        m2463().endTransaction();
    }

    /* JADX INFO: renamed from: ۦؐ */
    public final C0403 m2449(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1090(str);
        mo6517();
        m4637();
        String[] strArr = {str};
        C0403 c0403 = new C0403();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM2463 = m2463();
                cursorQuery = sQLiteDatabaseM2463.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        c0403.f1478 = cursorQuery.getLong(1);
                        c0403.f1479 = cursorQuery.getLong(2);
                        c0403.f1475 = cursorQuery.getLong(3);
                        c0403.f1480 = cursorQuery.getLong(4);
                        c0403.f1476 = cursorQuery.getLong(5);
                        c0403.f1477 = cursorQuery.getLong(6);
                        c0403.f1481 = cursorQuery.getLong(7);
                    }
                    if (z) {
                        c0403.f1478 += j2;
                    }
                    if (z2) {
                        c0403.f1479 += j2;
                    }
                    if (z3) {
                        c0403.f1475 += j2;
                    }
                    if (z4) {
                        c0403.f1480 += j2;
                    }
                    if (z5) {
                        c0403.f1476 += j2;
                    }
                    if (z6) {
                        c0403.f1477 += j2;
                    }
                    if (z7) {
                        c0403.f1481 += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(c0403.f1479));
                    contentValues.put("daily_events_count", Long.valueOf(c0403.f1478));
                    contentValues.put("daily_conversions_count", Long.valueOf(c0403.f1475));
                    contentValues.put("daily_error_events_count", Long.valueOf(c0403.f1480));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c0403.f1476));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c0403.f1477));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c0403.f1481));
                    sQLiteDatabaseM2463.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    C3610 c3610 = c5371.f17717;
                    C5371.m9020(c3610);
                    c3610.f12022.m9430(C3610.m6440(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12020.m9434(C3610.m6440(str), e, "Error updating daily counts. appId");
            }
            return c0403;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public final void m2450(String str, String str2) {
        AbstractC0487.m1090(str2);
        mo6517();
        m4637();
        try {
            m2463().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9434(C3610.m6440(str2), e, "Error deleting snapshot. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۦؓ */
    public final C1284 m2451(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1090(str);
        AbstractC0487.m1090(str2);
        mo6517();
        m4637();
        Cursor cursor = null;
        try {
            cursorQuery = m2463().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objM2462 = m2462(cursorQuery, 1);
                        if (objM2462 != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                C1284 c1284 = new C1284(str3, cursorQuery.getString(2), str4, j, objM2462);
                                if (cursorQuery.moveToNext()) {
                                    C3610 c3610 = c5371.f17717;
                                    C5371.m9020(c3610);
                                    c3610.f12020.m9430(C3610.m6440(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return c1284;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        C3610 c3611 = c5371.f17717;
                        C5371.m9020(c3611);
                        c3611.f12020.m9431("Error querying user property. appId", C3610.m6440(str3), c5371.f17731.m7142(str4), sQLiteException);
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦؔ */
    public final void m2452() {
        m4637();
        m2463().beginTransaction();
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final long m2453(String str) {
        AbstractC0487.m1090(str);
        return m2468(0L, "select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str});
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[LOOP:2: B:51:0x00fe->B:126:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX INFO: renamed from: ۦؗ */
    public final void m2454(String str, Long l, String str2, Bundle bundle) {
        C3610 c3610;
        Bundle bundle2;
        long j;
        String str3;
        ContentValues contentValues;
        C3610 c3611;
        C2523 c2523;
        Iterator it;
        C1159 c1159 = this;
        String str4 = str;
        Object obj = c1159.f18660;
        C5371 c5371 = (C5371) obj;
        AbstractC0487.m1047(bundle);
        c1159.mo6517();
        c1159.m4637();
        C2394 c2394 = l != null ? new C2394(c1159, str4, l.longValue()) : new C2394(c1159, str4);
        List<C1578> listM4513 = c2394.m4513();
        while (!listM4513.isEmpty()) {
            for (C1578 c1578 : listM4513) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        C2523 c2524 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = c1159.m2463().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(c1578.f5325)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                c2523 = (C2523) ((C4192) C3117.m5718(C2523.m4663(), cursorQuery.getBlob(0))).m1977();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        C3610 c3612 = c5371.f17717;
                                                        C5371.m9020(c3612);
                                                        c3612.f12022.m9430(C3610.m6440(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor = cursorQuery;
                                                    C3610 c3613 = c5371.f17717;
                                                    C5371.m9020(c3613);
                                                    c3613.f12020.m9434(C3610.m6440(str4), e, "Data loss. Error selecting raw event. appId");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                c2524 = c2523;
                                            } catch (IOException e2) {
                                                C3610 c3614 = c5371.f17717;
                                                C5371.m9020(c3614);
                                                c3614.f12020.m9434(C3610.m6440(str4), e2, "Data loss. Failed to merge raw event metadata. appId");
                                                cursorQuery.close();
                                            }
                                            if (c2524 != null) {
                                                it = c2524.m9816().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((C3426) it.next()).m6206().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            C3610 c3615 = c5371.f17717;
                                            C5371.m9020(c3615);
                                            c3615.f12020.m9430(C3610.m6440(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursorQuery;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    c2523 = null;
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                c2523 = null;
                            }
                            if (c2524 != null) {
                                it = c2524.m9816().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((C3426) it.next()).m6206().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = m2463().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        C5371.m9020(c3610);
                        c3611 = c3610;
                        try {
                            c3611.f12020.m9434(C3610.m6440(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e5) {
                            e = e5;
                            C5371.m9020(c3611);
                            c3611.f12020.m9434(C3610.m6440(str3), e, "Error updating raw event. appId");
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    c3611 = c3610;
                }
                C3117 c3117 = c1159.f19371.f16692;
                C5034.m8484(c3117);
                C5580 c5580 = c1578.f5327;
                Bundle bundle3 = new Bundle();
                for (C5057 c5057 : c5580.m9411()) {
                    if (c5057.m8586()) {
                        bundle3.putDouble(c5057.m8588(), c5057.m8584());
                    } else if (c5057.m8601()) {
                        bundle3.putFloat(c5057.m8588(), c5057.m8592());
                    } else if (c5057.m8604()) {
                        bundle3.putLong(c5057.m8588(), c5057.m8593());
                    } else if (c5057.m8591()) {
                        bundle3.putString(c5057.m8588(), c5057.m8603());
                    } else if (c5057.m8596().isEmpty()) {
                        C3610 c3616 = ((C5371) c3117.f18660).f17717;
                        C5371.m9020(c3616);
                        c3616.f12020.m9430(c5057, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(c5057.m8588(), C3117.m5705(c5057.m8596()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strM9415 = c5580.m9415();
                if (string == null) {
                    string = "";
                }
                C1512 c1512 = c5371.f17721;
                c3610 = c5371.f17717;
                C5371.m9021(c1512);
                if (strM9415.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                    }
                } else {
                    bundle2 = bundle;
                }
                c1512.m3236(bundle3, bundle2);
                C1832 c1832 = new C1832((C5371) obj, string, str4, c5580.m9415(), c5580.m9413(), c5580.m9421(), c5580.m9404(), bundle3);
                j = c1578.f5326;
                long j2 = c1578.f5325;
                boolean z = c1578.f5324;
                mo6517();
                m4637();
                str3 = c1832.f6093;
                AbstractC0487.m1090(str3);
                C5034.m8484(c3117);
                byte[] bArrM5754 = c3117.m5721(c1832).m5754();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", c1832.f6092);
                contentValues.put("timestamp", Long.valueOf(c1832.f6094));
                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                contentValues.put("data", bArrM5754);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(c1832.f6090));
                c1159 = this;
                str4 = str;
            }
            listM4513 = c2394.m4513();
            c1159 = this;
            str4 = str;
        }
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final void m2455(List list) {
        AbstractC0487.m1047(list);
        mo6517();
        m4637();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int iDelete = m2463().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9434(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:29:0x00f0 */
    /* JADX INFO: renamed from: ۦَ */
    public final C1513 m2456(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1090(str);
        AbstractC0487.m1090(str2);
        mo6517();
        m4637();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m2463().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objM2462 = m2462(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    C3117 c3117 = this.f19371.f16692;
                    C5034.m8484(c3117);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<C2679> creator = C2679.CREATOR;
                    C2679 c2679 = (C2679) c3117.m5722(blob, creator);
                    long j2 = cursorQuery.getLong(6);
                    C5034.m8484(c3117);
                    C2679 c26710 = (C2679) c3117.m5722(cursorQuery.getBlob(7), creator);
                    long j3 = cursorQuery.getLong(8);
                    long j4 = cursorQuery.getLong(9);
                    C5034.m8484(c3117);
                    str3 = str2;
                    try {
                        C1513 c1513 = new C1513(str, str4, new C1477(j3, objM2462, str3, str4), j2, z, string2, c2679, j, c26710, j4, (C2679) c3117.m5722(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            C3610 c3610 = c5371.f17717;
                            C5371.m9020(c3610);
                            c3610.f12020.m9434(C3610.m6440(str), c5371.f17731.m7142(str3), "Got multiple records for conditional property, expected one");
                        }
                        cursorQuery.close();
                        return c1513;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str3 = str2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        C3610 c3611 = c5371.f17717;
        C5371.m9020(c3611);
        c3611.f12020.m9431("Error querying conditional property", C3610.m6440(str), c5371.f17731.m7142(str3), e);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [ۥٍّؔؓ, ۥؘُ۟٘, ۦۤؗٗٔ] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /* JADX INFO: renamed from: ۦُ */
    public final C5211 m2457(String str) {
        Throwable th;
        SQLiteException e;
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1047(str);
        mo6517();
        m4637();
        ?? r2 = 0;
        c5211M8806 = null;
        c5211M8806 = null;
        C5211 c5211M8806 = null;
        try {
            try {
                this = m2463().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        c5211M8806 = C5211.m8806(this.getInt(1), this.getString(0));
                    } else {
                        C3610 c3610 = c5371.f17717;
                        C5371.m9020(c3610);
                        c3610.f12023.m9432("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    C3610 c3611 = c5371.f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9430(e, "Error querying database.");
                    if (this != 0) {
                    }
                    if (c5211M8806 == null) {
                        return C5211.f17218;
                    }
                    return c5211M8806;
                }
            } catch (SQLiteException e3) {
                e = e3;
                this = 0;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
            this.close();
            if (c5211M8806 == null) {
                return C5211.f17218;
            }
            return c5211M8806;
        } catch (Throwable th3) {
            th = th3;
            r2 = this;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦٔ */
    public final void m2458(C2976 c2976, boolean z) {
        C5371 c5371 = (C5371) this.f18660;
        C5371 c5372 = c2976.f9988;
        mo6517();
        m4637();
        String strM5537 = c2976.m5537();
        AbstractC0487.m1047(strM5537);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strM5537);
        EnumC4635 enumC4635 = EnumC4635.f15299;
        C5034 c5034 = this.f19371;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (c5034.m8492(strM5537).m8815(enumC4635)) {
            contentValues.put("app_instance_id", c2976.m5545());
        }
        contentValues.put("gmp_app_id", c2976.m5553());
        if (c5034.m8492(strM5537).m8815(EnumC4635.f15302)) {
            C3644 c3644 = c5372.f17733;
            C5371.m9020(c3644);
            c3644.mo6517();
            contentValues.put("resettable_device_id_hash", c2976.f9974);
        }
        C3644 c3645 = c5372.f17733;
        C5371.m9020(c3645);
        c3645.mo6517();
        contentValues.put("last_bundle_index", Long.valueOf(c2976.f10007));
        C3644 c3646 = c5372.f17733;
        C5371.m9020(c3646);
        c3646.mo6517();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c2976.f9987));
        C3644 c3647 = c5372.f17733;
        C5371.m9020(c3647);
        c3647.mo6517();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c2976.f10005));
        contentValues.put("app_version", c2976.m5571());
        C3644 c3648 = c5372.f17733;
        C5371.m9020(c3648);
        c3648.mo6517();
        contentValues.put("app_store", c2976.f9997);
        C3644 c3649 = c5372.f17733;
        C5371.m9020(c3649);
        c3649.mo6517();
        contentValues.put("gmp_version", Long.valueOf(c2976.f9998));
        C3644 c36410 = c5372.f17733;
        C5371.m9020(c36410);
        c36410.mo6517();
        contentValues.put("dev_cert_hash", Long.valueOf(c2976.f10008));
        C3644 c36411 = c5372.f17733;
        C5371.m9020(c36411);
        c36411.mo6517();
        contentValues.put("measurement_enabled", Boolean.valueOf(c2976.f10013));
        C3644 c36412 = c5372.f17733;
        C3644 c36413 = c5372.f17733;
        C5371.m9020(c36412);
        c36412.mo6517();
        contentValues.put("day", Long.valueOf(c2976.f9999));
        C5371.m9020(c36413);
        c36413.mo6517();
        contentValues.put("daily_public_events_count", Long.valueOf(c2976.f10002));
        C5371.m9020(c36413);
        c36413.mo6517();
        contentValues.put("daily_events_count", Long.valueOf(c2976.f9969));
        C5371.m9020(c36413);
        c36413.mo6517();
        contentValues.put("daily_conversions_count", Long.valueOf(c2976.f10010));
        C3644 c36414 = c5372.f17733;
        C5371.m9020(c36414);
        c36414.mo6517();
        contentValues.put("config_fetched_time", Long.valueOf(c2976.f9993));
        C3644 c36415 = c5372.f17733;
        C5371.m9020(c36415);
        c36415.mo6517();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c2976.f9983));
        contentValues.put("app_version_int", Long.valueOf(c2976.m5541()));
        contentValues.put("firebase_instance_id", c2976.m5558());
        C5371.m9020(c36413);
        c36413.mo6517();
        contentValues.put("daily_error_events_count", Long.valueOf(c2976.f10012));
        C5371.m9020(c36413);
        c36413.mo6517();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c2976.f9980));
        C5371.m9020(c36413);
        c36413.mo6517();
        contentValues.put("health_monitor_sample", c2976.f9982);
        contentValues.put("android_id", (Long) 0L);
        C3644 c36416 = c5372.f17733;
        C5371.m9020(c36416);
        c36416.mo6517();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c2976.f10011));
        contentValues.put("dynamite_version", Long.valueOf(c2976.m5544()));
        if (c5034.m8492(strM5537).m8815(enumC4635)) {
            C3644 c36417 = c5372.f17733;
            C5371.m9020(c36417);
            c36417.mo6517();
            contentValues.put("session_stitching_token", c2976.f9979);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c2976.m5529()));
        C3644 c36418 = c5372.f17733;
        C5371.m9020(c36418);
        c36418.mo6517();
        contentValues.put("target_os_version", Long.valueOf(c2976.f10009));
        C3644 c36419 = c5372.f17733;
        C5371.m9020(c36419);
        c36419.mo6517();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c2976.f9984));
        C0237.m498();
        C0515 c0515 = c5371.f17715;
        C3610 c3610 = c5371.f17717;
        if (c0515.m1162(strM5537, AbstractC4936.f16284)) {
            C3644 c36420 = c5372.f17733;
            C5371.m9020(c36420);
            c36420.mo6517();
            contentValues.put("ad_services_version", Integer.valueOf(c2976.f10001));
            C3644 c36421 = c5372.f17733;
            C5371.m9020(c36421);
            c36421.mo6517();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c2976.f9991));
        }
        C3644 c36422 = c5372.f17733;
        C5371.m9020(c36422);
        c36422.mo6517();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c2976.f9981));
        contentValues.put("npa_metadata_value", c2976.m5560());
        C3644 c36423 = c5372.f17733;
        C5371.m9020(c36423);
        c36423.mo6517();
        contentValues.put("bundle_delivery_index", Long.valueOf(c2976.f9986));
        contentValues.put("sgtm_preview_key", c2976.m5563());
        C5371.m9020(c36413);
        c36413.mo6517();
        contentValues.put("dma_consent_state", Integer.valueOf(c2976.f10004));
        C5371.m9020(c36413);
        c36413.mo6517();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c2976.f9978));
        contentValues.put("serialized_npa_metadata", c2976.m5532());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c2976.m5538()));
        C3644 c36424 = c5372.f17733;
        C5371.m9020(c36424);
        c36424.mo6517();
        ArrayList arrayList = c2976.f9973;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                C5371.m9020(c3610);
                c3610.f12022.m9430(strM5537, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (c0515.m1162(null, AbstractC4936.f16276) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C3644 c36425 = c5372.f17733;
        C5371.m9020(c36425);
        c36425.mo6517();
        contentValues.put("unmatched_pfo", c2976.f9970);
        C3644 c36426 = c5372.f17733;
        C5371.m9020(c36426);
        c36426.mo6517();
        contentValues.put("unmatched_uwa", c2976.f9968);
        C3644 c36427 = c5372.f17733;
        C5371.m9020(c36427);
        c36427.mo6517();
        contentValues.put("ad_campaign_info", c2976.f9994);
        if (c0515.m1162(strM5537, AbstractC4936.f19567)) {
            C3644 c36428 = c5372.f17733;
            C5371.m9020(c36428);
            c36428.mo6517();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(c2976.f9995));
        }
        try {
            SQLiteDatabase sQLiteDatabaseM2463 = m2463();
            if (sQLiteDatabaseM2463.update("apps", contentValues, "app_id = ?", new String[]{strM5537}) == 0 && sQLiteDatabaseM2463.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                C5371.m9020(c3610);
                c3610.f12020.m9430(C3610.m6440(strM5537), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            C5371.m9020(c3610);
            c3610.f12020.m9434(C3610.m6440(strM5537), e, "Error storing app. appId");
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m2459(Long l) {
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        m4637();
        try {
            if (m2463().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12022.m9432("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12020.m9430(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final void m2460(String str, C4012 c4012) {
        mo6517();
        m4637();
        AbstractC0487.m1090(str);
        C5371 c5371 = (C5371) this.f18660;
        C1397 c1397 = c5371.f17719;
        C3610 c3610 = c5371.f17717;
        c1397.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2462 c2462 = AbstractC4936.f16279;
        long jLongValue = jCurrentTimeMillis - ((Long) c2462.m4592(null)).longValue();
        long j = c4012.f13378;
        if (j < jLongValue || j > ((Long) c2462.m4592(null)).longValue() + jCurrentTimeMillis) {
            C5371.m9020(c3610);
            c3610.f12022.m9431("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C3610.m6440(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        C5371.m9020(c3610);
        c3610.f12023.m9432("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c4012.f13379);
        contentValues.put("source", Integer.valueOf(c4012.f13377));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (m2463().insert("trigger_uris", null, contentValues) == -1) {
                C5371.m9020(c3610);
                c3610.f12020.m9430(C3610.m6440(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            C5371.m9020(c3610);
            c3610.f12020.m9434(C3610.m6440(str), e, "Error storing trigger URI. appId");
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final long m2461(String str, C2533 c2533, String str2, Map map, EnumC1962 enumC1962, Long l) {
        int iDelete;
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        m4637();
        AbstractC0487.m1047(c2533);
        AbstractC0487.m1090(str);
        mo6517();
        m4637();
        if (m2469()) {
            C5034 c5034 = this.f19371;
            long jM7371 = c5034.f16678.f17372.m7371();
            C1397 c1397 = c5371.f17719;
            C3610 c3610 = c5371.f17717;
            c1397.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM7371) > ((Long) AbstractC4936.f16260.m4592(null)).longValue()) {
                c5034.f16678.f17372.m7370(jElapsedRealtime);
                mo6517();
                m4637();
                if (m2469() && (iDelete = m2463().delete("upload_queue", m2439(), new String[0])) > 0) {
                    C5371.m9020(c3610);
                    c3610.f12023.m9430(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                AbstractC0487.m1090(str);
                mo6517();
                m4637();
                try {
                    int iM1153 = c5371.f17715.m1153(str, AbstractC4936.f16259);
                    if (iM1153 > 0) {
                        m2463().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM1153)});
                    }
                } catch (SQLiteException e) {
                    C5371.m9020(c3610);
                    c3610.f12020.m9434(C3610.m6440(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrM5754 = c2533.m5754();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrM5754);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(enumC1962.f6473));
        C1397 c1398 = c5371.f17719;
        C3610 c3611 = c5371.f17717;
        c1398.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = m2463().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            C5371.m9020(c3611);
            c3611.f12020.m9430(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            C5371.m9020(c3611);
            c3611.f12020.m9434(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final Object m2462(Cursor cursor, int i) {
        C5371 c5371 = (C5371) this.f18660;
        int type = cursor.getType(i);
        if (type == 0) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12020.m9430(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        C3610 c3612 = c5371.f17717;
        C5371.m9020(c3612);
        c3612.f12020.m9432("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX INFO: renamed from: ۦٝ */
    public final SQLiteDatabase m2463() {
        mo6517();
        try {
            return this.f4026.getWritableDatabase();
        } catch (SQLiteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(e, "Error opening database");
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۦٞ */
    public final void m2464(String str) {
        C3047 c3047M2433;
        m2450("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m2463().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (c3047M2433 = m2433("events", str, string)) != null) {
                            m2443("events_snapshot", c3047M2433);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                C3610 c3610 = ((C5371) this.f18660).f17717;
                C5371.m9020(c3610);
                c3610.f12020.m9434(C3610.m6440(str), e, "Error creating snapshot. appId");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۦٟ */
    public final void m2465(String str, String str2) {
        AbstractC0487.m1090(str);
        AbstractC0487.m1090(str2);
        mo6517();
        m4637();
        try {
            m2463().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            C5371 c5371 = (C5371) this.f18660;
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9431("Error deleting user property. appId", C3610.m6440(str), c5371.f17731.m7142(str2), e);
        }
    }

    /* JADX INFO: renamed from: ۦۖ */
    public final void m2466(C2523 c2523, boolean z) {
        mo6517();
        m4637();
        AbstractC0487.m1090(c2523.m4680());
        if (!c2523.m9827()) {
            throw new IllegalStateException();
        }
        m2418();
        C5371 c5371 = (C5371) this.f18660;
        C1397 c1397 = c5371.f17719;
        C3610 c3610 = c5371.f17717;
        c1397.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM9810 = c2523.m9810();
        C2462 c2462 = AbstractC4936.f16300;
        if (jM9810 < jCurrentTimeMillis - ((Long) c2462.m4592(null)).longValue() || c2523.m9810() > ((Long) c2462.m4592(null)).longValue() + jCurrentTimeMillis) {
            C5371.m9020(c3610);
            c3610.f12022.m9431("Storing bundle outside of the max uploading time span. appId, now, timestamp", C3610.m6440(c2523.m4680()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c2523.m9810()));
        }
        byte[] bArrM5754 = c2523.m5754();
        try {
            C3117 c3117 = this.f19371.f16692;
            C5034.m8484(c3117);
            byte[] bArrM5727 = c3117.m5727(bArrM5754);
            C5371.m9020(c3610);
            c3610.f12023.m9430(Integer.valueOf(bArrM5727.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c2523.m4680());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c2523.m9810()));
            contentValues.put("data", bArrM5727);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c2523.m4740()) {
                contentValues.put("retry_count", Integer.valueOf(c2523.m4676()));
            }
            try {
                if (m2463().insert("queue", null, contentValues) == -1) {
                    C5371.m9020(c3610);
                    c3610.f12020.m9430(C3610.m6440(c2523.m4680()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                C5371.m9020(c3610);
                c3610.f12020.m9434(C3610.m6440(c2523.m4680()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            C5371.m9020(c3610);
            c3610.f12020.m9434(C3610.m6440(c2523.m4680()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ۦۛ */
    public final List m2467(String str, C3954 c3954, int i) {
        ?? arrayList;
        AbstractC0487.m1090(str);
        mo6517();
        m4637();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseM2463 = m2463();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strM2416 = m2416(c3954.f13226);
            String strM2439 = m2439();
            StringBuilder sb = new StringBuilder(strM2416.length() + 17 + strM2439.length());
            sb.append("app_id=?");
            sb.append(strM2416);
            sb.append(" AND NOT ");
            sb.append(strM2439);
            cursorQuery = sQLiteDatabaseM2463.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                C1212 c1212M2434 = m2434(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (c1212M2434 != null) {
                    arrayList.add(c1212M2434);
                }
            }
        } catch (SQLiteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9434(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final long m2468(long j, String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m2463().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                C3610 c3610 = ((C5371) this.f18660).f17717;
                C5371.m9020(c3610);
                c3610.f12020.m9434(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public final boolean m2469() {
        return ((C5371) this.f18660).f17739.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX INFO: renamed from: ۦۢ */
    public final void m2470(String str, String str2) {
        AbstractC0487.m1090(str);
        AbstractC0487.m1090(str2);
        mo6517();
        m4637();
        try {
            m2463().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            C5371 c5371 = (C5371) this.f18660;
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9431("Error deleting conditional property", C3610.m6440(str), c5371.f17731.m7142(str2), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX INFO: renamed from: ۦۣ */
    public final String m2471(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m2463().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                C3610 c3610 = ((C5371) this.f18660).f17717;
                C5371.m9020(c3610);
                c3610.f12020.m9434(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: ۦۤ */
    public final boolean m2472(C1513 c1513) {
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        m4637();
        String str = c1513.f5147;
        AbstractC0487.m1047(str);
        if (m2451(str, c1513.f5138.f5025) == null) {
            long jM2419 = m2419("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            C0515 c0515 = c5371.f17715;
            if (jM2419 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c1513.f5146);
        contentValues.put("name", c1513.f5138.f5025);
        Object objM3090 = c1513.f5138.m3090();
        AbstractC0487.m1047(objM3090);
        m2417(contentValues, objM3090);
        contentValues.put("active", Boolean.valueOf(c1513.f5137));
        contentValues.put("trigger_event_name", c1513.f5140);
        contentValues.put("trigger_timeout", Long.valueOf(c1513.f5145));
        C2679 c2679 = c1513.f5144;
        C1512 c1512 = c5371.f17721;
        C3610 c3610 = c5371.f17717;
        C5371.m9021(c1512);
        contentValues.put("timed_out_event", C1512.m3190(c2679));
        contentValues.put("creation_timestamp", Long.valueOf(c1513.f5139));
        C5371.m9021(c1512);
        contentValues.put("triggered_event", C1512.m3190(c1513.f5142));
        contentValues.put("triggered_timestamp", Long.valueOf(c1513.f5138.f5021));
        contentValues.put("time_to_live", Long.valueOf(c1513.f5143));
        contentValues.put("expired_event", C1512.m3190(c1513.f5141));
        try {
            if (m2463().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            C5371.m9020(c3610);
            c3610.f12020.m9430(C3610.m6440(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            C5371.m9020(c3610);
            c3610.f12020.m9434(C3610.m6440(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX INFO: renamed from: ۦۦ */
    public final C0403 m2473(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return m2449(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    /* JADX INFO: renamed from: ۦۧ */
    public final void m2474(String str, C5211 c5211) {
        AbstractC0487.m1047(str);
        mo6517();
        m4637();
        m2422(str, m2457(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c5211.m8817());
        m2430(contentValues);
    }
}
