package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥۦؕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2810 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ ArrayList f9381;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9382;

    public /* synthetic */ C2810(int i, ArrayList arrayList) {
        this.f9382 = i;
        this.f9381 = arrayList;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f9382;
        C2358 c2358 = C2358.f7817;
        int i2 = 0;
        ArrayList arrayList = this.f9381;
        switch (i) {
            case 0:
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC1842.m3623(abstractC1842, (AbstractC0275) arrayList.get(i3), 0, 0);
                }
                break;
            case 1:
                AbstractC1842 abstractC1843 = (AbstractC1842) obj;
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    C3000 c3000 = (C3000) arrayList.get(i4);
                    List list = c3000.f10084;
                    boolean z = c3000.f10091;
                    if (c3000.f10090 == Integer.MIN_VALUE) {
                        AbstractC4690.m8038("position() should be called first");
                    }
                    int size3 = list.size();
                    int i5 = i2;
                    while (i5 < size3) {
                        AbstractC0275 abstractC0275 = (AbstractC0275) list.get(i5);
                        int[] iArr = c3000.f10089;
                        int i6 = i5 * 2;
                        int i7 = size2;
                        long jM1861 = C0873.m1861((((long) iArr[i6 + 1]) & 4294967295L) | (((long) iArr[i6]) << 32), c3000.f10081);
                        if (z) {
                            AbstractC1842.m3622(abstractC1843, abstractC0275, jM1861);
                        } else {
                            int i8 = AbstractC3458.f11474;
                            C3948 c3948 = C3948.f13185;
                            if (abstractC1843.mo3627() == EnumC2459.f8215 || abstractC1843.mo3628() == 0) {
                                abstractC1843.m3629(abstractC0275);
                                abstractC0275.mo571(C0873.m1861(jM1861, abstractC0275.f981), 0.0f, c3948);
                            } else {
                                int iMo3628 = (abstractC1843.mo3628() - abstractC0275.f985) - ((int) (jM1861 >> 32));
                                abstractC1843.m3629(abstractC0275);
                                abstractC0275.mo571(C0873.m1861((((long) ((int) (jM1861 & 4294967295L))) & 4294967295L) | (((long) iMo3628) << 32), abstractC0275.f981), 0.0f, c3948);
                            }
                        }
                        i5++;
                        size2 = i7;
                        abstractC1843 = abstractC1843;
                        c2358 = c2358;
                        i4 = i4;
                        c3000 = c3000;
                    }
                    i4++;
                    i2 = 0;
                }
                break;
            default:
                AbstractC1842 abstractC1844 = (AbstractC1842) obj;
                int size4 = arrayList.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    AbstractC1842.m3626(abstractC1844, (AbstractC0275) arrayList.get(i9), 0, 0);
                }
                break;
        }
        return c2358;
    }
}
