package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: ۦْۣ۠ؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5385 implements InterfaceC5109 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1835 f17802;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17803;

    public /* synthetic */ C5385(C1835 c1835, int i) {
        this.f17803 = i;
        this.f17802 = c1835;
    }

    @Override // p000.InterfaceC5109
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo3986() {
        int i = this.f17803;
        C1835 c1835 = this.f17802;
        switch (i) {
            case 0:
                c1835.getClass();
                int i2 = C2807.f9368;
                int i3 = 4;
                C1489 c1489 = new C1489(4);
                c1489.f5059 = null;
                c1489.f5057 = new ArrayList();
                c1489.f5058 = null;
                c1489.f5056 = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseM3610 = c1835.m3610();
                sQLiteDatabaseM3610.beginTransaction();
                try {
                    C2807 c2807 = (C2807) C1835.m3604(sQLiteDatabaseM3610.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C2035(c1835, map, c1489, i3));
                    sQLiteDatabaseM3610.setTransactionSuccessful();
                    return c2807;
                } finally {
                    sQLiteDatabaseM3610.endTransaction();
                }
            default:
                long jMo7674 = c1835.f6102.mo7674() - c1835.f6101.f4354;
                SQLiteDatabase sQLiteDatabaseM3611 = c1835.m3610();
                sQLiteDatabaseM3611.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jMo7674)};
                    Cursor cursorRawQuery = sQLiteDatabaseM3611.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            c1835.m3608(cursorRawQuery.getInt(0), EnumC2114.f6943, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseM3611.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM3611.setTransactionSuccessful();
                    sQLiteDatabaseM3611.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseM3611.endTransaction();
                    throw th2;
                }
        }
    }
}
