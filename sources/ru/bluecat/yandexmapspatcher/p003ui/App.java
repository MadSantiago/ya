package ru.bluecat.yandexmapspatcher.p003ui;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000.AbstractC0487;
import p000.AbstractC0502;
import p000.AbstractC0684;
import p000.AbstractC2539;
import p000.AbstractC2552;
import p000.AbstractC2765;
import p000.AbstractC2776;
import p000.AbstractC3327;
import p000.AbstractC3533;
import p000.AbstractC3801;
import p000.AbstractC4489;
import p000.AbstractC5239;
import p000.AbstractC5537;
import p000.C0086;
import p000.C0113;
import p000.C0178;
import p000.C0287;
import p000.C0377;
import p000.C1377;
import p000.C1397;
import p000.C1443;
import p000.C1542;
import p000.C1748;
import p000.C1976;
import p000.C1984;
import p000.C2332;
import p000.C2432;
import p000.C2518;
import p000.C2993;
import p000.C3267;
import p000.C3286;
import p000.C3509;
import p000.C3525;
import p000.C3657;
import p000.C3754;
import p000.C4441;
import p000.C5028;
import p000.C5714;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class App extends Application {

    /* JADX INFO: renamed from: ۥَ */
    public static App f406;

    /* JADX INFO: renamed from: ۥٓ */
    public static App f407;

    /* JADX INFO: renamed from: ۥْ */
    public C5714 f408;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1443 f409;

    /* JADX INFO: renamed from: ۦۨ */
    public final C1443 f410;

    public App() {
        String string = new C4441(new long[]{-1588408983305106088L, -6041947300529800334L, 1207534377319014645L, 4542225338286431683L}).toString();
        C1443 c1443 = new C1443();
        c1443.f4945 = this;
        c1443.f4944 = "";
        if (!AbstractC0684.m1534(string)) {
            c1443.f4944 = string;
        }
        this.f410 = c1443;
        String string2 = new C4441(new long[]{-5830533618734859538L, 8655306532553493823L, -975253278291893682L}).toString();
        C1443 c1444 = new C1443();
        c1444.f4945 = this;
        c1444.f4944 = "";
        if (!AbstractC0684.m1534(string2)) {
            c1444.f4944 = string2;
        }
        this.f409 = c1444;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    @Override // android.app.Application
    public final void onCreate() {
        Boolean bool;
        m168();
        f406 = this;
        AbstractC4489.m7785(new C4441(new long[]{2502876943835070712L, -6049494224883738862L, -7216265003516610270L, -6357888970755023046L, 7947908444609424313L}).toString());
        ExecutorService executorService = C3267.f10970;
        int i = 2;
        if (AbstractC2552.m4815() == null) {
            C1984 c1984 = new C1984();
            c1984.f6551 = 2;
            synchronized (AbstractC2552.class) {
                if (AbstractC2552.f8514 || AbstractC2552.m4815() != null) {
                    throw new IllegalStateException("The main shell was already created");
                }
                AbstractC2552.f8511 = c1984;
            }
        }
        C2432 c2432 = AbstractC5239.f17296;
        C1443 c1443 = AbstractC2776.m5217().f410;
        C1542 c1542 = AbstractC2539.f8459;
        String str = c1542.f5219;
        boolean z = C1443.f4940;
        if (!((!z || c1443.f4946) ? c1443.m3067().contains(str) : c1443.m3072().contains(str))) {
            C2518 c2518 = new C2518(c1443);
            c2518.m4661(394, c1542.f5219);
            SharedPreferences.Editor editor = c2518.f8351;
            if (editor != null) {
                editor.apply();
            }
            if (!z && !c1443.f4943) {
                try {
                    AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
                } catch (Throwable unused) {
                }
            }
        }
        App appM5217 = AbstractC2776.m5217();
        C1443 c1444 = appM5217.f410;
        C1542 c1543 = AbstractC2539.f8450;
        Object obj = c1542.f5218;
        String str2 = c1542.f5219;
        boolean z2 = C1443.f4940;
        if (395 > ((Integer) c1444.m3068(obj, str2)).intValue()) {
            if (!AbstractC0502.f1818 && ((Boolean) AbstractC0502.f1816.getValue()).booleanValue()) {
                C3267.m6029(new C5028(27));
            }
            C1443 c1445 = appM5217.f410;
            c1445.getClass();
            C2518 c2519 = new C2518(c1445);
            c2519.m4661(395, AbstractC2539.f8459.f5219);
            SharedPreferences.Editor editor2 = c2519.f8351;
            if (editor2 != null) {
                editor2.apply();
            }
            if (!C1443.f4940 && !c1445.f4943) {
                try {
                    AbstractC2765.m5147(c1445.f4945, c1445.m3070().concat(".xml"));
                } catch (Throwable unused2) {
                }
            }
        }
        C1443 c1446 = this.f410;
        String str3 = AbstractC2539.f8442.f5219;
        int i2 = 3;
        if (!((!C1443.f4940 || c1446.f4946) ? c1446.m3067().contains(str3) : c1446.m3072().contains(str3)) && !((Boolean) AbstractC0502.f1816.getValue()).booleanValue()) {
            c1446.m3071(new C0086(i2));
        }
        C0287 c0287 = AbstractC3327.f11139;
        C1397 c1397 = C1397.f4780;
        C1748 c1748 = new C1748(this, 0);
        synchronized (c1397) {
            C3509 c3509 = new C3509();
            if (C1397.f4778 != null) {
                throw new C3754(2, "A Koin Application has already been started");
            }
            C1397.f4778 = c3509.f11620;
            c1748.mo211(c3509);
            c3509.f11620.m3008();
        }
        Map map = AbstractC0502.f1819;
        PackageInfo packageInfoM1036 = AbstractC0487.m1036(new C4441(new long[]{6715439973626281129L, 2100296013819042953L, -6959419749956645748L, 8668612677636356590L}).toString());
        if (packageInfoM1036 != null) {
            boolean z3 = C0113.f449;
            if (C0113.m208()) {
                packageInfoM1036 = null;
            } else {
                C3657 c3657M9266 = AbstractC5537.m9266("__--");
                if ((c3657M9266 == null || (bool = (Boolean) c3657M9266.m6535(new Object[0])) == null) ? false : bool.booleanValue()) {
                    packageInfoM1036 = null;
                }
            }
            if (packageInfoM1036 != null && packageInfoM1036.applicationInfo != null) {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(packageInfoM1036.applicationInfo.sourceDir).entries();
                while (enumerationEntries.hasMoreElements()) {
                    String name = enumerationEntries.nextElement().getName();
                    if (AbstractC0684.m1527(name, new C4441(new long[]{-3178009725006042986L, -2083182993315190366L, -2415793650322883504L, 6573763400585813359L}).toString(), false)) {
                        AbstractC0502.f1818 = true;
                        AbstractC0502.f1820 = true;
                        break;
                    } else if (AbstractC0684.m1527(name, new C4441(new long[]{5937784595511511408L, -1614575355138274753L}).toString(), false)) {
                        AbstractC0502.f1818 = true;
                    }
                }
            }
        }
        try {
            int i3 = !AbstractC0502.f1818 ? 1 : 0;
            App app = f407;
            if (app == null) {
                throw new IllegalStateException("App is dead, You cannot call to appContext");
            }
            AbstractC0502.f1815 = app.getSharedPreferences(new C4441(new long[]{8377452823487330569L, 6235500467763623325L, -7139484916147618547L}).toString(), i3);
            C0377.m821(this);
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this);
            C0377 c0377M823 = C0377.m823();
            c0377M823.m825();
            C5714 c5714 = (C5714) c0377M823.f1411.mo5371(C5714.class);
            if (c5714 == null) {
                C0178.m387("FirebaseCrashlytics component is not present.");
                return;
            }
            this.f408 = c5714;
            C3525 c3525 = m169().f18806;
            Boolean bool2 = Boolean.TRUE;
            C1377 c1377 = c3525.f11676;
            synchronized (c1377) {
                c1377.f4711 = false;
                c1377.f4718 = bool2;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) c1377.f4717).edit();
                editorEdit.putBoolean("firebase_crashlytics_collection_enabled", true);
                editorEdit.apply();
                synchronized (c1377.f4713) {
                    try {
                        boolean zM2929 = c1377.m2929();
                        boolean z4 = c1377.f4714;
                        if (zM2929) {
                            if (!z4) {
                                ((C2332) c1377.f4719).m4374(null);
                                c1377.f4714 = true;
                            }
                        } else if (z4) {
                            c1377.f4719 = new C2332();
                            c1377.f4714 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C3286 c3286 = firebaseAnalytics.f347;
            c3286.getClass();
            c3286.m6045(new C1976(c3286, bool2));
            C1443 c1447 = this.f410;
            C1542 c1544 = AbstractC2539.f8448;
            Object obj2 = c1544.f5218;
            String str4 = c1544.f5219;
            boolean z5 = C1443.f4940;
            String str5 = (String) c1447.m3068(obj2, str4);
            if (str5.equals(new C4441(new long[]{5766233213345795228L, -587139409721953308L}).toString())) {
                i = 1;
            } else if (!str5.equals(new C4441(new long[]{7724958203870124168L, -6705074773338479442L}).toString())) {
                i = -1;
            }
            AbstractC3533.m6324(i);
        } catch (SecurityException unused3) {
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m168() {
        super.onCreate();
        f407 = this;
        try {
            AbstractC3801.f12618 = new C4441(new long[]{-2413392893113825620L, 1029635455481413521L, -1296537175859697984L, 3466828416808462208L}).toString();
        } catch (Throwable unused) {
        }
        C2993 c2993 = C2993.f10066;
        if (c2993 == null) {
            c2993 = new C2993();
            C2993.f10066 = c2993;
        }
        String packageName = getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        c2993.m5585(this, packageName);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C5714 m169() {
        C5714 c5714 = this.f408;
        if (c5714 != null) {
            return c5714;
        }
        new C4441(new long[]{-3933530045149929599L, 8129673177939112765L, -5957900524016000021L}).toString();
        return null;
    }
}
