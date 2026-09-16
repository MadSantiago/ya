package p000;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: ۦؕؖؗؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3289 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ int f11016 = 0;

    /* JADX INFO: renamed from: ۥَ */
    public boolean f11017;

    /* JADX INFO: renamed from: ۥْ */
    public final C0322 f11018;

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean f11019;

    /* JADX INFO: renamed from: ۥٖ */
    public final C5524 f11020;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f11021;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4228 f11022;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f11023;

    public C3289(Context context, String str, final C4228 c4228, final C0322 c0322, boolean z) {
        super(context, str, null, c0322.f1179, new DatabaseErrorHandler(c0322, c4228) { // from class: ۦْٕؖٚ

            /* JADX INFO: renamed from: ۥۣ */
            public final /* synthetic */ C4228 f14092;

            {
                this.f14092 = c4228;
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = C3289.f11016;
                C4228 c4229 = this.f14092;
                C0956 c0956 = (C0956) c4229.f14025;
                if (c0956 == null || !AbstractC3831.m6874(c0956.f3394, sQLiteDatabase)) {
                    c0956 = new C0956(sQLiteDatabase);
                    c4229.f14025 = c0956;
                }
                SQLiteDatabase sQLiteDatabase2 = c0956.f3394;
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c0956 + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        C0322.m682(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        c0956.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            C0322.m682((String) ((Pair) it.next()).second);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            C0322.m682(path2);
                        }
                    }
                }
            }
        });
        this.f11023 = context;
        this.f11022 = c4228;
        this.f11018 = c0322;
        this.f11019 = z;
        this.f11020 = new C5524(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C5524 c5524 = this.f11020;
        try {
            c5524.m9206(c5524.f18241);
            super.close();
            this.f11022.f14025 = null;
            this.f11021 = false;
        } finally {
            c5524.m9205();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        if (!this.f11017 && this.f11018.f1179 != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            m6048(sQLiteDatabase);
        } catch (Throwable th) {
            throw new C1644(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            ((C3352) this.f11018.f1178).m6120(new C0448(m6048(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new C1644(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f11017 = true;
        try {
            this.f11018.m697(m6048(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C1644(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f11017) {
            try {
                C0322 c0322 = this.f11018;
                C0956 c0956M6048 = m6048(sQLiteDatabase);
                C3352 c3352 = (C3352) c0322.f1178;
                c3352.m6118(new C0448(c0956M6048));
                c3352.f11213 = c0956M6048;
            } catch (Throwable th) {
                throw new C1644(5, th);
            }
        }
        this.f11021 = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f11017 = true;
        try {
            this.f11018.m697(m6048(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C1644(3, th);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C0956 m6048(SQLiteDatabase sQLiteDatabase) {
        C4228 c4228 = this.f11022;
        C0956 c0956 = (C0956) c4228.f14025;
        if (c0956 != null && AbstractC3831.m6874(c0956.f3394, sQLiteDatabase)) {
            return c0956;
        }
        C0956 c0957 = new C0956(sQLiteDatabase);
        c4228.f14025 = c0957;
        return c0957;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C0956 m6049(boolean z) {
        C5524 c5524 = this.f11020;
        try {
            c5524.m9206((this.f11021 || getDatabaseName() == null) ? false : true);
            this.f11017 = false;
            SQLiteDatabase sQLiteDatabaseM6050 = m6050(z);
            if (!this.f11017) {
                return m6048(sQLiteDatabaseM6050);
            }
            close();
            return m6049(z);
        } finally {
            c5524.m9205();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX INFO: renamed from: ۦ۟ */
    public final SQLiteDatabase m6050(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.f11021;
        Context context = this.f11023;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return z ? getWritableDatabase() : getReadableDatabase();
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                this = z ? getWritableDatabase() : getReadableDatabase();
                return this;
            } catch (Throwable th) {
                th = th;
                if (th instanceof C1644) {
                    C1644 c1644 = (C1644) th;
                    int iM6632 = AbstractC3761.m6632(c1644.f5492);
                    th = c1644.f5491;
                    if (iM6632 == 0 || iM6632 == 1 || iM6632 == 2 || iM6632 == 3) {
                        throw th;
                    }
                    if (iM6632 != 4) {
                        C1078.m2275();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f11019) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return z ? this.getWritableDatabase() : this.getReadableDatabase();
                } catch (C1644 e) {
                    throw e.f5491;
                }
            }
        }
    }
}
