package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦۢؖۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5549 extends AbstractRunnableC4045 {

    /* JADX INFO: renamed from: ۥْ */
    public int f18326;

    public AbstractC5549(int i) {
        super(0L, false);
        this.f18326 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C4437 c4437 = (C4437) mo4897();
            AbstractC0772 abstractC0772 = c4437.f14626;
            Object obj = c4437.f14629;
            InterfaceC3534 interfaceC3534Mo334 = abstractC0772.mo334();
            Object objM5152 = AbstractC2765.m5152(interfaceC3534Mo334, obj);
            InterfaceC3196 interfaceC3196 = null;
            C5278 c5278M5193 = objM5152 != AbstractC2765.f9155 ? AbstractC2774.m5193(abstractC0772, interfaceC3534Mo334, objM5152) : null;
            try {
                InterfaceC3534 interfaceC3534Mo335 = abstractC0772.mo334();
                Object objMo4906 = mo4906();
                Throwable thMo4911 = mo4911(objMo4906);
                if (thMo4911 == null) {
                    int i = this.f18326;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC3196 = (InterfaceC3196) interfaceC3534Mo335.mo865(C1397.f4791);
                    }
                }
                if (interfaceC3196 != null && !interfaceC3196.mo866()) {
                    CancellationException cancellationExceptionMo862 = interfaceC3196.mo862();
                    mo4904(cancellationExceptionMo862);
                    abstractC0772.mo335(new C4535(cancellationExceptionMo862));
                } else if (thMo4911 != null) {
                    abstractC0772.mo335(new C4535(thMo4911));
                } else {
                    abstractC0772.mo335(mo4905(objMo4906));
                }
            } finally {
                if (c5278M5193 == null || c5278M5193.m8915()) {
                    AbstractC2765.m5121(interfaceC3534Mo334, objM5152);
                }
            }
        } catch (C0768 e) {
            AbstractC1605.m3338(mo4897().mo334(), e.f2784);
        } catch (Throwable th) {
            m9277(th);
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract InterfaceC0443 mo4897();

    /* JADX INFO: renamed from: ۦؚ */
    public abstract Object mo4906();

    /* JADX INFO: renamed from: ۦۗ */
    public final void m9277(Throwable th) {
        AbstractC1605.m3338(mo4897().mo334(), new C3060("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public Throwable mo4911(Object obj) {
        C5036 c5036 = obj instanceof C5036 ? (C5036) obj : null;
        if (c5036 != null) {
            return c5036.f16702;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void mo4904(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: ۥۜ */
    public Object mo4905(Object obj) {
        return obj;
    }
}
