package p000;

/* JADX INFO: renamed from: ۥۚؕؕۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2278 implements InterfaceC2425 {
    @Override // p000.InterfaceC2425
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo1817(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, C5362 c5362, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        C2450 c2450 = (C2450) obj2;
        InterfaceC2609 interfaceC2609 = (InterfaceC2609) obj3;
        InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        C4217 c4217 = C4217.f13994;
        if (i2 == 0) {
            i = (c5362.m8963(c4217) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= c5362.m8963(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= c5362.m9006(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= c5362.m8963(c2450) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= c5362.m8977(interfaceC2609) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= c5362.m8977(interfaceC4448) ? 131072 : 65536;
        }
        if (c5362.m9011(i & 1, (599187 & i) != 599186)) {
            AbstractC3109.m5689(str, zBooleanValue, c2450, c4217, interfaceC2609, interfaceC4448, c5362, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
