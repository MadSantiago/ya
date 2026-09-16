package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۥۥًؔۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2742 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f9074;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9075 = 1;

    public /* synthetic */ C2742(int i) {
        this.f9074 = i;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f9075;
        C2358 c2358 = C2358.f7817;
        int i2 = this.f9074;
        switch (i) {
            case 0:
                C0975 c0975 = (C0975) obj;
                AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
                AbstractC4225.m7466(abstractC3191M7473, AbstractC4225.m7452(abstractC3191M7473), abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null);
                int i3 = c0975.f3438;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    c0975.m2081(i2 + i4);
                }
                break;
            default:
                C4801 c4801 = (C4801) obj;
                C4801.m8179(c4801, AbstractC2765.f9157);
                C4801.m8179(c4801, AbstractC2765.f9177);
                C4801.m8179(c4801, AbstractC2765.f9161);
                Map map = AbstractC0502.f1819;
                if (map == null) {
                    new C4441(new long[]{-8496047775488141207L, -8806557851886061781L, 6110545739658209730L}).toString();
                    map = null;
                }
                int size = map.size();
                List listSingletonList = C2340.f7777;
                if (size != 0) {
                    Iterator it = map.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (it.hasNext()) {
                            ArrayList arrayList = new ArrayList(map.size());
                            arrayList.add(new C3869(entry.getKey(), entry.getValue()));
                            do {
                                Map.Entry entry2 = (Map.Entry) it.next();
                                arrayList.add(new C3869(entry2.getKey(), entry2.getValue()));
                            } while (it.hasNext());
                            listSingletonList = arrayList;
                        } else {
                            listSingletonList = Collections.singletonList(new C3869(entry.getKey(), entry.getValue()));
                        }
                    }
                }
                c4801.f15839.m6301(listSingletonList.size(), new C2963(null, new C5757(1, listSingletonList), new C0857(2039820996, new C1171(i2, listSingletonList), true)));
                break;
        }
        return c2358;
    }

    public /* synthetic */ C2742(C0846 c0846, int i) {
        this.f9074 = i;
    }
}
