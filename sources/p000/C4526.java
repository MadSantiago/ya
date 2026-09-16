package p000;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۦؚٕٚؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4526 {

    /* JADX INFO: renamed from: ۥُ */
    public boolean f14959;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f14960;

    /* JADX INFO: renamed from: ۥۣ */
    public final ViewGroup f14962;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f14963;

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f14961 = new ArrayList();

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList f14958 = new ArrayList();

    public C4526(ViewGroup viewGroup) {
        this.f14962 = viewGroup;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m7848() {
        if (C2790.m5261(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f14962.isAttachedToWindow();
        synchronized (this.f14961) {
            try {
                m7849();
                m7852(this.f14961);
                ArrayList<AbstractC4563> arrayList = new ArrayList(this.f14958);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC4563) it.next()).getClass();
                }
                for (AbstractC4563 abstractC4563 : arrayList) {
                    if (C2790.m5261(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f14962 + " is not attached to window. ") + "Cancelling running operation " + abstractC4563);
                    }
                    abstractC4563.m7945(this.f14962);
                }
                ArrayList<AbstractC4563> arrayList2 = new ArrayList(this.f14961);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((AbstractC4563) it2.next()).getClass();
                }
                for (AbstractC4563 abstractC4564 : arrayList2) {
                    if (C2790.m5261(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f14962 + " is not attached to window. ") + "Cancelling pending operation " + abstractC4564);
                    }
                    abstractC4564.m7945(this.f14962);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m7849() {
        Iterator it = this.f14961.iterator();
        while (it.hasNext()) {
            ((AbstractC4563) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7850() {
        if (this.f14960) {
            return;
        }
        if (!this.f14962.isAttachedToWindow()) {
            m7848();
            this.f14959 = false;
            return;
        }
        synchronized (this.f14961) {
            try {
                ArrayList<AbstractC4563> arrayList = new ArrayList(this.f14958);
                this.f14958.clear();
                for (AbstractC4563 abstractC4563 : arrayList) {
                    if (!this.f14961.isEmpty()) {
                        throw null;
                    }
                    abstractC4563.getClass();
                }
                for (AbstractC4563 abstractC4564 : arrayList) {
                    if (this.f14963) {
                        if (C2790.m5261(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + abstractC4564);
                        }
                        abstractC4564.m7944();
                        throw null;
                    }
                    if (C2790.m5261(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + abstractC4564);
                    }
                    abstractC4564.m7945(this.f14962);
                    this.f14963 = false;
                    this.f14958.add(abstractC4564);
                }
                if (this.f14961.isEmpty()) {
                    return;
                }
                m7849();
                ArrayList arrayList2 = new ArrayList(this.f14961);
                if (arrayList2.isEmpty()) {
                    return;
                }
                this.f14961.clear();
                this.f14958.addAll(arrayList2);
                if (C2790.m5261(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                m7851(arrayList2, this.f14959);
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7851(ArrayList arrayList, boolean z) {
        if (C2790.m5261(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            throw null;
        }
        if (C2790.m5261(2)) {
            Log.v("FragmentManager", "Executing operations from null to null");
        }
        new ArrayList();
        new ArrayList();
        throw null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m7852(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC4563) it.next()).getClass();
            AbstractC3649.m6529(null, arrayList2);
        }
        List listM2039 = AbstractC0973.m2039(AbstractC0973.m2052(arrayList2));
        int size = listM2039.size();
        for (int i = 0; i < size; i++) {
            AbstractC0107 abstractC0107 = (AbstractC0107) listM2039.get(i);
            if (!abstractC0107.f424) {
                abstractC0107.m203(this.f14962);
            }
            abstractC0107.f424 = true;
        }
    }
}
