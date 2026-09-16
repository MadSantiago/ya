package p000;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: renamed from: ۥؖؕٔؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0538 implements InterfaceC5043 {

    /* JADX INFO: renamed from: ۦۨ */
    public final SQLiteProgram f1904;

    public C0538(SQLiteProgram sQLiteProgram) {
        this.f1904 = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1904.close();
    }

    @Override // p000.InterfaceC5043
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1231(int i) {
        this.f1904.bindNull(i);
    }

    @Override // p000.InterfaceC5043
    /* JADX INFO: renamed from: ۥُ */
    public final void mo1232(long j, int i) {
        this.f1904.bindLong(i, j);
    }

    @Override // p000.InterfaceC5043
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo1233(int i, String str) {
        this.f1904.bindString(i, str);
    }

    @Override // p000.InterfaceC5043
    /* JADX INFO: renamed from: ۦۙ */
    public final void mo1234(int i, byte[] bArr) {
        this.f1904.bindBlob(i, bArr);
    }

    @Override // p000.InterfaceC5043
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo1235(double d, int i) {
        this.f1904.bindDouble(i, d);
    }
}
