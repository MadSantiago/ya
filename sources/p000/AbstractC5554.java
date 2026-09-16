package p000;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۦؚۢؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5554 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f18336 = C1984.m3875("Schedulers");

    /* JADX INFO: renamed from: ۥۗ */
    public static void m9308(C2813 c2813, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C0177 c0177Mo103 = workDatabase.mo103();
        workDatabase.m91();
        try {
            WorkDatabase workDatabase2 = c0177Mo103.f663;
            WorkDatabase workDatabase3 = c0177Mo103.f663;
            List list2 = (List) AbstractC0487.m1075(workDatabase2, true, false, new C3875(25));
            m9309(c0177Mo103, (C4575) c2813.f9390, list2);
            List list3 = (List) AbstractC0487.m1075(workDatabase3, true, false, new C3875(23));
            m9309(c0177Mo103, (C4575) c2813.f9390, list3);
            list3.addAll(list2);
            List list4 = (List) AbstractC0487.m1075(workDatabase3, true, false, new C3875(28));
            workDatabase.m87();
            workDatabase.m95();
            if (list3.size() > 0) {
                C4142[] c4142Arr = (C4142[]) list3.toArray(new C4142[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC1025 interfaceC1025 = (InterfaceC1025) it.next();
                    if (interfaceC1025.mo2235()) {
                        interfaceC1025.mo2234(c4142Arr);
                    }
                }
            }
            if (list4.size() > 0) {
                C4142[] c4142Arr2 = (C4142[]) list4.toArray(new C4142[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1025 interfaceC1026 = (InterfaceC1025) it2.next();
                    if (!interfaceC1026.mo2235()) {
                        interfaceC1026.mo2234(c4142Arr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.m95();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m9309(C0177 c0177, C4575 c4575, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c0177.m380(jCurrentTimeMillis, ((C4142) it.next()).f13787);
            }
        }
    }
}
