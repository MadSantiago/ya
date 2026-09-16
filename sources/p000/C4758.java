package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: ۦُٝؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4758 implements InterfaceC3550 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2790 f15701;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15702;

    public /* synthetic */ C4758(C2790 c2790, int i) {
        this.f15702 = i;
        this.f15701 = c2790;
    }

    @Override // p000.InterfaceC3550
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo6352(Object obj) {
        int i = this.f15702;
        C2790 c2790 = this.f15701;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                C5351 c5351 = (C5351) c2790.f9311.pollFirst();
                if (c5351 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = c5351.f17619;
                    if (c2790.f9298.m3117(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            default:
                C2233 c2233 = (C2233) obj;
                C5351 c5352 = (C5351) c2790.f9311.pollFirst();
                if (c5352 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str2 = c5352.f17619;
                    int i3 = c5352.f17618;
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308M3117 = c2790.f9298.m3117(str2);
                    if (abstractComponentCallbacksC0308M3117 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC0308M3117.m663(i3, c2233.f7400, c2233.f7399);
                    }
                }
                break;
        }
    }
}
