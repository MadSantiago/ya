package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥٗؑؒٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1498 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f5080;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f5081;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f5082;

    public /* synthetic */ C1498(int i, Object obj, Object obj2) {
        this.f5082 = i;
        this.f5081 = obj;
        this.f5080 = obj2;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(InterfaceC2427 interfaceC2427, List list, long j) {
        ArrayList arrayList;
        C3869 c3869;
        int i = this.f5082;
        C0204 c0204 = C0204.f751;
        Object obj = this.f5081;
        Object obj2 = this.f5080;
        switch (i) {
            case 0:
                ((C2453) obj).setParentLayoutDirection((EnumC2459) obj2);
                return interfaceC2427.mo755(0, 0, c0204, C1931.f6370);
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (!(((InterfaceC1827) obj3).mo570() instanceof C1317)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((InterfaceC4448) obj2).mo449();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int i3 = 0;
                    for (int size2 = list2.size(); i3 < size2; size2 = size2) {
                        C2793 c2793 = (C2793) list2.get(i3);
                        if (c2793 != null) {
                            float f = c2793.f9342;
                            float f2 = c2793.f9343;
                            c3869 = new C3869(((InterfaceC1827) arrayList2.get(i3)).mo3597(AbstractC0671.m1494(0, (int) Math.floor(c2793.f9341 - f2), 0, (int) Math.floor(c2793.f9344 - f), 5)), new C0873((((long) Math.round(f)) & 4294967295L) | (((long) Math.round(f2)) << 32)));
                        } else {
                            c3869 = null;
                        }
                        if (c3869 != null) {
                            arrayList3.add(c3869);
                        }
                        i3++;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Object obj4 = list.get(i4);
                    if (((InterfaceC1827) obj4).mo570() instanceof C1317) {
                        arrayList4.add(obj4);
                    }
                }
                return interfaceC2427.mo755(C3693.m6556(j), C3693.m6551(j), c0204, new C1708(14, arrayList, AbstractC1631.m3415(arrayList4, (InterfaceC4448) obj)));
        }
    }
}
