package p000;

import android.content.Context;
import android.view.ActionMode;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۦؚّؕۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3599 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f11979;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f11980;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f11981;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11982;

    public /* synthetic */ RunnableC3599(Object obj, Object obj2, Object obj3, int i) {
        this.f11982 = i;
        this.f11981 = obj;
        this.f11979 = obj2;
        this.f11980 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC0443 interfaceC0443 = null;
        boolean zBooleanValue = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        switch (this.f11982) {
            case 0:
                C3738 c3738 = (C3738) this.f11981;
                C2048 c2048 = (C2048) this.f11979;
                C4938 c4938 = (C4938) this.f11980;
                ActionMode actionModeStartActionMode = c3738.f12449.startActionMode(new ActionModeCallbackC1175(c2048), 1);
                AbstractC3831.m6874(c3738.f12448, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    c4938.close();
                    return;
                }
                return;
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) this.f11981;
                String str = (String) this.f11979;
                C3600 c3600 = (C3600) this.f11980;
                Iterator it = ((List) AbstractC0487.m1075(workDatabase.mo103().f663, true, false, new C3203(13, str))).iterator();
                while (it.hasNext()) {
                    AbstractC5378.m9069(c3600, (String) it.next());
                }
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5002 c5002 = (C5002) this.f11981;
                InterfaceC3901 interfaceC3901 = (InterfaceC3901) this.f11979;
                C4633 c4633 = (C4633) this.f11980;
                C4717 c4717 = (C4717) c5002.f16550;
                if (c4717.f15549.mo1598()) {
                    interfaceC3901.mo3081(new IOException("Canceled"));
                    return;
                } else {
                    interfaceC3901.mo3082(c4717, c4633);
                    return;
                }
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f11981;
                C4206 c4206 = (C4206) this.f11979;
                C0411 c0411 = (C0411) this.f11980;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    c0411.mo449();
                    c4206.m7429(null);
                    return;
                } catch (Throwable th) {
                    c4206.m7428(th);
                    return;
                }
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C3654 c3654 = (C3654) this.f11981;
                C4995 c4995 = (C4995) this.f11979;
                C5789 c5789 = (C5789) this.f11980;
                c3654.getClass();
                try {
                    zBooleanValue = ((Boolean) c4995.f16533.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (c3654.f12236) {
                    try {
                        C1860 c1860M2155 = AbstractC0993.m2155(c5789.f19075);
                        String str2 = c1860M2155.f6202;
                        if (c3654.m6531(str2) == c5789) {
                            c3654.m6532(str2);
                        }
                        C1984.m3874().m3878(C3654.f12226, C3654.class.getSimpleName() + " " + str2 + " executed; reschedule = " + zBooleanValue);
                        Iterator it2 = c3654.f12234.iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC0978) it2.next()).mo108(c1860M2155, zBooleanValue);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C2346 c2346 = (C2346) this.f11981;
                C2666 c2666 = (C2666) this.f11979;
                C3654 c3655 = (C3654) c2346.f7786;
                c3655.getClass();
                C1860 c1860 = c2666.f8830;
                String str3 = c1860.f6202;
                ArrayList arrayList = new ArrayList();
                C4142 c4142 = (C4142) c3655.f12228.m105(new CallableC2140(c3655, arrayList, str3, z4 ? 1 : 0));
                int i = 16;
                if (c4142 == null) {
                    C1984.m3874().m3885(C3654.f12226, "Didn't find WorkSpec for id " + c1860);
                    ((ExecutorC0170) c3655.f12233.f5056).execute(new RunnableC5689(i, c3655, c1860));
                    return;
                }
                synchronized (c3655.f12236) {
                    try {
                        synchronized (c3655.f12236) {
                            z = c3655.m6531(str3) != null;
                            break;
                        }
                        if (z) {
                            Set set = (Set) c3655.f12231.get(str3);
                            if (((C2666) set.iterator().next()).f8830.f6201 == c1860.f6201) {
                                set.add(c2666);
                                C1984.m3874().m3878(C3654.f12226, "Work " + c1860 + " is already enqueued for processing");
                            } else {
                                ((ExecutorC0170) c3655.f12233.f5056).execute(new RunnableC5689(i, c3655, c1860));
                            }
                            return;
                        }
                        if (c4142.f13782 != c1860.f6201) {
                            ((ExecutorC0170) c3655.f12233.f5056).execute(new RunnableC5689(i, c3655, c1860));
                            return;
                        }
                        Context context = c3655.f12230;
                        C2813 c2813 = c3655.f12227;
                        C1489 c1489 = c3655.f12233;
                        WorkDatabase workDatabase2 = c3655.f12228;
                        C3571 c3571 = new C3571();
                        c3571.f11831 = c2813;
                        c3571.f11830 = c1489;
                        c3571.f11826 = c3655;
                        c3571.f11827 = workDatabase2;
                        c3571.f11825 = c4142;
                        c3571.f11828 = arrayList;
                        c3571.f11829 = context.getApplicationContext();
                        C5789 c57810 = new C5789(c3571);
                        AbstractC2132 abstractC2132 = (AbstractC2132) c57810.f19076.f5057;
                        C3841 c3841M9366 = AbstractC5568.m9366();
                        abstractC2132.getClass();
                        C4995 c4995M6774 = AbstractC3801.m6774(new C5240(AbstractC4593.m7963(abstractC2132, c3841M9366), (int) (z2 ? 1 : 0), new C1502(c57810, interfaceC0443, z3 ? 1 : 0)));
                        c4995M6774.f16533.mo3760(new RunnableC3599(c3655, c4995M6774, c57810, 4), (ExecutorC0170) c3655.f12233.f5056);
                        c3655.f12237.put(str3, c57810);
                        HashSet hashSet = new HashSet();
                        hashSet.add(c2666);
                        c3655.f12231.put(str3, hashSet);
                        C1984.m3874().m3878(C3654.f12226, C3654.class.getSimpleName() + ": processing " + c1860);
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            default:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f11981;
                C4206 c4207 = (C4206) this.f11979;
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) this.f11980;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    c4207.m7429(interfaceC4448.mo449());
                    return;
                } catch (Throwable th4) {
                    c4207.m7428(th4);
                    return;
                }
        }
    }
}
