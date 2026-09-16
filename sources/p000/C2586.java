package p000;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۥِٟۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2586 implements InterfaceC0690 {

    /* JADX INFO: renamed from: ۥۣ */
    public final char f8632;

    /* JADX INFO: renamed from: ۥۗ */
    public int f8631 = 0;

    /* JADX INFO: renamed from: ۥؗ */
    public final LinkedList f8630 = new LinkedList();

    public C2586(char c) {
        this.f8632 = c;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1541(C3673 c3673, C3673 c3674) {
        int i = c3673.f12278;
        LinkedList<InterfaceC0690> linkedList = this.f8630;
        for (InterfaceC0690 interfaceC0690 : linkedList) {
            if (interfaceC0690.mo1543() <= i) {
                return interfaceC0690.mo1541(c3673, c3674);
            }
        }
        interfaceC0690 = (InterfaceC0690) linkedList.getFirst();
        return interfaceC0690.mo1541(c3673, c3674);
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥُ */
    public final char mo1542() {
        return this.f8632;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m4880(InterfaceC0690 interfaceC0690) {
        int iMo1543 = interfaceC0690.mo1543();
        LinkedList linkedList = this.f8630;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iMo1544 = ((InterfaceC0690) listIterator.next()).mo1543();
            if (iMo1543 > iMo1544) {
                listIterator.previous();
                listIterator.add(interfaceC0690);
                return;
            } else if (iMo1543 == iMo1544) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f8632 + "' and minimum length " + iMo1543);
            }
        }
        linkedList.add(interfaceC0690);
        this.f8631 = iMo1543;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1543() {
        return this.f8631;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۥۣ */
    public final char mo1544() {
        return this.f8632;
    }

    @Override // p000.InterfaceC0690
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1545(C1507 c1507, C1507 c1508, int i) {
        LinkedList<InterfaceC0690> linkedList = this.f8630;
        for (InterfaceC0690 interfaceC0690 : linkedList) {
            if (interfaceC0690.mo1543() <= i) {
                interfaceC0690.mo1545(c1507, c1508, i);
            }
        }
        interfaceC0690 = (InterfaceC0690) linkedList.getFirst();
        interfaceC0690.mo1545(c1507, c1508, i);
    }
}
