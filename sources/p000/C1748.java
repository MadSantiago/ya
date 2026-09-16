package p000;

import android.app.Application;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۥٚؗۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1748 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ App f5819;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5820;

    public /* synthetic */ C1748(App app, int i) {
        this.f5820 = i;
        this.f5819 = app;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        C3600 c3600;
        int i = this.f5820;
        int i2 = 1;
        App app = this.f5819;
        switch (i) {
            case 0:
                C3509 c3509 = (C3509) obj;
                C1414 c1414 = c3509.f11620;
                if (AbstractC3761.m6627(5, 2) <= 0) {
                    AbstractC3761.m6627(5, 2);
                }
                c1414.m2994(Collections.singletonList(AbstractC0487.m1067(new C1748(app, i2))));
                Object obj2 = C3600.f11984;
                synchronized (obj2) {
                    try {
                        c3600 = C3600.f11985;
                        if (c3600 == null) {
                            c3600 = C3600.f11983;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c3600 == null) {
                    C4010 c4010 = new C4010();
                    c4010.f13372.add(new C3132());
                    C5086 c5086 = new C5086(12, false);
                    c5086.f16877 = c4010;
                    C2813 c2813 = new C2813(c5086);
                    Context context = (Context) ((C2354) ((C1489) c1414.f4869).f5056).m4427(AbstractC5041.m8557(Context.class), null, null);
                    synchronized (obj2) {
                        try {
                            C3600 c3601 = C3600.f11985;
                            if (c3601 != null && C3600.f11983 != null) {
                                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                            }
                            if (c3601 == null) {
                                Context applicationContext = context.getApplicationContext();
                                C3600 c3600M9067 = C3600.f11983;
                                if (c3600M9067 == null) {
                                    c3600M9067 = AbstractC5378.m9067(applicationContext, c2813);
                                    C3600.f11983 = c3600M9067;
                                }
                                C3600.f11985 = c3600M9067;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                List listM509 = AbstractC0246.m509(new C0287[]{AbstractC3327.f11139, AbstractC3327.f11138, AbstractC3327.f11137, AbstractC3327.f11140});
                if (AbstractC3761.m6627(5, 2) <= 0) {
                    long jM2659 = AbstractC1266.m2659();
                    c3509.f11620.m2994(listM509);
                    long jM2597 = AbstractC1232.m2597(jM2659);
                    ((ConcurrentHashMap) ((C2808) c1414.f4867).f9376).size();
                    C5805.m9621(jM2597, EnumC3021.MICROSECONDS);
                } else {
                    c3509.f11620.m2994(listM509);
                }
                return C2358.f7817;
            default:
                C0287 c0287 = (C0287) obj;
                C4671 c4671 = C1489.f5055;
                C0114 c0114 = new C0114(AbstractC5041.m8557(Application.class), null, new C4164(6, app), 1);
                C2301 c2301 = new C2301(c0114);
                c0287.m609(c2301);
                C3131 c3131M8557 = AbstractC5041.m8557(Context.class);
                c0114.f455.add(c3131M8557);
                c0287.f1065.put(AbstractC2919.m5505(c3131M8557) + "::" + c4671, c2301);
                return C2358.f7817;
        }
    }
}
