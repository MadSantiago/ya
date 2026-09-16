package p000;

import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;

/* JADX INFO: renamed from: ۥؖؕۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0542 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f1956;

    /* JADX INFO: renamed from: ۥٖ */
    public int f1957;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C2247 f1958;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0542(C2247 c2247, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f1956 = i;
        this.f1958 = c2247;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f1956;
        C2247 c2247 = this.f1958;
        switch (i) {
            case 0:
                return new C0542(c2247, interfaceC0443, 0);
            case 1:
                return new C0542(c2247, interfaceC0443, 1);
            default:
                return new C0542(c2247, interfaceC0443, 2);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        Object value;
        Object value2;
        Object value3;
        int i = this.f1956;
        C2358 c2358 = C2358.f7817;
        EnumC3021 enumC3021 = EnumC3021.MILLISECONDS;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C2247 c2247 = this.f1958;
        switch (i) {
            case 0:
                int i2 = this.f1957;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    C4036 c4036 = C5805.f19128;
                    long jM7166 = AbstractC4009.m7166(400, enumC3021);
                    this.f1957 = 1;
                    if (AbstractC2765.m5133(jM7166, this) == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i2 != 1) {
                        C0178.m389(new C4441(new long[]{-6685408585739979795L, -440311516996745884L, 5363580296431923607L, 2582668748091121657L, -7222753020401126524L, 8998836819545130175L, 6346107201315726580L}));
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                C4994 c4994 = c2247.f7457.f18601;
                do {
                    value = c4994.getValue();
                } while (!c4994.m8386(value, C1966.m3846((C1966) value, null, false, 0, true, false, null, false, false, false, 503)));
                return c2358;
            case 1:
                int i3 = this.f1957;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    C4036 c4037 = C5805.f19128;
                    long jM7167 = AbstractC4009.m7166(400, enumC3021);
                    this.f1957 = 1;
                    if (AbstractC2765.m5133(jM7167, this) == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i3 != 1) {
                        C0178.m389(new C4441(new long[]{-2353607497990854355L, 2584750151798374229L, 5799730842304867433L, 7808476813125785807L, 8905418183063930710L, -39219833318214028L, 3168751865770395923L}));
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                C4994 c4995 = c2247.f7457.f18601;
                do {
                    value2 = c4995.getValue();
                } while (!c4995.m8386(value2, C1966.m3846((C1966) value2, EnumC5242.f17304, false, 0, false, false, null, false, false, false, 510)));
                return c2358;
            default:
                C5648 c5648 = c2247.f7457;
                int i4 = this.f1957;
                boolean z = true;
                if (i4 == 0) {
                    AbstractC0186.m409(obj);
                    C4994 c4996 = c5648.f18601;
                    do {
                        value3 = c4996.getValue();
                    } while (!c4996.m8386(value3, C1966.m3846((C1966) value3, null, false, 0, false, false, null, false, false, false, 503)));
                    C4036 c4038 = C5805.f19128;
                    long jM7168 = AbstractC4009.m7166(450, enumC3021);
                    this.f1957 = 1;
                    if (AbstractC2765.m5133(jM7168, this) == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i4 != 1) {
                        C0178.m389(new C4441(new long[]{1103404503752144165L, 6172276074932282486L, 3256698045441617911L, 3887231894642789437L, -4186284731692618994L, 2939734808328190567L, 6023249798199011025L}));
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                int iOrdinal = ((C1966) c2247.f7455.f10642.getValue()).f6494.ordinal();
                if (iOrdinal == 3) {
                    MainActivity mainActivity = MainActivity.f411;
                    AbstractC4489.m7770(AbstractC5537.m9214(), new C4441(new long[]{407743360605670687L, 3111335068742911834L, -1366596375956828023L, 2284183575694504836L, -1835607214518763529L, -722535331993040401L, 9181940395579111625L, 8711351740425982118L}).toString());
                    return c2358;
                }
                switch (iOrdinal) {
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        MainActivity mainActivity2 = MainActivity.f411;
                        AbstractC4489.m7770(AbstractC5537.m9214(), new C4441(new long[]{9087403414736372970L, -7476874488031085509L, -4711518332802107692L, 5125490160974470206L, 3085095498583886241L, -4274195158107514009L, 8286324685414982211L}).toString());
                        return c2358;
                    case 8:
                    case 9:
                        C4994 c4997 = c5648.f18601;
                        while (true) {
                            Object value4 = c4997.getValue();
                            boolean z2 = z;
                            if (c4997.m8386(value4, C1966.m3846((C1966) value4, null, false, 0, false, false, null, false, false, z2, 255))) {
                                return c2358;
                            }
                            z = z2;
                        }
                        break;
                    case 10:
                        MainActivity mainActivity3 = MainActivity.f411;
                        AbstractC4489.m7770(AbstractC5537.m9214(), new C4441(new long[]{-9161924642388234524L, -1586024175720824298L, -6883650731743749538L, -36995501685783543L, -3930297306235040530L, 3132847153379040418L, 490320199978855405L}).toString());
                        return c2358;
                    default:
                        return c2358;
                }
                break;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f1956;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C0542) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
