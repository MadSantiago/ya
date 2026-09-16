package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٕٝؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4738 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ ArrayList f15635;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f15636;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4738(int i, ArrayList arrayList) {
        super(1);
        this.f15636 = i;
        this.f15635 = arrayList;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f15636;
        C2358 c2358 = C2358.f7817;
        ArrayList arrayList = this.f15635;
        switch (i) {
            case 0:
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC1842.m3623(abstractC1842, (AbstractC0275) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                AbstractC1842 abstractC1843 = (AbstractC1842) obj;
                int iM4181 = AbstractC2164.m4181(arrayList);
                if (iM4181 >= 0) {
                    int i3 = 0;
                    while (true) {
                        AbstractC1842.m3623(abstractC1843, (AbstractC0275) arrayList.get(i3), 0, 0);
                        if (i3 != iM4181) {
                            i3++;
                        }
                    }
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC1842 abstractC1844 = (AbstractC1842) obj;
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    AbstractC1842.m3626(abstractC1844, (AbstractC0275) arrayList.get(i4), 0, 0);
                }
                break;
            default:
                AbstractC1842 abstractC1845 = (AbstractC1842) obj;
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    AbstractC1842.m3625(abstractC1845, (AbstractC0275) arrayList.get(i5), 0, 0);
                }
                break;
        }
        return c2358;
    }
}
