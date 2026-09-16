package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: ۥٕٛؑۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1759 extends C5162 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5460 f5862;

    public C1759(C5460 c5460) {
        this.f5862 = c5460;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.C5162, p000.InterfaceC2150
    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC2150 mo1608(String str, C1489 c1489, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        C5460 c5460 = this.f5862;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    AbstractC1605.m3330(0, "getEventName", arrayList);
                    return new C2485(((C0606) c5460.f17999).f2281);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    AbstractC1605.m3330(0, "getTimestamp", arrayList);
                    return new C5563(Double.valueOf(((C0606) c5460.f17999).f2280));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    AbstractC1605.m3330(1, "getParamValue", arrayList);
                    String strMo1607 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1607();
                    HashMap map = ((C0606) c5460.f17999).f2279;
                    return AbstractC0186.m443(map.containsKey(strMo1607) ? map.get(strMo1607) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    AbstractC1605.m3330(0, "getParams", arrayList);
                    HashMap map2 = ((C0606) c5460.f17999).f2279;
                    C5162 c5162 = new C5162();
                    for (String str2 : map2.keySet()) {
                        c5162.mo2283(str2, AbstractC0186.m443(map2.get(str2)));
                    }
                    return c5162;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    AbstractC1605.m3330(2, "setParamValue", arrayList);
                    String strMo1608 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1607();
                    InterfaceC2150 interfaceC2150M4397 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
                    C0606 c0606 = (C0606) c5460.f17999;
                    Object objM3348 = AbstractC1605.m3348(interfaceC2150M4397);
                    HashMap map3 = c0606.f2279;
                    if (objM3348 == null) {
                        map3.remove(strMo1608);
                        return interfaceC2150M4397;
                    }
                    map3.put(strMo1608, C0606.m1369(map3.get(strMo1608), objM3348, strMo1608));
                    return interfaceC2150M4397;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    AbstractC1605.m3330(1, "setEventName", arrayList);
                    InterfaceC2150 interfaceC2150M4398 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                    if (InterfaceC2150.f7060.equals(interfaceC2150M4398) || InterfaceC2150.f7054.equals(interfaceC2150M4398)) {
                        C1078.m2272("Illegal event name");
                        return null;
                    }
                    ((C0606) c5460.f17999).f2281 = interfaceC2150M4398.mo1607();
                    return new C2485(interfaceC2150M4398.mo1607());
                }
                break;
        }
        return super.mo1608(str, c1489, arrayList);
    }
}
