package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: ۥٔۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1377 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f4711;

    /* JADX INFO: renamed from: ۥُ */
    public final Object f4712;

    /* JADX INFO: renamed from: ۥّ */
    public final Object f4713;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f4714;

    /* JADX INFO: renamed from: ۥۜ */
    public final Object f4715;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f4716;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f4717;

    /* JADX INFO: renamed from: ۦٛ */
    public Object f4718;

    /* JADX INFO: renamed from: ۦۙ */
    public Object f4719;

    public C1377(C0377 c0377) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f4716 = 0;
        Object obj = new Object();
        this.f4713 = obj;
        this.f4719 = new C2332();
        this.f4714 = false;
        this.f4711 = false;
        this.f4715 = new C2332();
        c0377.m825();
        Context context = c0377.f1410;
        this.f4712 = c0377;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f4717 = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f4711 = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            if (boolValueOf2 == null) {
                this.f4711 = false;
                boolValueOf = null;
            } else {
                this.f4711 = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f4718 = boolValueOf;
        synchronized (obj) {
            try {
                if (m2929()) {
                    ((C2332) this.f4719).m4374(null);
                    this.f4714 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static boolean m2914(C0605 c0605, C3693 c3693) {
        boolean zM4385;
        if (c3693 != null) {
            if (c0605.f2252 == 3) {
                c0605.m1318();
            }
            zM4385 = c0605.f2261.f4252.m4385(c3693.f12325);
        } else {
            C2339 c2339 = c0605.f2261.f4252;
            C3693 c3694 = c2339.f7769 ? new C3693(c2339.f983) : null;
            if (c3694 != null) {
                if (c0605.f2252 == 3) {
                    c0605.m1318();
                }
                zM4385 = c0605.f2261.f4252.m4385(c3694.f12325);
            } else {
                c0605.getClass();
                zM4385 = false;
            }
        }
        C0605 c0605M1356 = c0605.m1356();
        if (zM4385 && c0605M1356 != null) {
            if (c0605.m1325() == 1) {
                C0605.m1312(c0605M1356, false, 3);
                return zM4385;
            }
            if (c0605.m1325() == 2) {
                c0605M1356.m1336(false);
            }
        }
        return zM4385;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: ۥۗ */
    public static boolean m2915(C0605 c0605, C3693 c3693) {
        boolean zM5509;
        C0605 c0606 = c0605.f2271;
        C1233 c1233 = c0605.f2261;
        if (c0606 == null) {
            return false;
        }
        if (c3693 == null) {
            C2921 c2921 = c1233.f4240;
            C3693 c3694 = c2921 != null ? c2921.f9810 : null;
            if (c3694 == null || c0606 == null) {
                zM5509 = false;
            } else {
                zM5509 = c2921.m5509(c3694.f12325);
            }
        } else if (c0606 != null) {
            zM5509 = c1233.f4240.m5509(c3693.f12325);
        } else {
            zM5509 = false;
        }
        C0605 c0605M1356 = c0605.m1356();
        if (zM5509 && c0605M1356 != null) {
            if (c0605M1356.f2271 == null) {
                C0605.m1312(c0605M1356, false, 3);
                return zM5509;
            }
            if (c0605.m1320() == 1) {
                C0605.m1313(c0605M1356, false, 3);
                return zM5509;
            }
            if (c0605.m1320() == 2) {
                c0605M1356.m1346(false);
            }
        }
        return zM5509;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static boolean m2916(C0605 c0605) {
        C2921 c2921;
        C0143 c0143;
        if (c0605.f2261.f4238) {
            return (c0605.m1320() == 3 && ((c2921 = c0605.f2261.f4240) == null || (c0143 = c2921.f9808) == null || !c0143.m314())) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۦٛ */
    public static boolean m2917(C0605 c0605) {
        if (c0605.m1324()) {
            do {
                if (c0605.m1325() != 3 || c0605.f2261.f4252.f7768.m314()) {
                    c0605 = c0605.m1356();
                    if (c0605 == null) {
                    }
                } else {
                    C0605 c0605M1356 = c0605.m1356();
                    if ((c0605M1356 != null ? c0605M1356.f2261.f4244 : 0) == 1) {
                        c0605 = c0605.m1356();
                        if (c0605 == null) {
                        }
                    }
                }
            } while (!c0605.m1342());
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static boolean m2918(C0605 c0605) {
        C2921 c2921;
        C0143 c0143;
        C1233 c1233 = c0605.f2261;
        return c0605.m1342() || c1233.f4252.f7767 || m2917(c0605) || AbstractC3831.m6874(c0605.m1349(), Boolean.TRUE) || m2916(c0605) || c1233.f4252.f7768.m314() || !((c2921 = c1233.f4240) == null || (c0143 = c2921.f9808) == null || !c0143.m314());
    }

    public String toString() {
        switch (this.f4716) {
            case 1:
                Map map = (Map) this.f4718;
                Long l = (Long) this.f4715;
                Long l2 = (Long) this.f4719;
                Long l3 = (Long) this.f4713;
                Long l4 = (Long) this.f4712;
                ArrayList arrayList = new ArrayList();
                if (this.f4714) {
                    arrayList.add("isRegularFile");
                }
                if (this.f4711) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4);
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3);
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2);
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return AbstractC0973.m2056(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public void m2919(C0605 c0605, boolean z) {
        if (c0605.f2242) {
            return;
        }
        C3693 c3693 = c0605 == ((C0605) this.f4717) ? (C3693) this.f4718 : null;
        if (z) {
            m2915(c0605, c3693);
        } else {
            m2914(c0605, c3693);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m2920(C0605 c0605) {
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0606 = (C0605) objArr[i2];
            if (AbstractC3831.m6874(c0606.m1349(), Boolean.TRUE) && !c0606.f2242) {
                if (((C2808) this.f4712).m5338(c0606)) {
                    c0606.m1353();
                }
                m2920(c0606);
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public void m2921(C0605 c0605, boolean z) {
        if (!this.f4714) {
            AbstractC3480.m6278("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? c0605.f2261.f4238 : c0605.m1324()) {
            AbstractC3480.m6279("node not yet measured");
        }
        m2931(c0605, z);
    }

    /* JADX INFO: renamed from: ۥْ */
    public boolean m2922(C0605 c0605, boolean z) {
        boolean zM2914 = false;
        if (!c0605.f2242 && m2918(c0605)) {
            C3693 c3693 = c0605 == ((C0605) this.f4717) ? (C3693) this.f4718 : null;
            if (z) {
                if (c0605.f2261.f4238) {
                    zM2914 = m2915(c0605, c3693);
                }
            } else if (c0605.m1324()) {
                zM2914 = m2914(c0605, c3693);
            }
            m2926();
        }
        return zM2914;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public void m2923(C0605 c0605) {
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0606 = (C0605) objArr[i2];
            if (c0606.m1325() == 1 || c0606.f2261.f4252.f7768.m314()) {
                if (AbstractC2765.m5126(c0606)) {
                    m2919(c0606, true);
                } else {
                    m2923(c0606);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public boolean m2924(C0605 c0605, boolean z) {
        int iM6632 = AbstractC3761.m6632(c0605.f2261.f4244);
        if (iM6632 != 0 && iM6632 != 1) {
            if (iM6632 == 2 || iM6632 == 3) {
                ((C0863) this.f4715).m1843(new C0245(c0605, false, z));
            } else {
                if (iM6632 != 4) {
                    C1078.m2275();
                    return false;
                }
                if (!c0605.m1324() || z) {
                    c0605.f2261.f4252.f7765 = true;
                    if (!c0605.f2242 && (c0605.m1342() || m2917(c0605))) {
                        C0605 c0605M1356 = c0605.m1356();
                        if (c0605M1356 == null || !c0605M1356.m1324()) {
                            ((C2808) this.f4712).m5348(3, c0605);
                        }
                        if (!this.f4711) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m2925(boolean z) {
        C3369 c3369 = (C3369) this.f4713;
        C0863 c0863 = (C0863) c3369.f11255;
        if (z) {
            C0605 c0605 = (C0605) this.f4717;
            if (c0605.f2274 > 0) {
                c0863.m1851();
                c0863.m1843(c0605);
                c0605.f2260 = true;
            }
        }
        if (c0863.f3180 != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                c3369.m6136();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m2926() {
        C0863 c0863 = (C0863) this.f4715;
        int i = c0863.f3180;
        if (i != 0) {
            Object[] objArr = c0863.f3182;
            for (int i2 = 0; i2 < i; i2++) {
                C0245 c0245 = (C0245) objArr[i2];
                if (c0245.f914.m1348()) {
                    boolean z = c0245.f913;
                    C0605 c0605 = c0245.f914;
                    boolean z2 = c0245.f912;
                    if (z) {
                        C0605.m1313(c0605, z2, 2);
                    } else {
                        C0605.m1312(c0605, z2, 2);
                    }
                }
            }
            c0863.m1851();
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public void m2927(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (((Boolean) this.f4718) == null) {
            str = "global Firebase setting";
        } else {
            str = this.f4711 ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String str3 = "Crashlytics automatic data collection " + str2 + " by " + str + ".";
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX INFO: renamed from: ۦٌ */
    public boolean m2928(C3155 c3155) {
        boolean z;
        ?? M9233;
        boolean z2;
        C0605 c0605;
        boolean z3;
        boolean zM2922;
        C2808 c2808 = (C2808) this.f4712;
        C5086 c5086 = (C5086) c2808.f9378;
        C0605 c0606 = (C0605) this.f4717;
        if (!c0606.m1348()) {
            AbstractC3480.m6279("performMeasureAndLayout called with unattached root");
        }
        if (!c0606.m1342()) {
            AbstractC3480.m6279("performMeasureAndLayout called with unplaced root");
        }
        if (this.f4714) {
            AbstractC3480.m6279("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (((C3693) this.f4718) != null) {
            this.f4714 = true;
            this.f4711 = true;
            try {
                if (c2808.m5354()) {
                    z = false;
                    while (true) {
                        C5086 c5087 = (C5086) c2808.f9377;
                        C5646 c5646 = (C5646) c5087.f16877;
                        C5086 c5088 = (C5086) c2808.f9376;
                        C5646 c5647 = (C5646) c5088.f16877;
                        if (!((C5646) c5086.f16877).isEmpty()) {
                            c0605 = (C0605) ((C5646) c5086.f16877).first();
                            c5086.m8697(c0605);
                            z3 = c0605.f2271 != null;
                            z2 = false;
                        } else if (!c5647.isEmpty()) {
                            c0605 = (C0605) c5647.first();
                            c5088.m8697(c0605);
                            z3 = c0605.f2271 != null;
                            z2 = true;
                        } else {
                            if (c5646.isEmpty()) {
                                break;
                            }
                            C0605 c0607 = (C0605) c5646.first();
                            c5087.m8697(c0607);
                            z2 = true;
                            c0605 = c0607;
                            z3 = false;
                        }
                        if (z2) {
                            zM2922 = m2933(c0605, z3);
                        } else {
                            zM2922 = m2922(c0605, z3);
                            if (c0605.f2261.f4239) {
                                c2808.m5348(2, c0605);
                            }
                            if (c0605.m1364()) {
                                c2808.m5348(4, c0605);
                            }
                        }
                        if (c0605 == c0606 && zM2922) {
                            z = true;
                        }
                    }
                    if (c3155 != null) {
                        c3155.mo449();
                    }
                } else {
                    z = false;
                }
                this.f4714 = false;
                this.f4711 = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.f4714 = false;
                    this.f4711 = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        C0863 c0863 = (C0863) this.f4719;
        Object[] objArr = c0863.f3182;
        int i2 = c0863.f3180;
        int i3 = 0;
        while (i3 < i2) {
            C2457 c2457 = ((C0605) objArr[i3]).f2256;
            C2935 c2935 = (C2935) c2457.f8206;
            boolean zM9196 = AbstractC5490.m9196(4194304);
            AbstractC5381 abstractC5381 = c2935.f9864;
            if (zM9196 || (abstractC5381 = abstractC5381.f17780) != null) {
                C1117 c1117 = AbstractC1311.f4507;
                AbstractC5381 abstractC5381M2810 = c2935.m2810(zM9196);
                while (abstractC5381M2810 != null && (abstractC5381M2810.f17782 & 4194304) != 0) {
                    if ((abstractC5381M2810.f17781 & 4194304) != 0) {
                        ?? r12 = abstractC5381M2810;
                        ?? c0864 = 0;
                        while (r12 != 0) {
                            if (r12 instanceof InterfaceC3126) {
                                ((InterfaceC3126) r12).mo5752((C2935) c2457.f8206);
                            } else {
                                if ((r12.f17781 & 4194304) != 0 && (r12 instanceof AbstractC3019)) {
                                    AbstractC5381 abstractC5382 = ((AbstractC3019) r12).f10167;
                                    int i4 = i;
                                    while (abstractC5382 != null) {
                                        if ((abstractC5382.f17781 & 4194304) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                M9233 = r12;
                                                c0864 = c0864;
                                                c0864 = c0864;
                                                M9233 = abstractC5382;
                                            } else {
                                                if (c0864 == 0) {
                                                    c0864 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (M9233 != 0) {
                                                    c0864.m1843(M9233);
                                                    M9233 = 0;
                                                }
                                                c0864.m1843(abstractC5382);
                                            }
                                        } else {
                                            M9233 = r12;
                                            c0864 = c0864;
                                        }
                                        abstractC5382 = abstractC5382.f17783;
                                        M9233 = M9233;
                                        c0864 = c0864;
                                    }
                                    if (i4 == 1) {
                                        M9233 = r12;
                                        c0864 = c0864;
                                    }
                                }
                                i = 0;
                                r12 = M9233;
                                c0864 = c0864;
                            }
                            M9233 = r12;
                            c0864 = c0864;
                            M9233 = AbstractC5537.m9233(c0864);
                            i = 0;
                            r12 = M9233;
                            c0864 = c0864;
                        }
                    }
                    if (abstractC5381M2810 == abstractC5381) {
                        break;
                    }
                    abstractC5381M2810 = abstractC5381M2810.f17783;
                    i = 0;
                }
            }
            i3++;
            i = 0;
        }
        c0863.m1851();
        return z;
    }

    /* JADX INFO: renamed from: ۦِ */
    public synchronized boolean m2929() {
        boolean zBooleanValue;
        boolean z;
        Boolean bool = (Boolean) this.f4718;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            try {
                C0377 c0377 = (C0377) this.f4712;
                c0377.m825();
                C5491 c5491 = (C5491) c0377.f1414.get();
                synchronized (c5491) {
                    z = c5491.f18101;
                }
                zBooleanValue = z;
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
        }
        m2927(zBooleanValue);
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public void m2930(long j) {
        C0605 c0605 = (C0605) this.f4717;
        C3693 c3693 = (C3693) this.f4718;
        if (c3693 == null ? false : C3693.m6547(c3693.f12325, j)) {
            return;
        }
        if (this.f4714) {
            AbstractC3480.m6279("updateRootConstraints called while measuring");
        }
        this.f4718 = new C3693(j);
        C0605 c0606 = c0605.f2271;
        C1233 c1233 = c0605.f2261;
        if (c0606 != null) {
            c1233.f4238 = true;
        }
        c1233.f4252.f7765 = true;
        ((C2808) this.f4712).m5348(c0606 == null ? 3 : 1, c0605);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m2931(C0605 c0605, boolean z) {
        C2921 c2921;
        C0143 c0143;
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0606 = (C0605) objArr[i2];
            if ((!z && (c0606.m1325() == 1 || c0606.f2261.f4252.f7768.m314())) || (z && (c0606.m1320() == 1 || ((c2921 = c0606.f2261.f4240) != null && (c0143 = c2921.f9808) != null && c0143.m314())))) {
                boolean zM5126 = AbstractC2765.m5126(c0606);
                C1233 c1233 = c0606.f2261;
                if (zM5126 && !z) {
                    if (c1233.f4238 && ((C2808) this.f4712).m5338(c0606)) {
                        m2922(c0606, true);
                    } else {
                        m2921(c0606, true);
                    }
                }
                if (z ? c1233.f4238 : c0606.m1324()) {
                    m2922(c0606, z);
                }
                if (!(z ? c1233.f4238 : c0606.m1324())) {
                    m2931(c0606, z);
                }
            }
        }
        if (z ? c0605.f2261.f4238 : c0605.m1324()) {
            m2922(c0605, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX INFO: renamed from: ۦۚ */
    public void m2932(C0605 c0605, long j) {
        C0605 c0606 = (C0605) this.f4717;
        boolean z = c0605.f2242;
        C1233 c1233 = c0605.f2261;
        if (z) {
            return;
        }
        if (c0605 == c0606) {
            AbstractC3480.m6279("measureAndLayout called on root");
        }
        if (!c0606.m1348()) {
            AbstractC3480.m6279("performMeasureAndLayout called with unattached root");
        }
        if (!c0606.m1342()) {
            AbstractC3480.m6279("performMeasureAndLayout called with unplaced root");
        }
        if (this.f4714) {
            AbstractC3480.m6279("performMeasureAndLayout called during measure layout");
        }
        if (((C3693) this.f4718) != null) {
            this.f4714 = true;
            this.f4711 = false;
            try {
                C2808 c2808 = (C2808) this.f4712;
                ((C5086) c2808.f9378).m8697(c0605);
                ((C5086) c2808.f9376).m8697(c0605);
                ((C5086) c2808.f9377).m8697(c0605);
                if (m2915(c0605, new C3693(j)) || c1233.f4239) {
                    if (AbstractC3831.m6874(c0605.m1349(), Boolean.TRUE)) {
                        c0605.m1353();
                    }
                }
                m2920(c0605);
                if (c0605.f2252 == 3) {
                    c0605.m1318();
                }
                boolean zM4385 = c1233.f4252.m4385(j);
                C0605 c0605M1356 = c0605.m1356();
                if (zM4385 && c0605M1356 != null) {
                    if (c0605.m1325() == 1) {
                        C0605.m1312(c0605M1356, false, 3);
                    } else if (c0605.m1325() == 2) {
                        c0605M1356.m1336(false);
                    }
                }
                if (c0605.m1364() && c0605.m1342()) {
                    c0605.m1340();
                    C3369 c3369 = (C3369) this.f4713;
                    if (c0605.f2274 > 0) {
                        ((C0863) c3369.f11255).m1843(c0605);
                        c0605.f2260 = true;
                    }
                }
                m2926();
                this.f4714 = false;
                this.f4711 = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.f4714 = false;
                    this.f4711 = false;
                    throw th2;
                }
            }
        }
        C0863 c0863 = (C0863) this.f4719;
        Object[] objArr = c0863.f3182;
        int i = c0863.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C2457 c2457 = ((C0605) objArr[i2]).f2256;
            C2935 c2935 = (C2935) c2457.f8206;
            boolean zM9196 = AbstractC5490.m9196(4194304);
            AbstractC5381 abstractC5381 = c2935.f9864;
            if (zM9196 || (abstractC5381 = abstractC5381.f17780) != null) {
                C1117 c1117 = AbstractC1311.f4507;
                for (AbstractC5381 abstractC5381M2810 = c2935.m2810(zM9196); abstractC5381M2810 != null && (abstractC5381M2810.f17782 & 4194304) != 0; abstractC5381M2810 = abstractC5381M2810.f17783) {
                    if ((abstractC5381M2810.f17781 & 4194304) != 0) {
                        ?? M9233 = abstractC5381M2810;
                        ?? c0864 = 0;
                        while (M9233 != 0) {
                            if (M9233 instanceof InterfaceC3126) {
                                ((InterfaceC3126) M9233).mo5752((C2935) c2457.f8206);
                            } else if ((M9233.f17781 & 4194304) != 0 && (M9233 instanceof AbstractC3019)) {
                                AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                                int i3 = 0;
                                while (abstractC5382 != null) {
                                    if ((abstractC5382.f17781 & 4194304) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            M9233 = M9233;
                                            c0864 = c0864;
                                            c0864 = c0864;
                                            M9233 = abstractC5382;
                                        } else {
                                            if (c0864 == 0) {
                                                c0864 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (M9233 != 0) {
                                                c0864.m1843(M9233);
                                                M9233 = 0;
                                            }
                                            c0864.m1843(abstractC5382);
                                        }
                                    } else {
                                        M9233 = M9233;
                                        c0864 = c0864;
                                    }
                                    abstractC5382 = abstractC5382.f17783;
                                    M9233 = M9233;
                                    c0864 = c0864;
                                }
                                if (i3 == 1) {
                                    M9233 = M9233;
                                    c0864 = c0864;
                                } else {
                                    M9233 = M9233;
                                    c0864 = c0864;
                                }
                            }
                            M9233 = AbstractC5537.m9233(c0864);
                        }
                    }
                    if (abstractC5381M2810 == abstractC5381) {
                        break;
                    }
                }
            }
        }
        c0863.m1851();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean m2933(C0605 c0605, boolean z) {
        C0605 c0605M1356;
        C0605 c0606 = (C0605) this.f4717;
        boolean z2 = c0605.f2242;
        C1233 c1233 = c0605.f2261;
        boolean zM2915 = false;
        if (!z2 && m2918(c0605)) {
            C3693 c3693 = c0605 == c0606 ? (C3693) this.f4718 : null;
            if (z) {
                zM2915 = c1233.f4238 ? m2915(c0605, c3693) : false;
                if ((zM2915 || c1233.f4239) && AbstractC3831.m6874(c0605.m1349(), Boolean.TRUE)) {
                    c0605.m1353();
                }
            } else {
                boolean zM2914 = c0605.m1324() ? m2914(c0605, c3693) : false;
                if (c0605.m1364() && (c0605 == c0606 || ((c0605M1356 = c0605.m1356()) != null && c0605M1356.m1342() && c1233.f4252.f7767))) {
                    if (c0605 == c0606) {
                        if (c0605.f2252 == 3) {
                            c0605.m1345();
                        }
                        C0605 c0605M1357 = c0605.m1356();
                        AbstractC1842.m3623(c0605M1357 != null ? ((C2935) c0605M1357.f2256.f8206).f12090 : ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605)).getPlacementScope(), c1233.f4252, 0, 0);
                    } else {
                        c0605.m1340();
                    }
                    C3369 c3369 = (C3369) this.f4713;
                    if (c0605.f2274 > 0) {
                        ((C0863) c3369.f11255).m1843(c0605);
                        c0605.f2260 = true;
                    }
                }
                zM2915 = zM2914;
            }
            m2926();
        }
        return zM2915;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m2934() {
        C0605 c0605 = (C0605) this.f4717;
        C2808 c2808 = (C2808) this.f4712;
        if (c2808.m5354()) {
            if (!c0605.m1348()) {
                AbstractC3480.m6279("performMeasureAndLayout called with unattached root");
            }
            if (!c0605.m1342()) {
                AbstractC3480.m6279("performMeasureAndLayout called with unplaced root");
            }
            if (this.f4714) {
                AbstractC3480.m6279("performMeasureAndLayout called during measure layout");
            }
            if (((C3693) this.f4718) != null) {
                this.f4714 = true;
                this.f4711 = false;
                try {
                    if ((((C5646) ((C5086) c2808.f9377).f16877).isEmpty() || ((C5646) ((C5086) c2808.f9378).f16877).isEmpty()) ? false : true) {
                        if (c0605.f2271 != null) {
                            m2919(c0605, true);
                        } else {
                            m2923(c0605);
                        }
                    }
                    m2919(c0605, false);
                    this.f4714 = false;
                    this.f4711 = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.f4714 = false;
                        this.f4711 = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public C1377(C0605 c0605) {
        this.f4716 = 2;
        this.f4717 = c0605;
        this.f4712 = new C2808(10);
        this.f4713 = new C3369(22);
        this.f4719 = new C0863(new C0605[16]);
        this.f4715 = new C0863(new C0245[16]);
    }

    public C1377(boolean z, boolean z2, C5051 c5051, Long l, Long l2, Long l3, Long l4, Map map) {
        this.f4716 = 1;
        this.f4714 = z;
        this.f4711 = z2;
        this.f4717 = c5051;
        this.f4712 = l;
        this.f4713 = l2;
        this.f4719 = l3;
        this.f4715 = l4;
        this.f4718 = AbstractC4554.m7938(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1377(boolean z, boolean z2, C5051 c5051, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, c5051, l, l2, l3, l4, C0204.f751);
        this.f4716 = 1;
    }
}
