package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۥؚٓؑۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1248 extends AbstractC1567 {

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC1567 f4304;

    public C1248(AbstractC1567 abstractC1567) {
        this.f4304 = abstractC1567;
    }

    public final String toString() {
        return AbstractC5041.m8557(C1248.class).m5775() + '(' + this.f4304 + ')';
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1562(C5051 c5051) {
        this.f4304.mo1562(c5051);
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥّ */
    public final List mo1563(C5051 c5051) {
        List listMo1563 = this.f4304.mo1563(c5051);
        ArrayList arrayList = new ArrayList();
        Iterator it = listMo1563.iterator();
        while (it.hasNext()) {
            arrayList.add((C5051) it.next());
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1564(C5051 c5051, C5051 c5052) {
        this.f4304.mo1564(c5051, c5052);
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۜ */
    public final C1377 mo1565(C5051 c5051) {
        C1377 c1377Mo1565 = this.f4304.mo1565(c5051);
        if (c1377Mo1565 == null) {
            return null;
        }
        C5051 c5052 = (C5051) c1377Mo1565.f4717;
        return c5052 == null ? c1377Mo1565 : new C1377(c1377Mo1565.f4714, c1377Mo1565.f4711, c5052, (Long) c1377Mo1565.f4712, (Long) c1377Mo1565.f4713, (Long) c1377Mo1565.f4719, (Long) c1377Mo1565.f4715, (Map) c1377Mo1565.f4718);
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3832 mo1566(C5051 c5051) {
        return this.f4304.mo1566(c5051);
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1567(C5051 c5051) {
        this.f4304.mo1567(c5051);
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC3832 mo1568(C5051 c5051) {
        C5051 c5051M8571 = c5051.m8571();
        if (c5051M8571 != null) {
            C5219 c5219 = new C5219();
            while (c5051M8571 != null && !m3319(c5051M8571)) {
                c5219.addFirst(c5051M8571);
                c5051M8571 = c5051M8571.m8571();
            }
            Iterator<E> it = c5219.iterator();
            while (it.hasNext()) {
                mo1562((C5051) it.next());
            }
        }
        return this.f4304.mo1568(c5051);
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦٛ */
    public final C3886 mo1569(C5051 c5051) {
        return this.f4304.mo1569(c5051);
    }

    @Override // p000.AbstractC1567
    /* JADX INFO: renamed from: ۦۗ */
    public final InterfaceC4598 mo1570(C5051 c5051) {
        return this.f4304.mo1570(c5051);
    }
}
