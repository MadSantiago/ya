package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥؓؖۥۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0333 extends AbstractC0941 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final C1380 f1243 = new C1380(0);

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f1245;

    /* JADX INFO: renamed from: ۥۗ */
    public final HashMap f1247 = new HashMap();

    /* JADX INFO: renamed from: ۥؗ */
    public final HashMap f1244 = new HashMap();

    /* JADX INFO: renamed from: ۦؑ */
    public final HashMap f1248 = new HashMap();

    /* JADX INFO: renamed from: ۥّ */
    public boolean f1246 = false;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f1249 = false;

    public C0333(boolean z) {
        this.f1245 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0333.class != obj.getClass()) {
            return false;
        }
        C0333 c0333 = (C0333) obj;
        return this.f1247.equals(c0333.f1247) && this.f1244.equals(c0333.f1244) && this.f1248.equals(c0333.f1248);
    }

    public final int hashCode() {
        return this.f1248.hashCode() + ((this.f1244.hashCode() + (this.f1247.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1247.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1244.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1248.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m765(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        if (C2790.m5261(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0308);
        }
        m769(abstractComponentCallbacksC0308.f1118, z);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m766(String str, boolean z) {
        if (C2790.m5261(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m769(str, z);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m767(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (this.f1249) {
            if (C2790.m5261(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1247.remove(abstractComponentCallbacksC0308.f1118) == null || !C2790.m5261(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0308);
        }
    }

    @Override // p000.AbstractC0941
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo768() {
        if (C2790.m5261(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1246 = true;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m769(String str, boolean z) {
        HashMap map = this.f1244;
        C0333 c0333 = (C0333) map.get(str);
        if (c0333 != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c0333.f1244.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c0333.m766((String) it.next(), true);
                }
            }
            c0333.mo768();
            map.remove(str);
        }
        HashMap map2 = this.f1248;
        C3160 c3160 = (C3160) map2.get(str);
        if (c3160 != null) {
            c3160.m5839();
            map2.remove(str);
        }
    }
}
