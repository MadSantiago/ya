package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۦۦًؙؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5752 extends AbstractC2989 implements InterfaceC4883, InterfaceC0465 {

    /* JADX INFO: renamed from: ۥٓ */
    public AbstractC0386 f18969;

    @Override // p000.AbstractC2989
    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC4489.m7777(this));
        sb.append("[job@");
        AbstractC0386 abstractC0386 = this.f18969;
        if (abstractC0386 == null) {
            abstractC0386 = null;
        }
        sb.append(AbstractC4489.m7777(abstractC0386));
        sb.append(']');
        return sb.toString();
    }

    @Override // p000.InterfaceC0465
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo981() {
        return true;
    }

    @Override // p000.InterfaceC4883
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1376() {
        AbstractC5752 abstractC5752;
        Unsafe unsafe;
        long j;
        AbstractC0386 abstractC0386 = this.f18969;
        if (abstractC0386 == null) {
            abstractC0386 = null;
        }
        AbstractC0386 abstractC0387 = abstractC0386;
        while (true) {
            Object objM890 = abstractC0387.m890();
            if (objM890 instanceof AbstractC5752) {
                if (objM890 != this) {
                    return;
                }
                C1017 c1017 = AbstractC5378.f17767;
                do {
                    unsafe = AbstractC3456.f11473;
                    j = AbstractC0386.f1442;
                    if (unsafe.compareAndSwapObject(abstractC0387, j, objM890, c1017)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(abstractC0387, j) == objM890);
            } else {
                if (!(objM890 instanceof InterfaceC0465) || ((InterfaceC0465) objM890).mo982() == null) {
                    return;
                }
                while (true) {
                    Object objM5578 = this.m5578();
                    if (objM5578 instanceof C4415) {
                        return;
                    }
                    if (objM5578 == this) {
                        return;
                    }
                    AbstractC2989 abstractC2989 = (AbstractC2989) objM5578;
                    abstractC2989.getClass();
                    Unsafe unsafe2 = AbstractC3456.f11473;
                    long j2 = AbstractC2989.f10050;
                    C4415 c4415 = (C4415) unsafe2.getObjectVolatile(abstractC2989, j2);
                    if (c4415 == null) {
                        c4415 = new C4415(abstractC2989);
                        unsafe2.putObjectVolatile(abstractC2989, j2, c4415);
                    }
                    C4415 c4416 = c4415;
                    while (true) {
                        Unsafe unsafe3 = AbstractC3456.f11473;
                        long j3 = AbstractC2989.f10052;
                        abstractC5752 = this;
                        if (unsafe3.compareAndSwapObject(abstractC5752, j3, objM5578, c4416)) {
                            abstractC2989.m5577();
                            return;
                        } else if (unsafe3.getObjectVolatile(abstractC5752, j3) != objM5578) {
                            break;
                        } else {
                            this = abstractC5752;
                        }
                    }
                    this = abstractC5752;
                }
            }
        }
    }

    @Override // p000.InterfaceC0465
    /* JADX INFO: renamed from: ۦؑ */
    public final C5835 mo982() {
        return null;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public abstract boolean mo922();

    /* JADX INFO: renamed from: ۦٌ */
    public abstract void mo923(Throwable th);
}
