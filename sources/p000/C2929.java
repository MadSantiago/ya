package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥۨؖؗؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2929 extends AbstractC1079 {

    /* JADX INFO: renamed from: ۥَ */
    public final C1489 f9847;

    /* JADX INFO: renamed from: ۥْ */
    public final ArrayList f9848;

    /* JADX INFO: renamed from: ۥٓ */
    public final ArrayList f9849;

    public C2929(String str, ArrayList arrayList, List list, C1489 c1489) {
        super(str);
        this.f9848 = new ArrayList();
        this.f9847 = c1489;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f9848.add(((InterfaceC2150) it.next()).mo1607());
            }
        }
        this.f9849 = new ArrayList(list);
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2150 mo779(C1489 c1489, List list) {
        C4607 c4607;
        C1489 c1489M3148 = this.f9847.m3148();
        C2346 c2346 = (C2346) c1489M3148.f5057;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9848;
            int size = arrayList.size();
            c4607 = InterfaceC2150.f7060;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                c1489M3148.m3154((String) arrayList.get(i), ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) list.get(i)));
            } else {
                c1489M3148.m3154((String) arrayList.get(i), c4607);
            }
            i++;
        }
        for (InterfaceC2150 interfaceC2150 : this.f9849) {
            InterfaceC2150 interfaceC2150M4397 = c2346.m4397(c1489M3148, interfaceC2150);
            if (interfaceC2150M4397 instanceof C4837) {
                interfaceC2150M4397 = c2346.m4397(c1489M3148, interfaceC2150);
            }
            if (interfaceC2150M4397 instanceof C1710) {
                return ((C1710) interfaceC2150M4397).f5683;
            }
        }
        return c4607;
    }

    @Override // p000.AbstractC1079, p000.InterfaceC2150
    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC2150 mo1611() {
        return new C2929(this);
    }

    public C2929(C2929 c2929) {
        super(c2929.f3772);
        ArrayList arrayList = new ArrayList(c2929.f9848.size());
        this.f9848 = arrayList;
        arrayList.addAll(c2929.f9848);
        ArrayList arrayList2 = new ArrayList(c2929.f9849.size());
        this.f9849 = arrayList2;
        arrayList2.addAll(c2929.f9849);
        this.f9847 = c2929.f9847;
    }
}
