package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥؘٖؒۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0661 extends AbstractC3496 {

    /* JADX INFO: renamed from: ۥَ */
    public long[] f2439;

    /* JADX INFO: renamed from: ۥٓ */
    public int[] f2440;

    /* JADX INFO: renamed from: ۥٖ */
    public double[] f2441;

    /* JADX INFO: renamed from: ۥۖ */
    public Cursor f2442;

    /* JADX INFO: renamed from: ۦٗ */
    public String[] f2443;

    /* JADX INFO: renamed from: ۦۛ */
    public byte[][] f2444;

    /* JADX INFO: renamed from: ۥَ */
    public static void m1469(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            C4773.m8154(25, "column index out of range");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f11598) {
            m6286();
            this.f2440 = new int[0];
            this.f2439 = new long[0];
            this.f2441 = new double[0];
            this.f2443 = new String[0];
            this.f2444 = new byte[0][];
            reset();
        }
        this.f11598 = true;
    }

    @Override // p000.InterfaceC0252
    public final byte[] getBlob(int i) {
        m6286();
        Cursor cursorM1470 = m1470();
        m1469(cursorM1470, i);
        return cursorM1470.getBlob(i);
    }

    @Override // p000.InterfaceC0252
    public final int getColumnCount() {
        m6286();
        m1472();
        Cursor cursor = this.f2442;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // p000.InterfaceC0252
    public final String getColumnName(int i) {
        m6286();
        m1472();
        Cursor cursor = this.f2442;
        if (cursor != null) {
            m1469(cursor, i);
            return cursor.getColumnName(i);
        }
        C1078.m2276("Required value was null.");
        return null;
    }

    @Override // p000.InterfaceC0252
    public final long getLong(int i) {
        m6286();
        Cursor cursorM1470 = m1470();
        m1469(cursorM1470, i);
        return cursorM1470.getLong(i);
    }

    @Override // p000.InterfaceC0252
    public final boolean isNull(int i) {
        m6286();
        Cursor cursorM1470 = m1470();
        m1469(cursorM1470, i);
        return cursorM1470.isNull(i);
    }

    @Override // p000.InterfaceC0252
    public final void reset() {
        m6286();
        Cursor cursor = this.f2442;
        if (cursor != null) {
            cursor.close();
        }
        this.f2442 = null;
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۥؓ */
    public final void mo530(int i, String str) {
        m6286();
        m1471(3, i);
        this.f2440[i] = 3;
        this.f2443[i] = str;
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo531(int i) {
        m6286();
        m1471(5, i);
        this.f2440[i] = 5;
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۥُ */
    public final void mo532(long j, int i) {
        m6286();
        m1471(1, i);
        this.f2440[i] = 1;
        this.f2439[i] = j;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final Cursor m1470() {
        Cursor cursor = this.f2442;
        if (cursor != null) {
            return cursor;
        }
        C4773.m8154(21, "no row");
        throw null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m1471(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.f2440;
        if (iArr.length < i3) {
            this.f2440 = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.f2439;
            if (jArr.length < i3) {
                this.f2439 = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f2441;
            if (dArr.length < i3) {
                this.f2441 = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.f2443;
            if (strArr.length < i3) {
                this.f2443 = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.f2444;
        if (bArr.length < i3) {
            this.f2444 = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۦؗ */
    public final boolean mo533() {
        m6286();
        m1472();
        Cursor cursor = this.f2442;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        C1078.m2276("Required value was null.");
        return false;
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۦۗ */
    public final String mo534(int i) {
        m6286();
        Cursor cursorM1470 = m1470();
        m1469(cursorM1470, i);
        return cursorM1470.getString(i);
    }

    @Override // p000.InterfaceC0252
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo535(int i, byte[] bArr) {
        m6286();
        m1471(4, i);
        this.f2440[i] = 4;
        this.f2444[i] = bArr;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m1472() {
        if (this.f2442 == null) {
            C1039 c1039 = new C1039(13, this);
            C0956 c0956 = this.f11600;
            c0956.getClass();
            final C2081 c2081 = new C2081(1, c1039);
            this.f2442 = c0956.f3394.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ۥٌؘؚۣ
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) c2081.mo1822(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((C0661) c1039.f3672).f11599, C0956.f3391, null);
        }
    }
}
