package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦؘَٝؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4768 extends AbstractC0097 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f15721;

    public C4768(int i) {
        this.f15721 = i;
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥُ */
    public final void mo8116(C2808 c2808) {
        AbstractC0097 abstractC0097;
        AbstractC0097 abstractC0098;
        ArrayList<AbstractC0097> arrayList = (ArrayList) c2808.f9378;
        Iterator it = ((ArrayList) c2808.f9376).iterator();
        do {
            abstractC0097 = null;
            if (!it.hasNext()) {
                abstractC0098 = null;
                break;
            }
            abstractC0098 = (AbstractC0097) it.next();
        } while (!C1783.class.isAssignableFrom(abstractC0098.getClass()));
        if (abstractC0098 == null) {
            for (AbstractC0097 abstractC0099 : arrayList) {
                if (C1783.class.isAssignableFrom(abstractC0099.getClass())) {
                    abstractC0097 = abstractC0099;
                    break;
                }
            }
            if (abstractC0097 == null) {
                throw new IllegalStateException("Requested plugin is not added: " + C1783.class.getName() + ", plugins: " + arrayList);
            }
            c2808.m5337(abstractC0097);
            abstractC0098 = abstractC0097;
        }
        ((C1783) abstractC0098).f5951.add(new C3071(this.f15721));
    }
}
