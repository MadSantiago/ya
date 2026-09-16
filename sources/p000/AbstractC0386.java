package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ۥؔؒۨۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0386 implements InterfaceC3196 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ long f1442;

    /* JADX INFO: renamed from: ۦۨ */
    public static final /* synthetic */ long f1443;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = AbstractC3456.f11473;
        f1442 = unsafe.objectFieldOffset(AbstractC0386.class.getDeclaredField("_state$volatile"));
        f1443 = unsafe.objectFieldOffset(AbstractC0386.class.getDeclaredField("_parentHandle$volatile"));
    }

    public AbstractC0386(boolean z) {
        this._state$volatile = z ? AbstractC5378.f17767 : AbstractC5378.f17766;
    }

    /* JADX INFO: renamed from: ۥۢ */
    public static String m848(Object obj) {
        if (!(obj instanceof C2610)) {
            if (obj instanceof InterfaceC0465) {
                return ((InterfaceC0465) obj).mo981() ? "Active" : "New";
            }
            return obj instanceof C5036 ? "Cancelled" : "Completed";
        }
        C2610 c2610 = (C2610) obj;
        if (c2610.m4917()) {
            return "Cancelling";
        }
        return c2610.m4918() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: ۦۧ */
    public static C1866 m849(AbstractC2989 abstractC2989) {
        while (abstractC2989.mo5581()) {
            abstractC2989 = abstractC2989.m5579();
        }
        while (true) {
            abstractC2989 = abstractC2989.m5580();
            if (!abstractC2989.mo5581()) {
                if (abstractC2989 instanceof C1866) {
                    return (C1866) abstractC2989;
                }
                if (abstractC2989 instanceof C5835) {
                    return null;
                }
            }
        }
    }

    @Override // p000.InterfaceC4137
    public final InterfaceC2218 getKey() {
        return C1397.f4791;
    }

    @Override // p000.InterfaceC3196
    public final boolean isCancelled() {
        Object objM890 = m890();
        if (objM890 instanceof C5036) {
            return true;
        }
        return (objM890 instanceof C2610) && ((C2610) objM890).m4917();
    }

    @Override // p000.InterfaceC3196
    public final boolean start() {
        int iM879;
        do {
            iM879 = m879(m890());
            if (iM879 == 0) {
                return false;
            }
        } while (iM879 != 1);
        return true;
    }

    public final String toString() {
        return (mo870() + '{' + m848(m890()) + '}') + '@' + AbstractC4489.m7777(this);
    }

    /* JADX INFO: renamed from: ۥؓ */
    public boolean mo850(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m858(th) && mo883();
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final C5835 m851(InterfaceC0465 interfaceC0465) {
        C5835 c5835Mo982 = interfaceC0465.mo982();
        if (c5835Mo982 != null) {
            return c5835Mo982;
        }
        if (interfaceC0465 instanceof C1017) {
            return new C5835();
        }
        if (interfaceC0465 instanceof AbstractC5752) {
            m867((AbstractC5752) interfaceC0465);
            return null;
        }
        C5028.m8449(interfaceC0465, "State should have list: ");
        return null;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public String mo852() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: ۥؙ */
    public final Object m853(Object obj) {
        Object objM877;
        do {
            objM877 = m877(m890(), obj);
            if (objM877 == AbstractC5378.f17771) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C5036 c5036 = obj instanceof C5036 ? (C5036) obj : null;
                throw new IllegalStateException(str, c5036 != null ? c5036.f16702 : null);
            }
        } while (objM877 == AbstractC5378.f17769);
        return objM877;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public final boolean m854(Object obj) {
        Object objM877;
        do {
            objM877 = m877(m890(), obj);
            if (objM877 == AbstractC5378.f17771) {
                return false;
            }
            if (objM877 == AbstractC5378.f17763) {
                return true;
            }
        } while (objM877 == AbstractC5378.f17769);
        mo882(objM877);
        return true;
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m855(InterfaceC0465 interfaceC0465, Object obj) {
        Unsafe unsafe = AbstractC3456.f11473;
        long j = f1443;
        InterfaceC3101 interfaceC3101 = (InterfaceC3101) unsafe.getObjectVolatile(this, j);
        if (interfaceC3101 != null) {
            interfaceC3101.mo1376();
            unsafe.putObjectVolatile(this, j, C3364.f11240);
        }
        C1228 c1228 = null;
        C5036 c5036 = obj instanceof C5036 ? (C5036) obj : null;
        Throwable th = c5036 != null ? c5036.f16702 : null;
        if (interfaceC0465 instanceof AbstractC5752) {
            try {
                ((AbstractC5752) interfaceC0465).mo923(th);
                return;
            } catch (Throwable th2) {
                mo863(new C1228(0, "Exception in completion handler " + interfaceC0465 + " for " + this, th2));
                return;
            }
        }
        C5835 c5835Mo982 = interfaceC0465.mo982();
        if (c5835Mo982 != null) {
            c5835Mo982.m5576(new C4761(1), 1);
            for (AbstractC2989 abstractC2989M5580 = (AbstractC2989) c5835Mo982.m5578(); !AbstractC3831.m6874(abstractC2989M5580, c5835Mo982); abstractC2989M5580 = abstractC2989M5580.m5580()) {
                if (abstractC2989M5580 instanceof AbstractC5752) {
                    try {
                        ((AbstractC5752) abstractC2989M5580).mo923(th);
                    } catch (Throwable th3) {
                        if (c1228 != null) {
                            AbstractC5537.m9223(c1228, th3);
                        } else {
                            c1228 = new C1228(0, "Exception in completion handler " + abstractC2989M5580 + " for " + this, th3);
                        }
                    }
                }
            }
            if (c1228 != null) {
                mo863(c1228);
            }
        }
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥَ */
    public final InterfaceC3101 mo856(AbstractC0386 abstractC0386) {
        AbstractC0386 abstractC0387;
        C1866 c1866 = new C1866(abstractC0386);
        c1866.f18969 = this;
        loop0: while (true) {
            Object objM890 = this.m890();
            if (objM890 instanceof C1017) {
                C1017 c1017 = (C1017) objM890;
                if (c1017.f3603) {
                    while (true) {
                        Unsafe unsafe = AbstractC3456.f11473;
                        long j = f1442;
                        abstractC0387 = this;
                        if (unsafe.compareAndSwapObject(abstractC0387, j, objM890, c1866)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(abstractC0387, j) != objM890) {
                            break;
                        }
                        this = abstractC0387;
                    }
                } else {
                    abstractC0387 = this;
                    abstractC0387.m857(c1017);
                }
                this = abstractC0387;
            } else {
                abstractC0387 = this;
                boolean z = objM890 instanceof InterfaceC0465;
                C3364 c3364 = C3364.f11240;
                Throwable thM4916 = null;
                if (!z) {
                    Object objM891 = abstractC0387.m890();
                    C5036 c5036 = objM891 instanceof C5036 ? (C5036) objM891 : null;
                    c1866.mo923(c5036 != null ? c5036.f16702 : null);
                    return c3364;
                }
                C5835 c5835Mo982 = ((InterfaceC0465) objM890).mo982();
                if (c5835Mo982 != null) {
                    if (c5835Mo982.m5576(c1866, 7)) {
                        break;
                    }
                    boolean zM5576 = c5835Mo982.m5576(c1866, 3);
                    Object objM892 = abstractC0387.m890();
                    if (objM892 instanceof C2610) {
                        thM4916 = ((C2610) objM892).m4916();
                    } else {
                        C5036 c5037 = objM892 instanceof C5036 ? (C5036) objM892 : null;
                        if (c5037 != null) {
                            thM4916 = c5037.f16702;
                        }
                    }
                    c1866.mo923(thM4916);
                    if (zM5576) {
                        break;
                    }
                    return c3364;
                }
                abstractC0387.m867((AbstractC5752) objM890);
                this = abstractC0387;
            }
        }
        return c1866;
    }

    /* JADX INFO: renamed from: ۥِ */
    public final void m857(C1017 c1017) {
        C5835 c5835 = new C5835();
        Object c0693 = c1017.f3603 ? c5835 : new C0693(c5835);
        while (true) {
            Unsafe unsafe = AbstractC3456.f11473;
            long j = f1442;
            AbstractC0386 abstractC0386 = this;
            C1017 c1018 = c1017;
            if (unsafe.compareAndSwapObject(abstractC0386, j, c1018, c0693) || unsafe.getObjectVolatile(abstractC0386, j) != c1018) {
                return;
            }
            this = abstractC0386;
            c1017 = c1018;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:37:0x0079, B:35:0x006f, B:36:0x0073), top: B:85:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb A[LOOP:2: B:56:0x00b2->B:63:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    /* JADX INFO: renamed from: ۥٓ */
    public final boolean m858(Object obj) {
        AbstractC0386 abstractC0386;
        Throwable thM886;
        Object objM890;
        Throwable thM4916;
        C5536 c5536;
        Object objM877;
        InterfaceC0465 interfaceC0465;
        C5835 c5835M851;
        C2610 c2610;
        Unsafe unsafe;
        long j;
        Object objM878 = AbstractC5378.f17771;
        if (mo884()) {
            do {
                Object objM891 = m890();
                if (!(objM891 instanceof InterfaceC0465) || ((objM891 instanceof C2610) && ((C2610) objM891).m4918())) {
                    objM878 = AbstractC5378.f17771;
                    break;
                }
                objM878 = m877(objM891, new C5036(m886(obj), false));
            } while (objM878 == AbstractC5378.f17769);
            if (objM878 != AbstractC5378.f17763) {
                if (objM878 == AbstractC5378.f17771) {
                    thM886 = null;
                    loop1: while (true) {
                        objM890 = this.m890();
                        if (objM890 instanceof C2610) {
                            if (objM890 instanceof InterfaceC0465) {
                                if (thM886 == null) {
                                    thM886 = this.m886(obj);
                                }
                                interfaceC0465 = (InterfaceC0465) objM890;
                                if (interfaceC0465.mo981()) {
                                    c5835M851 = this.m851(interfaceC0465);
                                    if (c5835M851 == null) {
                                        abstractC0386 = this;
                                    } else {
                                        c2610 = new C2610(c5835M851, thM886);
                                        while (true) {
                                            unsafe = AbstractC3456.f11473;
                                            j = f1442;
                                            abstractC0386 = this;
                                            if (unsafe.compareAndSwapObject(abstractC0386, j, interfaceC0465, c2610)) {
                                                abstractC0386.m873(c5835M851, thM886);
                                                objM877 = AbstractC5378.f17771;
                                            } else if (unsafe.getObjectVolatile(abstractC0386, j) != interfaceC0465) {
                                                this = abstractC0386;
                                            }
                                        }
                                    }
                                    this = abstractC0386;
                                } else {
                                    abstractC0386 = this;
                                    objM877 = abstractC0386.m877(objM890, new C5036(thM886, false));
                                    if (objM877 != AbstractC5378.f17771) {
                                        C5028.m8449(objM890, "Cannot happen in ");
                                        return false;
                                    }
                                    if (objM877 != AbstractC5378.f17769) {
                                        this = abstractC0386;
                                    }
                                }
                            } else {
                                abstractC0386 = this;
                                objM877 = AbstractC5378.f17768;
                            }
                            objM878 = objM877;
                            break;
                        }
                        synchronized (objM890) {
                            if (AbstractC3456.f11473.getObjectVolatile((C2610) objM890, C2610.f8703) == AbstractC5378.f17770) {
                                c5536 = AbstractC5378.f17768;
                            } else {
                                boolean zM4917 = ((C2610) objM890).m4917();
                                if (obj == null || !zM4917) {
                                    if (thM886 == null) {
                                        thM886 = this.m886(obj);
                                    }
                                    ((C2610) objM890).m4919(thM886);
                                }
                                thM4916 = zM4917 ? null : ((C2610) objM890).m4916();
                                if (thM4916 != null) {
                                    this.m873(((C2610) objM890).f8704, thM4916);
                                }
                                c5536 = AbstractC5378.f17771;
                            }
                        }
                        abstractC0386 = this;
                        objM878 = c5536;
                        break;
                    }
                }
                abstractC0386 = this;
                if (objM878 != AbstractC5378.f17771 && objM878 != AbstractC5378.f17763) {
                    if (objM878 == AbstractC5378.f17768) {
                        return false;
                    }
                    abstractC0386.mo882(objM878);
                    return true;
                }
            }
        } else {
            if (objM878 == AbstractC5378.f17771) {
                thM886 = null;
                loop1: while (true) {
                    objM890 = this.m890();
                    if (objM890 instanceof C2610) {
                        if (objM890 instanceof InterfaceC0465) {
                            if (thM886 == null) {
                                thM886 = this.m886(obj);
                            }
                            interfaceC0465 = (InterfaceC0465) objM890;
                            if (interfaceC0465.mo981()) {
                                c5835M851 = this.m851(interfaceC0465);
                                if (c5835M851 == null) {
                                    abstractC0386 = this;
                                } else {
                                    c2610 = new C2610(c5835M851, thM886);
                                    while (true) {
                                        unsafe = AbstractC3456.f11473;
                                        j = f1442;
                                        abstractC0386 = this;
                                        if (unsafe.compareAndSwapObject(abstractC0386, j, interfaceC0465, c2610)) {
                                            abstractC0386.m873(c5835M851, thM886);
                                            objM877 = AbstractC5378.f17771;
                                        } else if (unsafe.getObjectVolatile(abstractC0386, j) != interfaceC0465) {
                                            this = abstractC0386;
                                        }
                                    }
                                }
                                this = abstractC0386;
                            } else {
                                abstractC0386 = this;
                                objM877 = abstractC0386.m877(objM890, new C5036(thM886, false));
                                if (objM877 != AbstractC5378.f17771) {
                                    C5028.m8449(objM890, "Cannot happen in ");
                                    return false;
                                }
                                if (objM877 != AbstractC5378.f17769) {
                                    this = abstractC0386;
                                }
                            }
                        } else {
                            abstractC0386 = this;
                            objM877 = AbstractC5378.f17768;
                        }
                        objM878 = objM877;
                        break;
                    }
                    synchronized (objM890) {
                        if (AbstractC3456.f11473.getObjectVolatile((C2610) objM890, C2610.f8703) == AbstractC5378.f17770) {
                            c5536 = AbstractC5378.f17768;
                        } else {
                            boolean zM4918 = ((C2610) objM890).m4917();
                            if (obj == null) {
                                if (thM886 == null) {
                                    thM886 = this.m886(obj);
                                }
                                ((C2610) objM890).m4919(thM886);
                            } else {
                                if (thM886 == null) {
                                    thM886 = this.m886(obj);
                                }
                                ((C2610) objM890).m4919(thM886);
                            }
                            if (zM4918) {
                            }
                            if (thM4916 != null) {
                                this.m873(((C2610) objM890).f8704, thM4916);
                            }
                            c5536 = AbstractC5378.f17771;
                        }
                        abstractC0386 = this;
                        objM878 = c5536;
                        break;
                    }
                }
            }
            abstractC0386 = this;
            if (objM878 != AbstractC5378.f17771) {
                if (objM878 == AbstractC5378.f17768) {
                    return false;
                }
                abstractC0386.mo882(objM878);
                return true;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥٕ */
    public final InterfaceC4883 mo859(InterfaceC4745 interfaceC4745) {
        return m864(true, new C1570(interfaceC4745));
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC3534 mo860(InterfaceC3534 interfaceC3534) {
        return AbstractC4593.m7963(this, interfaceC3534);
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥ٘ */
    public final Object mo861(AbstractC0772 abstractC0772) {
        Object objM890;
        C2358 c2358;
        do {
            objM890 = m890();
            boolean z = objM890 instanceof InterfaceC0465;
            c2358 = C2358.f7817;
            if (!z) {
                AbstractC5568.m9360(abstractC0772.mo334());
                return c2358;
            }
        } while (m879(objM890) < 0);
        C2600 c2600 = new C2600(1, AbstractC2776.m5232(abstractC0772));
        c2600.m4913();
        c2600.m4902(new C3011(2, AbstractC5568.m9348(this, true, new C4621(c2600))));
        Object objM4909 = c2600.m4909();
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (objM4909 != enumC2282) {
            objM4909 = c2358;
        }
        return objM4909 == enumC2282 ? objM4909 : c2358;
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥٙ */
    public final CancellationException mo862() {
        CancellationException cancellationException;
        Object objM890 = m890();
        if (objM890 instanceof C2610) {
            Throwable thM4916 = ((C2610) objM890).m4916();
            if (thM4916 == null) {
                C5028.m8449(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM4916 instanceof CancellationException ? (CancellationException) thM4916 : null;
            return cancellationException == null ? new C1440(strConcat, thM4916, this) : cancellationException;
        }
        if (objM890 instanceof InterfaceC0465) {
            C5028.m8449(this, "Job is still new or active: ");
            return null;
        }
        if (!(objM890 instanceof C5036)) {
            return new C1440(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((C5036) objM890).f16702;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new C1440(mo852(), th, this) : cancellationException;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final InterfaceC4883 m864(boolean z, AbstractC5752 abstractC5752) {
        AbstractC0386 abstractC0386;
        AbstractC5752 abstractC5753;
        boolean zM5576;
        abstractC5752.f18969 = this;
        loop0: while (true) {
            Object objM890 = this.m890();
            if (!(objM890 instanceof C1017)) {
                abstractC0386 = this;
                abstractC5753 = abstractC5752;
                boolean z2 = objM890 instanceof InterfaceC0465;
                C3364 c3364 = C3364.f11240;
                if (z2) {
                    InterfaceC0465 interfaceC0465 = (InterfaceC0465) objM890;
                    C5835 c5835Mo982 = interfaceC0465.mo982();
                    if (c5835Mo982 == null) {
                        abstractC0386.m867((AbstractC5752) objM890);
                    } else {
                        if (abstractC5753.mo922()) {
                            C2610 c2610 = interfaceC0465 instanceof C2610 ? (C2610) interfaceC0465 : null;
                            Throwable thM4916 = c2610 != null ? c2610.m4916() : null;
                            if (thM4916 == null) {
                                zM5576 = c5835Mo982.m5576(abstractC5753, 5);
                            } else if (z) {
                                abstractC5753.mo923(thM4916);
                                return c3364;
                            }
                        } else {
                            zM5576 = c5835Mo982.m5576(abstractC5753, 1);
                        }
                        if (zM5576) {
                            break;
                        }
                    }
                    this = abstractC0386;
                    abstractC5752 = abstractC5753;
                } else if (z) {
                    Object objM891 = abstractC0386.m890();
                    C5036 c5036 = objM891 instanceof C5036 ? (C5036) objM891 : null;
                    abstractC5753.mo923(c5036 != null ? c5036.f16702 : null);
                }
                return c3364;
            }
            C1017 c1017 = (C1017) objM890;
            if (c1017.f3603) {
                while (true) {
                    Unsafe unsafe = AbstractC3456.f11473;
                    long j = f1442;
                    abstractC0386 = this;
                    abstractC5753 = abstractC5752;
                    if (unsafe.compareAndSwapObject(abstractC0386, j, objM890, abstractC5753)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(abstractC0386, j) != objM890) {
                        break;
                    }
                    this = abstractC0386;
                    abstractC5752 = abstractC5753;
                }
            } else {
                abstractC0386 = this;
                abstractC5753 = abstractC5752;
                abstractC0386.m857(c1017);
            }
            this = abstractC0386;
            abstractC5752 = abstractC5753;
        }
        return abstractC5753;
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC4137 mo865(InterfaceC2218 interfaceC2218) {
        return AbstractC3801.m6745(this, interfaceC2218);
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥۗ */
    public boolean mo866() {
        Object objM890 = m890();
        return (objM890 instanceof InterfaceC0465) && ((InterfaceC0465) objM890).mo981();
    }

    /* JADX INFO: renamed from: ۥۘ */
    public final void m867(AbstractC5752 abstractC5752) {
        AbstractC5752 abstractC5753;
        AbstractC0386 abstractC0386;
        C5835 c5835 = new C5835();
        Unsafe unsafe = AbstractC3456.f11473;
        unsafe.putObjectVolatile(c5835, AbstractC2989.f10051, abstractC5752);
        long j = AbstractC2989.f10052;
        unsafe.putObjectVolatile(c5835, j, abstractC5752);
        loop0: while (true) {
            if (abstractC5752.m5578() != abstractC5752) {
                abstractC5753 = abstractC5752;
                break;
            }
            while (true) {
                Unsafe unsafe2 = AbstractC3456.f11473;
                abstractC5753 = abstractC5752;
                if (unsafe2.compareAndSwapObject(abstractC5753, AbstractC2989.f10052, abstractC5752, c5835)) {
                    c5835.m5582(abstractC5753);
                    break loop0;
                }
                abstractC0386 = this;
                abstractC5752 = abstractC5753;
                if (unsafe2.getObjectVolatile(abstractC5753, j) != abstractC5753) {
                    break;
                } else {
                    this = abstractC0386;
                }
            }
            this = abstractC0386;
        }
        AbstractC2989 abstractC2989M5580 = abstractC5753.m5580();
        while (true) {
            Unsafe unsafe3 = AbstractC3456.f11473;
            long j2 = f1442;
            AbstractC0386 abstractC0387 = this;
            if (unsafe3.compareAndSwapObject(abstractC0387, j2, abstractC5753, abstractC2989M5580) || unsafe3.getObjectVolatile(abstractC0387, j2) != abstractC5753) {
                return;
            } else {
                this = abstractC0387;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final Object m868(C2610 c2610, Object obj) throws Throwable {
        Throwable th;
        AbstractC0386 abstractC0386;
        C2610 c2611;
        C5036 c5036 = obj instanceof C5036 ? (C5036) obj : null;
        Throwable th2 = c5036 != null ? c5036.f16702 : null;
        synchronized (c2610) {
            try {
                c2610.m4917();
                ArrayList<Throwable> arrayListM4920 = c2610.m4920(th2);
                Throwable thM880 = m880(c2610, arrayListM4920);
                if (thM880 != null) {
                    try {
                        if (arrayListM4920.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM4920.size()));
                            for (Throwable th3 : arrayListM4920) {
                                if (th3 != thM880 && th3 != thM880 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    AbstractC5537.m9223(thM880, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thM880 != null && thM880 != th2) {
                    obj = new C5036(thM880, false);
                }
                if (thM880 != null && (m889(thM880) || mo892(thM880))) {
                    C5036 c5037 = (C5036) obj;
                    c5037.getClass();
                    AbstractC3456.f11473.compareAndSwapInt(c5037, C5036.f16701, 0, 1);
                }
                mo876(obj);
                Object c1348 = obj instanceof InterfaceC0465 ? new C1348((InterfaceC0465) obj) : obj;
                while (true) {
                    Unsafe unsafe = AbstractC3456.f11473;
                    long j = f1442;
                    abstractC0386 = this;
                    c2611 = c2610;
                    if (unsafe.compareAndSwapObject(abstractC0386, j, c2611, c1348) || unsafe.getObjectVolatile(abstractC0386, j) != c2611) {
                        break;
                    }
                    this = abstractC0386;
                    c2610 = c2611;
                }
                abstractC0386.m855(c2611, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo869() {
        return this instanceof C0702;
    }

    /* JADX INFO: renamed from: ۥۡ */
    public String mo870() {
        return getClass().getSimpleName();
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥۣ */
    public void mo871(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1440(mo852(), null, this);
        }
        mo885(cancellationException);
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final void m872(InterfaceC3196 interfaceC3196) {
        long j = f1443;
        C3364 c3364 = C3364.f11240;
        if (interfaceC3196 == null) {
            AbstractC3456.f11473.putObjectVolatile(this, j, c3364);
            return;
        }
        interfaceC3196.start();
        InterfaceC3101 interfaceC3101Mo856 = interfaceC3196.mo856(this);
        Unsafe unsafe = AbstractC3456.f11473;
        unsafe.putObjectVolatile(this, j, interfaceC3101Mo856);
        if (m890() instanceof InterfaceC0465) {
            return;
        }
        interfaceC3101Mo856.mo1376();
        unsafe.putObjectVolatile(this, j, c3364);
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final void m873(C5835 c5835, Throwable th) {
        c5835.m5576(new C4761(4), 4);
        C1228 c1228 = null;
        for (AbstractC2989 abstractC2989M5580 = (AbstractC2989) c5835.m5578(); !AbstractC3831.m6874(abstractC2989M5580, c5835); abstractC2989M5580 = abstractC2989M5580.m5580()) {
            if ((abstractC2989M5580 instanceof AbstractC5752) && ((AbstractC5752) abstractC2989M5580).mo922()) {
                try {
                    ((AbstractC5752) abstractC2989M5580).mo923(th);
                } catch (Throwable th2) {
                    if (c1228 != null) {
                        AbstractC5537.m9223(c1228, th2);
                    } else {
                        c1228 = new C1228(0, "Exception in completion handler " + abstractC2989M5580 + " for " + this, th2);
                    }
                }
            }
        }
        if (c1228 != null) {
            mo863(c1228);
        }
        m889(th);
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final Object m874() throws Throwable {
        Object objM890 = m890();
        if (objM890 instanceof InterfaceC0465) {
            C1078.m2276("This job has not completed yet");
            return null;
        }
        if (objM890 instanceof C5036) {
            throw ((C5036) objM890).f16702;
        }
        return AbstractC5378.m9033(objM890);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۧ */
    public final Object mo875(InterfaceC5731 interfaceC5731, Object obj) {
        return interfaceC5731.mo219(obj, this);
    }

    /* JADX INFO: renamed from: ۦ */
    public final Object m877(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC0465)) {
            return AbstractC5378.f17771;
        }
        if ((!(obj instanceof C1017) && !(obj instanceof AbstractC5752)) || (obj instanceof C1866) || (obj2 instanceof C5036)) {
            AbstractC0386 abstractC0386 = this;
            InterfaceC0465 interfaceC0465 = (InterfaceC0465) obj;
            C5835 c5835M851 = abstractC0386.m851(interfaceC0465);
            if (c5835M851 == null) {
                return AbstractC5378.f17769;
            }
            C2610 c2610 = interfaceC0465 instanceof C2610 ? (C2610) interfaceC0465 : null;
            if (c2610 == null) {
                c2610 = new C2610(c5835M851, null);
            }
            C2610 c2611 = c2610;
            synchronized (c2611) {
                if (c2611.m4918()) {
                    return AbstractC5378.f17771;
                }
                AbstractC3456.f11473.putIntVolatile(c2611, C2610.f8701, 1);
                if (c2611 != interfaceC0465) {
                    while (true) {
                        Unsafe unsafe = AbstractC3456.f11473;
                        long j = f1442;
                        AbstractC0386 abstractC0387 = abstractC0386;
                        abstractC0386 = abstractC0387;
                        if (unsafe.compareAndSwapObject(abstractC0387, j, interfaceC0465, c2611)) {
                            break;
                        }
                        if (unsafe.getObjectVolatile(abstractC0386, j) != interfaceC0465) {
                            return AbstractC5378.f17769;
                        }
                    }
                }
                boolean zM4917 = c2611.m4917();
                C5036 c5036 = obj2 instanceof C5036 ? (C5036) obj2 : null;
                if (c5036 != null) {
                    c2611.m4919(c5036.f16702);
                }
                Throwable thM4916 = zM4917 ? null : c2611.m4916();
                if (thM4916 != null) {
                    abstractC0386.m873(c5835M851, thM4916);
                }
                C1866 c1866M849 = m849(c5835M851);
                if (c1866M849 != null && abstractC0386.m887(c2611, c1866M849, obj2)) {
                    return AbstractC5378.f17763;
                }
                c5835M851.m5576(new C4761(2), 2);
                C1866 c1866M8410 = m849(c5835M851);
                return (c1866M8410 == null || !abstractC0386.m887(c2611, c1866M8410, obj2)) ? abstractC0386.m868(c2611, obj2) : AbstractC5378.f17763;
            }
        }
        InterfaceC0465 interfaceC0466 = (InterfaceC0465) obj;
        Object c1348 = obj2 instanceof InterfaceC0465 ? new C1348((InterfaceC0465) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = AbstractC3456.f11473;
            long j2 = f1442;
            AbstractC0386 abstractC0388 = this;
            if (unsafe2.compareAndSwapObject(abstractC0388, j2, interfaceC0466, c1348)) {
                abstractC0388.mo876(obj2);
                abstractC0388.m855(interfaceC0466, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(abstractC0388, j2) != interfaceC0466) {
                return AbstractC5378.f17769;
            }
            this = abstractC0388;
        }
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۦؒ */
    public final InterfaceC4883 mo878(boolean z, boolean z2, C0037 c0037) {
        return m864(z2, z ? new C4831(c0037) : new C1570(c0037));
    }

    /* JADX INFO: renamed from: ۦؔ */
    public final int m879(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof C1017;
        long j = f1442;
        if (z) {
            if (((C1017) obj).f3603) {
                return 0;
            }
            C1017 c1017 = AbstractC5378.f17767;
            do {
                unsafe2 = AbstractC3456.f11473;
                if (unsafe2.compareAndSwapObject(this, f1442, obj, c1017)) {
                    mo891();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof C0693)) {
            return 0;
        }
        C5835 c5835 = ((C0693) obj).f2523;
        do {
            unsafe = AbstractC3456.f11473;
            if (unsafe.compareAndSwapObject(this, f1442, obj, c5835)) {
                mo891();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final Throwable m880(C2610 c2610, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c2610.m4917()) {
                return new C1440(mo852(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof C4862) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof C4862)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۦؙ */
    public final InterfaceC3534 mo881(InterfaceC2218 interfaceC2218) {
        return AbstractC3801.m6798(this, interfaceC2218);
    }

    /* JADX INFO: renamed from: ۦُ */
    public boolean mo883() {
        return true;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public boolean mo884() {
        return this instanceof C3529;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public void mo885(CancellationException cancellationException) {
        m858(cancellationException);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final Throwable m886(Object obj) {
        Throwable thM4916;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C1440(mo852(), null, this) : th;
        }
        AbstractC0386 abstractC0386 = (AbstractC0386) obj;
        Object objM890 = abstractC0386.m890();
        if (objM890 instanceof C2610) {
            thM4916 = ((C2610) objM890).m4916();
        } else if (objM890 instanceof C5036) {
            thM4916 = ((C5036) objM890).f16702;
        } else {
            if (objM890 instanceof InterfaceC0465) {
                C5028.m8449(objM890, "Cannot be cancelling child in this state: ");
                return null;
            }
            thM4916 = null;
        }
        CancellationException cancellationException = thM4916 instanceof CancellationException ? (CancellationException) thM4916 : null;
        return cancellationException == null ? new C1440("Parent job is ".concat(m848(objM890)), thM4916, abstractC0386) : cancellationException;
    }

    /* JADX INFO: renamed from: ۦٝ */
    public final boolean m887(C2610 c2610, C1866 c1866, Object obj) {
        while (AbstractC5568.m9348(c1866.f6209, false, new C2097(this, c2610, c1866, obj)) == C3364.f11240) {
            c1866 = m849(c1866);
            if (c1866 == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public void mo888(Object obj) {
        mo882(obj);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m889(Throwable th) {
        if (mo869()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC3101 interfaceC3101 = (InterfaceC3101) AbstractC3456.f11473.getObjectVolatile(this, f1443);
        if (interfaceC3101 == null || interfaceC3101 == C3364.f11240) {
            return z;
        }
        return interfaceC3101.mo3717(th) || z;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final Object m890() {
        return AbstractC3456.f11473.getObjectVolatile(this, f1442);
    }

    /* JADX INFO: renamed from: ۦۣ */
    public boolean mo892(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public void mo891() {
    }

    /* JADX INFO: renamed from: ۥٛ */
    public void mo863(C1228 c1228) {
        throw c1228;
    }

    /* JADX INFO: renamed from: ۥۨ */
    public void mo876(Object obj) {
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void mo882(Object obj) {
    }
}
