package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥًۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0872 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f3198;

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        switch (this.f3198) {
            case 0:
                throw new C5465("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
                interfaceC5267.mo6180(C4780.f15767, entry.getKey());
                interfaceC5267.mo6180(C4780.f15769, entry.getValue());
                return;
            default:
                throw new C5465("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
