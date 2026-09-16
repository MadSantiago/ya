package p000;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* JADX INFO: renamed from: ۥٍَؙؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0956 implements Closeable {

    /* JADX INFO: renamed from: ۦۨ */
    public final SQLiteDatabase f3394;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final String[] f3393 = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: ۥْ */
    public static final String[] f3391 = new String[0];

    /* JADX INFO: renamed from: ۥٓ */
    public static final InterfaceC5130 f3392 = AbstractC3933.m7095(3, new C0062(26));

    /* JADX INFO: renamed from: ۥَ */
    public static final InterfaceC5130 f3390 = AbstractC3933.m7095(3, new C0062(27));

    public C0956(SQLiteDatabase sQLiteDatabase) {
        this.f3394 = sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3394.close();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m1981() {
        this.f3394.endTransaction();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m1982(String str) {
        this.f3394.execSQL(str);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m1983() {
        this.f3394.setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m1984(Object[] objArr) {
        this.f3394.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m1985() {
        this.f3394.beginTransactionNonExclusive();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1986() {
        this.f3394.beginTransaction();
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m1987() {
        return this.f3394.inTransaction();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4819 m1988(String str) {
        return new C4819(this.f3394.compileStatement(str));
    }
}
