package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: renamed from: ۦ۠ؕؔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5403 extends AbstractC4351 {

    /* JADX INFO: renamed from: ۥَ */
    public static final String[] f17847 = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: ۥْ */
    public final C4159 f17848;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f17849;

    public C5403(C5371 c5371) {
        super(c5371);
        this.f17848 = new C4159(this, ((C5371) this.f18660).f17739);
    }

    @Override // p000.AbstractC4351
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo3853() {
        return false;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final SQLiteDatabase m9082() {
        if (this.f17849) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f17848.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f17849 = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
  0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m9083(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseM9082;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        boolean z3 = false;
        z3 = false;
        if (!this.f17849) {
            C0515 c0515 = c5371.f17715;
            C3610 c3610 = c5371.f17717;
            C2462 c2462 = AbstractC4936.f19569;
            Cursor cursor = null;
            cursor = null;
            C5855 c5855M3856 = c0515.m1162(null, c2462) ? c5371.m9029().m3856(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (c5371.f17715.m1162(null, c2462) && c5855M3856 != null) {
                contentValues.put("app_version", c5855M3856.f19313);
                contentValues.put("app_version_int", Long.valueOf(c5855M3856.f19331));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseM9082 = m9082();
                    if (sQLiteDatabaseM9082 == null) {
                        this.f17849 = true;
                    } else {
                        try {
                            sQLiteDatabaseM9082.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseM9082.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        z = z3 ? 1 : 0;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM9082 != null) {
                                            sQLiteDatabaseM9082.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        z = z3 ? 1 : 0;
                                        C5371.m9020(c3610);
                                        c3610.f12020.m9430(e, "Error writing entry; local database full");
                                        this.f17849 = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM9082 != null) {
                                            sQLiteDatabaseM9082.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        z = z3 ? 1 : 0;
                                        z2 = true;
                                        if (sQLiteDatabaseM9082 != null) {
                                            sQLiteDatabaseM9082.endTransaction();
                                        }
                                        C5371.m9020(c3610);
                                        c3610.f12020.m9430(e, "Error writing entry to local database");
                                        this.f17849 = z2;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM9082 != null) {
                                            sQLiteDatabaseM9082.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorRawQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseM9082 != null) {
                                        sQLiteDatabaseM9082.close();
                                    }
                                    throw th;
                                }
                            }
                            if (j >= 100000) {
                                C5371.m9020(c3610);
                                c3610.f12020.m9432("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseM9082.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    C5371.m9020(c3610);
                                    C5590 c5590 = c3610.f12020;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                            try {
                                                c5590.m9431("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e3) {
                                                e = e3;
                                                C5371.m9020(c3610);
                                                c3610.f12020.m9430(e, "Error writing entry; local database full");
                                                this.f17849 = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM9082 != null) {
                                                    sQLiteDatabaseM9082.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                if (sQLiteDatabaseM9082 != null) {
                                                    sQLiteDatabaseM9082.endTransaction();
                                                }
                                                C5371.m9020(c3610);
                                                c3610.f12020.m9430(e, "Error writing entry to local database");
                                                this.f17849 = z2;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM9082 != null) {
                                                    sQLiteDatabaseM9082.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteFullException e5) {
                                            e = e5;
                                            C5371.m9020(c3610);
                                            c3610.f12020.m9430(e, "Error writing entry; local database full");
                                            this.f17849 = true;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM9082 != null) {
                                                sQLiteDatabaseM9082.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            z2 = true;
                                            if (sQLiteDatabaseM9082 != null && sQLiteDatabaseM9082.inTransaction()) {
                                                sQLiteDatabaseM9082.endTransaction();
                                            }
                                            C5371.m9020(c3610);
                                            c3610.f12020.m9430(e, "Error writing entry to local database");
                                            this.f17849 = z2;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM9082 != null) {
                                                sQLiteDatabaseM9082.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM9082 != null) {
                                            sQLiteDatabaseM9082.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                z2 = true;
                            }
                            sQLiteDatabaseM9082.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseM9082.setTransactionSuccessful();
                            sQLiteDatabaseM9082.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseM9082.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseM9082 = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseM9082 = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseM9082 = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseM9082 = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            C5371.m9020(c3610);
            c3610.f12023.m9432("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m9084() {
        int iDelete;
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        try {
            SQLiteDatabase sQLiteDatabaseM9082 = m9082();
            if (sQLiteDatabaseM9082 == null || (iDelete = sQLiteDatabaseM9082.delete("messages", null, null)) <= 0) {
                return;
            }
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12023.m9430(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12020.m9430(e, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[PHI: r4
  0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۦۛ */
    public final void m9085() {
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        if (!this.f17849 && c5371.f17739.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseM9082 = m9082();
                        if (sQLiteDatabaseM9082 == null) {
                            this.f17849 = true;
                            return;
                        }
                        sQLiteDatabaseM9082.beginTransaction();
                        sQLiteDatabaseM9082.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseM9082.setTransactionSuccessful();
                        sQLiteDatabaseM9082.endTransaction();
                        sQLiteDatabaseM9082.close();
                        return;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteFullException e) {
                        C3610 c3610 = c5371.f17717;
                        C5371.m9020(c3610);
                        c3610.f12020.m9430(e, "Error deleting app launch break from local database");
                        this.f17849 = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    C3610 c3611 = c5371.f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9430(e2, "Error deleting app launch break from local database");
                    this.f17849 = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            C3610 c3612 = c5371.f17717;
            C5371.m9020(c3612);
            c3612.f12022.m9432("Error deleting app launch break from local database in reasonable time");
        }
    }
}
