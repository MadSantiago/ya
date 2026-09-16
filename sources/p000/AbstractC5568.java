package p000;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦْۢۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5568 {

    /* JADX INFO: renamed from: ۥۜ */
    public static long f18385;

    /* JADX INFO: renamed from: ۦِ */
    public static Method f18388;

    /* JADX INFO: renamed from: ۦٛ */
    public static Method f18389;

    /* JADX INFO: renamed from: ۦۗ */
    public static Method f18390;

    /* JADX INFO: renamed from: ۥۣ */
    public static final ExecutorC4322 f18386 = new ExecutorC4322(1);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5780 f18384 = new C5780(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5780 f18381 = new C5780(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5780 f18387 = new C5780(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: ۥُ */
    public static final C5780 f18382 = new C5780(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: ۥّ */
    public static final float[] f18383 = {0.964212f, 1.0f, 0.825188f};

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5536 f18391 = new C5536(2, "NO_VALUE");

    /* JADX INFO: renamed from: ۥؓ */
    public static final InterfaceC4883 m9348(InterfaceC3196 interfaceC3196, boolean z, AbstractC5752 abstractC5752) {
        if (interfaceC3196 instanceof AbstractC0386) {
            return ((AbstractC0386) interfaceC3196).m864(z, abstractC5752);
        }
        return interfaceC3196.mo878(abstractC5752.mo922(), z, new C0037(1, abstractC5752, AbstractC5752.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 13));
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static C3580 m9349(C3580 c3580, C3580 c3581) {
        C4228 c4228 = new C4228(9);
        C2332 c2332 = new C2332((C1039) c4228.f14025);
        C2035 c2035 = new C2035(c2332, new AtomicBoolean(false), c4228, 0);
        ExecutorC4322 executorC4322 = f18386;
        c3580.m6392(executorC4322, c2035);
        c3581.m6392(executorC4322, c2035);
        return c2332.f7721;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static void m9350(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            C5028.m8450(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m9351(InterfaceC4448 interfaceC4448, InterfaceC0705 interfaceC0705, C2750 c2750, InterfaceC5572 interfaceC5572, C5362 c5362, int i) {
        InterfaceC5572 interfaceC5573;
        C2750 c2751;
        InterfaceC0705 interfaceC0706;
        c5362.m8979(1055276397);
        int i2 = (c5362.m8977(interfaceC4448) ? 4 : 2) | i | (c5362.m8963(interfaceC0705) ? 32 : 16) | (c5362.m8963(c2750) ? 256 : 128) | (c5362.m8963(interfaceC5572) ? 2048 : 1024);
        if (c5362.m9011(i2 & 1, (i2 & 1171) != 1170)) {
            interfaceC5573 = interfaceC5572;
            C5532 c5532 = new C5532(c2750, interfaceC0705, interfaceC5573, AbstractC2774.m5175(interfaceC4448, c5362), 0);
            c2751 = c2750;
            interfaceC0706 = interfaceC0705;
            AbstractC5378.m9048(AbstractC3925.m7034(-933153643, c5532, c5362), c5362, 6);
        } else {
            interfaceC5573 = interfaceC5572;
            c2751 = c2750;
            interfaceC0706 = interfaceC0705;
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C2835(interfaceC4448, interfaceC0706, c2751, interfaceC5573, i);
        }
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static void m9352(C3610 c3610, SQLiteDatabase sQLiteDatabase) {
        if (c3610 == null) {
            C1078.m2272("Monitor must not be null");
            return;
        }
        C5590 c5590 = c3610.f12022;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c5590.m9432("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c5590.m9432("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c5590.m9432("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c5590.m9432("Failed to turn on database write permission for owner");
    }

    /* JADX INFO: renamed from: ۥً */
    public static boolean m9353() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC4346.m7639();
        }
        try {
            Method method = f18389;
            if (method == null) {
                f18385 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                f18389 = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(f18385))).booleanValue();
        } catch (Exception e) {
            m9350("isTagEnabled", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final boolean m9354(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return AbstractC3831.m6874(AbstractC0684.m9760(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m9355(int i, C5277 c5277, C5362 c5362, int i2) {
        c5362.m8979(1237707531);
        new C4441(new long[]{-3086154258727252757L, 29078389857588279L, -4458792573211678031L, 8702398015396154866L, -3147683923491726047L, 2286078383110122720L, -2715068975734417657L, -6157550795620968832L, 2413260595413653437L, -7972711044830285133L, -4565294166365544094L, -3122208318841380235L, -8036122037940096853L, -2061818454453087540L}).toString();
        int i3 = (c5362.m8988(i) ? 4 : 2) | i2 | (c5362.m8963(c5277) ? 32 : 16);
        int i4 = 1;
        if (c5362.m9011(i3 & 1, (i3 & 19) != 18)) {
            C0857 c0857M7034 = AbstractC3925.m7034(-666468921, new C0020(i, i4), c5362);
            C0857 c0857 = AbstractC1631.f5468;
            long j = C1327.f4592;
            long j2 = C1327.f4591;
            C2917 c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
            C4692 c4692 = c2917.f9754;
            if (c4692 == null) {
                C4692 c4693 = new C4692(AbstractC0118.m212(c2917, 35), AbstractC0118.m212(c2917, 37), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 18), AbstractC0118.m212(c2917, 19), AbstractC0118.m212(c2917, 19));
                c2917.f9754 = c4693;
                c4692 = c4693;
            }
            long j3 = j != 16 ? j : c4692.f15457;
            if (j == 16) {
                j = c4692.f15456;
            }
            long j4 = j;
            long j5 = j2 != 16 ? j2 : c4692.f15453;
            long j6 = j2 != 16 ? j2 : c4692.f15458;
            long j7 = j2 != 16 ? j2 : c4692.f15454;
            if (j2 == 16) {
                j2 = c4692.f15455;
            }
            AbstractC2264.m4308(c0857M7034, null, c0857, null, 0.0f, null, new C4692(j3, j4, j5, j6, j7, j2), c5277, c5362, ((i3 << 18) & 29360128) | 390, 58);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4076(i, c5277, i2);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final C5845 m9356(int i, int i2, int i3) {
        if (i < 0) {
            C1078.m2273(AbstractC5078.m8670(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            C1078.m2273(AbstractC5078.m8670(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && i3 != 1) {
            C1078.m2273("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(AbstractC3761.m6637(i3)));
            return null;
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new C5845(i, i4, i3);
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final InterfaceC0705 m9357(InterfaceC0705 interfaceC0705, C4234 c4234) {
        return interfaceC0705.mo1571(new C1871(c4234));
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static AbstractC4225 m9358(int i) {
        if (i != 0) {
            return i != 1 ? new C4928() : new C1030();
        }
        return new C4928();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥٕ */
    public static final void m9359(AbstractC5381 abstractC5381, InterfaceC4448 interfaceC4448) {
        C4178 c4178 = abstractC5381.f17788;
        if (c4178 == null) {
            c4178 = new C4178((InterfaceC0349) abstractC5381);
            abstractC5381.f17788 = c4178;
        }
        C1775 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(abstractC5381)).getSnapshotObserver();
        snapshotObserver.f5926.m9077(c4178, C3948.f13201, interfaceC4448);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final void m9360(InterfaceC3534 interfaceC3534) {
        InterfaceC3196 interfaceC3196 = (InterfaceC3196) interfaceC3534.mo865(C1397.f4791);
        if (interfaceC3196 != null && !interfaceC3196.mo866()) {
            throw interfaceC3196.mo862();
        }
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static String m9361(long j) {
        if (m9384(j, 12884901888L)) {
            return "Rgb";
        }
        if (m9384(j, 12884901889L)) {
            return "Xyz";
        }
        if (m9384(j, 12884901890L)) {
            return "Lab";
        }
        return m9384(j, 17179869187L) ? "Cmyk" : "Unknown";
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static final InterfaceC3196 m9362(InterfaceC3534 interfaceC3534) {
        InterfaceC3196 interfaceC3196 = (InterfaceC3196) interfaceC3534.mo865(C1397.f4791);
        if (interfaceC3196 != null) {
            return interfaceC3196;
        }
        C5028.m8449(interfaceC3534, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static String m9363(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static final InterfaceC0705 m9364(InterfaceC0705 interfaceC0705, InterfaceC4686 interfaceC4686) {
        return interfaceC0705.mo1571(new C1224(interfaceC4686));
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final InterfaceC4507 m9365(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC4507 interfaceC4507 = tag instanceof InterfaceC4507 ? (InterfaceC4507) tag : null;
            if (interfaceC4507 != null) {
                return interfaceC4507;
            }
            Object objM7476 = AbstractC4225.m7476(view);
            view = objM7476 instanceof View ? (View) objM7476 : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C3841 m9366() {
        return new C3841(null);
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final InterfaceC0705 m9367(InterfaceC0705 interfaceC0705, InterfaceC4745 interfaceC4745) {
        return interfaceC0705.mo1571(new C3057(interfaceC4745));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final C2793 m9368(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C2793(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: SQLiteException -> 0x00b7, LOOP:0: B:29:0x0080->B:32:0x008a, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m9369(C3610 c3610, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i;
        int i2;
        if (c3610 == null) {
            C1078.m2272("Monitor must not be null");
            return;
        }
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
                try {
                    cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    try {
                        try {
                            boolean zMoveToFirst = cursorQuery.moveToFirst();
                            cursorQuery.close();
                            if (!zMoveToFirst) {
                                sQLiteDatabase2.execSQL(str2);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        c3610.f12022.m9434(str, e, "Error querying for table");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    cursorQuery = null;
                    c3610.f12022.m9434(str, e, "Error querying for table");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    hashSet = new HashSet();
                    StringBuilder sb = new StringBuilder(str.length() + 22);
                    sb.append("SELECT * FROM ");
                    sb.append(str);
                    sb.append(" LIMIT 0");
                    cursorRawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                    try {
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (hashSet.remove(str4)) {
                                StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                sb2.append("Table ");
                                sb2.append(str);
                                sb2.append(" is missing required column: ");
                                sb2.append(str4);
                                throw new SQLiteException(sb2.toString());
                            }
                        }
                        if (strArr != null) {
                            for (i = 0; i < strArr.length; i += 2) {
                                if (!hashSet.remove(strArr[i])) {
                                    sQLiteDatabase2.execSQL(strArr[i + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                        }
                        c3610.f12022.m9434(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                sQLiteDatabase2 = sQLiteDatabase;
            }
            try {
                hashSet = new HashSet();
                StringBuilder sb3 = new StringBuilder(str.length() + 22);
                sb3.append("SELECT * FROM ");
                sb3.append(str);
                sb3.append(" LIMIT 0");
                cursorRawQuery = sQLiteDatabase2.rawQuery(sb3.toString(), null);
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i2 < r0) {
                    if (hashSet.remove(str4)) {
                        StringBuilder sb4 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb4.append("Table ");
                        sb4.append(str);
                        sb4.append(" is missing required column: ");
                        sb4.append(str4);
                        throw new SQLiteException(sb4.toString());
                    }
                }
                if (strArr != null) {
                    while (i < strArr.length) {
                        if (!hashSet.remove(strArr[i])) {
                            sQLiteDatabase2.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    c3610.f12022.m9434(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                }
            } catch (SQLiteException e4) {
                c3610.f12020.m9430(str, "Failed to verify columns on table that was just created");
                throw e4;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final long m9370(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static final void m9371(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            AbstractC4690.m8038("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        AbstractC4690.m8038("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static InterfaceC0705 m9372(InterfaceC0705 interfaceC0705, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return interfaceC0705.mo1571(new C2000(f, f2, f, f2));
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static final boolean m9373(InterfaceC3534 interfaceC3534) {
        InterfaceC3196 interfaceC3196 = (InterfaceC3196) interfaceC3534.mo865(C1397.f4791);
        if (interfaceC3196 != null) {
            return interfaceC3196.mo866();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m9374(int i, C5362 c5362) {
        C5362 c5363;
        c5362.m8979(1089763368);
        new C4441(new long[]{-4181174882247115886L, 4786418907932353714L, 246783233761412205L, 5021772325779839498L, 2507552375820856223L, -4898486830247107436L, 8007514544529454512L, -1533712505579093693L}).toString();
        if (c5362.m9011(i & 1, i != 0)) {
            c5363 = c5362;
            AbstractC2264.m4308(AbstractC1631.f5461, null, AbstractC1631.f5464, AbstractC1631.f5470, 0.0f, null, null, null, c5363, 3462, 242);
        } else {
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0064(i, 5);
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static final void m9375(C3129 c3129, int i, C1261 c1261) {
        C0863 c0863 = new C0863(new C3129[16]);
        List listM5768 = c3129.m5768(false, false);
        while (true) {
            c0863.m1846(c0863.f3180, listM5768);
            while (true) {
                int i2 = c0863.f3180;
                if (i2 == 0) {
                    return;
                }
                C3129 c31210 = (C3129) c0863.m1850(i2 - 1);
                boolean zM5245 = AbstractC2776.m5245(c31210);
                C2542 c2542 = c31210.f10476;
                C3262 c3262 = c2542.f8490;
                if (!zM5245 && !c3262.m6015(AbstractC2771.f9223)) {
                    AbstractC1311 abstractC1311M5765 = c31210.m5765();
                    if (abstractC1311M5765 == null) {
                        throw AbstractC3761.m6633("Expected semantics node to have a coordinator.");
                    }
                    C4730 c4730M5141 = AbstractC2765.m5141(C4773.m8142(abstractC1311M5765, true));
                    if (c4730M5141.f15612 < c4730M5141.f15610 && c4730M5141.f15611 < c4730M5141.f15613) {
                        Object objM6027 = c2542.f8490.m6027(AbstractC0208.f765);
                        if (objM6027 == null) {
                            objM6027 = null;
                        }
                        InterfaceC5731 interfaceC5731 = (InterfaceC5731) objM6027;
                        Object objM6028 = c3262.m6027(AbstractC2771.f9209);
                        C4323 c4323 = (C4323) (objM6028 != null ? objM6028 : null);
                        if (interfaceC5731 == null || c4323 == null || ((Number) c4323.f14289.mo449()).floatValue() <= 0.0f) {
                            listM5768 = c31210.m5768(false, false);
                        } else {
                            int i3 = 1 + i;
                            c1261.mo211(new C4344(c31210, i3, c4730M5141, abstractC1311M5765));
                            m9375(c31210, i3, c1261);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final InterfaceC0705 m9376(InterfaceC0705 interfaceC0705, float f) {
        return interfaceC0705.mo1571(new C2000(f, f, f, f));
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final InterfaceC0705 m9377(InterfaceC0705 interfaceC0705, float f, float f2, float f3, float f4) {
        return interfaceC0705.mo1571(new C2000(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final InterfaceC0705 m9378(InterfaceC0705 interfaceC0705, InterfaceC1291 interfaceC1291) {
        return interfaceC0705.mo1571(new C1221(interfaceC1291));
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final float m9379(InterfaceC1291 interfaceC1291, EnumC2459 enumC2459) {
        return enumC2459 == EnumC2459.f8215 ? interfaceC1291.mo1102(enumC2459) : interfaceC1291.mo1101(enumC2459);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final void m9380(InterfaceC3534 interfaceC3534, CancellationException cancellationException) {
        InterfaceC3196 interfaceC3196 = (InterfaceC3196) interfaceC3534.mo865(C1397.f4791);
        if (interfaceC3196 != null) {
            interfaceC3196.mo871(cancellationException);
        }
    }

    /* JADX INFO: renamed from: ۦُ */
    public static InterfaceC0705 m9381(InterfaceC0705 interfaceC0705, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return m9377(interfaceC0705, f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final InterfaceC0705 m9382(InterfaceC0705 interfaceC0705, long j, InterfaceC2864 interfaceC2864) {
        return interfaceC0705.mo1571(new C0391(j, interfaceC2864));
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static final Object m9383(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final boolean m9384(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static boolean m9385(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static C4995 m9386(C2926 c2926) {
        C4206 c4206 = new C4206();
        c4206.f13965 = new C0914();
        C4995 c4995 = new C4995(c4206);
        c4206.f13966 = c4995;
        c4206.f13967 = AbstractC3761.class;
        try {
            c2926.mo859(new C5544(7, c4206, c2926));
            c4206.f13967 = "Deferred.asListenableFuture";
            return c4995;
        } catch (Exception e) {
            c4995.f16533.mo1898(e);
            return c4995;
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final float m9387(InterfaceC1291 interfaceC1291, EnumC2459 enumC2459) {
        return enumC2459 == EnumC2459.f8215 ? interfaceC1291.mo1101(enumC2459) : interfaceC1291.mo1102(enumC2459);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static C1393 m9388(float f, float f2, float f3, int i) {
        float f4 = (i & 1) != 0 ? 0.0f : 15.0f;
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i & 8) != 0) {
            f3 = 0.0f;
        }
        return new C1393(f4, f, f2, f3);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final String m9389(Collection collection) {
        return !collection.isEmpty() ? AbstractC1098.m2324(AbstractC0973.m2056(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final void m9390(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static C4714 m9391(C4714 c4714, C4714 c4715) {
        C5086 c5086 = new C5086(24);
        int size = c4714.size();
        for (int i = 0; i < size; i++) {
            String strM8049 = c4714.m8049(i);
            String strM8047 = c4714.m8047(i);
            if ((!"Warning".equalsIgnoreCase(strM8049) || !strM8047.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strM8049) || "Content-Encoding".equalsIgnoreCase(strM8049) || "Content-Type".equalsIgnoreCase(strM8049) || !m9385(strM8049) || c4715.m8048(strM8049) == null)) {
                c5086.m8692(strM8049, strM8047);
            }
        }
        int size2 = c4715.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String strM80410 = c4715.m8049(i2);
            if (!"Content-Length".equalsIgnoreCase(strM80410) && !"Content-Encoding".equalsIgnoreCase(strM80410) && !"Content-Type".equalsIgnoreCase(strM80410) && m9385(strM80410)) {
                c5086.m8692(strM80410, c4715.m8047(i2));
            }
        }
        return c5086.m8701();
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static final void m9392(int i, int i2, InterfaceC0103 interfaceC0103) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(interfaceC0103.mo184(i4));
            }
            i3 >>>= 1;
        }
        String strMo186 = interfaceC0103.mo186();
        throw new C1267(arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strMo186 + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strMo186 + "', but they were missing", null, arrayList, strMo186);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final Object m9393(InterfaceC4707 interfaceC4707, InterfaceC5731 interfaceC5731, AbstractC2426 abstractC2426) {
        int i = AbstractC5651.f18607;
        Object objMo1575 = AbstractC4593.m7989(new C0856(new C1362(interfaceC5731, null), interfaceC4707, C4794.f15814, -2, 1), 0).mo1575(C2817.f9420, abstractC2426);
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (objMo1575 != enumC2282) {
            objMo1575 = c2358;
        }
        return objMo1575 == enumC2282 ? objMo1575 : c2358;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public abstract Object mo3805(Intent intent, int i);

    /* JADX INFO: renamed from: ۦۚ */
    public abstract void mo8225();
}
