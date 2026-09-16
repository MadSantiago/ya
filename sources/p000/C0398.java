package p000;

import android.content.SharedPreferences;
import android.system.OsConstants;
import java.util.Map;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۥؔؔۧٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0398 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2247 f1469;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1470;

    public /* synthetic */ C0398(C2247 c2247, int i) {
        this.f1470 = i;
        this.f1469 = c2247;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f1470;
        int i2 = 1;
        InterfaceC0443 interfaceC0443 = null;
        C2358 c2358 = C2358.f7817;
        C2247 c2247 = this.f1469;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                App app = App.f407;
                App appM5217 = AbstractC2776.m5217();
                C1443 c1443 = appM5217.f409;
                C1443 c1444 = appM5217.f410;
                c1443.getClass();
                C2518 c2518 = new C2518(c1443);
                c2518.m4661(bool, AbstractC2539.f8444.f5219);
                SharedPreferences.Editor editor = c2518.f8351;
                if (editor != null) {
                    editor.apply();
                }
                if (!C1443.f4940 && !c1443.f4943) {
                    try {
                        AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
                        break;
                    } catch (Throwable unused) {
                    }
                }
                if (zBooleanValue) {
                    C1542 c1542 = AbstractC2539.f8450;
                    Object obj2 = c1542.f5218;
                    String str = c1542.f5219;
                    if (!((Boolean) c1444.m3068(obj2, str)).booleanValue()) {
                        c2247.f7457.m9482(true);
                        C2518 c2519 = new C2518(c1444);
                        c2519.m4661(Boolean.TRUE, str);
                        SharedPreferences.Editor editor2 = c2519.f8351;
                        if (editor2 != null) {
                            editor2.apply();
                        }
                        if (!C1443.f4940 && !c1444.f4943) {
                            try {
                                AbstractC2765.m5147(c1444.f4945, c1444.m3070().concat(".xml"));
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                App app2 = App.f407;
                C1443 c1445 = AbstractC2776.m5217().f409;
                c1445.getClass();
                C2518 c25110 = new C2518(c1445);
                c25110.m4661(bool2, AbstractC2539.f8453.f5219);
                SharedPreferences.Editor editor3 = c25110.f8351;
                if (editor3 != null) {
                    editor3.apply();
                }
                if (!C1443.f4940 && !c1445.f4943) {
                    try {
                        AbstractC2765.m5147(c1445.f4945, c1445.m3070().concat(".xml"));
                        break;
                    } catch (Throwable unused3) {
                    }
                }
                C2314 c2314 = c2247.f7458;
                C2432 c2432 = c2314.f7651;
                C2432 c2433 = c2314.f7651;
                if (((String) c2432.getValue()) != null) {
                    C1443 c1446 = AbstractC2776.m5217().f410;
                    C1542 c1543 = AbstractC2539.f8442;
                    Object obj3 = c1543.f5218;
                    String str2 = c1543.f5219;
                    boolean z = C1443.f4940;
                    String str3 = (String) c1446.m3068(obj3, str2);
                    if (str3.equals(new C4441(new long[]{2543503514654095286L, 8719862053437377343L}).toString())) {
                        C5259 c5259 = (C5259) C5063.f16800.f6933;
                        if (c5259 == null) {
                            AbstractC4489.m7804(R.string.toast_binding_root);
                        } else {
                            AbstractC1333 abstractC1333Mo2170 = c5259.mo2170((String) c2433.getValue());
                            if (((C1120) abstractC1333Mo2170).m2349(OsConstants.F_OK)) {
                                abstractC1333Mo2170.delete();
                            }
                        }
                    } else if (!str3.equals(new C4441(new long[]{-1126537924140817478L, 5545970036842221487L}).toString())) {
                        MainActivity mainActivity = MainActivity.f411;
                        MainActivity mainActivityM9214 = AbstractC5537.m9214();
                        AbstractC2765.m5140(mainActivityM9214, new C1225(18, mainActivityM9214, c2314));
                    } else {
                        InterfaceC1897 interfaceC1897 = (InterfaceC1897) AbstractC5781.f19049.f6933;
                        if (interfaceC1897 == null) {
                            AbstractC4489.m7804(R.string.toast_binding_root);
                        } else {
                            interfaceC1897.mo163((String) c2433.getValue());
                        }
                    }
                } else {
                    C3998.m7138(c2314.f7652, 0, null, 7);
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Map map = (Map) obj;
                if (!map.isEmpty()) {
                    AbstractC2765.m5135(AbstractC2776.m5210(c2247), null, 0, new C5030(map, c2247, interfaceC0443, i2), 3);
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                EnumC5242 enumC5242 = ((C1966) c2247.f7455.f10642.getValue()).f6494;
                if (enumC5242 != EnumC5242.f17308) {
                    if (enumC5242 == EnumC5242.f17310) {
                        C2247.m4295();
                    }
                } else if (!zBooleanValue2) {
                    AbstractC2765.m5135(AbstractC2776.m5210(c2247), null, 0, new C0542(c2247, interfaceC0443, i2), 3);
                } else {
                    C2247.m4295();
                }
                break;
        }
        return c2358;
        return c2358;
    }
}
