package p000;

/* JADX INFO: renamed from: ۥٝ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0031 extends AbstractC0386 implements InterfaceC0443, InterfaceC4643 {

    /* JADX INFO: renamed from: ۥْ */
    public final InterfaceC3534 f6194;

    public AbstractC0031(InterfaceC3534 interfaceC3534, boolean z) {
        super(z);
        m872((InterfaceC3196) interfaceC3534.mo865(C1397.f4791));
        this.f6194 = interfaceC3534.mo860(this);
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۥؖ */
    public final String mo852() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 mo334() {
        return this.f6194;
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥّ */
    public final void mo335(Object obj) {
        Throwable thM405 = AbstractC0183.m405(obj);
        if (thM405 != null) {
            obj = new C5036(thM405, false);
        }
        Object objM853 = m853(obj);
        if (objM853 == AbstractC5378.f17763) {
            return;
        }
        mo888(objM853);
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۥٛ */
    public final void mo863(C1228 c1228) {
        AbstractC1605.m3338(this.f6194, c1228);
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۥۨ */
    public final void mo876(Object obj) {
        if (!(obj instanceof C5036)) {
            mo3705(obj);
        } else {
            C5036 c5036 = (C5036) obj;
            mo3706(c5036.f16702, AbstractC3456.f11473.getIntVolatile(c5036, C5036.f16701) == 1);
        }
    }

    /* JADX INFO: renamed from: ۦٟ */
    public final void m3707(int i, AbstractC0031 abstractC0031, InterfaceC5731 interfaceC5731) throws Throwable {
        Object objMo219;
        int iM6632 = AbstractC3761.m6632(i);
        C2358 c2358 = C2358.f7817;
        if (iM6632 == 0) {
            try {
                AbstractC5378.m9066(AbstractC2776.m5232(AbstractC2776.m5246(abstractC0031, this, interfaceC5731)), c2358);
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof C0768) {
                    th = ((C0768) th).f2784;
                }
                mo335(new C4535(th));
                throw th;
            }
        }
        if (iM6632 != 1) {
            if (iM6632 == 2) {
                AbstractC2776.m5232(AbstractC2776.m5246(abstractC0031, this, interfaceC5731)).mo335(c2358);
                return;
            }
            if (iM6632 != 3) {
                C1078.m2275();
                return;
            }
            try {
                InterfaceC3534 interfaceC3534 = this.f6194;
                Object objM5152 = AbstractC2765.m5152(interfaceC3534, null);
                try {
                    if (interfaceC5731 instanceof AbstractC2870) {
                        AbstractC3801.m6782(2, interfaceC5731);
                        objMo219 = interfaceC5731.mo219(abstractC0031, this);
                    } else {
                        InterfaceC3534 interfaceC3534Mo334 = mo334();
                        Object c2967 = interfaceC3534Mo334 == C4794.f15814 ? new C2967(this) : new C1315(this, interfaceC3534Mo334);
                        AbstractC3801.m6782(2, interfaceC5731);
                        objMo219 = interfaceC5731.mo219(abstractC0031, c2967);
                    }
                    AbstractC2765.m5121(interfaceC3534, objM5152);
                    if (objMo219 != EnumC2282.f7590) {
                        mo335(objMo219);
                    }
                } catch (Throwable th2) {
                    AbstractC2765.m5121(interfaceC3534, objM5152);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof C0768) {
                    th = ((C0768) th).f2784;
                }
                mo335(new C4535(th));
            }
        }
    }

    @Override // p000.InterfaceC4643
    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC3534 mo1586() {
        return this.f6194;
    }

    /* JADX INFO: renamed from: ۥٞ */
    public void mo3705(Object obj) {
    }

    /* JADX INFO: renamed from: ۦٞ */
    public void mo3706(Throwable th, boolean z) {
    }
}
