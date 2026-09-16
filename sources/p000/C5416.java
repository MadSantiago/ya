package p000;

import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۦ۠ؖۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5416 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f17876;

    /* JADX INFO: renamed from: ۥٖ */
    public int f17877;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ Object f17878;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f17879;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f17880;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5416(Object obj, Object obj2, Object obj3, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f17876 = i;
        this.f17879 = obj;
        this.f17880 = obj2;
        this.f17878 = obj3;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f17876;
        Object obj2 = this.f17878;
        Object obj3 = this.f17880;
        switch (i) {
            case 0:
                C5416 c5416 = new C5416((InterfaceC3534) obj3, (InterfaceC4707) obj2, interfaceC0443, 0);
                c5416.f17879 = obj;
                return c5416;
            case 1:
                return new C5416((C2695) this.f17879, (C3821) obj3, (C3536) obj2, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5416 c5417 = new C5416((InterfaceC3196) obj3, (InterfaceC5731) obj2, interfaceC0443, 2);
                c5417.f17879 = obj;
                return c5417;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C5416((C0625) obj3, (InterfaceC0884) obj2, interfaceC0443, 3);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C5416((C2391) this.f17879, (C4142) obj3, (InterfaceC3116) obj2, interfaceC0443, 4);
            default:
                return new C5416((C5789) this.f17879, (Worker) obj3, (C3114) obj2, interfaceC0443, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0179  */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) throws Throwable {
        InterfaceC4643 interfaceC4643;
        C3742 c3742;
        Object objM5144;
        int i = this.f17876;
        Object obj2 = C2358.f7817;
        Object obj3 = this.f17878;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        Object obj4 = this.f17880;
        InterfaceC0443 interfaceC0443 = null;
        switch (i) {
            case 0:
                InterfaceC4707 interfaceC4707 = (InterfaceC4707) obj3;
                InterfaceC3534 interfaceC3534 = (InterfaceC3534) obj4;
                int i2 = this.f17877;
                if (i2 != 0) {
                    if (i2 == 1 || i2 == 2) {
                        AbstractC0186.m409(obj);
                        return obj2;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C5305 c5305 = (C5305) this.f17879;
                if (AbstractC3831.m6874(interfaceC3534, C4794.f15814)) {
                    C0677 c0677 = new C0677(c5305, 0);
                    this.f17877 = 1;
                    if (interfaceC4707.mo1575(c0677, this) != enumC2282) {
                        return obj2;
                    }
                } else {
                    C5030 c5030 = new C5030(interfaceC4707, c5305, interfaceC0443, 18);
                    this.f17877 = 2;
                    if (AbstractC2765.m5144(interfaceC3534, c5030, this) != enumC2282) {
                        return obj2;
                    }
                }
                return enumC2282;
            case 1:
                int i3 = this.f17877;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return obj2;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C2695 c2695 = (C2695) this.f17879;
                long j = ((C3536) obj3).f11726;
                this.f17877 = 1;
                C2695 c2696 = new C2695(c2695.f8943, c2695.f8940, c2695.f8941, this);
                c2696.f8939 = (C3821) obj4;
                c2696.f8942 = j;
                return c2696.mo218(obj2) == enumC2282 ? enumC2282 : obj2;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.f17877;
                if (i4 == 0) {
                    AbstractC0186.m409(obj);
                    interfaceC4643 = (InterfaceC4643) this.f17879;
                    this.f17879 = interfaceC4643;
                    this.f17877 = 1;
                    if (((InterfaceC3196) obj4).mo861(this) != enumC2282) {
                    }
                    return enumC2282;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        AbstractC0186.m409(obj);
                        return obj2;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC4643 = (InterfaceC4643) this.f17879;
                AbstractC0186.m409(obj);
                this.f17879 = null;
                this.f17877 = 2;
                if (((InterfaceC5731) obj3).mo219(interfaceC4643, this) != enumC2282) {
                    return obj2;
                }
                return enumC2282;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C0625 c0625 = (C0625) obj4;
                int i5 = this.f17877;
                try {
                    if (i5 == 0) {
                        AbstractC0186.m409(obj);
                        C4846 c4846 = c0625.f2316;
                        if (c4846 != null) {
                            this.f17877 = 1;
                            if (c4846.mo211(this) == enumC2282) {
                            }
                        }
                        return enumC2282;
                    }
                    if (i5 == 1) {
                        AbstractC0186.m409(obj);
                    } else {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                AbstractC0186.m409(obj);
                                return obj2;
                            }
                            if (i5 != 4) {
                                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) this.f17879;
                            AbstractC0186.m409(obj);
                            throw th;
                        }
                        AbstractC0186.m409(obj);
                    }
                    c3742 = c0625.f2320;
                    if (c3742 != null) {
                        return obj2;
                    }
                    this.f17877 = 3;
                    c3742.mo211(this);
                    if (obj2 != enumC2282) {
                        return obj2;
                    }
                    return enumC2282;
                    this.f17877 = 2;
                    if (((InterfaceC0884) obj3).mo1878(c0625, this) != enumC2282) {
                        c3742 = c0625.f2320;
                        if (c3742 != null) {
                            return obj2;
                        }
                        this.f17877 = 3;
                        c3742.mo211(this);
                        if (obj2 != enumC2282) {
                            return obj2;
                        }
                    }
                } catch (Throwable th2) {
                    C3742 c3743 = c0625.f2320;
                    if (c3743 == null) {
                        throw th2;
                    }
                    this.f17879 = th2;
                    this.f17877 = 4;
                    c3743.mo211(this);
                    if (obj2 != enumC2282) {
                        throw th2;
                    }
                }
                return enumC2282;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C4142 c4142 = (C4142) obj4;
                int i6 = this.f17877;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC0186.m409(obj);
                        return obj2;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                List list = (List) ((C2391) this.f17879).f7924;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (((InterfaceC5721) obj5).mo1303(c4142)) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((InterfaceC5721) it.next()).mo1716(c4142.f13791));
                }
                InterfaceC4707 interfaceC4707M5805 = C3133.m5805(new C0710(2, (InterfaceC4707[]) AbstractC0973.m2039(arrayList2).toArray(new InterfaceC4707[0])));
                C5803 c5803 = new C5803(9, (InterfaceC3116) obj3, c4142);
                this.f17877 = 1;
                return interfaceC4707M5805.mo1575(c5803, this) == enumC2282 ? enumC2282 : obj2;
            default:
                Worker worker = (Worker) obj4;
                C5789 c5789 = (C5789) this.f17879;
                C4142 c4143 = c5789.f19075;
                int i7 = this.f17877;
                if (i7 == 0) {
                    AbstractC0186.m409(obj);
                    Context context = c5789.f19073;
                    C3114 c3114 = (C3114) obj3;
                    C1489 c1489 = c5789.f19076;
                    this.f17877 = 1;
                    String str = AbstractC0653.f2432;
                    if (c4143.f13780 && Build.VERSION.SDK_INT < 31 && (objM5144 = AbstractC2765.m5144(AbstractC4489.m7819((ExecutorC0170) c1489.f5056), new C1734(worker, c4143, c3114, context, null, 12), this)) == enumC2282) {
                        obj2 = objM5144;
                    }
                    if (obj2 != enumC2282) {
                    }
                    return enumC2282;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        AbstractC0186.m409(obj);
                        return obj;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                String str2 = AbstractC1537.f5202;
                C1984.m3874().m3878(str2, "Starting work for " + c4143.f13776);
                C4995 c4995M6774 = AbstractC3801.m6774(new C5017(9, worker.f244.f247, new C0463(17, worker)));
                this.f17877 = 2;
                Object objM3268 = AbstractC1537.m3268(c4995M6774, worker, this);
                if (objM3268 != enumC2282) {
                    return objM3268;
                }
                return enumC2282;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f17876;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C5416) mo217((InterfaceC0443) obj2, (C5305) obj)).mo218(c2358);
            case 1:
                return ((C5416) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C5416) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C5416) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return ((C5416) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                return ((C5416) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5416(Object obj, Object obj2, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f17876 = i;
        this.f17880 = obj;
        this.f17878 = obj2;
    }
}
