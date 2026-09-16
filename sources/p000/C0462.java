package p000;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: ۥؕؓۨ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0462 implements InterfaceC4161 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f1677;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1678;

    public /* synthetic */ C0462(int i, Object obj) {
        this.f1678 = i;
        this.f1677 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    @Override // p000.InterfaceC4161
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo978(Object obj, InterfaceC0443 interfaceC0443) throws Throwable {
        C0794 c0794;
        Object objM7760;
        int i = this.f1678;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f1677;
        switch (i) {
            case 0:
                C5002 c5002 = (C5002) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    c5002.m8400().startStylusHandwriting((View) c5002.f16551);
                }
                return c2358;
            case 1:
                InterfaceC2714 interfaceC2714 = (InterfaceC2714) obj;
                C1347 c1347 = (C1347) obj2;
                if (interfaceC2714 instanceof C0266) {
                    c1347.add(interfaceC2714);
                } else if (interfaceC2714 instanceof C5116) {
                    c1347.remove(((C5116) interfaceC2714).f16964);
                } else if (interfaceC2714 instanceof C3213) {
                    c1347.add(interfaceC2714);
                } else if (interfaceC2714 instanceof C4315) {
                    c1347.remove(((C4315) interfaceC2714).f14262);
                } else if (interfaceC2714 instanceof C3656) {
                    c1347.add(interfaceC2714);
                } else if (interfaceC2714 instanceof C0694) {
                    c1347.remove(((C0694) interfaceC2714).f2524);
                } else if (interfaceC2714 instanceof C0199) {
                    c1347.remove(((C0199) interfaceC2714).f731);
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC0443 instanceof C0794) {
                    c0794 = (C0794) interfaceC0443;
                    int i2 = c0794.f2858;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0794.f2858 = i2 - Integer.MIN_VALUE;
                    } else {
                        c0794 = new C0794(this, interfaceC0443);
                    }
                } else {
                    c0794 = new C0794(this, interfaceC0443);
                }
                Object obj3 = c0794.f2859;
                int i3 = c0794.f2858;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj3);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj3);
                InterfaceC4161 interfaceC4161 = (InterfaceC4161) obj2;
                AbstractC1996 abstractC1996 = (AbstractC1996) obj;
                if (abstractC1996 instanceof C0933) {
                    throw ((C0933) abstractC1996).f3323;
                }
                if (!(abstractC1996 instanceof C4127)) {
                    if (abstractC1996 instanceof C4027 ? true : abstractC1996 instanceof C2469) {
                        C1078.m2276("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        C1078.m2275();
                    }
                    return null;
                }
                Object obj4 = ((C4127) abstractC1996).f13747;
                c0794.f2858 = 1;
                if (interfaceC4161.mo978(obj4, c0794) == enumC2282) {
                    return enumC2282;
                }
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C4482 c4482 = (C4482) obj2;
                return ((c4482.f14796.m8693() instanceof C4027) || (objM7760 = c4482.m7760(true, interfaceC0443)) != enumC2282) ? c2358 : objM7760;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((C1673) obj2).f5575.m1710(((Number) obj).floatValue());
                return c2358;
            default:
                C1109 c1109 = (C1109) obj;
                C0909 c0909 = (C0909) obj2;
                c0909.f3265 = c1109;
                if (c0909.f3268) {
                    c0909.f3268 = false;
                    c0909.m1891();
                }
                Object objM1890 = c0909.m1890(c1109.f3899.f5162, EnumC4779.f15765, interfaceC0443);
                return objM1890 == enumC2282 ? objM1890 : c2358;
        }
    }
}
