package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: ۦؚٓؓٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4117 extends AbstractC2426 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f13721;

    /* JADX INFO: renamed from: ۥٖ */
    public int f13722;

    /* JADX INFO: renamed from: ۦٗ */
    public Object f13723;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f13724;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4117(Object obj, Object obj2, InterfaceC0443 interfaceC0443, int i) {
        super(1, interfaceC0443);
        this.f13721 = i;
        this.f13723 = obj;
        this.f13724 = obj2;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        C2048 c2048;
        Throwable th;
        AbstractC1996 c0933;
        int i = this.f13721;
        int i2 = 2;
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        Object obj2 = this.f13724;
        InterfaceC0443 interfaceC0443 = null;
        switch (i) {
            case 0:
                int i3 = this.f13722;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C4536 c4536 = (C4536) this.f13723;
                C1907 c1907 = new C1907(c4536, i2);
                C0061 c0061 = new C0061((InterfaceC2609) obj2, c4536, interfaceC0443, 3);
                this.f13722 = 1;
                return C3133.m5777(c1907, c0061, this) == enumC2282 ? enumC2282 : c2358;
            case 1:
                C3738 c3738 = (C3738) this.f13723;
                C5389 c5389 = c3738.f12445;
                View view = c3738.f12449;
                int i4 = this.f13722;
                int i5 = 4;
                try {
                    if (i4 == 0) {
                        AbstractC0186.m409(obj);
                        C4938 c4938 = new C4938();
                        InterfaceC3320 interfaceC3320 = (InterfaceC3320) obj2;
                        int i6 = 0;
                        C2048 c2049 = new C2048(c4938, new C1004(c3738, interfaceC3320, 0), new C1004(c3738, interfaceC3320, 1), view);
                        InterfaceC4745 interfaceC4745 = c3738.f12447;
                        if (interfaceC4745 != null && (c2048 = (C2048) interfaceC4745.mo211(c2049)) != null) {
                            c2049 = c2048;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                            RunnableC3599 runnableC3599 = c3738.f12452;
                            if (runnableC3599 == null) {
                                runnableC3599 = new RunnableC3599(c3738, c2049, c4938, i6);
                                c3738.f12452 = runnableC3599;
                            }
                            view.post(runnableC3599);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new ActionModeCallbackC1175(c2049), 1);
                            if (actionModeStartActionMode == null) {
                                return c2358;
                            }
                            c3738.f12448 = actionModeStartActionMode;
                        }
                        this.f13722 = 1;
                        Object objMo5598 = c4938.f16358.mo5598(this);
                        if (objMo5598 != enumC2282) {
                            objMo5598 = c2358;
                        }
                        if (objMo5598 == enumC2282) {
                            return enumC2282;
                        }
                    } else {
                        if (i4 != 1) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(obj);
                    }
                    c5389.m9079();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable runnableC0029 = c3738.f12451;
                        if (runnableC0029 == null) {
                            runnableC0029 = new RunnableC0029(i5, c3738);
                            c3738.f12451 = runnableC0029;
                        }
                        view.post(runnableC0029);
                    } else {
                        ActionMode actionMode = c3738.f12448;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    RunnableC3599 runnableC35910 = c3738.f12452;
                    if (runnableC35910 != null) {
                        view.removeCallbacks(runnableC35910);
                    }
                    c3738.f12448 = null;
                    return c2358;
                } catch (Throwable th2) {
                    c5389.m9079();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable runnableC00210 = c3738.f12451;
                        if (runnableC00210 == null) {
                            runnableC00210 = new RunnableC0029(i5, c3738);
                            c3738.f12451 = runnableC00210;
                        }
                        view.post(runnableC00210);
                    } else {
                        ActionMode actionMode2 = c3738.f12448;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    RunnableC3599 runnableC35911 = c3738.f12452;
                    if (runnableC35911 != null) {
                        view.removeCallbacks(runnableC35911);
                    }
                    c3738.f12448 = null;
                    throw th2;
                }
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0843 c0843 = (C0843) obj2;
                C4852 c4852 = ((C4817) this.f13723).f15877;
                int i7 = this.f13722;
                try {
                    if (i7 == 0) {
                        AbstractC0186.m409(obj);
                        c4852.setValue(c0843);
                        this.f13722 = 1;
                        Object objMo5599 = c0843.f3011.mo5598(this);
                        if (objMo5599 != enumC2282) {
                            objMo5599 = c2358;
                        }
                        if (objMo5599 == enumC2282) {
                            return enumC2282;
                        }
                    } else {
                        if (i7 != 1) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(obj);
                    }
                    c4852.setValue(null);
                    return c2358;
                } catch (Throwable th3) {
                    c4852.setValue(null);
                    throw th3;
                }
            default:
                C4482 c4482 = (C4482) obj2;
                int i8 = this.f13722;
                try {
                    if (i8 == 0) {
                        AbstractC0186.m409(obj);
                        this.f13722 = 1;
                        obj = c4482.m7763(true, this);
                        if (obj == enumC2282) {
                            return enumC2282;
                        }
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) this.f13723;
                            AbstractC0186.m409(obj);
                            c0933 = new C0933(((Number) obj).intValue(), th);
                            return new C3869(c0933, Boolean.TRUE);
                        }
                        AbstractC0186.m409(obj);
                    }
                    c0933 = (AbstractC1996) obj;
                    break;
                } catch (Throwable th4) {
                    InterfaceC5823 interfaceC5823M7761 = c4482.m7761();
                    this.f13723 = th4;
                    this.f13722 = 2;
                    Object objMo5825 = interfaceC5823M7761.mo5825(this);
                    if (objMo5825 == enumC2282) {
                        return enumC2282;
                    }
                    obj = objMo5825;
                    th = th4;
                }
                return new C3869(c0933, Boolean.TRUE);
        }
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f13721;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f13724;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj;
        switch (i) {
            case 0:
                return new C4117((C4536) this.f13723, (InterfaceC2609) obj2, interfaceC0443, 0).mo218(c2358);
            case 1:
                return new C4117((C3738) this.f13723, (InterfaceC3320) obj2, interfaceC0443, 1).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C4117((C4817) this.f13723, (C0843) obj2, interfaceC0443, 2).mo218(c2358);
            default:
                return new C4117((C4482) obj2, interfaceC0443).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4117(C4482 c4482, InterfaceC0443 interfaceC0443) {
        super(1, interfaceC0443);
        this.f13721 = 3;
        this.f13724 = c4482;
    }
}
