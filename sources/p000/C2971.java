package p000;

import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.work.Worker;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.bluecat.yandexmapspatcher.bridge.ShizukuService;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.workers.UpdateJob;

/* JADX INFO: renamed from: ۦؐؒۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2971 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9958;

    public /* synthetic */ C2971(Worker worker) {
        this.f9958 = 20;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x016b  */
    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        boolean z;
        boolean z2 = false;
        Process processExec = null;
        switch (this.f9958) {
            case 0:
                return new C1122();
            case 1:
                return new C5108(new LinkedHashMap());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return null;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C3945(0);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return null;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return new C5209(C2258.f7505, C4304.f14238);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                PackageInfo packageInfoM1036 = AbstractC0487.m1036(new C4441(new long[]{4696135306083098582L, -6242969895935365056L, -9012664936309599811L, 3829194265105293957L}).toString());
                if (packageInfoM1036 == null) {
                    return null;
                }
                ApplicationInfo applicationInfo = packageInfoM1036.applicationInfo;
                return (applicationInfo != null ? applicationInfo.dataDir : null) + "/files/ym_mmkv";
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1831();
            case 8:
                String string = new C4441(new long[]{-8245829958352805805L, -2420882387882464960L, 5626083231197380556L, 2431949120326455570L, -2993436678013322822L}).toString();
                Class<ShizukuService> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(ShizukuService.class));
                C3268 c3268 = new C3268(new ComponentName(string, (clsM9037 != null ? clsM9037 : ShizukuService.class).getName()));
                c3268.f10983 = new C4441(new long[]{9039823623088677199L, 5948894130749932393L, -7178534738619747835L}).toString();
                c3268.f10980 = new C4441(new long[]{-4661398319348263393L, -7871253994232873187L}).toString();
                c3268.f10981 = 394;
                return c3268;
            case 9:
                App app = App.f407;
                AbstractC1631.m3410();
                AbstractC5537.f18287 = 0;
                if (AbstractC0949.m1961("su")) {
                    z2 = true;
                } else {
                    try {
                        processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
                        boolean z3 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
                        processExec.destroy();
                        z = z3;
                    } catch (Throwable unused) {
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        z = false;
                    }
                    if (z || AbstractC0949.m1961("magisk")) {
                        z2 = true;
                    } else if (RootBeerNative.f358) {
                        String[] strArrM5223 = AbstractC2776.m5223();
                        int length = strArrM5223.length;
                        String[] strArr = new String[length];
                        for (int i = 0; i < length; i++) {
                            strArr[i] = AbstractC3761.m6621(new StringBuilder(), strArrM5223[i], "su");
                        }
                        RootBeerNative rootBeerNative = new RootBeerNative();
                        try {
                            rootBeerNative.setLogDebugMessages(false);
                            if (rootBeerNative.checkForRoot(strArr) > 0) {
                                z2 = true;
                            }
                        } catch (UnsatisfiedLinkError unused2) {
                        }
                    } else {
                        AbstractC5537.m9246("We could not load the native library to test for root");
                    }
                }
                return Boolean.valueOf(z2);
            case 10:
                try {
                    System.loadLibrary(new C4441(new long[]{-7522564837717254450L, -6842945668903635025L, 6275343014088190796L}).toString());
                    break;
                } catch (UnsatisfiedLinkError e) {
                    if (AbstractC0684.m1527(e.toString(), new C4441(new long[]{-2304246090248640736L, 4747066259801787876L, -7727664104355195793L}).toString(), false)) {
                        App app2 = App.f407;
                        App appM5217 = AbstractC2776.m5217();
                        C5714 c5714M169 = appM5217.m169();
                        String string2 = new C4441(new long[]{8065517445107131950L, 2423557410732240132L, 4677498619887041201L, 6132221533029049621L, -3958151262026460225L, -7547309323344340874L}).toString();
                        C3525 c3525 = c5714M169.f18806;
                        ((ExecutorC2291) c3525.f11687.f9378).m4345(new CallableC3283(c3525, System.currentTimeMillis() - c3525.f11679, string2));
                        C3525 c3526 = appM5217.m169().f18806;
                        Map map = Collections.EMPTY_MAP;
                        ((ExecutorC2291) c3526.f11687.f9378).m4346(new RunnableC5689(c3526, e));
                    }
                    return Boolean.valueOf(z2);
                }
                z2 = true;
                return Boolean.valueOf(z2);
            case 11:
                return new C4497(0.0f);
            case 12:
            case 13:
                return null;
            case 14:
                return AbstractC3700.f12337;
            case 15:
                return new C0873(0L);
            case 16:
                return new C0873(0L);
            case 17:
                return AbstractC4712.f15538;
            case 18:
                return new C4413();
            case 19:
                C3393 c3393 = new C3393(1, UpdateJob.class);
                C4142 c4142 = c3393.f11290;
                int i2 = C4142.f13775;
                c4142.f13786 = 86400000L;
                c4142.f13794 = AbstractC4554.m7941(86400000L, 300000L, 86400000L);
                c3393.f11290.f13796 = 3600000L;
                if (Long.MAX_VALUE - System.currentTimeMillis() > c3393.f11290.f13796) {
                    return (C1320) c3393.m6151();
                }
                C1078.m2272("The given initial delay is too large and will cause an overflow!");
                return null;
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }

    public /* synthetic */ C2971(int i) {
        this.f9958 = i;
    }
}
