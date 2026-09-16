package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: ۦۣۣۢؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5562 implements InterfaceC2740, InterfaceC1268, InterfaceC5109 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f18366;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f18367;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ Object f18368;

    public /* synthetic */ C5562(long j, Object obj, Object obj2) {
        this.f18368 = obj;
        this.f18366 = obj2;
        this.f18367 = j;
    }

    @Override // p000.InterfaceC1268
    public Object apply(Object obj) {
        String str = (String) this.f18368;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((EnumC2114) this.f18366).f6950;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f18367;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p000.InterfaceC5109
    /* JADX INFO: renamed from: ۥؗ */
    public Object mo3986() {
        C0474 c0474 = (C0474) this.f18368;
        C1360 c1360 = (C1360) this.f18366;
        C1835 c1835 = (C1835) c0474.f1722;
        long jMo7674 = ((InterfaceC5375) c0474.f1730).mo7674() + this.f18367;
        c1835.getClass();
        c1835.m3611(new C3829(jMo7674, c1360));
        return null;
    }

    @Override // p000.InterfaceC2740
    /* JADX INFO: renamed from: ۥۗ */
    public void mo397(InterfaceC2090 interfaceC2090) {
        ((C4843) interfaceC2090.get()).m8216((String) this.f18368, this.f18367, (C1556) this.f18366);
    }

    public /* synthetic */ C5562(String str, long j, C1556 c1556) {
        this.f18368 = str;
        this.f18367 = j;
        this.f18366 = c1556;
    }
}
