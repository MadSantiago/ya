package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦۥٌؒؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5695 extends AbstractC4351 {

    /* JADX INFO: renamed from: ۥَ */
    public volatile Boolean f18731;

    /* JADX INFO: renamed from: ۥْ */
    public final ServiceConnectionC0769 f18732;

    /* JADX INFO: renamed from: ۥٓ */
    public InterfaceC5253 f18733;

    /* JADX INFO: renamed from: ۥٖ */
    public final C4709 f18734;

    /* JADX INFO: renamed from: ۥۖ */
    public final ArrayList f18735;

    /* JADX INFO: renamed from: ۦٕ */
    public final C4709 f18736;

    /* JADX INFO: renamed from: ۦٗ */
    public ScheduledExecutorService f18737;

    /* JADX INFO: renamed from: ۦۛ */
    public final C2494 f18738;

    public C5695(C5371 c5371) {
        super(c5371);
        this.f18735 = new ArrayList();
        this.f18738 = new C2494(c5371.f17719);
        this.f18732 = new ServiceConnectionC0769(this);
        this.f18734 = new C4709(this, c5371, 0);
        this.f18736 = new C4709(this, c5371, 1);
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final boolean m9506() {
        mo6517();
        m7643();
        if (!m9518()) {
            return true;
        }
        C1512 c1512 = ((C5371) this.f18660).f17721;
        C5371.m9021(c1512);
        return c1512.m3242() >= 241200;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final boolean m9507() {
        mo6517();
        m7643();
        if (!m9518()) {
            return true;
        }
        C1512 c1512 = ((C5371) this.f18660).f17721;
        C5371.m9021(c1512);
        return c1512.m3242() >= ((Integer) AbstractC4936.f16334.m4592(null)).intValue();
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m9508() {
        ((C5371) this.f18660).getClass();
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m9509(Runnable runnable) {
        mo6517();
        if (m9515()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f18735;
        long size = arrayList.size();
        C5371 c5371 = (C5371) this.f18660;
        C0515 c0515 = c5371.f17715;
        if (size >= 1000) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f18736.m2199(60000L);
            m9511();
        }
    }

    @Override // p000.AbstractC4351
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo3853() {
        return false;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m9510() {
        mo6517();
        m7643();
        ServiceConnectionC0769 serviceConnectionC0769 = this.f18732;
        if (serviceConnectionC0769.f2786 != null && (serviceConnectionC0769.f2786.m7337() || serviceConnectionC0769.f2786.m7330())) {
            serviceConnectionC0769.f2786.m7345();
        }
        serviceConnectionC0769.f2786 = null;
        try {
            C4601.m8000().m8002(((C5371) this.f18660).f17739, serviceConnectionC0769);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f18733 = null;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m9511() {
        mo6517();
        m7643();
        if (m9515()) {
            return;
        }
        if (m9518()) {
            ServiceConnectionC0769 serviceConnectionC0769 = this.f18732;
            C5695 c5695 = serviceConnectionC0769.f2785;
            c5695.mo6517();
            Context context = ((C5371) c5695.f18660).f17739;
            synchronized (serviceConnectionC0769) {
                try {
                    if (serviceConnectionC0769.f2787) {
                        C3610 c3610 = ((C5371) serviceConnectionC0769.f2785.f18660).f17717;
                        C5371.m9020(c3610);
                        c3610.f12023.m9432("Connection attempt already in progress");
                        return;
                    } else {
                        if (serviceConnectionC0769.f2786 != null && (serviceConnectionC0769.f2786.m7330() || serviceConnectionC0769.f2786.m7337())) {
                            C3610 c3611 = ((C5371) serviceConnectionC0769.f2785.f18660).f17717;
                            C5371.m9020(c3611);
                            c3611.f12023.m9432("Already awaiting connection attempt");
                            return;
                        }
                        serviceConnectionC0769.f2786 = new C2421(context, Looper.getMainLooper(), C3827.m6820(context), C0600.f2225, 93, serviceConnectionC0769, serviceConnectionC0769, null);
                        C3610 c3612 = ((C5371) serviceConnectionC0769.f2785.f18660).f17717;
                        C5371.m9020(c3612);
                        c3612.f12023.m9432("Connecting to remote service");
                        serviceConnectionC0769.f2787 = true;
                        AbstractC0487.m1047(serviceConnectionC0769.f2786);
                        serviceConnectionC0769.f2786.m7340();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C5371 c5371 = (C5371) this.f18660;
        if (c5371.f17715.m1158()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = c5371.f17739.getPackageManager().queryIntentServices(new Intent().setClassName(c5371.f17739, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            C3610 c3613 = c5371.f17717;
            C5371.m9020(c3613);
            c3613.f12020.m9432("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(c5371.f17739, "com.google.android.gms.measurement.AppMeasurementService"));
        ServiceConnectionC0769 serviceConnectionC07610 = this.f18732;
        C5695 c5696 = serviceConnectionC07610.f2785;
        c5696.mo6517();
        Context context2 = ((C5371) c5696.f18660).f17739;
        C4601 c4601M8000 = C4601.m8000();
        synchronized (serviceConnectionC07610) {
            try {
                boolean z = serviceConnectionC07610.f2787;
                C5695 c5697 = serviceConnectionC07610.f2785;
                C5371 c5372 = (C5371) c5697.f18660;
                if (z) {
                    C3610 c3614 = c5372.f17717;
                    C5371.m9020(c3614);
                    c3614.f12023.m9432("Connection attempt already in progress");
                } else {
                    C3610 c3615 = c5372.f17717;
                    C5371.m9020(c3615);
                    c3615.f12023.m9432("Using local app measurement service");
                    serviceConnectionC07610.f2787 = true;
                    c4601M8000.m8001(context2, context2.getClass().getName(), intent, c5697.f18732, 129, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final void m9512() {
        mo6517();
        C5371 c5371 = (C5371) this.f18660;
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3610);
        C5590 c5590 = c3610.f12023;
        ArrayList arrayList = this.f18735;
        c5590.m9430(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12020.m9430(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f18736.m2198();
    }

    /* JADX WARN: Code duplicated, block: B:258:0x0439 A[Catch: all -> 0x0475, TRY_ENTER, TryCatch #51 {all -> 0x0475, blocks: (B:268:0x0465, B:258:0x0439, B:260:0x043f, B:261:0x0442, B:278:0x0486, B:207:0x0370, B:209:0x037a, B:214:0x038b), top: B:396:0x0465 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0451  */
    /* JADX WARN: Code duplicated, block: B:271:0x046c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0471 A[PHI: r4 r6 r23 r24 r26 r36 r37
  0x0471: PHI (r4v15 android.database.sqlite.SQLiteDatabase) = 
  (r4v12 android.database.sqlite.SQLiteDatabase)
  (r4v13 android.database.sqlite.SQLiteDatabase)
  (r4v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]
  0x0471: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:264:0x0454, B:281:0x0498, B:272:0x046f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x0495  */
    /* JADX WARN: Code duplicated, block: B:285:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:287:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:300:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:302:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:304:0x0504  */
    /* JADX WARN: Code duplicated, block: B:305:0x058e  */
    /* JADX WARN: Code duplicated, block: B:316:0x05bb A[Catch: RemoteException -> 0x05ea, TRY_LEAVE, TryCatch #45 {RemoteException -> 0x05ea, blocks: (B:314:0x05b0, B:316:0x05bb), top: B:392:0x05b0 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:338:0x0626  */
    /* JADX WARN: Code duplicated, block: B:340:0x062a  */
    /* JADX WARN: Code duplicated, block: B:342:0x064b  */
    /* JADX WARN: Code duplicated, block: B:348:0x066a  */
    /* JADX WARN: Code duplicated, block: B:354:0x0682  */
    /* JADX WARN: Code duplicated, block: B:362:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:384:0x0657 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x066e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0596 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x049b A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۦ */
    public final void m9513(InterfaceC5253 interfaceC5253, AbstractC0071 abstractC0071, C5855 c5855) throws Throwable {
        ArrayList arrayList;
        C5371 c5371;
        Context context;
        C3610 c3610;
        int i;
        SQLiteDatabase sQLiteDatabaseM9082;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        C5645 c5645CreateFromParcel;
        int i5;
        C1513 c1513CreateFromParcel;
        C1477 c1477CreateFromParcel;
        int size;
        int size2;
        int i6;
        C5650 c5650;
        AbstractC0071 abstractC0072;
        C2462 c2462;
        C5371 c5372;
        Context context2;
        C3610 c3611;
        long jElapsedRealtime;
        long j3;
        C5460 c5460;
        long jCurrentTimeMillis;
        C5460 c5461;
        String str2;
        mo6517();
        m7643();
        m9508();
        C5371 c5373 = (C5371) this.f18660;
        C0515 c0515 = c5373.f17715;
        Context context3 = c5373.f17739;
        C0515 c0516 = c5373.f17715;
        C3610 c3612 = c5373.f17717;
        C1397 c1397 = c5373.f17719;
        int i7 = 100;
        C5855 c5856 = c5855;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i9 == i7; i9 = size) {
            ArrayList arrayList2 = new ArrayList();
            C5403 c5403M9026 = c5373.m9026();
            String str3 = "entry";
            int i10 = i7;
            String str4 = "type";
            String str5 = "rowid";
            C1397 c1398 = c1397;
            C5371 c5374 = (C5371) c5403M9026.f18660;
            c5403M9026.mo6517();
            int i11 = i8;
            if (c5403M9026.f17849) {
                c5371 = c5373;
                context = context3;
                c3610 = c3612;
            } else {
                arrayList = new ArrayList();
                c5371 = c5373;
                if (((C5371) c5403M9026.f18660).f17739.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i12 = 5;
                    context = context3;
                    c3610 = c3612;
                    int i13 = 0;
                    int i14 = 5;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                sQLiteDatabaseM9082 = c5403M9026.m9082();
                                if (sQLiteDatabaseM9082 == null) {
                                    try {
                                        try {
                                            c5403M9026.f17849 = true;
                                        } catch (SQLiteDatabaseLockedException unused) {
                                            i2 = i13;
                                            str5 = str5;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            try {
                                                SystemClock.sleep(i14);
                                                i14 += 20;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabaseM9082 != null) {
                                                    sQLiteDatabaseM9082.close();
                                                }
                                                i13 = i2 + 1;
                                                i12 = i3;
                                                str4 = str4;
                                                str3 = str3;
                                                str5 = str5;
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabaseM9082 != null) {
                                                    sQLiteDatabaseM9082.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            i2 = i13;
                                            str5 = str5;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            C3610 c3613 = c5374.f17717;
                                            C5371.m9020(c3613);
                                            c3613.f12020.m9430(e, "Error reading entries from local database");
                                            c5403M9026.f17849 = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM9082 != null) {
                                                sQLiteDatabaseM9082.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            i2 = i13;
                                            str5 = str5;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            if (sQLiteDatabaseM9082 != null) {
                                                sQLiteDatabaseM9082.endTransaction();
                                            }
                                            C3610 c3614 = c5374.f17717;
                                            C5371.m9020(c3614);
                                            c3614.f12020.m9430(e, "Error reading entries from local database");
                                            c5403M9026.f17849 = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM9082 != null) {
                                                sQLiteDatabaseM9082.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseM9082 != null) {
                                            sQLiteDatabaseM9082.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    sQLiteDatabaseM9082.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseM9082.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j4 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i13;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM9082 != null) {
                                                            sQLiteDatabaseM9082.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        C3610 c3615 = c5374.f17717;
                                                        C5371.m9020(c3615);
                                                        c3615.f12020.m9430(e, "Error reading entries from local database");
                                                        c5403M9026.f17849 = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM9082 != null) {
                                                            sQLiteDatabaseM9082.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM9082 != null && sQLiteDatabaseM9082.inTransaction()) {
                                                            sQLiteDatabaseM9082.endTransaction();
                                                        }
                                                        C3610 c3616 = c5374.f17717;
                                                        C5371.m9020(c3616);
                                                        c3616.f12020.m9430(e, "Error reading entries from local database");
                                                        c5403M9026.f17849 = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM9082 != null) {
                                                            sQLiteDatabaseM9082.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM9082 != null) {
                                                                sQLiteDatabaseM9082.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            C3610 c3617 = c5374.f17717;
                                                            C5371.m9020(c3617);
                                                            c3617.f12020.m9430(e, "Error reading entries from local database");
                                                            c5403M9026.f17849 = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM9082 != null) {
                                                                sQLiteDatabaseM9082.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseM9082 != null) {
                                                                sQLiteDatabaseM9082.endTransaction();
                                                            }
                                                            C3610 c3618 = c5374.f17717;
                                                            C5371.m9020(c3618);
                                                            c3618.f12020.m9430(e, "Error reading entries from local database");
                                                            c5403M9026.f17849 = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM9082 != null) {
                                                                sQLiteDatabaseM9082.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseM9082 != null) {
                                                                sQLiteDatabaseM9082.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i13;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                C0515 c0517 = c5374.f17715;
                                                C2462 c2463 = AbstractC4936.f19569;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i15 = 4;
                                                        int i16 = 3;
                                                        if (c0517.m1162(null, c2463)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM9082 != null) {
                                                                    sQLiteDatabaseM9082.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                C3610 c3619 = c5374.f17717;
                                                                C5371.m9020(c3619);
                                                                c3619.f12020.m9430(e, "Error reading entries from local database");
                                                                c5403M9026.f17849 = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM9082 != null) {
                                                                    sQLiteDatabaseM9082.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseM9082 != null) {
                                                                    sQLiteDatabaseM9082.endTransaction();
                                                                }
                                                                C3610 c36110 = c5374.f17717;
                                                                C5371.m9020(c36110);
                                                                c36110.f12020.m9430(e, "Error reading entries from local database");
                                                                c5403M9026.f17849 = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM9082 != null) {
                                                                    sQLiteDatabaseM9082.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseM9082.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j4 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i17 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (c5374.f17715.m1162(null, c2463)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i16);
                                                                                                j2 = cursorQuery.getLong(i15);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM9082 != null) {
                                                                                                    sQLiteDatabaseM9082.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                i3 = 5;
                                                                                                C3610 c36111 = c5374.f17717;
                                                                                                C5371.m9020(c36111);
                                                                                                c36111.f12020.m9430(e, "Error reading entries from local database");
                                                                                                c5403M9026.f17849 = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM9082 != null) {
                                                                                                    sQLiteDatabaseM9082.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseM9082 != null) {
                                                                                                    sQLiteDatabaseM9082.endTransaction();
                                                                                                }
                                                                                                C3610 c36112 = c5374.f17717;
                                                                                                C5371.m9020(c36112);
                                                                                                c36112.f12020.m9430(e, "Error reading entries from local database");
                                                                                                c5403M9026.f17849 = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM9082 != null) {
                                                                                                    sQLiteDatabaseM9082.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i17 == 0) {
                                                                                            cursorQuery = cursorQuery;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            C2679 c2679CreateFromParcel = C2679.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (c2679CreateFromParcel != null) {
                                                                                                                arrayList.add(new C5650(c2679CreateFromParcel, string, j2));
                                                                                                            }
                                                                                                        } catch (Throwable th5) {
                                                                                                            parcelObtain.recycle();
                                                                                                            throw th5;
                                                                                                        }
                                                                                                    } catch (C3805 unused6) {
                                                                                                        C3610 c36113 = c5374.f17717;
                                                                                                        C5371.m9020(c36113);
                                                                                                        c36113.f12020.m9432("Failed to load event from local database");
                                                                                                        parcelObtain.recycle();
                                                                                                    }
                                                                                                } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                    sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                    i3 = 5;
                                                                                                    SystemClock.sleep(i14);
                                                                                                    i14 += 20;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM9082 != null) {
                                                                                                        sQLiteDatabaseM9082.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteFullException e11) {
                                                                                                    e = e11;
                                                                                                    sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                    i3 = 5;
                                                                                                    C3610 c36114 = c5374.f17717;
                                                                                                    C5371.m9020(c36114);
                                                                                                    c36114.f12020.m9430(e, "Error reading entries from local database");
                                                                                                    c5403M9026.f17849 = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM9082 != null) {
                                                                                                        sQLiteDatabaseM9082.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteException e12) {
                                                                                                    e = e12;
                                                                                                    sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                    i3 = 5;
                                                                                                    if (sQLiteDatabaseM9082 != null) {
                                                                                                        sQLiteDatabaseM9082.endTransaction();
                                                                                                    }
                                                                                                    C3610 c36115 = c5374.f17717;
                                                                                                    C5371.m9020(c36115);
                                                                                                    c36115.f12020.m9430(e, "Error reading entries from local database");
                                                                                                    c5403M9026.f17849 = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM9082 != null) {
                                                                                                        sQLiteDatabaseM9082.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                }
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                                sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                cursor = cursorQuery;
                                                                                                if (cursor != null) {
                                                                                                    cursor.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM9082 != null) {
                                                                                                    sQLiteDatabaseM9082.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } else {
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i17 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        c1477CreateFromParcel = C1477.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (C3805 unused8) {
                                                                                                        C3610 c36116 = c5374.f17717;
                                                                                                        C5371.m9020(c36116);
                                                                                                        c36116.f12020.m9432("Failed to load user property from local database");
                                                                                                        parcelObtain2.recycle();
                                                                                                        c1477CreateFromParcel = null;
                                                                                                    }
                                                                                                    if (c1477CreateFromParcel != null) {
                                                                                                        arrayList.add(new C5650(c1477CreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } catch (Throwable th7) {
                                                                                                    parcelObtain2.recycle();
                                                                                                    throw th7;
                                                                                                }
                                                                                            } else {
                                                                                                if (i17 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            c1513CreateFromParcel = C1513.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (Throwable th8) {
                                                                                                            parcelObtain3.recycle();
                                                                                                            throw th8;
                                                                                                        }
                                                                                                    } catch (C3805 unused9) {
                                                                                                        C3610 c36117 = c5374.f17717;
                                                                                                        C5371.m9020(c36117);
                                                                                                        c36117.f12020.m9432("Failed to load conditional user property from local database");
                                                                                                        parcelObtain3.recycle();
                                                                                                        c1513CreateFromParcel = null;
                                                                                                    }
                                                                                                    if (c1513CreateFromParcel != null) {
                                                                                                        arrayList.add(new C5650(c1513CreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } else if (i17 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    c5645CreateFromParcel = C5645.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i14);
                                                                                                                        i14 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM9082 != null) {
                                                                                                                            sQLiteDatabaseM9082.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e13) {
                                                                                                                        e = e13;
                                                                                                                        sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                                        i3 = 5;
                                                                                                                        C3610 c36118 = c5374.f17717;
                                                                                                                        C5371.m9020(c36118);
                                                                                                                        c36118.f12020.m9430(e, "Error reading entries from local database");
                                                                                                                        c5403M9026.f17849 = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM9082 != null) {
                                                                                                                            sQLiteDatabaseM9082.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseM9082 != null) {
                                                                                                                            sQLiteDatabaseM9082.endTransaction();
                                                                                                                        }
                                                                                                                        C3610 c36119 = c5374.f17717;
                                                                                                                        C5371.m9020(c36119);
                                                                                                                        c36119.f12020.m9430(e, "Error reading entries from local database");
                                                                                                                        c5403M9026.f17849 = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM9082 != null) {
                                                                                                                            sQLiteDatabaseM9082.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (C3805 unused11) {
                                                                                                                    C3610 c36120 = c5374.f17717;
                                                                                                                    C5371.m9020(c36120);
                                                                                                                    c36120.f12020.m9432("Failed to load default event parameters from local database");
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    c5645CreateFromParcel = null;
                                                                                                                }
                                                                                                                if (c5645CreateFromParcel != null) {
                                                                                                                    arrayList.add(new C5650(c5645CreateFromParcel, string, j2));
                                                                                                                }
                                                                                                                i5 = 3;
                                                                                                            } catch (Throwable th9) {
                                                                                                                th = th9;
                                                                                                                parcelObtain4.recycle();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (C3805 unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i14);
                                                                                                        i14 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM9082 != null) {
                                                                                                            sQLiteDatabaseM9082.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                        e = e15;
                                                                                                        sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                        i3 = 5;
                                                                                                        C3610 c361110 = c5374.f17717;
                                                                                                        C5371.m9020(c361110);
                                                                                                        c361110.f12020.m9430(e, "Error reading entries from local database");
                                                                                                        c5403M9026.f17849 = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM9082 != null) {
                                                                                                            sQLiteDatabaseM9082.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e16) {
                                                                                                        e = e16;
                                                                                                        sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseM9082 != null) {
                                                                                                            sQLiteDatabaseM9082.endTransaction();
                                                                                                        }
                                                                                                        C3610 c361111 = c5374.f17717;
                                                                                                        C5371.m9020(c361111);
                                                                                                        c361111.f12020.m9430(e, "Error reading entries from local database");
                                                                                                        c5403M9026.f17849 = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM9082 != null) {
                                                                                                            sQLiteDatabaseM9082.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    C3610 c36121 = c5374.f17717;
                                                                                                    i5 = 3;
                                                                                                    if (i17 == 3) {
                                                                                                        C5371.m9020(c36121);
                                                                                                        c36121.f12023.m9432("Skipping app launch break");
                                                                                                    } else {
                                                                                                        C5371.m9020(c36121);
                                                                                                        c36121.f12020.m9432("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i16 = i5;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                c2463 = c2463;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i15 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i16 = i5;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        c2463 = c2463;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i15 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i14);
                                                                                    i14 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM9082 != null) {
                                                                                        sQLiteDatabaseM9082.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e19) {
                                                                                    e = e19;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                    i3 = 5;
                                                                                    C3610 c361112 = c5374.f17717;
                                                                                    C5371.m9020(c361112);
                                                                                    c361112.f12020.m9430(e, "Error reading entries from local database");
                                                                                    c5403M9026.f17849 = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM9082 != null) {
                                                                                        sQLiteDatabaseM9082.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e20) {
                                                                                    e = e20;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseM9082 != null) {
                                                                                        sQLiteDatabaseM9082.endTransaction();
                                                                                    }
                                                                                    C3610 c361113 = c5374.f17717;
                                                                                    C5371.m9020(c361113);
                                                                                    c361113.f12020.m9430(e, "Error reading entries from local database");
                                                                                    c5403M9026.f17849 = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM9082 != null) {
                                                                                        sQLiteDatabaseM9082.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e21) {
                                                                                e = e21;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e22) {
                                                                                e = e22;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e23) {
                                                                            e = e23;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused18) {
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteFullException e25) {
                                                                        e = e25;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteException e26) {
                                                                        e = e26;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    cursorQuery = cursorQuery;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i = 0;
                                                            sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                            try {
                                                                if (sQLiteDatabaseM9082.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                    C3610 c36122 = c5374.f17717;
                                                                    C5371.m9020(c36122);
                                                                    c36122.f12020.m9432("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseM9082.setTransactionSuccessful();
                                                                sQLiteDatabaseM9082.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseM9082.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM9082 != null) {
                                                                    sQLiteDatabaseM9082.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e27) {
                                                                e = e27;
                                                                i3 = 5;
                                                                C3610 c361114 = c5374.f17717;
                                                                C5371.m9020(c361114);
                                                                c361114.f12020.m9430(e, "Error reading entries from local database");
                                                                c5403M9026.f17849 = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM9082 != null) {
                                                                    sQLiteDatabaseM9082.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e28) {
                                                                e = e28;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseM9082 != null) {
                                                                    sQLiteDatabaseM9082.endTransaction();
                                                                }
                                                                C3610 c361115 = c5374.f17717;
                                                                C5371.m9020(c361115);
                                                                c361115.f12020.m9430(e, "Error reading entries from local database");
                                                                c5403M9026.f17849 = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM9082 != null) {
                                                                    sQLiteDatabaseM9082.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                            str4 = str4;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM9082 != null) {
                                                                sQLiteDatabaseM9082.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteFullException e29) {
                                                        e = e29;
                                                        str3 = str3;
                                                        sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        C3610 c361116 = c5374.f17717;
                                                        C5371.m9020(c361116);
                                                        c361116.f12020.m9430(e, "Error reading entries from local database");
                                                        c5403M9026.f17849 = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM9082 != null) {
                                                            sQLiteDatabaseM9082.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e30) {
                                                        e = e30;
                                                        str3 = str3;
                                                        sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM9082 != null) {
                                                            sQLiteDatabaseM9082.endTransaction();
                                                        }
                                                        C3610 c361117 = c5374.f17717;
                                                        C5371.m9020(c361117);
                                                        c361117.f12020.m9430(e, "Error reading entries from local database");
                                                        c5403M9026.f17849 = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM9082 != null) {
                                                            sQLiteDatabaseM9082.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    str3 = str3;
                                                    sQLiteDatabaseM9082 = sQLiteDatabaseM9082;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    SystemClock.sleep(i14);
                                                    i14 += 20;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM9082 != null) {
                                                        sQLiteDatabaseM9082.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e31) {
                                                e = e31;
                                                str5 = str5;
                                            } catch (SQLiteException e32) {
                                                e = e32;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i2 = i13;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i2 = i13;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM9082 = null;
                            } catch (SQLiteFullException e33) {
                                e = e33;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM9082 = null;
                            } catch (SQLiteException e34) {
                                e = e34;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM9082 = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseM9082 = null;
                            }
                        } else {
                            i = 0;
                            C3610 c36123 = c5374.f17717;
                            C5371.m9020(c36123);
                            c36123.f12022.m9432("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i13 = i2 + 1;
                        i12 = i3;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    c3610 = c3612;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (abstractC0071 != null && size < i10) {
                    arrayList2.add(new C5650(abstractC0071, c5856.f19313, c5856.f19331));
                }
                size2 = arrayList2.size();
                i6 = i;
                while (i6 < size2) {
                    c5650 = (C5650) arrayList2.get(i6);
                    abstractC0072 = c5650.f18606;
                    c2462 = AbstractC4936.f19569;
                    if (c0516.m1162(null, c2462)) {
                        str2 = c5650.f18605;
                        if (!TextUtils.isEmpty(str2)) {
                            c5856 = new C5855(c5856.f19339, c5856.f19337, str2, c5650.f18604, c5856.f19314, c5856.f19312, c5856.f19316, c5856.f19333, c5856.f19335, c5856.f19321, c5856.f19318, c5856.f19310, c5856.f19308, c5856.f19325, c5856.f19311, c5856.f19334, c5856.f19315, c5856.f19322, c5856.f19329, c5856.f19327, c5856.f19324, c5856.f19328, c5856.f19330, c5856.f19332, c5856.f19309, c5856.f19336, c5856.f19338, c5856.f19317, c5856.f19319, c5856.f19323, c5856.f19326, c5856.f19320);
                        }
                    }
                    if (abstractC0072 instanceof C2679) {
                        try {
                            c1398.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                c1398.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        interfaceC5253.mo6922((C2679) abstractC0072, c5856);
                                        C5371.m9020(c3610);
                                        c3611 = c3610;
                                        try {
                                            c3611.f12023.m9432("Logging telemetry for logEvent from database");
                                            c5461 = C5460.f17997;
                                            if (c5461 == null) {
                                                c5372 = c5371;
                                                context2 = context;
                                                try {
                                                    c5461 = new C5460(context2, c5372);
                                                    C5460.f17997 = c5461;
                                                } catch (RemoteException e35) {
                                                    e = e35;
                                                    j3 = jCurrentTimeMillis;
                                                    C5371.m9020(c3611);
                                                    c3611.f12020.m9430(e, "Failed to send event to the service");
                                                    if (j3 != 0) {
                                                        c5460 = C5460.f17997;
                                                        if (c5460 == null) {
                                                            c5460 = new C5460(context2, c5372);
                                                            C5460.f17997 = c5460;
                                                        }
                                                        c1398.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        c1398.getClass();
                                                        c5460.m9132(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                c5372 = c5371;
                                                context2 = context;
                                            }
                                            C5460 c5462 = c5461;
                                            c1398.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            c1398.getClass();
                                            c5462.m9132(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e36) {
                                            e = e36;
                                            c5372 = c5371;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e37) {
                                        e = e37;
                                        c5372 = c5371;
                                        context2 = context;
                                        c3611 = c3610;
                                        j3 = jCurrentTimeMillis;
                                        C5371.m9020(c3611);
                                        c3611.f12020.m9430(e, "Failed to send event to the service");
                                        if (j3 != 0) {
                                            c5460 = C5460.f17997;
                                            if (c5460 == null) {
                                                c5460 = new C5460(context2, c5372);
                                                C5460.f17997 = c5460;
                                            }
                                            c1398.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            c1398.getClass();
                                            c5460.m9132(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                        }
                                        i6++;
                                        c3610 = c3611;
                                        c5371 = c5372;
                                        context = context2;
                                        size = size;
                                    }
                                } catch (RemoteException e38) {
                                    e = e38;
                                }
                            } catch (RemoteException e39) {
                                e = e39;
                                c5372 = c5371;
                                context2 = context;
                                c3611 = c3610;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e40) {
                            e = e40;
                            c5372 = c5371;
                            context2 = context;
                            c3611 = c3610;
                            jElapsedRealtime = 0;
                            j3 = 0;
                        }
                    } else {
                        c5372 = c5371;
                        context2 = context;
                        c3611 = c3610;
                        if (abstractC0072 instanceof C1477) {
                            try {
                                interfaceC5253.mo6921((C1477) abstractC0072, c5856);
                            } catch (RemoteException e41) {
                                C5371.m9020(c3611);
                                c3611.f12020.m9430(e41, "Failed to send user property to the service");
                            }
                        } else {
                            if (abstractC0072 instanceof C1513) {
                                try {
                                    interfaceC5253.mo6924((C1513) abstractC0072, c5856);
                                } catch (RemoteException e42) {
                                    C5371.m9020(c3611);
                                    c3611.f12020.m9430(e42, "Failed to send conditional user property to the service");
                                }
                            } else if (c0516.m1162(null, c2462) || !(abstractC0072 instanceof C5645)) {
                                C5371.m9020(c3611);
                                c3611.f12020.m9432("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    interfaceC5253.mo6908(((C5645) abstractC0072).m9478(), c5856);
                                } catch (RemoteException e43) {
                                    C5371.m9020(c3611);
                                    c3611.f12020.m9430(e43, "Failed to send default event parameters to the service");
                                }
                            }
                            i6++;
                            c3610 = c3611;
                            c5371 = c5372;
                            context = context2;
                            size = size;
                        }
                    }
                    i6++;
                    c3610 = c3611;
                    c5371 = c5372;
                    context = context2;
                    size = size;
                }
                c3612 = c3610;
                c5373 = c5371;
                context3 = context;
                c1397 = c1398;
                i7 = 100;
                i8 = i11 + 1;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (abstractC0071 != null) {
                arrayList2.add(new C5650(abstractC0071, c5856.f19313, c5856.f19331));
            }
            size2 = arrayList2.size();
            i6 = i;
            while (i6 < size2) {
                c5650 = (C5650) arrayList2.get(i6);
                abstractC0072 = c5650.f18606;
                c2462 = AbstractC4936.f19569;
                if (c0516.m1162(null, c2462)) {
                    str2 = c5650.f18605;
                    if (!TextUtils.isEmpty(str2)) {
                        c5856 = new C5855(c5856.f19339, c5856.f19337, str2, c5650.f18604, c5856.f19314, c5856.f19312, c5856.f19316, c5856.f19333, c5856.f19335, c5856.f19321, c5856.f19318, c5856.f19310, c5856.f19308, c5856.f19325, c5856.f19311, c5856.f19334, c5856.f19315, c5856.f19322, c5856.f19329, c5856.f19327, c5856.f19324, c5856.f19328, c5856.f19330, c5856.f19332, c5856.f19309, c5856.f19336, c5856.f19338, c5856.f19317, c5856.f19319, c5856.f19323, c5856.f19326, c5856.f19320);
                    }
                }
                if (abstractC0072 instanceof C2679) {
                    c1398.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    c1398.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    interfaceC5253.mo6922((C2679) abstractC0072, c5856);
                    C5371.m9020(c3610);
                    c3611 = c3610;
                    c3611.f12023.m9432("Logging telemetry for logEvent from database");
                    c5461 = C5460.f17997;
                    if (c5461 == null) {
                        c5372 = c5371;
                        context2 = context;
                        c5461 = new C5460(context2, c5372);
                        C5460.f17997 = c5461;
                    } else {
                        c5372 = c5371;
                        context2 = context;
                    }
                    C5460 c5463 = c5461;
                    c1398.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    c1398.getClass();
                    c5463.m9132(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis5);
                } else {
                    c5372 = c5371;
                    context2 = context;
                    c3611 = c3610;
                    if (abstractC0072 instanceof C1477) {
                        interfaceC5253.mo6921((C1477) abstractC0072, c5856);
                    } else {
                        if (abstractC0072 instanceof C1513) {
                            interfaceC5253.mo6924((C1513) abstractC0072, c5856);
                        } else if (c0516.m1162(null, c2462)) {
                            C5371.m9020(c3611);
                            c3611.f12020.m9432("Discarding data. Unrecognized parcel type.");
                        } else {
                            C5371.m9020(c3611);
                            c3611.f12020.m9432("Discarding data. Unrecognized parcel type.");
                        }
                        i6++;
                        c3610 = c3611;
                        c5371 = c5372;
                        context = context2;
                        size = size;
                    }
                }
                i6++;
                c3610 = c3611;
                c5371 = c5372;
                context = context2;
                size = size;
            }
            c3612 = c3610;
            c5373 = c5371;
            context3 = context;
            c1397 = c1398;
            i7 = 100;
            i8 = i11 + 1;
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m9514(ComponentName componentName) {
        mo6517();
        if (this.f18733 != null) {
            this.f18733 = null;
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12023.m9430(componentName, "Disconnected from device MeasurementService");
            mo6517();
            m9511();
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final boolean m9515() {
        mo6517();
        m7643();
        return this.f18733 != null;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final void m9516(C1513 c1513) {
        boolean zM9083;
        mo6517();
        m7643();
        C5371 c5371 = (C5371) this.f18660;
        c5371.getClass();
        C5403 c5403M9026 = c5371.m9026();
        C5371 c5372 = (C5371) c5403M9026.f18660;
        C5371.m9021(c5372.f17721);
        byte[] bArrM3190 = C1512.m3190(c1513);
        if (bArrM3190.length > 131072) {
            C3610 c3610 = c5372.f17717;
            C5371.m9020(c3610);
            c3610.f12025.m9432("Conditional user property too long for local database. Sending directly to service");
            zM9083 = false;
        } else {
            zM9083 = c5403M9026.m9083(2, bArrM3190);
        }
        m9509(new RunnableC5642(this, m9517(true), zM9083, new C1513(c1513)));
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final C5855 m9517(boolean z) {
        long jAbs;
        Pair pair;
        C5371 c5371 = (C5371) this.f18660;
        c5371.getClass();
        C1968 c1968M9029 = c5371.m9029();
        String strM6622 = null;
        if (z) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            C5371 c5372 = (C5371) c3610.f18660;
            C4474 c4474 = c5372.f17713;
            C5371.m9021(c4474);
            if (c4474.f14755 != null) {
                C4474 c4475 = c5372.f17713;
                C5371.m9021(c4475);
                C3250 c3250 = c4475.f14755;
                C4474 c4476 = (C4474) c3250.f10915;
                c4476.mo6517();
                c4476.mo6517();
                long j = ((C4474) c3250.f10915).m7755().getLong("health_monitor:start", 0L);
                if (j == 0) {
                    c3250.m5970();
                    jAbs = 0;
                } else {
                    ((C5371) c4476.f18660).f17719.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = c3250.f10916;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    c3250.m5970();
                    pair = null;
                } else {
                    String string = c4476.m7755().getString("health_monitor:value", null);
                    long j3 = c4476.m7755().getLong("health_monitor:count", 0L);
                    c3250.m5970();
                    pair = (string == null || j3 <= 0) ? C4474.f14750 : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != C4474.f14750) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strM6622 = AbstractC3761.m6622(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return c1968M9029.m3856(strM6622);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final boolean m9518() {
        mo6517();
        m7643();
        if (this.f18731 == null) {
            mo6517();
            m7643();
            C5371 c5371 = (C5371) this.f18660;
            C4474 c4474 = c5371.f17713;
            C5371.m9021(c4474);
            c4474.mo6517();
            boolean z = false;
            Boolean boolValueOf = !c4474.m7755().contains("use_service") ? null : Boolean.valueOf(c4474.m7755().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                C1968 c1968M9029 = ((C5371) this.f18660).m9029();
                c1968M9029.m7643();
                if (c1968M9029.f6514 == 1) {
                    z = true;
                } else {
                    C3610 c3610 = c5371.f17717;
                    C5371.m9020(c3610);
                    c3610.f12023.m9432("Checking service availability");
                    C1512 c1512 = c5371.f17721;
                    C5371.m9021(c1512);
                    int iM1308 = C0600.f2225.m1308(((C5371) c1512.f18660).f17739, 12451000);
                    if (iM1308 == 0) {
                        C3610 c3611 = c5371.f17717;
                        C5371.m9020(c3611);
                        c3611.f12023.m9432("Service available");
                    } else if (iM1308 == 1) {
                        C3610 c3612 = c5371.f17717;
                        C5371.m9020(c3612);
                        c3612.f12023.m9432("Service missing");
                    } else if (iM1308 != 2) {
                        if (iM1308 != 3) {
                            C3610 c3613 = c5371.f17717;
                            if (iM1308 == 9) {
                                C5371.m9020(c3613);
                                c3613.f12022.m9432("Service invalid");
                            } else if (iM1308 != 18) {
                                C5371.m9020(c3613);
                                c3613.f12022.m9430(Integer.valueOf(iM1308), "Unexpected service status");
                            } else {
                                C5371.m9020(c3613);
                                c3613.f12022.m9432("Service updating");
                            }
                        } else {
                            C3610 c3614 = c5371.f17717;
                            C5371.m9020(c3614);
                            c3614.f12022.m9432("Service disabled");
                        }
                        z2 = false;
                    } else {
                        C3610 c3615 = c5371.f17717;
                        C5371.m9020(c3615);
                        c3615.f12015.m9432("Service container out of date");
                        C1512 c1513 = c5371.f17721;
                        C5371.m9021(c1513);
                        if (c1513.m3242() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && c5371.f17715.m1158()) {
                    C3610 c3616 = c5371.f17717;
                    C5371.m9020(c3616);
                    c3616.f12020.m9432("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    C4474 c4475 = c5371.f17713;
                    C5371.m9021(c4475);
                    c4475.mo6517();
                    SharedPreferences.Editor editorEdit = c4475.m7755().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.f18731 = Boolean.valueOf(z2);
        }
        return this.f18731.booleanValue();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m9519(AtomicReference atomicReference) {
        mo6517();
        m7643();
        m9509(new RunnableC0624(this, atomicReference, m9517(false)));
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m9520() {
        mo6517();
        C2494 c2494 = this.f18738;
        c2494.getClass();
        c2494.f8292 = SystemClock.elapsedRealtime();
        C0515 c0515 = ((C5371) this.f18660).f17715;
        this.f18734.m2199(((Long) AbstractC4936.f16353.m4592(null)).longValue());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX INFO: renamed from: ۦۛ */
    public final void m9521(Bundle bundle) {
        boolean z;
        boolean zM9083;
        mo6517();
        m7643();
        C5645 c5645 = new C5645(bundle);
        m9508();
        C5371 c5371 = (C5371) this.f18660;
        if (c5371.f17715.m1162(null, AbstractC4936.f19569)) {
            C5403 c5403M9026 = c5371.m9026();
            C5371 c5372 = (C5371) c5403M9026.f18660;
            C1512 c1512 = c5372.f17721;
            C3610 c3610 = c5372.f17717;
            C5371.m9021(c1512);
            byte[] bArrM3190 = C1512.m3190(c5645);
            if (bArrM3190 == null) {
                C5371.m9020(c3610);
                c3610.f12025.m9432("Null default event parameters; not writing to database");
            } else {
                if (bArrM3190.length > 131072) {
                    C5371.m9020(c3610);
                    c3610.f12025.m9432("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zM9083 = c5403M9026.m9083(4, bArrM3190);
                }
                if (zM9083) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM9083 = false;
            if (zM9083) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        m9509(new RunnableC0836(this, m9517(false), z, c5645, bundle));
    }
}
