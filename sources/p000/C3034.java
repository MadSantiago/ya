package p000;

import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ۦْؑؔۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3034 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1046 f10199;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f10200;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ DexKitBridge f10201;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10202 = 1;

    public /* synthetic */ C3034(C1046 c1046, DexKitBridge dexKitBridge, int i) {
        this.f10199 = c1046;
        this.f10201 = dexKitBridge;
        this.f10200 = i;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f10202;
        int i2 = this.f10200;
        C1046 c1046 = this.f10199;
        DexKitBridge dexKitBridge = this.f10201;
        switch (i) {
            case 0:
                Integer num = c1046.f3701;
                Object obj = null;
                if (num == null) {
                    return null;
                }
                C3728 c3728M159 = dexKitBridge.m159(new long[]{(((long) i2) << 32) | ((long) num.intValue())});
                if (!c3728M159.isEmpty()) {
                    if (c3728M159.isEmpty()) {
                        C1078.m2276("list is empty");
                        return null;
                    }
                    obj = c3728M159.get(0);
                }
                return (C1046) obj;
            default:
                ArrayList arrayList = c1046.f3706;
                ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf((((long) i2) << 32) | ((long) ((Number) it.next()).intValue())));
                }
                return dexKitBridge.m159(AbstractC0973.m2041(arrayList2));
        }
    }

    public /* synthetic */ C3034(DexKitBridge dexKitBridge, C1046 c1046, int i) {
        this.f10201 = dexKitBridge;
        this.f10199 = c1046;
        this.f10200 = i;
    }
}
