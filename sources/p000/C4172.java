package p000;

/* JADX INFO: renamed from: ۦؙٔؔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4172 implements InterfaceC2059 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f13896;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4172 f13889 = new C4172(0);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4172 f13886 = new C4172(1);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C4172 f13891 = new C4172(2);

    /* JADX INFO: renamed from: ۥُ */
    public static final C4172 f13887 = new C4172(3);

    /* JADX INFO: renamed from: ۥّ */
    public static final C4172 f13888 = new C4172(4);

    /* JADX INFO: renamed from: ۦۙ */
    public static final C4172 f13895 = new C4172(5);

    /* JADX INFO: renamed from: ۥۜ */
    public static final C4172 f13890 = new C4172(6);

    /* JADX INFO: renamed from: ۦٛ */
    public static final C4172 f13893 = new C4172(7);

    /* JADX INFO: renamed from: ۦِ */
    public static final C4172 f13892 = new C4172(8);

    /* JADX INFO: renamed from: ۦۗ */
    public static final C4172 f13894 = new C4172(9);

    public /* synthetic */ C4172(int i) {
        this.f13896 = i;
    }

    @Override // p000.InterfaceC2059
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1989(C1489 c1489, AbstractC3959 abstractC3959) {
        int i = 0;
        z = false;
        boolean z = false;
        switch (this.f13896) {
            case 0:
                AbstractC3959 abstractC39510 = (C2623) abstractC3959;
                c1489.m3102();
                int iM3111 = c1489.m3111();
                c1489.m3155(abstractC39510);
                c1489.m3149(abstractC39510, iM3111);
                c1489.m3142(abstractC39510);
                break;
            case 1:
                C4374 c4374 = (C4374) abstractC3959;
                int iM3112 = c1489.m3111();
                C2658 c2658 = (C2658) c1489.f5058;
                StringBuilder sb = c2658.f8818;
                sb.append((char) 160);
                sb.append(c4374.f14414);
                c2658.m4967((char) 160);
                c1489.m3149(c4374, iM3112);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC3959 abstractC39511 = (C3475) abstractC3959;
                int iM3113 = c1489.m3111();
                c1489.m3155(abstractC39511);
                c1489.m3149(abstractC39511, iM3113);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                c1489.m3102();
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C1350 c1350 = (C1350) abstractC3959;
                c1489.m3102();
                int iM3114 = c1489.m3111();
                c1489.m3155(c1350);
                ((C5008) c1489.f5057).m8423(AbstractC4225.f14013, Integer.valueOf(c1350.f4640));
                c1489.m3149(c1350, iM3114);
                c1489.m3142(c1350);
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C4839 c4839 = (C4839) abstractC3959;
                int iM3115 = c1489.m3111();
                c1489.m3155(c4839);
                ((C5008) c1489.f5057).m8423(AbstractC4225.f14018, c4839.f15944);
                c1489.m3149(c4839, iM3115);
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((C2658) c1489.f5058).m4967(' ');
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC3959 abstractC39512 = (C3157) abstractC3959;
                int iM3116 = c1489.m3111();
                c1489.m3155(abstractC39512);
                c1489.m3149(abstractC39512, iM3116);
                break;
            case 8:
                AbstractC3959 abstractC39513 = (C3273) abstractC3959;
                c1489.m3102();
                int iM3117 = c1489.m3111();
                ((C2658) c1489.f5058).m4967((char) 160);
                c1489.m3149(abstractC39513, iM3117);
                c1489.m3142(abstractC39513);
                break;
            case 9:
                AbstractC3959 abstractC39514 = (C2946) abstractC3959;
                int iM3118 = c1489.m3111();
                C2658 c2659 = (C2658) c1489.f5058;
                c2659.m4967((char) 160);
                c1489.m3155(abstractC39514);
                c2659.m4967((char) 160);
                c1489.m3149(abstractC39514, iM3118);
                break;
            case 10:
                C4456 c4456 = (C4456) abstractC3959;
                C1783.m3570(c1489, c4456.f14697, c4456.f14699, c4456);
                break;
            case 11:
                C3811 c3811 = (C3811) abstractC3959;
                C1783.m3570(c1489, null, c3811.f12639, c3811);
                break;
            case 12:
                AbstractC3959 abstractC39515 = (C1011) abstractC3959;
                C0220 c0220 = AbstractC4225.f14010;
                C5008 c5008 = (C5008) c1489.f5057;
                int iM3119 = c1489.m3111();
                c1489.m3155(abstractC39515);
                AbstractC5360 abstractC5360 = (AbstractC5360) ((AbstractC3959) abstractC39515.f13235);
                if (abstractC5360 instanceof C0674) {
                    C0674 c0674 = (C0674) abstractC5360;
                    int i2 = c0674.f2473;
                    c5008.m8423(c0220, EnumC0424.f1535);
                    c5008.m8423(AbstractC4225.f14020, Integer.valueOf(i2));
                    c0674.f2473++;
                } else {
                    c5008.m8423(c0220, EnumC0424.f1536);
                    C0220 c0221 = AbstractC4225.f14011;
                    for (AbstractC3959 abstractC3959Mo7112 = (AbstractC5360) ((AbstractC3959) abstractC39515.f13235); abstractC3959Mo7112 != null; abstractC3959Mo7112 = abstractC3959Mo7112.mo7112()) {
                        if (abstractC3959Mo7112 instanceof C1011) {
                            i++;
                        }
                    }
                    c5008.m8423(c0221, Integer.valueOf(i));
                }
                c1489.m3149(abstractC39515, iM3119);
                if (((AbstractC3959) abstractC39515.f13234) != null) {
                    c1489.m3102();
                }
                break;
            case 13:
                AbstractC3959 abstractC39516 = (C3343) abstractC3959;
                AbstractC5360 abstractC5361 = (AbstractC5360) ((AbstractC3959) abstractC39516.f13235);
                if (abstractC5361 != null) {
                    AbstractC5360 abstractC5362 = (AbstractC5360) ((AbstractC3959) abstractC5361.f13235);
                    if (abstractC5362 instanceof AbstractC0123) {
                        z = ((AbstractC0123) abstractC5362).f481;
                    }
                }
                if (!z) {
                    c1489.m3102();
                }
                int iM31110 = c1489.m3111();
                c1489.m3155(abstractC39516);
                ((C5008) c1489.f5057).m8423(AbstractC4225.f14017, Boolean.valueOf(z));
                c1489.m3149(abstractC39516, iM31110);
                if (!z) {
                    c1489.m3142(abstractC39516);
                }
                break;
            case 14:
                c1489.m3102();
                int iM31111 = c1489.m3111();
                c1489.m3155(abstractC3959);
                c1489.m3149(abstractC3959, iM31111);
                c1489.m3142(abstractC3959);
                break;
            case 15:
                c1489.m3102();
                break;
            case 16:
                AbstractC3959 abstractC39517 = (C1876) abstractC3959;
                int iM31112 = c1489.m3111();
                c1489.m3155(abstractC39517);
                c1489.m3149(abstractC39517, iM31112);
                break;
            case 17:
                AbstractC3959 abstractC39518 = (C3702) abstractC3959;
                c1489.m3102();
                int iM31113 = c1489.m3111();
                c1489.m3155(abstractC39518);
                c1489.m3171(iM31113, new C3583());
                c1489.m3142(abstractC39518);
                break;
            default:
                C0986 c0986 = (C0986) abstractC3959;
                int iM31114 = c1489.m3111();
                c1489.m3155(c0986);
                C0220 c0222 = AbstractC0487.f1776;
                C5008 c5009 = (C5008) c1489.f5057;
                c5009.m8423(c0222, Boolean.valueOf(c0986.f3479));
                C2711 c2711 = (C2711) c1489.f5059;
                InterfaceC1652 interfaceC1652M5748 = ((C3121) c2711.f8983).m5748(C0986.class);
                if (interfaceC1652M5748 != null) {
                    c1489.m3171(iM31114, interfaceC1652M5748.mo3440(c2711, c5009));
                    if (((AbstractC3959) c0986.f13234) != null) {
                        c1489.m3102();
                    }
                } else {
                    C0178.m387(C0986.class.getName());
                }
                break;
        }
    }

    public /* synthetic */ C4172(C1783 c1783, int i) {
        this.f13896 = i;
    }
}
