package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥَِؖٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1115 implements InterfaceC3077 {

    /* JADX INFO: renamed from: ۦۨ */
    public final ArrayList f3914;

    public C1115(int i, boolean z) {
        switch (i) {
            case 1:
                this.f3914 = new ArrayList();
                break;
            default:
                this.f3914 = new ArrayList(32);
                break;
        }
    }

    @Override // p000.InterfaceC3077
    public /* synthetic */ Object get() {
        Object obj = C0996.f3556;
        return new C4810(this.f3914);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m2328(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f3914.add(new C2052(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m2329(float f) {
        this.f3914.add(new C0749(f));
    }

    /* JADX INFO: renamed from: ۥّ */
    public void m2330(float f, float f2) {
        this.f3914.add(new C2649(f, f2));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m2331() {
        this.f3914.add(C0991.f3518);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public void m2332(float f, float f2) {
        this.f3914.add(new C5744(f, f2));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m2333(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.f3914;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m2334(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f3914.add(new C3208(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: ۦِ */
    public void m2335(float f) {
        this.f3914.add(new C4227(f));
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m2336(float f, float f2, float f3, float f4) {
        this.f3914.add(new C4864(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m2337(float f, float f2) {
        this.f3914.add(new C2544(f, f2));
    }

    public C1115(int i) {
        this.f3914 = new ArrayList(i);
    }

    public /* synthetic */ C1115(ArrayList arrayList) {
        this.f3914 = arrayList;
    }
}
