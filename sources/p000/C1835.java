package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: ۥٜٕؖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1835 implements Closeable {

    /* JADX INFO: renamed from: ۥٖ */
    public static final C1329 f6098 = new C1329("proto");

    /* JADX INFO: renamed from: ۥَ */
    public final InterfaceC4895 f6099;

    /* JADX INFO: renamed from: ۥْ */
    public final InterfaceC5375 f6100;

    /* JADX INFO: renamed from: ۥٓ */
    public final C1276 f6101;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC5375 f6102;

    /* JADX INFO: renamed from: ۦۨ */
    public final C0668 f6103;

    public C1835(InterfaceC5375 interfaceC5375, InterfaceC5375 interfaceC5376, C1276 c1276, C0668 c0668, InterfaceC4895 interfaceC4895) {
        this.f6103 = c0668;
        this.f6102 = interfaceC5375;
        this.f6100 = interfaceC5376;
        this.f6101 = c1276;
        this.f6099 = interfaceC4895;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static Object m3604(Cursor cursor, InterfaceC1268 interfaceC1268) {
        try {
            return interfaceC1268.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static Long m3605(SQLiteDatabase sQLiteDatabase, C1360 c1360) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c1360.f4676, String.valueOf(AbstractC3020.m5614(c1360.f4674))));
        byte[] bArr = c1360.f4675;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static String m3606(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C5793) it.next()).f19087);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6103.close();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final ArrayList m3607(SQLiteDatabase sQLiteDatabase, C1360 c1360, int i) {
        ArrayList arrayList = new ArrayList();
        Long lM3605 = m3605(sQLiteDatabase, c1360);
        if (lM3605 == null) {
            return arrayList;
        }
        m3604(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lM3605.toString()}, null, null, null, String.valueOf(i)), new C2035(this, arrayList, c1360, 3));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m3608(long j, EnumC2114 enumC2114, String str) {
        m3611(new C5562(j, str, enumC2114));
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final Object m3609(InterfaceC5109 interfaceC5109) {
        SQLiteDatabase sQLiteDatabaseM3610 = m3610();
        InterfaceC5375 interfaceC5375 = this.f6100;
        long jMo7674 = interfaceC5375.mo7674();
        while (true) {
            try {
                sQLiteDatabaseM3610.beginTransaction();
                try {
                    Object objMo3986 = interfaceC5109.mo3986();
                    sQLiteDatabaseM3610.setTransactionSuccessful();
                    return objMo3986;
                } finally {
                    sQLiteDatabaseM3610.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC5375.mo7674() >= ((long) this.f6101.f4350) + jMo7674) {
                    throw new C2833("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final SQLiteDatabase m3610() {
        C0668 c0668 = this.f6103;
        Objects.requireNonNull(c0668);
        InterfaceC5375 interfaceC5375 = this.f6100;
        long jMo7674 = interfaceC5375.mo7674();
        while (true) {
            try {
                return c0668.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC5375.mo7674() >= ((long) this.f6101.f4350) + jMo7674) {
                    throw new C2833("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object m3611(InterfaceC1268 interfaceC1268) {
        SQLiteDatabase sQLiteDatabaseM3610 = m3610();
        sQLiteDatabaseM3610.beginTransaction();
        try {
            Object objApply = interfaceC1268.apply(sQLiteDatabaseM3610);
            sQLiteDatabaseM3610.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM3610.endTransaction();
        }
    }
}
