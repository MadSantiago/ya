package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦّْؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4000 extends AbstractC5682 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4000 f13341 = new C4000(1, 0, 2);

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo182(C4902 c4902, InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        int[] iArr;
        C4356 c4356;
        int iM231;
        int iM8250 = c4902.m8250(0);
        if (c0126.f502 != 0) {
            AbstractC5508.m9201("Cannot move a group while inserting");
        }
        if (iM8250 < 0) {
            AbstractC5508.m9201("Parameter offset is out of bounds");
        }
        if (iM8250 == 0) {
            return;
        }
        int i = c0126.f488;
        int i2 = c0126.f503;
        int i3 = c0126.f498;
        int i4 = i;
        while (true) {
            iArr = c0126.f490;
            if (iM8250 <= 0) {
                break;
            }
            i4 += iArr[(c0126.m236(i4) * 5) + 3];
            if (i4 > i3) {
                AbstractC5508.m9201("Parameter offset is out of bounds");
            }
            iM8250--;
        }
        int i5 = iArr[(c0126.m236(i4) * 5) + 3];
        int iM235 = c0126.m235(c0126.f490, c0126.m236(c0126.f488));
        int iM236 = c0126.m235(c0126.f490, c0126.m236(i4));
        int i6 = i4 + i5;
        int iM237 = c0126.m235(c0126.f490, c0126.m236(i6));
        int i7 = iM237 - iM236;
        c0126.m243(i7, Math.max(c0126.f488 - 1, 0));
        c0126.m267(i5);
        int[] iArr2 = c0126.f490;
        int iM238 = c0126.m236(i6) * 5;
        AbstractC0246.m523(c0126.m236(i) * 5, iM238, (i5 * 5) + iM238, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = c0126.f482;
            int iM265 = c0126.m265(iM236 + i7);
            System.arraycopy(objArr, iM265, objArr, iM235, c0126.m265(iM237 + i7) - iM265);
        }
        int i8 = iM236 + i7;
        int i9 = i8 - iM235;
        int i10 = c0126.f500;
        int i11 = c0126.f494;
        int length = c0126.f482.length;
        int i12 = c0126.f495;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iM239 = c0126.m236(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iM239 * 5) + 4] = C0126.m227(C0126.m227(c0126.m235(iArr2, iM239) - i15, i12 < iM239 ? 0 : i10, i11, length), c0126.f500, c0126.f494, c0126.f482.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iM271 = c0126.m271();
        int iM6811 = AbstractC3809.m6811(c0126.f493, i6, iM271);
        ArrayList arrayList = new ArrayList();
        if (iM6811 >= 0) {
            while (iM6811 < c0126.f493.size() && (iM231 = c0126.m231((c4356 = (C4356) c0126.f493.get(iM6811)))) >= i6 && iM231 < i16) {
                arrayList.add(c4356);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            C4356 c4357 = (C4356) arrayList.get(i18);
            int iM232 = c0126.m231(c4357) + i17;
            if (iM232 >= c0126.f501) {
                c4357.f14359 = -(iM271 - iM232);
            } else {
                c4357.f14359 = iM232;
            }
            c0126.f493.add(AbstractC3809.m6811(c0126.f493, iM232, iM271), c4357);
        }
        if (c0126.m252(i6, i5)) {
            AbstractC5508.m9201("Unexpectedly removed anchors");
        }
        c0126.m255(i2, c0126.f498, i);
        if (i7 > 0) {
            c0126.m248(i8, i7, i6 - 1);
        }
    }
}
