package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥ۟ؓؓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2436 extends AbstractC5381 implements InterfaceC4825, InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public LinkedHashMap f8108;

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        float f = ((C4497) AbstractC2552.m4807(this, AbstractC4331.f14304)).f14871;
        if (f < 0.0f) {
            f = 0.0f;
        }
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(j);
        boolean z = this.f17786 && !Float.isNaN(f) && C4497.m7827(f, 0.0f) > 0;
        int iMo743 = !Float.isNaN(f) ? interfaceC2427.mo743(f) : 0;
        int iMax = abstractC0275Mo3597.f985;
        if (z) {
            iMax = Math.max(iMax, iMo743);
        }
        int iMax2 = abstractC0275Mo3597.f984;
        if (z) {
            iMax2 = Math.max(iMax2, iMo743);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.f8108;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f8108 = linkedHashMap;
            }
            C4092 c4092 = AbstractC4331.f14305;
            int iRound = Math.round((iMo743 - abstractC0275Mo3597.f985) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(c4092, Integer.valueOf(iRound));
            C2779 c2779 = AbstractC4331.f14306;
            int iRound2 = Math.round((iMo743 - abstractC0275Mo3597.f984) / 2.0f);
            linkedHashMap.put(c2779, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.f8108;
        if (map == null) {
            map = C0204.f751;
        }
        return interfaceC2427.mo755(iMax, iMax2, map, new C2514(iMax, abstractC0275Mo3597, iMax2));
    }
}
