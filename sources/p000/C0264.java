package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۥؒؕ۟ٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0264 implements InterfaceC5854 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C2790 f963;

    public C0264(C2790 c2790) {
        this.f963 = c2790;
    }

    @Override // p000.InterfaceC5854
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo544(ArrayList arrayList, ArrayList arrayList2) {
        boolean zM5290;
        C2790 c2790 = this.f963;
        ArrayList arrayList3 = c2790.f9331;
        if (C2790.m5261(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + c2790.f9313);
        }
        if (c2790.f9316.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zM5290 = false;
        } else {
            ArrayList arrayList4 = c2790.f9316;
            C2177 c2177 = (C2177) arrayList4.get(arrayList4.size() - 1);
            c2790.f9312 = c2177;
            Iterator it = c2177.f7191.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = ((C4088) it.next()).f13652;
                if (abstractComponentCallbacksC0308 != null) {
                    abstractComponentCallbacksC0308.f1112 = true;
                }
            }
            zM5290 = c2790.m5290(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(C2790.m5260((C2177) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    C0178.m382();
                    return false;
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zM5290;
    }
}
