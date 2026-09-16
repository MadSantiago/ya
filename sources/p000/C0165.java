package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥؐۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0165 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1347 f620;

    /* JADX INFO: renamed from: ۥۗ */
    public C1249 f621;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4852 f622 = AbstractC2774.m5183(null);

    public C0165(C1249 c1249) {
        C1657 c1657 = new C1657(24);
        c1249.getClass();
        C4042 c4042 = new C4042(c1249);
        ArrayList arrayList = c4042.f13481;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) c1657.mo211(((C2181) arrayList.get(i)).m4236(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C2331 c2331 = (C2331) list.get(i2);
                arrayList3.add(new C2181(c2331.f7718, c2331.f7717, c2331.f7719, c2331.f7720));
            }
            AbstractC3649.m6529(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f621 = c4042.m7241();
        this.f620 = new C1347();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C2331 m349(C2331 c2331, C3828 c3828) {
        C2276 c2276 = c3828.f12696;
        int iM4329 = c2276.m4329(c2276.f7560 - 1, false);
        if (c2331.f7718 < iM4329) {
            return C2331.m4373(c2331, null, Math.min(c2331.f7717, iM4329), 11);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m350(Object[] objArr, InterfaceC4745 interfaceC4745, C5362 c5362, int i) {
        c5362.m8979(-2083052099);
        int i2 = (i & 48) == 0 ? (c5362.m8977(interfaceC4745) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= c5362.m8977(this) ? 256 : 128;
        }
        c5362.m8989(-358306546, 0, Integer.valueOf(objArr.length), null);
        int i3 = i2 | (c5362.m8988(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= c5362.m8977(obj) ? 4 : 0;
        }
        c5362.m9009(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (c5362.m9011(i3 & 1, (i3 & 147) != 146)) {
            C1115 c1115 = new C1115(2);
            ArrayList arrayList = c1115.f3914;
            arrayList.add(interfaceC4745);
            c1115.m2333(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zM8977 = c5362.m8977(this) | ((i3 & 112) == 32);
            Object objM8999 = c5362.m8999();
            if (zM8977 || objM8999 == C2850.f9517) {
                objM8999 = new C3908(this, interfaceC4745, i4);
                c5362.m8987(objM8999);
            }
            AbstractC3925.m7044(array, (InterfaceC4745) objM8999, c5362);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0021(i, 11, this, objArr, interfaceC4745);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m351(int i, C5362 c5362) {
        boolean z;
        Object obj;
        boolean z2;
        Object obj2;
        c5362.m8979(1154651354);
        char c = 2;
        int i2 = (c5362.m8977(this) ? 4 : 2) | i;
        boolean z3 = false;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            C0555 c0555 = (C0555) c5362.m8997(AbstractC2853.f9536);
            C1249 c1249 = this.f621;
            List listM2638 = c1249.m2638(c1249.f4307.length());
            int size = listM2638.size();
            int i3 = 0;
            while (i3 < size) {
                C2331 c2331 = (C2331) listM2638.get(i3);
                int i4 = c2331.f7718;
                Object obj3 = c2331.f7719;
                if (i4 != c2331.f7717) {
                    c5362.m8957(725478935);
                    Object objM8999 = c5362.m8999();
                    Object obj4 = C2850.f9517;
                    if (objM8999 == obj4) {
                        obj = objM8999;
                        Object c2243 = new C2243();
                        c5362.m8987(c2243);
                        obj = c2243;
                    }
                    obj = objM8999;
                    C2243 c2244 = (C2243) obj;
                    InterfaceC0705 interfaceC0705M7887 = AbstractC4554.m7887(C4217.f13994, new C1708(13, this, c2331));
                    Object objM89910 = c5362.m8999();
                    if (objM89910 == obj4) {
                        z2 = true;
                        Object c1657 = new C1657(25);
                        c5362.m8987(c1657);
                        obj2 = c1657;
                    } else {
                        z2 = true;
                        obj2 = objM89910;
                    }
                    InterfaceC0705 interfaceC0705M4196 = AbstractC2164.m4196(AbstractC1697.m3510(interfaceC0705M7887, z3, (InterfaceC4745) obj2).mo1571(new C1317(new C5017(6, this, c2331))), c2244);
                    InterfaceC3737.f12443.getClass();
                    InterfaceC0705 interfaceC0705M5190 = AbstractC2774.m5190(interfaceC0705M4196, AbstractC3925.f13092);
                    boolean zM8977 = c5362.m8977(this) | c5362.m8963(c2331) | c5362.m8977(c0555);
                    Object objM89911 = c5362.m8999();
                    Object obj5 = objM89911;
                    if (zM8977 || objM89911 == obj4) {
                        Object c1225 = new C1225(this, c2331, c0555);
                        c5362.m8987(c1225);
                        obj5 = c1225;
                    }
                    AbstractC1089.m2299(AbstractC0186.m446(interfaceC0705M5190, c2244, (InterfaceC4448) obj5), c5362, 0);
                    AbstractC4428 abstractC4428 = (AbstractC4428) obj3;
                    C0917 c0917Mo1682 = abstractC4428.mo1682();
                    if (c0917Mo1682 == null || (c0917Mo1682.f3290 == null && c0917Mo1682.f3289 == null && c0917Mo1682.f3288 == null && c0917Mo1682.f3291 == null)) {
                        z = false;
                        c5362.m8957(728331710);
                        c5362.m9009(false);
                    } else {
                        c5362.m8957(726303039);
                        Object objM89912 = c5362.m8999();
                        Object obj6 = objM89912;
                        if (objM89912 == obj4) {
                            Object c0801 = new C0801(c2244);
                            c5362.m8987(c0801);
                            obj6 = c0801;
                        }
                        C0801 c0802 = (C0801) obj6;
                        Object objM89913 = c5362.m8999();
                        boolean z4 = false;
                        Object obj7 = objM89913;
                        if (objM89913 == obj4) {
                            Object c2718 = new C2718((Object) c0802, (InterfaceC0443) (z4 ? 1 : 0), 18);
                            c5362.m8987(c2718);
                            obj7 = c2718;
                        }
                        AbstractC3925.m7030((InterfaceC5731) obj7, c5362, C2358.f7817);
                        C0169 c0169 = c0802.f2866;
                        C0169 c01610 = c0802.f2866;
                        Boolean boolValueOf = Boolean.valueOf((c0169.m360() & 2) != 0 ? z2 : false);
                        Boolean boolValueOf2 = Boolean.valueOf((c01610.m360() & 1) != 0 ? z2 : false);
                        Boolean boolValueOf3 = Boolean.valueOf((c01610.m360() & 4) != 0 ? z2 : false);
                        C0917 c0917Mo1683 = abstractC4428.mo1682();
                        C0553 c0553 = c0917Mo1683 != null ? c0917Mo1683.f3290 : null;
                        C0917 c0917Mo1684 = abstractC4428.mo1682();
                        C0553 c0554 = c0917Mo1684 != null ? c0917Mo1684.f3289 : null;
                        C0917 c0917Mo1685 = abstractC4428.mo1682();
                        C0553 c0556 = c0917Mo1685 != null ? c0917Mo1685.f3288 : null;
                        C0917 c0917Mo1686 = abstractC4428.mo1682();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, c0553, c0554, c0556, c0917Mo1686 != null ? c0917Mo1686.f3291 : null};
                        boolean zM8978 = c5362.m8977(this) | c5362.m8963(c2331);
                        Object objM89914 = c5362.m8999();
                        Object obj8 = objM89914;
                        if (zM8978 || objM89914 == obj4) {
                            Object c1708 = new C1708(this, c2331, c0802, 12);
                            c5362.m8987(c1708);
                            obj8 = c1708;
                        }
                        m350(objArr, (InterfaceC4745) obj8, c5362, (i2 << 6) & 896);
                        z = false;
                        c5362.m9009(false);
                    }
                    c5362.m9009(z);
                } else {
                    z = z3;
                    c5362.m8957(728345598);
                    c5362.m9009(z);
                }
                i3++;
                z3 = z;
                c = c;
            }
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4164(i, 27, this);
        }
    }
}
