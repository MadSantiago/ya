package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥۨؖؕؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2928 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC5731 f9845;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9846 = 1;

    public /* synthetic */ C2928(int i, InterfaceC5731 interfaceC5731) {
        this.f9845 = interfaceC5731;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        InterfaceC0814 interfaceC0814;
        int i = this.f9846;
        InterfaceC5731 interfaceC5731 = this.f9845;
        switch (i) {
            case 0:
                C5869 c5869 = (C5869) obj;
                List list = (List) interfaceC5731.mo219(c5869, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (interfaceC0814 = c5869.f19386) != null && !interfaceC0814.mo1712(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            default:
                ((Integer) obj2).getClass();
                AbstractC5844.m9650(interfaceC5731, (C5362) obj, AbstractC3831.m6835(1));
                return C2358.f7817;
        }
    }

    public /* synthetic */ C2928(InterfaceC5731 interfaceC5731) {
        this.f9845 = interfaceC5731;
    }
}
