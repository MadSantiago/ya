package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦُٚؔٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4555 implements InterfaceC2482, InterfaceC5109 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f15051;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f15052;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f15053;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f15054;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15055;

    public /* synthetic */ C4555(C0474 c0474, Iterable iterable, C1360 c1360, long j) {
        this.f15055 = 2;
        this.f15054 = c0474;
        this.f15051 = iterable;
        this.f15053 = c1360;
        this.f15052 = j;
    }

    @Override // p000.InterfaceC5109
    /* JADX INFO: renamed from: ۥؗ */
    public Object mo3986() {
        C0474 c0474 = (C0474) this.f15054;
        Iterable iterable = (Iterable) this.f15051;
        C1360 c1360 = (C1360) this.f15053;
        C1835 c1835 = (C1835) c0474.f1722;
        c1835.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(C1835.m3606(iterable));
            SQLiteDatabase sQLiteDatabaseM3610 = c1835.m3610();
            sQLiteDatabaseM3610.beginTransaction();
            try {
                sQLiteDatabaseM3610.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseM3610.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c1835.m3608(cursorRawQuery.getInt(0), EnumC2114.f6945, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseM3610.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM3610.setTransactionSuccessful();
                sQLiteDatabaseM3610.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseM3610.endTransaction();
                throw th2;
            }
        }
        c1835.m3611(new C3829(((InterfaceC5375) c0474.f1730).mo7674() + this.f15052, c1360));
        return null;
    }

    @Override // p000.InterfaceC2482
    /* JADX INFO: renamed from: ۥۣ */
    public ScheduledFuture mo4641(C4228 c4228) {
        int i = this.f15055;
        Object obj = this.f15053;
        long j = this.f15052;
        Object obj2 = this.f15051;
        ScheduledExecutorServiceC2597 scheduledExecutorServiceC2597 = (ScheduledExecutorServiceC2597) this.f15054;
        switch (i) {
            case 0:
                return scheduledExecutorServiceC2597.f8679.schedule(new RunnableC1091(scheduledExecutorServiceC2597, (Runnable) obj2, c4228, 1), j, (TimeUnit) obj);
            default:
                return scheduledExecutorServiceC2597.f8679.schedule(new CallableC2140(scheduledExecutorServiceC2597, (Callable) obj2, c4228, 0), j, (TimeUnit) obj);
        }
    }

    public /* synthetic */ C4555(ScheduledExecutorServiceC2597 scheduledExecutorServiceC2597, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f15055 = i;
        this.f15054 = scheduledExecutorServiceC2597;
        this.f15051 = obj;
        this.f15052 = j;
        this.f15053 = timeUnit;
    }
}
