package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۦؘُؑؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3062 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f10299;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f10300;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C0909 f10301;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3062(C0909 c0909, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f10299 = i;
        this.f10301 = c0909;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f10299;
        C0909 c0909 = this.f10301;
        switch (i) {
            case 0:
                C3062 c3062 = new C3062(c0909, interfaceC0443, 0);
                c3062.f10300 = obj;
                return c3062;
            default:
                C3062 c3063 = new C3062(c0909, interfaceC0443, 1);
                c3063.f10300 = obj;
                return c3063;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        boolean z;
        int i = this.f10299;
        C0909 c0909 = this.f10301;
        switch (i) {
            case 0:
                AbstractC0186.m409(obj);
                C1109 c1109 = (C1109) this.f10300;
                c0909.f3267.getClass();
                return C1109.m2327(c1109, null, C3729.m6575(), null, 5);
            default:
                AbstractC0186.m409(obj);
                C1109 c11010 = (C1109) this.f10300;
                C4590 c4590 = c0909.f3263;
                boolean zM1893 = c0909.m1893(c11010);
                Map mapM7956 = c11010.f3897;
                if (mapM7956 != null) {
                    if (c4590.f15144) {
                        z = false;
                    } else {
                        ArrayList<C2271> arrayListM2133 = AbstractC0993.m2133(c4590.f15146);
                        ArrayList arrayList = new ArrayList();
                        for (C2271 c2271 : arrayListM2133) {
                            C1060 c1060 = (C1060) mapM7956.get(c2271.f7534);
                            C3869 c3869 = c1060 != null ? new C3869(c2271, c1060) : null;
                            if (c3869 != null) {
                                arrayList.add(c3869);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    C3869 c38610 = (C3869) it.next();
                                    C2271 c2272 = (C2271) c38610.f12915;
                                    C1060 c1061 = (C1060) c38610.f12914;
                                    boolean zM6874 = AbstractC3831.m6874(c4590.m7957(), c2272.f7534);
                                    int i2 = c2272.f7533;
                                    if (zM6874) {
                                        if (i2 == c1061.f3738 && AbstractC3831.m6874((String) c4590.f15147.getValue(), c1061.f3737)) {
                                            z = false;
                                        }
                                    } else if (i2 == c1061.f3738) {
                                        z = false;
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z = true;
                }
                boolean zM1889 = c0909.m1889(c11010);
                if (z) {
                    mapM7956 = c4590.m7956(C0204.f751);
                } else if (zM1889) {
                    mapM7956 = c4590.m7956(mapM7956);
                }
                C1521 c1521 = z ? null : c11010.f3899;
                if (!zM1893 && !z) {
                    return zM1889 ? C1109.m2327(c11010, null, null, c4590.m7956(mapM7956), 3) : c11010;
                }
                C1521 c1521M3709 = c0909.f3264.m3709(c1521);
                C3086 c3086 = c0909.f3261;
                AbstractC2765.m5135(AbstractC4009.m7151(c3086.f10350), null, 0, new C1188(c3086, c1521M3709, null), 3);
                c4590.f15144 = true;
                return new C1109(c1521M3709, null, mapM7956);
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f10299;
        C2358 c2358 = C2358.f7817;
        C1109 c1109 = (C1109) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C3062) mo217(interfaceC0443, c1109)).mo218(c2358);
    }
}
