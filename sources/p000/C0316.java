package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: ۥؓؔۗؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0316 extends AbstractC1665 {

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ Object f1168;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ int f1169 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0316(C3587 c3587) {
        super(true);
        this.f1168 = c3587;
    }

    @Override // p000.AbstractC1665
    /* JADX INFO: renamed from: ۥؗ */
    public void mo664(C0948 c0948) {
        switch (this.f1169) {
            case 0:
                C2790 c2790 = (C2790) this.f1168;
                if (C2790.m5261(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + c2790);
                }
                if (c2790.f9312 != null) {
                    for (C4526 c4526 : c2790.m5274(new ArrayList(Collections.singletonList(c2790.f9312)), 0, 1)) {
                        c4526.getClass();
                        if (C2790.m5261(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0948.f3355);
                        }
                        ArrayList arrayList = c4526.f14958;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((AbstractC4563) it.next()).getClass();
                            AbstractC3649.m6529(null, arrayList2);
                        }
                        List listM2039 = AbstractC0973.m2039(AbstractC0973.m2052(arrayList2));
                        int size = listM2039.size();
                        for (int i = 0; i < size; i++) {
                            ((AbstractC0107) listM2039.get(i)).m204(c0948);
                        }
                    }
                    Iterator it2 = c2790.f9331.iterator();
                    if (it2.hasNext()) {
                        throw AbstractC5078.m8675(it2);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p000.AbstractC1665
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo665() {
        int i = this.f1169;
        Object obj = this.f1168;
        switch (i) {
            case 0:
                C2790 c2790 = (C2790) obj;
                if (C2790.m5261(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + c2790);
                }
                C0316 c0316 = c2790.f9323;
                ArrayList arrayList = c2790.f9331;
                c2790.f9328 = true;
                c2790.m5265(true);
                c2790.f9328 = false;
                if (c2790.f9312 == null) {
                    if (c0316.f5549) {
                        if (C2790.m5261(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        c2790.m5280();
                        return;
                    } else {
                        if (C2790.m5261(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        c2790.f9330.m7196().m2864();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C2790.m5260(c2790.f9312));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            C0178.m382();
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = c2790.f9312.f7191.iterator();
                while (it3.hasNext()) {
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = ((C4088) it3.next()).f13652;
                    if (abstractComponentCallbacksC0308 != null) {
                        abstractComponentCallbacksC0308.f1112 = false;
                    }
                }
                for (C4526 c4526 : c2790.m5274(new ArrayList(Collections.singletonList(c2790.f9312)), 0, 1)) {
                    ArrayList arrayList2 = c4526.f14958;
                    if (C2790.m5261(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    c4526.m7852(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        ((AbstractC4563) it4.next()).getClass();
                        AbstractC3649.m6529(null, arrayList3);
                    }
                    List listM2039 = AbstractC0973.m2039(AbstractC0973.m2052(arrayList3));
                    int size = listM2039.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((AbstractC0107) listM2039.get(i2)).m205(c4526.f14962);
                    }
                    int size2 = arrayList2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                    }
                    List listM20310 = AbstractC0973.m2039(arrayList2);
                    if (listM20310.size() > 0) {
                        ((AbstractC4563) listM20310.get(0)).getClass();
                        throw null;
                    }
                }
                Iterator it5 = c2790.f9312.f7191.iterator();
                while (it5.hasNext()) {
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = ((C4088) it5.next()).f13652;
                    if (abstractComponentCallbacksC0309 != null && abstractComponentCallbacksC0309.f1127 == null) {
                        c2790.m5309(abstractComponentCallbacksC0309).m2623();
                    }
                }
                c2790.f9312 = null;
                c2790.m5297();
                if (C2790.m5261(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + c0316.f5549 + " for  FragmentManager " + c2790);
                    return;
                }
                return;
            default:
                ((C3587) obj).mo211(this);
                return;
        }
    }

    @Override // p000.AbstractC1665
    /* JADX INFO: renamed from: ۥۣ */
    public void mo666() {
        switch (this.f1169) {
            case 0:
                C2790 c2790 = (C2790) this.f1168;
                if (C2790.m5261(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + c2790);
                }
                if (C2790.m5261(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + c2790.f9312);
                }
                C2177 c2177 = c2790.f9312;
                if (c2177 != null) {
                    c2177.f7188 = false;
                    c2177.m4233();
                    C2177 c2178 = c2790.f9312;
                    RunnableC0029 runnableC0029 = new RunnableC0029(10, c2790);
                    ArrayList arrayList = c2178.f7200;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        c2178.f7200 = arrayList;
                    }
                    arrayList.add(runnableC0029);
                    c2790.f9312.m4230(false, true);
                    c2790.f9328 = true;
                    c2790.m5265(true);
                    c2790.m5306();
                    c2790.f9328 = false;
                    c2790.f9312 = null;
                }
                break;
        }
    }

    @Override // p000.AbstractC1665
    /* JADX INFO: renamed from: ۦؑ */
    public void mo667(C0948 c0948) {
        switch (this.f1169) {
            case 0:
                C2790 c2790 = (C2790) this.f1168;
                if (C2790.m5261(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + c2790);
                }
                c2790.m5303();
                c2790.m5279(new C0264(c2790), false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0316(C2790 c2790) {
        super(false);
        this.f1168 = c2790;
    }
}
