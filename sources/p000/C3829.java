package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: ۦَٖؒؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3829 implements InterfaceC1268 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1360 f12699;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ long f12700;

    public /* synthetic */ C3829(long j, C1360 c1360) {
        this.f12700 = j;
        this.f12699 = c1360;
    }

    @Override // p000.InterfaceC1268
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f12700));
        C1360 c1360 = this.f12699;
        String str = c1360.f4676;
        EnumC4021 enumC4021 = c1360.f4674;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC3020.m5614(enumC4021))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(AbstractC3020.m5614(enumC4021)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
