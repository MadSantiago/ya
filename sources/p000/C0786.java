package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؚٖؕؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0786 implements InterfaceC1648 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0469 f2833;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C5450 f2834;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2404 f2835;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C3950 f2836;

    public C0786(C3950 c3950, C2404 c2404, C0469 c0469, C5450 c5450) {
        this.f2836 = c3950;
        this.f2835 = c2404;
        this.f2833 = c0469;
        this.f2834 = c5450;
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1683(InterfaceC4507 interfaceC4507, EnumC1924 enumC1924) {
        boolean z;
        InterfaceC4242 interfaceC4242M996 = null;
        switch (AbstractC2445.f8145[enumC1924.ordinal()]) {
            case 1:
                AbstractC2765.m5135(this.f2836, null, 4, new C1734(this.f2834, this.f2833, interfaceC4507, this, null, 11), 1);
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C2404 c2404 = this.f2835;
                if (c2404 != null) {
                    C1405 c1405 = (C1405) c2404.f8010;
                    synchronized (c1405.f4836) {
                        try {
                            synchronized (c1405.f4836) {
                                z = c1405.f4837;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) c1405.f4835;
                                c1405.f4835 = (ArrayList) c1405.f4838;
                                c1405.f4838 = arrayList;
                                c1405.f4837 = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((InterfaceC0443) arrayList.get(i)).mo335(C2358.f7817);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                C0469 c0469 = this.f2833;
                synchronized (c0469.f1693) {
                    if (c0469.f1699) {
                        c0469.f1699 = false;
                        interfaceC4242M996 = c0469.m996();
                    }
                    break;
                }
                if (interfaceC4242M996 != null) {
                    ((C2600) interfaceC4242M996).mo335(C2358.f7817);
                    return;
                }
                return;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C0469 c04610 = this.f2833;
                synchronized (c04610.f1693) {
                    c04610.f1699 = true;
                }
                return;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                this.f2833.m1010();
                return;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                C1078.m2275();
                return;
        }
    }
}
