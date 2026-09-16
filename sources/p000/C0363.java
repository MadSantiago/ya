package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۥٜؓۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0363 extends AbstractC1079 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C2651 f1316;

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f1317;

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean f1318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363(C2651 c2651, boolean z, boolean z2) {
        super("log");
        this.f1316 = c2651;
        this.f1317 = z;
        this.f1318 = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2150 mo779(C1489 c1489, List list) {
        int i;
        int i2;
        String strMo1607;
        ArrayList arrayList;
        AbstractC1605.m3371(1, "log", list);
        int size = list.size();
        C4607 c4607 = InterfaceC2150.f7060;
        C2651 c2651 = this.f1316;
        if (size == 1) {
            ((C3743) c2651.f8803).m6583(3, ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) list.get(0)).mo1607(), Collections.EMPTY_LIST, this.f1317, this.f1318);
            return c4607;
        }
        InterfaceC2150 interfaceC2150 = (InterfaceC2150) list.get(0);
        C2346 c2346 = (C2346) c1489.f5057;
        C2346 c2347 = (C2346) c1489.f5057;
        int iM3354 = AbstractC1605.m3354(c2346.m4397(c1489, interfaceC2150).mo1610().doubleValue());
        if (iM3354 != 2) {
            i = 3;
            if (iM3354 == 3) {
                i2 = 1;
            } else if (iM3354 == 5) {
                i2 = 5;
            } else if (iM3354 == 6) {
                i2 = 2;
            }
            strMo1607 = c2347.m4397(c1489, (InterfaceC2150) list.get(1)).mo1607();
            if (list.size() == 2) {
                ((C3743) c2651.f8803).m6583(i2, strMo1607, Collections.EMPTY_LIST, this.f1317, this.f1318);
                return c4607;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(c2347.m4397(c1489, (InterfaceC2150) list.get(i3)).mo1607());
            }
            ((C3743) c2651.f8803).m6583(i2, strMo1607, arrayList, this.f1317, this.f1318);
            return c4607;
        }
        i = 4;
        i2 = i;
        strMo1607 = c2347.m4397(c1489, (InterfaceC2150) list.get(1)).mo1607();
        if (list.size() == 2) {
            ((C3743) c2651.f8803).m6583(i2, strMo1607, Collections.EMPTY_LIST, this.f1317, this.f1318);
            return c4607;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(c2347.m4397(c1489, (InterfaceC2150) list.get(i3)).mo1607());
        }
        ((C3743) c2651.f8803).m6583(i2, strMo1607, arrayList, this.f1317, this.f1318);
        return c4607;
    }
}
