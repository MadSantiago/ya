package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* JADX INFO: renamed from: ۦٔؑ۟ٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4159 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractC5676 f13852;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13853;

    public C4159(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.f13853;
        AbstractC5676 abstractC5676 = this.f13852;
        switch (i) {
            case 0:
                C1159 c1159 = (C1159) abstractC5676;
                C5371 c5371 = (C5371) c1159.f18660;
                C0515 c0515 = c5371.f17715;
                C2494 c2494 = c1159.f4025;
                if (c2494.f8292 != 0 && SystemClock.elapsedRealtime() - c2494.f8292 < 3600000) {
                    throw new SQLiteException("Database open failed");
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    c2494.getClass();
                    c2494.f8292 = SystemClock.elapsedRealtime();
                    C3610 c3610 = c5371.f17717;
                    C5371.m9020(c3610);
                    c3610.f12020.m9432("Opening the database failed, dropping and recreating it");
                    if (!c5371.f17739.getDatabasePath("google_app_measurement.db").delete()) {
                        C3610 c3611 = c5371.f17717;
                        C5371.m9020(c3611);
                        c3611.f12020.m9430("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        c2494.f8292 = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        C3610 c3612 = c5371.f17717;
                        C5371.m9020(c3612);
                        c3612.f12020.m9430(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                C5371 c5372 = (C5371) ((C5403) abstractC5676).f18660;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    C3610 c3613 = c5372.f17717;
                    C5371.m9020(c3613);
                    c3613.f12020.m9432("Opening the local database failed, dropping and recreating it");
                    if (!c5372.f17739.getDatabasePath("google_app_measurement_local.db").delete()) {
                        C3610 c3614 = c5372.f17717;
                        C5371.m9020(c3614);
                        c3614.f12020.m9430("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        C3610 c3615 = c5372.f17717;
                        C5371.m9020(c3615);
                        c3615.f12020.m9430(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f13853;
        AbstractC5676 abstractC5676 = this.f13852;
        switch (i) {
            case 0:
                C3610 c3610 = ((C5371) ((C1159) abstractC5676).f18660).f17717;
                C5371.m9020(c3610);
                AbstractC5568.m9352(c3610, sQLiteDatabase);
                break;
            default:
                C3610 c3611 = ((C5371) ((C5403) abstractC5676).f18660).f17717;
                C5371.m9020(c3611);
                AbstractC5568.m9352(c3611, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f13853;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        int i = this.f13853;
        AbstractC5676 abstractC5676 = this.f13852;
        switch (i) {
            case 0:
                C5371 c5371 = (C5371) ((C1159) abstractC5676).f18660;
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                AbstractC5568.m9369(c3610, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C1159.f4017);
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C1159.f4024);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C1159.f4019);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C1159.f4018);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C1159.f4021);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C1159.f4015);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C1159.f4014);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C1159.f4020);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C1159.f4016);
                C0237.m498();
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C1159.f4023);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C1159.f4022);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                C5371.m9020(c3611);
                AbstractC5568.m9369(c3611, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                C3610 c3612 = ((C5371) ((C5403) abstractC5676).f18660).f17717;
                C5371.m9020(c3612);
                AbstractC5568.m9369(c3612, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", C5403.f17847);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f13853;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4159(C5403 c5403, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f13853 = 1;
        this.f13852 = c5403;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4159(C1159 c1159, Context context) {
        this(context, "google_app_measurement.db");
        this.f13853 = 0;
        this.f13852 = c1159;
    }

    /* JADX INFO: renamed from: ۥَ */
    private final void m7354(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: ۥۗ */
    private final void m7355(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m7356(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: ۦ۟ */
    private final void m7357(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
