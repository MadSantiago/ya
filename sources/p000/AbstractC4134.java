package p000;

import com.tencent.mmkv.MMKV;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.DexKitBridge;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.search.EnvironmentInitializer;

/* JADX INFO: renamed from: ۦؚٓؖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4134 extends AbstractC1985 {

    /* JADX INFO: renamed from: ۥُ */
    public Object f13758;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ int f13759;

    public AbstractC4134() {
        this.f13759 = 0;
        this.f13758 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: ۥْ */
    public static C2351 m7316() {
        C2351 c2351 = new C2351(1);
        C0637 c0637 = new C0637();
        C0637.m1442(c0637, new C4441(new long[]{7802305812339534220L, 688940344582339787L}).toString());
        c2351.f7798 = c0637;
        return c2351;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static C2351 m7317(String str) {
        C2351 c2351 = new C2351(1);
        C0637 c0637 = new C0637();
        c0637.m1448(str);
        c2351.f7798 = c0637;
        return c2351;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static void m7318(String str) {
        MMKV mmkvM166 = EnvironmentInitializer.m166();
        if (mmkvM166.m150(str)) {
            mmkvM166.m155(str);
        }
        mmkvM166.trim();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static C2351 m7319(String str) {
        C2351 c2351 = new C2351(0);
        C2672 c2672 = new C2672();
        c2672.m4982(str);
        c2351.f7798 = c2672;
        return c2351;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final C3545 m7320(String str) {
        C3545 c3545 = new C3545();
        c3545.f11777 = mo484();
        c3545.f11776.add(new C2203(5, str, false));
        return c3545;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public abstract void mo482();

    /* JADX INFO: renamed from: ۥۖ */
    public abstract C2351 mo483();

    @Override // p000.AbstractC3003
    /* JADX INFO: renamed from: ۥۜ */
    public void mo221() {
        switch (this.f13759) {
            case 0:
                m7321();
                break;
            case 1:
                m7321();
                break;
            default:
                m7321();
                break;
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m7321() {
        ArrayList arrayList;
        Object c4535;
        Object c4536;
        Object c4537;
        switch (this.f13759) {
            case 0:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f13758;
                String strMo484 = mo484();
                String strMo223 = mo223();
                C2351 c2351Mo485 = mo485();
                C2351 c2351Mo483 = mo483();
                if (EnvironmentInitializer.m166().m150(strMo484)) {
                    arrayList = new ArrayList();
                    String strM151 = EnvironmentInitializer.m166().m151(strMo484);
                    if (strM151 != null) {
                        Iterator it = AbstractC0684.m1524(strM151, new String[]{new C4441(new long[]{4553504508061772367L, 3498904776433905985L}).toString()}).iterator();
                        while (it.hasNext()) {
                            arrayList.add(new C5836((String) it.next()));
                        }
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    C4524.f14953.getClass();
                    C1443 c1443M7845 = C4524.m7845();
                    C1542 c1542 = AbstractC2539.f8457;
                    Object obj = c1542.f5218;
                    String str = c1542.f5219;
                    boolean z = C1443.f4940;
                    if (!((Boolean) c1443M7845.m3068(obj, str)).booleanValue()) {
                        DexKitBridge dexKitBridgeM7847 = C4524.f14954.m7847();
                        ArrayList arrayList3 = new ArrayList();
                        C5395<C3570> c5395M6574 = dexKitBridgeM7847.m160(c2351Mo485).m6574(c2351Mo483);
                        if (c5395M6574.isEmpty()) {
                            c5395M6574 = null;
                        }
                        if (c5395M6574 != null) {
                            for (C3570 c3570 : c5395M6574) {
                                arrayList3.add(c3570.f11821);
                                arrayList2.add(c3570.m6362());
                            }
                        }
                        C5144 c5144 = new C5144(4, strMo484, strMo223, null, AbstractC0973.m2056(arrayList3, new C4441(new long[]{2854217801983541094L, 1769668717539669204L}).toString(), null, null, null, 62));
                        if (arrayList3.isEmpty()) {
                            AbstractC4593.m7980(strMo484);
                        } else {
                            AbstractC4593.m7966(c5144);
                        }
                    }
                    arrayList = arrayList2;
                }
                ArrayList arrayList4 = !arrayList.isEmpty() ? arrayList : null;
                if (arrayList4 != null) {
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        try {
                            c4535 = C5836.m9641((C5836) it2.next(), m7250());
                        } catch (Throwable th) {
                            c4535 = new C4535(th);
                        }
                        if (c4535 instanceof C4535) {
                            c4535 = null;
                        }
                        Method method = (Method) c4535;
                        if (method == null) {
                            m7318(mo484());
                            m3888(R.string.error_log_info2);
                        } else {
                            linkedHashSet.add(method);
                        }
                        break;
                    }
                    if (linkedHashSet.size() == arrayList4.size()) {
                        mo482();
                    }
                } else {
                    m3888(R.string.error_log_info);
                }
                break;
            case 1:
                C5836 c5836M4461 = AbstractC2383.m4461(new C0395(mo484(), mo223(), mo485(), mo4011()));
                if (c5836M4461 != null) {
                    try {
                        c4536 = c5836M4461.m9642(m7250());
                    } catch (Throwable th2) {
                        c4536 = new C4535(th2);
                    }
                    Constructor constructor = (Constructor) (c4536 instanceof C4535 ? null : c4536);
                    if (constructor != null) {
                        this.f13758 = constructor;
                        mo482();
                    } else {
                        m7318(mo484());
                        m3888(R.string.error_log_info2);
                    }
                } else {
                    m3888(R.string.error_log_info);
                }
                break;
            default:
                C5836 c5836M4462 = AbstractC2383.m4461(new C0395(mo484(), mo223(), mo485(), mo483()));
                if (c5836M4462 != null) {
                    try {
                        c4537 = C5836.m9641(c5836M4462, m7250());
                    } catch (Throwable th3) {
                        c4537 = new C4535(th3);
                    }
                    Method method2 = (Method) (c4537 instanceof C4535 ? null : c4537);
                    if (method2 != null) {
                        this.f13758 = method2;
                        mo482();
                    } else {
                        m7318(mo484());
                        m3888(R.string.error_log_info2);
                    }
                } else {
                    m3888(R.string.error_log_info);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public abstract C2351 mo485();

    /* JADX INFO: renamed from: ۦۛ */
    public abstract C2351 mo4011();

    /* JADX INFO: renamed from: ۦۨ */
    public final void m7322(InterfaceC4745 interfaceC4745) {
        switch (this.f13759) {
            case 0:
                Iterator it = ((LinkedHashSet) this.f13758).iterator();
                while (it.hasNext()) {
                    C3751 c3751M7251 = m7251(Collections.singletonList((Method) it.next()));
                    interfaceC4745.mo211(c3751M7251);
                    ((C3751) c3751M7251.m6588().f7924).f12483 = new C0091(21, this);
                }
                break;
            case 1:
                Constructor constructor = (Constructor) this.f13758;
                if (constructor != null) {
                    C3751 c3751M7252 = m7251(Collections.singletonList(constructor));
                    interfaceC4745.mo211(c3751M7252);
                    ((C3751) c3751M7252.m6588().f7924).f12483 = new C4884(7, this);
                }
                break;
            default:
                Method method = (Method) this.f13758;
                if (method != null) {
                    C3751 c3751M7253 = m7251(Collections.singletonList(method));
                    interfaceC4745.mo211(c3751M7253);
                    ((C3751) c3751M7253.m6588().f7924).f12483 = new C4884(8, this);
                }
                break;
        }
    }

    public /* synthetic */ AbstractC4134(int i) {
        this.f13759 = i;
    }
}
