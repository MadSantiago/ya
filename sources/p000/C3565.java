package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦؙؚّؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3565 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractC1733 f11804;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11805;

    public /* synthetic */ C3565(AbstractC1733 abstractC1733, int i) {
        this.f11805 = i;
        this.f11804 = abstractC1733;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f11805;
        C2358 c2358 = C2358.f7817;
        AbstractC1733 abstractC1733 = this.f11804;
        switch (i) {
            case 0:
                C0637 c0637 = (C0637) obj;
                C3098 c3098 = new C3098();
                c3098.f10388 = new C2203(5, abstractC1733.f5762, false);
                List arrayList = c0637.f2378;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                c0637.f2378 = arrayList;
                C5310 c5310 = new C5310();
                c5310.f17487 = c3098;
                c5310.f17486 = 1;
                arrayList.add(c5310);
                Class<List> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(List.class));
                c0637.m1445(clsM9037 != null ? clsM9037 : List.class);
                break;
            default:
                C0954 c0954 = (C0954) obj;
                Object objM1970 = c0954.m1970();
                if (!(objM1970 instanceof List)) {
                    objM1970 = null;
                }
                List list = (List) objM1970;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        C3121 c3121M7163 = AbstractC4009.m7163(obj2);
                        c3121M7163.m5746();
                        C2749 c2749M5747 = c3121M7163.m5747();
                        c2749M5747.f9027 = new C4441(new long[]{3207858039306502486L, 2869226845457377532L}).toString();
                        C1865 c1865 = (C1865) AbstractC0973.m2058(c2749M5747.m5108());
                        List list2 = c1865 != null ? (List) c1865.m3715() : null;
                        if (list2 == null) {
                            abstractC1733.m3886();
                            break;
                        } else if (!list2.contains(new C4441(new long[]{1666021714411676293L, -7556191802294243000L}).toString()) && !list2.contains(new C4441(new long[]{-9195161045810309504L, 1951287656664699851L}).toString())) {
                            arrayList2.add(obj2);
                        }
                    }
                    c0954.m1973(arrayList2);
                }
                break;
        }
        return c2358;
    }
}
