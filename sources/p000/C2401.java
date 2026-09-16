package p000;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ۥۜؗؕۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2401 {

    /* JADX INFO: renamed from: ۥُ */
    public static Boolean f7993 = null;

    /* JADX INFO: renamed from: ۥّ */
    public static String f7994 = null;

    /* JADX INFO: renamed from: ۥۜ */
    public static int f7996 = -1;

    /* JADX INFO: renamed from: ۦٌ */
    public static C0959 f7999;

    /* JADX INFO: renamed from: ۦٛ */
    public static Boolean f8001;

    /* JADX INFO: renamed from: ۦۙ */
    public static boolean f8003;

    /* JADX INFO: renamed from: ۦۚ */
    public static C2145 f8004;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f8005;

    /* JADX INFO: renamed from: ۦِ */
    public static final ThreadLocal f8000 = new ThreadLocal();

    /* JADX INFO: renamed from: ۦۗ */
    public static final C2452 f8002 = new C2452(4);

    /* JADX INFO: renamed from: ۦؚ */
    public static final C5518 f7998 = new C5518(11);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1745 f7995 = new C1745(18);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3485 f7992 = new C3485(19);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C1745 f7997 = new C1745(19);

    public C2401(Context context) {
        this.f8005 = context;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0238 A[Catch: all -> 0x0221, ۥۦِؒۛ -> 0x0224, RemoteException -> 0x0227, TryCatch #12 {RemoteException -> 0x0227, ۥۦِؒۛ -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x0249 A[Catch: all -> 0x0221, ۥۦِؒۛ -> 0x0224, RemoteException -> 0x0227, TryCatch #12 {RemoteException -> 0x0227, ۥۦِؒۛ -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x025f A[Catch: all -> 0x0221, ۥۦِؒۛ -> 0x0224, RemoteException -> 0x0227, TryCatch #12 {RemoteException -> 0x0227, ۥۦِؒۛ -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0268 A[Catch: all -> 0x0221, ۥۦِؒۛ -> 0x0224, RemoteException -> 0x0227, TryCatch #12 {RemoteException -> 0x0227, ۥۦِؒۛ -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0270 A[Catch: all -> 0x0221, ۥۦِؒۛ -> 0x0224, RemoteException -> 0x0227, TryCatch #12 {RemoteException -> 0x0227, ۥۦِؒۛ -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x027a A[Catch: all -> 0x0221, ۥۦِؒۛ -> 0x0224, RemoteException -> 0x0227, TryCatch #12 {RemoteException -> 0x0227, ۥۦِؒۛ -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0288  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:136:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:139:0x0305  */
    /* JADX WARN: Code duplicated, block: B:144:0x0316 A[Catch: all -> 0x00b8, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0295, B:120:0x029c, B:128:0x02ab, B:130:0x02d3, B:132:0x02e2, B:142:0x030e, B:143:0x0315, B:123:0x029f, B:124:0x02a0, B:125:0x02a7, B:144:0x0316, B:145:0x0336, B:146:0x0337, B:147:0x0384), top: B:166:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #11 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0295, B:120:0x029c, B:128:0x02ab, B:130:0x02d3, B:132:0x02e2, B:142:0x030e, B:143:0x0315, B:123:0x029f, B:124:0x02a0, B:125:0x02a7, B:144:0x0316, B:145:0x0336, B:146:0x0337, B:147:0x0384), top: B:166:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f7 A[Catch: all -> 0x0284, TryCatch #2 {all -> 0x0284, blocks: (B:34:0x00f1, B:36:0x00f7, B:37:0x00f9), top: B:159:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[Catch: all -> 0x016f, ۥۦِؒۛ -> 0x0174, RemoteException -> 0x0179, TRY_ENTER, TryCatch #10 {RemoteException -> 0x0179, ۥۦِؒۛ -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0103 A[Catch: all -> 0x016f, ۥۦِؒۛ -> 0x0174, RemoteException -> 0x0179, TryCatch #10 {RemoteException -> 0x0179, ۥۦِؒۛ -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0136 A[Catch: all -> 0x016f, ۥۦِؒۛ -> 0x0174, RemoteException -> 0x0179, TRY_ENTER, TryCatch #10 {RemoteException -> 0x0179, ۥۦِؒۛ -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b5 A[Catch: all -> 0x016f, ۥۦِؒۛ -> 0x0174, RemoteException -> 0x0179, TryCatch #10 {RemoteException -> 0x0179, ۥۦِؒۛ -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0 A[Catch: all -> 0x016f, ۥۦِؒۛ -> 0x0174, RemoteException -> 0x0179, TryCatch #10 {RemoteException -> 0x0179, ۥۦِؒۛ -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f3 A[Catch: all -> 0x016f, ۥۦِؒۛ -> 0x0174, RemoteException -> 0x0179, TryCatch #10 {RemoteException -> 0x0179, ۥۦِؒۛ -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0206 A[Catch: all -> 0x016f, ۥۦِؒۛ -> 0x0174, RemoteException -> 0x0179, TryCatch #10 {RemoteException -> 0x0179, ۥۦِؒۛ -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x020e A[Catch: all -> 0x016f, ۥۦِؒۛ -> 0x0174, RemoteException -> 0x0179, TRY_LEAVE, TryCatch #10 {RemoteException -> 0x0179, ۥۦِؒۛ -> 0x0174, all -> 0x016f, blocks: (B:33:0x00f0, B:39:0x00fc, B:41:0x0103, B:42:0x0130, B:46:0x0136, B:48:0x013e, B:50:0x0142, B:51:0x014e, B:58:0x0159, B:66:0x0193, B:68:0x019b, B:69:0x01a2, B:70:0x01a9, B:65:0x017e, B:73:0x01ac, B:74:0x01ad, B:75:0x01b4, B:76:0x01b5, B:77:0x01bc, B:80:0x01bf, B:81:0x01c0, B:83:0x01f3, B:85:0x0206, B:87:0x020e), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x022a A[Catch: all -> 0x0221, ۥۦِؒۛ -> 0x0224, RemoteException -> 0x0227, TryCatch #12 {RemoteException -> 0x0227, ۥۦِؒۛ -> 0x0224, all -> 0x0221, blocks: (B:89:0x0212, B:102:0x0259, B:104:0x025f, B:105:0x0268, B:106:0x026f, B:96:0x022a, B:97:0x0233, B:100:0x0238, B:101:0x0249, B:107:0x0270, B:108:0x0279, B:109:0x027a, B:110:0x0283, B:118:0x0294), top: B:165:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [ۥٜ۠ؕۜ] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX INFO: renamed from: ۥؗ */
    public static C2401 m4518(Context context, InterfaceC2515 interfaceC2515, String str) throws C2784 {
        ?? r7;
        int i;
        C2401 c2401;
        Cursor cursor;
        int i2;
        Boolean bool;
        C0959 c0959M4521;
        int i3;
        InterfaceC2410 interfaceC2410M1994;
        Object objM2976;
        C5859 c5859;
        C2145 c2145;
        C5859 c58510;
        boolean z;
        InterfaceC2410 interfaceC2410M4175;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new C2784("null application Context");
        }
        ThreadLocal threadLocal = f8000;
        C5859 c58511 = (C5859) threadLocal.get();
        C5859 c58512 = new C5859();
        threadLocal.set(c58512);
        C2452 c2452 = f8002;
        Long l = (Long) c2452.get();
        long jLongValue = l.longValue();
        try {
            c2452.set(Long.valueOf(SystemClock.uptimeMillis()));
            C4998 c4998Mo3546 = interfaceC2515.mo3546(context, str, f7998);
            int i4 = c4998Mo3546.f16540;
            int i5 = c4998Mo3546.f16539;
            StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(i4).length() + 19 + str.length() + 1 + String.valueOf(i5).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i4);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i5);
            Log.i("DynamiteModule", sb.toString());
            int i6 = c4998Mo3546.f16538;
            if (i6 != 0) {
                if (i6 != -1) {
                    if (i6 == 1 || c4998Mo3546.f16539 != 0) {
                        if (i6 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            C2401 c2402 = new C2401(applicationContext);
                            if (jLongValue == 0) {
                                c2452.remove();
                            } else {
                                c2452.set(l);
                            }
                            cursor2 = c58512.f19352;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(c58511);
                            return c2402;
                        }
                        if (i6 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i6);
                            throw new C2784(sb2.toString());
                        }
                        try {
                            try {
                                i2 = c4998Mo3546.f16539;
                                try {
                                    try {
                                        try {
                                            synchronized (C2401.class) {
                                                try {
                                                    if (m4519(context)) {
                                                        throw new C2784("Remote loading disabled");
                                                    }
                                                    bool = f7993;
                                                    if (bool != null) {
                                                        throw new C2784("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                                                        sb3.append("Selected remote version of ");
                                                        sb3.append(str);
                                                        sb3.append(", version >= ");
                                                        sb3.append(i2);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (C2401.class) {
                                                            c2145 = f8004;
                                                        }
                                                        if (c2145 != null) {
                                                            throw new C2784("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        c58510 = (C5859) threadLocal.get();
                                                        if (c58510 != null || c58510.f19352 == null) {
                                                            throw new C2784("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = c58510.f19352;
                                                        new BinderC1409(null);
                                                        synchronized (C2401.class) {
                                                            z = f7996 >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            interfaceC2410M4175 = c2145.m4174(new BinderC1409(applicationContext2), str, i2, new BinderC1409(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            interfaceC2410M4175 = c2145.m4175(new BinderC1409(applicationContext2), str, i2, new BinderC1409(cursor3));
                                                        }
                                                        Context context2 = (Context) BinderC1409.m2976(interfaceC2410M4175);
                                                        if (context2 == null) {
                                                            throw new C2784("Failed to get module context");
                                                        }
                                                        c2401 = new C2401(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i2);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        c0959M4521 = m4521(context);
                                                        if (c0959M4521 != null) {
                                                            throw new C2784("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelM7508 = c0959M4521.m7508(c0959M4521.m7504(), 6);
                                                        i3 = parcelM7508.readInt();
                                                        parcelM7508.recycle();
                                                        if (i3 >= 3) {
                                                            c5859 = (C5859) threadLocal.get();
                                                            if (c5859 != null) {
                                                                throw new C2784("No cached result cursor holder");
                                                            }
                                                            interfaceC2410M1994 = c0959M4521.m1991(new BinderC1409(context), str, i2, new BinderC1409(c5859.f19352));
                                                        } else if (i3 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            interfaceC2410M1994 = c0959M4521.m1992(new BinderC1409(context), str, i2);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            interfaceC2410M1994 = c0959M4521.m1994(new BinderC1409(context), str, i2);
                                                        }
                                                        objM2976 = BinderC1409.m2976(interfaceC2410M1994);
                                                        if (objM2976 != null) {
                                                            throw new C2784("Failed to load remote module.");
                                                        }
                                                        c2401 = new C2401((Context) objM2976);
                                                    }
                                                    if (jLongValue == 0) {
                                                        f8002.remove();
                                                    } else {
                                                        f8002.set(l);
                                                    }
                                                    cursor = c58512.f19352;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    f8000.set(c58511);
                                                    return c2401;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (RemoteException e) {
                                            e = e;
                                            throw new C2784("Failed to load remote module.", e);
                                        } catch (C2784 e2) {
                                            throw e2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw new C2784("Failed to load remote module.", th);
                                        }
                                    } catch (RemoteException e3) {
                                        e = e3;
                                        throw new C2784("Failed to load remote module.", e);
                                    } catch (C2784 e4) {
                                        throw e4;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw new C2784("Failed to load remote module.", th);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (C2784 e5) {
                                e = e5;
                                r7 = c2452;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                Log.w("DynamiteModule", sb5.toString());
                                i = c4998Mo3546.f16540;
                                if (i != 0) {
                                }
                                throw new C2784("Remote load failed. No local fallback found.", e);
                            }
                        } catch (C2784 e6) {
                            e = e6;
                            r7 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            Log.w("DynamiteModule", sb6.toString());
                            i = c4998Mo3546.f16540;
                            if (i != 0 || interfaceC2515.mo3546(r7, str, new C1984(i)).f16538 != -1) {
                                throw new C2784("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            c2401 = new C2401(applicationContext);
                        }
                    }
                } else if (c4998Mo3546.f16540 != 0) {
                    i6 = -1;
                    if (i6 == 1) {
                    }
                    if (i6 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        C2401 c2403 = new C2401(applicationContext);
                        if (jLongValue == 0) {
                            c2452.remove();
                        } else {
                            c2452.set(l);
                        }
                        cursor2 = c58512.f19352;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(c58511);
                        return c2403;
                    }
                    if (i6 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i6).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i6);
                        throw new C2784(sb7.toString());
                    }
                    i2 = c4998Mo3546.f16539;
                    synchronized (C2401.class) {
                        if (m4519(context)) {
                            throw new C2784("Remote loading disabled");
                        }
                        bool = f7993;
                        if (bool != null) {
                            throw new C2784("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i2);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (C2401.class) {
                                c2145 = f8004;
                                if (c2145 != null) {
                                    throw new C2784("DynamiteLoaderV2 was not cached.");
                                }
                                c58510 = (C5859) threadLocal.get();
                                if (c58510 != null) {
                                }
                                throw new C2784("No result cursor");
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(str.length() + 40 + String.valueOf(i2).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i2);
                        Log.i("DynamiteModule", sb9.toString());
                        c0959M4521 = m4521(context);
                        if (c0959M4521 != null) {
                            throw new C2784("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelM7509 = c0959M4521.m7508(c0959M4521.m7504(), 6);
                        i3 = parcelM7509.readInt();
                        parcelM7509.recycle();
                        if (i3 >= 3) {
                            c5859 = (C5859) threadLocal.get();
                            if (c5859 != null) {
                                throw new C2784("No cached result cursor holder");
                            }
                            interfaceC2410M1994 = c0959M4521.m1991(new BinderC1409(context), str, i2, new BinderC1409(c5859.f19352));
                        } else if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            interfaceC2410M1994 = c0959M4521.m1992(new BinderC1409(context), str, i2);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            interfaceC2410M1994 = c0959M4521.m1994(new BinderC1409(context), str, i2);
                        }
                        objM2976 = BinderC1409.m2976(interfaceC2410M1994);
                        if (objM2976 != null) {
                            throw new C2784("Failed to load remote module.");
                        }
                        c2401 = new C2401((Context) objM2976);
                        if (jLongValue == 0) {
                            f8002.remove();
                        } else {
                            f8002.set(l);
                        }
                        cursor = c58512.f19352;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f8000.set(c58511);
                        return c2401;
                    }
                }
            }
            int i7 = c4998Mo3546.f16540;
            int i8 = c4998Mo3546.f16539;
            StringBuilder sb10 = new StringBuilder(str.length() + 46 + String.valueOf(i7).length() + 23 + String.valueOf(i8).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i7);
            sb10.append(" and remote version is ");
            sb10.append(i8);
            sb10.append(".");
            throw new C2784(sb10.toString());
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                f8002.remove();
            } else {
                f8002.set(l);
            }
            Cursor cursor4 = c58512.f19352;
            if (cursor4 != null) {
                cursor4.close();
            }
            f8000.set(c58511);
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static boolean m4519(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f8001)) {
            return true;
        }
        boolean z = false;
        if (f8001 == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (C0600.f2225.m1308(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f8001 = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f8003 = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۥّ */
    public static int m4520(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f8002.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i = 0; i < count; i++) {
                                    if (!cursorQuery.moveToPosition(i)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i2 = 0; i2 < columnCount; i2++) {
                                        int type = cursorQuery.getType(i2);
                                        if (type == 0) {
                                            objArr[i2] = null;
                                        } else if (type == 1) {
                                            objArr[i2] = Long.valueOf(cursorQuery.getLong(i2));
                                        } else if (type == 2) {
                                            objArr[i2] = Double.valueOf(cursorQuery.getDouble(i2));
                                        } else if (type == 3) {
                                            objArr[i2] = cursorQuery.getString(i2);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i2] = cursorQuery.getBlob(i2);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i3 = matrixCursor.getInt(0);
                            if (i3 > 0) {
                                synchronized (C2401.class) {
                                    try {
                                        f7994 = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f7996 = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            f8003 = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                C5859 c5859 = (C5859) f8000.get();
                                if (c5859 == null || c5859.f19352 != null) {
                                    z4 = false;
                                } else {
                                    c5859.f19352 = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new C2784("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i3;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof C2784) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new C2784(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C2784("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static C0959 m4521(Context context) {
        C0959 c0959;
        synchronized (C2401.class) {
            C0959 c09510 = f7999;
            if (c09510 != null) {
                return c09510;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c0959 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c0959 = iInterfaceQueryLocalInterface instanceof C0959 ? (C0959) iInterfaceQueryLocalInterface : new C0959(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (c0959 != null) {
                    f7999 = c0959;
                    return c0959;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static int m4522(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC2164.m4207(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x003b, TryCatch #13 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bd, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:31:0x0061, B:33:0x0069, B:36:0x0070, B:43:0x009c, B:44:0x00a4, B:39:0x0077, B:41:0x007d, B:42:0x008e, B:47:0x00a7, B:50:0x00aa, B:51:0x00b4, B:18:0x0043), top: B:152:0x002b, inners: #12 }] */
    /* JADX INFO: renamed from: ۦؑ */
    public static int m4523(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        int i;
        Cursor cursor;
        try {
            synchronized (C2401.class) {
                Boolean bool = f7993;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        m4524(classLoader);
                                    } catch (C2784 unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!m4519(context)) {
                                        return 0;
                                    }
                                    if (f8003) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM4520 = m4520(context, str, z, true);
                                                String str2 = f7994;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM7052 = AbstractC3925.m7052();
                                                    if (classLoaderM7052 == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            AbstractC1944.m3807();
                                                            String str3 = f7994;
                                                            AbstractC0487.m1047(str3);
                                                            classLoaderM7052 = AbstractC1944.m3808(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f7994;
                                                            AbstractC0487.m1047(str4);
                                                            classLoaderM7052 = new C5379(str4, ClassLoader.getSystemClassLoader(), 1);
                                                        }
                                                    }
                                                    m4524(classLoaderM7052);
                                                    declaredField.set(null, classLoaderM7052);
                                                    f7993 = bool2;
                                                    return iM4520;
                                                }
                                                return iM4520;
                                            } catch (C2784 unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f7993 = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        String string = e.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m4520(context, str, z, false);
                    } catch (C2784 e2) {
                        String message = e2.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                C0959 c0959M4521 = m4521(context);
                try {
                    if (c0959M4521 == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelM7508 = c0959M4521.m7508(c0959M4521.m7504(), 6);
                        int i2 = parcelM7508.readInt();
                        parcelM7508.recycle();
                        if (i2 >= 3) {
                            ThreadLocal threadLocal = f8000;
                            C5859 c5859 = (C5859) threadLocal.get();
                            if (c5859 != null && (cursor = c5859.f19352) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) BinderC1409.m2976(c0959M4521.m1993(new BinderC1409(context), str, z, ((Long) f8002.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i = cursor3.getInt(0);
                                        if (i > 0) {
                                            C5859 c58510 = (C5859) threadLocal.get();
                                            if (c58510 == null || c58510.f19352 != null) {
                                                z2 = false;
                                            } else {
                                                c58510.f19352 = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e3) {
                                    remoteException = e3;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            BinderC1409 binderC1409 = new BinderC1409(context);
                            Parcel parcelM7504 = c0959M4521.m7504();
                            AbstractC3419.m6198(parcelM7504, binderC1409);
                            parcelM7504.writeString(str);
                            parcelM7504.writeInt(z ? 1 : 0);
                            Parcel parcelM7509 = c0959M4521.m7508(parcelM7504, 5);
                            i = parcelM7509.readInt();
                            parcelM7509.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            BinderC1409 binderC14010 = new BinderC1409(context);
                            Parcel parcelM7505 = c0959M4521.m7504();
                            AbstractC3419.m6198(parcelM7505, binderC14010);
                            parcelM7505.writeString(str);
                            parcelM7505.writeInt(z ? 1 : 0);
                            Parcel parcelM75010 = c0959M4521.m7508(parcelM7505, 3);
                            i = parcelM75010.readInt();
                            parcelM75010.recycle();
                        }
                        return i;
                    } catch (RemoteException e4) {
                        remoteException = e4;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                AbstractC0487.m1047(context);
                throw th5;
            } catch (Exception e5) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e5);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m4524(ClassLoader classLoader) throws C2784 {
        try {
            C2145 c2145 = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c2145 = iInterfaceQueryLocalInterface instanceof C2145 ? (C2145) iInterfaceQueryLocalInterface : new C2145(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            f8004 = c2145;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C2784("Failed to instantiate dynamite loader", e);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final IBinder m4525(String str) throws C2784 {
        try {
            return (IBinder) this.f8005.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C2784("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
