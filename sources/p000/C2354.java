package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۥۛٞۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2354 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f7801;

    /* JADX INFO: renamed from: ۥُ */
    public final C1414 f7802;

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f7803;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f7804;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC1796 f7805;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4093 f7806;

    /* JADX INFO: renamed from: ۦۙ */
    public volatile ThreadLocal f7807;

    public C2354(InterfaceC1796 interfaceC1796, String str, C4093 c4093, C1414 c1414, int i) {
        boolean z = (i & 4) == 0;
        c4093 = (i & 8) != 0 ? null : c4093;
        this.f7805 = interfaceC1796;
        this.f7804 = str;
        this.f7801 = z;
        this.f7806 = c4093;
        this.f7802 = c1414;
        this.f7803 = new ArrayList();
        new LinkedHashSet();
    }

    public final String toString() {
        return AbstractC3761.m6621(new StringBuilder("['"), this.f7804, "']");
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01d8 A[PHI: r1
  0x01d8: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v17 java.lang.Object), (r1v22 java.lang.Object) binds: [B:9:0x0027, B:24:0x0055, B:108:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۥؗ */
    public final Object m4426(C1414 c1414) throws C1679 {
        ThreadLocal threadLocal;
        C5219 c5219;
        C0735 c0735;
        AbstractC4766 abstractC4766M5334;
        C5219 c52110;
        Object objMo4355;
        ThreadLocal threadLocal2;
        C5219 c52111;
        C0735 c0736;
        C4093 c4093;
        C5002 c5002 = (C5002) this.f7802.f4868;
        c5002.getClass();
        C0735 c0737 = (C0735) c1414.f4870;
        Object obj = null;
        Object objMo1623 = (c0737 == null || c0737.f2677.isEmpty()) ? null : ((C0735) c1414.f4870).mo1623((C3131) c1414.f4869);
        if (objMo1623 != null) {
            obj = objMo1623;
        } else {
            objMo1623 = (((InterfaceC1796) c1414.f4867) != null || (threadLocal = this.f7807) == null || (c5219 = (C5219) threadLocal.get()) == null || c5219.isEmpty() || (c0735 = (C0735) c5219.m8843()) == null) ? null : c0735.mo1623((C3131) c1414.f4869);
            if (objMo1623 == null) {
                C1414 c1415 = (C1414) c5002.f16551;
                C2808 c2808 = (C2808) c1415.f4867;
                C3131 c3131 = (C3131) c1414.f4869;
                InterfaceC1796 interfaceC1796 = (InterfaceC1796) c1414.f4867;
                AbstractC4766 abstractC4766M5335 = c2808.m5334(c3131, interfaceC1796, this.f7805);
                if (abstractC4766M5335 == null) {
                    abstractC4766M5335 = (this.f7801 || (c4093 = this.f7806) == null) ? null : ((C2808) c1415.f4867).m5334((C3131) c1414.f4869, interfaceC1796, c4093);
                }
                objMo1623 = abstractC4766M5335 != null ? abstractC4766M5335.mo4355(c1414) : null;
                if (objMo1623 == null) {
                    if (!this.f7801 && ((InterfaceC1796) c1414.f4867) == null) {
                        ((C3131) c1414.f4869).m5774(null);
                    }
                    ArrayList arrayList = this.f7803;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    C5219 c52112 = new C5219(new C5076(arrayList));
                    while (!c52112.isEmpty()) {
                        C2354 c2354 = (C2354) c52112.removeLast();
                        if (linkedHashSet.add(c2354)) {
                            for (C2354 c2355 : c2354.f7803) {
                                if (!linkedHashSet.contains(c2355)) {
                                    c52112.addLast(c2355);
                                }
                            }
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                objMo1623 = null;
                                break;
                            }
                            C2354 c2356 = (C2354) it.next();
                            C1414 c1416 = (C1414) c5002.f16551;
                            C4093 c4094 = c2356.f7806;
                            if (c4094 == null || (abstractC4766M5334 = ((C2808) c1416.f4867).m5334((C3131) c1414.f4869, (InterfaceC1796) c1414.f4867, c4094)) == null) {
                                abstractC4766M5334 = ((C2808) c1416.f4867).m5334((C3131) c1414.f4869, (InterfaceC1796) c1414.f4867, c2356.f7805);
                            }
                            AbstractC4766 abstractC4766 = abstractC4766M5334;
                            if (abstractC4766 == null) {
                                objMo4355 = (((InterfaceC1796) c1414.f4867) != null || (threadLocal2 = c2356.f7807) == null || (c52111 = (C5219) threadLocal2.get()) == null || c52111.isEmpty() || (c0736 = (C0735) c52111.m8843()) == null) ? null : c0736.mo1623((C3131) c1414.f4869);
                                if (objMo4355 != null) {
                                }
                            } else {
                                if (c2356.f7801 && !(abstractC4766 instanceof C2301)) {
                                    objMo1623 = abstractC4766.mo4355(c1414);
                                    break;
                                }
                                C3223 c3223 = (C3223) c1414.f4871;
                                C3131 c3132 = (C3131) c1414.f4869;
                                InterfaceC1796 interfaceC1797 = (InterfaceC1796) c1414.f4867;
                                C0735 c0738 = (C0735) c1414.f4870;
                                C1414 c1417 = new C1414(c3223, c2356, c3132, interfaceC1797, c0738);
                                if (c0738 != null) {
                                    c52110 = (C5219) c2356.m4428().get();
                                    if (c52110 == null) {
                                        c52110 = new C5219();
                                        c2356.m4428().set(c52110);
                                    }
                                    c52110.addFirst(c0738);
                                } else {
                                    c52110 = null;
                                }
                                objMo4355 = abstractC4766.mo4355(c1417);
                                if (c52110 != null) {
                                    if (!c52110.isEmpty()) {
                                        c52110.removeFirst();
                                    }
                                    if (c52110.isEmpty()) {
                                        c2356.m4428().remove();
                                    }
                                }
                            }
                            objMo1623 = objMo4355;
                            break;
                        }
                    }
                    objMo1623 = null;
                    break;
                }
                if (objMo1623 == null) {
                    Iterator it2 = ((ArrayList) c5002.f16550).iterator();
                    if (it2.hasNext()) {
                        throw AbstractC5078.m8675(it2);
                    }
                } else {
                    obj = objMo1623;
                }
            } else {
                obj = objMo1623;
            }
        }
        if (obj != null) {
            return obj;
        }
        InterfaceC1796 interfaceC1798 = (InterfaceC1796) c1414.f4867;
        String string = "";
        String str = interfaceC1798 != null ? " and qualifier '" + interfaceC1798 + '\'' : "";
        String str2 = ((C2354) c1414.f4868) != this ? "scope '" + this + "' (resolution context scope: '" + ((C2354) c1414.f4868) + "')" : "scope '" + this + '\'';
        ArrayList arrayList2 = this.f7803;
        ArrayList arrayList3 = new ArrayList(AbstractC5573.m9402(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((C2354) it3.next()).f7804);
        }
        if (!arrayList3.isEmpty()) {
            StringBuilder sb = new StringBuilder(" Searched scopes: ['");
            sb.append(this.f7804);
            sb.append("'] -> ");
            ArrayList arrayList4 = new ArrayList(AbstractC5573.m9402(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add("['" + ((String) it4.next()) + "']");
            }
            sb.append(arrayList4);
            string = sb.toString();
        }
        String strM5505 = AbstractC2919.m5505((C3131) c1414.f4869);
        throw new C1679("No definition found for type '" + strM5505 + '\'' + str + " on " + str2 + '.' + string + '.' + (AbstractC0684.m1535('.', strM5505, strM5505).equals("SavedStateHandle") ? " SavedStateHandle is provided by the ViewModel's CreationExtras during creation, not by a module definition — resolve the ViewModel via koinViewModel()/koinNavViewModel() with a proper owner and inject SavedStateHandle in its constructor (do not resolve it lazily or outside construction)." : " Check or add definition for type '" + strM5505 + '\'' + str + " in scope '" + this.f7805 + "'."));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m4427(C3131 c3131, C4671 c4671, C0735 c0735) {
        if (AbstractC3761.m6627(5, 1) > 0) {
            return m4429(c4671, c3131, c0735);
        }
        AbstractC2919.m5505(c3131);
        long jM2659 = AbstractC1266.m2659();
        Object objM4429 = m4429(c4671, c3131, c0735);
        long jM2597 = AbstractC1232.m2597(jM2659);
        AbstractC2919.m5505(c3131);
        C5805.m9621(jM2597, EnumC3021.MICROSECONDS);
        return objM4429;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final ThreadLocal m4428() {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2 = this.f7807;
        if (threadLocal2 != null) {
            return threadLocal2;
        }
        synchronized (this) {
            threadLocal = this.f7807;
            if (threadLocal == null) {
                threadLocal = new ThreadLocal();
                this.f7807 = threadLocal;
            }
        }
        return threadLocal;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Object m4429(InterfaceC1796 interfaceC1796, C3131 c3131, C0735 c0735) {
        C3223 c3223 = (C3223) this.f7802.f4871;
        C1414 c1414 = new C1414(c3223, this, c3131, interfaceC1796, c0735);
        if (c0735 == null) {
            return m4426(c1414);
        }
        if (AbstractC3761.m6627(5, 1) <= 0) {
            c0735.toString();
        }
        C5219 c5219 = (C5219) m4428().get();
        if (c5219 == null) {
            c5219 = new C5219();
            m4428().set(c5219);
        }
        c5219.addFirst(c0735);
        try {
            return m4426(c1414);
        } finally {
            c3223.m5948("| << parameters");
            if (!c5219.isEmpty()) {
                c5219.removeFirst();
            }
            if (c5219.isEmpty()) {
                m4428().remove();
            }
        }
    }
}
