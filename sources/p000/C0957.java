package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥٍَؕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0957 implements InterfaceC2059 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C1829 f3395;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f3396;

    public /* synthetic */ C0957(C1829 c1829, int i) {
        this.f3396 = i;
        this.f3395 = c1829;
    }

    @Override // p000.InterfaceC2059
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1989(C1489 c1489, AbstractC3959 abstractC3959) {
        C1992 c1992;
        int i;
        int i2 = this.f3396;
        int i3 = 0;
        C1829 c1829 = this.f3395;
        switch (i2) {
            case 0:
                C0662 c0662 = (C0662) abstractC3959;
                int iM3111 = c1489.m3111();
                c1489.m3155(c0662);
                ArrayList arrayList = (ArrayList) c1829.f6064;
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                    c1829.f6064 = arrayList;
                }
                EnumC3611 enumC3611 = c0662.f2445;
                if (enumC3611 != null) {
                    int iOrdinal = enumC3611.ordinal();
                    if (iOrdinal == 1) {
                        i3 = 1;
                    } else if (iOrdinal == 2) {
                        i3 = 2;
                    }
                }
                C2658 c2658 = (C2658) c1489.f5058;
                StringBuilder sb = c2658.f8818;
                int length = sb.length();
                C4694 c4694 = new C4694(sb.subSequence(iM3111, length));
                Iterator it = c2658.f8817.iterator();
                while (it.hasNext() && (c1992 = (C1992) it.next()) != null) {
                    int i4 = c1992.f6572;
                    if (i4 >= iM3111 && (i = c1992.f6571) <= length) {
                        c4694.setSpan(c1992.f6573, i4 - iM3111, i - iM3111, 33);
                        it.remove();
                    }
                }
                sb.replace(iM3111, length, "");
                arrayList.add(new C2570(i3, c4694));
                c1829.f6063 = c0662.f2446;
                break;
            case 1:
                c1829.m3601(c1489, (C0312) abstractC3959);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c1829.m3601(c1489, (C5861) abstractC3959);
                break;
            default:
                c1489.m3155((C4963) abstractC3959);
                c1829.f6062 = 0;
                break;
        }
    }
}
