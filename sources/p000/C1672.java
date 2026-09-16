package p000;

/* JADX INFO: renamed from: ۥؚٙؖؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1672 implements InterfaceC3275 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C4681 f5573;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5574;

    public /* synthetic */ C1672(C4681 c4681, int i) {
        this.f5574 = i;
        this.f5573 = c4681;
    }

    @Override // p000.InterfaceC3275
    /* JADX INFO: renamed from: ۦ۟ */
    public final Object mo1822(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f5574;
        C2358 c2358 = C2358.f7817;
        C4681 c4681 = this.f5573;
        switch (i) {
            case 0:
                C4068 c4068 = (C4068) obj;
                int iIntValue = ((Number) obj2).intValue();
                C5362 c5362 = (C5362) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                new C4441(new long[]{1181837039662007997L, 8932426580707627241L, 2699821764694678048L, 43323505546500896L, 2360308274995280237L, -8056848544947160538L}).toString();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (c5362.m8963(c4068) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= c5362.m8988(iIntValue) ? 32 : 16;
                }
                if (!c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
                    c5362.m8982();
                } else {
                    EnumC5073 enumC5073 = (EnumC5073) c4681.get(iIntValue);
                    c5362.m8957(-1233436215);
                    new C4441(new long[]{8965347153919432858L, -5599358657896398791L, 2170828329122864513L, 4759147499387093161L, -1440499009980308797L, -7328164754086309166L}).toString();
                    AbstractC0949.m1939(enumC5073.f16830, enumC5073.f16829, enumC5073.f16828, c5362, 0);
                    c5362.m9009(false);
                }
                break;
            default:
                C4068 c4069 = (C4068) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C5362 c5363 = (C5362) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                new C4441(new long[]{-7411142121326742801L, -9045901452723935370L, 6310367537444981384L, -5734552358578156485L, -1107996440049310610L, 8551285682646670210L}).toString();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (c5363.m8963(c4069) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= c5363.m8988(iIntValue3) ? 32 : 16;
                }
                if (!c5363.m9011(i3 & 1, (i3 & 147) != 146)) {
                    c5363.m8982();
                } else {
                    EnumC3207 enumC3207 = (EnumC3207) c4681.get(iIntValue3);
                    c5363.m8957(-465116966);
                    new C4441(new long[]{5834686487232015319L, -1681766887644569534L, -1034563758670311146L, 2297596562080912371L, 5209626282104643840L, 4517153702467734451L}).toString();
                    AbstractC0949.m1939(enumC3207.f10759, enumC3207.f10758, enumC3207.f10757, c5363, 0);
                    c5363.m9009(false);
                }
                break;
        }
        return c2358;
    }
}
