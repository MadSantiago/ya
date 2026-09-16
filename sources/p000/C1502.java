package p000;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۥٕٗؑٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1502 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f5107;

    /* JADX INFO: renamed from: ۥٖ */
    public int f5108;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C5789 f5109;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1502(C5789 c5789, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f5107 = i;
        this.f5109 = c5789;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f5107;
        C5789 c5789 = this.f5109;
        switch (i) {
            case 0:
                return new C1502(c5789, interfaceC0443, 0);
            default:
                return new C1502(c5789, interfaceC0443, 1);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        final AbstractC4756 c2524;
        int i = this.f5107;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        final C5789 c5789 = this.f5109;
        InterfaceC0443 interfaceC0443 = null;
        switch (i) {
            case 0:
                int i2 = this.f5108;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    this.f5108 = 1;
                    Object objM9603 = c5789.m9603(this);
                    return objM9603 == enumC2282 ? enumC2282 : objM9603;
                }
                if (i2 == 1) {
                    AbstractC0186.m409(obj);
                    return obj;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f5108;
                try {
                    if (i3 == 0) {
                        AbstractC0186.m409(obj);
                        C3841 c3841 = c5789.f19077;
                        C1502 c1502 = new C1502(c5789, interfaceC0443, 0);
                        this.f5108 = 1;
                        obj = AbstractC2765.m5144(c3841, c1502, this);
                        if (obj == enumC2282) {
                            return enumC2282;
                        }
                    } else {
                        if (i3 != 1) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(obj);
                    }
                    c2524 = (AbstractC4756) obj;
                    break;
                } catch (C5771 e) {
                    c2524 = new C5868(e.f19022);
                } catch (CancellationException unused) {
                    c2524 = new C2524();
                } catch (Throwable th) {
                    C1984.m3874().m3879(AbstractC1537.f5202, "Unexpected error in WorkerWrapper", th);
                    c2524 = new C2524();
                }
                return c5789.f19081.m105(new Callable() { // from class: ۦَِۤ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C5789 c57810 = c5789;
                        C4142 c4142 = c57810.f19075;
                        String str = c57810.f19070;
                        C0177 c0177 = c57810.f19074;
                        AbstractC4756 abstractC4756 = c2524;
                        boolean z = abstractC4756 instanceof C5192;
                        EnumC4972 enumC4972 = EnumC4972.f16455;
                        boolean z2 = true;
                        boolean z3 = false;
                        if (z) {
                            AbstractC0527 c3297 = ((C5192) abstractC4756).f17175;
                            EnumC4972 enumC4972M379 = c0177.m379(str);
                            WorkDatabase workDatabase = c0177.f663;
                            AbstractC0487.m1075(c57810.f19081.mo98().f11586, false, true, new C3203(10, str));
                            if (enumC4972M379 != null) {
                                if (enumC4972M379 == EnumC4972.f16454) {
                                    String str2 = c57810.f19080;
                                    if (c3297 instanceof C2972) {
                                        C1984.m3874().m3883(AbstractC1537.f5202, "Worker result SUCCESS for ".concat(str2));
                                        if (c4142.m7323()) {
                                            c57810.m9604();
                                        } else {
                                            c0177.m376(EnumC4972.f16450, str);
                                            AbstractC0487.m1075(workDatabase, false, true, new C1708(23, ((C2972) c3297).f9959, str));
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            C1894 c1894 = c57810.f19079;
                                            for (String str3 : c1894.m3746(str)) {
                                                if (c0177.m379(str3) == EnumC4972.f16449 && ((Boolean) AbstractC0487.m1075(c1894.f6278, true, false, new C3203(4, str3))).booleanValue()) {
                                                    C1984.m3874().m3883(AbstractC1537.f5202, "Setting status to enqueued for ".concat(str3));
                                                    c0177.m376(enumC4972, str3);
                                                    AbstractC0487.m1075(workDatabase, false, true, new C2066(1, jCurrentTimeMillis, str3));
                                                }
                                            }
                                        }
                                    } else {
                                        C1984.m3874().m3883(AbstractC1537.f5202, "Worker result FAILURE for ".concat(str2));
                                        if (c4142.m7323()) {
                                            c57810.m9604();
                                        } else {
                                            if (c3297 == null) {
                                                c3297 = new C3297();
                                            }
                                            c57810.m9606(c3297);
                                        }
                                    }
                                } else if (!enumC4972M379.m8357()) {
                                    c57810.m9605(-512);
                                }
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            z3 = z2;
                        } else if (abstractC4756 instanceof C2524) {
                            c57810.m9606(((C2524) abstractC4756).f8360);
                        } else {
                            if (!(abstractC4756 instanceof C5868)) {
                                C1078.m2275();
                                return null;
                            }
                            int i4 = ((C5868) abstractC4756).f19380;
                            if (AbstractC3831.m6874(c4142.f13783, Boolean.TRUE)) {
                                String str4 = AbstractC1537.f5202;
                                C1984.m3874().m3878(str4, "Worker " + c4142.f13776 + " was interrupted. Backing off.");
                                c57810.m9605(i4);
                            } else {
                                EnumC4972 enumC4972M3710 = c0177.m379(str);
                                if (enumC4972M3710 == null || enumC4972M3710.m8357()) {
                                    String str5 = AbstractC1537.f5202;
                                    C1984.m3874().m3878(str5, "Status for " + str + " is " + enumC4972M3710 + " ; not doing any work");
                                    z2 = false;
                                } else {
                                    String str6 = AbstractC1537.f5202;
                                    C1984.m3874().m3878(str6, "Status for " + str + " is " + enumC4972M3710 + "; not doing any work and rescheduling for later execution");
                                    c0177.m376(enumC4972, str);
                                    c0177.m377(i4, str);
                                    c0177.m380(-1L, str);
                                }
                            }
                            z3 = z2;
                        }
                        return Boolean.valueOf(z3);
                    }
                });
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f5107;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C1502) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
