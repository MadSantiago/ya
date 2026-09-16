package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۦؘۡؑؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5436 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3161 f17933;

    /* JADX INFO: renamed from: ۥُ */
    public final C5219 f17934;

    /* JADX INFO: renamed from: ۥّ */
    public C1585 f17935;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4994 f17936;

    /* JADX INFO: renamed from: ۥۜ */
    public AbstractC1359 f17937;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4994 f17938 = AbstractC1605.m3349(C3939.f13151);

    /* JADX INFO: renamed from: ۦؑ */
    public final C5219 f17939;

    /* JADX INFO: renamed from: ۦؚ */
    public boolean f17940;

    /* JADX INFO: renamed from: ۦٌ */
    public boolean f17941;

    /* JADX INFO: renamed from: ۦِ */
    public final LinkedHashSet f17942;

    /* JADX INFO: renamed from: ۦٛ */
    public final LinkedHashSet f17943;

    /* JADX INFO: renamed from: ۦۗ */
    public final LinkedHashSet f17944;

    /* JADX INFO: renamed from: ۦۙ */
    public int f17945;

    /* JADX INFO: renamed from: ۦۚ */
    public boolean f17946;

    public C5436() {
        C4994 c4994M3349 = AbstractC1605.m3349(new C5458());
        this.f17936 = c4994M3349;
        this.f17933 = new C3161(c4994M3349, null);
        this.f17939 = new C5219();
        this.f17934 = new C5219();
        this.f17943 = new LinkedHashSet();
        this.f17942 = new LinkedHashSet();
        this.f17944 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C1585 m9108(int i) {
        Object next;
        Object next2;
        C5219 c5219 = this.f17934;
        C5219 c52110 = this.f17939;
        Object obj = null;
        if (i == -1) {
            Iterator it = c52110.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C1585) next).f5334);
            C1585 c1585 = (C1585) next;
            if (c1585 != null) {
                return c1585;
            }
            for (Object obj2 : c5219) {
                if (((C1585) obj2).f5334) {
                    obj = obj2;
                    break;
                }
            }
            return (C1585) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = c52110.iterator();
            while (it2.hasNext()) {
                ((C1585) it2.next()).getClass();
            }
            Iterator it3 = c5219.iterator();
            while (it3.hasNext()) {
                ((C1585) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = c52110.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((C1585) next2).f5334);
        C1585 c1586 = (C1585) next2;
        if (c1586 != null) {
            return c1586;
        }
        for (Object obj3 : c5219) {
            if (((C1585) obj3).f5334) {
                obj = obj3;
                break;
            }
        }
        return (C1585) obj;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9109() {
        boolean z;
        boolean z2;
        C5458 c5458;
        C5219 c5219 = this.f17939;
        if (!c5219.isEmpty()) {
            Iterator it = c5219.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (((C1585) it.next()).f5334) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        C5219 c52110 = this.f17934;
        if (!c52110.isEmpty()) {
            Iterator it2 = c52110.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                } else if (((C1585) it2.next()).f5334) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        boolean z3 = z || z2;
        boolean z4 = this.f17941 != z;
        boolean z5 = this.f17940 != z2;
        boolean z6 = this.f17946 != z3;
        LinkedHashSet linkedHashSet = this.f17944;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((AbstractC1359) it3.next()).mo1516(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f17942;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((AbstractC1359) it4.next()).mo1516(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f17943;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((AbstractC1359) it5.next()).mo1516(z3);
            }
        }
        this.f17941 = z;
        this.f17940 = z2;
        this.f17946 = z3;
        C1585 c1585M9108 = this.f17935;
        if (c1585M9108 == null) {
            c1585M9108 = m9108(0);
        }
        C1585 c1585M9109 = this.f17935;
        if (c1585M9109 == null) {
            c1585M9109 = m9108(0);
        }
        if (AbstractC3831.m6874(c1585M9109, c1585M9108)) {
            if (c1585M9109 == null) {
                c5458 = new C5458();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = c5219.iterator();
                while (it6.hasNext()) {
                    ((C1585) it6.next()).getClass();
                }
                Iterator<E> it7 = c52110.iterator();
                while (it7.hasNext()) {
                    ((C1585) it7.next()).getClass();
                }
                C0528 c0528 = c1585M9109.f5335;
                C3251 c3251M4189 = AbstractC2164.m4189();
                AbstractC3649.m6529(arrayList, c3251M4189);
                c3251M4189.add(c0528);
                AbstractC3649.m6529(C2340.f7777, c3251M4189);
                c5458 = new C5458(arrayList.size(), AbstractC2164.m4187(c3251M4189));
            }
            C4994 c4994 = this.f17936;
            if (AbstractC3831.m6874((C5458) c4994.getValue(), c5458)) {
                return;
            }
            c4994.m8388(null, c5458);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((AbstractC1359) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((AbstractC1359) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((AbstractC1359) it10.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9110(C1489 c1489, AbstractC1359 abstractC1359, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        if (abstractC1359.f4673 != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(abstractC1359);
            C1489 c14810 = abstractC1359.f4673;
            sb.append("' is already added to dispatcher ");
            sb.append(c14810);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.f17943 : this.f17942;
        } else {
            linkedHashSet = this.f17944;
        }
        linkedHashSet.add(abstractC1359);
        abstractC1359.f4673 = c1489;
        if (i != 0) {
            z = i != 1 ? this.f17946 : this.f17940;
        } else {
            z = this.f17941;
        }
        abstractC1359.mo1516(z);
    }
}
