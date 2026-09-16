package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦُُٜؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4674 extends AbstractC2370 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4674 f15397 = new C4674(0, "Undefined intrinsics block and it is required");

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f15398;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4674(int i, String str) {
        super(str);
        this.f15398 = i;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(InterfaceC2427 interfaceC2427, List list, long j) {
        switch (this.f15398) {
            case 0:
                int size = list.size();
                C0204 c0204 = C0204.f751;
                if (size == 0) {
                    return interfaceC2427.mo755(C3693.m6557(j), C3693.m6555(j), c0204, C3948.f13189);
                }
                if (size == 1) {
                    AbstractC0275 abstractC0275Mo3597 = ((InterfaceC1827) list.get(0)).mo3597(j);
                    return interfaceC2427.mo755(AbstractC0671.m1502(j, abstractC0275Mo3597.f985), AbstractC0671.m1493(j, abstractC0275Mo3597.f984), c0204, new C0778(abstractC0275Mo3597, 6));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    AbstractC0275 abstractC0275Mo3598 = ((InterfaceC1827) list.get(i)).mo3597(j);
                    iMax = Math.max(abstractC0275Mo3598.f985, iMax);
                    iMax2 = Math.max(abstractC0275Mo3598.f984, iMax2);
                    arrayList.add(abstractC0275Mo3598);
                }
                return interfaceC2427.mo755(AbstractC0671.m1502(j, iMax), AbstractC0671.m1493(j, iMax2), c0204, new C4738(3, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
